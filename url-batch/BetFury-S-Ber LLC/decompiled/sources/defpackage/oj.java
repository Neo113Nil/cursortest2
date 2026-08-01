package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class oj {
    public final Executor a;
    public final o60 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public pj[] g;
    public byte[] h;

    public oj(AssetManager assetManager, Executor executor, o60 o60Var, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = o60Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = gk0.k;
                    break;
                case 27:
                    bArr = gk0.j;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = gk0.i;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = gk0.h;
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
            this.b.g();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.a.execute(new vd(this, i, serializable, 2));
    }
}
