package com.onevcat.uniwebview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.core.app.NotificationManagerCompat;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class q1 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c5 c5Var;
        String str;
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String str2 = this.a;
        if (it.e.getHeight() <= 0 || it.e.getWidth() <= 0) {
            c5Var = new c5(BuildConfig.FLAVOR, String.valueOf(-1002), BuildConfig.FLAVOR, null);
        } else {
            Bitmap a = it.a((Rect) null);
            File cacheDir = it.a.getCacheDir();
            if (str2 == null || str2.length() == 0) {
                str2 = UUID.randomUUID() + ".png";
            }
            try {
                File file = new File(cacheDir, str2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                a.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                o oVar = o.b;
                String message = "Capture Snapshot done. File written in: " + file;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                oVar.a(n.INFO, message);
                str = file.getAbsolutePath();
            } catch (Exception e) {
                o oVar2 = o.b;
                String message2 = "Error during save snapshot image: " + e;
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                oVar2.a(n.CRITICAL, message2);
                str = null;
            }
            c5Var = str != null ? new c5(BuildConfig.FLAVOR, String.valueOf(0), str, null) : new c5(BuildConfig.FLAVOR, String.valueOf(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED), BuildConfig.FLAVOR, null);
        }
        it.c.a(it.b, h5.CaptureSnapshotFinished, c5Var);
        return Unit.INSTANCE;
    }
}
