package u0;

import a.AbstractC0157a;
import java.util.Comparator;

/* renamed from: u0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957D implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8118a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f8119b;

    public C0957D(Comparator comparator) {
        this.f8119b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8118a) {
            case 0:
                int compare = this.f8119b.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return t0.D.f7710K.compare(((z0.n) obj).f8990c, ((z0.n) obj2).f8990c);
            default:
                int compare2 = ((C0957D) this.f8119b).compare(obj, obj2);
                return compare2 != 0 ? compare2 : AbstractC0157a.q(Integer.valueOf(((z0.n) obj).f8994g), Integer.valueOf(((z0.n) obj2).f8994g));
        }
    }

    public C0957D(C0957D c0957d) {
        this.f8119b = c0957d;
    }
}
