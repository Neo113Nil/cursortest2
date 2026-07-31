package o2;

import a2.AbstractC1241b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import u2.AbstractC3458a;

/* loaded from: classes3.dex */
final class G0 extends P0 {

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.coroutines.d f42005e;

    public G0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f42005e = AbstractC1241b.a(function2, this, this);
    }

    @Override // o2.D0
    protected void y0() {
        AbstractC3458a.b(this.f42005e, this);
    }
}
