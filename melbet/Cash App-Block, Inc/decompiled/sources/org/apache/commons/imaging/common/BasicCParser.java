package org.apache.commons.imaging.common;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Map;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageReadException;

/* loaded from: classes9.dex */
public class BasicCParser {
    private final PushbackInputStream is;

    public BasicCParser(ByteArrayInputStream byteArrayInputStream) {
        this.is = new PushbackInputStream(byteArrayInputStream);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x009b, code lost:
    
        net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0.m("Unterminated single quote in file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d3, code lost:
    
        net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0.m("Unterminated string in file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d8, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ByteArrayOutputStream preprocess(InputStream inputStream, StringBuilder sb, Map<String, String> map) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = sb == null;
        StringBuilder sb2 = new StringBuilder();
        int read = inputStream.read();
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (true) {
            if (read == -1) {
                if (z2) {
                    byteArrayOutputStream.write(47);
                }
                if (z4) {
                    byteArrayOutputStream.write(42);
                }
                if (z6) {
                    f$$ExternalSyntheticLambda0.m("Unterminated string at the end of file");
                    return null;
                }
                if (!z3) {
                    return byteArrayOutputStream;
                }
                f$$ExternalSyntheticLambda0.m("Unterminated comment at the end of file");
                return null;
            }
            if (z3) {
                if (read == 42) {
                    if (z4 && !z) {
                        sb.append('*');
                    }
                    z4 = true;
                } else if (read != 47) {
                    if (z4 && !z) {
                        sb.append('*');
                    }
                    if (!z) {
                        sb.append((char) read);
                    }
                    z4 = false;
                } else if (z4) {
                    z = true;
                    z3 = false;
                    z4 = false;
                } else if (!z) {
                    sb.append((char) read);
                }
            } else if (z5) {
                if (read == 92) {
                    if (z8) {
                        byteArrayOutputStream.write(92);
                        byteArrayOutputStream.write(92);
                        z8 = false;
                    }
                    z8 = true;
                } else if (read == 39) {
                    if (z8) {
                        byteArrayOutputStream.write(92);
                        z8 = false;
                    } else {
                        z5 = false;
                    }
                    byteArrayOutputStream.write(39);
                } else {
                    if (read == 13 || read == 10) {
                        break;
                    }
                    if (z8) {
                        byteArrayOutputStream.write(92);
                        z8 = false;
                    }
                    byteArrayOutputStream.write(read);
                }
            } else if (z6) {
                if (read == 92) {
                    if (z8) {
                        byteArrayOutputStream.write(92);
                        byteArrayOutputStream.write(92);
                        z8 = false;
                    }
                    z8 = true;
                } else if (read == 34) {
                    if (z8) {
                        byteArrayOutputStream.write(92);
                        z8 = false;
                    } else {
                        z6 = false;
                    }
                    byteArrayOutputStream.write(34);
                } else {
                    if (read == 13 || read == 10) {
                        break;
                    }
                    if (z8) {
                        byteArrayOutputStream.write(92);
                        z8 = false;
                    }
                    byteArrayOutputStream.write(read);
                }
            } else if (z7) {
                if (read == 13 || read == 10) {
                    String[] strArr = tokenizeRow(sb2.toString());
                    if (strArr.length < 2 || strArr.length > 3) {
                        break;
                    }
                    if (!strArr[0].equals("define")) {
                        throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Invalid/unsupported preprocessor directive '"), strArr[0], "'"));
                    }
                    map.put(strArr[1], strArr.length == 3 ? strArr[2] : null);
                    sb2.setLength(0);
                    z7 = false;
                } else {
                    sb2.append((char) read);
                }
            } else if (read == 47) {
                if (z2) {
                    byteArrayOutputStream.write(47);
                }
                z2 = true;
            } else if (read != 42) {
                if (read == 39) {
                    if (z2) {
                        byteArrayOutputStream.write(47);
                    }
                    byteArrayOutputStream.write(read);
                    z5 = true;
                } else if (read == 34) {
                    if (z2) {
                        byteArrayOutputStream.write(47);
                    }
                    byteArrayOutputStream.write(read);
                    z6 = true;
                } else if (read != 35) {
                    if (z2) {
                        byteArrayOutputStream.write(47);
                    }
                    byteArrayOutputStream.write(read);
                    if (read != 32 && read != 9 && read != 13 && read != 10) {
                        z = true;
                    }
                } else {
                    if (map == null) {
                        f$$ExternalSyntheticLambda0.m("Unexpected preprocessor directive");
                        return null;
                    }
                    z7 = true;
                }
                z2 = false;
            } else if (z2) {
                z3 = true;
                z2 = false;
            } else {
                byteArrayOutputStream.write(read);
            }
            read = inputStream.read();
        }
        f$$ExternalSyntheticLambda0.m("Bad preprocessor directive");
        return null;
    }

    public static String[] tokenizeRow(String str) {
        String[] split = str.split("[ \t]");
        int i = 0;
        for (String str2 : split) {
            if (str2 != null && str2.length() > 0) {
                i++;
            }
        }
        String[] strArr = new String[i];
        int i2 = 0;
        for (String str3 : split) {
            if (str3 != null && str3.length() > 0) {
                strArr[i2] = str3;
                i2++;
            }
        }
        return strArr;
    }

    public static void unescapeString(StringBuilder sb, String str) {
        if (str.length() < 2) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, string is too short");
            return;
        }
        if (str.charAt(0) != '\"' || str.charAt(str.length() - 1) != '\"') {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, string not surrounded by '\"'");
            return;
        }
        boolean z = false;
        int i = 1;
        while (i < str.length() - 1) {
            char charAt = str.charAt(i);
            if (z) {
                if (charAt == '\\') {
                    sb.append('\\');
                } else if (charAt == '\"') {
                    sb.append('\"');
                } else if (charAt == '\'') {
                    sb.append('\'');
                } else if (charAt == 'x') {
                    int i2 = i + 2;
                    if (i2 >= str.length()) {
                        f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, hex constant in string too short");
                        return;
                    }
                    try {
                        sb.append((char) Integer.parseInt(str.charAt(i + 1) + Character.toString(str.charAt(i2)), 16));
                        i = i2;
                    } catch (NumberFormatException e) {
                        throw new ImageReadException("Parsing XPM file failed, hex constant invalid", e);
                    }
                } else if (charAt == '0' || charAt == '1' || charAt == '2' || charAt == '3' || charAt == '4' || charAt == '5' || charAt == '6' || charAt == '7') {
                    int i3 = i + 1;
                    int i4 = (i3 >= str.length() || '0' > str.charAt(i3) || str.charAt(i3) > '7') ? 1 : 2;
                    int i5 = i + 2;
                    if (i5 < str.length() && '0' <= str.charAt(i5) && str.charAt(i5) <= '7') {
                        i4++;
                    }
                    int i6 = 0;
                    for (int i7 = 0; i7 < i4; i7++) {
                        i6 = (i6 * 8) + (str.charAt(i + i7) - '0');
                    }
                    i += i4 - 1;
                    sb.append((char) i6);
                } else if (charAt == 'a') {
                    sb.append((char) 7);
                } else if (charAt == 'b') {
                    sb.append('\b');
                } else if (charAt == 'f') {
                    sb.append('\f');
                } else if (charAt == 'n') {
                    sb.append('\n');
                } else if (charAt == 'r') {
                    sb.append('\r');
                } else if (charAt == 't') {
                    sb.append('\t');
                } else {
                    if (charAt != 'v') {
                        f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, invalid escape sequence");
                        return;
                    }
                    sb.append((char) 11);
                }
                z = false;
            } else if (charAt == '\\') {
                z = true;
            } else {
                if (charAt == '\"') {
                    f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, extra '\"' found in string");
                    return;
                }
                sb.append(charAt);
            }
            i++;
        }
        if (z) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, unterminated escape sequence found in string");
        }
    }

