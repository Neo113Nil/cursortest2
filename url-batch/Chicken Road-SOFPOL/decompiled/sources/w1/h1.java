package w1;

import java.util.Comparator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h1 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final h1 f7682b = new h1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7683a;

    public /* synthetic */ h1(int i) {
        this.f7683a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7683a) {
            case 0:
                f0 f0Var = (f0) obj;
                f0 f0Var2 = (f0) obj2;
                int f6 = q6.i.f(f0Var2.f7651q, f0Var.f7651q);
                return f6 != 0 ? f6 : q6.i.f(f0Var.hashCode(), f0Var2.hashCode());
            default:
                f0 f0Var3 = (f0) obj;
                f0 f0Var4 = (f0) obj2;
                int f8 = q6.i.f(f0Var3.f7651q, f0Var4.f7651q);
                return f8 != 0 ? f8 : q6.i.f(f0Var3.hashCode(), f0Var4.hashCode());
        }
    }
}
