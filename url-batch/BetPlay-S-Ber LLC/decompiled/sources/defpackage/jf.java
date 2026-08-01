package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class jf {
    public final Executor a;
    public final wx b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public kf[] g;
    public byte[] h;

    public jf(AssetManager assetManager, Executor executor, wx wxVar, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = wxVar;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = vw.g;
                    break;
                case 27:
                    bArr = vw.f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = vw.e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = vw.d;
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
            this.b.a();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.a.execute(new xb(this, i, serializable, 2));
    }
}
