package retrofit2.adapter.rxjava3;

import retrofit2.Response;

/* loaded from: classes4.dex */
public final class Result<T> {
    public final Throwable error;
    public final Response response;

    public Result(Response response, Throwable th) {
        this.response = response;
        this.error = th;
    }
}
