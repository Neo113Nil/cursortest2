package e0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2481a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0106e f2482b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2483c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2484e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2485f = false;

    /* renamed from: g, reason: collision with root package name */
    public C0104c[] f2486g;
    public byte[] h;

    public C0103b(AssetManager assetManager, Executor executor, InterfaceC0106e interfaceC0106e, String str, File file) {
        this.f2481a = executor;
        this.f2482b = interfaceC0106e;
        this.f2484e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 26:
                    bArr = AbstractC0107f.f2499g;
                    break;
                case 27:
                    bArr = AbstractC0107f.f2498f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0107f.f2497e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC0107f.d;
                    break;
            }
        }
        this.f2483c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2482b.l();
            }
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f2481a.execute(new Runnable() { // from class: e0.a
            @Override // java.lang.Runnable
            public final void run() {
                C0103b.this.f2482b.i(i, serializable);
            }
        });
    }
}
