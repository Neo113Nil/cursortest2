package retrofit2;

import okhttp3.Request;
import okio.Timeout;

/* loaded from: classes3.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    Call mo2978clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    Timeout timeout();
}
