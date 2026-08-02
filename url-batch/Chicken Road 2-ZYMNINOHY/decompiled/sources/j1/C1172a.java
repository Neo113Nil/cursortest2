package j1;

import W.RunnableC0117j;
import android.content.res.AssetManager;
import android.os.Build;
import io.flutter.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1172a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13857a;

    /* renamed from: b, reason: collision with root package name */
    public final d f13858b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f13859c;

    /* renamed from: d, reason: collision with root package name */
    public final File f13860d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13861e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13862f = false;

    /* renamed from: g, reason: collision with root package name */
    public C1173b[] f13863g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f13864h;

    public C1172a(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        this.f13857a = executor;
        this.f13858b = dVar;
        this.f13861e = str;
        this.f13860d = file;
        int i4 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i4 <= 34) {
            switch (i4) {
                case 25:
                    bArr = e.f13882h;
                    break;
                case 26:
                    bArr = e.f13881g;
                    break;
                case 27:
                    bArr = e.f13880f;
                    break;
                case Build.API_LEVELS.API_28 /* 28 */:
                case 29:
                case Build.API_LEVELS.API_30 /* 30 */:
                    bArr = e.f13879e;
                    break;
                case Build.API_LEVELS.API_31 /* 31 */:
                case Build.API_LEVELS.API_32 /* 32 */:
                case Build.API_LEVELS.API_33 /* 33 */:
                case Build.API_LEVELS.API_34 /* 34 */:
                    bArr = e.f13878d;
                    break;
            }
        }
        this.f13859c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f13858b.k();
            return null;
        }
    }

    public final void b(int i4, Serializable serializable) {
        this.f13857a.execute(new RunnableC0117j(this, i4, serializable, 6));
    }
}