    public String nextToken() {
        StringBuilder sb = new StringBuilder();
        int read = this.is.read();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (read != -1) {
            if (z2) {
                if (read == 92) {
                    sb.append('\\');
                    z3 = !z3;
                } else {
                    if (read == 34) {
                        sb.append('\"');
                        if (!z3) {
                            return sb.toString();
                        }
                    } else {
                        if (read == 13 || read == 10) {
                            f$$ExternalSyntheticLambda0.m("Unterminated string in XPM file");
                            return null;
                        }
                        sb.append((char) read);
                    }
                    z3 = false;
                }
            } else if (z) {
                if (!Character.isLetterOrDigit(read) && read != 95) {
                    this.is.unread(read);
                    return sb.toString();
                }
                sb.append((char) read);
            } else if (read == 34) {
                sb.append('\"');
                z2 = true;
            } else if (Character.isLetterOrDigit(read) || read == 95) {
                sb.append((char) read);
                z = true;
            } else {
                if (read == 123 || read == 125 || read == 91 || read == 93 || read == 42 || read == 59 || read == 61 || read == 44) {
                    sb.append((char) read);
                    return sb.toString();
                }
                if (read != 32 && read != 9 && read != 13 && read != 10) {
                    throw new ImageReadException("Unhandled/invalid character '" + ((char) read) + "' found in XPM file");
                }
            }
            read = this.is.read();
        }
        if (z) {
            return sb.toString();
        }
        if (!z2) {
            return null;
        }
        f$$ExternalSyntheticLambda0.m("Unterminated string ends XMP file");
        return null;
    }
}
