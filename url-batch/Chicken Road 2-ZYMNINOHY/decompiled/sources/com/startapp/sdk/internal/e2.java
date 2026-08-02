package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class e2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f6831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f6832c;

    public e2(String str, Bitmap bitmap, Context context) {
        this.f6830a = str;
        this.f6831b = bitmap;
        this.f6832c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.f6892a.put(this.f6830a.concat(".png"), this.f6831b);
        try {
            Context context = this.f6832c;
            String concat = this.f6830a.concat(".png");
            File file = new File(context.getCacheDir(), "StartIoImages");
            file.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, concat));
            try {
                this.f6831b.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable unused) {
        }
    }
}
