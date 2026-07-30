package o;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1002c;

    public /* synthetic */ h(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f1001b = 0;
        this.f1002c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1001b) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? l.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h(this.f1002c, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.f1002c, 2));
                break;
            default:
                g.s(this.f1002c, new e(), g.f991a, false);
                break;
        }
    }

    public /* synthetic */ h(Context context, int i2) {
        this.f1001b = i2;
        this.f1002c = context;
    }
}
