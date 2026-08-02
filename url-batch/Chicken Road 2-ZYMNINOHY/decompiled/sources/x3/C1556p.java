package x3;

import f3.InterfaceC0428f;
import f3.InterfaceC0430h;

/* renamed from: x3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1556p extends kotlin.jvm.internal.j implements o3.p {

    /* renamed from: f, reason: collision with root package name */
    public static final C1556p f16051f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1556p f16052g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16053e;

    static {
        int i4 = 2;
        f16051f = new C1556p(i4, 0);
        f16052g = new C1556p(i4, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1556p(int i4, int i5) {
        super(i4);
        this.f16053e = i5;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16053e) {
            case 0:
                return ((InterfaceC0430h) obj).f((InterfaceC0428f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((InterfaceC0430h) obj).f((InterfaceC0428f) obj2);
        }
    }
}
