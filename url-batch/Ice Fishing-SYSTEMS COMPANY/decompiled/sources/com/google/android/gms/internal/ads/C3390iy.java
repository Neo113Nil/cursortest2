package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.iy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3390iy {

    /* renamed from: a, reason: collision with root package name */
    public final C3755pl f32033a;

    /* renamed from: b, reason: collision with root package name */
    public final C2518Df f32034b;

    /* renamed from: c, reason: collision with root package name */
    public Context f32035c;

    /* renamed from: d, reason: collision with root package name */
    public View f32036d;

    /* renamed from: e, reason: collision with root package name */
    public Activity f32037e;

    /* renamed from: f, reason: collision with root package name */
    public String f32038f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f32039g;

    /* renamed from: h, reason: collision with root package name */
    public C3830r6 f32040h;
    public EnumC3714oy i;

    public /* synthetic */ C3390iy(C3755pl c3755pl, C2518Df c2518Df) {
        this.f32033a = c3755pl;
        this.f32034b = c2518Df;
    }

    public final Mu a() {
        AbstractC3137eE.j(Context.class, this.f32035c);
        AbstractC3137eE.j(Map.class, this.f32039g);
        AbstractC3137eE.j(C3830r6.class, this.f32040h);
        AbstractC3137eE.j(EnumC3714oy.class, this.i);
        return new Mu(this.f32033a, this.f32034b, this.f32035c, this.f32036d, this.f32037e, this.f32038f, this.f32039g, this.f32040h, this.i);
    }
}
