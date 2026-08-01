package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class lf {
    public final Executor a;
    public final ix b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public mf[] g;
    public byte[] h;

    public lf(AssetManager assetManager, Executor executor, ix ixVar, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = ixVar;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = o8.k;
                    break;
                case 27:
                    bArr = o8.j;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = o8.i;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = o8.h;
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.b();
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: kf
            @Override // java.lang.Runnable
            public final void run() {
                lf.this.b.c(i, serializable);
            }
        });
    }
}
