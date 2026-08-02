package com.unity3d.player.a;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class A implements Runnable {
    public final /* synthetic */ B a;

    public A(B b) {
        this.a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(-16777216), new BitmapDrawable(this.a.b.getResources(), this.a.b.a)}));
    }
}
