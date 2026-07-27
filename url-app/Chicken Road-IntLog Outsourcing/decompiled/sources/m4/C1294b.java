package m4;

import k4.InterfaceC1218d;
import k4.InterfaceC1223i;

/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1294b implements InterfaceC1218d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1294b f11207a = new C1294b();

    @Override // k4.InterfaceC1218d
    public final InterfaceC1223i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // k4.InterfaceC1218d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
