package defpackage;

import android.os.Bundle;
import com.facebook.internal.ServerProtocol;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gq1 extends iq1 {
    public final /* synthetic */ int e;

    public gq1(int i, boolean z) {
        this.e = i;
    }

    @Override // defpackage.iq1
    public final Object a(Bundle bundle, String str) {
        switch (this.e) {
            case 0:
                bundle.getClass();
                str.getClass();
                return (Boolean) bundle.get(str);
            case 1:
                bundle.getClass();
                str.getClass();
                Object obj = bundle.get(str);
                obj.getClass();
                return (Integer) obj;
            case 2:
                bundle.getClass();
                str.getClass();
                Object obj2 = bundle.get(str);
                obj2.getClass();
                return (Long) obj2;
            default:
                bundle.getClass();
                str.getClass();
                return (String) bundle.get(str);
        }
    }

    @Override // defpackage.iq1
    public final String b() {
        switch (this.e) {
            case 0:
                return "boolean";
            case 1:
                return "integer";
            case 2:
                return "long";
            default:
                return "string";
        }
    }

    @Override // defpackage.iq1
    public final Object d(String str) {
        boolean z = true;
        switch (this.e) {
            case 0:
                str.getClass();
                if (!Intrinsics.b(str, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                    if (!Intrinsics.b(str, "false")) {
                        lh.e("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                str.getClass();
                return Integer.valueOf(tp2.o(str, "0x", false) ? Integer.parseInt(str.substring(2), CharsKt.checkRadix(16)) : Integer.parseInt(str));
            case 2:
                str.getClass();
                String substring = tp2.h(str, "L", false) ? str.substring(0, str.length() - 1) : str;
                return Long.valueOf(tp2.o(str, "0x", false) ? Long.parseLong(substring.substring(2), CharsKt.checkRadix(16)) : Long.parseLong(substring));
            default:
                str.getClass();
                if (Intrinsics.b(str, "null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // defpackage.iq1
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.e) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                break;
            case 2:
                long longValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, longValue);
                break;
            default:
                str.getClass();
                bundle.putString(str, (String) obj);
                break;
        }
    }
}
