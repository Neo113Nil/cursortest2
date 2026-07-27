package M1;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k1.ThreadFactoryC0752a;
import k1.g;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3573a;

    public b(Context context, int i2) {
        switch (i2) {
            case 1:
                this.f3573a = context.getApplicationContext();
                break;
            default:
                this.f3573a = context;
                break;
        }
    }

    @Override // k1.g
    public void a(a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0752a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new com.appsflyer.internal.c(this, aVar, threadPoolExecutor, 3));
    }
}
