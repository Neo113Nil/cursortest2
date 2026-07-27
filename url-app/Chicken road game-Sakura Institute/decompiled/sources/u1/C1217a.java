package u1;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1217a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f10892a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1220d f10893b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10894c;

    /* renamed from: d, reason: collision with root package name */
    public final File f10895d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10896e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10897f = false;

    /* renamed from: g, reason: collision with root package name */
    public C1218b[] f10898g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f10899h;

    public C1217a(AssetManager assetManager, Executor executor, InterfaceC1220d interfaceC1220d, String str, File file) {
        this.f10892a = executor;
        this.f10893b = interfaceC1220d;
        this.f10896e = str;
        this.f10895d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 26:
                    bArr = AbstractC1221e.f10915g;
                    break;
                case 27:
                    bArr = AbstractC1221e.f10914f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC1221e.f10913e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC1221e.f10912d;
                    break;
            }
        }
        this.f10894c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f10893b.h();
            }
            return null;
        }
    }

    public final void b(int i2, Serializable serializable) {
        this.f10892a.execute(new b.l(i2, 2, this, serializable));
    }
}
