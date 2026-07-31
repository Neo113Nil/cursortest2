package com.onevcat.uniwebview;

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

/* renamed from: com.onevcat.uniwebview.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0064m0 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0064m0(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Y1 y1;
        String str;
        N it = (N) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String str2 = this.a;
        if (it.e.getHeight() <= 0 || it.e.getWidth() <= 0) {
            y1 = new Y1("", String.valueOf(-1002), "", null);
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
                C0060l c0060l = C0060l.b;
                String message = "Capture Snapshot done. File written in: " + file;
                c0060l.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                c0060l.a(EnumC0057k.INFO, message);
                str = file.getAbsolutePath();
            } catch (Exception e) {
                C0060l c0060l2 = C0060l.b;
                String message2 = "Error during save snapshot image: " + e;
                c0060l2.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                c0060l2.a(EnumC0057k.CRITICAL, message2);
                str = null;
            }
            y1 = str != null ? new Y1("", String.valueOf(0), str, null) : new Y1("", String.valueOf(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED), "", null);
        }
        it.c.a(it.b, d2.CaptureSnapshotFinished, y1);
        return Unit.INSTANCE;
    }
}
