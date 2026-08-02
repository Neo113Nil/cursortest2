package y2;

import d2.InterfaceC0303f;
import t2.k0;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.k implements l2.p {
    public static final w f = new w(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final w f10869g = new w(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final w f10870h = new w(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i3, int i4) {
        super(i3);
        this.f10871e = i4;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10871e) {
            case 0:
                InterfaceC0303f interfaceC0303f = (InterfaceC0303f) obj2;
                if (!(interfaceC0303f instanceof k0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC0303f : Integer.valueOf(intValue + 1);
            case 1:
                k0 k0Var = (k0) obj;
                InterfaceC0303f interfaceC0303f2 = (InterfaceC0303f) obj2;
                if (k0Var != null) {
                    return k0Var;
                }
                if (interfaceC0303f2 instanceof k0) {
                    return (k0) interfaceC0303f2;
                }
                return null;
            default:
                return (y) obj;
        }
    }
}
