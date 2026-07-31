package B;

import e2.InterfaceC0422a;

/* renamed from: B.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001b extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0013n f364f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0001b(InterfaceC0013n interfaceC0013n, int i3) {
        super(0);
        this.f363e = i3;
        this.f364f = interfaceC0013n;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f363e) {
        }
        return Boolean.valueOf(l0.c.D(this.f364f.a()));
    }
}
