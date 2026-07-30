package com.google.zxing.datamatrix.encoder;

import com.baidu.mapapi.UIMsg;
import com.google.zxing.Dimension;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class HighLevelEncoder {
    static final int ASCII_ENCODATION = 0;
    static final int BASE256_ENCODATION = 5;
    static final int C40_ENCODATION = 1;
    static final char C40_UNLATCH = 254;
    static final int EDIFACT_ENCODATION = 4;
    static final char LATCH_TO_ANSIX12 = 238;
    static final char LATCH_TO_BASE256 = 231;
    static final char LATCH_TO_C40 = 230;
    static final char LATCH_TO_EDIFACT = 240;
    static final char LATCH_TO_TEXT = 239;
    private static final char MACRO_05 = 236;
    private static final String MACRO_05_HEADER = "[)>\u001e05\u001d";
    private static final char MACRO_06 = 237;
    private static final String MACRO_06_HEADER = "[)>\u001e06\u001d";
    private static final String MACRO_TRAILER = "\u001e\u0004";
    private static final char PAD = 129;
    static final int TEXT_ENCODATION = 2;
    static final char UPPER_SHIFT = 235;
    static final int X12_ENCODATION = 3;
    static final char X12_UNLATCH = 254;

    private HighLevelEncoder() {
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = 0;
        if (i8 < length) {
            char charAt = charSequence.charAt(i8);
            while (isDigit(charAt) && i8 < length) {
                i9++;
                i8++;
                if (i8 < length) {
                    charAt = charSequence.charAt(i8);
                }
            }
        }
        return i9;
    }

    public static String encodeHighLevel(String str) {
        return encodeHighLevel(str, SymbolShapeHint.FORCE_NONE, null, null);
    }

    private static int findMinimums(float[] fArr, int[] iArr, int i8, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i9 = 0; i9 < 6; i9++) {
            int ceil = (int) Math.ceil(fArr[i9]);
            iArr[i9] = ceil;
            if (i8 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i8 = ceil;
            }
            if (i8 == ceil) {
                bArr[i9] = (byte) (bArr[i9] + 1);
            }
        }
        return i8;
    }

    private static int getMinimumCount(byte[] bArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 6; i9++) {
            i8 += bArr[i9];
        }
        return i8;
    }

    static void illegalCharacter(char c8) {
        String hexString = Integer.toHexString(c8);
        throw new IllegalArgumentException("Illegal character: " + c8 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean isDigit(char c8) {
        return c8 >= '0' && c8 <= '9';
    }

    static boolean isExtendedASCII(char c8) {
        return c8 >= 128 && c8 <= 255;
    }

    private static boolean isNativeC40(char c8) {
        if (c8 == ' ') {
            return true;
        }
        if (c8 < '0' || c8 > '9') {
            return c8 >= 'A' && c8 <= 'Z';
        }
        return true;
    }

    private static boolean isNativeEDIFACT(char c8) {
        return c8 >= ' ' && c8 <= '^';
    }

    private static boolean isNativeText(char c8) {
        if (c8 == ' ') {
            return true;
        }
        if (c8 < '0' || c8 > '9') {
            return c8 >= 'a' && c8 <= 'z';
        }
        return true;
    }

    private static boolean isNativeX12(char c8) {
        if (isX12TermSep(c8) || c8 == ' ') {
            return true;
        }
        if (c8 < '0' || c8 > '9') {
            return c8 >= 'A' && c8 <= 'Z';
        }
        return true;
    }

    private static boolean isSpecialB256(char c8) {
        return false;
    }

    private static boolean isX12TermSep(char c8) {
        return c8 == '\r' || c8 == '*' || c8 == '>';
    }

    static int lookAheadTest(CharSequence charSequence, int i8, int i9) {
        float[] fArr;
        char c8;
        if (i8 >= charSequence.length()) {
            return i9;
        }
        int i10 = 6;
        if (i9 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i9] = 0.0f;
        }
        int i11 = 0;
        while (true) {
            int i12 = i8 + i11;
            if (i12 == charSequence.length()) {
                byte[] bArr = new byte[i10];
                int[] iArr = new int[i10];
                int findMinimums = findMinimums(fArr, iArr, Integer.MAX_VALUE, bArr);
                int minimumCount = getMinimumCount(bArr);
                if (iArr[0] == findMinimums) {
                    return 0;
                }
                if (minimumCount == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (minimumCount == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (minimumCount != 1 || bArr[2] <= 0) {
                    return (minimumCount != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence.charAt(i12);
            i11++;
            if (isDigit(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (isExtendedASCII(charAt)) {
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (isNativeC40(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (isExtendedASCII(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (isNativeText(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (isExtendedASCII(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (isNativeX12(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (isExtendedASCII(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (isNativeEDIFACT(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (isExtendedASCII(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (isSpecialB256(charAt)) {
                c8 = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c8 = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i11 >= 4) {
                int[] iArr2 = new int[i10];
                byte[] bArr2 = new byte[i10];
                findMinimums(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int minimumCount2 = getMinimumCount(bArr2);
                int i13 = iArr2[0];
                int i14 = iArr2[c8];
                if (i13 < i14 && i13 < iArr2[1] && i13 < iArr2[2] && i13 < iArr2[3] && i13 < iArr2[4]) {
                    return 0;
                }
                if (i14 < i13) {
                    return 5;
                }
                byte b8 = bArr2[1];
                byte b9 = bArr2[2];
                byte b10 = bArr2[3];
                byte b11 = bArr2[4];
                if (b8 + b9 + b10 + b11 == 0) {
                    return 5;
                }
                if (minimumCount2 == 1 && b11 > 0) {
                    return 4;
                }
                if (minimumCount2 == 1 && b9 > 0) {
                    return 2;
                }
                if (minimumCount2 == 1 && b10 > 0) {
                    return 3;
                }
                int i15 = iArr2[1];
                if (i15 + 1 < i13 && i15 + 1 < i14 && i15 + 1 < iArr2[4] && i15 + 1 < iArr2[2]) {
                    int i16 = iArr2[3];
                    if (i15 < i16) {
                        return 1;
                    }
                    if (i15 == i16) {
                        for (int i17 = i8 + i11 + 1; i17 < charSequence.length(); i17++) {
                            char charAt2 = charSequence.charAt(i17);
                            if (isX12TermSep(charAt2)) {
                                return 3;
                            }
                            if (!isNativeX12(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
            i10 = 6;
        }
    }

    private static char randomize253State(char c8, int i8) {
        int i9 = c8 + ((i8 * 149) % GattError.GATT_CCC_CFG_ERR) + 1;
        if (i9 > 254) {
            i9 += UIMsg.m_AppUI.V_WM_LISTLISTUPDATE;
        }
        return (char) i9;
    }

    public static String encodeHighLevel(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        int i8 = 0;
        Encoder[] encoderArr = {new ASCIIEncoder(), new C40Encoder(), new TextEncoder(), new X12Encoder(), new EdifactEncoder(), new Base256Encoder()};
        EncoderContext encoderContext = new EncoderContext(str);
        encoderContext.setSymbolShape(symbolShapeHint);
        encoderContext.setSizeConstraints(dimension, dimension2);
        if (str.startsWith(MACRO_05_HEADER) && str.endsWith(MACRO_TRAILER)) {
            encoderContext.writeCodeword(MACRO_05);
            encoderContext.setSkipAtEnd(2);
            encoderContext.pos += 7;
        } else if (str.startsWith(MACRO_06_HEADER) && str.endsWith(MACRO_TRAILER)) {
            encoderContext.writeCodeword(MACRO_06);
            encoderContext.setSkipAtEnd(2);
            encoderContext.pos += 7;
        }
        while (encoderContext.hasMoreCharacters()) {
            encoderArr[i8].encode(encoderContext);
            if (encoderContext.getNewEncoding() >= 0) {
                i8 = encoderContext.getNewEncoding();
                encoderContext.resetEncoderSignal();
            }
        }
        int codewordCount = encoderContext.getCodewordCount();
        encoderContext.updateSymbolInfo();
        int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity();
        if (codewordCount < dataCapacity && i8 != 0 && i8 != 5 && i8 != 4) {
            encoderContext.writeCodeword((char) 254);
        }
        StringBuilder codewords = encoderContext.getCodewords();
        if (codewords.length() < dataCapacity) {
            codewords.append(PAD);
        }
        while (codewords.length() < dataCapacity) {
            codewords.append(randomize253State(PAD, codewords.length() + 1));
        }
        return encoderContext.getCodewords().toString();
    }
}
