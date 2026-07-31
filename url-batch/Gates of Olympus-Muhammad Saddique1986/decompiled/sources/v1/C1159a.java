package v1;

import android.content.res.AssetManager;
import android.os.Build;
import b.RunnableC0316l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1159a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f9743a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1161c f9744b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9745c;

    /* renamed from: d, reason: collision with root package name */
    public final File f9746d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9747e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9748f = false;

    /* renamed from: g, reason: collision with root package name */
    public C1160b[] f9749g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f9750h;

    public C1159a(AssetManager assetManager, Executor executor, InterfaceC1161c interfaceC1161c, String str, File file) {
        this.f9743a = executor;
        this.f9744b = interfaceC1161c;
        this.f9747e = str;
        this.f9746d = file;
        int i3 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i3 <= 34) {
            switch (i3) {
                case 24:
                case 25:
                    bArr = AbstractC1162d.f9767h;
                    break;
                case 26:
                    bArr = AbstractC1162d.f9766g;
                    break;
                case 27:
                    bArr = AbstractC1162d.f9765f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC1162d.f9764e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC1162d.f9763d;
                    break;
            }
        }
        this.f9745c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f9744b.e();
            }
            return null;
        }
    }

    public final void b(int i3, Serializable serializable) {
        this.f9743a.execute(new RunnableC0316l(this, i3, serializable, 1));
    }
}
