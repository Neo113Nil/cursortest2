package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class ax extends View {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3756a;

    public ax(Context context) {
        super(context);
        this.f3756a = false;
        setFocusable(false);
        setBackgroundColor(-1442840576);
    }

    public void a(aw awVar, com.chartboost.sdk.Model.a aVar) {
        if (this.f3756a) {
            return;
        }
        awVar.a(true, (View) this, aVar);
        this.f3756a = true;
    }
}
