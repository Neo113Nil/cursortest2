package d0;

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
    public final Executor f1954a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1955b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1956c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1957e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1958f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f1959g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f1954a = executor;
        this.f1955b = eVar;
        this.f1957e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 26:
                    bArr = f.f1971g;
                    break;
                case 27:
                    bArr = f.f1970f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f1969e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = f.d;
                    break;
            }
        }
        this.f1956c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f1955b.n();
            }
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f1954a.execute(new Runnable() { // from class: d0.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f1955b.k(i, serializable);
            }
        });
    }
}
