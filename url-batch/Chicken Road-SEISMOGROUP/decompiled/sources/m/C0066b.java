package m;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f988a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0070f f989b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f990c;

    /* renamed from: d, reason: collision with root package name */
    public final File f991d;

    /* renamed from: e, reason: collision with root package name */
    public final String f992e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f993f = false;

    /* renamed from: g, reason: collision with root package name */
    public C0067c[] f994g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f995h;

    public C0066b(AssetManager assetManager, Executor executor, InterfaceC0070f interfaceC0070f, String str, File file) {
        this.f988a = executor;
        this.f989b = interfaceC0070f;
        this.f992e = str;
        this.f991d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 25:
                    bArr = AbstractC0071g.f1013h;
                    break;
                case 26:
                    bArr = AbstractC0071g.f1012g;
                    break;
                case 27:
                    bArr = AbstractC0071g.f1011f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0071g.f1010e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC0071g.f1009d;
                    break;
            }
        }
        this.f990c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f989b.c();
            }
            return null;
        }
    }

    public final void b(final int i2, final Serializable serializable) {
        this.f988a.execute(new Runnable() { // from class: m.a
            @Override // java.lang.Runnable
            public final void run() {
                C0066b.this.f989b.a(i2, serializable);
            }
        });
    }
}
