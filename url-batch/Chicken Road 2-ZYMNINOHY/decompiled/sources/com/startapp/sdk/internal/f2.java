package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f6892a = new ConcurrentHashMap();

    public static boolean a(Context context, String str) {
        if (!str.endsWith(".png")) {
            str = str.concat(".png");
        }
        if (f6892a.containsKey(str)) {
            return true;
        }
        File file = new File(context.getCacheDir(), "StartIoImages");
        file.mkdirs();
        return new File(file, str).exists();
    }

    public static Bitmap b(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = f6892a;
        Bitmap bitmap = (Bitmap) concurrentHashMap.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        try {
            File file = new File(context.getCacheDir(), "StartIoImages");
            file.mkdirs();
            FileInputStream fileInputStream = new FileInputStream(new File(file, str));
            try {
                bitmap = BitmapFactory.decodeStream(fileInputStream);
                concurrentHashMap.put(str, bitmap);
                fileInputStream.close();
                return bitmap;
            } finally {
            }
        } catch (Throwable unused) {
            return bitmap;
        }
    }
}
