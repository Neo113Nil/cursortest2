package c1;

import a1.i;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105b implements a1.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0105b f2229a = new C0105b();

    @Override // a1.d
    public final i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // a1.d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
