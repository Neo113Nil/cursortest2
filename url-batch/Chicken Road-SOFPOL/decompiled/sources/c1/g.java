package c1;

import a4.i;
import c6.m;
import q6.j;
import u1.k0;
import u1.l0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f1568f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(l0 l0Var, int i) {
        super(1);
        this.f1567e = i;
        this.f1568f = l0Var;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f1567e) {
            case 0:
                k0.k((k0) obj, this.f1568f, 0, 0);
                break;
            case 1:
                k0.g((k0) obj, this.f1568f, 0, 0);
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                k0.g((k0) obj, this.f1568f, 0, 0);
                break;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                k0.g((k0) obj, this.f1568f, 0, 0);
                break;
            case i.LONG_FIELD_NUMBER /* 4 */:
                k0.m((k0) obj, this.f1568f, 0, 0);
                break;
            default:
                k0.g((k0) obj, this.f1568f, 0, 0);
                break;
        }
        return m.f1757a;
    }
}
