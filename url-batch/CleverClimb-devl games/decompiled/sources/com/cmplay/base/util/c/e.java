package com.cmplay.base.util.c;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.cmplay.base.util.g;
import com.cmplay.base.util.h;
import com.cmplay.base.util.m;
import com.cmplay.base.util.q;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* compiled from: LoaderImpl.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, SoftReference<Bitmap>> f3986a;

    /* renamed from: b, reason: collision with root package name */
    private f<String, Bitmap> f3987b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3988c = false;

    /* renamed from: d, reason: collision with root package name */
    private String f3989d;

    public e(Map<String, SoftReference<Bitmap>> map) {
        this.f3986a = map;
    }

    @SuppressLint({"NewApi"})
    public void a(Context context) {
        int memoryClass = ((ActivityManager) context.getSystemService("activity")).getMemoryClass();
        int i = (1048576 * memoryClass) / 8;
        h.a("cache:-----" + memoryClass + "/" + ((i / 1024) / 1024));
        this.f3987b = new f<String, Bitmap>(i) { // from class: com.cmplay.base.util.c.e.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.cmplay.base.util.c.f
            public int a(String str, Bitmap bitmap) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        };
    }

    public void a(boolean z) {
        this.f3988c = z;
    }

    public void a(String str) {
        this.f3989d = str;
    }

    public synchronized Bitmap a(Context context, String str, boolean z) {
        Bitmap a2;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(10000);
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if ("GIF".equals(g.a(byteArray))) {
                    a2 = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                } else {
                    a2 = g.a(byteArray, m.c(context), m.d(context));
                }
                if (z) {
                    if (this.f3987b != null) {
                        h.a("存入：bitmap=" + a2);
                        this.f3987b.b(str, a2);
                    } else {
                        this.f3986a.put(str, new SoftReference<>(a2));
                    }
                    if (this.f3988c) {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.f3989d + "/" + b(str));
                        if ("GIF".equals(g.a(byteArray))) {
                            fileOutputStream.write(byteArray);
                        } else {
                            a2.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        }
                    }
                }
            } finally {
                inputStream.close();
                httpURLConnection.disconnect();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return a2;
    }

    public Bitmap a(Context context, String str) {
        Bitmap bitmap;
        if (this.f3987b != null) {
            bitmap = this.f3987b.a((f<String, Bitmap>) str);
            if (bitmap != null) {
                h.a("cache 中获取");
                return bitmap;
            }
        } else {
            if (this.f3986a.containsKey(str)) {
                synchronized (this.f3986a) {
                    SoftReference<Bitmap> softReference = this.f3986a.get(str);
                    if (softReference != null) {
                        return softReference.get();
                    }
                }
            }
            bitmap = null;
        }
        if (this.f3988c && (bitmap = b(context, str)) != null) {
            h.a("sd卡  中获取");
            if (this.f3987b != null) {
                this.f3987b.b(str, bitmap);
            } else {
                this.f3986a.put(str, new SoftReference<>(bitmap));
            }
        }
        return bitmap;
    }

    private Bitmap b(Context context, String str) {
        String b2 = b(str);
        if (b2 == null) {
            return null;
        }
        String str2 = this.f3989d + "/" + b2;
        try {
            if (new File(str2).exists()) {
                return g.a(str2, m.c(context), m.d(context));
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = q.a(str);
        if (a2 == null) {
            a2 = "";
        }
        return a2 + "_" + str.substring(str.lastIndexOf("/") + 1, str.length());
    }
}
