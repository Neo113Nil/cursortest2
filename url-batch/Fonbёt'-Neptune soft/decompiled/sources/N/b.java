package N;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f784a;

    /* renamed from: b, reason: collision with root package name */
    public final e f785b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f786c;

    /* renamed from: d, reason: collision with root package name */
    public final File f787d;

    /* renamed from: e, reason: collision with root package name */
    public final String f788e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f789f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f790g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f791h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f784a = executor;
        this.f785b = eVar;
        this.f788e = str;
        this.f787d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 >= 24 && i2 <= 34) {
            switch (i2) {
                case 24:
                case 25:
                    bArr = f.f808h;
                    break;
                case 26:
                    bArr = f.f807g;
                    break;
                case 27:
                    bArr = f.f806f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f805e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = f.f804d;
                    break;
            }
        }
        this.f786c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f785b.h();
            }
            return null;
        }
    }

    public final void b(final int i2, final Serializable serializable) {
        this.f784a.execute(new Runnable() { // from class: N.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f785b.f(i2, serializable);
            }
        });
    }
}
