package B;

import I.W0;
import a0.C0238c;
import e2.InterfaceC0422a;
import m.C0630o;

/* loaded from: classes.dex */
public final class J extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W0 f291f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(W0 w02, int i3) {
        super(0);
        this.f290e = i3;
        this.f291f = w02;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        W0 w02 = this.f291f;
        switch (this.f290e) {
            case 0:
                C0630o c0630o = N.f302a;
                return new C0238c(((C0238c) w02.getValue()).f4722a);
            default:
                return (Float) w02.getValue();
        }
    }
}
