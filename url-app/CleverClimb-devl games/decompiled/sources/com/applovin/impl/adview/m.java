package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import com.applovin.impl.adview.g;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class m extends g {

    /* renamed from: c, reason: collision with root package name */
    private float f2613c;

    public m(com.applovin.impl.sdk.j jVar, Context context) {
        super(jVar, context);
        this.f2613c = 1.0f;
    }

    @Override // com.applovin.impl.adview.g
    public void a(int i) {
        setViewScale(i / 30.0f);
    }

    @Override // com.applovin.impl.adview.g
    public g.a getStyle() {
        return g.a.Invisible;
    }

    @Override // com.applovin.impl.adview.g
    public float getViewScale() {
        return this.f2613c;
    }

    @Override // com.applovin.impl.adview.g
    public void setViewScale(float f) {
        this.f2613c = f;
    }
}
