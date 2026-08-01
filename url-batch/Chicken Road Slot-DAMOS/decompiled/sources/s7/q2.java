package s7;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.r5;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q2 extends g0 {
    public PriorityQueue A;
    public c2 B;
    public final AtomicLong C;
    public long D;
    public final h1 E;
    public boolean F;
    public g2 G;
    public p2 H;
    public g2 I;
    public final l.d J;

    /* renamed from: i, reason: collision with root package name */
    public com.google.firebase.messaging.k f8944i;

    /* renamed from: r, reason: collision with root package name */
    public c6.s f8945r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArraySet f8946s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8947t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f8948u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f8949v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8950w;

    /* renamed from: x, reason: collision with root package name */
    public int f8951x;

    /* renamed from: y, reason: collision with root package name */
    public g2 f8952y;

    /* renamed from: z, reason: collision with root package name */
    public g2 f8953z;

    public q2(q1 q1Var) {
        super(q1Var);
        this.f8946s = new CopyOnWriteArraySet();
        this.f8949v = new Object();
        this.f8950w = false;
        this.f8951x = 1;
        this.F = true;
        this.J = new l.d(23, this);
        this.f8948u = new AtomicReference();
        this.B = c2.f8555c;
        this.D = -1L;
        this.C = new AtomicLong(0L);
        this.E = new h1(q1Var, 3);
    }

    public final void A(long j, long j3, Bundle bundle, String str, String str2) {
        s();
        boolean z10 = true;
        if (this.f8945r != null && !p4.W(str2)) {
            z10 = false;
        }
        B(str, str2, j, j3, bundle, true, z10, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x052a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(String str, String str2, long j, long j3, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        f1 f1Var;
        p4 p4Var;
        v0 v0Var;
        g7.a aVar;
        g gVar;
        q2 q2Var;
        p4 p4Var2;
        f1 f1Var2;
        f1 f1Var3;
        l.d dVar;
        boolean z13;
        String str3;
        p4 p4Var3;
        long j10;
        f1 f1Var4;
        boolean a9;
        long j11;
        b3 b3Var;
        p4 p4Var4;
        int i3;
        long j12;
        boolean z14;
        Iterator it;
        q1 q1Var;
        i6 i6Var;
        Parcel F;
        Bundle[] bundleArr;
        int i10;
        long j13 = j;
        c7.c0.d(str);
        c7.c0.g(bundle);
        s();
        t();
        q1 q1Var2 = (q1) this.f1478d;
        boolean c10 = q1Var2.c();
        t3 t3Var = q1Var2.f8939v;
        g gVar2 = q1Var2.f8935r;
        Context context = q1Var2.f8932d;
        p4 p4Var5 = q1Var2.f8940w;
        v0 v0Var2 = q1Var2.f8937t;
        if (!c10) {
            q1.l(v0Var2);
            v0Var2.A.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = q1Var2.q().f8839y;
        if (list != null && !list.contains(str2)) {
            q1.l(v0Var2);
            v0Var2.A.c(str2, str, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.f8947t) {
            this.f8947t = true;
            try {
                try {
                    (!q1Var2.f8933e ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e2) {
                    q1.l(v0Var2);
                    v0Var2.f9053w.b(e2, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                q1.l(v0Var2);
                v0Var2.f9056z.a("Tag Manager is not found and thus will not be used");
            }
        }
        p0 p0Var = q1Var2.f8941x;
        f1 f1Var5 = q1Var2.f8936s;
        g7.a aVar2 = q1Var2.f8942y;
        if (!gVar2.D(null, e0.Z0) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            aVar2.getClass();
            f1Var = f1Var5;
            p4Var = p4Var5;
            aVar = aVar2;
            v0Var = v0Var2;
            gVar = gVar2;
            q2Var = this;
            q2Var.D(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            f1Var = f1Var5;
            p4Var = p4Var5;
            v0Var = v0Var2;
            aVar = aVar2;
            gVar = gVar2;
            q2Var = this;
        }
        if (!z10 || p4.f8919x[0].equals(str2)) {
            p4Var2 = p4Var;
            f1Var2 = f1Var;
        } else {
            q1.j(p4Var);
            q1.j(f1Var);
            f1Var2 = f1Var;
            p4Var2 = p4Var;
            p4Var2.F(bundle, f1Var2.M.d());
        }
        l.d dVar2 = q2Var.J;
        if (z12 || "_iap".equals(str2)) {
            f1Var3 = f1Var2;
            dVar = dVar2;
        } else {
            q1.j(p4Var2);
            int i11 = 2;
            if (p4Var2.v0("event", str2)) {
                dVar = dVar2;
                f1Var3 = f1Var2;
                if (p4Var2.x0("event", d2.f8580a, ((q1) p4Var2.f1478d).f8935r.D(null, e0.f8622f1) ? d2.f8582c : d2.f8581b, str2)) {
                    i10 = 40;
                    if (p4Var2.y0(40, "event", str2)) {
                        i11 = 0;
                    }
                    if (i11 != 0) {
                        q1.l(v0Var);
                        v0Var.f9052v.b(p0Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                        q1.j(p4Var2);
                        p4.K(dVar, null, i11, "_ev", p4.z(str2, true, i10), str2 != null ? str2.length() : 0);
                        return;
                    }
                } else {
                    i11 = 13;
                }
            } else {
                f1Var3 = f1Var2;
                dVar = dVar2;
            }
            i10 = 40;
            if (i11 != 0) {
            }
        }
        v0 v0Var3 = v0Var;
        b3 b3Var2 = q1Var2.f8943z;
        q1.k(b3Var2);
        y2 w6 = b3Var2.w(false);
        if (w6 != null && !bundle.containsKey("_sc")) {
            w6.f9129d = true;
        }
        p4.o0(w6, bundle, z10 && !z12);
        boolean equals = "am".equals(str);
        boolean W = p4.W(str2);
        if (!z10 || q2Var.f8945r == null || W) {
            z13 = equals;
        } else {
            if (!equals) {
                q1.l(v0Var3);
                v0Var3.A.c(p0Var.a(str2), p0Var.e(bundle), "Passing event to registered event handler (FE)");
                c7.c0.g(q2Var.f8945r);
                c6.s sVar = q2Var.f8945r;
                sVar.getClass();
                try {
                    i6 i6Var2 = (i6) ((j6) sVar.f1868d);
                    Parcel F2 = i6Var2.F();
                    F2.writeString(str);
                    F2.writeString(str2);
                    r5.b(F2, bundle);
                    F2.writeLong(j13);
                    i6Var2.G(F2, 1);
                } catch (RemoteException e9) {
                    q1 q1Var3 = ((AppMeasurementDynamiteService) sVar.f1869e).f3062d;
                    if (q1Var3 != null) {
                        v0 v0Var4 = q1Var3.f8937t;
                        q1.l(v0Var4);
                        v0Var4.f9053w.b(e9, "Event interceptor threw exception");
                    }
                }
            }
            z13 = true;
        }
        if (q1Var2.h()) {
            q1.j(p4Var2);
            q1 q1Var4 = (q1) p4Var2.f1478d;
            int z02 = p4Var2.z0(str2);
            if (z02 != 0) {
                q1.l(v0Var3);
                v0Var3.f9052v.b(p0Var.a(str2), "Invalid event name. Event will not be logged (FE)");
                String z15 = p4.z(str2, true, 40);
                int length = str2 != null ? str2.length() : 0;
                q1.j(p4Var2);
                p4.K(dVar, null, z02, "_ev", z15, length);
                return;
            }
            Bundle C = p4Var2.C(str2, bundle, g7.b.e("_o", "_sn", "_sc", "_si"), z12);
            c7.c0.g(C);
            q1.k(b3Var2);
            p4 p4Var6 = p4Var2;
            if (b3Var2.w(false) == null || !"_ae".equals(str2)) {
                str3 = "_o";
                p4Var3 = p4Var6;
                j10 = 0;
            } else {
                q1.k(t3Var);
                s3 s3Var = t3Var.f9029t;
                j10 = 0;
                ((q1) s3Var.f9002d.f1478d).f8942y.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                str3 = "_o";
                long j14 = elapsedRealtime - s3Var.f9000b;
                s3Var.f9000b = elapsedRealtime;
                p4Var3 = p4Var6;
                if (j14 > 0) {
                    p4Var3.e0(C, j14);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                String string2 = C.getString("_ffr");
                int i12 = g7.c.f4285a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                f1 f1Var6 = q1Var4.f8936s;
                q1.j(f1Var6);
                if (Objects.equals(string2, f1Var6.J.d())) {
                    v0 v0Var5 = q1Var4.f8937t;
                    q1.l(v0Var5);
                    v0Var5.A.a("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    f1 f1Var7 = q1Var4.f8936s;
                    q1.j(f1Var7);
                    f1Var7.J.e(string2);
                }
            } else if ("_ae".equals(str2)) {
                f1 f1Var8 = q1Var4.f8936s;
                q1.j(f1Var8);
                String d10 = f1Var8.J.d();
                if (!TextUtils.isEmpty(d10)) {
                    C.putString("_ffr", d10);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(C);
            if (gVar.D(null, e0.S0)) {
                q1.k(t3Var);
                t3Var.s();
                a9 = t3Var.f9027r;
                f1Var4 = f1Var3;
            } else {
                q1.j(f1Var3);
                f1Var4 = f1Var3;
                a9 = f1Var4.G.a();
            }
            q1.j(f1Var4);
            if (f1Var4.D.a() > j10 && f1Var4.B(j13) && a9) {
                q1.l(v0Var3);
                v0Var3.B.a("Current session is expired, remove the session number, ID, and engagement time");
                aVar.getClass();
                j11 = j10;
                b3Var = b3Var2;
                p4Var4 = p4Var3;
                i3 = 0;
                q2Var.D(System.currentTimeMillis(), null, "auto", "_sid");
                D(System.currentTimeMillis(), null, "auto", "_sno");
                D(System.currentTimeMillis(), null, "auto", "_se");
                f1Var4.E.b(j11);
            } else {
                j11 = j10;
                b3Var = b3Var2;
                p4Var4 = p4Var3;
                i3 = 0;
            }
            if (C.getLong("extend_session", j11) == 1) {
                q1.l(v0Var3);
                v0Var3.B.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                q1.k(t3Var);
                j12 = j3;
                t3Var.f9028s.D(j13, j12);
            } else {
                j12 = j3;
            }
            ArrayList arrayList2 = new ArrayList(C.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i13 = i3; i13 < size; i13++) {
                String str4 = (String) arrayList2.get(i13);
                if (str4 != null) {
                    q1.j(p4Var4);
                    Object obj = C.get(str4);
                    if (obj instanceof Bundle) {
                        Bundle[] bundleArr2 = new Bundle[1];
                        bundleArr2[i3] = (Bundle) obj;
                        bundleArr = bundleArr2;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        C.putParcelableArray(str4, bundleArr);
                    }
                }
            }
            int i14 = i3;
            while (i14 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i14);
                String str5 = i14 != 0 ? "_ep" : str2;
                String str6 = str3;
                bundle2.putString(str6, str);
                p4 p4Var7 = p4Var4;
                if (z11) {
                    bundle2 = p4Var7.Y(bundle2);
                }
                Bundle bundle3 = bundle2;
                p4Var4 = p4Var7;
                long j15 = j13;
                u uVar = new u(str5, new t(bundle3), str, j15, j12);
                l3 o6 = q1Var2.o();
                o6.getClass();
                o6.s();
                o6.t();
                o6.E();
                o0 n10 = ((q1) o6.f1478d).n();
                n10.getClass();
                Parcel obtain = Parcel.obtain();
                c7.p.b(uVar, obtain, i3);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                if (marshall.length > 131072) {
                    v0 v0Var6 = ((q1) n10.f1478d).f8937t;
                    q1.l(v0Var6);
                    v0Var6.f9051u.a("Event is too long for local database. Sending event directly to service");
                    z14 = false;
                } else {
                    z14 = n10.z(0, marshall);
                }
                o6.G(new f3(o6, o6.I(true), z14, uVar, 1));
                if (!z13) {
                    Iterator it2 = this.f8946s.iterator();
                    while (it2.hasNext()) {
                        q4 q4Var = (q4) it2.next();
                        Bundle bundle4 = new Bundle(bundle3);
                        q4Var.getClass();
                        try {
                            i6Var = (i6) q4Var.f8957a;
                            F = i6Var.F();
                            F.writeString(str);
                            try {
                                F.writeString(str2);
                                r5.b(F, bundle4);
                                F.writeLong(j15);
                                it = it2;
                            } catch (RemoteException e10) {
                                e = e10;
                                it = it2;
                                q1Var = q4Var.f8958b.f3062d;
                                if (q1Var == null) {
                                    v0 v0Var7 = q1Var.f8937t;
                                    q1.l(v0Var7);
                                    v0Var7.f9053w.b(e, "Event listener threw exception");
                                }
                                it2 = it;
                            }
                        } catch (RemoteException e11) {
                            e = e11;
                        }
                        try {
                            i6Var.G(F, 1);
                        } catch (RemoteException e12) {
                            e = e12;
                            q1Var = q4Var.f8958b.f3062d;
                            if (q1Var == null) {
                            }
                            it2 = it;
                        }
                        it2 = it;
                    }
                }
                i14++;
                j12 = j3;
                j13 = j15;
                str3 = str6;
                i3 = 0;
            }
            q1.k(b3Var);
            if (b3Var.w(false) == null || !"_ae".equals(str2)) {
                return;
            }
            q1.k(t3Var);
            aVar.getClass();
            t3Var.f9029t.a(true, true, SystemClock.elapsedRealtime());
        }
    }

    public final void C(String str, String str2, Object obj, boolean z10, long j) {
        int i3;
        int length;
        q1 q1Var = (q1) this.f1478d;
        if (z10) {
            p4 p4Var = q1Var.f8940w;
            q1.j(p4Var);
            i3 = p4Var.B0(str2);
        } else {
            p4 p4Var2 = q1Var.f8940w;
            q1.j(p4Var2);
            if (p4Var2.v0("user property", str2)) {
                if (p4Var2.x0("user property", d2.f8589l, null, str2)) {
                    ((q1) p4Var2.f1478d).getClass();
                    if (p4Var2.y0(24, "user property", str2)) {
                        i3 = 0;
                    }
                } else {
                    i3 = 15;
                }
            }
            i3 = 6;
        }
        l.d dVar = this.J;
        if (i3 != 0) {
            q1.j(q1Var.f8940w);
            String z11 = p4.z(str2, true, 24);
            length = str2 != null ? str2.length() : 0;
            q1.j(q1Var.f8940w);
            p4.K(dVar, null, i3, "_ev", z11, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            o1 o1Var = q1Var.f8938u;
            q1.l(o1Var);
            o1Var.B(new t1(this, str3, str2, null, j, 1));
            return;
        }
        p4 p4Var3 = q1Var.f8940w;
        p4 p4Var4 = q1Var.f8940w;
        q1.j(p4Var3);
        int H = p4Var3.H(obj, str2);
        if (H != 0) {
            q1.j(p4Var4);
            String z12 = p4.z(str2, true, 24);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            q1.j(p4Var4);
            p4.K(dVar, null, H, "_ev", z12, length);
            return;
        }
        q1.j(p4Var4);
        Object I = p4Var4.I(obj, str2);
        if (I != null) {
            o1 o1Var2 = q1Var.f8938u;
            q1.l(o1Var2);
            o1Var2.B(new t1(this, str3, str2, I, j, 1));
        }
    }

    public final void D(long j, Object obj, String str, String str2) {
        String str3;
        boolean z10;
        Object obj2 = obj;
        q1 q1Var = (q1) this.f1478d;
        c7.c0.d(str);
        c7.c0.d(str2);
        s();
        t();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    long j3 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    obj2 = Long.valueOf(j3);
                    f1 f1Var = q1Var.f8936s;
                    q1.j(f1Var);
                    f1Var.A.e(j3 == 1 ? "true" : "false");
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.B.c("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                f1 f1Var2 = q1Var.f8936s;
                q1.j(f1Var2);
                f1Var2.A.e("unset");
            } else {
                str4 = str2;
            }
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.B.c("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!q1Var.c()) {
            v0 v0Var3 = q1Var.f8937t;
            q1.l(v0Var3);
            v0Var3.B.a("User property not set since app measurement is disabled");
            return;
        }
        if (q1Var.h()) {
            m4 m4Var = new m4(j, obj3, str3, str);
            l3 o6 = q1Var.o();
            o6.s();
            o6.t();
            o6.E();
            o0 n10 = ((q1) o6.f1478d).n();
            n10.getClass();
            Parcel obtain = Parcel.obtain();
            c7.p.c(m4Var, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                v0 v0Var4 = ((q1) n10.f1478d).f8937t;
                q1.l(v0Var4);
                v0Var4.f9051u.a("User property too long for local database. Sending directly to service");
                z10 = false;
            } else {
                z10 = n10.z(1, marshall);
            }
            o6.G(new f3(o6, o6.I(true), z10, m4Var, 0));
        }
    }

    public final void E() {
        s();
        t();
        q1 q1Var = (q1) this.f1478d;
        if (q1Var.h()) {
            g gVar = q1Var.f8935r;
            ((q1) gVar.f1478d).getClass();
            Boolean F = gVar.F("google_analytics_deferred_deep_link_enabled");
            if (F != null && F.booleanValue()) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.A.a("Deferred Deep Link feature enabled.");
                o1 o1Var = q1Var.f8938u;
                q1.l(o1Var);
                o1Var.B(new f2(this, 2));
            }
            l3 o6 = q1Var.o();
            o6.s();
            o6.t();
            r4 I = o6.I(true);
            o6.E();
            q1 q1Var2 = (q1) o6.f1478d;
            q1Var2.f8935r.D(null, e0.W0);
            q1Var2.n().z(3, new byte[0]);
            o6.G(new g3(o6, I, 1));
            this.F = false;
            f1 f1Var = q1Var.f8936s;
            q1.j(f1Var);
            f1Var.s();
            String string = f1Var.w().getString("previous_os_version", null);
            ((q1) f1Var.f1478d).p().u();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = f1Var.w().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            q1Var.p().u();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            z("auto", "_ou", bundle);
        }
    }

    public final void F(Bundle bundle, long j) {
        q1 q1Var = (q1) this.f1478d;
        c7.c0.g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9053w.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        d2.e(bundle2, "app_id", String.class, null);
        d2.e(bundle2, "origin", String.class, null);
        d2.e(bundle2, "name", String.class, null);
        d2.e(bundle2, "value", Object.class, null);
        d2.e(bundle2, "trigger_event_name", String.class, null);
        d2.e(bundle2, "trigger_timeout", Long.class, 0L);
        d2.e(bundle2, "timed_out_event_name", String.class, null);
        d2.e(bundle2, "timed_out_event_params", Bundle.class, null);
        d2.e(bundle2, "triggered_event_name", String.class, null);
        d2.e(bundle2, "triggered_event_params", Bundle.class, null);
        d2.e(bundle2, "time_to_live", Long.class, 0L);
        d2.e(bundle2, "expired_event_name", String.class, null);
        d2.e(bundle2, "expired_event_params", Bundle.class, null);
        c7.c0.d(bundle2.getString("name"));
        c7.c0.d(bundle2.getString("origin"));
        c7.c0.g(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        p4 p4Var = q1Var.f8940w;
        p0 p0Var = q1Var.f8941x;
        v0 v0Var2 = q1Var.f8937t;
        q1.j(p4Var);
        if (p4Var.B0(string) != 0) {
            q1.l(v0Var2);
            v0Var2.f9050t.b(p0Var.c(string), "Invalid conditional user property name");
            return;
        }
        q1.j(p4Var);
        if (p4Var.H(obj, string) != 0) {
            q1.l(v0Var2);
            v0Var2.f9050t.c(p0Var.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object I = p4Var.I(obj, string);
        if (I == null) {
            q1.l(v0Var2);
            v0Var2.f9050t.c(p0Var.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        d2.c(bundle2, I);
        long j3 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j3 > 15552000000L || j3 < 1)) {
            q1.l(v0Var2);
            v0Var2.f9050t.c(p0Var.c(string), Long.valueOf(j3), "Invalid conditional user property timeout");
            return;
        }
        long j10 = bundle2.getLong("time_to_live");
        if (j10 > 15552000000L || j10 < 1) {
            q1.l(v0Var2);
            v0Var2.f9050t.c(p0Var.c(string), Long.valueOf(j10), "Invalid conditional user property time to live");
        } else {
            o1 o1Var = q1Var.f8938u;
            q1.l(o1Var);
            o1Var.B(new m2(this, bundle2, 0));
        }
    }

    public final void G(String str, String str2, Bundle bundle) {
        q1 q1Var = (q1) this.f1478d;
        q1Var.f8942y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        c7.c0.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        o1 o1Var = q1Var.f8938u;
        q1.l(o1Var);
        o1Var.B(new m2(this, bundle2, 1));
    }

    public final String H() {
        q1 q1Var = (q1) this.f1478d;
        try {
            return d2.b(q1Var.f8932d, q1Var.D);
        } catch (IllegalStateException e2) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.b(e2, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void I(c2 c2Var, long j, boolean z10) {
        int i3 = c2Var.f8557b;
        s();
        t();
        q1 q1Var = (q1) this.f1478d;
        f1 f1Var = q1Var.f8936s;
        v0 v0Var = q1Var.f8937t;
        q1.j(f1Var);
        c2 z11 = f1Var.z();
        if (j <= this.D && c2.l(z11.f8557b, i3)) {
            q1.l(v0Var);
            v0Var.f9056z.b(c2Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        f1 f1Var2 = q1Var.f8936s;
        q1.j(f1Var2);
        f1Var2.s();
        if (!c2.l(i3, f1Var2.w().getInt("consent_source", 100))) {
            q1.l(v0Var);
            v0Var.f9056z.b(Integer.valueOf(i3), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = f1Var2.w().edit();
        edit.putString("consent_settings", c2Var.g());
        edit.putInt("consent_source", i3);
        edit.apply();
        q1.l(v0Var);
        v0Var.B.b(c2Var, "Setting storage consent(FE)");
        this.D = j;
        if (q1Var.o().C()) {
            l3 o6 = q1Var.o();
            o6.s();
            o6.t();
            o6.G(new j3(o6, 2));
        } else {
            l3 o10 = q1Var.o();
            o10.s();
            o10.t();
            if (o10.B()) {
                o10.G(new g3(o10, o10.I(false)));
            }
        }
        if (z10) {
            q1Var.o().w(new AtomicReference());
        }
    }

    public final void J(Boolean bool, boolean z10) {
        s();
        t();
        q1 q1Var = (q1) this.f1478d;
        v0 v0Var = q1Var.f8937t;
        q1.l(v0Var);
        v0Var.A.b(bool, "Setting app measurement enabled (FE)");
        f1 f1Var = q1Var.f8936s;
        q1.j(f1Var);
        f1Var.s();
        SharedPreferences.Editor edit = f1Var.w().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z10) {
            f1Var.s();
            SharedPreferences.Editor edit2 = f1Var.w().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        o1 o1Var = q1Var.f8938u;
        q1.l(o1Var);
        o1Var.s();
        if (q1Var.N || !(bool == null || bool.booleanValue())) {
            K();
        }
    }

    public final void K() {
        s();
        q1 q1Var = (q1) this.f1478d;
        f1 f1Var = q1Var.f8936s;
        v0 v0Var = q1Var.f8937t;
        g7.a aVar = q1Var.f8942y;
        q1.j(f1Var);
        String d10 = f1Var.A.d();
        if (d10 != null) {
            if ("unset".equals(d10)) {
                aVar.getClass();
                D(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(d10) ? 0L : 1L);
                aVar.getClass();
                D(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (!q1Var.c() || !this.F) {
            q1.l(v0Var);
            v0Var.A.a("Updating Scion state (FE)");
            l3 o6 = q1Var.o();
            o6.s();
            o6.t();
            o6.G(new g3(o6, o6.I(true), 3));
            return;
        }
        q1.l(v0Var);
        v0Var.A.a("Recording app launch after enabling measurement for the first time (FE)");
        E();
        t3 t3Var = q1Var.f8939v;
        q1.k(t3Var);
        t3Var.f9028s.B();
        o1 o1Var = q1Var.f8938u;
        q1.l(o1Var);
        o1Var.B(new f2(this, 1));
    }

    public final void L() {
        q1 q1Var = (q1) this.f1478d;
        if (!(q1Var.f8932d.getApplicationContext() instanceof Application) || this.f8944i == null) {
            return;
        }
        ((Application) q1Var.f8932d.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f8944i);
    }

    public final void M(Bundle bundle, int i3, long j) {
        Boolean bool;
        String str;
        z1 z1Var;
        q1 q1Var = (q1) this.f1478d;
        t();
        c2 c2Var = c2.f8555c;
        b2[] b2VarArr = a2.STORAGE.f8501d;
        int length = b2VarArr.length;
        int i10 = 0;
        while (true) {
            bool = null;
            if (i10 >= length) {
                str = null;
                break;
            }
            String str2 = b2VarArr[i10].f8521d;
            if (bundle.containsKey(str2) && (str = bundle.getString(str2)) != null) {
                if ((str.equals("granted") ? Boolean.TRUE : str.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i10++;
        }
        if (str != null) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9055y.b(str, "Ignoring invalid consent setting");
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9055y.a("Valid consent values are 'granted', 'denied'");
        }
        o1 o1Var = q1Var.f8938u;
        q1.l(o1Var);
        boolean y3 = o1Var.y();
        c2 b10 = c2.b(bundle, i3);
        Iterator it = b10.f8556a.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            z1Var = z1.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((z1) it.next()) != z1Var) {
                O(b10, y3);
                break;
            }
        }
        o c10 = o.c(bundle, i3);
        Iterator it2 = c10.f8891e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((z1) it2.next()) != z1Var) {
                N(c10, y3);
                break;
            }
        }
        if (bundle != null) {
            int ordinal = c2.d(bundle.getString("ad_personalization")).ordinal();
            if (ordinal == 2) {
                bool = Boolean.FALSE;
            } else if (ordinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str3 = i3 == -30 ? "tcf" : "app";
            if (y3) {
                D(j, bool.toString(), str3, "allow_personalized_ads");
            } else {
                C(str3, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void N(o oVar, boolean z10) {
        f8.j0 j0Var = new f8.j0(20, this, oVar, false);
        if (z10) {
            s();
            j0Var.run();
        } else {
            o1 o1Var = ((q1) this.f1478d).f8938u;
            q1.l(o1Var);
            o1Var.B(j0Var);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:75:0x0115
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void O(s7.c2 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.q2.O(s7.c2, boolean):void");
    }

    public final void P() {
        com.google.android.gms.internal.measurement.i4.a();
        q1 q1Var = (q1) this.f1478d;
        g gVar = q1Var.f8935r;
        o1 o1Var = q1Var.f8938u;
        v0 v0Var = q1Var.f8937t;
        if (gVar.D(null, e0.P0)) {
            q1.l(o1Var);
            if (o1Var.y()) {
                q1.l(v0Var);
                v0Var.f9050t.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (k5.c.l()) {
                q1.l(v0Var);
                v0Var.f9050t.a("Cannot get trigger URIs from main thread");
                return;
            }
            t();
            q1.l(v0Var);
            v0Var.B.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            q1.l(o1Var);
            o1Var.C(atomicReference, 10000L, "get trigger URIs", new l2(this, atomicReference, 5, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                q1.l(v0Var);
                v0Var.f9052v.a("Timed out waiting for get trigger URIs");
            } else {
                q1.l(o1Var);
                o1Var.B(new f8.j0(22, this, list));
            }
        }
    }

    public final PriorityQueue Q() {
        if (this.A == null) {
            this.A = new PriorityQueue(Comparator.comparing(o2.f8904a, e5.g.f3903e));
        }
        return this.A;
    }

    public final void R() {
        x3 x3Var;
        s();
        if (Q().isEmpty() || this.f8950w || (x3Var = (x3) Q().poll()) == null) {
            return;
        }
        q1 q1Var = (q1) this.f1478d;
        p4 p4Var = q1Var.f8940w;
        q1.j(p4Var);
        w4.a O = p4Var.O();
        if (O != null) {
            this.f8950w = true;
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            t0 t0Var = v0Var.B;
            String str = x3Var.f9104d;
            t0Var.b(str, "Registering trigger URI");
            ListenableFuture e2 = O.e(Uri.parse(str));
            if (e2 != null) {
                e2.a(new f8.j0(0, e2, new c6.e(this, x3Var)), new f6.b(3, this));
            } else {
                this.f8950w = false;
                Q().add(x3Var);
            }
        }
    }

    public final void S(c2 c2Var) {
        s();
        boolean z10 = (c2Var.i(b2.ANALYTICS_STORAGE) && c2Var.i(b2.AD_STORAGE)) || ((q1) this.f1478d).o().B();
        q1 q1Var = (q1) this.f1478d;
        o1 o1Var = q1Var.f8938u;
        q1.l(o1Var);
        o1Var.s();
        if (z10 != q1Var.N) {
            o1 o1Var2 = q1Var.f8938u;
            q1.l(o1Var2);
            o1Var2.s();
            q1Var.N = z10;
            f1 f1Var = ((q1) this.f1478d).f8936s;
            q1.j(f1Var);
            f1Var.s();
            Boolean valueOf = f1Var.w().contains("measurement_enabled_from_api") ? Boolean.valueOf(f1Var.w().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                J(Boolean.valueOf(z10), false);
            }
        }
    }

    @Override // s7.g0
    public final boolean v() {
        return false;
    }

    public final void w(String str, String str2, Bundle bundle) {
        long j;
        q1 q1Var = (q1) this.f1478d;
        q1Var.f8942y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (q1Var.f8935r.D(null, e0.f8619e1)) {
            q1Var.f8942y.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        x(str, str2, bundle, true, true, currentTimeMillis, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r6 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r7 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j, long j3) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z12 = !z11 || this.f8945r == null || p4.W(str2);
            String str3 = str == null ? "app" : str;
            long j10 = true != ((q1) this.f1478d).f8935r.D(null, e0.f8619e1) ? 0L : j3;
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i3 = 0; i3 < parcelableArr.length; i3++) {
                        Parcelable parcelable = parcelableArr[i3];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i3] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            o1 o1Var = ((q1) this.f1478d).f8938u;
            q1.l(o1Var);
            o1Var.B(new k2(this, str3, str2, j, j10, bundle3, z11, z12, z10));
            return;
        }
        q1 q1Var = (q1) this.f1478d;
        b3 b3Var = q1Var.f8943z;
        q1.k(b3Var);
        long j11 = true != q1Var.f8935r.D(null, e0.f8619e1) ? 0L : j3;
        synchronized (b3Var.f8531z) {
            try {
                if (!b3Var.f8530y) {
                    v0 v0Var = ((q1) b3Var.f1478d).f8937t;
                    q1.l(v0Var);
                    v0Var.f9055y.a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((q1) b3Var.f1478d).f8935r.getClass();
                    }
                    v0 v0Var2 = ((q1) b3Var.f1478d).f8937t;
                    q1.l(v0Var2);
                    v0Var2.f9055y.b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((q1) b3Var.f1478d).f8935r.getClass();
                    }
                    v0 v0Var3 = ((q1) b3Var.f1478d).f8937t;
                    q1.l(v0Var3);
                    v0Var3.f9055y.b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    p6 p6Var = b3Var.f8526u;
                    string2 = p6Var != null ? b3Var.x(p6Var.f2668e) : "Activity";
                }
                String str5 = string2;
                y2 y2Var = b3Var.f8522i;
                if (b3Var.f8527v && y2Var != null) {
                    b3Var.f8527v = false;
                    boolean equals = Objects.equals(y2Var.f9127b, str5);
                    boolean equals2 = Objects.equals(y2Var.f9126a, string);
                    if (equals && equals2) {
                        v0 v0Var4 = ((q1) b3Var.f1478d).f8937t;
                        q1.l(v0Var4);
                        v0Var4.f9055y.a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                q1 q1Var2 = (q1) b3Var.f1478d;
                v0 v0Var5 = q1Var2.f8937t;
                q1.l(v0Var5);
                v0Var5.B.c(string == null ? "null" : string, str5, "Logging screen view with name, class");
                y2 y2Var2 = b3Var.f8522i == null ? b3Var.f8523r : b3Var.f8522i;
                p4 p4Var = q1Var2.f8940w;
                q1.j(p4Var);
                y2 y2Var3 = new y2(string, str5, p4Var.q0(), true, j, j11);
                b3Var.f8522i = y2Var3;
                b3Var.f8523r = y2Var2;
                b3Var.f8528w = y2Var3;
                q1Var2.f8942y.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                o1 o1Var2 = q1Var2.f8938u;
                q1.l(o1Var2);
                o1Var2.B(new t1(b3Var, bundle2, y2Var3, y2Var2, elapsedRealtime));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final void y() {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.q2.y():void");
    }

    public final void z(String str, String str2, Bundle bundle) {
        long j;
        s();
        q1 q1Var = (q1) this.f1478d;
        q1Var.f8942y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (q1Var.f8935r.D(null, e0.f8619e1)) {
            q1Var.f8942y.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        A(currentTimeMillis, j, bundle, str, str2);
    }
}
