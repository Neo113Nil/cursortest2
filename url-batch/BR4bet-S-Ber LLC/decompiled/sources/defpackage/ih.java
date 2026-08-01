package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ih {
    public final Executor a;
    public final l00 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public jh[] g;
    public byte[] h;

    public ih(AssetManager assetManager, Executor executor, l00 l00Var, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = l00Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = b9.i;
                    break;
                case 27:
                    bArr = b9.h;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = b9.g;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = b9.f;
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
        this.a.execute(new Runnable() { // from class: hh
            @Override // java.lang.Runnable
            public final void run() {
                ih.this.b.c(i, serializable);
            }
        });
    }
}
