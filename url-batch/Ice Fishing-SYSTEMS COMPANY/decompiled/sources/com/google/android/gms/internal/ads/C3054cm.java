package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.cm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3054cm implements InterfaceC2990bc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29742n = 2;

    /* renamed from: u, reason: collision with root package name */
    public final Object f29743u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f29744v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f29745w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f29746x;

    public /* synthetic */ C3054cm(InterfaceC2524Dl interfaceC2524Dl, C2657Li c2657Li, Av av, C2834Vp c2834Vp) {
        this.f29743u = interfaceC2524Dl;
        this.f29745w = c2657Li;
        this.f29744v = av;
        this.f29746x = c2834Vp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    public final void g(Object obj, Map map) {
        Object obj2 = this.f29745w;
        Object obj3 = this.f29746x;
        Object obj4 = this.f29744v;
        Object obj5 = this.f29743u;
        switch (this.f29742n) {
            case 0:
                C3109dm c3109dm = (C3109dm) ((WeakReference) obj5).get();
                String str = (String) map.get("u");
                if (c3109dm != null && !TextUtils.isEmpty(str)) {
                    ((Av) obj4).b(str, (t2.w) obj2, (Yu) obj3, c3109dm.f30218W);
                    break;
                }
                break;
            case 1:
                Object obj6 = ((WeakReference) obj5).get();
                if (obj6 != null) {
                    ((InterfaceC2990bc) obj2).g(obj6, map);
                    break;
                } else {
                    ((C4026un) obj3).c((String) obj4, this);
                    break;
                }
            default:
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                AbstractC2935ac.b(map, (InterfaceC2524Dl) obj5);
                String str2 = (String) map.get("u");
                if (str2 != null) {
                    J3.a a9 = AbstractC2935ac.a(interfaceC3858rh, str2);
                    C2518Df c2518Df = new C2518Df(interfaceC3858rh, (C2657Li) obj2, (Av) obj4, (C2834Vp) obj3, 22);
                    a9.c(new MD(0, a9, c2518Df), AbstractC3212fg.f30738a);
                    break;
                } else {
                    int i = t2.C.f40822b;
                    u2.i.f("URL missing from click GMSG.");
                    break;
                }
        }
    }

    public /* synthetic */ C3054cm(C3109dm c3109dm, Av av, t2.w wVar, Yu yu) {
        this.f29743u = new WeakReference(c3109dm);
        this.f29744v = av;
        this.f29745w = wVar;
        this.f29746x = yu;
    }

    public /* synthetic */ C3054cm(C4026un c4026un, WeakReference weakReference, String str, InterfaceC2990bc interfaceC2990bc) {
        Objects.requireNonNull(c4026un);
        this.f29746x = c4026un;
        this.f29743u = weakReference;
        this.f29744v = str;
        this.f29745w = interfaceC2990bc;
    }
}
