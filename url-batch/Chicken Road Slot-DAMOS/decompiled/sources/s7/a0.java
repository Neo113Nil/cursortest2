package s7;

import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.gms.internal.measurement.y4;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8473d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a0 f8462e = new a0(0);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a0 f8463i = new a0(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ a0 f8464r = new a0(2);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ a0 f8465s = new a0(3);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a0 f8466t = new a0(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ a0 f8467u = new a0(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a0 f8468v = new a0(6);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a0 f8469w = new a0(7);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ a0 f8470x = new a0(8);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ a0 f8471y = new a0(9);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a0 f8472z = new a0(10);
    public static final /* synthetic */ a0 A = new a0(11);
    public static final /* synthetic */ a0 B = new a0(12);
    public static final /* synthetic */ a0 C = new a0(13);
    public static final /* synthetic */ a0 D = new a0(14);
    public static final /* synthetic */ a0 E = new a0(15);
    public static final /* synthetic */ a0 F = new a0(16);
    public static final /* synthetic */ a0 G = new a0(17);
    public static final /* synthetic */ a0 H = new a0(18);
    public static final /* synthetic */ a0 I = new a0(19);
    public static final /* synthetic */ a0 J = new a0(20);
    public static final /* synthetic */ a0 K = new a0(21);
    public static final /* synthetic */ a0 L = new a0(22);
    public static final /* synthetic */ a0 M = new a0(23);
    public static final /* synthetic */ a0 N = new a0(24);
    public static final /* synthetic */ a0 O = new a0(25);
    public static final /* synthetic */ a0 P = new a0(26);
    public static final /* synthetic */ a0 Q = new a0(27);
    public static final /* synthetic */ a0 R = new a0(28);
    public static final /* synthetic */ a0 S = new a0(29);

    public /* synthetic */ a0(int i3) {
        this.f8473d = i3;
    }

    @Override // s7.v
    public final Object a() {
        switch (this.f8473d) {
            case 0:
                List list = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(12, 3600000L, "measurement.session.engagement_interval").get();
            case 1:
                List list2 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(32, "measurement.rb.attribution.app_allowlist", "").get();
            case 2:
                List list3 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                List list4 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(13, "measurement.rb.attribution.event_params", "value|currency").get();
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                List list5 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                List list6 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(75, 65536L, "measurement.upload.max_batch_size").get()).longValue());
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(57, 864000000L, "measurement.rb.attribution.max_queue_time").get();
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(54, 16L, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue());
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                List list9 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(55, 90L, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
            case 9:
                List list10 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(25, 0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
            case 10:
                List list11 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(24, 1000L, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
            case RequestError.STOP_TRACKING /* 11 */:
                List list12 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Boolean) com.google.android.gms.internal.measurement.h3.f2364a.b("measurement.config.bundle_for_all_apps_on_backgrounded", true, 2).get();
            case 12:
                List list13 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Boolean) com.google.android.gms.internal.measurement.h3.f2364a.b("measurement.config.notify_trigger_uris_on_backgrounded", true, 31).get();
            case 13:
                List list14 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(30, 3000L, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
            case 14:
                List list15 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Boolean) com.google.android.gms.internal.measurement.h3.f2364a.b("measurement.config.default_flag_values", true, 10).get();
            case 15:
                List list16 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(11, 3600000L, "45769094").get();
            case 16:
                List list17 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(66, 65536L, "measurement.upload.max_bundle_size").get()).longValue());
            case 17:
                List list18 = e0.f8605a;
                return (Boolean) com.google.android.gms.internal.measurement.w3.f2926b.get();
            case 18:
                List list19 = e0.f8605a;
                return (Boolean) com.google.android.gms.internal.measurement.w3.f2925a.get();
            case 19:
                List list20 = e0.f8605a;
                return (Boolean) com.google.android.gms.internal.measurement.w3.f2927c.get();
            case 20:
                List list21 = e0.f8605a;
                return (Boolean) com.google.android.gms.internal.measurement.c4.f2189a.get();
            case 21:
                List list22 = e0.f8605a;
                return (Boolean) y4.f3005a.get();
            case 22:
                List list23 = e0.f8605a;
                return (Boolean) a5.f2134a.get();
            case 23:
                List list24 = e0.f8605a;
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.j3.f2425a.get()).longValue());
            case 24:
                List list25 = e0.f8605a;
                return (Boolean) com.google.android.gms.internal.measurement.u3.f2843a.get();
            case 25:
                List list26 = e0.f8605a;
                return (Boolean) com.google.android.gms.internal.measurement.u3.f2844b.get();
            case 26:
                List list27 = e0.f8605a;
                return (Boolean) com.google.android.gms.internal.measurement.r4.f2730a.get();
            case 27:
                List list28 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(70, 1000L, "measurement.upload.max_events_per_bundle").get()).longValue());
            case 28:
                List list29 = e0.f8605a;
                return (Boolean) v4.f2865a.get();
            default:
                List list30 = e0.f8605a;
                com.google.android.gms.internal.measurement.i4.f2393e.get();
                return (Boolean) com.google.android.gms.internal.measurement.j4.f2426a.b("measurement.rb.attribution.service", true, 6).get();
        }
    }
}
