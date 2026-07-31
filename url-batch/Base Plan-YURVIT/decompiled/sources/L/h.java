package L;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f634f;

    public /* synthetic */ h(Context context, int i2) {
        this.f633e = i2;
        this.f634f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f633e) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? l.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h(this.f634f, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.f634f, 2));
                break;
            default:
                g.s(this.f634f, new e(), g.f623a, false);
                break;
        }
    }

    public /* synthetic */ h(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f633e = 0;
        this.f634f = context;
    }
}
