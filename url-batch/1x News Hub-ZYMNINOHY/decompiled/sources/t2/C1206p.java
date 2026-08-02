package t2;

import d2.InterfaceC0303f;

/* renamed from: t2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1206p extends kotlin.jvm.internal.k implements l2.p {
    public static final C1206p f = new C1206p(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C1206p f10434g = new C1206p(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1206p(int i3, int i4) {
        super(i3);
        this.f10435e = i4;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10435e) {
            case 0:
                return ((d2.h) obj).i((InterfaceC0303f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((d2.h) obj).i((InterfaceC0303f) obj2);
        }
    }
}
