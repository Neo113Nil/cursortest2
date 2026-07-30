package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import com.anythink.core.api.ErrorCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.nm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3648nm extends AbstractC2539Ej {
    public static final C3675oC J;

    /* renamed from: A, reason: collision with root package name */
    public boolean f32996A;

    /* renamed from: B, reason: collision with root package name */
    public final C2535Ef f32997B;

    /* renamed from: C, reason: collision with root package name */
    public final C3348i7 f32998C;

    /* renamed from: D, reason: collision with root package name */
    public final C5107a f32999D;

    /* renamed from: E, reason: collision with root package name */
    public final Context f33000E;

    /* renamed from: F, reason: collision with root package name */
    public final C3756pm f33001F;

    /* renamed from: G, reason: collision with root package name */
    public final Gr f33002G;

    /* renamed from: H, reason: collision with root package name */
    public final HashMap f33003H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f33004I;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f33005l;

    /* renamed from: m, reason: collision with root package name */
    public final C3917sm f33006m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4079vm f33007n;

    /* renamed from: o, reason: collision with root package name */
    public final C2474Am f33008o;

    /* renamed from: p, reason: collision with root package name */
    public final C4025um f33009p;

    /* renamed from: q, reason: collision with root package name */
    public final C4133wm f33010q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC3901sN f33011r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC3901sN f33012s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC3901sN f33013t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3901sN f33014u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC3901sN f33015v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractBinderC3186f8 f33016w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f33017x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f33018y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f33019z;

    static {
        SB sb = UB.f27942u;
        Object[] objArr = {"3010", "3008", "1005", "1009", ErrorCode.loadInShowingFilter, ErrorCode.inRequestFailPacing};
        PA.o(objArr, 6);
        J = UB.p(objArr, 6);
    }

    public C3648nm(S0.q qVar, Executor executor, C3917sm c3917sm, InterfaceC4079vm interfaceC4079vm, C2474Am c2474Am, C4025um c4025um, C4133wm c4133wm, InterfaceC3901sN interfaceC3901sN, InterfaceC3901sN interfaceC3901sN2, InterfaceC3901sN interfaceC3901sN3, InterfaceC3901sN interfaceC3901sN4, InterfaceC3901sN interfaceC3901sN5, C2535Ef c2535Ef, C3348i7 c3348i7, C5107a c5107a, Context context, C3756pm c3756pm, Gr gr) {
        super(qVar);
        this.f33005l = executor;
        this.f33006m = c3917sm;
        this.f33007n = interfaceC4079vm;
        this.f33008o = c2474Am;
        this.f33009p = c4025um;
        this.f33010q = c4133wm;
        this.f33011r = interfaceC3901sN;
        this.f33012s = interfaceC3901sN2;
        this.f33013t = interfaceC3901sN3;
        this.f33014u = interfaceC3901sN4;
        this.f33015v = interfaceC3901sN5;
        this.f32997B = c2535Ef;
        this.f32998C = c3348i7;
        this.f32999D = c5107a;
        this.f33000E = context;
        this.f33001F = c3756pm;
        this.f33002G = gr;
        this.f33003H = new HashMap();
        this.f33004I = new ArrayList();
    }

    public static boolean d(View view) {
        C3151ea c3151ea = AbstractC3368ia.Yb;
        q2.r rVar = q2.r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        t2.G g9 = p2.j.f39798C.f39803c;
        long Q3 = t2.G.Q(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return Q3 >= ((long) ((Integer) rVar.f40119c.a(AbstractC3368ia.Zb)).intValue());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2539Ej
    public final void a() {
        RunnableC3486km runnableC3486km = new RunnableC3486km(this, 1);
        Executor executor = this.f33005l;
        executor.execute(runnableC3486km);
        if (this.f33006m.q() != 7) {
            InterfaceC4079vm interfaceC4079vm = this.f33007n;
            Objects.requireNonNull(interfaceC4079vm);
            executor.execute(new RunnableC3376ij(6, interfaceC4079vm));
        }
        super.a();
    }

    public final synchronized void c(final int i, final View view) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Xc)).booleanValue()) {
            AbstractBinderC3186f8 abstractBinderC3186f8 = this.f33016w;
            if (abstractBinderC3186f8 == null) {
                int i4 = t2.C.f40822b;
                u2.i.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z8 = abstractBinderC3186f8 instanceof ViewTreeObserverOnGlobalLayoutListenerC4187xm;
                this.f33005l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mm
                    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
                    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
                    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C3648nm c3648nm = C3648nm.this;
                        ?? r12 = c3648nm.f33016w;
                        if (r12 == 0) {
                            int i9 = t2.C.f40822b;
                            u2.i.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                            return;
                        }
                        View A02 = r12.A0();
                        Map l9 = c3648nm.f33016w.l();
                        Map h9 = c3648nm.f33016w.h();
                        ImageView.ScaleType k6 = c3648nm.k();
                        c3648nm.f33007n.l(view, A02, l9, h9, z8, k6, i);
                    }
                });
            }
        }
    }

    public final C3330hq e(String str, boolean z8) {
        boolean z9;
        String str2;
        int i;
        int i4;
        C4025um c4025um = this.f33009p;
        if (c4025um.c() && !TextUtils.isEmpty(str)) {
            C3917sm c3917sm = this.f33006m;
            InterfaceC3858rh j9 = c3917sm.j();
            InterfaceC3858rh h9 = c3917sm.h();
            if (j9 == null && h9 == null) {
                int i9 = t2.C.f40822b;
                u2.i.f("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            c4025um.f();
            int H6 = c4025um.f().H();
            int i10 = H6 - 1;
            boolean z10 = false;
            if (i10 != 0) {
                if (i10 != 1) {
                    String str3 = H6 != 1 ? H6 != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                    String o9 = D.y.o(new StringBuilder(str3.length() + 49), "Unknown omid media type: ", str3, ". Not initializing Omid.");
                    int i11 = t2.C.f40822b;
                    u2.i.f(o9);
                    return null;
                }
                if (j9 == null) {
                    int i12 = t2.C.f40822b;
                    u2.i.f("Omid media type was display but there was no display webview.");
                    return null;
                }
                z9 = false;
                z10 = true;
            } else if (h9 != null) {
                z9 = true;
            } else {
                int i13 = t2.C.f40822b;
                u2.i.f("Omid media type was video but there was no video webview.");
            }
            if (z10) {
                str2 = null;
            } else if (z9) {
                str2 = "javascript";
                j9 = h9;
            } else {
                j9 = null;
                str2 = null;
            }
            if (j9 == null) {
                int i14 = t2.C.f40822b;
                u2.i.f("Webview is null in InternalNativeAd");
                return null;
            }
            Context context = this.f33000E;
            p2.j jVar = p2.j.f39798C;
            jVar.f39823x.getClass();
            if (!C3431jl.f(context)) {
                int i15 = t2.C.f40822b;
                u2.i.f("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            C5107a c5107a = this.f32999D;
            int i16 = c5107a.f41218u;
            int i17 = c5107a.f41219v;
            StringBuilder sb = new StringBuilder(CL.b(i16, 1) + String.valueOf(i17).length());
            sb.append(i16);
            sb.append(com.anythink.core.common.d.j.f12535z);
            sb.append(i17);
            String sb2 = sb.toString();
            if (z9) {
                i4 = 3;
                i = 2;
            } else {
                i = c3917sm.q() == 3 ? 4 : 3;
                i4 = 2;
            }
            C3431jl c3431jl = jVar.f39823x;
            WebView s3 = j9.s();
            String str4 = this.f24804b.f28161l0;
            c3431jl.getClass();
            C3330hq c3330hq = (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31685h6)).booleanValue() && AbstractC2655Lg.f26175K.f26640u) ? (C3330hq) C3431jl.p(new N3.a(str, sb2, str2, i4, s3, str4, i)) : null;
            if (c3330hq == null) {
                int i18 = t2.C.f40822b;
                u2.i.f("Failed to create omid session in InternalNativeAd");
                return null;
            }
            synchronized (c3917sm) {
                c3917sm.f34285l = c3330hq;
            }
            j9.o0(c3330hq);
            if (z9) {
                Wv wv = c3330hq.f31272a;
                if (h9 != null) {
                    View b02 = h9.b0();
                    jVar.f39823x.getClass();
                    C3431jl.j(wv, b02);
                }
                this.f32996A = true;
            }
            if (z8) {
                C3431jl c3431jl2 = jVar.f39823x;
                Wv wv2 = c3330hq.f31272a;
                c3431jl2.getClass();
                C3431jl.i(wv2);
                j9.a("onSdkLoaded", new s.b());
            }
            return c3330hq;
        }
        return null;
    }

    public final void f(View view) {
        C3320hg c3320hg;
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31749o6)).booleanValue();
        C3917sm c3917sm = this.f33006m;
        if (!booleanValue || c3917sm.q() == 3) {
            n(view, c3917sm.k());
            return;
        }
        synchronized (c3917sm) {
            c3320hg = c3917sm.f34287n;
        }
        if (c3320hg == null) {
            return;
        }
        C2881Yl c2881Yl = new C2881Yl(this, view);
        c3320hg.c(new MD(0, c3320hg, c2881Yl), this.f33005l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    public final synchronized void g(InterfaceViewOnClickListenerC2678Mm interfaceViewOnClickListenerC2678Mm) {
        Iterator<String> keys;
        View view;
        InterfaceC3240g7 interfaceC3240g7;
        try {
            if (!this.f33017x) {
                this.f33016w = (AbstractBinderC3186f8) interfaceViewOnClickListenerC2678Mm;
                C2474Am c2474Am = this.f33008o;
                c2474Am.f23895g.execute(new MD(c2474Am, interfaceViewOnClickListenerC2678Mm));
                this.f33007n.k(interfaceViewOnClickListenerC2678Mm.A0(), interfaceViewOnClickListenerC2678Mm.h(), interfaceViewOnClickListenerC2678Mm.j(), interfaceViewOnClickListenerC2678Mm, interfaceViewOnClickListenerC2678Mm);
                C3151ea c3151ea = AbstractC3368ia.f31810v3;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && (interfaceC3240g7 = this.f32998C.f31319b) != null) {
                    interfaceC3240g7.g(interfaceViewOnClickListenerC2678Mm.A0());
                }
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31772r2)).booleanValue()) {
                    Ut ut = this.f24804b;
                    if (ut.f28159k0 && (keys = ut.f28157j0.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            ?? r22 = this.f33016w;
                            WeakReference weakReference = r22 == 0 ? null : (WeakReference) r22.l().get(next);
                            this.f33003H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                ViewOnAttachStateChangeListenerC3779q8 viewOnAttachStateChangeListenerC3779q8 = new ViewOnAttachStateChangeListenerC3779q8(this.f33000E, view);
                                this.f33004I.add(viewOnAttachStateChangeListenerC3779q8);
                                viewOnAttachStateChangeListenerC3779q8.f33652E.add(new C3432jm(this, next));
                                viewOnAttachStateChangeListenerC3779q8.d(3);
                            }
                        }
                    }
                }
                if (interfaceViewOnClickListenerC2678Mm.e() != null) {
                    ViewOnAttachStateChangeListenerC3779q8 e6 = interfaceViewOnClickListenerC2678Mm.e();
                    e6.f33652E.add(this.f32997B);
                    e6.d(3);
                }
            }
        } finally {
        }
    }

    public final void h(InterfaceViewOnClickListenerC2678Mm interfaceViewOnClickListenerC2678Mm) {
        View A02 = interfaceViewOnClickListenerC2678Mm.A0();
        interfaceViewOnClickListenerC2678Mm.l();
        this.f33007n.i(A02);
        if (interfaceViewOnClickListenerC2678Mm.q3() != null) {
            interfaceViewOnClickListenerC2678Mm.q3().setClickable(false);
            interfaceViewOnClickListenerC2678Mm.q3().removeAllViews();
        }
        if (interfaceViewOnClickListenerC2678Mm.e() != null) {
            ViewOnAttachStateChangeListenerC3779q8 e6 = interfaceViewOnClickListenerC2678Mm.e();
            e6.f33652E.remove(this.f32997B);
        }
        this.f33016w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    public final synchronized void i(View view, Map map, Map map2) {
        this.f33008o.a(this.f33016w);
        this.f33007n.r(view, map, map2, k());
        this.f33018y = true;
    }

    public final synchronized void j(View view, Map map, Map map2) {
        View view2;
        if (!this.f33019z) {
            synchronized (this) {
                if (map != null) {
                    try {
                        C3675oC c3675oC = J;
                        int i = c3675oC.f33117w;
                        int i4 = 0;
                        while (i4 < i) {
                            WeakReference weakReference = (WeakReference) map.get((String) c3675oC.get(i4));
                            i4++;
                            if (weakReference != null) {
                                view2 = (View) weakReference.get();
                            }
                        }
                    } finally {
                    }
                }
                view2 = null;
                if (view2 != null) {
                    C3151ea c3151ea = AbstractC3368ia.cf;
                    q2.r rVar = q2.r.f40116e;
                    if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                        Rect rect = new Rect();
                        if (view2.getGlobalVisibleRect(rect, new Point()) && view2.getHeight() == rect.height() && view2.getWidth() == rect.width()) {
                            this.f33007n.q(view, map, map2, k());
                            this.f33019z = true;
                        }
                    } else {
                        if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.df)).booleanValue()) {
                            C3151ea c3151ea2 = AbstractC3368ia.ef;
                            if (((Float) rVar.f40119c.a(c3151ea2)).floatValue() > 0.0d) {
                                double floatValue = ((Float) rVar.f40119c.a(c3151ea2)).floatValue();
                                if (view2.getGlobalVisibleRect(new Rect(), new Point())) {
                                    if (r4.height() * r4.width() >= view2.getHeight() * view2.getWidth() * (floatValue / 100.0d)) {
                                        this.f33007n.q(view, map, map2, k());
                                        this.f33019z = true;
                                    }
                                }
                            }
                        } else if (d(view2)) {
                            this.f33007n.q(view, map, map2, k());
                            this.f33019z = true;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    public final synchronized ImageView.ScaleType k() {
        ?? r02 = this.f33016w;
        if (r02 == 0) {
            int i = t2.C.f40822b;
            u2.i.a("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        V2.a p6 = r02.p();
        if (p6 != null) {
            return (ImageView.ScaleType) V2.b.A0(p6);
        }
        return C2474Am.f23888k;
    }

    public final void l() {
        J3.a aVar;
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31749o6)).booleanValue()) {
            e("Google", true);
            return;
        }
        C3917sm c3917sm = this.f33006m;
        synchronized (c3917sm) {
            aVar = c3917sm.f34286m;
        }
        if (aVar == null) {
            return;
        }
        Vx vx = new Vx(this);
        aVar.c(new MD(0, aVar, vx), this.f33005l);
    }

    public final void n(View view, C3330hq c3330hq) {
        InterfaceC3858rh j9 = this.f33006m.j();
        if (!this.f33009p.c() || c3330hq == null || j9 == null || view == null) {
            return;
        }
        C3431jl c3431jl = p2.j.f39798C.f39823x;
        Wv wv = c3330hq.f31272a;
        c3431jl.getClass();
        C3431jl.j(wv, view);
    }

    public final synchronized void o() {
        this.f33017x = true;
        this.f33005l.execute(new RunnableC3486km(this, 0));
        C2540Ek c2540Ek = this.f24805c;
        c2540Ek.getClass();
        c2540Ek.u1(new C3042ca(null, false));
    }

    public final synchronized boolean p(Bundle bundle) {
        if (this.f33018y) {
            return true;
        }
        boolean s3 = this.f33007n.s(bundle);
        this.f33018y = s3;
        return s3;
    }

    public final synchronized void q(InterfaceViewOnClickListenerC2678Mm interfaceViewOnClickListenerC2678Mm) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31754p2)).booleanValue()) {
            t2.G.f40858l.post(new RunnableC3540lm(this, interfaceViewOnClickListenerC2678Mm, 0));
        } else {
            g(interfaceViewOnClickListenerC2678Mm);
        }
    }

    public final synchronized void r(InterfaceViewOnClickListenerC2678Mm interfaceViewOnClickListenerC2678Mm) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31754p2)).booleanValue()) {
            t2.G.f40858l.post(new RunnableC3540lm(this, interfaceViewOnClickListenerC2678Mm, 1));
        } else {
            h(interfaceViewOnClickListenerC2678Mm);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    public final synchronized void s(View view, View view2, Map map, Map map2, boolean z8) {
        InterfaceC3858rh h9;
        C2610Im c2610Im;
        C2474Am c2474Am = this.f33008o;
        ?? r12 = this.f33016w;
        if (r12 != 0 && (c2610Im = c2474Am.f23893e) != null && r12.q3() != null && c2474Am.f23891c.a()) {
            try {
                r12.q3().addView(c2610Im.a());
            } catch (C4290zh e6) {
                t2.C.l("web view can not be obtained", e6);
            }
        }
        this.f33007n.h(view, view2, map, map2, z8, k());
        if (this.f32996A) {
            C3917sm c3917sm = this.f33006m;
            if (c3917sm.h() != null && (h9 = c3917sm.h()) != null) {
                h9.a("onSdkAdUserInteractionClick", new s.b());
            }
        }
    }

    public final synchronized void t(View view, Map map, Map map2, boolean z8) {
        if (this.f33018y) {
            j(view, map, map2);
            return;
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31772r2)).booleanValue() && this.f24804b.f28159k0) {
            HashMap hashMap = this.f33003H;
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) hashMap.get((String) it.next())).booleanValue()) {
                    break;
                }
            }
        }
        if (z8) {
            i(view, map, map2);
            j(view, map, map2);
            return;
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31487L4)).booleanValue() && map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view2 != null && d(view2)) {
                    i(view, map, map2);
                    return;
                }
            }
        }
    }
}
