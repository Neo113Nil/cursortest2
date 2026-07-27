package s;

import java.util.Comparator;

/* renamed from: s.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1110n implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f9946b;

    public /* synthetic */ C1110n(s sVar, int i2) {
        this.f9945a = i2;
        this.f9946b = sVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9945a) {
            case 0:
                Object obj3 = ((r.o) obj).f9526h;
                s sVar = this.f9946b;
                return B2.b.a(Integer.valueOf(sVar.b(obj3)), Integer.valueOf(sVar.b(((r.o) obj2).f9526h)));
            default:
                Object obj4 = ((r.o) obj2).f9526h;
                s sVar2 = this.f9946b;
                return B2.b.a(Integer.valueOf(sVar2.b(obj4)), Integer.valueOf(sVar2.b(((r.o) obj).f9526h)));
        }
    }
}
