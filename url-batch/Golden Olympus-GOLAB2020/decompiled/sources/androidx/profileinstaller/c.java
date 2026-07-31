package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f12769a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f12770b;

    /* renamed from: c, reason: collision with root package name */
    private final h.c f12771c;

    /* renamed from: e, reason: collision with root package name */
    private final File f12773e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12774f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12775g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12776h;

    /* renamed from: j, reason: collision with root package name */
    private d[] f12778j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f12779k;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12777i = false;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f12772d = d();

    public c(AssetManager assetManager, Executor executor, h.c cVar, String str, String str2, String str3, File file) {
        this.f12769a = assetManager;
        this.f12770b = executor;
        this.f12771c = cVar;
        this.f12774f = str;
        this.f12775g = str2;
        this.f12776h = str3;
        this.f12773e = file;
    }

    private c b(d[] dVarArr, byte[] bArr) {
        InputStream g4;
        try {
            g4 = g(this.f12769a, this.f12776h);
        } catch (FileNotFoundException e4) {
            this.f12771c.b(9, e4);
        } catch (IOException e5) {
            this.f12771c.b(7, e5);
        } catch (IllegalStateException e6) {
            this.f12778j = null;
            this.f12771c.b(8, e6);
        }
        if (g4 == null) {
            if (g4 != null) {
                g4.close();
            }
            return null;
        }
        try {
            this.f12778j = m.q(g4, m.o(g4, m.f12807b), bArr, dVarArr);
            g4.close();
            return this;
        } catch (Throwable th) {
            try {
                g4.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void c() {
        if (!this.f12777i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 34) {
            return null;
        }
        switch (i4) {
        }
        return null;
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f12775g);
        } catch (FileNotFoundException e4) {
            this.f12771c.b(6, e4);
            return null;
        } catch (IOException e5) {
            this.f12771c.b(7, e5);
            return null;
        }
    }

    private InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f12771c.a(5, null);
            }
            return null;
        }
    }

    private d[] i(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        d[] w4 = m.w(inputStream, m.o(inputStream, m.f12806a), this.f12774f);
                        try {
                            inputStream.close();
                            return w4;
                        } catch (IOException e4) {
                            this.f12771c.b(7, e4);
                            return w4;
                        }
                    } catch (IOException e5) {
                        this.f12771c.b(7, e5);
                        return null;
                    }
                } catch (IllegalStateException e6) {
                    this.f12771c.b(8, e6);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e7) {
                this.f12771c.b(7, e7);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e8) {
                this.f12771c.b(7, e8);
            }
            throw th;
        }
    }

    private static boolean j() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 34) {
            return false;
        }
        if (i4 != 25) {
            switch (i4) {
            }
            return false;
        }
        return true;
    }

    private void k(final int i4, final Object obj) {
        this.f12770b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.f12771c.b(i4, obj);
            }
        });
    }

    public boolean e() {
        if (this.f12772d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f12773e.exists()) {
            try {
                this.f12773e.createNewFile();
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f12773e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f12777i = true;
        return true;
    }

    public c h() {
        c b4;
        c();
        if (this.f12772d != null) {
            InputStream f4 = f(this.f12769a);
            if (f4 != null) {
                this.f12778j = i(f4);
            }
            d[] dVarArr = this.f12778j;
            if (dVarArr != null && j() && (b4 = b(dVarArr, this.f12772d)) != null) {
                return b4;
            }
        }
        return this;
    }

    public c l() {
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f12778j;
        byte[] bArr = this.f12772d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    m.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e4) {
                this.f12771c.b(7, e4);
            } catch (IllegalStateException e5) {
                this.f12771c.b(8, e5);
            }
            if (!m.B(byteArrayOutputStream, bArr, dVarArr)) {
                this.f12771c.b(5, null);
                this.f12778j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f12779k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f12778j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m() {
        byte[] bArr = this.f12779k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f12773e);
                    try {
                        e.l(byteArrayInputStream, fileOutputStream);
                        k(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f12779k = null;
                this.f12778j = null;
            }
        } catch (FileNotFoundException e4) {
            k(6, e4);
            return false;
        } catch (IOException e5) {
            k(7, e5);
            return false;
        }
    }
}
