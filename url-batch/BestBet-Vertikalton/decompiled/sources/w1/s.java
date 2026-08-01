package w1;

import G1.AbstractC0001b;

/* loaded from: classes.dex */
public final class s extends k1.f implements j1.p {

    /* renamed from: c, reason: collision with root package name */
    public static final s f4518c = new s(2, 0);
    public static final s d = new s(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final s f4519e = new s(2, 2);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, int i2) {
        super(i);
        this.f4520b = i2;
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        switch (this.f4520b) {
            case 0:
                return obj;
            case 1:
                AbstractC0001b.i(obj);
                return null;
            default:
                return (u) obj;
        }
    }
}
