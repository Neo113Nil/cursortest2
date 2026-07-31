package T0;

import V0.f;
import android.content.Context;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9314a = "SecureX509SingleInstance";

    /* renamed from: b, reason: collision with root package name */
    private static volatile e f9315b;

    public static e a(Context context) {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        V0.b.b(context);
        if (f9315b == null) {
            synchronized (d.class) {
                if (f9315b == null) {
                    try {
                        inputStream = V0.a.o(context);
                    } catch (RuntimeException unused) {
                        f.d(f9314a, "get files bks error");
                        inputStream = null;
                    }
                    if (inputStream == null) {
                        f.e(f9314a, "get assets bks");
                        inputStream = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        f.e(f9314a, "get files bks");
                    }
                    f9315b = new e(inputStream, "");
                }
            }
        }
        f.b(f9314a, "SecureX509TrustManager getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return f9315b;
    }
}
