package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.gms.internal.ads.C3112dq;
import g1.C4523c;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f23547k;

    /* renamed from: a, reason: collision with root package name */
    public final C3112dq f23548a;

    /* renamed from: b, reason: collision with root package name */
    public final N1.h f23549b;

    /* renamed from: c, reason: collision with root package name */
    public final W3.e f23550c;

    /* renamed from: d, reason: collision with root package name */
    public final W3.e f23551d;

    /* renamed from: e, reason: collision with root package name */
    public final List f23552e;

    /* renamed from: f, reason: collision with root package name */
    public final s.b f23553f;

    /* renamed from: g, reason: collision with root package name */
    public final u1.k f23554g;

    /* renamed from: h, reason: collision with root package name */
    public final C4523c f23555h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public J1.e f23556j;

    static {
        a aVar = new a();
        aVar.f23525n = L1.b.f1707a;
        f23547k = aVar;
    }

    public i(Context context, C3112dq c3112dq, com.bumptech.glide.manager.o oVar, W3.e eVar, W3.e eVar2, s.b bVar, List list, u1.k kVar, C4523c c4523c) {
        super(context.getApplicationContext());
        this.f23548a = c3112dq;
        this.f23550c = eVar;
        this.f23551d = eVar2;
        this.f23552e = list;
        this.f23553f = bVar;
        this.f23554g = kVar;
        this.f23555h = c4523c;
        this.i = 4;
        this.f23549b = new N1.h(oVar);
    }

    public final l a() {
        return (l) this.f23549b.get();
    }
}
