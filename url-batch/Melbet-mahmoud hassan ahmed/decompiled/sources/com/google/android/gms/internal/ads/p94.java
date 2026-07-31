package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p94 extends eb1 {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f10137e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f10138f;

    /* renamed from: g, reason: collision with root package name */
    private long f10139g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10140h;

    public p94() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f10139g;
        if (j7 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f10137e;
            int i9 = n13.f8865a;
            int read = randomAccessFile.read(bArr, i7, (int) Math.min(j7, i8));
            if (read > 0) {
                this.f10139g -= read;
                o(read);
            }
            return read;
        } catch (IOException e7) {
            throw new o94(e7, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        return this.f10138f;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        this.f10138f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f10137e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f10137e = null;
                if (this.f10140h) {
                    this.f10140h = false;
                    p();
                }
            } catch (IOException e7) {
                throw new o94(e7, 2000);
            }
        } catch (Throwable th) {
            this.f10137e = null;
            if (this.f10140h) {
                this.f10140h = false;
                p();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r1 != false) goto L37;
     */
    @Override // com.google.android.gms.internal.ads.he1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(li1 li1Var) {
        boolean b7;
        Uri uri = li1Var.f7985a;
        this.f10138f = uri;
        q(li1Var);
        int i7 = 2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f10137e = randomAccessFile;
            try {
                randomAccessFile.seek(li1Var.f7990f);
                long j7 = li1Var.f7991g;
                if (j7 == -1) {
                    j7 = this.f10137e.length() - li1Var.f7990f;
                }
                this.f10139g = j7;
                if (j7 < 0) {
                    throw new o94(null, null, 2008);
                }
                this.f10140h = true;
                r(li1Var);
                return this.f10139g;
            } catch (IOException e7) {
                throw new o94(e7, 2000);
            }
        } catch (FileNotFoundException e8) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new o94(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e8, 1004);
            }
            if (n13.f8865a >= 21) {
                b7 = n94.b(e8.getCause());
            }
            i7 = 2005;
            throw new o94(e8, i7);
        } catch (SecurityException e9) {
            throw new o94(e9, 2006);
        } catch (RuntimeException e10) {
            throw new o94(e10, 2000);
        }
    }
}
