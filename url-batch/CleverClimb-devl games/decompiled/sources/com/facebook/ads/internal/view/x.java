package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class x extends View {

    /* renamed from: a, reason: collision with root package name */
    private w f5939a;

    public x(Context context, w wVar) {
        super(context);
        this.f5939a = wVar;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        if (this.f5939a != null) {
            this.f5939a.a(i);
        }
    }
}
