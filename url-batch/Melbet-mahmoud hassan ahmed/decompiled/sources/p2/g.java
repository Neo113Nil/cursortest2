package p2;

import android.view.Surface;

/* loaded from: classes.dex */
public class g extends i1.m {

    /* renamed from: h, reason: collision with root package name */
    public final int f20008h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20009i;

    public g(Throwable th, i1.n nVar, Surface surface) {
        super(th, nVar);
        this.f20008h = System.identityHashCode(surface);
        this.f20009i = surface == null || surface.isValid();
    }
}
