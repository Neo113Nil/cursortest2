package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class DisposeOnCancel implements CancelHandler {
    public final /* synthetic */ int $r8$classId;
    public final Object handle;

    public /* synthetic */ DisposeOnCancel(Object obj, int i) {
        this.$r8$classId = i;
        this.handle = obj;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void invoke(Throwable th) {
        int i = this.$r8$classId;
        Object obj = this.handle;
        switch (i) {
            case 0:
                ((DisposableHandle) obj).dispose();
                break;
            default:
                ((Function1) obj).invoke(th);
                break;
        }
    }

    public final String toString() {
        int i = this.$r8$classId;
        Object obj = this.handle;
        switch (i) {
            case 0:
                return "DisposeOnCancel[" + ((DisposableHandle) obj) + ']';
            default:
                return "CancelHandler.UserSupplied[" + ((Function1) obj).getClass().getSimpleName() + '@' + JobKt.getHexAddress(this) + ']';
        }
    }
}
