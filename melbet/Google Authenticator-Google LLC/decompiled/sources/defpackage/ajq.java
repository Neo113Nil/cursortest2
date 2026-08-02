package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ajq implements krt {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajq(int i) {
        this.b = i;
        this.a = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
    }

    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kri] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, krt] */
    @Override // defpackage.krt
    public final Object a(Object obj) {
        boolean z;
        ArrayList arrayList;
        Iterator it;
        int i;
        int i2;
        ata ataVar;
        ata ataVar2;
        long j;
        long j2;
        boolean z2;
        boolean z3;
        String str;
        Class<?> cls;
        Class<?> cls2;
        boolean z4 = true;
        int i3 = 0;
        switch (this.b) {
            case 0:
                amj amjVar = (amj) obj;
                amjVar.getClass();
                ((ajb) this.a).e = amjVar;
                return kow.a;
            case 1:
                return obj == this.a ? "(this)" : String.valueOf(obj);
            case 2:
                ((ana) obj).getClass();
                return this.a.a();
            case 3:
                amh amhVar = (amh) obj;
                amhVar.getClass();
                this.a.a(new ajc(amhVar));
                return kow.a;
            case 4:
                amh amhVar2 = (amh) obj;
                amhVar2.getClass();
                akd akdVar = (akd) this.a;
                int i4 = akdVar.h;
                if (i4 > 0) {
                    int i5 = 1;
                    while (true) {
                        int i6 = akdVar.g[i5];
                        if (i6 == 1) {
                            amhVar2.h(i5);
                        } else if (i6 == 2) {
                            amhVar2.g(i5, akdVar.c[i5]);
                        } else if (i6 == 3) {
                            amhVar2.f(i5, akdVar.d[i5]);
                        } else if (i6 == 4) {
                            String str2 = akdVar.e[i5];
                            if (str2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            amhVar2.i(i5, str2);
                        } else if (i6 == 5) {
                            byte[] bArr = akdVar.f[i5];
                            if (bArr == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            amhVar2.e(i5, bArr);
                        }
                        if (i5 != i4) {
                            i5++;
                        }
                    }
                }
                return kow.a;
            case 5:
                ana anaVar = (ana) obj;
                anaVar.getClass();
                amh a = anaVar.a((String) this.a);
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (a.l()) {
                        arrayList2.add(a.d(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 6:
                ana anaVar2 = (ana) obj;
                anaVar2.getClass();
                amh a2 = anaVar2.a((String) this.a);
                try {
                    a2.l();
                    a2.close();
                    return kow.a;
                } finally {
                }
            case 7:
                return brr.f((String) this.a, (ana) obj);
            case 8:
                ana anaVar3 = (ana) obj;
                anaVar3.getClass();
                amh a3 = anaVar3.a((String) this.a);
                try {
                    int b = a3.l() ? (int) a3.b(0) : 0;
                    a3.close();
                    return Integer.valueOf(b);
                } finally {
                }
            case 9:
                ana anaVar4 = (ana) obj;
                anaVar4.getClass();
                amh a4 = anaVar4.a((String) this.a);
                try {
                    if (a4.l()) {
                        if (((int) a4.b(0)) != 0) {
                            z = true;
                            a4.close();
                            return Boolean.valueOf(z);
                        }
                    }
                    z = false;
                    a4.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 10:
                ana anaVar5 = (ana) obj;
                anaVar5.getClass();
                amh a5 = anaVar5.a((String) this.a);
                try {
                    a5.l();
                    int e = afg.e(anaVar5);
                    a5.close();
                    return Integer.valueOf(e);
                } finally {
                }
            case 11:
                ana anaVar6 = (ana) obj;
                anaVar6.getClass();
                Object obj2 = this.a;
                amh a6 = anaVar6.a("UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?");
                try {
                    String str3 = ((axt) obj2).b;
                    a6.i(1, str3);
                    a6.g(2, abf.j(((axt) obj2).c));
                    a6.i(3, ((axt) obj2).d);
                    a6.i(4, ((axt) obj2).e);
                    asa asaVar = asa.a;
                    a6.e(5, yn.i(((axt) obj2).f));
                    a6.e(6, yn.i(((axt) obj2).g));
                    a6.g(7, ((axt) obj2).h);
                    a6.g(8, ((axt) obj2).i);
                    a6.g(9, ((axt) obj2).j);
                    a6.g(10, ((axt) obj2).l);
                    a6.g(11, abf.i(((axt) obj2).m));
                    a6.g(12, ((axt) obj2).n);
                    a6.g(13, ((axt) obj2).o);
                    a6.g(14, ((axt) obj2).p);
                    a6.g(15, ((axt) obj2).q);
                    a6.g(16, ((axt) obj2).r ? 1L : 0L);
                    a6.g(17, abf.r(((axt) obj2).z));
                    a6.g(18, ((axt) obj2).s);
                    a6.g(19, ((axt) obj2).t);
                    a6.g(20, ((axt) obj2).u);
                    a6.g(21, ((axt) obj2).v);
                    a6.g(22, ((axt) obj2).w);
                    String str4 = ((axt) obj2).x;
                    if (str4 == null) {
                        a6.h(23);
                    } else {
                        a6.i(23, str4);
                    }
                    Boolean bool = ((axt) obj2).y;
                    if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                        a6.h(24);
                    } else {
                        a6.g(24, r3.intValue());
                    }
                    ary aryVar = ((axt) obj2).k;
                    a6.g(25, abf.q(aryVar.j));
                    a6.e(26, abf.o(aryVar.b));
                    a6.g(27, aryVar.c ? 1L : 0L);
                    a6.g(28, aryVar.d ? 1L : 0L);
                    a6.g(29, aryVar.e ? 1L : 0L);
                    a6.g(30, aryVar.f ? 1L : 0L);
                    a6.g(31, aryVar.g);
                    a6.g(32, aryVar.h);
                    a6.e(33, abf.p(aryVar.i));
                    a6.i(34, str3);
                    a6.l();
                    ixf.i(a6, null);
                    afg.e(anaVar6);
                    return kow.a;
                } finally {
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return brr.f((String) this.a, (ana) obj);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return brr.f((String) this.a, (ana) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                workDatabase.getClass();
                String str5 = axt.a;
                axe y = workDatabase.y();
                ArrayList arrayList3 = new ArrayList();
                StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
                ?? r0 = ((brn) this.a).a;
                if (!r0.isEmpty()) {
                    sb.append(" WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
                    int size = r0.size();
                    if (size > 0) {
                        ArrayList arrayList4 = new ArrayList(size);
                        for (int i7 = 0; i7 < size; i7++) {
                            arrayList4.add("?");
                        }
                        sb.append(ixc.y(arrayList4, ",", null, null, null, 62));
                    }
                    sb.append("))");
                    arrayList3.addAll(r0);
                }
                sb.append(";");
                List a7 = y.a(new ami(sb.toString(), arrayList3.toArray(new Object[0])));
                if (a7 != null) {
                    ArrayList arrayList5 = new ArrayList(ixc.w(a7));
                    Iterator it2 = a7.iterator();
                    while (it2.hasNext()) {
                        axs axsVar = (axs) it2.next();
                        List list = axsVar.r;
                        asa asaVar2 = !list.isEmpty() ? (asa) list.get(i3) : asa.a;
                        UUID fromString = UUID.fromString(axsVar.a);
                        fromString.getClass();
                        atb atbVar = axsVar.b;
                        HashSet hashSet = new HashSet(axsVar.p);
                        asa asaVar3 = axsVar.c;
                        int i8 = axsVar.h;
                        int i9 = axsVar.m;
                        ary aryVar2 = axsVar.g;
                        long j3 = axsVar.d;
                        boolean z5 = z4;
                        long j4 = axsVar.e;
                        boolean z6 = j4 != 0 ? false : z5;
                        if (j4 != 0) {
                            i = i8;
                            i2 = i9;
                            it = it2;
                            ataVar = new ata(j4, axsVar.f);
                        } else {
                            it = it2;
                            i = i8;
                            i2 = i9;
                            ataVar = null;
                        }
                        atb atbVar2 = atb.a;
                        if (atbVar == atbVar2) {
                            if (atbVar != atbVar2 || i <= 0) {
                                z2 = z6;
                                z3 = false;
                            } else {
                                z2 = z6;
                                z3 = z5;
                            }
                            ataVar2 = ataVar;
                            j2 = aei.l(z3, i, axsVar.i, axsVar.j, axsVar.k, axsVar.l, !z2, j3, axsVar.f, j4, axsVar.n);
                            j = j3;
                        } else {
                            ataVar2 = ataVar;
                            j = j3;
                            j2 = Long.MAX_VALUE;
                        }
                        arrayList5.add(new atc(fromString, atbVar, hashSet, asaVar3, asaVar2, i, i2, aryVar2, j, ataVar2, j2, axsVar.o, axsVar.q));
                        it2 = it;
                        z4 = z5;
                        i3 = 0;
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                arrayList.getClass();
                return arrayList;
            case 15:
                jkj C = ((caf) obj).C();
                if (!C.b.M()) {
                    C.t();
                }
                caf cafVar = (caf) C.b;
                jkx jkxVar = cafVar.b;
                if (!jkxVar.c()) {
                    cafVar.b = jkp.A(jkxVar);
                }
                jiz.f(this.a, cafVar.b);
                return (caf) C.q();
            case 16:
                dfe dfeVar = (dfe) obj;
                dfeVar.getClass();
                dfg dfgVar = dfeVar.c;
                if (dfgVar == null) {
                    dfgVar = dfg.a;
                }
                jkj C2 = dfgVar.C();
                if (!C2.b.M()) {
                    C2.t();
                }
                Object obj3 = this.a;
                dfg dfgVar2 = (dfg) C2.b;
                dfgVar2.d = ((dff) obj3).f;
                dfgVar2.b |= 2;
                jkp q = C2.q();
                q.getClass();
                dfg dfgVar3 = (dfg) q;
                jkj C3 = dfeVar.C();
                if (!C3.b.M()) {
                    C3.t();
                }
                dfe dfeVar2 = (dfe) C3.b;
                dfeVar2.c = dfgVar3;
                dfeVar2.b |= 1;
                return (dfe) C3.q();
            case 17:
                eff effVar = (eff) obj;
                effVar.getClass();
                effVar.b++;
                bd bdVar = (bd) this.a;
                bd bdVar2 = bdVar.F;
                if (bdVar2 == null || (cls2 = bdVar2.getClass()) == null || (str = cls2.getName()) == null) {
                    bg D = bdVar.D();
                    String name = (D == null || (cls = D.getClass()) == null) ? null : cls.getName();
                    str = name == null ? "Unknown" : name;
                }
                effVar.a = str;
                return kow.a;
            case 18:
                krt krtVar = (krt) obj;
                krtVar.getClass();
                krtVar.a(this.a);
                return kow.a;
            case 19:
                eb ebVar = (eb) obj;
                ebVar.getClass();
                if (ebVar.R != null) {
                    Object obj4 = ((gjl) this.a).h;
                }
                return kow.a;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                Object b2 = ((duq) this.a).a.b();
                b2.getClass();
                return ((Context) b2).getString(num.intValue());
        }
    }

    public /* synthetic */ ajq(int i, byte[] bArr) {
        this.b = i;
        this.a = "DELETE FROM WorkProgress";
    }

    public /* synthetic */ ajq(int i, char[] cArr) {
        this.b = i;
        this.a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
    }

    public /* synthetic */ ajq(int i, float[] fArr) {
        this.b = i;
        this.a = "SELECT * FROM workspec WHERE state=1";
    }

    public /* synthetic */ ajq(int i, int[] iArr) {
        this.b = i;
        this.a = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
    }

    public /* synthetic */ ajq(int i, short[] sArr) {
        this.b = i;
        this.a = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
    }

    public /* synthetic */ ajq(int i, boolean[] zArr) {
        this.b = i;
        this.a = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }

    public /* synthetic */ ajq(int i, byte[][] bArr) {
        this.b = i;
        this.a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
    }

    public /* synthetic */ ajq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
