package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class mn1 extends AbstractC2211rj {

    /* renamed from: e, reason: collision with root package name */
    private final Resources f29181e;

    /* renamed from: f, reason: collision with root package name */
    private final String f29182f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f29183g;

    /* renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f29184h;

    /* renamed from: i, reason: collision with root package name */
    private FileInputStream f29185i;

    /* renamed from: j, reason: collision with root package name */
    private long f29186j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29187k;

    public static class a extends jv {
        public a(int i4, String str, Exception exc) {
            super(i4, str, exc);
        }
    }

    public mn1(Context context) {
        super(false);
        this.f29181e = context.getResources();
        this.f29182f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i4) {
        return Uri.parse("rawresource:///" + i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r3.matches("\\d+") != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163  */
    @Override // com.yandex.mobile.ads.impl.iv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(mv mvVar) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        String str;
        Uri uri = mvVar.f29239a;
        this.f29183g = uri;
        try {
            try {
                if (!TextUtils.equals("rawresource", uri.getScheme())) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (!TextUtils.equals("android.resource", uri.getScheme())) {
                        throw new a(1004, "URI must either use scheme rawresource or android.resource", null);
                    }
                    String path = uri.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String host = uri.getHost();
                    StringBuilder sb = new StringBuilder();
                    if (TextUtils.isEmpty(host)) {
                        str = "";
                    } else {
                        str = host + StringUtils.PROCESS_POSTFIX_DELIMITER;
                    }
                    sb.append(str);
                    sb.append(path);
                    parseInt = this.f29181e.getIdentifier(sb.toString(), "raw", this.f29182f);
                    if (parseInt == 0) {
                        throw new a(2005, "Resource not found.", null);
                    }
                    b(mvVar);
                    openRawResourceFd = this.f29181e.openRawResourceFd(parseInt);
                    this.f29184h = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new a(2000, "Resource is compressed: " + uri, null);
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.f29185i = fileInputStream;
                    if (length != -1) {
                        try {
                            if (mvVar.f29244f > length) {
                                throw new a(2008, null, null);
                            }
                        } catch (a e4) {
                            throw e4;
                        } catch (IOException e5) {
                            throw new a(2000, null, e5);
                        }
                    }
                    long startOffset = openRawResourceFd.getStartOffset();
                    long skip = fileInputStream.skip(mvVar.f29244f + startOffset) - startOffset;
                    if (skip != mvVar.f29244f) {
                        throw new a(2008, null, null);
                    }
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f29186j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f29186j = size;
                            if (size < 0) {
                                throw new a(2008, null, null);
                            }
                        }
                    } else {
                        long j4 = length - skip;
                        this.f29186j = j4;
                        if (j4 < 0) {
                            throw new jv(2008);
                        }
                    }
                    long j5 = mvVar.f29245g;
                    if (j5 != -1) {
                        long j6 = this.f29186j;
                        if (j6 != -1) {
                            j5 = Math.min(j6, j5);
                        }
                        this.f29186j = j5;
                    }
                    this.f29187k = true;
                    c(mvVar);
                    long j7 = mvVar.f29245g;
                    return j7 != -1 ? j7 : this.f29186j;
                }
                openRawResourceFd = this.f29181e.openRawResourceFd(parseInt);
                this.f29184h = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e6) {
                throw new a(2005, null, e6);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            b(mvVar);
        } catch (NumberFormatException unused) {
            throw new a(1004, "Resource identifier must be an integer.", null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        this.f29183g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f29185i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f29185i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f29184h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new a(2000, null, e4);
                    }
                } finally {
                    this.f29184h = null;
                    if (this.f29187k) {
                        this.f29187k = false;
                        e();
                    }
                }
            } catch (IOException e5) {
                throw new a(2000, null, e5);
            }
        } catch (Throwable th) {
            this.f29185i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f29184h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f29184h = null;
                    if (this.f29187k) {
                        this.f29187k = false;
                        e();
                    }
                    throw th;
                } catch (IOException e6) {
                    throw new a(2000, null, e6);
                }
            } finally {
                this.f29184h = null;
                if (this.f29187k) {
                    this.f29187k = false;
                    e();
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        return this.f29183g;
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f29186j;
        if (j4 == 0) {
            return -1;
        }
        if (j4 != -1) {
            try {
                i5 = (int) Math.min(j4, i5);
            } catch (IOException e4) {
                throw new a(2000, null, e4);
            }
        }
        FileInputStream fileInputStream = this.f29185i;
        int i6 = u82.f32873a;
        int read = fileInputStream.read(bArr, i4, i5);
        if (read == -1) {
            if (this.f29186j == -1) {
                return -1;
            }
            throw new a(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j5 = this.f29186j;
        if (j5 != -1) {
            this.f29186j = j5 - read;
        }
        c(read);
        return read;
    }
}
