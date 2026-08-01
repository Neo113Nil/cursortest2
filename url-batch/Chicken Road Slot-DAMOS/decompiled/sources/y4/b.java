package y4;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f10583a;

    /* renamed from: b, reason: collision with root package name */
    public final d f10584b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10585c;

    /* renamed from: d, reason: collision with root package name */
    public final File f10586d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10587e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10588f = false;
    public c[] g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f10589h;

    public b(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        byte[] bArr;
        this.f10583a = executor;
        this.f10584b = dVar;
        this.f10587e = str;
        this.f10586d = file;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31) {
            switch (i3) {
                case 24:
                case 25:
                    bArr = e.f10604h;
                    break;
                case 26:
                    bArr = e.g;
                    break;
                case 27:
                    bArr = e.f10603f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f10602e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = e.f10601d;
        }
        this.f10585c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f10584b.b();
            return null;
        }
    }

    public final void b(final int i3, final Serializable serializable) {
        this.f10583a.execute(new Runnable() { // from class: y4.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f10584b.c(i3, serializable);
            }
        });
    }
}
