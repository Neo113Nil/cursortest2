package a0;

import java.util.Comparator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f138b;

    public /* synthetic */ s(b1 b1Var, int i) {
        this.f137a = i;
        this.f138b = b1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f137a) {
            case 0:
                Object obj3 = ((z.l) obj).f9061f;
                b1 b1Var = this.f138b;
                return a.a.g(Integer.valueOf(b1Var.c(obj3)), Integer.valueOf(b1Var.c(((z.l) obj2).f9061f)));
            case 1:
                Object obj4 = ((z.l) obj).f9061f;
                b1 b1Var2 = this.f138b;
                return a.a.g(Integer.valueOf(b1Var2.c(obj4)), Integer.valueOf(b1Var2.c(((z.l) obj2).f9061f)));
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                Object obj5 = ((z.l) obj2).f9061f;
                b1 b1Var3 = this.f138b;
                return a.a.g(Integer.valueOf(b1Var3.c(obj5)), Integer.valueOf(b1Var3.c(((z.l) obj).f9061f)));
            default:
                Object obj6 = ((z.l) obj2).f9061f;
                b1 b1Var4 = this.f138b;
                return a.a.g(Integer.valueOf(b1Var4.c(obj6)), Integer.valueOf(b1Var4.c(((z.l) obj).f9061f)));
        }
    }
}
