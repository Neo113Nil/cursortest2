package p0;

import E.AbstractC0008i;

/* loaded from: classes.dex */
public final class y extends e0.i implements d0.p {

    /* renamed from: d, reason: collision with root package name */
    public static final y f1182d = new y(2, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final y f1183e = new y(2, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final y f1184f = new y(2, 2);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i2, int i3) {
        super(i2);
        this.f1185c = i3;
    }

    @Override // d0.p
    public final Object e(Object obj, Object obj2) {
        switch (this.f1185c) {
            case 0:
                return obj;
            case 1:
                AbstractC0008i.e(obj);
                return null;
            default:
                return (A) obj;
        }
    }
}
