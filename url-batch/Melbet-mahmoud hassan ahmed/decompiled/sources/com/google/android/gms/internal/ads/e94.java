package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class e94 extends eb1 {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f4532e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f4533f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f4534g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f4535h;

    /* renamed from: i, reason: collision with root package name */
    private long f4536i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4537j;

    public e94(Context context) {
        super(false);
        this.f4532e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f4536i;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new d94(e7, 2000);
            }
        }
        FileInputStream fileInputStream = this.f4535h;
        int i9 = n13.f8865a;
        int read = fileInputStream.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f4536i;
        if (j8 != -1) {
            this.f4536i = j8 - read;
        }
        o(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        return this.f4533f;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        this.f4533f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f4535h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f4535h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f4534g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f4534g = null;
                        if (this.f4537j) {
                            this.f4537j = false;
                            p();
                        }
                    }
                } catch (IOException e7) {
                    throw new d94(e7, 2000);
                }
            } catch (IOException e8) {
                throw new d94(e8, 2000);
            }
        } catch (Throwable th) {
            this.f4535h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f4534g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f4534g = null;
                    if (this.f4537j) {
                        this.f4537j = false;
                        p();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new d94(e9, 2000);
                }
            } catch (Throwable th2) {
                this.f4534g = null;
                if (this.f4537j) {
                    this.f4537j = false;
                    p();
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final long k(li1 li1Var) {
        AssetFileDescriptor openAssetFileDescriptor;
        long j7;
        try {
            Uri uri = li1Var.f7985a;
            this.f4533f = uri;
            q(li1Var);
            if ("content".equals(li1Var.f7985a.getScheme())) {
                Bundle bundle = new Bundle();
                if (n13.f8865a >= 31) {
                    c94.a(bundle);
                }
                openAssetFileDescriptor = this.f4532e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f4532e.openAssetFileDescriptor(uri, "r");
            }
            this.f4534g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                sb.append("Could not open file descriptor for: ");
                sb.append(valueOf);
                throw new d94(new IOException(sb.toString()), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f4535h = fileInputStream;
            if (length != -1 && li1Var.f7990f > length) {
                throw new d94(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(li1Var.f7990f + startOffset) - startOffset;
            if (skip != li1Var.f7990f) {
                throw new d94(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f4536i = -1L;
                    j7 = -1;
                } else {
                    j7 = size - channel.position();
                    this.f4536i = j7;
                    if (j7 < 0) {
                        throw new d94(null, 2008);
                    }
                }
            } else {
                long j8 = length - skip;
                this.f4536i = j8;
                if (j8 < 0) {
                    throw new d94(null, 2008);
                }
                j7 = j8;
            }
            long j9 = li1Var.f7991g;
            if (j9 != -1) {
                if (j7 != -1) {
                    j9 = Math.min(j7, j9);
                }
                this.f4536i = j9;
            }
            this.f4537j = true;
            r(li1Var);
            long j10 = li1Var.f7991g;
            return j10 != -1 ? j10 : this.f4536i;
        } catch (d94 e7) {
            throw e7;
        } catch (IOException e8) {
            throw new d94(e8, true == (e8 instanceof FileNotFoundException) ? 2005 : 2000);
        }
    }
}
