package x1;

import java.util.Locale;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f23177a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f23178b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f23179c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23180d;

    private n(String[] strArr, int[] iArr, String[] strArr2, int i7) {
        this.f23177a = strArr;
        this.f23178b = iArr;
        this.f23179c = strArr2;
        this.f23180d = i7;
    }

    public static n b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new n(strArr, iArr, strArr2, c(str, strArr, iArr, strArr2));
    }

    private static int c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        strArr[0] = "";
        int i7 = 0;
        int i8 = 0;
        while (i7 < str.length()) {
            int indexOf = str.indexOf("$", i7);
            if (indexOf == -1) {
                strArr[i8] = strArr[i8] + str.substring(i7);
                i7 = str.length();
            } else if (indexOf != i7) {
                strArr[i8] = strArr[i8] + str.substring(i7, indexOf);
                i7 = indexOf;
            } else if (str.startsWith("$$", i7)) {
                strArr[i8] = strArr[i8] + "$";
                i7 += 2;
            } else {
                int i9 = i7 + 1;
                int indexOf2 = str.indexOf("$", i9);
                String substring = str.substring(i9, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i8] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2 + "d";
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.hashCode();
                    switch (substring) {
                        case "Number":
                            iArr[i8] = 2;
                            break;
                        case "Time":
                            iArr[i8] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i8] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    strArr2[i8] = str2;
                }
                i8++;
                strArr[i8] = "";
                i7 = indexOf2 + 1;
            }
        }
        return i8;
    }

    public String a(String str, long j7, int i7, long j8) {
        String format;
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        while (true) {
            int i9 = this.f23180d;
            if (i8 >= i9) {
                sb.append(this.f23177a[i9]);
                return sb.toString();
            }
            sb.append(this.f23177a[i8]);
            int[] iArr = this.f23178b;
            if (iArr[i8] == 1) {
                sb.append(str);
            } else {
                if (iArr[i8] == 2) {
                    format = String.format(Locale.US, this.f23179c[i8], Long.valueOf(j7));
                } else if (iArr[i8] == 3) {
                    format = String.format(Locale.US, this.f23179c[i8], Integer.valueOf(i7));
                } else if (iArr[i8] == 4) {
                    format = String.format(Locale.US, this.f23179c[i8], Long.valueOf(j8));
                }
                sb.append(format);
            }
            i8++;
        }
    }
}
