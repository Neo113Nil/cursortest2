package k5;

import o5.C0570j;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;

/* renamed from: k5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472b implements InterfaceC0564d {

    /* renamed from: f, reason: collision with root package name */
    public V5.p f5190f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0564d f5191g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5192h;

    @Override // o5.InterfaceC0564d
    public final InterfaceC0569i getContext() {
        return C0570j.f5620f;
    }

    @Override // o5.InterfaceC0564d
    public final void resumeWith(Object obj) {
        this.f5191g = null;
        this.f5192h = obj;
    }
}
