package d1;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1086a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1087b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1088c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1089e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1090f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f1091g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f1092h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        byte[] bArr;
        this.f1086a = executor;
        this.f1087b = eVar;
        this.f1089e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = f.f1106h;
                    break;
                case 26:
                    bArr = f.f1105g;
                    break;
                case 27:
                    bArr = f.f1104f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f1103e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = f.d;
        }
        this.f1088c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f1087b.i();
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f1086a.execute(new Runnable() { // from class: d1.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f1087b.m(i, serializable);
            }
        });
    }
}
