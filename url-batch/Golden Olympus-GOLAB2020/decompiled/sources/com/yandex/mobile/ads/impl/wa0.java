package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.iv;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public final class wa0 extends AbstractC2211rj {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f33972e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f33973f;

    /* renamed from: g, reason: collision with root package name */
    private long f33974g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33975h;

    private static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean a(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static final class b implements iv.a {
        @Override // com.yandex.mobile.ads.impl.iv.a
        public final iv a() {
            return new wa0();
        }
    }

    public static class c extends jv {
        public c(int i4, String str, FileNotFoundException fileNotFoundException) {
            super(i4, str, fileNotFoundException);
        }

        public c(Exception exc, int i4) {
            super(exc, i4);
        }
    }

    public wa0() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final long a(mv mvVar) {
        Uri uri = mvVar.f29239a;
        this.f33973f = uri;
        b(mvVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f33972e = randomAccessFile;
            try {
                randomAccessFile.seek(mvVar.f29244f);
                long j4 = mvVar.f29245g;
                if (j4 == -1) {
                    j4 = this.f33972e.length() - mvVar.f29244f;
                }
                this.f33974g = j4;
                if (j4 < 0) {
                    throw new c(2008, null, null);
                }
                this.f33975h = true;
                c(mvVar);
                return this.f33974g;
            } catch (IOException e4) {
                throw new c(e4, 2000);
            }
        } catch (FileNotFoundException e5) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new c(e5, (u82.f32873a < 21 || !a.a(e5.getCause())) ? 2005 : 2006);
            }
            throw new c(1004, "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e5);
        } catch (SecurityException e6) {
            throw new c(e6, 2006);
        } catch (RuntimeException e7) {
            throw new c(e7, 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        this.f33973f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f33972e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e4) {
                throw new c(e4, 2000);
            }
        } finally {
            this.f33972e = null;
            if (this.f33975h) {
                this.f33975h = false;
                e();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        return this.f33973f;
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f33974g;
        if (j4 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f33972e;
            int i6 = u82.f32873a;
            int read = randomAccessFile.read(bArr, i4, (int) Math.min(j4, i5));
            if (read > 0) {
                this.f33974g -= read;
                c(read);
            }
            return read;
        } catch (IOException e4) {
            throw new c(e4, 2000);
        }
    }
}
