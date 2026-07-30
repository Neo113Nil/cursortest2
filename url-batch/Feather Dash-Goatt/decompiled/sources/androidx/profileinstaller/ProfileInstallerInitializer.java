package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.j50;
import defpackage.l80;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements l80 {
    @Override // defpackage.l80
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.l80
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: mz0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Handler createAsync = Handler.createAsync(Looper.getMainLooper());
                int nextInt = new Random().nextInt(Math.max(1000, 1));
                createAsync.postDelayed(new nz0(applicationContext, 0), nextInt + 5000);
            }
        });
        return new j50(27);
    }
}
