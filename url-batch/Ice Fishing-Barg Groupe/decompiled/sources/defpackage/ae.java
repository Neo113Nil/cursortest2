package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ae extends dc1 {
    public final /* synthetic */ int BRwzKIf41E4i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae(int i, boolean z) {
        super(z);
        this.BRwzKIf41E4i = i;
    }

    @Override // defpackage.dc1
    public final Object PxuCJdSBwIXG(String str, Bundle bundle) {
        switch (this.BRwzKIf41E4i) {
            case 0:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 1:
                bundle.getClass();
                str.getClass();
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 2:
                bundle.getClass();
                str.getClass();
                return Integer.valueOf(vi0.ZbWwgt3aGe7A(str, bundle));
            case 3:
                bundle.getClass();
                str.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            default:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                return vi0.aF05bpZJlKEP(str, bundle);
        }
    }

    @Override // defpackage.dc1
    public final Object Y1f8riQaR6yg(String str) {
        int parseInt;
        long parseLong;
        boolean z = true;
        switch (this.BRwzKIf41E4i) {
            case 0:
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        u9.XL4ISE6Oc65B("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                if (pa2.yQRudnv4La6p(str, "0x", false)) {
                    String substring = str.substring(2);
                    ov2.RfyTYNmI9Srp(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case 3:
                String substring2 = str.endsWith("L") ? str.substring(0, str.length() - 1) : str;
                if (pa2.yQRudnv4La6p(str, "0x", false)) {
                    String substring3 = substring2.substring(2);
                    ov2.RfyTYNmI9Srp(16);
                    parseLong = Long.parseLong(substring3, 16);
                } else {
                    parseLong = Long.parseLong(substring2);
                }
                return Long.valueOf(parseLong);
            default:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // defpackage.dc1
    public String a92UlCVFR9N8(Object obj) {
        switch (this.BRwzKIf41E4i) {
            case 4:
                String str = (String) obj;
                if (str == null) {
                    return "null";
                }
                String encode = Uri.encode(str, null);
                encode.getClass();
                return encode;
            default:
                return super.a92UlCVFR9N8(obj);
        }
    }

    @Override // defpackage.dc1
    public final void e9gEMXR7LXtO(Bundle bundle, String str, Object obj) {
        switch (this.BRwzKIf41E4i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                break;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, floatValue);
                break;
            case 2:
                int intValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                break;
            case 3:
                long longValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, longValue);
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putString(str, str2);
                    break;
                }
        }
    }

    @Override // defpackage.dc1
    public final String lS5Rgt96tfkO() {
        switch (this.BRwzKIf41E4i) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            default:
                return "string";
        }
    }
}
