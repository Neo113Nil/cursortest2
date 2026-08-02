package sqip;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u0016\u0010\u0006\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&J\r\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lsqip/Call;", "T", "", "cancel", "", "clone", "enqueue", "callback", "Lsqip/Callback;", "execute", "()Ljava/lang/Object;", "isCanceled", "", "isExecuted", "nonce-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    T execute();

    boolean isCanceled();

    boolean isExecuted();
}
