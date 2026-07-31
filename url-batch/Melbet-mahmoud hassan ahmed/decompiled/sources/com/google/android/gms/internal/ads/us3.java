package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class us3 {
    static String a(uo3 uo3Var) {
        String str;
        StringBuilder sb = new StringBuilder(uo3Var.q());
        for (int i7 = 0; i7 < uo3Var.q(); i7++) {
            int n7 = uo3Var.n(i7);
            if (n7 == 34) {
                str = "\\\"";
            } else if (n7 == 39) {
                str = "\\'";
            } else if (n7 != 92) {
                switch (n7) {
                    case c4.w0.f2149o /* 7 */:
                        str = "\\a";
                        break;
                    case c4.w0.f2150p /* 8 */:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (n7 < 32 || n7 > 126) {
                            sb.append('\\');
                            sb.append((char) (((n7 >>> 6) & 3) + 48));
                            sb.append((char) (((n7 >>> 3) & 7) + 48));
                            n7 = (n7 & 7) + 48;
                        }
                        sb.append((char) n7);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
