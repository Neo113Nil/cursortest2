package S0;

import N2.A;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.AbstractC3074d5;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.BinderC3754pk;
import com.google.android.gms.internal.ads.C2540Ek;
import com.google.android.gms.internal.ads.C2591Hk;
import com.google.android.gms.internal.ads.C2593Hm;
import com.google.android.gms.internal.ads.C2625Jk;
import com.google.android.gms.internal.ads.C2881Yl;
import com.google.android.gms.internal.ads.C2950ar;
import com.google.android.gms.internal.ads.C2953au;
import com.google.android.gms.internal.ads.C2999bl;
import com.google.android.gms.internal.ads.C3270gk;
import com.google.android.gms.internal.ads.C3275gp;
import com.google.android.gms.internal.ads.C3439jt;
import com.google.android.gms.internal.ads.C3614n5;
import com.google.android.gms.internal.ads.C3686oN;
import com.google.android.gms.internal.ads.C3758po;
import com.google.android.gms.internal.ads.C4240yl;
import com.google.android.gms.internal.ads.C4304zv;
import com.google.android.gms.internal.ads.InterfaceC2573Gj;
import com.google.android.gms.internal.ads.InterfaceC3436jq;
import com.google.android.gms.internal.ads.MD;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.SD;
import com.google.android.gms.internal.ads.U4;
import com.google.android.gms.internal.ads.Ut;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.Vx;
import com.google.android.gms.internal.ads.Yu;
import com.google.android.gms.internal.ads.Z4;
import com.google.android.gms.internal.ads.ZD;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import u0.C5098i;
import z0.C5266i;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2939a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2940b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2941c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2942d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2943e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2944f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2945g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2946h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2947j;

    /* renamed from: k, reason: collision with root package name */
    public Object f2948k;

    public q(C2953au c2953au, Ut ut, C2540Ek c2540Ek, C2591Hk c2591Hk, C3439jt c3439jt, BinderC3754pk binderC3754pk, C2999bl c2999bl, C2625Jk c2625Jk, C4240yl c4240yl, C3270gk c3270gk, C3758po c3758po) {
        this.f2939a = c2953au;
        this.f2940b = ut;
        this.f2941c = c2540Ek;
        this.f2942d = c2591Hk;
        this.f2943e = c3439jt;
        this.f2944f = binderC3754pk;
        this.f2945g = c2999bl;
        this.f2946h = c2625Jk;
        this.i = c4240yl;
        this.f2947j = c3270gk;
        this.f2948k = c3758po;
    }

    public ArrayList a() {
        C5098i c5098i;
        C5098i a9 = C5098i.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        a9.h(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2939a;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            int g9 = com.bumptech.glide.f.g(m8, "id");
            int g10 = com.bumptech.glide.f.g(m8, com.anythink.core.express.b.a.f17684b);
            int g11 = com.bumptech.glide.f.g(m8, "worker_class_name");
            int g12 = com.bumptech.glide.f.g(m8, "input_merger_class_name");
            int g13 = com.bumptech.glide.f.g(m8, "input");
            int g14 = com.bumptech.glide.f.g(m8, "output");
            int g15 = com.bumptech.glide.f.g(m8, "initial_delay");
            int g16 = com.bumptech.glide.f.g(m8, "interval_duration");
            int g17 = com.bumptech.glide.f.g(m8, "flex_duration");
            int g18 = com.bumptech.glide.f.g(m8, "run_attempt_count");
            int g19 = com.bumptech.glide.f.g(m8, "backoff_policy");
            int g20 = com.bumptech.glide.f.g(m8, "backoff_delay_duration");
            int g21 = com.bumptech.glide.f.g(m8, "last_enqueue_time");
            c5098i = a9;
            try {
                int g22 = com.bumptech.glide.f.g(m8, "minimum_retention_duration");
                int g23 = com.bumptech.glide.f.g(m8, "schedule_requested_at");
                int g24 = com.bumptech.glide.f.g(m8, "run_in_foreground");
                int g25 = com.bumptech.glide.f.g(m8, "out_of_quota_policy");
                int g26 = com.bumptech.glide.f.g(m8, "period_count");
                int g27 = com.bumptech.glide.f.g(m8, "generation");
                int g28 = com.bumptech.glide.f.g(m8, "required_network_type");
                int g29 = com.bumptech.glide.f.g(m8, "requires_charging");
                int g30 = com.bumptech.glide.f.g(m8, "requires_device_idle");
                int g31 = com.bumptech.glide.f.g(m8, "requires_battery_not_low");
                int g32 = com.bumptech.glide.f.g(m8, "requires_storage_not_low");
                int g33 = com.bumptech.glide.f.g(m8, "trigger_content_update_delay");
                int g34 = com.bumptech.glide.f.g(m8, "trigger_max_content_delay");
                int g35 = com.bumptech.glide.f.g(m8, "content_uri_triggers");
                int i = g22;
                ArrayList arrayList = new ArrayList(m8.getCount());
                while (m8.moveToNext()) {
                    byte[] bArr = null;
                    String string = m8.isNull(g9) ? null : m8.getString(g9);
                    int k6 = W2.e.k(m8.getInt(g10));
                    String string2 = m8.isNull(g11) ? null : m8.getString(g11);
                    String string3 = m8.isNull(g12) ? null : m8.getString(g12);
                    J0.h a10 = J0.h.a(m8.isNull(g13) ? null : m8.getBlob(g13));
                    J0.h a11 = J0.h.a(m8.isNull(g14) ? null : m8.getBlob(g14));
                    long j9 = m8.getLong(g15);
                    long j10 = m8.getLong(g16);
                    long j11 = m8.getLong(g17);
                    int i4 = m8.getInt(g18);
                    int h9 = W2.e.h(m8.getInt(g19));
                    long j12 = m8.getLong(g20);
                    long j13 = m8.getLong(g21);
                    int i9 = i;
                    long j14 = m8.getLong(i9);
                    int i10 = g9;
                    int i11 = g23;
                    long j15 = m8.getLong(i11);
                    g23 = i11;
                    int i12 = g24;
                    boolean z8 = m8.getInt(i12) != 0;
                    g24 = i12;
                    int i13 = g25;
                    int j16 = W2.e.j(m8.getInt(i13));
                    g25 = i13;
                    int i14 = g26;
                    int i15 = m8.getInt(i14);
                    g26 = i14;
                    int i16 = g27;
                    int i17 = m8.getInt(i16);
                    g27 = i16;
                    int i18 = g28;
                    int i19 = W2.e.i(m8.getInt(i18));
                    g28 = i18;
                    int i20 = g29;
                    boolean z9 = m8.getInt(i20) != 0;
                    g29 = i20;
                    int i21 = g30;
                    boolean z10 = m8.getInt(i21) != 0;
                    g30 = i21;
                    int i22 = g31;
                    boolean z11 = m8.getInt(i22) != 0;
                    g31 = i22;
                    int i23 = g32;
                    boolean z12 = m8.getInt(i23) != 0;
                    g32 = i23;
                    int i24 = g33;
                    long j17 = m8.getLong(i24);
                    g33 = i24;
                    int i25 = g34;
                    long j18 = m8.getLong(i25);
                    g34 = i25;
                    int i26 = g35;
                    if (!m8.isNull(i26)) {
                        bArr = m8.getBlob(i26);
                    }
                    g35 = i26;
                    arrayList.add(new p(string, k6, string2, string3, a10, a11, j9, j10, j11, new J0.d(i19, z9, z10, z11, z12, j17, j18, W2.e.a(bArr)), i4, h9, j12, j13, j14, j15, z8, j16, i15, i17));
                    g9 = i10;
                    i = i9;
                }
                m8.close();
                c5098i.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m8.close();
                c5098i.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c5098i = a9;
        }
    }

    public ArrayList b(int i) {
        C5098i c5098i;
        C5098i a9 = C5098i.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a9.h(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2939a;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            int g9 = com.bumptech.glide.f.g(m8, "id");
            int g10 = com.bumptech.glide.f.g(m8, com.anythink.core.express.b.a.f17684b);
            int g11 = com.bumptech.glide.f.g(m8, "worker_class_name");
            int g12 = com.bumptech.glide.f.g(m8, "input_merger_class_name");
            int g13 = com.bumptech.glide.f.g(m8, "input");
            int g14 = com.bumptech.glide.f.g(m8, "output");
            int g15 = com.bumptech.glide.f.g(m8, "initial_delay");
            int g16 = com.bumptech.glide.f.g(m8, "interval_duration");
            int g17 = com.bumptech.glide.f.g(m8, "flex_duration");
            int g18 = com.bumptech.glide.f.g(m8, "run_attempt_count");
            int g19 = com.bumptech.glide.f.g(m8, "backoff_policy");
            int g20 = com.bumptech.glide.f.g(m8, "backoff_delay_duration");
            int g21 = com.bumptech.glide.f.g(m8, "last_enqueue_time");
            c5098i = a9;
            try {
                int g22 = com.bumptech.glide.f.g(m8, "minimum_retention_duration");
                int g23 = com.bumptech.glide.f.g(m8, "schedule_requested_at");
                int g24 = com.bumptech.glide.f.g(m8, "run_in_foreground");
                int g25 = com.bumptech.glide.f.g(m8, "out_of_quota_policy");
                int g26 = com.bumptech.glide.f.g(m8, "period_count");
                int g27 = com.bumptech.glide.f.g(m8, "generation");
                int g28 = com.bumptech.glide.f.g(m8, "required_network_type");
                int g29 = com.bumptech.glide.f.g(m8, "requires_charging");
                int g30 = com.bumptech.glide.f.g(m8, "requires_device_idle");
                int g31 = com.bumptech.glide.f.g(m8, "requires_battery_not_low");
                int g32 = com.bumptech.glide.f.g(m8, "requires_storage_not_low");
                int g33 = com.bumptech.glide.f.g(m8, "trigger_content_update_delay");
                int g34 = com.bumptech.glide.f.g(m8, "trigger_max_content_delay");
                int g35 = com.bumptech.glide.f.g(m8, "content_uri_triggers");
                int i4 = g22;
                ArrayList arrayList = new ArrayList(m8.getCount());
                while (m8.moveToNext()) {
                    byte[] bArr = null;
                    String string = m8.isNull(g9) ? null : m8.getString(g9);
                    int k6 = W2.e.k(m8.getInt(g10));
                    String string2 = m8.isNull(g11) ? null : m8.getString(g11);
                    String string3 = m8.isNull(g12) ? null : m8.getString(g12);
                    J0.h a10 = J0.h.a(m8.isNull(g13) ? null : m8.getBlob(g13));
                    J0.h a11 = J0.h.a(m8.isNull(g14) ? null : m8.getBlob(g14));
                    long j9 = m8.getLong(g15);
                    long j10 = m8.getLong(g16);
                    long j11 = m8.getLong(g17);
                    int i9 = m8.getInt(g18);
                    int h9 = W2.e.h(m8.getInt(g19));
                    long j12 = m8.getLong(g20);
                    long j13 = m8.getLong(g21);
                    int i10 = i4;
                    long j14 = m8.getLong(i10);
                    int i11 = g9;
                    int i12 = g23;
                    long j15 = m8.getLong(i12);
                    g23 = i12;
                    int i13 = g24;
                    boolean z8 = m8.getInt(i13) != 0;
                    g24 = i13;
                    int i14 = g25;
                    int j16 = W2.e.j(m8.getInt(i14));
                    g25 = i14;
                    int i15 = g26;
                    int i16 = m8.getInt(i15);
                    g26 = i15;
                    int i17 = g27;
                    int i18 = m8.getInt(i17);
                    g27 = i17;
                    int i19 = g28;
                    int i20 = W2.e.i(m8.getInt(i19));
                    g28 = i19;
                    int i21 = g29;
                    boolean z9 = m8.getInt(i21) != 0;
                    g29 = i21;
                    int i22 = g30;
                    boolean z10 = m8.getInt(i22) != 0;
                    g30 = i22;
                    int i23 = g31;
                    boolean z11 = m8.getInt(i23) != 0;
                    g31 = i23;
                    int i24 = g32;
                    boolean z12 = m8.getInt(i24) != 0;
                    g32 = i24;
                    int i25 = g33;
                    long j17 = m8.getLong(i25);
                    g33 = i25;
                    int i26 = g34;
                    long j18 = m8.getLong(i26);
                    g34 = i26;
                    int i27 = g35;
                    if (!m8.isNull(i27)) {
                        bArr = m8.getBlob(i27);
                    }
                    g35 = i27;
                    arrayList.add(new p(string, k6, string2, string3, a10, a11, j9, j10, j11, new J0.d(i20, z9, z10, z11, z12, j17, j18, W2.e.a(bArr)), i9, h9, j12, j13, j14, j15, z8, j16, i16, i18));
                    g9 = i11;
                    i4 = i10;
                }
                m8.close();
                c5098i.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m8.close();
                c5098i.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c5098i = a9;
        }
    }

    public ArrayList c() {
        C5098i c5098i;
        C5098i a9 = C5098i.a(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2939a;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            int g9 = com.bumptech.glide.f.g(m8, "id");
            int g10 = com.bumptech.glide.f.g(m8, com.anythink.core.express.b.a.f17684b);
            int g11 = com.bumptech.glide.f.g(m8, "worker_class_name");
            int g12 = com.bumptech.glide.f.g(m8, "input_merger_class_name");
            int g13 = com.bumptech.glide.f.g(m8, "input");
            int g14 = com.bumptech.glide.f.g(m8, "output");
            int g15 = com.bumptech.glide.f.g(m8, "initial_delay");
            int g16 = com.bumptech.glide.f.g(m8, "interval_duration");
            int g17 = com.bumptech.glide.f.g(m8, "flex_duration");
            int g18 = com.bumptech.glide.f.g(m8, "run_attempt_count");
            int g19 = com.bumptech.glide.f.g(m8, "backoff_policy");
            int g20 = com.bumptech.glide.f.g(m8, "backoff_delay_duration");
            int g21 = com.bumptech.glide.f.g(m8, "last_enqueue_time");
            c5098i = a9;
            try {
                int g22 = com.bumptech.glide.f.g(m8, "minimum_retention_duration");
                int g23 = com.bumptech.glide.f.g(m8, "schedule_requested_at");
                int g24 = com.bumptech.glide.f.g(m8, "run_in_foreground");
                int g25 = com.bumptech.glide.f.g(m8, "out_of_quota_policy");
                int g26 = com.bumptech.glide.f.g(m8, "period_count");
                int g27 = com.bumptech.glide.f.g(m8, "generation");
                int g28 = com.bumptech.glide.f.g(m8, "required_network_type");
                int g29 = com.bumptech.glide.f.g(m8, "requires_charging");
                int g30 = com.bumptech.glide.f.g(m8, "requires_device_idle");
                int g31 = com.bumptech.glide.f.g(m8, "requires_battery_not_low");
                int g32 = com.bumptech.glide.f.g(m8, "requires_storage_not_low");
                int g33 = com.bumptech.glide.f.g(m8, "trigger_content_update_delay");
                int g34 = com.bumptech.glide.f.g(m8, "trigger_max_content_delay");
                int g35 = com.bumptech.glide.f.g(m8, "content_uri_triggers");
                int i = g22;
                ArrayList arrayList = new ArrayList(m8.getCount());
                while (m8.moveToNext()) {
                    byte[] bArr = null;
                    String string = m8.isNull(g9) ? null : m8.getString(g9);
                    int k6 = W2.e.k(m8.getInt(g10));
                    String string2 = m8.isNull(g11) ? null : m8.getString(g11);
                    String string3 = m8.isNull(g12) ? null : m8.getString(g12);
                    J0.h a10 = J0.h.a(m8.isNull(g13) ? null : m8.getBlob(g13));
                    J0.h a11 = J0.h.a(m8.isNull(g14) ? null : m8.getBlob(g14));
                    long j9 = m8.getLong(g15);
                    long j10 = m8.getLong(g16);
                    long j11 = m8.getLong(g17);
                    int i4 = m8.getInt(g18);
                    int h9 = W2.e.h(m8.getInt(g19));
                    long j12 = m8.getLong(g20);
                    long j13 = m8.getLong(g21);
                    int i9 = i;
                    long j14 = m8.getLong(i9);
                    int i10 = g9;
                    int i11 = g23;
                    long j15 = m8.getLong(i11);
                    g23 = i11;
                    int i12 = g24;
                    boolean z8 = m8.getInt(i12) != 0;
                    g24 = i12;
                    int i13 = g25;
                    int j16 = W2.e.j(m8.getInt(i13));
                    g25 = i13;
                    int i14 = g26;
                    int i15 = m8.getInt(i14);
                    g26 = i14;
                    int i16 = g27;
                    int i17 = m8.getInt(i16);
                    g27 = i16;
                    int i18 = g28;
                    int i19 = W2.e.i(m8.getInt(i18));
                    g28 = i18;
                    int i20 = g29;
                    boolean z9 = m8.getInt(i20) != 0;
                    g29 = i20;
                    int i21 = g30;
                    boolean z10 = m8.getInt(i21) != 0;
                    g30 = i21;
                    int i22 = g31;
                    boolean z11 = m8.getInt(i22) != 0;
                    g31 = i22;
                    int i23 = g32;
                    boolean z12 = m8.getInt(i23) != 0;
                    g32 = i23;
                    int i24 = g33;
                    long j17 = m8.getLong(i24);
                    g33 = i24;
                    int i25 = g34;
                    long j18 = m8.getLong(i25);
                    g34 = i25;
                    int i26 = g35;
                    if (!m8.isNull(i26)) {
                        bArr = m8.getBlob(i26);
                    }
                    g35 = i26;
                    arrayList.add(new p(string, k6, string2, string3, a10, a11, j9, j10, j11, new J0.d(i19, z9, z10, z11, z12, j17, j18, W2.e.a(bArr)), i4, h9, j12, j13, j14, j15, z8, j16, i15, i17));
                    g9 = i10;
                    i = i9;
                }
                m8.close();
                c5098i.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m8.close();
                c5098i.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c5098i = a9;
        }
    }

    public ArrayList d() {
        C5098i c5098i;
        C5098i a9 = C5098i.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2939a;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            int g9 = com.bumptech.glide.f.g(m8, "id");
            int g10 = com.bumptech.glide.f.g(m8, com.anythink.core.express.b.a.f17684b);
            int g11 = com.bumptech.glide.f.g(m8, "worker_class_name");
            int g12 = com.bumptech.glide.f.g(m8, "input_merger_class_name");
            int g13 = com.bumptech.glide.f.g(m8, "input");
            int g14 = com.bumptech.glide.f.g(m8, "output");
            int g15 = com.bumptech.glide.f.g(m8, "initial_delay");
            int g16 = com.bumptech.glide.f.g(m8, "interval_duration");
            int g17 = com.bumptech.glide.f.g(m8, "flex_duration");
            int g18 = com.bumptech.glide.f.g(m8, "run_attempt_count");
            int g19 = com.bumptech.glide.f.g(m8, "backoff_policy");
            int g20 = com.bumptech.glide.f.g(m8, "backoff_delay_duration");
            int g21 = com.bumptech.glide.f.g(m8, "last_enqueue_time");
            c5098i = a9;
            try {
                int g22 = com.bumptech.glide.f.g(m8, "minimum_retention_duration");
                int g23 = com.bumptech.glide.f.g(m8, "schedule_requested_at");
                int g24 = com.bumptech.glide.f.g(m8, "run_in_foreground");
                int g25 = com.bumptech.glide.f.g(m8, "out_of_quota_policy");
                int g26 = com.bumptech.glide.f.g(m8, "period_count");
                int g27 = com.bumptech.glide.f.g(m8, "generation");
                int g28 = com.bumptech.glide.f.g(m8, "required_network_type");
                int g29 = com.bumptech.glide.f.g(m8, "requires_charging");
                int g30 = com.bumptech.glide.f.g(m8, "requires_device_idle");
                int g31 = com.bumptech.glide.f.g(m8, "requires_battery_not_low");
                int g32 = com.bumptech.glide.f.g(m8, "requires_storage_not_low");
                int g33 = com.bumptech.glide.f.g(m8, "trigger_content_update_delay");
                int g34 = com.bumptech.glide.f.g(m8, "trigger_max_content_delay");
                int g35 = com.bumptech.glide.f.g(m8, "content_uri_triggers");
                int i = g22;
                ArrayList arrayList = new ArrayList(m8.getCount());
                while (m8.moveToNext()) {
                    byte[] bArr = null;
                    String string = m8.isNull(g9) ? null : m8.getString(g9);
                    int k6 = W2.e.k(m8.getInt(g10));
                    String string2 = m8.isNull(g11) ? null : m8.getString(g11);
                    String string3 = m8.isNull(g12) ? null : m8.getString(g12);
                    J0.h a10 = J0.h.a(m8.isNull(g13) ? null : m8.getBlob(g13));
                    J0.h a11 = J0.h.a(m8.isNull(g14) ? null : m8.getBlob(g14));
                    long j9 = m8.getLong(g15);
                    long j10 = m8.getLong(g16);
                    long j11 = m8.getLong(g17);
                    int i4 = m8.getInt(g18);
                    int h9 = W2.e.h(m8.getInt(g19));
                    long j12 = m8.getLong(g20);
                    long j13 = m8.getLong(g21);
                    int i9 = i;
                    long j14 = m8.getLong(i9);
                    int i10 = g9;
                    int i11 = g23;
                    long j15 = m8.getLong(i11);
                    g23 = i11;
                    int i12 = g24;
                    boolean z8 = m8.getInt(i12) != 0;
                    g24 = i12;
                    int i13 = g25;
                    int j16 = W2.e.j(m8.getInt(i13));
                    g25 = i13;
                    int i14 = g26;
                    int i15 = m8.getInt(i14);
                    g26 = i14;
                    int i16 = g27;
                    int i17 = m8.getInt(i16);
                    g27 = i16;
                    int i18 = g28;
                    int i19 = W2.e.i(m8.getInt(i18));
                    g28 = i18;
                    int i20 = g29;
                    boolean z9 = m8.getInt(i20) != 0;
                    g29 = i20;
                    int i21 = g30;
                    boolean z10 = m8.getInt(i21) != 0;
                    g30 = i21;
                    int i22 = g31;
                    boolean z11 = m8.getInt(i22) != 0;
                    g31 = i22;
                    int i23 = g32;
                    boolean z12 = m8.getInt(i23) != 0;
                    g32 = i23;
                    int i24 = g33;
                    long j17 = m8.getLong(i24);
                    g33 = i24;
                    int i25 = g34;
                    long j18 = m8.getLong(i25);
                    g34 = i25;
                    int i26 = g35;
                    if (!m8.isNull(i26)) {
                        bArr = m8.getBlob(i26);
                    }
                    g35 = i26;
                    arrayList.add(new p(string, k6, string2, string3, a10, a11, j9, j10, j11, new J0.d(i19, z9, z10, z11, z12, j17, j18, W2.e.a(bArr)), i4, h9, j12, j13, j14, j15, z8, j16, i15, i17));
                    g9 = i10;
                    i = i9;
                }
                m8.close();
                c5098i.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m8.close();
                c5098i.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c5098i = a9;
        }
    }

    public int e(String str) {
        C5098i a9 = C5098i.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2939a;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            int i = 0;
            if (m8.moveToFirst()) {
                Integer valueOf = m8.isNull(0) ? null : Integer.valueOf(m8.getInt(0));
                if (valueOf != null) {
                    i = W2.e.k(valueOf.intValue());
                }
            }
            return i;
        } finally {
            m8.close();
            a9.j();
        }
    }

    public ArrayList f(String str) {
        C5098i a9 = C5098i.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2939a;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m8.getCount());
            while (m8.moveToNext()) {
                arrayList.add(m8.isNull(0) ? null : m8.getString(0));
            }
            return arrayList;
        } finally {
            m8.close();
            a9.j();
        }
    }

    public ArrayList g() {
        C5098i a9 = C5098i.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        a9.c(1, "offline_ping_sender_work");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2939a;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m8.getCount());
            while (m8.moveToNext()) {
                arrayList.add(m8.isNull(0) ? null : m8.getString(0));
            }
            return arrayList;
        } finally {
            m8.close();
            a9.j();
        }
    }

    public p h(String str) {
        C5098i c5098i;
        int g9;
        int g10;
        int g11;
        int g12;
        int g13;
        int g14;
        int g15;
        int g16;
        int g17;
        int g18;
        int g19;
        int g20;
        int g21;
        C5098i a9 = C5098i.a(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2939a;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            g9 = com.bumptech.glide.f.g(m8, "id");
            g10 = com.bumptech.glide.f.g(m8, com.anythink.core.express.b.a.f17684b);
            g11 = com.bumptech.glide.f.g(m8, "worker_class_name");
            g12 = com.bumptech.glide.f.g(m8, "input_merger_class_name");
            g13 = com.bumptech.glide.f.g(m8, "input");
            g14 = com.bumptech.glide.f.g(m8, "output");
            g15 = com.bumptech.glide.f.g(m8, "initial_delay");
            g16 = com.bumptech.glide.f.g(m8, "interval_duration");
            g17 = com.bumptech.glide.f.g(m8, "flex_duration");
            g18 = com.bumptech.glide.f.g(m8, "run_attempt_count");
            g19 = com.bumptech.glide.f.g(m8, "backoff_policy");
            g20 = com.bumptech.glide.f.g(m8, "backoff_delay_duration");
            g21 = com.bumptech.glide.f.g(m8, "last_enqueue_time");
            c5098i = a9;
        } catch (Throwable th) {
            th = th;
            c5098i = a9;
        }
        try {
            int g22 = com.bumptech.glide.f.g(m8, "minimum_retention_duration");
            int g23 = com.bumptech.glide.f.g(m8, "schedule_requested_at");
            int g24 = com.bumptech.glide.f.g(m8, "run_in_foreground");
            int g25 = com.bumptech.glide.f.g(m8, "out_of_quota_policy");
            int g26 = com.bumptech.glide.f.g(m8, "period_count");
            int g27 = com.bumptech.glide.f.g(m8, "generation");
            int g28 = com.bumptech.glide.f.g(m8, "required_network_type");
            int g29 = com.bumptech.glide.f.g(m8, "requires_charging");
            int g30 = com.bumptech.glide.f.g(m8, "requires_device_idle");
            int g31 = com.bumptech.glide.f.g(m8, "requires_battery_not_low");
            int g32 = com.bumptech.glide.f.g(m8, "requires_storage_not_low");
            int g33 = com.bumptech.glide.f.g(m8, "trigger_content_update_delay");
            int g34 = com.bumptech.glide.f.g(m8, "trigger_max_content_delay");
            int g35 = com.bumptech.glide.f.g(m8, "content_uri_triggers");
            p pVar = null;
            byte[] blob = null;
            if (m8.moveToFirst()) {
                String string = m8.isNull(g9) ? null : m8.getString(g9);
                int k6 = W2.e.k(m8.getInt(g10));
                String string2 = m8.isNull(g11) ? null : m8.getString(g11);
                String string3 = m8.isNull(g12) ? null : m8.getString(g12);
                J0.h a10 = J0.h.a(m8.isNull(g13) ? null : m8.getBlob(g13));
                J0.h a11 = J0.h.a(m8.isNull(g14) ? null : m8.getBlob(g14));
                long j9 = m8.getLong(g15);
                long j10 = m8.getLong(g16);
                long j11 = m8.getLong(g17);
                int i = m8.getInt(g18);
                int h9 = W2.e.h(m8.getInt(g19));
                long j12 = m8.getLong(g20);
                long j13 = m8.getLong(g21);
                long j14 = m8.getLong(g22);
                long j15 = m8.getLong(g23);
                boolean z8 = m8.getInt(g24) != 0;
                int j16 = W2.e.j(m8.getInt(g25));
                int i4 = m8.getInt(g26);
                int i9 = m8.getInt(g27);
                int i10 = W2.e.i(m8.getInt(g28));
                boolean z9 = m8.getInt(g29) != 0;
                boolean z10 = m8.getInt(g30) != 0;
                boolean z11 = m8.getInt(g31) != 0;
                boolean z12 = m8.getInt(g32) != 0;
                long j17 = m8.getLong(g33);
                long j18 = m8.getLong(g34);
                if (!m8.isNull(g35)) {
                    blob = m8.getBlob(g35);
                }
                pVar = new p(string, k6, string2, string3, a10, a11, j9, j10, j11, new J0.d(i10, z9, z10, z11, z12, j17, j18, W2.e.a(blob)), i, h9, j12, j13, j14, j15, z8, j16, i4, i9);
            }
            m8.close();
            c5098i.j();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            m8.close();
            c5098i.j();
            throw th;
        }
    }

    public void i(String str, long j9) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2939a;
        workDatabase_Impl.b();
        h hVar = (h) this.f2947j;
        C5266i a9 = hVar.a();
        a9.h(1, j9);
        if (str == null) {
            a9.o(2);
        } else {
            a9.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            a9.b();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a9);
        }
    }

    public void j() {
        synchronized (((ArrayList) this.f2948k)) {
            try {
                Iterator it = ((ArrayList) this.f2948k).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(String str, long j9) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2939a;
        workDatabase_Impl.b();
        h hVar = (h) this.f2945g;
        C5266i a9 = hVar.a();
        a9.h(1, j9);
        if (str == null) {
            a9.o(2);
        } else {
            a9.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            a9.b();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a9);
        }
    }

    public void l(String str, J0.h hVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2939a;
        workDatabase_Impl.b();
        h hVar2 = (h) this.f2944f;
        C5266i a9 = hVar2.a();
        byte[] c4 = J0.h.c(hVar);
        if (c4 == null) {
            a9.o(1);
        } else {
            a9.l(1, c4);
        }
        if (str == null) {
            a9.o(2);
        } else {
            a9.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            a9.b();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar2.n(a9);
        }
    }

    public void m(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2939a;
        workDatabase_Impl.b();
        h hVar = (h) this.f2942d;
        C5266i a9 = hVar.a();
        a9.h(1, W2.e.q(i));
        if (str == null) {
            a9.o(2);
        } else {
            a9.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            a9.b();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a9);
        }
    }

    public void n() {
        U4 u42 = (U4) this.f2946h;
        if (u42 != null) {
            u42.f27926w = true;
            u42.interrupt();
        }
        Z4[] z4Arr = (Z4[]) this.f2945g;
        for (int i = 0; i < 4; i++) {
            Z4 z42 = z4Arr[i];
            if (z42 != null) {
                z42.f28966w = true;
                z42.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = (PriorityBlockingQueue) this.f2941c;
        PriorityBlockingQueue priorityBlockingQueue2 = (PriorityBlockingQueue) this.f2942d;
        C3614n5 c3614n5 = (C3614n5) this.f2943e;
        Vx vx = (Vx) this.f2948k;
        U4 u43 = new U4(priorityBlockingQueue, priorityBlockingQueue2, c3614n5, vx);
        this.f2946h = u43;
        u43.start();
        for (int i4 = 0; i4 < 4; i4++) {
            Z4 z43 = new Z4(priorityBlockingQueue2, (C2881Yl) this.f2944f, c3614n5, vx);
            z4Arr[i4] = z43;
            z43.start();
        }
    }

    public void o(AbstractC3074d5 abstractC3074d5) {
        abstractC3074d5.f29788A = this;
        HashSet hashSet = (HashSet) this.f2940b;
        synchronized (hashSet) {
            hashSet.add(abstractC3074d5);
        }
        abstractC3074d5.f29799z = Integer.valueOf(((AtomicInteger) this.f2939a).incrementAndGet());
        abstractC3074d5.a("add-to-queue");
        p();
        ((PriorityBlockingQueue) this.f2941c).add(abstractC3074d5);
    }

    public void p() {
        ArrayList arrayList = (ArrayList) this.f2947j;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(Ut ut) {
        J3.a l9;
        synchronized (this) {
            Iterator it = ut.f28139a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    l9 = C3686oN.l(new C3275gp(3));
                    break;
                }
                InterfaceC3436jq a9 = ((InterfaceC2573Gj) this.f2943e).a(ut.f28141b, (String) it.next());
                if (a9 != null && a9.b((C2953au) this.f2948k, ut)) {
                    l9 = C3686oN.w(a9.a((C2953au) this.f2948k, ut), ut.f28131R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f2942d);
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ga)).booleanValue()) {
                        Vu f6 = Vu.f((Context) this.f2939a, 12);
                        f6.p0(ut.f28114E);
                        f6.a();
                        PA.Q(l9, (Yu) this.f2940b, f6, false);
                    }
                }
            }
        }
        ((C2950ar) this.f2944f).b((C2953au) this.f2948k, ut, l9, (C4304zv) this.f2945g);
        l9.c(new MD(0, l9, new C2593Hm(this, ut)), (SD) this.f2941c);
    }

    public q(Context context, Yu yu, SD sd, ScheduledExecutorService scheduledExecutorService, InterfaceC2573Gj interfaceC2573Gj, C2950ar c2950ar, C4304zv c4304zv) {
        this.f2946h = new ZD();
        this.i = new AtomicBoolean();
        this.f2939a = context;
        this.f2940b = yu;
        this.f2941c = sd;
        this.f2942d = scheduledExecutorService;
        this.f2943e = interfaceC2573Gj;
        this.f2944f = c2950ar;
        this.f2945g = c4304zv;
    }

    public q(C3614n5 c3614n5, C2881Yl c2881Yl) {
        Vx vx = new Vx(new Handler(Looper.getMainLooper()));
        this.f2939a = new AtomicInteger();
        this.f2940b = new HashSet();
        this.f2941c = new PriorityBlockingQueue();
        this.f2942d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.f2947j = new ArrayList();
        this.f2943e = c3614n5;
        this.f2944f = c2881Yl;
        this.f2945g = new Z4[4];
        this.f2948k = vx;
    }

    public q(WorkDatabase_Impl workDatabase_Impl) {
        this.f2939a = workDatabase_Impl;
        this.f2940b = new b(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 8);
        this.f2941c = new h(workDatabase_Impl, 9);
        this.f2942d = new h(workDatabase_Impl, 10);
        this.f2943e = new h(workDatabase_Impl, 11);
        this.f2944f = new h(workDatabase_Impl, 12);
        this.f2945g = new h(workDatabase_Impl, 13);
        this.f2946h = new h(workDatabase_Impl, 14);
        this.i = new h(workDatabase_Impl, 15);
        this.f2947j = new h(workDatabase_Impl, 4);
        this.f2948k = new h(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 7);
    }

    public q(C3614n5 c3614n5, s sVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        i8.m mVar = new i8.m();
        mVar.f38384n = new A(4, handler);
        this.f2939a = new AtomicInteger();
        this.f2940b = new HashSet();
        this.f2941c = new PriorityBlockingQueue();
        this.f2942d = new PriorityBlockingQueue();
        this.f2947j = new ArrayList();
        this.f2948k = new ArrayList();
        this.f2943e = c3614n5;
        this.f2944f = sVar;
        this.f2946h = new l1.e[4];
        this.f2945g = mVar;
    }
}
