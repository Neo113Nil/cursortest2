package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public abstract class g extends View {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f2529a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f2530b;

    public enum a {
        WhiteXOnOpaqueBlack,
        WhiteXOnTransparentGrey,
        Invisible
    }

    g(com.applovin.impl.sdk.j jVar, Context context) {
        super(context);
        this.f2530b = context;
        this.f2529a = jVar;
    }

    public static g a(com.applovin.impl.sdk.j jVar, Context context, a aVar) {
        return aVar.equals(a.Invisible) ? new m(jVar, context) : aVar.equals(a.WhiteXOnTransparentGrey) ? new o(jVar, context) : new v(jVar, context);
    }

    public abstract void a(int i);

    public abstract a getStyle();

    public abstract float getViewScale();

    public abstract void setViewScale(float f);
}
