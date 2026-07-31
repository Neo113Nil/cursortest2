package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class y1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f503a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ Context c;

    public y1(String str, Bitmap bitmap, Context context) {
        this.f503a = str;
        this.b = bitmap;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z1.f517a.put(this.f503a.concat(".png"), this.b);
        try {
            Context context = this.c;
            String concat = this.f503a.concat(".png");
            File file = new File(context.getCacheDir(), "StartIoImages");
            file.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, concat));
            try {
                this.b.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable unused) {
        }
    }
}
