package s1;

import X.V;

/* loaded from: classes.dex */
public final class s extends g1.g implements f1.p {

    /* renamed from: c, reason: collision with root package name */
    public static final s f3669c = new s(2, 0);
    public static final s d = new s(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final s f3670e = new s(2, 2);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3671b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, int i2) {
        super(i);
        this.f3671b = i2;
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        switch (this.f3671b) {
            case 0:
                return obj;
            case 1:
                V.f(obj);
                return null;
            default:
                return (u) obj;
        }
    }
}
