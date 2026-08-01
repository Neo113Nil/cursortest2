package n;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1037a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0079f f1038b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1039c;

    /* renamed from: d, reason: collision with root package name */
    public final File f1040d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1041e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1042f = false;

    /* renamed from: g, reason: collision with root package name */
    public C0076c[] f1043g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f1044h;

    public C0075b(AssetManager assetManager, Executor executor, InterfaceC0079f interfaceC0079f, String str, File file) {
        this.f1037a = executor;
        this.f1038b = interfaceC0079f;
        this.f1041e = str;
        this.f1040d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 25:
                    bArr = AbstractC0080g.f1062h;
                    break;
                case 26:
                    bArr = AbstractC0080g.f1061g;
                    break;
                case 27:
                    bArr = AbstractC0080g.f1060f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0080g.f1059e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC0080g.f1058d;
                    break;
            }
        }
        this.f1039c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f1038b.c();
            }
            return null;
        }
    }

    public final void b(final int i2, final Serializable serializable) {
        this.f1037a.execute(new Runnable() { // from class: n.a
            @Override // java.lang.Runnable
            public final void run() {
                C0075b.this.f1038b.a(i2, serializable);
            }
        });
    }
}
