package q4;

import com.drake.net.interceptor.NetOkHttpInterceptor;
import java.util.List;
import kotlin.jvm.internal.s;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public abstract class b {
    public static final OkHttpClient toNetOkhttp(OkHttpClient okHttpClient) {
        s.checkNotNullParameter(okHttpClient, "<this>");
        List<Interceptor> interceptors = okHttpClient.interceptors();
        NetOkHttpInterceptor netOkHttpInterceptor = NetOkHttpInterceptor.INSTANCE;
        return !interceptors.contains(netOkHttpInterceptor) ? okHttpClient.newBuilder().addInterceptor(netOkHttpInterceptor).build() : okHttpClient;
    }
}
