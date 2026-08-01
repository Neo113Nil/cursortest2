package s7;

import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.measurement.hc;
import com.google.android.gms.internal.measurement.kc;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.v5;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9118d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y f9107e = new y(0);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ y f9108i = new y(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ y f9109r = new y(2);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ y f9110s = new y(3);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ y f9111t = new y(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ y f9112u = new y(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ y f9113v = new y(6);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ y f9114w = new y(7);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ y f9115x = new y(8);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ y f9116y = new y(9);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ y f9117z = new y(10);
    public static final /* synthetic */ y A = new y(11);
    public static final /* synthetic */ y B = new y(12);
    public static final /* synthetic */ y C = new y(13);
    public static final /* synthetic */ y D = new y(14);
    public static final /* synthetic */ y E = new y(15);
    public static final /* synthetic */ y F = new y(16);
    public static final /* synthetic */ y G = new y(17);
    public static final /* synthetic */ y H = new y(18);
    public static final /* synthetic */ y I = new y(19);
    public static final /* synthetic */ y J = new y(20);
    public static final /* synthetic */ y K = new y(21);
    public static final /* synthetic */ y L = new y(22);
    public static final /* synthetic */ y M = new y(23);
    public static final /* synthetic */ y N = new y(24);
    public static final /* synthetic */ y O = new y(25);
    public static final /* synthetic */ y P = new y(26);
    public static final /* synthetic */ y Q = new y(27);
    public static final /* synthetic */ y R = new y(28);
    public static final /* synthetic */ y S = new y(29);

    public /* synthetic */ y(int i3) {
        this.f9118d = i3;
    }

    @Override // s7.v
    public final Object a() {
        switch (this.f9118d) {
            case 0:
                List list = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(34, 604800000L, "measurement.upload.refresh_blacklisted_config_interval").get();
            case 1:
                List list2 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(64, 15000L, "measurement.upload.initial_upload_delay_time").get();
            case 2:
                List list3 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(8, "measurement.config.url_scheme", "https").get();
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                List list4 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(77, 1800000L, "measurement.upload.retry_time").get();
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                List list5 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(76, 6L, "measurement.upload.retry_count").get()).longValue());
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                List list6 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(73, 518400000L, "measurement.upload.max_queue_time").get();
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(15, 605000L, "measurement.upload.google_signal_max_queue_time").get();
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(17, 4L, "measurement.lifetimevalue.max_currency_tracked").get()).longValue());
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                List list9 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(22, 200L, "measurement.audience.filter_result_max_count").get()).longValue());
            case 9:
                List list10 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(36, 5000L, "measurement.service_client.idle_disconnect_millis").get();
            case 10:
                List list11 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(38, 1000L, "measurement.service_client.reconnect_millis").get();
            case RequestError.STOP_TRACKING /* 11 */:
                List list12 = e0.f8605a;
                com.google.android.gms.internal.measurement.g4.f2324e.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.f2365a.b("measurement.test.boolean_flag", false, 0).get();
            case 12:
                List list13 = e0.f8605a;
                com.google.android.gms.internal.measurement.g4.f2324e.get();
                return (String) com.google.android.gms.internal.measurement.h4.f2365a.i(5, "measurement.test.string_flag", "---").get();
            case 13:
                List list14 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(7, "measurement.config.url_authority", "app-measurement.com").get();
            case 14:
                List list15 = e0.f8605a;
                com.google.android.gms.internal.measurement.g4.f2324e.get();
                return (Long) com.google.android.gms.internal.measurement.h4.f2365a.g(4, -1L, "measurement.test.long_flag").get();
            case 15:
                List list16 = e0.f8605a;
                com.google.android.gms.internal.measurement.g4.f2324e.get();
                return (Long) com.google.android.gms.internal.measurement.h4.f2365a.g(1, -1L, "measurement.test.cached_long_flag").get();
            case 16:
                List list17 = e0.f8605a;
                com.google.android.gms.internal.measurement.g4.f2324e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h4.f2365a.g(3, -2L, "measurement.test.int_flag").get()).longValue());
            case 17:
                List list18 = e0.f8605a;
                com.google.android.gms.internal.measurement.g4.f2324e.get();
                l5 l5Var = com.google.android.gms.internal.measurement.h4.f2365a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) l5Var.f2499e;
                kc kcVar = (kc) atomicReferenceArray.get(2);
                if (kcVar == null) {
                    hc hcVar = new hc("measurement.test.double_flag", (z6.j) ((v5) l5Var.f2500i).f2870e);
                    while (true) {
                        if (atomicReferenceArray.compareAndSet(2, null, hcVar)) {
                            kcVar = hcVar;
                        } else if (atomicReferenceArray.get(2) != null) {
                            kcVar = (kc) atomicReferenceArray.get(2);
                            kcVar.getClass();
                        }
                    }
                }
                return (Double) kcVar.get();
            case 18:
                List list19 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(21, 50L, "measurement.experiment.max_ids").get()).longValue());
            case 19:
                List list20 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(23, 27L, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
            case 20:
                List list21 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(19, 500L, "measurement.upload.max_event_parameter_value_length").get()).longValue());
            case 21:
                List list22 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(3, 100L, "measurement.max_bundles_per_iteration").get()).longValue());
            case 22:
                List list23 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(61, 604800000L, "measurement.sdk.attribution.cache.ttl").get();
            case 23:
                List list24 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (Long) com.google.android.gms.internal.measurement.h3.f2364a.g(62, 7200000L, "measurement.redaction.app_instance_id.ttl").get();
            case 24:
                List list25 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(67, 100L, "measurement.upload.max_bundles").get()).longValue());
            case 25:
                List list26 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(26, 7L, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case 26:
                List list27 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.f2364a.g(18, 1L, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue());
            case 27:
                List list28 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(60, "measurement.rb.attribution.uri_scheme", "https").get();
            case 28:
                List list29 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
            default:
                List list30 = e0.f8605a;
                com.google.android.gms.internal.measurement.g3.f2322e.get();
                return (String) com.google.android.gms.internal.measurement.h3.f2364a.i(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
        }
    }
}
