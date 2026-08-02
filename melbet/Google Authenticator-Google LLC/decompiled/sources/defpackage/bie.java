package defpackage;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bie implements bmc {
    @Override // defpackage.bmc
    public final Object a() {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            config = Bitmap.Config.HARDWARE;
            Bitmap copy = createBitmap.copy(config, false);
            createBitmap.recycle();
            r1 = copy == null;
            if (copy != null) {
                copy.recycle();
            }
        }
        return Boolean.valueOf(r1);
    }
}
