package s7;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.e8;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.j7;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.internal.measurement.p9;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.q9;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.v5;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.w5;
import com.google.android.gms.internal.measurement.w7;
import com.google.android.gms.internal.measurement.x7;
import com.google.android.gms.internal.measurement.y7;
import com.google.android.gms.internal.measurement.z7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k1 extends d4 implements f {
    public final s.e A;
    public final s.e B;
    public final s.e C;

    /* renamed from: r, reason: collision with root package name */
    public final s.e f8776r;

    /* renamed from: s, reason: collision with root package name */
    public final s.e f8777s;

    /* renamed from: t, reason: collision with root package name */
    public final s.e f8778t;

    /* renamed from: u, reason: collision with root package name */
    public final s.e f8779u;

    /* renamed from: v, reason: collision with root package name */
    public final s.e f8780v;

    /* renamed from: w, reason: collision with root package name */
    public final s.e f8781w;

    /* renamed from: x, reason: collision with root package name */
    public final s.e f8782x;

    /* renamed from: y, reason: collision with root package name */
    public final b5.h f8783y;

    /* renamed from: z, reason: collision with root package name */
    public final l.d f8784z;

    public k1(j4 j4Var) {
        super(j4Var);
        this.f8776r = new s.e(0);
        this.f8777s = new s.e(0);
        this.f8778t = new s.e(0);
        this.f8779u = new s.e(0);
        this.f8780v = new s.e(0);
        this.f8781w = new s.e(0);
        this.A = new s.e(0);
        this.B = new s.e(0);
        this.C = new s.e(0);
        this.f8782x = new s.e(0);
        this.f8783y = new b5.h(this);
        this.f8784z = new l.d(22, this);
    }

    public static final s.e C(a8 a8Var) {
        s.e eVar = new s.e(0);
        for (e8 e8Var : a8Var.x()) {
            eVar.put(e8Var.t(), e8Var.u());
        }
        return eVar;
    }

    public static final b2 D(int i3) {
        int i10 = i3 - 1;
        if (i10 == 1) {
            return b2.AD_STORAGE;
        }
        if (i10 == 2) {
            return b2.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return b2.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return b2.AD_PERSONALIZATION;
    }

    public final void A(String str, a8 a8Var) {
        q1 q1Var = (q1) this.f1478d;
        int C = a8Var.C();
        b5.h hVar = this.f8783y;
        if (C == 0) {
            hVar.e(str);
            return;
        }
        v0 v0Var = q1Var.f8937t;
        q1.l(v0Var);
        v0Var.B.b(Integer.valueOf(a8Var.C()), "EES programs found");
        q9 q9Var = (q9) a8Var.B().get(0);
        try {
            w5 w5Var = new w5();
            e7 e7Var = w5Var.f2929a;
            ((HashMap) ((v5) e7Var.f2262s).f2870e).put("internal.remoteConfig", new i1(this, str, 2));
            ((HashMap) ((v5) e7Var.f2262s).f2870e).put("internal.appMetadata", new i1(this, str, 0));
            ((HashMap) ((v5) e7Var.f2262s).f2870e).put("internal.logger", new j1(this));
            w5Var.b(q9Var);
            hVar.d(str, w5Var);
            q1.l(v0Var);
            t0 t0Var = v0Var.B;
            t0Var.c(str, Integer.valueOf(q9Var.u().u()), "EES program loaded for appId, activities");
            for (p9 p9Var : q9Var.u().t()) {
                q1.l(v0Var);
                t0Var.b(p9Var.t(), "EES program activity");
            }
        } catch (l6 unused) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.b(str, "Failed to load EES program. appId");
        }
    }

    public final a8 B(String str, byte[] bArr) {
        q1 q1Var = (q1) this.f1478d;
        if (bArr == null) {
            return a8.L();
        }
        try {
            a8 a8Var = (a8) ((z7) l4.d0(a8.K(), bArr)).d();
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.B.c(a8Var.t() ? Long.valueOf(a8Var.u()) : null, a8Var.v() ? a8Var.w() : null, "Parsed config. version, gmp_app_id");
            return a8Var;
        } catch (com.google.android.gms.internal.measurement.v1 e2) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9053w.c(v0.A(str), e2, "Unable to merge remote config. appId");
            return a8.L();
        } catch (RuntimeException e9) {
            v0 v0Var3 = q1Var.f8937t;
            q1.l(v0Var3);
            v0Var3.f9053w.c(v0.A(str), e9, "Unable to merge remote config. appId");
            return a8.L();
        }
    }

    public final a8 E(String str) {
        t();
        s();
        c7.c0.d(str);
        y(str);
        return (a8) this.f8781w.get(str);
    }

    public final String F(String str) {
        s();
        y(str);
        return (String) this.A.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0485, code lost:
    
        r1 = r24;
        r3 = r25;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0340, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0324, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02cd, code lost:
    
        r0 = r13.f8937t;
        s7.q1.l(r0);
        r0 = r0.f9053w;
        r3 = s7.v0.A(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e2, code lost:
    
        if (r14.t() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e4, code lost:
    
        r5 = java.lang.Integer.valueOf(r14.u());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02f3, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02f2, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02ed, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0386, code lost:
    
        r27 = r6;
        r5 = r5.v().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0396, code lost:
    
        if (r5.hasNext() == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0398, code lost:
    
        r6 = (com.google.android.gms.internal.measurement.q7) r5.next();
        r8.t();
        r8.s();
        c7.c0.d(r30);
        c7.c0.g(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03b2, code lost:
    
        if (r6.v().isEmpty() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03de, code lost:
    
        r14 = r6.a();
        r23 = r5;
        r5 = new android.content.ContentValues();
        r5.put(r3, r30);
        r26 = r3;
        r5.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03f9, code lost:
    
        if (r6.t() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03fb, code lost:
    
        r3 = java.lang.Integer.valueOf(r6.u());
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0405, code lost:
    
        r5.put(r0, r3);
        r28 = r0;
        r5.put("property_name", r6.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0417, code lost:
    
        if (r6.z() == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0419, code lost:
    
        r3 = java.lang.Boolean.valueOf(r6.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0423, code lost:
    
        r5.put("session_scoped", r3);
        r5.put("data", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0435, code lost:
    
        if (r8.j0().insertWithOnConflict("property_filters", null, r5, 5) != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x044a, code lost:
    
        r5 = r23;
        r3 = r26;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0437, code lost:
    
        r0 = r13.f8937t;
        s7.q1.l(r0);
        r0.f9050t.b(s7.v0.A(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0448, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0452, code lost:
    
        r1 = r13.f8937t;
        s7.q1.l(r1);
        r1.f9050t.c(s7.v0.A(r30), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0422, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0404, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03b4, code lost:
    
        r0 = r13.f8937t;
        s7.q1.l(r0);
        r0 = r0.f9053w;
        r3 = s7.v0.A(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03c9, code lost:
    
        if (r6.t() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03cb, code lost:
    
        r5 = java.lang.Integer.valueOf(r6.u());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03d5, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0262, code lost:
    
        r0 = r5.v().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x026e, code lost:
    
        if (r0.hasNext() == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027a, code lost:
    
        if (((com.google.android.gms.internal.measurement.q7) r0.next()).t() != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x027c, code lost:
    
        r0 = r13.f8937t;
        s7.q1.l(r0);
        r0.f9053w.c(s7.v0.A(r30), java.lang.Integer.valueOf(r7), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0291, code lost:
    
        r0 = r5.y().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0299, code lost:
    
        r14 = r0.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x029d, code lost:
    
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02af, code lost:
    
        if (r14 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02b1, code lost:
    
        r14 = (com.google.android.gms.internal.measurement.k7) r23.next();
        r8.t();
        r8.s();
        c7.c0.d(r30);
        c7.c0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02cb, code lost:
    
        if (r14.v().isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02fe, code lost:
    
        r26 = r5;
        r5 = r14.a();
        r27 = r6;
        r6 = new android.content.ContentValues();
        r6.put("app_id", r30);
        r6.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0319, code lost:
    
        if (r14.t() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x031b, code lost:
    
        r1 = java.lang.Integer.valueOf(r14.u());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0325, code lost:
    
        r6.put("filter_id", r1);
        r6.put("event_name", r14.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0335, code lost:
    
        if (r14.D() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0337, code lost:
    
        r0 = java.lang.Boolean.valueOf(r14.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0341, code lost:
    
        r6.put("session_scoped", r0);
        r6.put("data", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0353, code lost:
    
        if (r8.j0().insertWithOnConflict("event_filters", null, r6, 5) != (-1)) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0355, code lost:
    
        r0 = r13.f8937t;
        s7.q1.l(r0);
        r0.f9050t.b(s7.v0.A(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0368, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0366, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0374, code lost:
    
        r1 = r13.f8937t;
        s7.q1.l(r1);
        r1.f9050t.c(s7.v0.A(r30), r0, "Error storing event filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0462, code lost:
    
        r8.t();
        r8.s();
        c7.c0.d(r30);
        r0 = r8.j0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05f2 A[Catch: SQLiteException -> 0x0603, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0603, blocks: (B:180:0x05db, B:182:0x05f2), top: B:179:0x05db }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(String str, byte[] bArr, String str2, String str3) {
        SQLiteDatabase sQLiteDatabase;
        z7 z7Var;
        byte[] bArr2;
        m mVar;
        ContentValues contentValues;
        boolean z10;
        t();
        s();
        c7.c0.d(str);
        z7 z7Var2 = (z7) B(str, bArr).k();
        z(str, z7Var2);
        A(str, (a8) z7Var2.d());
        a8 a8Var = (a8) z7Var2.d();
        s.e eVar = this.f8781w;
        eVar.put(str, a8Var);
        this.A.put(str, ((a8) z7Var2.f2389e).E());
        this.B.put(str, str2);
        this.C.put(str, str3);
        this.f8776r.put(str, C((a8) z7Var2.d()));
        j4 j4Var = this.f9150e;
        m mVar2 = j4Var.f8762i;
        j4.T(mVar2);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((a8) z7Var2.f2389e).A()));
        q1 q1Var = (q1) mVar2.f1478d;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            h7 h7Var = (h7) ((i7) arrayList.get(i3)).k();
            s.e eVar2 = eVar;
            if (((i7) h7Var.f2389e).z() != 0) {
                int i10 = 0;
                while (i10 < ((i7) h7Var.f2389e).z()) {
                    j7 j7Var = (j7) ((i7) h7Var.f2389e).A(i10).k();
                    j7 j7Var2 = (j7) j7Var.clone();
                    j4 j4Var2 = j4Var;
                    z7 z7Var3 = z7Var2;
                    String g = d2.g(((k7) j7Var.f2389e).v(), d2.f8580a, d2.f8585f);
                    if (g != null) {
                        j7Var2.b();
                        ((k7) j7Var2.f2389e).G(g);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i11 = 0;
                    while (i11 < ((k7) j7Var.f2389e).x()) {
                        m7 y3 = ((k7) j7Var.f2389e).y(i11);
                        boolean z11 = z10;
                        j7 j7Var3 = j7Var;
                        String g2 = d2.g(y3.A(), d2.f8586h, d2.f8587i);
                        if (g2 != null) {
                            l7 l7Var = (l7) y3.k();
                            l7Var.b();
                            ((m7) l7Var.f2389e).C(g2);
                            m7 m7Var = (m7) l7Var.d();
                            j7Var2.b();
                            ((k7) j7Var2.f2389e).H(i11, m7Var);
                            z10 = true;
                        } else {
                            z10 = z11;
                        }
                        i11++;
                        j7Var = j7Var3;
                    }
                    if (z10) {
                        h7Var.b();
                        ((i7) h7Var.f2389e).C(i10, (k7) j7Var2.d());
                        arrayList.set(i3, (i7) h7Var.d());
                    }
                    i10++;
                    j4Var = j4Var2;
                    z7Var2 = z7Var3;
                }
            }
            z7 z7Var4 = z7Var2;
            j4 j4Var3 = j4Var;
            if (((i7) h7Var.f2389e).w() != 0) {
                for (int i12 = 0; i12 < ((i7) h7Var.f2389e).w(); i12++) {
                    q7 x10 = ((i7) h7Var.f2389e).x(i12);
                    String g10 = d2.g(x10.v(), d2.f8589l, d2.f8590m);
                    if (g10 != null) {
                        p7 p7Var = (p7) x10.k();
                        p7Var.b();
                        ((q7) p7Var.f2389e).C(g10);
                        h7Var.b();
                        ((i7) h7Var.f2389e).B(i12, (q7) p7Var.d());
                        arrayList.set(i3, (i7) h7Var.d());
                    }
                }
            }
            i3++;
            eVar = eVar2;
            j4Var = j4Var3;
            z7Var2 = z7Var4;
        }
        z7 z7Var5 = z7Var2;
        s.e eVar3 = eVar;
        j4 j4Var4 = j4Var;
        mVar2.t();
        mVar2.s();
        c7.c0.d(str);
        SQLiteDatabase j02 = mVar2.j0();
        j02.beginTransaction();
        try {
            mVar2.t();
            mVar2.s();
            c7.c0.d(str);
            SQLiteDatabase j03 = mVar2.j0();
            j03.delete("property_filters", "app_id=?", new String[]{str});
            j03.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                try {
                    int i14 = i13 + 1;
                    i7 i7Var = (i7) arrayList.get(i13);
                    mVar2.t();
                    mVar2.s();
                    c7.c0.d(str);
                    c7.c0.g(i7Var);
                    if (i7Var.t()) {
                        int u2 = i7Var.u();
                        Iterator it = i7Var.y().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (!((k7) it.next()).t()) {
                                v0 v0Var = q1Var.f8937t;
                                q1.l(v0Var);
                                v0Var.f9053w.c(v0.A(str), Integer.valueOf(u2), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                                break;
                            }
                        }
                    } else {
                        v0 v0Var2 = q1Var.f8937t;
                        q1.l(v0Var2);
                        v0Var2.f9053w.b(v0.A(str), "Audience with no ID. appId");
                    }
                    i13 = i14;
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = j02;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase = j02;
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj = arrayList.get(i15);
                i15++;
                i7 i7Var2 = (i7) obj;
                arrayList2.add(i7Var2.t() ? Integer.valueOf(i7Var2.u()) : null);
            }
            c7.c0.d(str);
            mVar2.t();
            mVar2.s();
            SQLiteDatabase j04 = mVar2.j0();
            try {
                long O = mVar2.O("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(2000, q1Var.f8935r.B(str, e0.U)));
                if (O > max) {
                    ArrayList arrayList3 = new ArrayList();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList2.size()) {
                            String join = TextUtils.join(",", arrayList3);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
                            sb2.append("(");
                            sb2.append(join);
                            sb2.append(")");
                            String sb3 = sb2.toString();
                            StringBuilder sb4 = new StringBuilder(sb3.length() + 140);
                            sb4.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb4.append(sb3);
                            sb4.append(" order by rowid desc limit -1 offset ?)");
                            j04.delete("audience_filter_values", sb4.toString(), new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i16);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i16++;
                    }
                }
            } catch (SQLiteException e2) {
                v0 v0Var3 = q1Var.f8937t;
                q1.l(v0Var3);
                v0Var3.f9050t.c(v0.A(str), e2, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                z7Var5.b();
                z7Var = z7Var5;
            } catch (RuntimeException e9) {
                e = e9;
                z7Var = z7Var5;
            }
            try {
                ((a8) z7Var.f2389e).N();
                bArr2 = ((a8) z7Var.d()).a();
            } catch (RuntimeException e10) {
                e = e10;
                v0 v0Var4 = ((q1) this.f1478d).f8937t;
                q1.l(v0Var4);
                v0Var4.f9053w.c(v0.A(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                bArr2 = bArr;
                mVar = j4Var4.f8762i;
                j4.T(mVar);
                q1 q1Var2 = (q1) mVar.f1478d;
                c7.c0.d(str);
                mVar.s();
                mVar.t();
                contentValues = new ContentValues();
                contentValues.put("remote_config", bArr2);
                contentValues.put("config_last_modified_time", str2);
                contentValues.put("e_tag", str3);
                if (mVar.j0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                }
                z7Var.b();
                ((a8) z7Var.f2389e).O();
                eVar3.put(str, (a8) z7Var.d());
            }
            mVar = j4Var4.f8762i;
            j4.T(mVar);
            q1 q1Var22 = (q1) mVar.f1478d;
            c7.c0.d(str);
            mVar.s();
            mVar.t();
            contentValues = new ContentValues();
            contentValues.put("remote_config", bArr2);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (mVar.j0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    v0 v0Var5 = q1Var22.f8937t;
                    q1.l(v0Var5);
                    v0Var5.f9050t.b(v0.A(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e11) {
                v0 v0Var6 = q1Var22.f8937t;
                q1.l(v0Var6);
                v0Var6.f9050t.c(v0.A(str), e11, "Error storing remote config. appId");
            }
            z7Var.b();
            ((a8) z7Var.f2389e).O();
            eVar3.put(str, (a8) z7Var.d());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = j02;
        }
    }

    public final boolean H(String str, String str2) {
        Boolean bool;
        s();
        y(str);
        if ("1".equals(c(str, "measurement.upload.blacklist_internal")) && p4.W(str2)) {
            return true;
        }
        if ("1".equals(c(str, "measurement.upload.blacklist_public")) && p4.s0(str2)) {
            return true;
        }
        Map map = (Map) this.f8778t.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean I(String str, String str2) {
        Boolean bool;
        s();
        y(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f8779u.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List J(String str) {
        s();
        y(str);
        return (List) this.f8780v.get(str);
    }

    public final int K(String str, String str2) {
        Integer num;
        s();
        y(str);
        Map map = (Map) this.f8782x.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean L(String str) {
        s();
        y(str);
        s.e eVar = this.f8777s;
        if (eVar.get(str) != null) {
            return ((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean M(String str) {
        s();
        y(str);
        s.e eVar = this.f8777s;
        return eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id");
    }

    public final boolean N(String str, b2 b2Var) {
        s();
        y(str);
        v7 O = O(str);
        if (O == null) {
            return false;
        }
        for (s7 s7Var : O.t()) {
            if (b2Var == D(s7Var.t())) {
                return s7Var.u() == 2;
            }
        }
        return false;
    }

    public final v7 O(String str) {
        s();
        y(str);
        a8 E = E(str);
        if (E == null || !E.F()) {
            return null;
        }
        return E.G();
    }

    @Override // s7.f
    public final String c(String str, String str2) {
        s();
        y(str);
        Map map = (Map) this.f8776r.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final z1 w(String str, b2 b2Var) {
        s();
        y(str);
        v7 O = O(str);
        if (O != null) {
            Iterator it = O.y().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s7 s7Var = (s7) it.next();
                if (D(s7Var.t()) == b2Var) {
                    int u2 = s7Var.u() - 1;
                    if (u2 == 1) {
                        return z1.GRANTED;
                    }
                    if (u2 == 2) {
                        return z1.DENIED;
                    }
                }
            }
        }
        return z1.UNINITIALIZED;
    }

    public final boolean x(String str) {
        s();
        y(str);
        v7 O = O(str);
        if (O == null) {
            return false;
        }
        for (s7 s7Var : O.t()) {
            if (s7Var.t() == 3 && s7Var.v() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void y(String str) {
        t();
        s();
        c7.c0.d(str);
        s.e eVar = this.f8781w;
        if (eVar.get(str) == null) {
            m mVar = this.f9150e.f8762i;
            j4.T(mVar);
            p.e A0 = mVar.A0(str);
            s.e eVar2 = this.C;
            s.e eVar3 = this.B;
            s.e eVar4 = this.A;
            s.e eVar5 = this.f8776r;
            if (A0 != null) {
                z7 z7Var = (z7) B(str, (byte[]) A0.f7588e).k();
                z(str, z7Var);
                eVar5.put(str, C((a8) z7Var.d()));
                eVar.put(str, (a8) z7Var.d());
                A(str, (a8) z7Var.d());
                eVar4.put(str, ((a8) z7Var.f2389e).E());
                eVar3.put(str, (String) A0.f7589i);
                eVar2.put(str, (String) A0.f7590r);
                return;
            }
            eVar5.put(str, null);
            this.f8778t.put(str, null);
            this.f8777s.put(str, null);
            this.f8779u.put(str, null);
            this.f8780v.put(str, null);
            eVar.put(str, null);
            eVar4.put(str, null);
            eVar3.put(str, null);
            eVar2.put(str, null);
            this.f8782x.put(str, null);
        }
    }

    public final void z(String str, z7 z7Var) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        s.e eVar = new s.e(0);
        s.e eVar2 = new s.e(0);
        s.e eVar3 = new s.e(0);
        Iterator it = Collections.unmodifiableList(((a8) z7Var.f2389e).D()).iterator();
        while (it.hasNext()) {
            hashSet.add(((w7) it.next()).t());
        }
        q1 q1Var = (q1) this.f1478d;
        g gVar = q1Var.f8935r;
        v0 v0Var = q1Var.f8937t;
        d0 d0Var = e0.V0;
        if (gVar.D(null, d0Var)) {
            arrayList2.addAll(Collections.unmodifiableList(((a8) z7Var.f2389e).J()));
        }
        while (i3 < ((a8) z7Var.f2389e).y()) {
            x7 x7Var = (x7) ((a8) z7Var.f2389e).z(i3).k();
            if (x7Var.g().isEmpty()) {
                q1.l(v0Var);
                v0Var.f9053w.a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String g = x7Var.g();
                arrayList = arrayList2;
                String g2 = d2.g(x7Var.g(), d2.f8580a, d2.f8585f);
                if (!TextUtils.isEmpty(g2)) {
                    x7Var.b();
                    ((y7) x7Var.f2389e).A(g2);
                    z7Var.b();
                    ((a8) z7Var.f2389e).M(i3, (y7) x7Var.d());
                }
                if (((y7) x7Var.f2389e).u() && ((y7) x7Var.f2389e).v()) {
                    eVar.put(g, Boolean.TRUE);
                }
                if (((y7) x7Var.f2389e).w() && ((y7) x7Var.f2389e).x()) {
                    eVar2.put(x7Var.g(), Boolean.TRUE);
                }
                if (((y7) x7Var.f2389e).y()) {
                    if (((y7) x7Var.f2389e).z() < 2 || ((y7) x7Var.f2389e).z() > 65535) {
                        q1.l(v0Var);
                        v0Var.f9053w.c(x7Var.g(), Integer.valueOf(((y7) x7Var.f2389e).z()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        eVar3.put(x7Var.g(), Integer.valueOf(((y7) x7Var.f2389e).z()));
                    }
                }
            }
            i3++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.f8777s.put(str, hashSet);
        if (q1Var.f8935r.D(null, d0Var)) {
            this.f8780v.put(str, arrayList3);
        }
        this.f8778t.put(str, eVar);
        this.f8779u.put(str, eVar2);
        this.f8782x.put(str, eVar3);
    }

    @Override // s7.d4
    public final void v() {
    }
}
