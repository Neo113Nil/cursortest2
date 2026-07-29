package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzaal {
    static String zza(zzyb zzybVar) {
        String str;
        zzaam zzaamVar = new zzaam(zzybVar);
        StringBuilder sb = new StringBuilder(zzaamVar.size());
        for (int i = 0; i < zzaamVar.size(); i++) {
            int zzag = zzaamVar.zzag(i);
            if (zzag == 34) {
                str = "\\\"";
            } else if (zzag == 39) {
                str = "\\'";
            } else if (zzag != 92) {
                switch (zzag) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
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
                        if (zzag < 32 || zzag > 126) {
                            sb.append('\\');
                            sb.append((char) (((zzag >>> 6) & 3) + 48));
                            sb.append((char) (((zzag >>> 3) & 7) + 48));
                            zzag = (zzag & 7) + 48;
                        }
                        sb.append((char) zzag);
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
