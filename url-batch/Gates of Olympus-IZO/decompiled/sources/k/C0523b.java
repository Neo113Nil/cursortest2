package k;

import Z1.i;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0230o;
import f.AbstractC0382a;
import h1.C0438i;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.UUID;
import q1.C0784h;
import q1.p;
import q1.w;
import s1.c;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523b implements c {

    /* renamed from: b, reason: collision with root package name */
    public static C0523b f5305b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5306a;

    public /* synthetic */ C0523b(int i3) {
        this.f5306a = i3;
    }

    public static C0784h c(Context context, w wVar, Bundle bundle, EnumC0230o enumC0230o, p pVar) {
        String uuid = UUID.randomUUID().toString();
        i.e(uuid, "randomUUID().toString()");
        i.f(wVar, "destination");
        i.f(enumC0230o, "hostLifecycleState");
        return new C0784h(context, wVar, bundle, enumC0230o, pVar, uuid, null);
    }

    @Override // s1.c
    public void a(int i3, Serializable serializable) {
        String str;
        switch (this.f5306a) {
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                switch (i3) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case C0438i.LONG_FIELD_NUMBER /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case AbstractC0382a.f4777a /* 9 */:
                    default:
                        str = "";
                        break;
                    case AbstractC0382a.f4779c /* 10 */:
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

    @Override // s1.c
    public void b() {
        switch (this.f5306a) {
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public C0523b() {
        this.f5306a = 0;
        new LinkedHashMap(0, 0.75f, true);
    }

    public C0523b(int i3, int i4) {
        this.f5306a = 7;
    }

    private final void d() {
    }

    private final void e(int i3, Serializable serializable) {
    }
}
