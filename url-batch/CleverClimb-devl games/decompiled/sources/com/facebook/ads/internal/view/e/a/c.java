package com.facebook.ads.internal.view.e.a;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public abstract class c extends RelativeLayout implements b {

    /* renamed from: a, reason: collision with root package name */
    private com.facebook.ads.internal.view.e.b f5643a;

    public c(Context context) {
        super(context);
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    protected void a() {
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void a(com.facebook.ads.internal.view.e.b bVar) {
        this.f5643a = bVar;
        a();
    }

    protected void b() {
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void b(com.facebook.ads.internal.view.e.b bVar) {
        b();
        this.f5643a = null;
    }

    protected com.facebook.ads.internal.view.e.b getVideoView() {
        return this.f5643a;
    }
}
