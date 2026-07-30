package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3554m {

    /* renamed from: k, reason: collision with root package name */
    public static final KB f32629k = new KB();

    /* renamed from: a, reason: collision with root package name */
    public C3365iO f32630a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4147x f32631b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f32632c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f32633d;

    /* renamed from: e, reason: collision with root package name */
    public C3286h f32634e;

    /* renamed from: f, reason: collision with root package name */
    public Thread f32635f;

    /* renamed from: g, reason: collision with root package name */
    public L f32636g;

    /* renamed from: h, reason: collision with root package name */
    public C2777Sj f32637h;
    public Boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C3796qP f32638j;

    public C3554m(Context context) {
        C3796qP c3796qP = new C3796qP(10);
        C3286h c3286h = C3286h.f31120F;
        this.f32632c = new Object();
        this.f32633d = context != null ? context.getApplicationContext() : null;
        this.f32638j = c3796qP;
        if (c3286h != null) {
            this.f32634e = c3286h;
        } else {
            C3232g c3232g = new C3232g(c3286h);
            c3232g.a(c3286h);
            this.f32634e = new C3286h(c3232g);
        }
        this.f32637h = C2777Sj.f27609b;
        if (this.f32634e.f31121A && context == null) {
            AbstractC3217fl.I("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static Pair a(C3662o[] c3662oArr, int i) {
        for (int i4 = 0; i4 < 2; i4++) {
            C3662o c3662o = c3662oArr[i4];
            if (c3662o != null && c3662o.f33071a.f23999c == i) {
                return Pair.create(c3662o, Integer.valueOf(i4));
            }
        }
        return null;
    }

    public static final Pair b(int i, r rVar, int[][][] iArr, InterfaceC3392j interfaceC3392j, Comparator comparator) {
        RandomAccess randomAccess;
        r rVar2 = rVar;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < 2) {
            if (i == ((int[]) rVar2.f33919u)[i4]) {
                C3041cR c3041cR = ((C3041cR[]) rVar2.f33921w)[i4];
                for (int i9 = 0; i9 < c3041cR.f29710a; i9++) {
                    B8 a9 = c3041cR.a(i9);
                    C3675oC g9 = interfaceC3392j.g(i4, a9, iArr[i4][i9]);
                    int i10 = a9.f23997a;
                    boolean[] zArr = new boolean[i10];
                    int i11 = 0;
                    while (i11 < i10) {
                        int i12 = i11 + 1;
                        AbstractC3446k abstractC3446k = (AbstractC3446k) g9.get(i11);
                        int a10 = abstractC3446k.a();
                        if (!zArr[i11] && a10 != 0) {
                            if (a10 == 1) {
                                randomAccess = UB.j(abstractC3446k);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC3446k);
                                for (int i13 = i12; i13 < i10; i13++) {
                                    AbstractC3446k abstractC3446k2 = (AbstractC3446k) g9.get(i13);
                                    if (abstractC3446k2.a() == 2 && abstractC3446k.b(abstractC3446k2)) {
                                        arrayList2.add(abstractC3446k2);
                                        zArr[i13] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i11 = i12;
                    }
                }
            }
            i4++;
            rVar2 = rVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            iArr2[i14] = ((AbstractC3446k) list.get(i14)).f32228v;
        }
        AbstractC3446k abstractC3446k3 = (AbstractC3446k) list.get(0);
        return Pair.create(new C3662o(abstractC3446k3.f32227u, iArr2), Integer.valueOf(abstractC3446k3.f32226n));
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, com.anythink.basead.exoplayer.b.ar)) {
            return null;
        }
        return str;
    }

    public static int f(TP tp, String str, boolean z8) {
        if (!TextUtils.isEmpty(str) && str.equals(tp.f27766d)) {
            return 4;
        }
        String e6 = e(str);
        String e9 = e(tp.f27766d);
        if (e9 == null || e6 == null) {
            return (z8 && e9 == null) ? 1 : 0;
        }
        if (e9.startsWith(e6) || e6.startsWith(e9)) {
            return 3;
        }
        String str2 = AbstractC3548lu.f32613a;
        return e9.split("-", 2)[0].equals(e6.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(TP tp, C3675oC c3675oC) {
        int i = 0;
        while (i < c3675oC.f33117w) {
            int i4 = 0;
            while (true) {
                UB ub = tp.f27765c;
                if (i4 < ub.size()) {
                    if (((C3904sQ) ub.get(i4)).f34245b.equals(c3675oC.get(i))) {
                        return i;
                    }
                    i4++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static final C3662o h(C3041cR c3041cR, int[][] iArr, C3286h c3286h) {
        c3286h.f26562q.getClass();
        int i = 0;
        B8 b82 = null;
        C3177f c3177f = null;
        for (int i4 = 0; i4 < c3041cR.f29710a; i4++) {
            B8 a9 = c3041cR.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i9 = 0; i9 < a9.f23997a; i9++) {
                if (AbstractC3149eQ.J(iArr2[i9], c3286h.f31122B)) {
                    C3177f c3177f2 = new C3177f(a9.f24000d[i9], iArr2[i9]);
                    if (c3177f != null) {
                        if (NB.f26491a.d(c3177f2.f30562u, c3177f.f30562u).d(c3177f2.f30561n, c3177f.f30561n).e() <= 0) {
                        }
                    }
                    b82 = a9;
                    i = i9;
                    c3177f = c3177f2;
                }
            }
        }
        if (b82 == null) {
            return null;
        }
        return new C3662o(b82, new int[]{i});
    }

    public static void j(r rVar, C2683Na c2683Na) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 2; i++) {
            C3041cR c3041cR = ((C3041cR[]) rVar.f33921w)[i];
            for (int i4 = 0; i4 < c3041cR.f29710a; i4++) {
                if (c2683Na.f26566u.get(c3041cR.a(i4)) != null) {
                    throw new ClassCastException();
                }
            }
        }
        C3041cR c3041cR2 = (C3041cR) rVar.f33923y;
        for (int i9 = 0; i9 < c3041cR2.f29710a; i9++) {
            if (c2683Na.f26566u.get(c3041cR2.a(i9)) != null) {
                throw new ClassCastException();
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (hashMap.get(Integer.valueOf(((int[]) rVar.f33919u)[i10])) != null) {
                throw new ClassCastException();
            }
        }
    }

    public static void k(r rVar, C3286h c3286h, C3662o[] c3662oArr) {
        for (int i = 0; i < 2; i++) {
            C3041cR c3041cR = ((C3041cR[]) rVar.f33921w)[i];
            Map map = (Map) c3286h.f31124D.get(i);
            if (map != null && map.containsKey(c3041cR)) {
                Map map2 = (Map) c3286h.f31124D.get(i);
                if (map2 != null && map2.get(c3041cR) != null) {
                    throw new ClassCastException();
                }
                c3662oArr[i] = null;
            }
        }
    }

    public static void l(r rVar, C3286h c3286h, C3662o[] c3662oArr) {
        int i;
        while (i < 2) {
            int i4 = ((int[]) rVar.f33919u)[i];
            if (!c3286h.f31125E.get(i)) {
                i = c3286h.f26567v.contains(Integer.valueOf(i4)) ? 0 : i + 1;
            }
            c3662oArr[i] = null;
        }
    }

    public final void c() {
        L l9;
        J j9;
        Handler handler;
        synchronized (this.f32632c) {
            try {
                Thread thread = this.f32635f;
                if (thread != null) {
                    PA.U("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (l9 = this.f32636g) != null) {
            Spatializer spatializer = l9.f26078a;
            if (spatializer != null && (j9 = l9.f26081d) != null && (handler = l9.f26080c) != null) {
                spatializer.removeOnSpatializerStateChangedListener(j9);
                handler.removeCallbacksAndMessages(null);
            }
            this.f32636g = null;
        }
        this.f32630a = null;
        this.f32631b = null;
    }

    public final void d(C2777Sj c2777Sj) {
        if (this.f32637h.equals(c2777Sj)) {
            return;
        }
        this.f32637h = c2777Sj;
        i();
    }

    public final void i() {
        boolean z8;
        C3365iO c3365iO;
        L l9;
        synchronized (this.f32632c) {
            try {
                z8 = false;
                if (this.f32634e.f31121A && Build.VERSION.SDK_INT >= 32 && (l9 = this.f32636g) != null && l9.f26079b) {
                    z8 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z8 || (c3365iO = this.f32630a) == null) {
            return;
        }
        c3365iO.f31382z.c(10);
    }
}
