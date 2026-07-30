package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dj3 extends vp3 implements dc3 {
    public final hi p;
    public final hi q;
    public final hi r;
    public final hi s;
    public final hi t;
    public final hi u;
    public final j72 v;
    public final ot2 w;
    public final hi x;
    public final hi y;
    public final hi z;

    public dj3(oq3 oq3Var) {
        super(oq3Var);
        this.p = new hi(0);
        this.q = new hi(0);
        this.r = new hi(0);
        this.s = new hi(0);
        this.t = new hi(0);
        this.x = new hi(0);
        this.y = new hi(0);
        this.z = new hi(0);
        this.u = new hi(0);
        this.v = new j72(this);
        this.w = new ot2(18, this);
    }

    public static final hi G(mh3 mh3Var) {
        hi hiVar = new hi(0);
        for (uh3 uh3Var : mh3Var.t()) {
            hiVar.put(uh3Var.p(), uh3Var.q());
        }
        return hiVar;
    }

    public static final vk3 H(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return vk3.AD_STORAGE;
        }
        if (i2 == 2) {
            return vk3.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return vk3.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return vk3.AD_PERSONALIZATION;
    }

    public final sk3 A(String str, vk3 vk3Var) {
        v();
        C(str);
        dh3 R = R(str);
        if (R != null) {
            Iterator it = R.u().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rg3 rg3Var = (rg3) it.next();
                if (H(rg3Var.p()) == vk3Var) {
                    int q = rg3Var.q() - 1;
                    if (q == 1) {
                        return sk3.GRANTED;
                    }
                    if (q == 2) {
                        return sk3.DENIED;
                    }
                }
            }
        }
        return sk3.UNINITIALIZED;
    }

    public final boolean B(String str) {
        v();
        C(str);
        dh3 R = R(str);
        if (R == null) {
            return false;
        }
        for (rg3 rg3Var : R.p()) {
            if (rg3Var.p() == 3 && rg3Var.r() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void C(String str) {
        x();
        v();
        ll3.s(str);
        hi hiVar = this.t;
        if (hiVar.get(str) == null) {
            tc3 tc3Var = this.n.o;
            oq3.U(tc3Var);
            t13 C0 = tc3Var.C0(str);
            hi hiVar2 = this.z;
            hi hiVar3 = this.y;
            hi hiVar4 = this.x;
            hi hiVar5 = this.p;
            if (C0 != null) {
                kh3 kh3Var = (kh3) F(str, (byte[]) C0.o).i();
                D(str, kh3Var);
                hiVar5.put(str, G((mh3) kh3Var.d()));
                hiVar.put(str, (mh3) kh3Var.d());
                E(str, (mh3) kh3Var.d());
                hiVar4.put(str, ((mh3) kh3Var.n).A());
                hiVar3.put(str, (String) C0.p);
                hiVar2.put(str, (String) C0.n);
                return;
            }
            hiVar5.put(str, null);
            this.r.put(str, null);
            this.q.put(str, null);
            this.s.put(str, null);
            hiVar.put(str, null);
            hiVar4.put(str, null);
            hiVar3.put(str, null);
            hiVar2.put(str, null);
            this.u.put(str, null);
        }
    }

    public final void D(String str, kh3 kh3Var) {
        pj3 pj3Var = (pj3) this.m;
        HashSet hashSet = new HashSet();
        hi hiVar = new hi(0);
        hi hiVar2 = new hi(0);
        hi hiVar3 = new hi(0);
        Iterator it = Collections.unmodifiableList(((mh3) kh3Var.n).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((fh3) it.next()).p());
        }
        for (int i = 0; i < ((mh3) kh3Var.n).u(); i++) {
            hh3 hh3Var = (hh3) ((mh3) kh3Var.n).v(i).i();
            if (hh3Var.g().isEmpty()) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.u.b("EventConfig contained null event name");
            } else {
                String g = hh3Var.g();
                String p = th2.p(hh3Var.g(), s93.n, s93.p);
                if (!TextUtils.isEmpty(p)) {
                    hh3Var.b();
                    ((ih3) hh3Var.n).w(p);
                    kh3Var.b();
                    ((mh3) kh3Var.n).H(i, (ih3) hh3Var.d());
                }
                if (((ih3) hh3Var.n).q() && ((ih3) hh3Var.n).r()) {
                    hiVar.put(g, Boolean.TRUE);
                }
                if (((ih3) hh3Var.n).s() && ((ih3) hh3Var.n).t()) {
                    hiVar2.put(hh3Var.g(), Boolean.TRUE);
                }
                if (((ih3) hh3Var.n).u()) {
                    if (((ih3) hh3Var.n).v() < 2 || ((ih3) hh3Var.n).v() > 65535) {
                        vh3 vh3Var2 = pj3Var.r;
                        pj3.m(vh3Var2);
                        vh3Var2.u.d(hh3Var.g(), Integer.valueOf(((ih3) hh3Var.n).v()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        hiVar3.put(hh3Var.g(), Integer.valueOf(((ih3) hh3Var.n).v()));
                    }
                }
            }
        }
        this.q.put(str, hashSet);
        this.r.put(str, hiVar);
        this.s.put(str, hiVar2);
        this.u.put(str, hiVar3);
    }

    public final void E(String str, mh3 mh3Var) {
        pj3 pj3Var = (pj3) this.m;
        int y = mh3Var.y();
        j72 j72Var = this.v;
        if (y == 0) {
            j72Var.e(str);
            return;
        }
        vh3 vh3Var = pj3Var.r;
        pj3.m(vh3Var);
        vh3Var.z.c(Integer.valueOf(mh3Var.y()), "EES programs found");
        int i = 0;
        lk3 lk3Var = (lk3) mh3Var.x().get(0);
        try {
            xd3 xd3Var = new xd3();
            js0 js0Var = xd3Var.a;
            ((HashMap) ((ot2) js0Var.p).n).put("internal.remoteConfig", new xi3(this, str, 2));
            ((HashMap) ((ot2) js0Var.p).n).put("internal.appMetadata", new xi3(this, str, i));
            ((HashMap) ((ot2) js0Var.p).n).put("internal.logger", new zi3(this));
            xd3Var.b(lk3Var);
            j72Var.d(str, xd3Var);
            pj3.m(vh3Var);
            g10 g10Var = vh3Var.z;
            g10Var.d(str, Integer.valueOf(lk3Var.q().q()), "EES program loaded for appId, activities");
            for (ik3 ik3Var : lk3Var.q().p()) {
                pj3.m(vh3Var);
                g10Var.c(ik3Var.p(), "EES program activity");
            }
        } catch (re3 unused) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.c(str, "Failed to load EES program. appId");
        }
    }

    public final mh3 F(String str, byte[] bArr) {
        pj3 pj3Var = (pj3) this.m;
        if (bArr == null) {
            return mh3.G();
        }
        try {
            mh3 mh3Var = (mh3) ((kh3) bi3.j0(mh3.F(), bArr)).d();
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.z.d(mh3Var.p() ? Long.valueOf(mh3Var.q()) : null, mh3Var.r() ? mh3Var.s() : null, "Parsed config. version, gmp_app_id");
            return mh3Var;
        } catch (RuntimeException e) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.u.d(vh3.E(str), e, "Unable to merge remote config. appId");
            return mh3.G();
        } catch (un3 e2) {
            vh3 vh3Var3 = pj3Var.r;
            pj3.m(vh3Var3);
            vh3Var3.u.d(vh3.E(str), e2, "Unable to merge remote config. appId");
            return mh3.G();
        }
    }

    public final mh3 I(String str) {
        x();
        v();
        ll3.s(str);
        C(str);
        return (mh3) this.t.get(str);
    }

    public final String J(String str) {
        v();
        C(str);
        return (String) this.x.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x033c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0320, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02cb, code lost:
    
        r0 = r13.r;
        defpackage.pj3.m(r0);
        r0 = r0.u;
        r3 = defpackage.vh3.E(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e0, code lost:
    
        if (r14.p() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02e2, code lost:
    
        r5 = java.lang.Integer.valueOf(r14.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02ef, code lost:
    
        r0.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ee, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02eb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x061d, code lost:
    
        r24.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0620, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0380, code lost:
    
        r27 = r6;
        r5 = r5.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0390, code lost:
    
        if (r5.hasNext() == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0392, code lost:
    
        r6 = (defpackage.pg3) r5.next();
        r8.x();
        r8.v();
        defpackage.ll3.s(r30);
        defpackage.ll3.v(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03ac, code lost:
    
        if (r6.r().isEmpty() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03d8, code lost:
    
        r14 = r6.a();
        r23 = r5;
        r5 = new android.content.ContentValues();
        r5.put(r3, r30);
        r26 = r3;
        r5.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03f3, code lost:
    
        if (r6.p() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03f5, code lost:
    
        r3 = java.lang.Integer.valueOf(r6.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03ff, code lost:
    
        r5.put(r0, r3);
        r28 = r0;
        r5.put("property_name", r6.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0411, code lost:
    
        if (r6.v() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0413, code lost:
    
        r3 = java.lang.Boolean.valueOf(r6.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x041d, code lost:
    
        r5.put("session_scoped", r3);
        r5.put("data", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x042f, code lost:
    
        if (r8.l0().insertWithOnConflict("property_filters", null, r5, 5) != (-1)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0444, code lost:
    
        r5 = r23;
        r3 = r26;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0431, code lost:
    
        r0 = r13.r;
        defpackage.pj3.m(r0);
        r0.r.c(defpackage.vh3.E(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0442, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x044c, code lost:
    
        r1 = r13.r;
        defpackage.pj3.m(r1);
        r1.r.d(defpackage.vh3.E(r30), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x041c, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03fe, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03ae, code lost:
    
        r0 = r13.r;
        defpackage.pj3.m(r0);
        r0 = r0.u;
        r3 = defpackage.vh3.E(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03c3, code lost:
    
        if (r6.p() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03c5, code lost:
    
        r5 = java.lang.Integer.valueOf(r6.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03cf, code lost:
    
        r0.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03ce, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0260, code lost:
    
        r0 = r5.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x026c, code lost:
    
        if (r0.hasNext() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0278, code lost:
    
        if (((defpackage.pg3) r0.next()).p() != false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027a, code lost:
    
        r0 = r13.r;
        defpackage.pj3.m(r0);
        r0.u.d(defpackage.vh3.E(r30), java.lang.Integer.valueOf(r7), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x028f, code lost:
    
        r0 = r5.u().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0297, code lost:
    
        r14 = r0.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x029b, code lost:
    
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02ad, code lost:
    
        if (r14 == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02af, code lost:
    
        r14 = (defpackage.ig3) r23.next();
        r8.x();
        r8.v();
        defpackage.ll3.s(r30);
        defpackage.ll3.v(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02c9, code lost:
    
        if (r14.r().isEmpty() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02fa, code lost:
    
        r26 = r5;
        r5 = r14.a();
        r27 = r6;
        r6 = new android.content.ContentValues();
        r6.put("app_id", r30);
        r6.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0315, code lost:
    
        if (r14.p() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0317, code lost:
    
        r1 = java.lang.Integer.valueOf(r14.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0321, code lost:
    
        r6.put("filter_id", r1);
        r6.put("event_name", r14.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0331, code lost:
    
        if (r14.z() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0333, code lost:
    
        r0 = java.lang.Boolean.valueOf(r14.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x033d, code lost:
    
        r6.put("session_scoped", r0);
        r6.put("data", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x034f, code lost:
    
        if (r8.l0().insertWithOnConflict("event_filters", null, r6, 5) != (-1)) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0351, code lost:
    
        r0 = r13.r;
        defpackage.pj3.m(r0);
        r0.r.c(defpackage.vh3.E(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0361, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x036d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x036e, code lost:
    
        r1 = r13.r;
        defpackage.pj3.m(r1);
        r1.r.d(defpackage.vh3.E(r30), r0, "Error storing event filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x045c, code lost:
    
        r8.x();
        r8.v();
        defpackage.ll3.s(r30);
        r0 = r8.l0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x047f, code lost:
    
        r1 = r24;
        r3 = r25;
        r0 = r27;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05e5 A[Catch: SQLiteException -> 0x05f6, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x05f6, blocks: (B:174:0x05ce, B:176:0x05e5), top: B:173:0x05ce }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(String str, byte[] bArr, String str2, String str3) {
        SQLiteDatabase sQLiteDatabase;
        kh3 kh3Var;
        byte[] bArr2;
        tc3 tc3Var;
        ContentValues contentValues;
        boolean z;
        x();
        v();
        ll3.s(str);
        kh3 kh3Var2 = (kh3) F(str, bArr).i();
        D(str, kh3Var2);
        E(str, (mh3) kh3Var2.d());
        mh3 mh3Var = (mh3) kh3Var2.d();
        hi hiVar = this.t;
        hiVar.put(str, mh3Var);
        this.x.put(str, ((mh3) kh3Var2.n).A());
        this.y.put(str, str2);
        this.z.put(str, str3);
        this.p.put(str, G((mh3) kh3Var2.d()));
        oq3 oq3Var = this.n;
        tc3 tc3Var2 = oq3Var.o;
        oq3.U(tc3Var2);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((mh3) kh3Var2.n).w()));
        pj3 pj3Var = (pj3) tc3Var2.m;
        int i = 0;
        while (i < arrayList.size()) {
            eg3 eg3Var = (eg3) ((fg3) arrayList.get(i)).i();
            hi hiVar2 = hiVar;
            if (((fg3) eg3Var.n).v() != 0) {
                int i2 = 0;
                while (i2 < ((fg3) eg3Var.n).v()) {
                    hg3 hg3Var = (hg3) ((fg3) eg3Var.n).w(i2).i();
                    hg3 hg3Var2 = (hg3) hg3Var.clone();
                    oq3 oq3Var2 = oq3Var;
                    kh3 kh3Var3 = kh3Var2;
                    String p = th2.p(((ig3) hg3Var.n).r(), s93.n, s93.p);
                    if (p != null) {
                        hg3Var2.b();
                        ((ig3) hg3Var2.n).C(p);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < ((ig3) hg3Var.n).t()) {
                        kg3 u = ((ig3) hg3Var.n).u(i3);
                        boolean z2 = z;
                        hg3 hg3Var3 = hg3Var;
                        String p2 = th2.p(u.w(), bd3.h, bd3.i);
                        if (p2 != null) {
                            jg3 jg3Var = (jg3) u.i();
                            jg3Var.b();
                            ((kg3) jg3Var.n).y(p2);
                            kg3 kg3Var = (kg3) jg3Var.d();
                            hg3Var2.b();
                            ((ig3) hg3Var2.n).D(i3, kg3Var);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i3++;
                        hg3Var = hg3Var3;
                    }
                    if (z) {
                        eg3Var.b();
                        ((fg3) eg3Var.n).y(i2, (ig3) hg3Var2.d());
                        arrayList.set(i, (fg3) eg3Var.d());
                    }
                    i2++;
                    oq3Var = oq3Var2;
                    kh3Var2 = kh3Var3;
                }
            }
            kh3 kh3Var4 = kh3Var2;
            oq3 oq3Var3 = oq3Var;
            if (((fg3) eg3Var.n).s() != 0) {
                for (int i4 = 0; i4 < ((fg3) eg3Var.n).s(); i4++) {
                    pg3 t = ((fg3) eg3Var.n).t(i4);
                    String p3 = th2.p(t.r(), tk3.k, tk3.l);
                    if (p3 != null) {
                        og3 og3Var = (og3) t.i();
                        og3Var.b();
                        ((pg3) og3Var.n).y(p3);
                        eg3Var.b();
                        ((fg3) eg3Var.n).x(i4, (pg3) og3Var.d());
                        arrayList.set(i, (fg3) eg3Var.d());
                    }
                }
            }
            i++;
            hiVar = hiVar2;
            oq3Var = oq3Var3;
            kh3Var2 = kh3Var4;
        }
        kh3 kh3Var5 = kh3Var2;
        hi hiVar3 = hiVar;
        oq3 oq3Var4 = oq3Var;
        tc3Var2.x();
        tc3Var2.v();
        ll3.s(str);
        SQLiteDatabase l0 = tc3Var2.l0();
        l0.beginTransaction();
        try {
            tc3Var2.x();
            tc3Var2.v();
            ll3.s(str);
            SQLiteDatabase l02 = tc3Var2.l0();
            l02.delete("property_filters", "app_id=?", new String[]{str});
            l02.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                int i6 = i5 + 1;
                fg3 fg3Var = (fg3) arrayList.get(i5);
                tc3Var2.x();
                tc3Var2.v();
                ll3.s(str);
                ll3.v(fg3Var);
                if (fg3Var.p()) {
                    int q = fg3Var.q();
                    Iterator it = fg3Var.u().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!((ig3) it.next()).p()) {
                            vh3 vh3Var = pj3Var.r;
                            pj3.m(vh3Var);
                            vh3Var.u.d(vh3.E(str), Integer.valueOf(q), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                            break;
                        }
                    }
                } else {
                    vh3 vh3Var2 = pj3Var.r;
                    pj3.m(vh3Var2);
                    vh3Var2.u.c(vh3.E(str), "Audience with no ID. appId");
                }
                i5 = i6;
            }
            sQLiteDatabase = l0;
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj = arrayList.get(i7);
                i7++;
                fg3 fg3Var2 = (fg3) obj;
                arrayList2.add(fg3Var2.p() ? Integer.valueOf(fg3Var2.q()) : null);
            }
            ll3.s(str);
            tc3Var2.x();
            tc3Var2.v();
            SQLiteDatabase l03 = tc3Var2.l0();
            try {
                long g0 = tc3Var2.g0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(2000, pj3Var.p.E(str, ug3.U)));
                if (g0 > max) {
                    ArrayList arrayList3 = new ArrayList();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList2.size()) {
                            String join = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
                            sb.append("(");
                            sb.append(join);
                            sb.append(")");
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(sb2.length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(sb2);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            l03.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i8);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i8++;
                    }
                }
            } catch (SQLiteException e) {
                vh3 vh3Var3 = pj3Var.r;
                pj3.m(vh3Var3);
                vh3Var3.r.d(vh3.E(str), e, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                kh3Var5.b();
                kh3Var = kh3Var5;
                try {
                    ((mh3) kh3Var.n).I();
                    bArr2 = ((mh3) kh3Var.d()).a();
                } catch (RuntimeException e2) {
                    e = e2;
                    vh3 vh3Var4 = ((pj3) this.m).r;
                    pj3.m(vh3Var4);
                    vh3Var4.u.d(vh3.E(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArr2 = bArr;
                    tc3Var = oq3Var4.o;
                    oq3.U(tc3Var);
                    pj3 pj3Var2 = (pj3) tc3Var.m;
                    ll3.s(str);
                    tc3Var.v();
                    tc3Var.x();
                    contentValues = new ContentValues();
                    contentValues.put("remote_config", bArr2);
                    contentValues.put("config_last_modified_time", str2);
                    contentValues.put("e_tag", str3);
                    if (tc3Var.l0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    }
                    kh3Var.b();
                    ((mh3) kh3Var.n).J();
                    hiVar3.put(str, (mh3) kh3Var.d());
                }
            } catch (RuntimeException e3) {
                e = e3;
                kh3Var = kh3Var5;
            }
            tc3Var = oq3Var4.o;
            oq3.U(tc3Var);
            pj3 pj3Var22 = (pj3) tc3Var.m;
            ll3.s(str);
            tc3Var.v();
            tc3Var.x();
            contentValues = new ContentValues();
            contentValues.put("remote_config", bArr2);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (tc3Var.l0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    vh3 vh3Var5 = pj3Var22.r;
                    pj3.m(vh3Var5);
                    vh3Var5.r.c(vh3.E(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e4) {
                vh3 vh3Var6 = pj3Var22.r;
                pj3.m(vh3Var6);
                vh3Var6.r.d(vh3.E(str), e4, "Error storing remote config. appId");
            }
            kh3Var.b();
            ((mh3) kh3Var.n).J();
            hiVar3.put(str, (mh3) kh3Var.d());
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = l0;
        }
    }

    public final boolean L(String str, String str2) {
        Boolean bool;
        v();
        C(str);
        if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(b(str, "measurement.upload.blacklist_internal")) && zq3.V(str2)) {
            return true;
        }
        if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(b(str, "measurement.upload.blacklist_public")) && zq3.v0(str2)) {
            return true;
        }
        Map map = (Map) this.r.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean M(String str, String str2) {
        Boolean bool;
        v();
        C(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map map = (Map) this.s.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int N(String str, String str2) {
        Integer num;
        v();
        C(str);
        Map map = (Map) this.u.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean O(String str) {
        v();
        C(str);
        hi hiVar = this.q;
        if (hiVar.get(str) != null) {
            return ((Set) hiVar.get(str)).contains("os_version") || ((Set) hiVar.get(str)).contains(DeviceRequestsHelper.DEVICE_INFO_PARAM);
        }
        return false;
    }

    public final boolean P(String str) {
        v();
        C(str);
        hi hiVar = this.q;
        return hiVar.get(str) != null && ((Set) hiVar.get(str)).contains("app_instance_id");
    }

    public final boolean Q(String str, vk3 vk3Var) {
        v();
        C(str);
        dh3 R = R(str);
        if (R == null) {
            return false;
        }
        for (rg3 rg3Var : R.p()) {
            if (vk3Var == H(rg3Var.p())) {
                return rg3Var.q() == 2;
            }
        }
        return false;
    }

    public final dh3 R(String str) {
        v();
        C(str);
        mh3 I = I(str);
        if (I == null || !I.B()) {
            return null;
        }
        return I.C();
    }

    @Override // defpackage.dc3
    public final String b(String str, String str2) {
        v();
        C(str);
        Map map = (Map) this.p.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // defpackage.vp3
    public final void z() {
    }
}
