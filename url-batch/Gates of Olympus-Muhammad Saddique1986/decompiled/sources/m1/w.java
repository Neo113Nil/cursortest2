package m1;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0286o;
import java.io.Serializable;
import java.util.UUID;
import r.AbstractC0856c;
import t1.C1028h;
import v1.InterfaceC1161c;

/* loaded from: classes.dex */
public class w implements InterfaceC1161c, V1.h {

    /* renamed from: e, reason: collision with root package name */
    public static w f6990e;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6991d;

    public /* synthetic */ w(int i3) {
        this.f6991d = i3;
    }

    public static C1028h a(Context context, t1.u uVar, Bundle bundle, EnumC0286o enumC0286o, t1.n nVar) {
        String uuid = UUID.randomUUID().toString();
        f2.j.e(uuid, "randomUUID().toString()");
        f2.j.f(uVar, "destination");
        f2.j.f(enumC0286o, "hostLifecycleState");
        return new C1028h(context, uVar, bundle, enumC0286o, nVar, uuid, null);
    }

    public boolean b(CharSequence charSequence) {
        return false;
    }

    @Override // v1.InterfaceC1161c
    public void c(int i3, Serializable serializable) {
        String str;
        switch (this.f6991d) {
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                break;
            default:
                switch (i3) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case k1.i.LONG_FIELD_NUMBER /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case AbstractC0856c.f8037c /* 9 */:
                    default:
                        str = "";
                        break;
                    case AbstractC0856c.f8039e /* 10 */:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i3 != 6 && i3 != 7 && i3 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    @Override // v1.InterfaceC1161c
    public void e() {
        switch (this.f6991d) {
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    private final void d() {
    }

    private final void f(int i3, Serializable serializable) {
    }
}
