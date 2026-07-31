package P;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f1860g;

    public /* synthetic */ f(Context context, int i7) {
        this.f1859f = i7;
        this.f1860g = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1859f) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? i.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new f(this.f1860g, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(this.f1860g, 2));
                break;
            default:
                e.s(this.f1860g, new c(0), e.f1849a, false);
                break;
        }
    }

    public /* synthetic */ f(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f1859f = 0;
        this.f1860g = context;
    }
}
