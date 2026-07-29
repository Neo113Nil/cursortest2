package com.facebook.ads.internal.view.component.a;

import android.content.Context;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.j;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.component.i;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    static final int f5580a = (int) (v.f5438b * 16.0f);

    /* renamed from: b, reason: collision with root package name */
    static final int f5581b = (int) (v.f5438b * 28.0f);

    /* renamed from: c, reason: collision with root package name */
    private final i f5582c;

    /* renamed from: d, reason: collision with root package name */
    private final com.facebook.ads.internal.view.component.a f5583d;

    b(Context context, com.facebook.ads.internal.m.c cVar, a.InterfaceC0352a interfaceC0352a, j jVar, boolean z) {
        super(context);
        this.f5583d = new com.facebook.ads.internal.view.component.a(context, true, c(), "com.facebook.ads.interstitial.clicked", jVar, cVar, interfaceC0352a);
        v.a(this.f5583d);
        this.f5582c = new i(getContext(), jVar, z, true, b());
        v.a(this.f5582c);
    }

    public void a(String str, String str2, String str3, String str4, String str5, double d2) {
        this.f5582c.a(str, str2, false, !a() && d2 > 0.0d && d2 < 1.0d);
        this.f5583d.a(str3, str4, str5, new HashMap());
    }

    public abstract boolean a();

    protected boolean b() {
        return true;
    }

    protected boolean c() {
        return true;
    }

    com.facebook.ads.internal.view.component.a getCtaButton() {
        return this.f5583d;
    }

    i getTextContainer() {
        return this.f5582c;
    }
}
