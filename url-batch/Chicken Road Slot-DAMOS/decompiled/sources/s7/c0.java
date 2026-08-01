package s7;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements v, y4.d, w7.a, w7.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8549d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c0 f8538e = new c0(0);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c0 f8539i = new c0(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ c0 f8540r = new c0(2);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ c0 f8541s = new c0(3);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ c0 f8542t = new c0(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ c0 f8543u = new c0(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ c0 f8544v = new c0(6);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ c0 f8545w = new c0(7);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ c0 f8546x = new c0(8);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ c0 f8547y = new c0(9);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ c0 f8548z = new c0(10);
    public static final /* synthetic */ c0 A = new c0(11);
    public static final /* synthetic */ c0 B = new c0(12);
    public static final /* synthetic */ c0 C = new c0(13);
    public static final /* synthetic */ c0 D = new c0(14);
    public static final /* synthetic */ c0 E = new c0(28);
    public static final /* synthetic */ c0 F = new c0(29);

    public /* synthetic */ c0(int i3) {
        this.f8549d = i3;
    }

    public static final float e(float f3, float[] fArr, float[] fArr2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float abs = Math.abs(f3);
        float signum = Math.signum(f3);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i3 = -(binarySearch + 1);
        int i10 = i3 - 1;
        if (i10 >= fArr.length - 1) {
            float f14 = fArr[fArr.length - 1];
            float f15 = fArr2[fArr.length - 1];
            if (f14 == 0.0f) {
                return 0.0f;
            }
            return (f15 / f14) * f3;
        }
        if (i10 == -1) {
            float f16 = fArr[0];
            f12 = fArr2[0];
            f13 = f16;
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            float f17 = fArr[i10];
            float f18 = fArr[i3];
            f10 = fArr2[i10];
            f11 = f17;
            f12 = fArr2[i3];
            f13 = f18;
        }
        return (((f12 - f10) * Math.max(0.0f, Math.min(1.0f, f11 == f13 ? 0.0f : (abs - f11) / (f13 - f11)))) + f10) * signum;
    }

    @Override // s7.v
    public Object a() {
        switch (this.f8549d) {
            case 0:
                List list = e0.f8605a;
                com.google.android.gms.internal.measurement.i4.f2393e.get();
                return (Boolean) com.google.android.gms.internal.measurement.j4.f2426a.b("measurement.rb.attribution.client2", true, 1).get();
            case 1:
                List list2 = e0.f8605a;
                com.google.android.gms.internal.measurement.i4.f2393e.get();
                return (Boolean) com.google.android.gms.internal.measurement.j4.f2426a.b("measurement.rb.attribution.uuid_generation", true, 8).get();
            case 2:
                List list3 = e0.f8605a;
                com.google.android.gms.internal.measurement.i4.f2393e.get();
                return (Boolean) com.google.android.gms.internal.measurement.j4.f2426a.b("measurement.rb.attribution.enable_trigger_redaction", true, 7).get();
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                List list4 = e0.f8605a;
                com.google.android.gms.internal.measurement.i4.f2393e.get();
                return (Boolean) com.google.android.gms.internal.measurement.j4.f2426a.b("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true, 4).get();
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                List list5 = e0.f8605a;
                return (Boolean) com.google.android.gms.internal.measurement.l4.f2497a.get();
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                List list6 = e0.f8605a;
                com.google.android.gms.internal.measurement.i4.f2393e.get();
                return (Boolean) com.google.android.gms.internal.measurement.j4.f2426a.b("measurement.rb.attribution.service.trigger_uris_high_priority", true, 2).get();
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = e0.f8605a;
                return (Boolean) com.google.android.gms.internal.measurement.n4.f2566b.get();
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = e0.f8605a;
                return (Boolean) com.google.android.gms.internal.measurement.n4.f2565a.get();
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                List list9 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(71, 100000L, "measurement.upload.max_events_per_day").get()).longValue());
            case 9:
                List list10 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(0, 10000L, "measurement.ad_id_cache_time").get();
            case 10:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.a4.f2132a.get()).booleanValue());
            case RequestError.STOP_TRACKING /* 11 */:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.a4.f2133b.get()).booleanValue());
            case 12:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.f4.f2279a.get()).booleanValue());
            case 13:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.p4.f2663a.get()).booleanValue());
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.t4.f2809a.get()).booleanValue());
        }
    }

    @Override // y4.d
    public void b() {
        switch (this.f8549d) {
            case 24:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // y4.d
    public void c(int i3, Object obj) {
        String str;
        switch (this.f8549d) {
            case 24:
                break;
            default:
                switch (i3) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i3 != 6 && i3 != 7 && i3 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    @Override // w7.f
    public w7.n d(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i3 = y6.c.f10632h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? z4.w.q(bundle) : z4.w.q(null);
    }

    @Override // w7.a
    public /* synthetic */ Object f(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new y6.a(intent);
        }
        return null;
    }

    public long g() {
        switch (this.f8549d) {
            case 19:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    private final void h() {
    }

    private final void i(int i3, Object obj) {
    }
}
