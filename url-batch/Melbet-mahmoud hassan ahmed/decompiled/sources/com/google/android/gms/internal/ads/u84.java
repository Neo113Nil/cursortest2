package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u84 extends eb1 {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f12693e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f12694f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f12695g;

    /* renamed from: h, reason: collision with root package name */
    private long f12696h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12697i;

    public u84(Context context) {
        super(false);
        this.f12693e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f12696h;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new t84(e7, 2000);
            }
        }
        InputStream inputStream = this.f12695g;
        int i9 = n13.f8865a;
        int read = inputStream.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f12696h;
        if (j8 != -1) {
            this.f12696h = j8 - read;
        }
        o(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        return this.f12694f;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        this.f12694f = null;
        try {
            try {
                InputStream inputStream = this.f12695g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f12695g = null;
                if (this.f12697i) {
                    this.f12697i = false;
                    p();
                }
            } catch (IOException e7) {
                throw new t84(e7, 2000);
            }
        } catch (Throwable th) {
            this.f12695g = null;
            if (this.f12697i) {
                this.f12697i = false;
                p();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final long k(li1 li1Var) {
        try {
            Uri uri = li1Var.f7985a;
            this.f12694f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            q(li1Var);
            InputStream open = this.f12693e.open(path, 1);
            this.f12695g = open;
            if (open.skip(li1Var.f7990f) < li1Var.f7990f) {
                throw new t84(null, 2008);
            }
            long j7 = li1Var.f7991g;
            if (j7 != -1) {
                this.f12696h = j7;
            } else {
                long available = this.f12695g.available();
                this.f12696h = available;
                if (available == 2147483647L) {
                    this.f12696h = -1L;
                }
            }
            this.f12697i = true;
            r(li1Var);
            return this.f12696h;
        } catch (t84 e7) {
            throw e7;
        } catch (IOException e8) {
            throw new t84(e8, true != (e8 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }
}
