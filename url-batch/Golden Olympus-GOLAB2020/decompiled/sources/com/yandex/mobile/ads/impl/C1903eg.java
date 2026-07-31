package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.yandex.mobile.ads.impl.eg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1903eg extends AbstractC2211rj {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f25282e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f25283f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f25284g;

    /* renamed from: h, reason: collision with root package name */
    private long f25285h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25286i;

    /* renamed from: com.yandex.mobile.ads.impl.eg$a */
    public static final class a extends jv {
        public a(IOException iOException, int i4) {
            super(iOException, i4);
        }
    }

    public C1903eg(Context context) {
        super(false);
        this.f25282e = context.getAssets();
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final long a(mv mvVar) {
        try {
            Uri uri = mvVar.f29239a;
            this.f25283f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            b(mvVar);
            InputStream open = this.f25282e.open(path, 1);
            this.f25284g = open;
            if (open.skip(mvVar.f29244f) < mvVar.f29244f) {
                throw new a(null, 2008);
            }
            long j4 = mvVar.f29245g;
            if (j4 != -1) {
                this.f25285h = j4;
            } else {
                long available = this.f25284g.available();
                this.f25285h = available;
                if (available == 2147483647L) {
                    this.f25285h = -1L;
                }
            }
            this.f25286i = true;
            c(mvVar);
            return this.f25285h;
        } catch (a e4) {
            throw e4;
        } catch (IOException e5) {
            throw new a(e5, e5 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        this.f25283f = null;
        try {
            try {
                InputStream inputStream = this.f25284g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e4) {
                throw new a(e4, 2000);
            }
        } finally {
            this.f25284g = null;
            if (this.f25286i) {
                this.f25286i = false;
                e();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        return this.f25283f;
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f25285h;
        if (j4 == 0) {
            return -1;
        }
        if (j4 != -1) {
            try {
                i5 = (int) Math.min(j4, i5);
            } catch (IOException e4) {
                throw new a(e4, 2000);
            }
        }
        InputStream inputStream = this.f25284g;
        int i6 = u82.f32873a;
        int read = inputStream.read(bArr, i4, i5);
        if (read == -1) {
            return -1;
        }
        long j5 = this.f25285h;
        if (j5 != -1) {
            this.f25285h = j5 - read;
        }
        c(read);
        return read;
    }
}
