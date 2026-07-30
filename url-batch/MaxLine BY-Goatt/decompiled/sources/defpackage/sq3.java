package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sq3 {
    public static final tl3 a;
    public static final tl3 b;

    static {
        pf2 pf2Var = new pf2(rl3.a(), true, true);
        pf2Var.b("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        pf2Var.b("measurement.set_default_event_parameters_with_backfill.service", true);
        pf2Var.a(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        a = pf2Var.b("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = pf2Var.b("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        pf2Var.b("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
