package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class er3 {
    public static final tl3 a;
    public static final tl3 b;
    public static final tl3 c;

    static {
        pf2 pf2Var = new pf2(rl3.a(), true, true);
        pf2Var.b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = pf2Var.b("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = pf2Var.b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = pf2Var.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
