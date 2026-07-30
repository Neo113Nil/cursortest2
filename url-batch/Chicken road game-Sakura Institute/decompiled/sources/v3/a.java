package v3;

import android.content.res.AssetManager;
import android.os.Build;
import b.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f9119a;

    /* renamed from: b, reason: collision with root package name */
    public final c f9120b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9121c;

    /* renamed from: d, reason: collision with root package name */
    public final File f9122d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9123e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9124f = false;

    /* renamed from: g, reason: collision with root package name */
    public b[] f9125g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f9126h;

    public a(AssetManager assetManager, Executor executor, c cVar, String str, File file) {
        this.f9119a = executor;
        this.f9120b = cVar;
        this.f9123e = str;
        this.f9122d = file;
        int i7 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i7 <= 34) {
            switch (i7) {
                case 25:
                    bArr = d.f9143h;
                    break;
                case 26:
                    bArr = d.f9142g;
                    break;
                case 27:
                    bArr = d.f9141f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = d.f9140e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = d.f9139d;
                    break;
            }
        }
        this.f9121c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e9) {
            String message = e9.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f9120b.e();
            return null;
        }
    }

    public final void b(int i7, Serializable serializable) {
        this.f9119a.execute(new l(i7, 2, this, serializable));
    }
}
