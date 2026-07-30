package l3;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5920a;

    public n(Context context, int i7) {
        switch (i7) {
            case 1:
                this.f5920a = context;
                break;
            default:
                this.f5920a = context.getApplicationContext();
                break;
        }
    }

    @Override // l3.j
    public void a(a8.m mVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new f5.e(this, mVar, threadPoolExecutor, 3));
    }
}
