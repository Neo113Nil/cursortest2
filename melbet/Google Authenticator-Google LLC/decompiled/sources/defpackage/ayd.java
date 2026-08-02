package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayd extends ajf {
    @Override // defpackage.ajf
    protected final String a() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.ajf
    public final /* bridge */ /* synthetic */ void b(amh amhVar, Object obj) {
        axt axtVar = (axt) obj;
        amhVar.i(1, axtVar.b);
        amhVar.g(2, abf.j(axtVar.c));
        amhVar.i(3, axtVar.d);
        amhVar.i(4, axtVar.e);
        asa asaVar = asa.a;
        amhVar.e(5, yn.i(axtVar.f));
        amhVar.e(6, yn.i(axtVar.g));
        amhVar.g(7, axtVar.h);
        amhVar.g(8, axtVar.i);
        amhVar.g(9, axtVar.j);
        amhVar.g(10, axtVar.l);
        amhVar.g(11, abf.i(axtVar.m));
        amhVar.g(12, axtVar.n);
        amhVar.g(13, axtVar.o);
        amhVar.g(14, axtVar.p);
        amhVar.g(15, axtVar.q);
        amhVar.g(16, axtVar.r ? 1L : 0L);
        amhVar.g(17, abf.r(axtVar.z));
        amhVar.g(18, axtVar.s);
        amhVar.g(19, axtVar.t);
        amhVar.g(20, axtVar.u);
        amhVar.g(21, axtVar.v);
        amhVar.g(22, axtVar.w);
        String str = axtVar.x;
        if (str == null) {
            amhVar.h(23);
        } else {
            amhVar.i(23, str);
        }
        Boolean bool = axtVar.y;
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            amhVar.h(24);
        } else {
            amhVar.g(24, r3.intValue());
        }
        ary aryVar = axtVar.k;
        amhVar.g(25, abf.q(aryVar.j));
        amhVar.e(26, abf.o(aryVar.b));
        amhVar.g(27, aryVar.c ? 1L : 0L);
        amhVar.g(28, aryVar.d ? 1L : 0L);
        amhVar.g(29, aryVar.e ? 1L : 0L);
        amhVar.g(30, aryVar.f ? 1L : 0L);
        amhVar.g(31, aryVar.g);
        amhVar.g(32, aryVar.h);
        amhVar.e(33, abf.p(aryVar.i));
    }
}
