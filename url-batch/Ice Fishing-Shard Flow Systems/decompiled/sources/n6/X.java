package n6;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public interface X extends CoroutineContext.Element {
    boolean a();

    void d(CancellationException cancellationException);
}
