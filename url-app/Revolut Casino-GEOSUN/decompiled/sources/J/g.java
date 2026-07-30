package J;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import h.C0165s;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f448g;

    public /* synthetic */ g(int i2, Object obj, Object obj2) {
        this.f446e = i2;
        this.f447f = obj;
        this.f448g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f446e) {
            case 0:
                ((ProfileInstallerInitializer) this.f447f).getClass();
                (Build.VERSION.SDK_INT >= 28 ? l.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h((Context) this.f448g, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((C0165s) this.f447f).b((Typeface) this.f448g);
                break;
        }
    }
}
