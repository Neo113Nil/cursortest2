package L;

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
    public final Executor f606a;

    /* renamed from: b, reason: collision with root package name */
    public final f f607b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f608c;

    /* renamed from: d, reason: collision with root package name */
    public final File f609d;

    /* renamed from: e, reason: collision with root package name */
    public final String f610e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f611f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f612g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f613h;

    public b(AssetManager assetManager, Executor executor, f fVar, String str, File file) {
        this.f606a = executor;
        this.f607b = fVar;
        this.f610e = str;
        this.f609d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 25:
                    bArr = g.f630h;
                    break;
                case 26:
                    bArr = g.f629g;
                    break;
                case 27:
                    bArr = g.f628f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.f627e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = g.f626d;
                    break;
            }
        }
        this.f608c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f607b.o();
            return null;
        }
    }

    public final void b(final int i2, final Serializable serializable) {
        this.f606a.execute(new Runnable() { // from class: L.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f607b.q(i2, serializable);
            }
        });
    }
}
