package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axg implements axe {
    private final ajw a;

    public axg(ajw ajwVar) {
        this.a = ajwVar;
    }

    @Override // defpackage.axe
    public final List a(amp ampVar) {
        akd akdVar;
        ami amiVar = (ami) ampVar;
        Object[] objArr = amiVar.b;
        String str = amiVar.a;
        int length = objArr != null ? objArr.length : 0;
        TreeMap treeMap = akd.a;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(length));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                akdVar = (akd) ceilingEntry.getValue();
                akdVar.f(str, length);
                akdVar.getClass();
            } else {
                akdVar = new akd(length);
                akdVar.f(str, length);
            }
        }
        yj.n(new akc(akdVar), amiVar.b);
        String str2 = akdVar.b;
        if (str2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        final afr afrVar = new afr(str2, new ajq(akdVar, 4));
        final String str3 = (String) afrVar.b;
        return (List) abf.e(this.a, true, false, new krt() { // from class: axf
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, krt] */
            @Override // defpackage.krt
            public final Object a(Object obj) {
                int i;
                int b;
                int i2;
                int i3;
                int b2;
                int i4;
                int i5;
                int b3;
                int i6;
                int i7;
                int i8;
                boolean z;
                int i9;
                int i10;
                int i11;
                boolean z2;
                int i12;
                int i13;
                int i14;
                boolean z3;
                int i15;
                int i16;
                int i17;
                boolean z4;
                int i18;
                int i19;
                ana anaVar = (ana) obj;
                anaVar.getClass();
                amh a = anaVar.a(str3);
                axg axgVar = this;
                try {
                    afrVar.a.a(a);
                    int e = afn.e(a, "id");
                    int e2 = afn.e(a, "state");
                    int e3 = afn.e(a, "output");
                    int e4 = afn.e(a, "initial_delay");
                    int e5 = afn.e(a, "interval_duration");
                    int e6 = afn.e(a, "flex_duration");
                    int e7 = afn.e(a, "run_attempt_count");
                    int e8 = afn.e(a, "backoff_policy");
                    int e9 = afn.e(a, "backoff_delay_duration");
                    int e10 = afn.e(a, "last_enqueue_time");
                    int e11 = afn.e(a, "period_count");
                    int e12 = afn.e(a, "generation");
                    int e13 = afn.e(a, "next_schedule_time_override");
                    int e14 = afn.e(a, "stop_reason");
                    int e15 = afn.e(a, "worker_class_name");
                    int e16 = afn.e(a, "required_network_type");
                    int e17 = afn.e(a, "required_network_request");
                    int e18 = afn.e(a, "requires_charging");
                    int e19 = afn.e(a, "requires_device_idle");
                    int e20 = afn.e(a, "requires_battery_not_low");
                    int e21 = afn.e(a, "requires_storage_not_low");
                    int e22 = afn.e(a, "trigger_content_update_delay");
                    int e23 = afn.e(a, "trigger_max_content_delay");
                    int e24 = afn.e(a, "content_uri_triggers");
                    qi qiVar = new qi();
                    int i20 = e12;
                    qi qiVar2 = new qi();
                    while (a.l()) {
                        int i21 = e11;
                        String d = a.d(e);
                        if (qiVar.containsKey(d)) {
                            i19 = e10;
                        } else {
                            i19 = e10;
                            qiVar.put(d, new ArrayList());
                        }
                        String d2 = a.d(e);
                        if (!qiVar2.containsKey(d2)) {
                            qiVar2.put(d2, new ArrayList());
                        }
                        e11 = i21;
                        e10 = i19;
                    }
                    int i22 = e10;
                    int i23 = e11;
                    a.j();
                    axgVar.c(anaVar, qiVar);
                    axgVar.b(anaVar, qiVar2);
                    ArrayList arrayList = new ArrayList();
                    while (a.l()) {
                        if (e == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                        }
                        String d3 = a.d(e);
                        if (e2 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                        }
                        atb l = abf.l((int) a.b(e2));
                        if (e3 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                        }
                        byte[] m = a.m(e3);
                        asa asaVar = asa.a;
                        asa h = yn.h(m);
                        long b4 = e4 == -1 ? 0L : a.b(e4);
                        long b5 = e5 == -1 ? 0L : a.b(e5);
                        long b6 = e6 == -1 ? 0L : a.b(e6);
                        int b7 = e7 == -1 ? 0 : (int) a.b(e7);
                        if (e8 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                        }
                        int i24 = e2;
                        art k = abf.k((int) a.b(e8));
                        long b8 = e9 == -1 ? 0L : a.b(e9);
                        int i25 = i22;
                        long b9 = i25 == -1 ? 0L : a.b(i25);
                        i22 = i25;
                        int i26 = i23;
                        if (i26 == -1) {
                            i = e3;
                            b = 0;
                            i2 = -1;
                        } else {
                            i = e3;
                            b = (int) a.b(i26);
                            i2 = -1;
                        }
                        int i27 = i20;
                        if (i27 == i2) {
                            i3 = e4;
                            b2 = 0;
                            i4 = i2;
                        } else {
                            i3 = e4;
                            b2 = (int) a.b(i27);
                            i4 = -1;
                        }
                        int i28 = e13;
                        long b10 = i28 == i4 ? 0L : a.b(i28);
                        int i29 = e14;
                        if (i29 == i4) {
                            i5 = e5;
                            b3 = 0;
                            i6 = i4;
                        } else {
                            i5 = e5;
                            b3 = (int) a.b(i29);
                            i6 = -1;
                        }
                        int i30 = e15;
                        if (i30 == i6) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'worker_class_name', found NULL value instead.");
                        }
                        String d4 = a.d(i30);
                        int i31 = e16;
                        if (i31 == i6) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                        }
                        int i32 = e6;
                        int s = abf.s((int) a.b(i31));
                        int i33 = e17;
                        if (i33 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                        }
                        ayk m2 = abf.m(a.m(i33));
                        int i34 = e18;
                        if (i34 == -1) {
                            i7 = e7;
                            z = false;
                            i9 = -1;
                            i8 = e19;
                        } else {
                            i7 = e7;
                            if (((int) a.b(i34)) != 0) {
                                z = true;
                                i8 = e19;
                            } else {
                                i8 = e19;
                                z = false;
                            }
                            i9 = -1;
                        }
                        if (i8 == i9) {
                            i10 = e8;
                            z2 = false;
                            i12 = i9;
                            i11 = e20;
                        } else {
                            i10 = e8;
                            if (((int) a.b(i8)) != 0) {
                                z2 = true;
                                i11 = e20;
                            } else {
                                i11 = e20;
                                z2 = false;
                            }
                            i12 = -1;
                        }
                        if (i11 == i12) {
                            i13 = e9;
                            z3 = false;
                            i15 = i12;
                            i14 = e21;
                        } else {
                            i13 = e9;
                            if (((int) a.b(i11)) != 0) {
                                z3 = true;
                                i14 = e21;
                            } else {
                                i14 = e21;
                                z3 = false;
                            }
                            i15 = -1;
                        }
                        if (i14 == i15) {
                            i16 = b7;
                            z4 = false;
                            i18 = i15;
                            i17 = e22;
                        } else {
                            i16 = b7;
                            if (((int) a.b(i14)) != 0) {
                                z4 = true;
                                i17 = e22;
                            } else {
                                i17 = e22;
                                z4 = false;
                            }
                            i18 = -1;
                        }
                        long b11 = i17 == i18 ? 0L : a.b(i17);
                        int i35 = e23;
                        long b12 = i35 == i18 ? 0L : a.b(i35);
                        e23 = i35;
                        int i36 = e24;
                        if (i36 == i18) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                        }
                        ary aryVar = new ary(m2, s, z, z2, z3, z4, b11, b12, abf.n(a.m(i36)));
                        Object p = ixd.p(qiVar, a.d(e));
                        p.getClass();
                        List list = (List) p;
                        Object p2 = ixd.p(qiVar2, a.d(e));
                        p2.getClass();
                        arrayList.add(new axs(d3, l, h, b4, b5, b6, aryVar, i16, k, b8, b9, b, b2, b10, b3, list, d4, (List) p2));
                        int i37 = i;
                        i23 = i26;
                        e13 = i28;
                        e3 = i37;
                        e24 = i36;
                        e21 = i14;
                        e22 = i17;
                        e8 = i10;
                        e9 = i13;
                        e19 = i8;
                        e20 = i11;
                        e6 = i32;
                        e7 = i7;
                        e16 = i31;
                        e18 = i34;
                        e17 = i33;
                        e5 = i5;
                        e14 = i29;
                        e15 = i30;
                        e4 = i3;
                        i20 = i27;
                        e2 = i24;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public final void b(ana anaVar, qi qiVar) {
        Set keySet = qiVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (qiVar.d > 999) {
            aei.d(qiVar, new aes(this, anaVar, 8, null));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        ajz.i(sb, keySet.size());
        sb.append(")");
        amh a = anaVar.a(sb.toString());
        Iterator it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            a.i(i, (String) it.next());
            i++;
        }
        try {
            int e = afn.e(a, "work_spec_id");
            if (e != -1) {
                while (a.l()) {
                    List list = (List) qiVar.get(a.d(e));
                    if (list != null) {
                        byte[] m = a.m(0);
                        asa asaVar = asa.a;
                        list.add(yn.h(m));
                    }
                }
            }
        } finally {
            a.close();
        }
    }

    public final void c(ana anaVar, qi qiVar) {
        Set keySet = qiVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (qiVar.d > 999) {
            aei.d(qiVar, new aes(this, anaVar, 9, null));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        ajz.i(sb, keySet.size());
        sb.append(")");
        amh a = anaVar.a(sb.toString());
        Iterator it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            a.i(i, (String) it.next());
            i++;
        }
        try {
            int e = afn.e(a, "work_spec_id");
            if (e != -1) {
                while (a.l()) {
                    List list = (List) qiVar.get(a.d(e));
                    if (list != null) {
                        list.add(a.d(0));
                    }
                }
            }
        } finally {
            a.close();
        }
    }
}
