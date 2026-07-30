package com.instagram.common.viewpoint.core;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1006Jm {
    public static String[] A08 = {"QrT", "qnQt5WyeAQ09x35f49C3fjiJNyL2Wwm", "MYPg", "kl", "gHVF4DBtkYKODoSVDn", "z4XgsVt0P4PakGRoUHMjSa47eQapG64R", "b9pv7rqD0c4j71TLmNGUCRckoksDVk", "PMM3oo9z0bIH04LH4O"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<C1005Jl> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    public C1006Jm(int i, int i4) {
        A0C(i);
        this.A01 = i4;
    }

    private SpannableString A04() {
        int i;
        int[] iArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int nextColor = spannableStringBuilder.length();
        int color = -1;
        int colorStartPosition = -1;
        int italicStartPosition = 0;
        int underlineStartPosition = -1;
        int style = 0;
        int i4 = -1;
        for (int length = 0; length < this.A06.size(); length++) {
            C1005Jl c1005Jl = this.A06.get(length);
            boolean z8 = c1005Jl.A02;
            int i9 = c1005Jl.A01;
            if (i9 != 8) {
                style = i9 == 7 ? 1 : 0;
                if (i9 != 7) {
                    iArr = C1X.A0Q;
                    i4 = iArr[i9];
                }
            }
            int i10 = c1005Jl.A00;
            if (length + 1 < this.A06.size()) {
                i = this.A06.get(length + 1).A00;
            } else {
                i = nextColor;
            }
            if (i10 != i) {
                if (color != -1 && !z8) {
                    A06(spannableStringBuilder, color, i10);
                    color = -1;
                } else if (color == -1 && z8) {
                    color = i10;
                }
                if (colorStartPosition != -1 && style == 0) {
                    A05(spannableStringBuilder, colorStartPosition, i10);
                    colorStartPosition = -1;
                } else if (colorStartPosition == -1 && style != 0) {
                    colorStartPosition = i10;
                }
                if (i4 != underlineStartPosition) {
                    A07(spannableStringBuilder, italicStartPosition, i10, underlineStartPosition);
                    underlineStartPosition = i4;
                    italicStartPosition = i10;
                }
            }
        }
        if (color != -1 && color != nextColor) {
            A06(spannableStringBuilder, color, nextColor);
        }
        if (colorStartPosition != -1 && colorStartPosition != nextColor) {
            A05(spannableStringBuilder, colorStartPosition, nextColor);
        }
        if (italicStartPosition != nextColor) {
            A07(spannableStringBuilder, italicStartPosition, nextColor, underlineStartPosition);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i, int i4) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i4, 33);
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, int i, int i4) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i4, 33);
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder, int i, int i4, int i9) {
        if (i9 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i9), i, i4, 33);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0132, code lost:
    
        if (r5 == 2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        if (r7 <= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0136, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0148, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0145, code lost:
    
        if (r5 == 2) goto L45;
     */
    /* JADX WARN: Incorrect condition in loop: B:3:0x0013 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2349pT A08(int i) {
        float f6;
        int line;
        int startEndPaddingDelta = this.A02 + this.A04;
        int i4 = 32 - startEndPaddingDelta;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i9 = 0; i9 < startPadding; i9++) {
            spannableStringBuilder.append(C5C.A0e(this.A07.get(i9), i4));
            String[] strArr = A08;
            String str = strArr[7];
            String str2 = strArr[1];
            int maxTextLength = str.length();
            int startPadding = str2.length();
            if (maxTextLength == startPadding) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[2] = "Z1xB";
            strArr2[6] = "hIixFY3yygWtziyMrZmiBRgOnmfC1l";
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(C5C.A0e(A04(), i4));
        int startPadding2 = spannableStringBuilder.length();
        if (startPadding2 == 0) {
            String[] strArr3 = A08;
            String str3 = strArr3[2];
            String str4 = strArr3[6];
            int maxTextLength2 = str3.length();
            int startPadding3 = str4.length();
            if (maxTextLength2 != startPadding3) {
                String[] strArr4 = A08;
                strArr4[0] = "rBt";
                strArr4[3] = "BH";
                return null;
            }
            return null;
        }
        int startPadding4 = spannableStringBuilder.length();
        int i10 = (32 - startEndPaddingDelta) - startPadding4;
        int i11 = startEndPaddingDelta - i10;
        if (i == Integer.MIN_VALUE) {
            int startPadding5 = this.A00;
            if (startPadding5 == 2) {
                int maxTextLength3 = Math.abs(i11);
                if (maxTextLength3 < 3 || i10 < 0) {
                    i = 1;
                }
            }
            int i12 = this.A00;
            String[] strArr5 = A08;
            String str5 = strArr5[0];
            String str6 = strArr5[3];
            int maxTextLength4 = str5.length();
            int startPadding6 = str6.length();
            if (maxTextLength4 != startPadding6) {
                String[] strArr6 = A08;
                strArr6[2] = "zsbn";
                strArr6[6] = "2pz3wER7XyxppBOwf3KUzADVO23k2y";
            } else {
                String[] strArr7 = A08;
                strArr7[0] = "Ac2";
                strArr7[3] = "GK";
            }
        }
        switch (i) {
            case 1:
                f6 = 0.5f;
                break;
            case 2:
                int startPadding7 = 32 - i10;
                f6 = (0.8f * (startPadding7 / 32.0f)) + 0.1f;
                break;
            default:
                f6 = (0.8f * (startEndPaddingDelta / 32.0f)) + 0.1f;
                break;
        }
        int maxTextLength5 = this.A03;
        if (maxTextLength5 > 7) {
            int startPadding8 = this.A03;
            line = (startPadding8 - 15) - 2;
        } else {
            int startPadding9 = this.A00;
            if (startPadding9 == 1) {
                int i13 = this.A03;
                int startEndPaddingDelta2 = this.A01 - 1;
                String[] strArr8 = A08;
                String str7 = strArr8[2];
                String str8 = strArr8[6];
                int maxTextLength6 = str7.length();
                int startPadding10 = str8.length();
                if (maxTextLength6 == startPadding10) {
                    throw new RuntimeException();
                }
                String[] strArr9 = A08;
                strArr9[4] = "FzP30KGLJrbEGZLX6W";
                strArr9[5] = "LdbePQPUJr4EiMizjJFZUiWqoRbmx53S";
                line = i13 - startEndPaddingDelta2;
            } else {
                line = this.A03;
            }
        }
        return new C06133o().A0G(spannableStringBuilder).A0F(Layout.Alignment.ALIGN_NORMAL).A07(line, 1).A04(f6).A0A(i).A0H();
    }

    public final void A09() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i = length3 - 1; i >= 0; i--) {
                C1005Jl c1005Jl = this.A06.get(i);
                String[] strArr = A08;
                String str = strArr[2];
                String str2 = strArr[6];
                int i4 = str.length();
                int length4 = str2.length();
                if (i4 == length4) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[7] = "VxqvNxDPFU2KcS189G";
                strArr2[1] = "CD1791pAkSaTS5HjwfKDVAxBa1qJnUw";
                int length5 = c1005Jl.A00;
                if (length5 == length) {
                    int length6 = c1005Jl.A00;
                    c1005Jl.A00 = length6 - 1;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0022 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0A() {
        this.A07.add(A04());
        this.A05.setLength(0);
        this.A06.clear();
        int min = Math.min(this.A01, this.A03);
        while (numRows >= min) {
            this.A07.remove(0);
        }
    }

    public final void A0B(char c4) {
        if (this.A05.length() < 32) {
            this.A05.append(c4);
        }
    }

    public final void A0C(int i) {
        this.A00 = i;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0D(int i) {
        this.A00 = i;
    }

    public final void A0E(int i) {
        this.A01 = i;
    }

    public final void A0F(int i, boolean z8) {
        this.A06.add(new C1005Jl(i, z8, this.A05.length()));
    }

    public final boolean A0G() {
        return this.A06.isEmpty() && this.A07.isEmpty() && this.A05.length() == 0;
    }
}
