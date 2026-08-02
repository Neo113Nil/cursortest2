package h3;

import f3.InterfaceC0425c;
import f3.InterfaceC0430h;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449b implements InterfaceC0425c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0449b f9240a = new C0449b();

    @Override // f3.InterfaceC0425c
    public final InterfaceC0430h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // f3.InterfaceC0425c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
