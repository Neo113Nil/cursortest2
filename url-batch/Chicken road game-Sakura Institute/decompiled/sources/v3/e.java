package v3;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9146f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f9147g;

    public /* synthetic */ e(Context context, int i7) {
        this.f9146f = i7;
        this.f9147g = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9146f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                (Build.VERSION.SDK_INT >= 28 ? g.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new e(this.f9147g, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(this.f9147g, 2));
                break;
            default:
                d.s(this.f9147g, new g.a(1), d.f9136a, false);
                break;
        }
    }

    public /* synthetic */ e(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f9146f = 0;
        this.f9147g = context;
    }
}
