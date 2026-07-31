package S;

import e2.InterfaceC0424c;

/* renamed from: S.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217a extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4194f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0217a(int i3, Object obj) {
        super(1);
        this.f4193e = i3;
        this.f4194f = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f4193e) {
            case 0:
                ?? r02 = this.f4194f;
                int size = r02.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((InterfaceC0424c) r02.get(i3)).n(obj);
                }
                return R1.y.f4171a;
            case 1:
                return Boolean.valueOf(f2.j.a(obj, this.f4194f));
            default:
                ((Number) obj).intValue();
                return this.f4194f;
        }
    }
}
