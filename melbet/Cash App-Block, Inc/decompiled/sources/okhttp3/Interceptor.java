package okhttp3;

/* loaded from: classes3.dex */
public interface Interceptor {

    public interface Chain {
        Response proceed(Request request);

        Request request();
    }

    Response intercept(Chain chain);
}
