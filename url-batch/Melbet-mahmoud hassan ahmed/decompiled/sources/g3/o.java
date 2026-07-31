package g3;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ds2;
import com.google.android.gms.internal.ads.ks2;
import com.google.android.gms.internal.ads.kv;

/* loaded from: classes.dex */
public final class o {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(ds2 ds2Var) {
        char c7;
        if (!e(ds2Var)) {
            return "unspecified";
        }
        String c8 = c(ds2Var.f4312a.f2953a);
        if (TextUtils.isEmpty(c8)) {
            return "unspecified";
        }
        switch (c8.hashCode()) {
            case 1743582862:
                if (c8.equals("requester_type_0")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 1743582863:
                if (c8.equals("requester_type_1")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 1743582864:
                if (c8.equals("requester_type_2")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 1743582865:
                if (c8.equals("requester_type_3")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 1743582866:
                if (c8.equals("requester_type_4")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 1743582867:
                if (c8.equals("requester_type_5")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case 1743582868:
                if (c8.equals("requester_type_6")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            default:
                return c8;
        }
    }

    public static String b(ds2 ds2Var) {
        return !e(ds2Var) ? "" : ds2Var.f4312a.f2953a.f7618d.f7658u;
    }

    public static String c(ks2 ks2Var) {
        Bundle bundle = ks2Var.f7618d.f7645h;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    public static boolean d(ds2 ds2Var) {
        if (!e(ds2Var)) {
            return false;
        }
        kv kvVar = ds2Var.f4312a.f2953a.f7618d;
        return (kvVar.f7661x == null && kvVar.C == null) ? false : true;
    }

    private static boolean e(ds2 ds2Var) {
        return ds2Var != null;
    }
}
