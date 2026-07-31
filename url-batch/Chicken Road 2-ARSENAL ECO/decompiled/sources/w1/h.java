package w1;

import t1.C0655b;
import t1.C0656c;
import t1.InterfaceC0660g;

/* loaded from: classes.dex */
public final class h implements InterfaceC0660g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6192a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6193b = false;

    /* renamed from: c, reason: collision with root package name */
    public C0656c f6194c;

    /* renamed from: d, reason: collision with root package name */
    public final f f6195d;

    public h(f fVar) {
        this.f6195d = fVar;
    }

    @Override // t1.InterfaceC0660g
    public final InterfaceC0660g b(String str) {
        if (this.f6192a) {
            throw new C0655b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6192a = true;
        this.f6195d.c(this.f6194c, str, this.f6193b);
        return this;
    }

    @Override // t1.InterfaceC0660g
    public final InterfaceC0660g c(boolean z5) {
        if (this.f6192a) {
            throw new C0655b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6192a = true;
        this.f6195d.b(this.f6194c, z5 ? 1 : 0, this.f6193b);
        return this;
    }
}
