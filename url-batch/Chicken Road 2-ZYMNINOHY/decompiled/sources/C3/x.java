package C3;

import f3.InterfaceC0428f;
import x3.k0;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.j implements o3.p {

    /* renamed from: f, reason: collision with root package name */
    public static final x f323f;

    /* renamed from: g, reason: collision with root package name */
    public static final x f324g;

    /* renamed from: h, reason: collision with root package name */
    public static final x f325h;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f326e;

    static {
        int i4 = 2;
        f323f = new x(i4, 0);
        f324g = new x(i4, 1);
        f325h = new x(i4, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i4, int i5) {
        super(i4);
        this.f326e = i5;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f326e) {
            case 0:
                InterfaceC0428f interfaceC0428f = (InterfaceC0428f) obj2;
                if (!(interfaceC0428f instanceof k0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC0428f : Integer.valueOf(intValue + 1);
            case 1:
                k0 k0Var = (k0) obj;
                InterfaceC0428f interfaceC0428f2 = (InterfaceC0428f) obj2;
                if (k0Var != null) {
                    return k0Var;
                }
                if (interfaceC0428f2 instanceof k0) {
                    return (k0) interfaceC0428f2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
