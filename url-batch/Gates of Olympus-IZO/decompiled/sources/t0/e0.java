package t0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class e0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f7909b = new e0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7910a;

    public /* synthetic */ e0(int i3) {
        this.f7910a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7910a) {
            case 0:
                D d3 = (D) obj;
                D d4 = (D) obj2;
                int g3 = Z1.i.g(d4.f7725m, d3.f7725m);
                return g3 != 0 ? g3 : Z1.i.g(d3.hashCode(), d4.hashCode());
            default:
                D d5 = (D) obj;
                D d6 = (D) obj2;
                int g4 = Z1.i.g(d5.f7725m, d6.f7725m);
                return g4 != 0 ? g4 : Z1.i.g(d5.hashCode(), d6.hashCode());
        }
    }
}
