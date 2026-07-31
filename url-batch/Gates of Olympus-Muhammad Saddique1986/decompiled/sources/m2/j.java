package m2;

import e.C0413e;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class j extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final j f7006f = new j(1, 0);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i3, int i4) {
        super(i3);
        this.f7007e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f7007e) {
            case 0:
                return Boolean.valueOf(obj == null);
            default:
                f2.j.f(obj, "it");
                return C0413e.f5686e.b();
        }
    }
}
