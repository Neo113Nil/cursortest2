package m4;

import k4.C1224j;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public abstract class g extends AbstractC1293a {
    public g(InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        if (interfaceC1218d != null && interfaceC1218d.getContext() != C1224j.f10720a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // k4.InterfaceC1218d
    public final InterfaceC1223i getContext() {
        return C1224j.f10720a;
    }
}
