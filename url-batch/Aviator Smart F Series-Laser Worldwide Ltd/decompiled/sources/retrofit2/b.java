package retrofit2;

import okhttp3.Request;
import okio.y0;

/* loaded from: classes5.dex */
public interface b extends Cloneable {
    void cancel();

    b clone();

    void enqueue(d dVar);

    u execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    y0 timeout();
}
