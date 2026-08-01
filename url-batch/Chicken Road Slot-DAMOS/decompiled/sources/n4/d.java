package n4;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends f0 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7039q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, boolean z10) {
        super(z10);
        this.f7039q = i3;
    }

    @Override // n4.f0
    public final Object a(String str, Bundle bundle) {
        switch (this.f7039q) {
            case 0:
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
            case 1:
                bundle.getClass();
                str.getClass();
                float f3 = bundle.getFloat(str, Float.MIN_VALUE);
                if (f3 != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f3);
                }
                c6.f.Q(str);
                throw null;
            case 2:
                bundle.getClass();
                str.getClass();
                return Integer.valueOf(a.a.C(str, bundle));
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                bundle.getClass();
                str.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                c6.f.Q(str);
                throw null;
            default:
                bundle.getClass();
                str.getClass();
                if (!a.a.k(str, bundle) || a.a.N(str, bundle)) {
                    return null;
                }
                return a.a.J(str, bundle);
        }
    }

    @Override // n4.f0
    public final String b() {
        switch (this.f7039q) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "long";
            default:
                return "string";
        }
    }

    @Override // n4.f0
    public final Object d(String str) {
        boolean z10;
        switch (this.f7039q) {
            case 0:
                if (str.equals("true")) {
                    z10 = true;
                } else {
                    if (!str.equals("false")) {
                        a1.e("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                return Integer.valueOf(str.startsWith("0x") ? Integer.parseInt(str.substring(2), CharsKt.checkRadix(16)) : Integer.parseInt(str));
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                String substring = str.endsWith("L") ? str.substring(0, str.length() - 1) : str;
                return Long.valueOf(str.startsWith("0x") ? Long.parseLong(substring.substring(2), CharsKt.checkRadix(16)) : Long.parseLong(substring));
            default:
                str.getClass();
                if (Intrinsics.a(str, "null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // n4.f0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f7039q) {
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
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
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

    @Override // n4.f0
    public String f(Object obj) {
        switch (this.f7039q) {
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                String str = (String) obj;
                if (str == null) {
                    return "null";
                }
                String encode = Uri.encode(str, null);
                encode.getClass();
                return encode;
            default:
                return super.f(obj);
        }
    }
}
