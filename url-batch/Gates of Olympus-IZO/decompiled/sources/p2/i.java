package p2;

import I.X0;
import f2.InterfaceC0386a;
import f2.InterfaceC0388c;

/* loaded from: classes.dex */
public final /* synthetic */ class i extends Z1.o implements InterfaceC0388c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6786k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i3, int i4, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i3);
        this.f6786k = i4;
    }

    @Override // Z1.b
    public final InterfaceC0386a a() {
        Z1.u.f3481a.getClass();
        return this;
    }

    @Override // Y1.a
    public final Object b() {
        return get();
    }

    @Override // f2.InterfaceC0388c
    public final Object get() {
        switch (this.f6786k) {
        }
        return ((X0) this.f3461e).getValue();
    }
}
