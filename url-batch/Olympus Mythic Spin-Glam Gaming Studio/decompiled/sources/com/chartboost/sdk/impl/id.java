package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class id {
    public Context a;
    public jd b;
    public jd c;
    public jd d;
    public jd e;

    public id(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = new jd(context);
        this.c = new jd(this.a);
        this.d = new jd(this.a);
        this.e = new jd(this.a);
    }

    public final jd d() {
        return this.b;
    }

    public final jd c() {
        return this.c;
    }

    public final jd b() {
        return this.d;
    }

    public final jd a() {
        return this.e;
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.d.a(i, i2, i3, i4);
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.e.a(i, i2, i3, i4);
    }

    public final void b(int i, int i2) {
        this.b.a(i, i2);
    }

    public final void a(int i, int i2) {
        this.c.a(i, i2);
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        b(displayMetrics.widthPixels, displayMetrics.heightPixels);
        View rootView = view.getRootView();
        if (rootView == null) {
            rootView = view;
        }
        a(rootView.getWidth(), rootView.getHeight());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        a(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        b(iArr[0], iArr[1], view.getWidth(), view.getHeight());
    }
}
