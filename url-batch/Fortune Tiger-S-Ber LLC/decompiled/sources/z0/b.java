package z0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3635a;

    /* renamed from: b, reason: collision with root package name */
    public final e f3636b;
    public final byte[] c;

    /* renamed from: d, reason: collision with root package name */
    public final File f3637d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3638e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3639f = false;
    public c[] g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        byte[] bArr;
        this.f3635a = executor;
        this.f3636b = eVar;
        this.f3638e = str;
        this.f3637d = file;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 31) {
            switch (i4) {
                case 26:
                    bArr = f.g;
                    break;
                case 27:
                    bArr = f.f3650f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f3649e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = f.f3648d;
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f3636b.c();
            return null;
        }
    }

    public final void b(final int i4, final Serializable serializable) {
        this.f3635a.execute(new Runnable() { // from class: z0.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f3636b.e(i4, serializable);
            }
        });
    }
}
