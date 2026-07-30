package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ao2 extends dc1 {
    public static final ao2 XL4ISE6Oc65B = new ao2(0, false);
    public final /* synthetic */ int BRwzKIf41E4i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao2(int i, boolean z) {
        super(z);
        this.BRwzKIf41E4i = i;
    }

    @Override // defpackage.dc1
    public final Object PxuCJdSBwIXG(String str, Bundle bundle) {
        switch (this.BRwzKIf41E4i) {
            case 0:
                bundle.getClass();
                str.getClass();
                return null;
            case 1:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 2:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                double d = bundle.getDouble(str, Double.MIN_VALUE);
                if (d != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                    return Double.valueOf(d);
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 3:
                bundle.getClass();
                str.getClass();
                double d2 = bundle.getDouble(str, Double.MIN_VALUE);
                if (d2 != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                    return Double.valueOf(d2);
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 4:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 5:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                return Integer.valueOf(vi0.ZbWwgt3aGe7A(str, bundle));
            case 6:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            default:
                return (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) ? "null" : vi0.aF05bpZJlKEP(str, bundle);
        }
    }

    @Override // defpackage.dc1
    public final Object Y1f8riQaR6yg(String str) {
        switch (this.BRwzKIf41E4i) {
            case 0:
                return "null";
            case 1:
                if (str.equals("null")) {
                    return null;
                }
                return (Boolean) dc1.dgRBjINgWbAK.Y1f8riQaR6yg(str);
            case 2:
                if (str.equals("null")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str));
            case 3:
                return Double.valueOf(Double.parseDouble(str));
            case 4:
                if (str.equals("null")) {
                    return null;
                }
                return Float.valueOf(Float.parseFloat(str));
            case 5:
                if (str.equals("null")) {
                    return null;
                }
                return (Integer) dc1.lS5Rgt96tfkO.Y1f8riQaR6yg(str);
            case 6:
                if (str.equals("null")) {
                    return null;
                }
                return (Long) dc1.e9gEMXR7LXtO.Y1f8riQaR6yg(str);
            default:
                return str;
        }
    }

    @Override // defpackage.dc1
    public String a92UlCVFR9N8(Object obj) {
        switch (this.BRwzKIf41E4i) {
            case 7:
                String str = (String) obj;
                str.getClass();
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
                str.getClass();
                ((String) obj).getClass();
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                str.getClass();
                if (bool != null) {
                    dc1.dgRBjINgWbAK.e9gEMXR7LXtO(bundle, str, bool);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 2:
                Double d = (Double) obj;
                str.getClass();
                if (d != null) {
                    bundle.putDouble(str, d.doubleValue());
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 3:
                double doubleValue = ((Number) obj).doubleValue();
                str.getClass();
                bundle.putDouble(str, doubleValue);
                break;
            case 4:
                Float f = (Float) obj;
                str.getClass();
                if (f != null) {
                    dc1.rtx2ld2ELZv4.e9gEMXR7LXtO(bundle, str, f);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 5:
                Integer num = (Integer) obj;
                str.getClass();
                if (num != null) {
                    dc1.lS5Rgt96tfkO.e9gEMXR7LXtO(bundle, str, num);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 6:
                Long l = (Long) obj;
                str.getClass();
                if (l != null) {
                    dc1.e9gEMXR7LXtO.e9gEMXR7LXtO(bundle, str, l);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            default:
                String str2 = (String) obj;
                str.getClass();
                str2.getClass();
                bundle.putString(str, str2);
                break;
        }
    }

    @Override // defpackage.dc1
    public final String lS5Rgt96tfkO() {
        switch (this.BRwzKIf41E4i) {
            case 0:
                return "unknown";
            case 1:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case 3:
                return "double";
            case 4:
                return "float_nullable";
            case 5:
                return "integer_nullable";
            case 6:
                return "long_nullable";
            default:
                return "string_non_nullable";
        }
    }
}
