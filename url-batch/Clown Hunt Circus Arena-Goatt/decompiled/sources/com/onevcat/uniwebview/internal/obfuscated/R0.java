package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.core.app.NotificationManagerCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class R0 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String str2 = this.a;
        if (it.d.getHeight() <= 0 || it.d.getWidth() <= 0) {
            it.v.a(H3.CaptureSnapshotFinished, new v3("", String.valueOf(-1002), "", null));
        } else {
            Bitmap a = it.a((Rect) null);
            if (a == null) {
                it.v.a(H3.CaptureSnapshotFinished, new v3("", String.valueOf(-1002), "", null));
            } else {
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
                    B b = B.b;
                    String message = "Capture Snapshot done. File written in: " + file;
                    b.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    b.a(A.INFO, message);
                    str = file.getAbsolutePath();
                } catch (Exception e) {
                    B b2 = B.b;
                    String message2 = "Error during save snapshot image: " + e;
                    b2.getClass();
                    Intrinsics.checkNotNullParameter(message2, "message");
                    b2.a(A.CRITICAL, message2);
                    str = null;
                }
                if (str != null) {
                    it.v.a(H3.CaptureSnapshotFinished, new v3("", String.valueOf(0), str, null));
                } else {
                    it.v.a(H3.CaptureSnapshotFinished, new v3("", String.valueOf(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED), "", null));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
