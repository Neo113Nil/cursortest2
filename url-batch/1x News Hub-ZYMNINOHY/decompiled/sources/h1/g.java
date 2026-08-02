package h1;

import e1.C0311b;
import e1.C0312c;
import e1.InterfaceC0316g;

/* loaded from: classes.dex */
public final class g implements InterfaceC0316g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5067a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5068b = false;

    /* renamed from: c, reason: collision with root package name */
    public C0312c f5069c;

    /* renamed from: d, reason: collision with root package name */
    public final e f5070d;

    public g(e eVar) {
        this.f5070d = eVar;
    }

    @Override // e1.InterfaceC0316g
    public final InterfaceC0316g b(String str) {
        if (this.f5067a) {
            throw new C0311b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f5067a = true;
        this.f5070d.c(this.f5069c, str, this.f5068b);
        return this;
    }

    @Override // e1.InterfaceC0316g
    public final InterfaceC0316g c(boolean z) {
        if (this.f5067a) {
            throw new C0311b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f5067a = true;
        this.f5070d.b(this.f5069c, z ? 1 : 0, this.f5068b);
        return this;
    }
}
