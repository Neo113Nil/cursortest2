package p1;

import d1.n;
import q6.j;
import q6.s;
import w1.k;
import w1.x1;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f5730f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(s sVar, int i) {
        super(1);
        this.f5729e = i;
        this.f5730f = sVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        boolean z3;
        switch (this.f5729e) {
            case 0:
                k kVar = (x1) obj;
                if (((l) kVar).f8706d.f8718q) {
                    this.f5730f.f6205d = kVar;
                    z3 = false;
                } else {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            default:
                this.f5730f.f6205d = (n) obj;
                return Boolean.TRUE;
        }
    }
}
