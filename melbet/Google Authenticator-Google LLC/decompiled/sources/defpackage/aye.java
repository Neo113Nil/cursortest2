package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aye implements axu {
    public final ajf a = new ayd();
    private final ajw b;

    public aye(ajw ajwVar) {
        this.b = ajwVar;
    }

    @Override // defpackage.axu
    public final void A(String str) {
        str.getClass();
        ((Number) abf.e(this.b, false, true, new aya(str, 1, (byte[]) null))).intValue();
    }

    @Override // defpackage.axu
    public final void B(atb atbVar, String str) {
        atbVar.getClass();
        str.getClass();
        ((Number) abf.e(this.b, false, true, new ayb(atbVar, str, 0))).intValue();
    }

    @Override // defpackage.axu
    public final int a() {
        return ((Number) abf.e(this.b, true, false, new ajq(8, (short[]) null))).intValue();
    }

    @Override // defpackage.axu
    public final atb b(String str) {
        str.getClass();
        return (atb) abf.e(this.b, true, false, new aya(str, 3, (short[]) null));
    }

    @Override // defpackage.axu
    public final axt c(final String str) {
        str.getClass();
        return (axt) abf.e(this.b, true, false, new krt() { // from class: axy
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE id=?";

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r35v0, types: [axt] */
            @Override // defpackage.krt
            public final Object a(Object obj) {
                ana anaVar = (ana) obj;
                anaVar.getClass();
                amh a = anaVar.a(this.a);
                try {
                    a.i(1, str);
                    int d = afg.d(a, "id");
                    int d2 = afg.d(a, "state");
                    int d3 = afg.d(a, "worker_class_name");
                    int d4 = afg.d(a, "input_merger_class_name");
                    int d5 = afg.d(a, "input");
                    int d6 = afg.d(a, "output");
                    int d7 = afg.d(a, "initial_delay");
                    int d8 = afg.d(a, "interval_duration");
                    int d9 = afg.d(a, "flex_duration");
                    int d10 = afg.d(a, "run_attempt_count");
                    int d11 = afg.d(a, "backoff_policy");
                    int d12 = afg.d(a, "backoff_delay_duration");
                    int d13 = afg.d(a, "last_enqueue_time");
                    int d14 = afg.d(a, "minimum_retention_duration");
                    int d15 = afg.d(a, "schedule_requested_at");
                    int d16 = afg.d(a, "run_in_foreground");
                    int d17 = afg.d(a, "out_of_quota_policy");
                    int d18 = afg.d(a, "period_count");
                    int d19 = afg.d(a, "generation");
                    int d20 = afg.d(a, "next_schedule_time_override");
                    int d21 = afg.d(a, "next_schedule_time_override_generation");
                    int d22 = afg.d(a, "stop_reason");
                    int d23 = afg.d(a, "trace_tag");
                    int d24 = afg.d(a, "backoff_on_system_interruptions");
                    int d25 = afg.d(a, "required_network_type");
                    int d26 = afg.d(a, "required_network_request");
                    int d27 = afg.d(a, "requires_charging");
                    int d28 = afg.d(a, "requires_device_idle");
                    int d29 = afg.d(a, "requires_battery_not_low");
                    int d30 = afg.d(a, "requires_storage_not_low");
                    int d31 = afg.d(a, "trigger_content_update_delay");
                    int d32 = afg.d(a, "trigger_max_content_delay");
                    int d33 = afg.d(a, "content_uri_triggers");
                    Boolean bool = null;
                    if (a.l()) {
                        String d34 = a.d(d);
                        atb l = abf.l((int) a.b(d2));
                        String d35 = a.d(d3);
                        String d36 = a.d(d4);
                        byte[] m = a.m(d5);
                        asa asaVar = asa.a;
                        asa h = yn.h(m);
                        asa h2 = yn.h(a.m(d6));
                        long b = a.b(d7);
                        long b2 = a.b(d8);
                        long b3 = a.b(d9);
                        int b4 = (int) a.b(d10);
                        art k = abf.k((int) a.b(d11));
                        long b5 = a.b(d12);
                        long b6 = a.b(d13);
                        long b7 = a.b(d14);
                        long b8 = a.b(d15);
                        boolean z = ((int) a.b(d16)) != 0;
                        int t = abf.t((int) a.b(d17));
                        int b9 = (int) a.b(d18);
                        int b10 = (int) a.b(d19);
                        long b11 = a.b(d20);
                        int b12 = (int) a.b(d21);
                        int b13 = (int) a.b(d22);
                        String d37 = a.k(d23) ? null : a.d(d23);
                        Integer valueOf = a.k(d24) ? null : Integer.valueOf((int) a.b(d24));
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        bool = new axt(d34, l, d35, d36, h, h2, b, b2, b3, new ary(abf.m(a.m(d26)), abf.s((int) a.b(d25)), ((int) a.b(d27)) != 0, ((int) a.b(d28)) != 0, ((int) a.b(d29)) != 0, ((int) a.b(d30)) != 0, a.b(d31), a.b(d32), abf.n(a.m(d33))), b4, k, b5, b6, b7, b8, z, t, b9, b10, b11, b12, b13, d37, bool);
                    }
                    return bool;
                } finally {
                    a.close();
                }
            }
        });
    }

    @Override // defpackage.axu
    public final List d(final int i) {
        return (List) abf.e(this.b, true, false, new krt() { // from class: axz
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";

            @Override // defpackage.krt
            public final Object a(Object obj) {
                int i2;
                Integer valueOf;
                ana anaVar = (ana) obj;
                anaVar.getClass();
                amh a = anaVar.a(this.a);
                try {
                    a.g(1, i);
                    int d = afg.d(a, "id");
                    int d2 = afg.d(a, "state");
                    int d3 = afg.d(a, "worker_class_name");
                    int d4 = afg.d(a, "input_merger_class_name");
                    int d5 = afg.d(a, "input");
                    int d6 = afg.d(a, "output");
                    int d7 = afg.d(a, "initial_delay");
                    int d8 = afg.d(a, "interval_duration");
                    int d9 = afg.d(a, "flex_duration");
                    int d10 = afg.d(a, "run_attempt_count");
                    int d11 = afg.d(a, "backoff_policy");
                    int d12 = afg.d(a, "backoff_delay_duration");
                    int d13 = afg.d(a, "last_enqueue_time");
                    int d14 = afg.d(a, "minimum_retention_duration");
                    int d15 = afg.d(a, "schedule_requested_at");
                    int d16 = afg.d(a, "run_in_foreground");
                    int d17 = afg.d(a, "out_of_quota_policy");
                    int d18 = afg.d(a, "period_count");
                    int d19 = afg.d(a, "generation");
                    int d20 = afg.d(a, "next_schedule_time_override");
                    int d21 = afg.d(a, "next_schedule_time_override_generation");
                    int d22 = afg.d(a, "stop_reason");
                    int d23 = afg.d(a, "trace_tag");
                    int d24 = afg.d(a, "backoff_on_system_interruptions");
                    int d25 = afg.d(a, "required_network_type");
                    int d26 = afg.d(a, "required_network_request");
                    int d27 = afg.d(a, "requires_charging");
                    int d28 = afg.d(a, "requires_device_idle");
                    int d29 = afg.d(a, "requires_battery_not_low");
                    int d30 = afg.d(a, "requires_storage_not_low");
                    int d31 = afg.d(a, "trigger_content_update_delay");
                    int d32 = afg.d(a, "trigger_max_content_delay");
                    int d33 = afg.d(a, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (a.l()) {
                        String d34 = a.d(d);
                        int i3 = d13;
                        int i4 = d14;
                        atb l = abf.l((int) a.b(d2));
                        String d35 = a.d(d3);
                        String d36 = a.d(d4);
                        byte[] m = a.m(d5);
                        asa asaVar = asa.a;
                        asa h = yn.h(m);
                        asa h2 = yn.h(a.m(d6));
                        long b = a.b(d7);
                        long b2 = a.b(d8);
                        long b3 = a.b(d9);
                        int b4 = (int) a.b(d10);
                        int i5 = d;
                        int i6 = d2;
                        art k = abf.k((int) a.b(d11));
                        long b5 = a.b(d12);
                        long b6 = a.b(i3);
                        long b7 = a.b(i4);
                        int i7 = d15;
                        long b8 = a.b(i7);
                        d15 = i7;
                        int i8 = d16;
                        int i9 = d3;
                        boolean z = ((int) a.b(i8)) != 0;
                        int i10 = d17;
                        int i11 = d4;
                        int t = abf.t((int) a.b(i10));
                        int i12 = d18;
                        int b9 = (int) a.b(i12);
                        int i13 = d19;
                        int b10 = (int) a.b(i13);
                        int i14 = d20;
                        long b11 = a.b(i14);
                        int i15 = d21;
                        int b12 = (int) a.b(i15);
                        d21 = i15;
                        int i16 = d22;
                        int b13 = (int) a.b(i16);
                        int i17 = d23;
                        Boolean bool = null;
                        String d37 = a.k(i17) ? null : a.d(i17);
                        int i18 = d24;
                        if (a.k(i18)) {
                            i2 = i17;
                            d22 = i16;
                            valueOf = null;
                        } else {
                            i2 = i17;
                            d22 = i16;
                            valueOf = Integer.valueOf((int) a.b(i18));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        Boolean bool2 = bool;
                        int i19 = d25;
                        int s = abf.s((int) a.b(i19));
                        int i20 = d26;
                        ayk m2 = abf.m(a.m(i20));
                        int i21 = d27;
                        boolean z2 = ((int) a.b(i21)) != 0;
                        int i22 = d28;
                        boolean z3 = ((int) a.b(i22)) != 0;
                        int i23 = d29;
                        boolean z4 = ((int) a.b(i23)) != 0;
                        d29 = i23;
                        int i24 = d30;
                        int i25 = d31;
                        int i26 = d32;
                        d31 = i25;
                        int i27 = d33;
                        arrayList.add(new axt(d34, l, d35, d36, h, h2, b, b2, b3, new ary(m2, s, z2, z3, z4, ((int) a.b(i24)) != 0, a.b(i25), a.b(i26), abf.n(a.m(i27))), b4, k, b5, b6, b7, b8, z, t, b9, b10, b11, b12, b13, d37, bool2));
                        d28 = i22;
                        d4 = i11;
                        d17 = i10;
                        d18 = i12;
                        d19 = i13;
                        d20 = i14;
                        d23 = i2;
                        d24 = i18;
                        d25 = i19;
                        d26 = i20;
                        d27 = i21;
                        d33 = i27;
                        d32 = i26;
                        d30 = i24;
                        d = i5;
                        d3 = i9;
                        d13 = i3;
                        d14 = i4;
                        d2 = i6;
                        d16 = i8;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    @Override // defpackage.axu
    public final List e() {
        return (List) abf.e(this.b, true, false, new ajq(13, (byte[][]) null));
    }

    @Override // defpackage.axu
    public final List f(String str) {
        return (List) abf.e(this.b, true, false, new aes(str, 20, (boolean[][]) null));
    }

    @Override // defpackage.axu
    public final List g(final long j) {
        return (List) abf.e(this.b, true, false, new krt() { // from class: axx
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";

            @Override // defpackage.krt
            public final Object a(Object obj) {
                int i;
                Integer valueOf;
                ana anaVar = (ana) obj;
                anaVar.getClass();
                amh a = anaVar.a(this.a);
                try {
                    a.g(1, j);
                    int d = afg.d(a, "id");
                    int d2 = afg.d(a, "state");
                    int d3 = afg.d(a, "worker_class_name");
                    int d4 = afg.d(a, "input_merger_class_name");
                    int d5 = afg.d(a, "input");
                    int d6 = afg.d(a, "output");
                    int d7 = afg.d(a, "initial_delay");
                    int d8 = afg.d(a, "interval_duration");
                    int d9 = afg.d(a, "flex_duration");
                    int d10 = afg.d(a, "run_attempt_count");
                    int d11 = afg.d(a, "backoff_policy");
                    int d12 = afg.d(a, "backoff_delay_duration");
                    int d13 = afg.d(a, "last_enqueue_time");
                    int d14 = afg.d(a, "minimum_retention_duration");
                    int d15 = afg.d(a, "schedule_requested_at");
                    int d16 = afg.d(a, "run_in_foreground");
                    int d17 = afg.d(a, "out_of_quota_policy");
                    int d18 = afg.d(a, "period_count");
                    int d19 = afg.d(a, "generation");
                    int d20 = afg.d(a, "next_schedule_time_override");
                    int d21 = afg.d(a, "next_schedule_time_override_generation");
                    int d22 = afg.d(a, "stop_reason");
                    int d23 = afg.d(a, "trace_tag");
                    int d24 = afg.d(a, "backoff_on_system_interruptions");
                    int d25 = afg.d(a, "required_network_type");
                    int d26 = afg.d(a, "required_network_request");
                    int d27 = afg.d(a, "requires_charging");
                    int d28 = afg.d(a, "requires_device_idle");
                    int d29 = afg.d(a, "requires_battery_not_low");
                    int d30 = afg.d(a, "requires_storage_not_low");
                    int d31 = afg.d(a, "trigger_content_update_delay");
                    int d32 = afg.d(a, "trigger_max_content_delay");
                    int d33 = afg.d(a, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (a.l()) {
                        String d34 = a.d(d);
                        int i2 = d13;
                        int i3 = d14;
                        atb l = abf.l((int) a.b(d2));
                        String d35 = a.d(d3);
                        String d36 = a.d(d4);
                        byte[] m = a.m(d5);
                        asa asaVar = asa.a;
                        asa h = yn.h(m);
                        asa h2 = yn.h(a.m(d6));
                        long b = a.b(d7);
                        long b2 = a.b(d8);
                        long b3 = a.b(d9);
                        int b4 = (int) a.b(d10);
                        int i4 = d;
                        int i5 = d2;
                        art k = abf.k((int) a.b(d11));
                        long b5 = a.b(d12);
                        long b6 = a.b(i2);
                        long b7 = a.b(i3);
                        int i6 = d15;
                        long b8 = a.b(i6);
                        d15 = i6;
                        int i7 = d16;
                        int i8 = d3;
                        boolean z = ((int) a.b(i7)) != 0;
                        int i9 = d17;
                        int i10 = d4;
                        int t = abf.t((int) a.b(i9));
                        int i11 = d18;
                        int b9 = (int) a.b(i11);
                        int i12 = d19;
                        int b10 = (int) a.b(i12);
                        int i13 = d20;
                        long b11 = a.b(i13);
                        int i14 = d21;
                        int b12 = (int) a.b(i14);
                        d21 = i14;
                        int i15 = d22;
                        int b13 = (int) a.b(i15);
                        int i16 = d23;
                        Boolean bool = null;
                        String d37 = a.k(i16) ? null : a.d(i16);
                        int i17 = d24;
                        if (a.k(i17)) {
                            i = i16;
                            d22 = i15;
                            valueOf = null;
                        } else {
                            i = i16;
                            d22 = i15;
                            valueOf = Integer.valueOf((int) a.b(i17));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        Boolean bool2 = bool;
                        int i18 = d25;
                        int s = abf.s((int) a.b(i18));
                        int i19 = d26;
                        ayk m2 = abf.m(a.m(i19));
                        int i20 = d27;
                        boolean z2 = ((int) a.b(i20)) != 0;
                        int i21 = d28;
                        boolean z3 = ((int) a.b(i21)) != 0;
                        int i22 = d29;
                        boolean z4 = ((int) a.b(i22)) != 0;
                        d29 = i22;
                        int i23 = d30;
                        int i24 = d31;
                        int i25 = d32;
                        d31 = i24;
                        int i26 = d33;
                        arrayList.add(new axt(d34, l, d35, d36, h, h2, b, b2, b3, new ary(m2, s, z2, z3, z4, ((int) a.b(i23)) != 0, a.b(i24), a.b(i25), abf.n(a.m(i26))), b4, k, b5, b6, b7, b8, z, t, b9, b10, b11, b12, b13, d37, bool2));
                        d28 = i21;
                        d4 = i10;
                        d17 = i9;
                        d18 = i11;
                        d19 = i12;
                        d20 = i13;
                        d23 = i;
                        d24 = i17;
                        d25 = i18;
                        d26 = i19;
                        d27 = i20;
                        d33 = i26;
                        d32 = i25;
                        d30 = i23;
                        d = i4;
                        d3 = i8;
                        d13 = i2;
                        d14 = i3;
                        d2 = i5;
                        d16 = i7;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    @Override // defpackage.axu
    public final List h() {
        return (List) abf.e(this.b, true, false, new ajq(12, (float[]) null));
    }

    @Override // defpackage.axu
    public final List i() {
        return (List) abf.e(this.b, true, false, new ajq(7, (char[]) null));
    }

    @Override // defpackage.axu
    public final List j(String str) {
        return (List) abf.e(this.b, true, false, new aes(str, 17, (char[][]) null));
    }

    @Override // defpackage.axu
    public final List k(String str) {
        return (List) abf.e(this.b, true, false, new aes(str, 16, (byte[][]) null));
    }

    @Override // defpackage.axu
    public final kzq l() {
        ajq ajqVar = new ajq(9, (int[]) null);
        ajw ajwVar = this.b;
        ajk b = ajwVar.b();
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
        strArr.getClass();
        akt aktVar = b.b;
        kqd kqdVar = new kqd();
        for (String str : strArr) {
            Map map = aktVar.b;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                kqdVar.addAll(set);
            } else {
                kqdVar.add(str);
            }
        }
        String[] strArr2 = (String[]) ixd.j(kqdVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Map map2 = aktVar.d;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) map2.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str2)));
            }
            iArr[i] = num.intValue();
        }
        kol kolVar = new kol(strArr2, iArr);
        String[] strArr3 = (String[]) kolVar.a;
        int[] iArr2 = (int[]) kolVar.b;
        strArr3.getClass();
        iArr2.getClass();
        kzj kzjVar = new kzj(new akl(aktVar, iArr2, strArr3, (kqj) null, 0));
        yp ypVar = b.i;
        return new akx(ixj.e(new kni(new kni((krx) new aze(b, (kqj) null, 1), (kzq) kzjVar, 3), new ajj(b, null), 2)), ajwVar, ajqVar);
    }

    @Override // defpackage.axu
    public final void m(String str) {
        abf.e(this.b, false, true, new aes(str, 15, (float[]) null));
    }

    @Override // defpackage.axu
    public final void n(String str) {
        abf.e(this.b, false, true, new aes(str, 19, (int[][]) null));
    }

    @Override // defpackage.axu
    public final void o(axt axtVar) {
        abf.e(this.b, false, true, new aya(this, axtVar, 4));
    }

    @Override // defpackage.axu
    public final void p(String str, int i) {
        abf.e(this.b, false, true, new axv(str, i, 2, (byte[]) null));
    }

    @Override // defpackage.axu
    public final void q(String str, long j) {
        str.getClass();
        abf.e(this.b, false, true, new ayc(j, str, 0));
    }

    @Override // defpackage.axu
    public final void r(String str, asa asaVar) {
        abf.e(this.b, false, true, new ayb(asaVar, str, 1));
    }

    @Override // defpackage.axu
    public final void s(String str, int i) {
        abf.e(this.b, false, true, new axv(i, str, 0));
    }

    @Override // defpackage.axu
    public final void t(axt axtVar) {
        abf.e(this.b, false, true, new ajq(axtVar, 11));
    }

    @Override // defpackage.axu
    public final boolean u(String str) {
        return ((Boolean) abf.e(this.b, true, false, new aya(str, 0))).booleanValue();
    }

    @Override // defpackage.axu
    public final List v() {
        return (List) abf.e(this.b, true, false, new krt() { // from class: axw
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";

            @Override // defpackage.krt
            public final Object a(Object obj) {
                int i;
                Integer valueOf;
                ana anaVar = (ana) obj;
                anaVar.getClass();
                amh a = anaVar.a(this.a);
                try {
                    a.g(1, 200L);
                    int d = afg.d(a, "id");
                    int d2 = afg.d(a, "state");
                    int d3 = afg.d(a, "worker_class_name");
                    int d4 = afg.d(a, "input_merger_class_name");
                    int d5 = afg.d(a, "input");
                    int d6 = afg.d(a, "output");
                    int d7 = afg.d(a, "initial_delay");
                    int d8 = afg.d(a, "interval_duration");
                    int d9 = afg.d(a, "flex_duration");
                    int d10 = afg.d(a, "run_attempt_count");
                    int d11 = afg.d(a, "backoff_policy");
                    int d12 = afg.d(a, "backoff_delay_duration");
                    int d13 = afg.d(a, "last_enqueue_time");
                    int d14 = afg.d(a, "minimum_retention_duration");
                    int d15 = afg.d(a, "schedule_requested_at");
                    int d16 = afg.d(a, "run_in_foreground");
                    int d17 = afg.d(a, "out_of_quota_policy");
                    int d18 = afg.d(a, "period_count");
                    int d19 = afg.d(a, "generation");
                    int d20 = afg.d(a, "next_schedule_time_override");
                    int d21 = afg.d(a, "next_schedule_time_override_generation");
                    int d22 = afg.d(a, "stop_reason");
                    int d23 = afg.d(a, "trace_tag");
                    int d24 = afg.d(a, "backoff_on_system_interruptions");
                    int d25 = afg.d(a, "required_network_type");
                    int d26 = afg.d(a, "required_network_request");
                    int d27 = afg.d(a, "requires_charging");
                    int d28 = afg.d(a, "requires_device_idle");
                    int d29 = afg.d(a, "requires_battery_not_low");
                    int d30 = afg.d(a, "requires_storage_not_low");
                    int d31 = afg.d(a, "trigger_content_update_delay");
                    int d32 = afg.d(a, "trigger_max_content_delay");
                    int d33 = afg.d(a, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (a.l()) {
                        String d34 = a.d(d);
                        int i2 = d13;
                        int i3 = d14;
                        atb l = abf.l((int) a.b(d2));
                        String d35 = a.d(d3);
                        String d36 = a.d(d4);
                        byte[] m = a.m(d5);
                        asa asaVar = asa.a;
                        asa h = yn.h(m);
                        asa h2 = yn.h(a.m(d6));
                        long b = a.b(d7);
                        long b2 = a.b(d8);
                        long b3 = a.b(d9);
                        int b4 = (int) a.b(d10);
                        int i4 = d;
                        int i5 = d2;
                        art k = abf.k((int) a.b(d11));
                        long b5 = a.b(d12);
                        long b6 = a.b(i2);
                        long b7 = a.b(i3);
                        int i6 = d15;
                        long b8 = a.b(i6);
                        d15 = i6;
                        int i7 = d16;
                        int i8 = d3;
                        boolean z = ((int) a.b(i7)) != 0;
                        int i9 = d17;
                        int i10 = d4;
                        int t = abf.t((int) a.b(i9));
                        int i11 = d18;
                        int b9 = (int) a.b(i11);
                        int i12 = d19;
                        int b10 = (int) a.b(i12);
                        int i13 = d20;
                        long b11 = a.b(i13);
                        int i14 = d21;
                        int b12 = (int) a.b(i14);
                        d21 = i14;
                        int i15 = d22;
                        int b13 = (int) a.b(i15);
                        int i16 = d23;
                        Boolean bool = null;
                        String d37 = a.k(i16) ? null : a.d(i16);
                        int i17 = d24;
                        if (a.k(i17)) {
                            i = i16;
                            d22 = i15;
                            valueOf = null;
                        } else {
                            i = i16;
                            d22 = i15;
                            valueOf = Integer.valueOf((int) a.b(i17));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        Boolean bool2 = bool;
                        int i18 = d25;
                        int s = abf.s((int) a.b(i18));
                        int i19 = d26;
                        ayk m2 = abf.m(a.m(i19));
                        int i20 = d27;
                        boolean z2 = ((int) a.b(i20)) != 0;
                        int i21 = d28;
                        boolean z3 = ((int) a.b(i21)) != 0;
                        int i22 = d29;
                        boolean z4 = ((int) a.b(i22)) != 0;
                        d29 = i22;
                        int i23 = d30;
                        int i24 = d31;
                        int i25 = d32;
                        d31 = i24;
                        int i26 = d33;
                        arrayList.add(new axt(d34, l, d35, d36, h, h2, b, b2, b3, new ary(m2, s, z2, z3, z4, ((int) a.b(i23)) != 0, a.b(i24), a.b(i25), abf.n(a.m(i26))), b4, k, b5, b6, b7, b8, z, t, b9, b10, b11, b12, b13, d37, bool2));
                        d28 = i21;
                        d4 = i10;
                        d17 = i9;
                        d18 = i11;
                        d19 = i12;
                        d20 = i13;
                        d23 = i;
                        d24 = i17;
                        d25 = i18;
                        d26 = i19;
                        d27 = i20;
                        d33 = i26;
                        d32 = i25;
                        d30 = i23;
                        d = i4;
                        d3 = i8;
                        d13 = i2;
                        d14 = i3;
                        d2 = i5;
                        d16 = i7;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    @Override // defpackage.axu
    public final void w(String str) {
        ((Number) abf.e(this.b, false, true, new aya(str, 2, (char[]) null))).intValue();
    }

    @Override // defpackage.axu
    public final void x(String str, long j) {
        str.getClass();
        ((Number) abf.e(this.b, false, true, new ayc(j, str, 1, null))).intValue();
    }

    @Override // defpackage.axu
    public final void y() {
        ((Number) abf.e(this.b, false, true, new ajq(10, (boolean[]) null))).intValue();
    }

    @Override // defpackage.axu
    public final void z(String str) {
        ((Number) abf.e(this.b, false, true, new aes(str, 18, (short[][]) null))).intValue();
    }
}
