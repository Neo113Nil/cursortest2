package k;

import kotlin.jvm.functions.Function0;
import l.m0;

/* renamed from: k.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749o extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f7315e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0749o(m0 m0Var, int i2) {
        super(0);
        this.f7314d = i2;
        this.f7315e = m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7314d) {
            case 0:
                m0 m0Var = this.f7315e;
                Object l4 = m0Var.f7800a.l();
                w wVar = w.f7340i;
                return Boolean.valueOf(l4 == wVar && m0Var.f7803d.getValue() == wVar);
            default:
                return Long.valueOf(this.f7315e.b());
        }
    }
}
