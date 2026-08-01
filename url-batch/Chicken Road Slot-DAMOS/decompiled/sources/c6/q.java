package c6;

import android.database.Cursor;
import android.os.Trace;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import n0.a2;
import n0.l0;
import s.i0;
import s.q0;
import z4.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public Object f1857a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1858b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1859c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1860d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1861e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1862f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1863h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1864i;
    public Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f1865k;

    public q(WorkDatabase_Impl workDatabase_Impl) {
        this.f1857a = workDatabase_Impl;
        this.f1858b = new b(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 8);
        this.f1859c = new h(workDatabase_Impl, 9);
        this.f1860d = new h(workDatabase_Impl, 10);
        this.f1861e = new h(workDatabase_Impl, 11);
        this.f1862f = new h(workDatabase_Impl, 12);
        this.g = new h(workDatabase_Impl, 13);
        this.f1863h = new h(workDatabase_Impl, 14);
        this.f1864i = new h(workDatabase_Impl, 15);
        this.j = new h(workDatabase_Impl, 4);
        this.f1865k = new h(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 7);
    }

    public void a() {
        this.f1857a = null;
        this.f1858b = null;
        o0.e eVar = (o0.e) this.f1859c;
        eVar.g();
        ((i0) this.f1860d).b();
        this.f1861e = eVar;
        ((o0.e) this.f1862f).g();
        ((o0.e) this.g).g();
        this.f1863h = null;
        this.f1864i = null;
        this.j = null;
    }

    public void b() {
        Set set = (Set) this.f1857a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a2 a2Var = (a2) it.next();
                it.remove();
                a2Var.c();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void c() {
        o0.e eVar = (o0.e) this.f1859c;
        o0.e eVar2 = (o0.e) this.f1862f;
        Set set = (Set) this.f1857a;
        if (set == null) {
            return;
        }
        this.f1865k = null;
        if (eVar2.f7319i != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                i0 i0Var = (i0) this.f1863h;
                int i3 = eVar2.f7319i;
                while (true) {
                    i3--;
                    if (-1 >= i3) {
                        break;
                    }
                    Object obj = eVar2.f7317d[i3];
                    try {
                        if (obj instanceof l0) {
                            a2 a2Var = ((l0) obj).f6745a;
                            set.remove(a2Var);
                            a2Var.e();
                        }
                        if (obj instanceof n0.i) {
                            if (i0Var == null || !i0Var.c(obj)) {
                                ((n0.i) obj).h();
                            } else {
                                ((n0.i) obj).g();
                            }
                        }
                    } catch (Throwable th) {
                        c1.e eVar3 = (c1.e) this.f1858b;
                        if (eVar3 != null) {
                            g8.b.N(th, new a4.a(1, (c1.f) eVar3, obj));
                        }
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (eVar.f7319i != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.f1857a;
                if (set2 != null) {
                    Object[] objArr = eVar.f7317d;
                    int i10 = eVar.f7319i;
                    for (int i11 = 0; i11 < i10; i11++) {
                        l0 l0Var = (l0) objArr[i11];
                        a2 a2Var2 = l0Var.f6745a;
                        set2.remove(a2Var2);
                        try {
                            a2Var2.b();
                        } catch (Throwable th2) {
                            c1.e eVar4 = (c1.e) this.f1858b;
                            if (eVar4 != null) {
                                g8.b.N(th2, new a4.a(1, (c1.f) eVar4, l0Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void d(l0 l0Var) {
        o0.e eVar = (o0.e) this.f1859c;
        if (!((i0) this.f1860d).c(l0Var)) {
            i0 i0Var = (i0) this.f1865k;
            if (i0Var == null || !i0Var.c(l0Var)) {
                ((o0.e) this.f1862f).b(l0Var);
                return;
            }
            return;
        }
        ((i0) this.f1860d).k(l0Var);
        if (!((o0.e) this.f1861e).k(l0Var) && !eVar.k(l0Var)) {
            Object[] objArr = eVar.f7317d;
            int i3 = eVar.f7319i;
            for (int i10 = 0; i10 < i3; i10++) {
                if (((l0) objArr[i10]).f6745a instanceof x0.f) {
                    throw null;
                }
            }
        }
        Set set = (Set) this.f1857a;
        if (set == null) {
            return;
        }
        set.add(l0Var.f6745a);
    }

    public ArrayList e() {
        z zVar;
        z a9 = z.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        a9.f(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1857a;
        workDatabase_Impl.b();
        Cursor E = cf.c.E(workDatabase_Impl, a9);
        try {
            int F = f.F(E, "id");
            int F2 = f.F(E, "state");
            int F3 = f.F(E, "worker_class_name");
            int F4 = f.F(E, "input_merger_class_name");
            int F5 = f.F(E, "input");
            int F6 = f.F(E, "output");
            int F7 = f.F(E, "initial_delay");
            int F8 = f.F(E, "interval_duration");
            int F9 = f.F(E, "flex_duration");
            int F10 = f.F(E, "run_attempt_count");
            int F11 = f.F(E, "backoff_policy");
            int F12 = f.F(E, "backoff_delay_duration");
            int F13 = f.F(E, "last_enqueue_time");
            zVar = a9;
            try {
                int F14 = f.F(E, "minimum_retention_duration");
                int F15 = f.F(E, "schedule_requested_at");
                int F16 = f.F(E, "run_in_foreground");
                int F17 = f.F(E, "out_of_quota_policy");
                int F18 = f.F(E, "period_count");
                int F19 = f.F(E, "generation");
                int F20 = f.F(E, "required_network_type");
                int F21 = f.F(E, "requires_charging");
                int F22 = f.F(E, "requires_device_idle");
                int F23 = f.F(E, "requires_battery_not_low");
                int F24 = f.F(E, "requires_storage_not_low");
                int F25 = f.F(E, "trigger_content_update_delay");
                int F26 = f.F(E, "trigger_max_content_delay");
                int F27 = f.F(E, "content_uri_triggers");
                int i3 = F14;
                ArrayList arrayList = new ArrayList(E.getCount());
                while (E.moveToNext()) {
                    byte[] bArr = null;
                    String string = E.isNull(F) ? null : E.getString(F);
                    int U = i7.a.U(E.getInt(F2));
                    String string2 = E.isNull(F3) ? null : E.getString(F3);
                    String string3 = E.isNull(F4) ? null : E.getString(F4);
                    t5.e a10 = t5.e.a(E.isNull(F5) ? null : E.getBlob(F5));
                    t5.e a11 = t5.e.a(E.isNull(F6) ? null : E.getBlob(F6));
                    long j = E.getLong(F7);
                    long j3 = E.getLong(F8);
                    long j10 = E.getLong(F9);
                    int i10 = E.getInt(F10);
                    int R = i7.a.R(E.getInt(F11));
                    long j11 = E.getLong(F12);
                    long j12 = E.getLong(F13);
                    int i11 = i3;
                    long j13 = E.getLong(i11);
                    int i12 = F13;
                    int i13 = F15;
                    long j14 = E.getLong(i13);
                    F15 = i13;
                    int i14 = F16;
                    boolean z10 = E.getInt(i14) != 0;
                    F16 = i14;
                    int i15 = F17;
                    int T = i7.a.T(E.getInt(i15));
                    F17 = i15;
                    int i16 = F18;
                    int i17 = E.getInt(i16);
                    F18 = i16;
                    int i18 = F19;
                    int i19 = E.getInt(i18);
                    F19 = i18;
                    int i20 = F20;
                    int S = i7.a.S(E.getInt(i20));
                    F20 = i20;
                    int i21 = F21;
                    boolean z11 = E.getInt(i21) != 0;
                    F21 = i21;
                    int i22 = F22;
                    boolean z12 = E.getInt(i22) != 0;
                    F22 = i22;
                    int i23 = F23;
                    boolean z13 = E.getInt(i23) != 0;
                    F23 = i23;
                    int i24 = F24;
                    boolean z14 = E.getInt(i24) != 0;
                    F24 = i24;
                    int i25 = F25;
                    long j15 = E.getLong(i25);
                    F25 = i25;
                    int i26 = F26;
                    long j16 = E.getLong(i26);
                    F26 = i26;
                    int i27 = F27;
                    if (!E.isNull(i27)) {
                        bArr = E.getBlob(i27);
                    }
                    F27 = i27;
                    arrayList.add(new p(string, U, string2, string3, a10, a11, j, j3, j10, new t5.d(S, z11, z12, z13, z14, j15, j16, i7.a.o(bArr)), i10, R, j11, j12, j13, j14, z10, T, i17, i19));
                    F13 = i12;
                    i3 = i11;
                }
                E.close();
                zVar.d();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                E.close();
                zVar.d();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = a9;
        }
    }

    public ArrayList f(int i3) {
        z zVar;
        z a9 = z.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a9.f(1, i3);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1857a;
        workDatabase_Impl.b();
        Cursor E = cf.c.E(workDatabase_Impl, a9);
        try {
            int F = f.F(E, "id");
            int F2 = f.F(E, "state");
            int F3 = f.F(E, "worker_class_name");
            int F4 = f.F(E, "input_merger_class_name");
            int F5 = f.F(E, "input");
            int F6 = f.F(E, "output");
            int F7 = f.F(E, "initial_delay");
            int F8 = f.F(E, "interval_duration");
            int F9 = f.F(E, "flex_duration");
            int F10 = f.F(E, "run_attempt_count");
            int F11 = f.F(E, "backoff_policy");
            int F12 = f.F(E, "backoff_delay_duration");
            int F13 = f.F(E, "last_enqueue_time");
            zVar = a9;
            try {
                int F14 = f.F(E, "minimum_retention_duration");
                int F15 = f.F(E, "schedule_requested_at");
                int F16 = f.F(E, "run_in_foreground");
                int F17 = f.F(E, "out_of_quota_policy");
                int F18 = f.F(E, "period_count");
                int F19 = f.F(E, "generation");
                int F20 = f.F(E, "required_network_type");
                int F21 = f.F(E, "requires_charging");
                int F22 = f.F(E, "requires_device_idle");
                int F23 = f.F(E, "requires_battery_not_low");
                int F24 = f.F(E, "requires_storage_not_low");
                int F25 = f.F(E, "trigger_content_update_delay");
                int F26 = f.F(E, "trigger_max_content_delay");
                int F27 = f.F(E, "content_uri_triggers");
                int i10 = F14;
                ArrayList arrayList = new ArrayList(E.getCount());
                while (E.moveToNext()) {
                    byte[] bArr = null;
                    String string = E.isNull(F) ? null : E.getString(F);
                    int U = i7.a.U(E.getInt(F2));
                    String string2 = E.isNull(F3) ? null : E.getString(F3);
                    String string3 = E.isNull(F4) ? null : E.getString(F4);
                    t5.e a10 = t5.e.a(E.isNull(F5) ? null : E.getBlob(F5));
                    t5.e a11 = t5.e.a(E.isNull(F6) ? null : E.getBlob(F6));
                    long j = E.getLong(F7);
                    long j3 = E.getLong(F8);
                    long j10 = E.getLong(F9);
                    int i11 = E.getInt(F10);
                    int R = i7.a.R(E.getInt(F11));
                    long j11 = E.getLong(F12);
                    long j12 = E.getLong(F13);
                    int i12 = i10;
                    long j13 = E.getLong(i12);
                    int i13 = F13;
                    int i14 = F15;
                    long j14 = E.getLong(i14);
                    F15 = i14;
                    int i15 = F16;
                    boolean z10 = E.getInt(i15) != 0;
                    F16 = i15;
                    int i16 = F17;
                    int T = i7.a.T(E.getInt(i16));
                    F17 = i16;
                    int i17 = F18;
                    int i18 = E.getInt(i17);
                    F18 = i17;
                    int i19 = F19;
                    int i20 = E.getInt(i19);
                    F19 = i19;
                    int i21 = F20;
                    int S = i7.a.S(E.getInt(i21));
                    F20 = i21;
                    int i22 = F21;
                    boolean z11 = E.getInt(i22) != 0;
                    F21 = i22;
                    int i23 = F22;
                    boolean z12 = E.getInt(i23) != 0;
                    F22 = i23;
                    int i24 = F23;
                    boolean z13 = E.getInt(i24) != 0;
                    F23 = i24;
                    int i25 = F24;
                    boolean z14 = E.getInt(i25) != 0;
                    F24 = i25;
                    int i26 = F25;
                    long j15 = E.getLong(i26);
                    F25 = i26;
                    int i27 = F26;
                    long j16 = E.getLong(i27);
                    F26 = i27;
                    int i28 = F27;
                    if (!E.isNull(i28)) {
                        bArr = E.getBlob(i28);
                    }
                    F27 = i28;
                    arrayList.add(new p(string, U, string2, string3, a10, a11, j, j3, j10, new t5.d(S, z11, z12, z13, z14, j15, j16, i7.a.o(bArr)), i11, R, j11, j12, j13, j14, z10, T, i18, i20));
                    F13 = i13;
                    i10 = i12;
                }
                E.close();
                zVar.d();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                E.close();
                zVar.d();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = a9;
        }
    }

    public ArrayList g() {
        z zVar;
        z a9 = z.a(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1857a;
        workDatabase_Impl.b();
        Cursor E = cf.c.E(workDatabase_Impl, a9);
        try {
            int F = f.F(E, "id");
            int F2 = f.F(E, "state");
            int F3 = f.F(E, "worker_class_name");
            int F4 = f.F(E, "input_merger_class_name");
            int F5 = f.F(E, "input");
            int F6 = f.F(E, "output");
            int F7 = f.F(E, "initial_delay");
            int F8 = f.F(E, "interval_duration");
            int F9 = f.F(E, "flex_duration");
            int F10 = f.F(E, "run_attempt_count");
            int F11 = f.F(E, "backoff_policy");
            int F12 = f.F(E, "backoff_delay_duration");
            int F13 = f.F(E, "last_enqueue_time");
            zVar = a9;
            try {
                int F14 = f.F(E, "minimum_retention_duration");
                int F15 = f.F(E, "schedule_requested_at");
                int F16 = f.F(E, "run_in_foreground");
                int F17 = f.F(E, "out_of_quota_policy");
                int F18 = f.F(E, "period_count");
                int F19 = f.F(E, "generation");
                int F20 = f.F(E, "required_network_type");
                int F21 = f.F(E, "requires_charging");
                int F22 = f.F(E, "requires_device_idle");
                int F23 = f.F(E, "requires_battery_not_low");
                int F24 = f.F(E, "requires_storage_not_low");
                int F25 = f.F(E, "trigger_content_update_delay");
                int F26 = f.F(E, "trigger_max_content_delay");
                int F27 = f.F(E, "content_uri_triggers");
                int i3 = F14;
                ArrayList arrayList = new ArrayList(E.getCount());
                while (E.moveToNext()) {
                    byte[] bArr = null;
                    String string = E.isNull(F) ? null : E.getString(F);
                    int U = i7.a.U(E.getInt(F2));
                    String string2 = E.isNull(F3) ? null : E.getString(F3);
                    String string3 = E.isNull(F4) ? null : E.getString(F4);
                    t5.e a10 = t5.e.a(E.isNull(F5) ? null : E.getBlob(F5));
                    t5.e a11 = t5.e.a(E.isNull(F6) ? null : E.getBlob(F6));
                    long j = E.getLong(F7);
                    long j3 = E.getLong(F8);
                    long j10 = E.getLong(F9);
                    int i10 = E.getInt(F10);
                    int R = i7.a.R(E.getInt(F11));
                    long j11 = E.getLong(F12);
                    long j12 = E.getLong(F13);
                    int i11 = i3;
                    long j13 = E.getLong(i11);
                    int i12 = F13;
                    int i13 = F15;
                    long j14 = E.getLong(i13);
                    F15 = i13;
                    int i14 = F16;
                    boolean z10 = E.getInt(i14) != 0;
                    F16 = i14;
                    int i15 = F17;
                    int T = i7.a.T(E.getInt(i15));
                    F17 = i15;
                    int i16 = F18;
                    int i17 = E.getInt(i16);
                    F18 = i16;
                    int i18 = F19;
                    int i19 = E.getInt(i18);
                    F19 = i18;
                    int i20 = F20;
                    int S = i7.a.S(E.getInt(i20));
                    F20 = i20;
                    int i21 = F21;
                    boolean z11 = E.getInt(i21) != 0;
                    F21 = i21;
                    int i22 = F22;
                    boolean z12 = E.getInt(i22) != 0;
                    F22 = i22;
                    int i23 = F23;
                    boolean z13 = E.getInt(i23) != 0;
                    F23 = i23;
                    int i24 = F24;
                    boolean z14 = E.getInt(i24) != 0;
                    F24 = i24;
                    int i25 = F25;
                    long j15 = E.getLong(i25);
                    F25 = i25;
                    int i26 = F26;
                    long j16 = E.getLong(i26);
                    F26 = i26;
                    int i27 = F27;
                    if (!E.isNull(i27)) {
                        bArr = E.getBlob(i27);
                    }
                    F27 = i27;
                    arrayList.add(new p(string, U, string2, string3, a10, a11, j, j3, j10, new t5.d(S, z11, z12, z13, z14, j15, j16, i7.a.o(bArr)), i10, R, j11, j12, j13, j14, z10, T, i17, i19));
                    F13 = i12;
                    i3 = i11;
                }
                E.close();
                zVar.d();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                E.close();
                zVar.d();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = a9;
        }
    }

    public ArrayList h() {
        z zVar;
        z a9 = z.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1857a;
        workDatabase_Impl.b();
        Cursor E = cf.c.E(workDatabase_Impl, a9);
        try {
            int F = f.F(E, "id");
            int F2 = f.F(E, "state");
            int F3 = f.F(E, "worker_class_name");
            int F4 = f.F(E, "input_merger_class_name");
            int F5 = f.F(E, "input");
            int F6 = f.F(E, "output");
            int F7 = f.F(E, "initial_delay");
            int F8 = f.F(E, "interval_duration");
            int F9 = f.F(E, "flex_duration");
            int F10 = f.F(E, "run_attempt_count");
            int F11 = f.F(E, "backoff_policy");
            int F12 = f.F(E, "backoff_delay_duration");
            int F13 = f.F(E, "last_enqueue_time");
            zVar = a9;
            try {
                int F14 = f.F(E, "minimum_retention_duration");
                int F15 = f.F(E, "schedule_requested_at");
                int F16 = f.F(E, "run_in_foreground");
                int F17 = f.F(E, "out_of_quota_policy");
                int F18 = f.F(E, "period_count");
                int F19 = f.F(E, "generation");
                int F20 = f.F(E, "required_network_type");
                int F21 = f.F(E, "requires_charging");
                int F22 = f.F(E, "requires_device_idle");
                int F23 = f.F(E, "requires_battery_not_low");
                int F24 = f.F(E, "requires_storage_not_low");
                int F25 = f.F(E, "trigger_content_update_delay");
                int F26 = f.F(E, "trigger_max_content_delay");
                int F27 = f.F(E, "content_uri_triggers");
                int i3 = F14;
                ArrayList arrayList = new ArrayList(E.getCount());
                while (E.moveToNext()) {
                    byte[] bArr = null;
                    String string = E.isNull(F) ? null : E.getString(F);
                    int U = i7.a.U(E.getInt(F2));
                    String string2 = E.isNull(F3) ? null : E.getString(F3);
                    String string3 = E.isNull(F4) ? null : E.getString(F4);
                    t5.e a10 = t5.e.a(E.isNull(F5) ? null : E.getBlob(F5));
                    t5.e a11 = t5.e.a(E.isNull(F6) ? null : E.getBlob(F6));
                    long j = E.getLong(F7);
                    long j3 = E.getLong(F8);
                    long j10 = E.getLong(F9);
                    int i10 = E.getInt(F10);
                    int R = i7.a.R(E.getInt(F11));
                    long j11 = E.getLong(F12);
                    long j12 = E.getLong(F13);
                    int i11 = i3;
                    long j13 = E.getLong(i11);
                    int i12 = F13;
                    int i13 = F15;
                    long j14 = E.getLong(i13);
                    F15 = i13;
                    int i14 = F16;
                    boolean z10 = E.getInt(i14) != 0;
                    F16 = i14;
                    int i15 = F17;
                    int T = i7.a.T(E.getInt(i15));
                    F17 = i15;
                    int i16 = F18;
                    int i17 = E.getInt(i16);
                    F18 = i16;
                    int i18 = F19;
                    int i19 = E.getInt(i18);
                    F19 = i18;
                    int i20 = F20;
                    int S = i7.a.S(E.getInt(i20));
                    F20 = i20;
                    int i21 = F21;
                    boolean z11 = E.getInt(i21) != 0;
                    F21 = i21;
                    int i22 = F22;
                    boolean z12 = E.getInt(i22) != 0;
                    F22 = i22;
                    int i23 = F23;
                    boolean z13 = E.getInt(i23) != 0;
                    F23 = i23;
                    int i24 = F24;
                    boolean z14 = E.getInt(i24) != 0;
                    F24 = i24;
                    int i25 = F25;
                    long j15 = E.getLong(i25);
                    F25 = i25;
                    int i26 = F26;
                    long j16 = E.getLong(i26);
                    F26 = i26;
                    int i27 = F27;
                    if (!E.isNull(i27)) {
                        bArr = E.getBlob(i27);
                    }
                    F27 = i27;
                    arrayList.add(new p(string, U, string2, string3, a10, a11, j, j3, j10, new t5.d(S, z11, z12, z13, z14, j15, j16, i7.a.o(bArr)), i10, R, j11, j12, j13, j14, z10, T, i17, i19));
                    F13 = i12;
                    i3 = i11;
                }
                E.close();
                zVar.d();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                E.close();
                zVar.d();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = a9;
        }
    }

    public int i(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1857a;
        z a9 = z.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a9.r(1);
        } else {
            a9.l(1, str);
        }
        workDatabase_Impl.b();
        Cursor E = cf.c.E(workDatabase_Impl, a9);
        try {
            int i3 = 0;
            if (E.moveToFirst()) {
                Integer valueOf = E.isNull(0) ? null : Integer.valueOf(E.getInt(0));
                if (valueOf != null) {
                    i3 = i7.a.U(valueOf.intValue());
                }
            }
            return i3;
        } finally {
            E.close();
            a9.d();
        }
    }

    public ArrayList j(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1857a;
        z a9 = z.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a9.r(1);
        } else {
            a9.l(1, str);
        }
        workDatabase_Impl.b();
        Cursor E = cf.c.E(workDatabase_Impl, a9);
        try {
            ArrayList arrayList = new ArrayList(E.getCount());
            while (E.moveToNext()) {
                arrayList.add(E.isNull(0) ? null : E.getString(0));
            }
            return arrayList;
        } finally {
            E.close();
            a9.d();
        }
    }

    public p k(String str) {
        z zVar;
        int F;
        int F2;
        int F3;
        int F4;
        int F5;
        int F6;
        int F7;
        int F8;
        int F9;
        int F10;
        int F11;
        int F12;
        int F13;
        int F14;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1857a;
        z a9 = z.a(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            a9.r(1);
        } else {
            a9.l(1, str);
        }
        workDatabase_Impl.b();
        Cursor E = cf.c.E(workDatabase_Impl, a9);
        try {
            F = f.F(E, "id");
            F2 = f.F(E, "state");
            F3 = f.F(E, "worker_class_name");
            F4 = f.F(E, "input_merger_class_name");
            F5 = f.F(E, "input");
            F6 = f.F(E, "output");
            F7 = f.F(E, "initial_delay");
            F8 = f.F(E, "interval_duration");
            F9 = f.F(E, "flex_duration");
            F10 = f.F(E, "run_attempt_count");
            F11 = f.F(E, "backoff_policy");
            F12 = f.F(E, "backoff_delay_duration");
            F13 = f.F(E, "last_enqueue_time");
            F14 = f.F(E, "minimum_retention_duration");
            zVar = a9;
        } catch (Throwable th) {
            th = th;
            zVar = a9;
        }
        try {
            int F15 = f.F(E, "schedule_requested_at");
            int F16 = f.F(E, "run_in_foreground");
            int F17 = f.F(E, "out_of_quota_policy");
            int F18 = f.F(E, "period_count");
            int F19 = f.F(E, "generation");
            int F20 = f.F(E, "required_network_type");
            int F21 = f.F(E, "requires_charging");
            int F22 = f.F(E, "requires_device_idle");
            int F23 = f.F(E, "requires_battery_not_low");
            int F24 = f.F(E, "requires_storage_not_low");
            int F25 = f.F(E, "trigger_content_update_delay");
            int F26 = f.F(E, "trigger_max_content_delay");
            int F27 = f.F(E, "content_uri_triggers");
            p pVar = null;
            byte[] blob = null;
            if (E.moveToFirst()) {
                String string = E.isNull(F) ? null : E.getString(F);
                int U = i7.a.U(E.getInt(F2));
                String string2 = E.isNull(F3) ? null : E.getString(F3);
                String string3 = E.isNull(F4) ? null : E.getString(F4);
                t5.e a10 = t5.e.a(E.isNull(F5) ? null : E.getBlob(F5));
                t5.e a11 = t5.e.a(E.isNull(F6) ? null : E.getBlob(F6));
                long j = E.getLong(F7);
                long j3 = E.getLong(F8);
                long j10 = E.getLong(F9);
                int i3 = E.getInt(F10);
                int R = i7.a.R(E.getInt(F11));
                long j11 = E.getLong(F12);
                long j12 = E.getLong(F13);
                long j13 = E.getLong(F14);
                long j14 = E.getLong(F15);
                boolean z10 = E.getInt(F16) != 0;
                int T = i7.a.T(E.getInt(F17));
                int i10 = E.getInt(F18);
                int i11 = E.getInt(F19);
                int S = i7.a.S(E.getInt(F20));
                boolean z11 = E.getInt(F21) != 0;
                boolean z12 = E.getInt(F22) != 0;
                boolean z13 = E.getInt(F23) != 0;
                boolean z14 = E.getInt(F24) != 0;
                long j15 = E.getLong(F25);
                long j16 = E.getLong(F26);
                if (!E.isNull(F27)) {
                    blob = E.getBlob(F27);
                }
                pVar = new p(string, U, string2, string3, a10, a11, j, j3, j10, new t5.d(S, z11, z12, z13, z14, j15, j16, i7.a.o(blob)), i3, R, j11, j12, j13, j14, z10, T, i10, i11);
            }
            E.close();
            zVar.d();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            E.close();
            zVar.d();
            throw th;
        }
    }

    public void l(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1857a;
        workDatabase_Impl.b();
        h hVar = (h) this.j;
        k5.k a9 = hVar.a();
        a9.f(1, j);
        if (str == null) {
            a9.r(2);
        } else {
            a9.l(2, str);
        }
        workDatabase_Impl.c();
        try {
            a9.a();
            workDatabase_Impl.u();
        } finally {
            workDatabase_Impl.h();
            hVar.c(a9);
        }
    }

    public void m(Set set, c1.f fVar) {
        a();
        this.f1857a = set;
        this.f1858b = fVar;
    }

    public void n(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1857a;
        workDatabase_Impl.b();
        h hVar = (h) this.g;
        k5.k a9 = hVar.a();
        a9.f(1, j);
        if (str == null) {
            a9.r(2);
        } else {
            a9.l(2, str);
        }
        workDatabase_Impl.c();
        try {
            a9.a();
            workDatabase_Impl.u();
        } finally {
            workDatabase_Impl.h();
            hVar.c(a9);
        }
    }

    public void o(String str, t5.e eVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1857a;
        workDatabase_Impl.b();
        h hVar = (h) this.f1862f;
        k5.k a9 = hVar.a();
        byte[] c10 = t5.e.c(eVar);
        if (c10 == null) {
            a9.r(1);
        } else {
            a9.D(1, c10);
        }
        if (str == null) {
            a9.r(2);
        } else {
            a9.l(2, str);
        }
        workDatabase_Impl.c();
        try {
            a9.a();
            workDatabase_Impl.u();
        } finally {
            workDatabase_Impl.h();
            hVar.c(a9);
        }
    }

    public void p(int i3, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1857a;
        workDatabase_Impl.b();
        h hVar = (h) this.f1860d;
        k5.k a9 = hVar.a();
        a9.f(1, i7.a.g0(i3));
        if (str == null) {
            a9.r(2);
        } else {
            a9.l(2, str);
        }
        workDatabase_Impl.c();
        try {
            a9.a();
            workDatabase_Impl.u();
        } finally {
            workDatabase_Impl.h();
            hVar.c(a9);
        }
    }

    public q() {
        o0.e eVar = new o0.e(new l0[16]);
        this.f1859c = eVar;
        int i3 = q0.f8360a;
        this.f1860d = new i0();
        this.f1861e = eVar;
        this.f1862f = new o0.e(new Object[16]);
        this.g = new o0.e(new Function0[16]);
    }
}
