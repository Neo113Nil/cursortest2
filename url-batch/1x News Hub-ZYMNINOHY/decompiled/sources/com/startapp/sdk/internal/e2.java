package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class e2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f3717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3718c;

    public e2(String str, Bitmap bitmap, Context context) {
        this.f3716a = str;
        this.f3717b = bitmap;
        this.f3718c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.f3776a.put(this.f3716a.concat(".png"), this.f3717b);
        try {
            Context context = this.f3718c;
            String concat = this.f3716a.concat(".png");
            File file = new File(context.getCacheDir(), "StartIoImages");
            file.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, concat));
            try {
                this.f3717b.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable unused) {
        }
    }
}
