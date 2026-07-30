package N1;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class i implements h, U.i {

    /* renamed from: d, reason: collision with root package name */
    public final Context f1819d;

    public i(Context context, int i2) {
        switch (i2) {
            case 1:
                this.f1819d = context.getApplicationContext();
                break;
            default:
                this.f1819d = context;
                break;
        }
    }

    @Override // U.i
    public void a(V6.b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new U.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new B5.b(this, bVar, threadPoolExecutor, 2));
    }

    @Override // N1.j
    public Object b() {
        return this.f1819d;
    }
}
