package d0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2076a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0091e f2077b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2078c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2079e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2080f = false;

    /* renamed from: g, reason: collision with root package name */
    public C0089c[] f2081g;
    public byte[] h;

    public C0088b(AssetManager assetManager, Executor executor, InterfaceC0091e interfaceC0091e, String str, File file) {
        this.f2076a = executor;
        this.f2077b = interfaceC0091e;
        this.f2079e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 26:
                    bArr = AbstractC0092f.f2094g;
                    break;
                case 27:
                    bArr = AbstractC0092f.f2093f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0092f.f2092e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC0092f.d;
                    break;
            }
        }
        this.f2078c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2077b.o();
            }
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f2076a.execute(new Runnable() { // from class: d0.a
            @Override // java.lang.Runnable
            public final void run() {
                C0088b.this.f2077b.k(i, serializable);
            }
        });
    }
}
