package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import com.facebook.appevents.codeless.internal.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ma0 {
    public final Executor a;
    public final f52 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public na0[] g;
    public byte[] h;

    public ma0(AssetManager assetManager, Executor executor, f52 f52Var, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = f52Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case Constants.MAX_TREE_DEPTH /* 25 */:
                    bArr = j8.r;
                    break;
                case 26:
                    bArr = j8.q;
                    break;
                case 27:
                    bArr = j8.p;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = j8.o;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = j8.n;
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
            this.b.d();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.a.execute(new ux(i, 2, this, serializable));
    }
}
