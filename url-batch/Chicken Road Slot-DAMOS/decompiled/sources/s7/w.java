package s7;

import com.appsflyer.attribution.RequestError;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9076d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w f9065e = new w(0);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w f9066i = new w(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ w f9067r = new w(2);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ w f9068s = new w(3);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ w f9069t = new w(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ w f9070u = new w(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ w f9071v = new w(6);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ w f9072w = new w(7);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ w f9073x = new w(8);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ w f9074y = new w(9);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ w f9075z = new w(10);
    public static final /* synthetic */ w A = new w(11);
    public static final /* synthetic */ w B = new w(12);
    public static final /* synthetic */ w C = new w(13);
    public static final /* synthetic */ w D = new w(14);
    public static final /* synthetic */ w E = new w(15);
    public static final /* synthetic */ w F = new w(16);
    public static final /* synthetic */ w G = new w(17);
    public static final /* synthetic */ w H = new w(18);
    public static final /* synthetic */ w I = new w(19);
    public static final /* synthetic */ w J = new w(20);
    public static final /* synthetic */ w K = new w(21);
    public static final /* synthetic */ w L = new w(22);
    public static final /* synthetic */ w M = new w(23);
    public static final /* synthetic */ w N = new w(24);
    public static final /* synthetic */ w O = new w(25);
    public static final /* synthetic */ w P = new w(26);
    public static final /* synthetic */ w Q = new w(27);
    public static final /* synthetic */ w R = new w(28);
    public static final /* synthetic */ w S = new w(29);

    public /* synthetic */ w(int i3) {
        this.f9076d = i3;
    }

    @Override // s7.v
    public final Object a() {
        switch (this.f9076d) {
            case 0:
                List list = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(69, 1000L, "measurement.upload.max_error_events_per_day").get()).longValue());
            case 1:
                List list2 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(72, 50000L, "measurement.upload.max_public_events_per_day").get()).longValue());
            case 2:
                List list3 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(68, 10000L, "measurement.upload.max_conversions_per_day").get()).longValue());
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                List list4 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(74, 10L, "measurement.upload.max_realtime_events_per_day").get()).longValue());
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                List list5 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(20, 100000L, "measurement.store.max_stored_events_per_app").get()).longValue());
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                List list6 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(78, "measurement.upload.url", "https://app-measurement.com/a").get();
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(44, "measurement.sgtm.service_upload_apps_list", "").get();
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                List list9 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
            case 9:
                List list10 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(51, 600000L, "measurement.sgtm.upload.retry_interval").get();
            case 10:
                List list11 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(29, 86400000L, "measurement.monitoring.sample_period_millis").get();
            case RequestError.STOP_TRACKING /* 11 */:
                List list12 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(52, 21600000L, "measurement.sgtm.upload.retry_max_wait").get();
            case 12:
                List list13 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(41, 1800000L, "measurement.sgtm.batch.retry_interval").get();
            case 13:
                List list14 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(43, 21600000L, "measurement.sgtm.batch.retry_max_wait").get();
            case 14:
                List list15 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(42, 10L, "measurement.sgtm.batch.retry_max_count").get()).longValue());
            case 15:
                List list16 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(47, 5000L, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
            case 16:
                List list17 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(46, 5L, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue());
            case 17:
                List list18 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(50, 5000L, "measurement.sgtm.upload.min_delay_after_startup").get();
            case 18:
                List list19 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(49, 1000L, "measurement.sgtm.upload.min_delay_after_broadcast").get();
            case 19:
                List list20 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(48, 600000L, "measurement.sgtm.upload.min_delay_after_background").get();
            case 20:
                List list21 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(40, 240000L, "measurement.sgtm.batch.long_queuing_threshold").get();
            case 21:
                List list22 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(5, 86400000L, "measurement.config.cache_time").get();
            case 22:
                List list23 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(63, 43200000L, "measurement.upload.backoff_period").get();
            case 23:
                List list24 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(79, 3600000L, "measurement.upload.window_interval").get();
            case 24:
                List list25 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(65, 3600000L, "measurement.upload.interval").get();
            case 25:
                List list26 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(33, 10000L, "measurement.upload.realtime_upload_interval").get();
            case 26:
                List list27 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(9, 1000L, "measurement.upload.debug_upload_interval").get();
            case 27:
                List list28 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(28, 500L, "measurement.upload.minimum_delay").get();
            case 28:
                List list29 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(27, 60000L, "measurement.alarm_manager.minimum_interval").get();
            default:
                List list30 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(53, 86400000L, "measurement.upload.stale_data_deletion_interval").get();
        }
    }
}
