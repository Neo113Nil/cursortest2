package r4;

import a4.j;
import android.net.Uri;
import android.os.Bundle;
import n4.f0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends f0 {

    /* renamed from: r, reason: collision with root package name */
    public static final g f8173r = new g(0, false);

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8174q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, boolean z10) {
        super(z10);
        this.f8174q = i3;
    }

    @Override // n4.f0
    public final Object a(String str, Bundle bundle) {
        switch (this.f8174q) {
            case 0:
                bundle.getClass();
                str.getClass();
                return null;
            case 1:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                boolean z10 = bundle.getBoolean(str, false);
                if (z10 || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z10);
                }
                c6.f.Q(str);
                throw null;
            case 2:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                double d10 = bundle.getDouble(str, Double.MIN_VALUE);
                if (d10 != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                    return Double.valueOf(d10);
                }
                c6.f.Q(str);
                throw null;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                bundle.getClass();
                str.getClass();
                double d11 = bundle.getDouble(str, Double.MIN_VALUE);
                if (d11 != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                    return Double.valueOf(d11);
                }
                c6.f.Q(str);
                throw null;
            case j.LONG_FIELD_NUMBER /* 4 */:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                float f3 = bundle.getFloat(str, Float.MIN_VALUE);
                if (f3 != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f3);
                }
                c6.f.Q(str);
                throw null;
            case j.STRING_FIELD_NUMBER /* 5 */:
                bundle.getClass();
                str.getClass();
                if (!a.a.k(str, bundle) || a.a.N(str, bundle)) {
                    return null;
                }
                return Integer.valueOf(a.a.C(str, bundle));
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                c6.f.Q(str);
                throw null;
            default:
                bundle.getClass();
                str.getClass();
                return (!a.a.k(str, bundle) || a.a.N(str, bundle)) ? "null" : a.a.J(str, bundle);
        }
    }

    @Override // n4.f0
    public final String b() {
        switch (this.f8174q) {
            case 0:
                return "unknown";
            case 1:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return "double";
            case j.LONG_FIELD_NUMBER /* 4 */:
                return "float_nullable";
            case j.STRING_FIELD_NUMBER /* 5 */:
                return "integer_nullable";
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "long_nullable";
            default:
                return "string_non_nullable";
        }
    }

    @Override // n4.f0
    public final Object d(String str) {
        switch (this.f8174q) {
            case 0:
                return "null";
            case 1:
                if (str.equals("null")) {
                    return null;
                }
                return (Boolean) f0.f7051k.d(str);
            case 2:
                if (str.equals("null")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str));
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return Double.valueOf(Double.parseDouble(str));
            case j.LONG_FIELD_NUMBER /* 4 */:
                if (str.equals("null")) {
                    return null;
                }
                return Float.valueOf(Float.parseFloat(str));
            case j.STRING_FIELD_NUMBER /* 5 */:
                if (str.equals("null")) {
                    return null;
                }
                return (Integer) f0.f7044b.d(str);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                if (str.equals("null")) {
                    return null;
                }
                return (Long) f0.f7047e.d(str);
            default:
                return str;
        }
    }

    @Override // n4.f0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f8174q) {
            case 0:
                str.getClass();
                ((String) obj).getClass();
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                str.getClass();
                if (bool != null) {
                    f0.f7051k.e(bundle, str, bool);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 2:
                Double d10 = (Double) obj;
                str.getClass();
                if (d10 != null) {
                    bundle.putDouble(str, d10.doubleValue());
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                double doubleValue = ((Number) obj).doubleValue();
                str.getClass();
                bundle.putDouble(str, doubleValue);
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
                Float f3 = (Float) obj;
                str.getClass();
                if (f3 != null) {
                    f0.f7049h.e(bundle, str, f3);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case j.STRING_FIELD_NUMBER /* 5 */:
                Integer num = (Integer) obj;
                str.getClass();
                if (num != null) {
                    f0.f7044b.e(bundle, str, num);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                Long l10 = (Long) obj;
                str.getClass();
                if (l10 != null) {
                    f0.f7047e.e(bundle, str, l10);
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

    @Override // n4.f0
    public String f(Object obj) {
        switch (this.f8174q) {
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = (String) obj;
                str.getClass();
                String encode = Uri.encode(str, null);
                encode.getClass();
                return encode;
            default:
                return super.f(obj);
        }
    }
}
