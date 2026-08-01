package c0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1671a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1672b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1673c;

    /* renamed from: d, reason: collision with root package name */
    public final File f1674d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1675e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1676f = false;

    /* renamed from: g, reason: collision with root package name */
    public b[] f1677g;
    public byte[] h;

    public a(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        this.f1671a = executor;
        this.f1672b = dVar;
        this.f1675e = str;
        this.f1674d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 26:
                    bArr = e.f1691g;
                    break;
                case 27:
                    bArr = e.f1690f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f1689e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = e.f1688d;
                    break;
            }
        }
        this.f1673c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f1672b.o();
            }
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.f1671a.execute(new a.m(this, i, serializable, 2));
    }
}
