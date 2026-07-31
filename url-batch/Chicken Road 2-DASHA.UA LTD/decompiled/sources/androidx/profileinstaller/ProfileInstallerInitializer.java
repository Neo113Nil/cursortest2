package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import n.AbstractC0084k;
import o.b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // o.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // o.b
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        AbstractC0084k.a(new Runnable() { // from class: n.h
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0086m.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0082i(applicationContext, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new B.b(11);
    }
}
