package f0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2153a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0089e f2154b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2155c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2156e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2157f = false;

    /* renamed from: g, reason: collision with root package name */
    public C0087c[] f2158g;
    public byte[] h;

    public C0086b(AssetManager assetManager, Executor executor, InterfaceC0089e interfaceC0089e, String str, File file) {
        this.f2153a = executor;
        this.f2154b = interfaceC0089e;
        this.f2156e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 26:
                    bArr = AbstractC0090f.f2170g;
                    break;
                case 27:
                    bArr = AbstractC0090f.f2169f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0090f.f2168e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC0090f.d;
                    break;
            }
        }
        this.f2155c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2154b.n();
            }
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f2153a.execute(new Runnable() { // from class: f0.a
            @Override // java.lang.Runnable
            public final void run() {
                C0086b.this.f2154b.k(i, serializable);
            }
        });
    }
}
