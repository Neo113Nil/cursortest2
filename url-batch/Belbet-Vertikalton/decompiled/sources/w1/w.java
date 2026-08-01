package w1;

import G1.AbstractC0001b;

/* loaded from: classes.dex */
public final class w extends j1.i implements i1.p {

    /* renamed from: c, reason: collision with root package name */
    public static final w f4503c = new w(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final w f4504d = new w(2, 1);
    public static final w e = new w(2, 2);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4505b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, int i2) {
        super(i);
        this.f4505b = i2;
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        switch (this.f4505b) {
            case 0:
                return obj;
            case 1:
                AbstractC0001b.i(obj);
                return null;
            default:
                return (y) obj;
        }
    }
}
