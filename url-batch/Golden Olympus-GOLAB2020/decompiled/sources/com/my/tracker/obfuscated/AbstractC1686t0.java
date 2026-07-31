package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.my.tracker.MyTrackerConfig;
import java.io.OutputStream;

/* renamed from: com.my.tracker.obfuscated.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1686t0 {

    /* renamed from: com.my.tracker.obfuscated.t0$a */
    public interface a {
        String a();

        void a(OutputStream outputStream);
    }

    /* renamed from: com.my.tracker.obfuscated.t0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        boolean f21529a;

        /* renamed from: b, reason: collision with root package name */
        Object f21530b;

        /* renamed from: c, reason: collision with root package name */
        String f21531c;

        private b() {
        }

        static b d() {
            return new b();
        }

        public String a() {
            return this.f21531c;
        }

        public Object b() {
            return this.f21530b;
        }

        public boolean c() {
            return this.f21529a;
        }
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    public abstract b a(String str);

    public static AbstractC1686t0 a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (okHttpClientProvider != null) {
            try {
                return new C1652k1(okHttpClientProvider);
            } catch (Throwable th) {
                AbstractC1708y2.a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new C1678r0();
    }

    public static AbstractC1686t0 a(a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z4) {
        if (okHttpClientProvider != null) {
            try {
                return new C1656l1(aVar, okHttpClientProvider, z4);
            } catch (Throwable th) {
                AbstractC1708y2.a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new C1682s0(aVar, z4);
    }
}
