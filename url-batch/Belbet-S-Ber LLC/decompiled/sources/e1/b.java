package e1;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1352a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1353b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1354c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1355e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1356f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f1357g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        byte[] bArr;
        this.f1352a = executor;
        this.f1353b = eVar;
        this.f1355e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = f.f1369g;
                    break;
                case 27:
                    bArr = f.f1368f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f1367e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = f.d;
        }
        this.f1354c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f1353b.p();
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f1352a.execute(new Runnable() { // from class: e1.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f1353b.s(i, serializable);
            }
        });
    }
}
