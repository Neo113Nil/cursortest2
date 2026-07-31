package s1;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f7510a;

    /* renamed from: b, reason: collision with root package name */
    public final c f7511b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7512c;

    /* renamed from: d, reason: collision with root package name */
    public final File f7513d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7514e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7515f = false;

    /* renamed from: g, reason: collision with root package name */
    public C0889b[] f7516g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f7517h;

    public C0888a(AssetManager assetManager, Executor executor, c cVar, String str, File file) {
        this.f7510a = executor;
        this.f7511b = cVar;
        this.f7514e = str;
        this.f7513d = file;
        int i3 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i3 <= 34) {
            switch (i3) {
                case 25:
                    bArr = d.f7534h;
                    break;
                case 26:
                    bArr = d.f7533g;
                    break;
                case 27:
                    bArr = d.f7532f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = d.f7531e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = d.f7530d;
                    break;
            }
        }
        this.f7512c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f7511b.b();
            }
            return null;
        }
    }

    public final void b(int i3, Serializable serializable) {
        this.f7510a.execute(new b.l(this, i3, serializable, 1));
    }
}
