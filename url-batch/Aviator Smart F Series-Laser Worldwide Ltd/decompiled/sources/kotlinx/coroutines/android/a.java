package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.v1;

/* loaded from: classes3.dex */
public final class a implements v {
    @Override // kotlinx.coroutines.internal.v
    public v1 createDispatcher(List<? extends v> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new HandlerContext(f.asHandler(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.v
    public int getLoadPriority() {
        return u.MAX_CAPACITY_MASK;
    }

    @Override // kotlinx.coroutines.internal.v
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
