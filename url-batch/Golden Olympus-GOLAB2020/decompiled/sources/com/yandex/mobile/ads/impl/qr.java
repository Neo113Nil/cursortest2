package com.yandex.mobile.ads.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class qr extends AbstractC2211rj {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f30873e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f30874f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f30875g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f30876h;

    /* renamed from: i, reason: collision with root package name */
    private long f30877i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30878j;

    public static class a extends jv {
        public a(IOException iOException, int i4) {
            super(iOException, i4);
        }
    }

    public qr(Context context) {
        super(false);
        this.f30873e = context.getContentResolver();
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final long a(mv mvVar) {
        int i4;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            try {
                Uri uri = mvVar.f29239a;
                this.f30874f = uri;
                b(mvVar);
                if (FirebaseAnalytics.Param.CONTENT.equals(mvVar.f29239a.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.f30873e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.f30873e.openAssetFileDescriptor(uri, "r");
                }
                this.f30875g = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i4 = 2000;
                    try {
                        throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
                    } catch (IOException e4) {
                        e = e4;
                        throw new a(e, e instanceof FileNotFoundException ? 2005 : i4);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f30876h = fileInputStream;
                if (length != -1 && mvVar.f29244f > length) {
                    throw new a(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(mvVar.f29244f + startOffset) - startOffset;
                if (skip != mvVar.f29244f) {
                    throw new a(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f30877i = -1L;
                    } else {
                        long position = size - channel.position();
                        this.f30877i = position;
                        if (position < 0) {
                            throw new a(null, 2008);
                        }
                    }
                } else {
                    long j4 = length - skip;
                    this.f30877i = j4;
                    if (j4 < 0) {
                        throw new a(null, 2008);
                    }
                }
                long j5 = mvVar.f29245g;
                if (j5 != -1) {
                    long j6 = this.f30877i;
                    if (j6 != -1) {
                        j5 = Math.min(j6, j5);
                    }
                    this.f30877i = j5;
                }
                this.f30878j = true;
                c(mvVar);
                long j7 = mvVar.f29245g;
                return j7 != -1 ? j7 : this.f30877i;
            } catch (IOException e5) {
                e = e5;
                i4 = 2000;
            }
        } catch (a e6) {
            throw e6;
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        this.f30874f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f30876h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f30876h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f30875g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new a(e4, 2000);
                    }
                } finally {
                    this.f30875g = null;
                    if (this.f30878j) {
                        this.f30878j = false;
                        e();
                    }
                }
            } catch (IOException e5) {
                throw new a(e5, 2000);
            }
        } catch (Throwable th) {
            this.f30876h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f30875g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f30875g = null;
                    if (this.f30878j) {
                        this.f30878j = false;
                        e();
                    }
                    throw th;
                } catch (IOException e6) {
                    throw new a(e6, 2000);
                }
            } finally {
                this.f30875g = null;
                if (this.f30878j) {
                    this.f30878j = false;
                    e();
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        return this.f30874f;
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f30877i;
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
        FileInputStream fileInputStream = this.f30876h;
        int i6 = u82.f32873a;
        int read = fileInputStream.read(bArr, i4, i5);
        if (read == -1) {
            return -1;
        }
        long j5 = this.f30877i;
        if (j5 != -1) {
            this.f30877i = j5 - read;
        }
        c(read);
        return read;
    }
}
