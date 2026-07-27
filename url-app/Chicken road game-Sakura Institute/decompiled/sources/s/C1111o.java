package s;

import A.C0016l;
import java.util.Comparator;

/* renamed from: s.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1111o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0016l f9948b;

    public /* synthetic */ C1111o(C0016l c0016l, int i2) {
        this.f9947a = i2;
        this.f9948b = c0016l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9947a) {
            case 0:
                Object obj3 = ((r.o) obj).f9526h;
                C0016l c0016l = this.f9948b;
                return B2.b.a(Integer.valueOf(c0016l.b(obj3)), Integer.valueOf(c0016l.b(((r.o) obj2).f9526h)));
            default:
                Object obj4 = ((r.o) obj2).f9526h;
                C0016l c0016l2 = this.f9948b;
                return B2.b.a(Integer.valueOf(c0016l2.b(obj4)), Integer.valueOf(c0016l2.b(((r.o) obj).f9526h)));
        }
    }
}
