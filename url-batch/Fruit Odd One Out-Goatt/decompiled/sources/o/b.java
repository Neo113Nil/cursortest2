package o;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f973a;

    /* renamed from: b, reason: collision with root package name */
    public final f f974b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f975c;

    /* renamed from: d, reason: collision with root package name */
    public final File f976d;

    /* renamed from: e, reason: collision with root package name */
    public final String f977e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f978f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f979g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f980h;

    public b(AssetManager assetManager, Executor executor, f fVar, String str, File file) {
        this.f973a = executor;
        this.f974b = fVar;
        this.f977e = str;
        this.f976d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 24:
                case 25:
                    bArr = g.f998h;
                    break;
                case 26:
                    bArr = g.f997g;
                    break;
                case 27:
                    bArr = g.f996f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.f995e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = g.f994d;
                    break;
            }
        }
        this.f975c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f974b.b();
            return null;
        }
    }

    public final void b(final int i2, final Serializable serializable) {
        this.f973a.execute(new Runnable() { // from class: o.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f974b.e(i2, serializable);
            }
        });
    }
}
