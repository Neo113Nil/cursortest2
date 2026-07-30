package com.bumptech.glide.manager;

import android.view.View;
import androidx.fragment.app.AbstractActivityC0490x;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: n, reason: collision with root package name */
    public final Set f23608n = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f23609u;

    @Override // com.bumptech.glide.manager.f
    public final void b(AbstractActivityC0490x abstractActivityC0490x) {
        if (!this.f23609u && this.f23608n.add(abstractActivityC0490x)) {
            View decorView = abstractActivityC0490x.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new d(this, decorView));
        }
    }
}
