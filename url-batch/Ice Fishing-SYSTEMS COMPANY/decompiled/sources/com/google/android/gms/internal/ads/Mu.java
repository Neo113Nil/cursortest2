package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import q2.InterfaceC4921w0;

/* loaded from: classes2.dex */
public final /* synthetic */ class Mu implements InterfaceC3701ol, LD, InterfaceC3198fK, InterfaceC3404jB, InterfaceC3865ro {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26394n;

    /* renamed from: u, reason: collision with root package name */
    public Object f26395u;

    public Mu(int i) {
        this.f26394n = i;
        switch (i) {
            case 4:
                this.f26395u = new W7.d();
                break;
            case 5:
                break;
            default:
                this.f26395u = new int[2];
                break;
        }
    }

    public static Mu e(int i) {
        return new Mu(7, C3791qK.a(DG.a(i)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
    public /* synthetic */ Object a() {
        int i = SN.f27536z;
        return (C2940ah) this.f26395u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public void mo2b(Object obj) {
        switch (this.f26394n) {
            case 0:
                Ku ku = (Ku) this.f26395u;
                ((Pu) obj).d(ku.f26062u);
                break;
            case 9:
                ((LO) obj).l((TP) this.f26395u);
                break;
            default:
                ((LO) obj).i((RN) this.f26395u);
                break;
        }
    }

    public JSONObject c(View view) {
        if (view == null) {
            return AbstractC3981tw.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = (int[]) this.f26395u;
        view.getLocationOnScreen(iArr);
        return AbstractC3981tw.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3198fK
    public Object d(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            InterfaceC3361iK interfaceC3361iK = (InterfaceC3361iK) this.f26395u;
            if (!hasNext) {
                return interfaceC3361iK.d(str, null);
            }
            try {
                return interfaceC3361iK.d(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
    }

    public void f(Object obj, Object... objArr) {
        List asList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = asList.iterator();
            StringBuilder sb = new StringBuilder("[");
            boolean z8 = true;
            while (it.hasNext()) {
                if (!z8) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z8 = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = asList.iterator();
        if (it2.hasNext()) {
            JB jb = (JB) this.f26395u;
            if (jb == null) {
                jb = new JB();
                this.f26395u = jb;
            }
            PB pb = (PB) jb.get(obj);
            if (pb == null) {
                pb = AbstractC2917aC.n(asList instanceof Set ? Math.max(4, ((Set) asList).size()) : 4);
                JB jb2 = (JB) this.f26395u;
                if (jb2 == null) {
                    jb2 = new JB();
                    this.f26395u = jb2;
                }
                jb2.put(obj, pb);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                AbstractC2720Pd.i(obj, next);
                pb.c(next);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        Object obj2;
        Hv hv = (Hv) this.f26395u;
        if (obj != null) {
            hv.f25455k.a();
            InterfaceC4921w0 j9 = hv.j(obj);
            double d2 = !(j9 instanceof BinderC3754pk) ? 0.0d : ((BinderC3754pk) j9).f33482C;
            InterfaceC4921w0 j10 = hv.j(obj);
            obj2 = obj;
            Ov ov = new Ov(obj2, hv.f25462r, d2, j10 instanceof BinderC3754pk ? ((BinderC3754pk) j10).f33483D : 2);
            Queue queue = hv.f25454j;
            synchronized (queue) {
                queue.add(ov);
            }
            InterfaceC4921w0 j11 = hv.j(obj2);
            hv.f25462r.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (hv.f25460p.get()) {
                t2.G.f40858l.post(new RunnableC3329hp(hv, j11));
            }
            ScheduledExecutorService scheduledExecutorService = hv.f25458n;
            scheduledExecutorService.execute(new RunnableC3878s0(hv, currentTimeMillis, j11));
            if (hv.f25451f != null) {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31457I)).booleanValue()) {
                    Iu iu = hv.f25459o;
                    Pv pv = new Pv(hv, 4, false);
                    long a9 = ov.a();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    iu.a(pv, a9);
                } else {
                    scheduledExecutorService.schedule(new Pv(hv, 3, false), ov.a(), TimeUnit.MILLISECONDS);
                }
            } else {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31457I)).booleanValue()) {
                    Iu iu2 = hv.f25459o;
                    Pv pv2 = new Pv(hv, 0);
                    long a10 = ov.a();
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    iu2.a(pv2, a10);
                } else {
                    scheduledExecutorService.schedule(new Pv(hv, 0), ov.a(), TimeUnit.MILLISECONDS);
                }
            }
        } else {
            obj2 = obj;
        }
        hv.f25457m.set(false);
        if (obj2 == null || hv.f25451f == null) {
            hv.d(obj2 == null);
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        Hv hv = (Hv) this.f26395u;
        hv.f25457m.set(false);
        if ((th instanceof Fv) && ((Fv) th).f25049n == 0) {
            throw null;
        }
        hv.d(true);
    }

    public /* synthetic */ Mu(int i, Object obj) {
        this.f26394n = i;
        this.f26395u = obj;
    }

    public /* synthetic */ Mu(KO ko, RN rn) {
        this.f26394n = 10;
        this.f26395u = rn;
    }

    public /* synthetic */ Mu(KO ko, TP tp, MN mn) {
        this.f26394n = 9;
        this.f26395u = tp;
    }

    public Mu(C3755pl c3755pl, C2518Df c2518Df, Context context, View view, Activity activity, String str, HashMap hashMap, C3830r6 c3830r6, EnumC3714oy enumC3714oy) {
        this.f26394n = 3;
        C4117wN a9 = C4117wN.a(enumC3714oy);
        C4117wN b9 = C4117wN.b(str);
        C4117wN a10 = C4117wN.a(c3830r6);
        C4009uN c4009uN = (C4009uN) c2518Df.f24454v;
        C4117wN c4117wN = (C4117wN) c3755pl.f33492b;
        C4009uN c4009uN2 = (C4009uN) c3755pl.i;
        C3715oz c3715oz = new C3715oz(a10, c4009uN, c4117wN, c4009uN2, 0);
        C2495Bq c2495Bq = new C2495Bq(a10, c4009uN, c4009uN2, 7);
        C4117wN a11 = C4117wN.a(hashMap);
        C4009uN c4009uN3 = (C4009uN) c2518Df.f24454v;
        C4009uN c4009uN4 = (C4009uN) c3755pl.i;
        C3715oz c3715oz2 = new C3715oz(a10, c4009uN3, a11, c4009uN4, 2);
        C3715oz c3715oz3 = new C3715oz(a10, c4009uN3, (C4117wN) c3755pl.f33495e, c4009uN4, 1);
        Ey ey = new Ey(a10, c4009uN3, a9, a11, c4009uN4, 3);
        C2495Bq c2495Bq2 = new C2495Bq(a10, c4009uN3, c4009uN4, 8);
        C4117wN a12 = C4117wN.a(context);
        C4009uN c4009uN5 = (C4009uN) c2518Df.f24454v;
        C4009uN c4009uN6 = (C4009uN) c3755pl.i;
        C2674Mi c2674Mi = new C2674Mi(a10, c4009uN5, a9, a12, a11, c4009uN6);
        C4117wN c4117wN2 = (C4117wN) c3755pl.f33492b;
        C4117wN c4117wN3 = (C4117wN) c3755pl.f33495e;
        C3107dk c3107dk = new C3107dk(a10, c4009uN5, a11, c4117wN2, a9, c4117wN3, c4009uN6);
        C3715oz c3715oz4 = new C3715oz(a10, c4009uN5, c4117wN2, c4009uN6, 3);
        Ey ey2 = new Ey(a10, c4009uN5, a11, c4117wN2, c4009uN6, 2);
        C2843Wh c2843Wh = new C2843Wh((InterfaceC4063vN) a10, (InterfaceC4063vN) a11, (InterfaceC4063vN) c4117wN3, c4009uN6, 23);
        int i = AN.f23864c;
        ArrayList arrayList = new ArrayList(11);
        List list = Collections.EMPTY_LIST;
        arrayList.add(c3715oz);
        arrayList.add(c2495Bq);
        arrayList.add(c3715oz2);
        arrayList.add(c3715oz3);
        arrayList.add(ey);
        arrayList.add(c2495Bq2);
        arrayList.add(c2674Mi);
        arrayList.add(c3107dk);
        arrayList.add(c3715oz4);
        arrayList.add(ey2);
        arrayList.add(c2843Wh);
        AN an = new AN(arrayList, list);
        C4117wN b10 = C4117wN.b(view);
        C4117wN b11 = C4117wN.b(activity);
        C4009uN c4009uN7 = (C4009uN) c2518Df.f24454v;
        C4009uN c4009uN8 = (C4009uN) c3755pl.i;
        Ey ey3 = new Ey(a10, c4009uN7, b10, b11, c4009uN8, 1);
        C4009uN a13 = C4009uN.a(new C2996bi(a12, 8));
        Ht ht = new Ht(a10, c4009uN7, a13, b10, c4009uN8, 3);
        ArrayList arrayList2 = new ArrayList(11);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(c3715oz);
        arrayList2.add(c2495Bq);
        arrayList2.add(c3715oz3);
        arrayList2.add(ey3);
        arrayList2.add(ht);
        arrayList2.add(ey);
        arrayList2.add(c2495Bq2);
        arrayList2.add(c2674Mi);
        arrayList2.add(c3107dk);
        arrayList2.add(c3715oz4);
        arrayList2.add(ey2);
        AN an2 = new AN(arrayList2, list2);
        Ht ht2 = new Ht(a10, (C4009uN) c2518Df.f24454v, a11, a13, (C4009uN) c3755pl.i, 2);
        ArrayList arrayList3 = new ArrayList(12);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(c3715oz);
        arrayList3.add(c2495Bq);
        arrayList3.add(c3715oz3);
        arrayList3.add(ey3);
        arrayList3.add(ht);
        arrayList3.add(ey);
        arrayList3.add(c2495Bq2);
        arrayList3.add(c2674Mi);
        arrayList3.add(c3107dk);
        arrayList3.add(c3715oz4);
        arrayList3.add(ey2);
        arrayList3.add(ht2);
        this.f26395u = C4009uN.a(new C3483kj((C4009uN) c3755pl.f33499j, (C4009uN) c3755pl.f33501l, (C4009uN) c2518Df.f24454v, a9, b9, a10, an, an2, new AN(arrayList3, list3), (C4009uN) c3755pl.i, 5));
    }

    public Mu(Hv hv) {
        this.f26394n = 1;
        Objects.requireNonNull(hv);
        this.f26395u = hv;
    }

    public /* synthetic */ Mu(C4119wP c4119wP) {
        this.f26394n = 11;
        Objects.requireNonNull(c4119wP);
        this.f26395u = c4119wP;
    }
}
