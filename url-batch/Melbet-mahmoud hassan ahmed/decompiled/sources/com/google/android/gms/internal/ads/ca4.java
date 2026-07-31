package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ca4 extends eb1 {

    /* renamed from: e, reason: collision with root package name */
    private final Resources f3780e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3781f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f3782g;

    /* renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f3783h;

    /* renamed from: i, reason: collision with root package name */
    private InputStream f3784i;

    /* renamed from: j, reason: collision with root package name */
    private long f3785j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3786k;

    public ca4(Context context) {
        super(false);
        this.f3780e = context.getResources();
        this.f3781f = context.getPackageName();
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f3785j;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new ba4(null, e7, 2000);
            }
        }
        InputStream inputStream = this.f3784i;
        int i9 = n13.f8865a;
        int read = inputStream.read(bArr, i7, i8);
        if (read == -1) {
            if (this.f3785j == -1) {
                return -1;
            }
            throw new ba4("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j8 = this.f3785j;
        if (j8 != -1) {
            this.f3785j = j8 - read;
        }
        o(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        return this.f3782g;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        this.f3782g = null;
        try {
            try {
                InputStream inputStream = this.f3784i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f3784i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f3783h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f3783h = null;
                        if (this.f3786k) {
                            this.f3786k = false;
                            p();
                        }
                    }
                } catch (IOException e7) {
                    throw new ba4(null, e7, 2000);
                }
            } catch (IOException e8) {
                throw new ba4(null, e8, 2000);
            }
        } catch (Throwable th) {
            this.f3784i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f3783h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f3783h = null;
                    if (this.f3786k) {
                        this.f3786k = false;
                        p();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new ba4(null, e9, 2000);
                }
            } catch (Throwable th2) {
                this.f3783h = null;
                if (this.f3786k) {
                    this.f3786k = false;
                    p();
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r1.matches("\\d+") != false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    @Override // com.google.android.gms.internal.ads.he1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(li1 li1Var) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        long j7;
        Uri uri = li1Var.f7985a;
        this.f3782g = uri;
        try {
            try {
                if (!TextUtils.equals("rawresource", uri.getScheme())) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        Objects.requireNonNull(lastPathSegment);
                    }
                    if (!TextUtils.equals("android.resource", uri.getScheme())) {
                        throw new ba4("URI must either use scheme rawresource or android.resource", null, 1004);
                    }
                    String path = uri.getPath();
                    Objects.requireNonNull(path);
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String host = uri.getHost();
                    String valueOf = String.valueOf(TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":"));
                    String valueOf2 = String.valueOf(path);
                    parseInt = this.f3780e.getIdentifier(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), "raw", this.f3781f);
                    if (parseInt == 0) {
                        throw new ba4("Resource not found.", null, 2005);
                    }
                    q(li1Var);
                    openRawResourceFd = this.f3780e.openRawResourceFd(parseInt);
                    this.f3783h = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new ba4("Resource is compressed: ".concat(String.valueOf(uri)), null, 2000);
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.f3784i = fileInputStream;
                    if (length != -1) {
                        try {
                            if (li1Var.f7990f > length) {
                                throw new ba4(null, null, 2008);
                            }
                        } catch (ba4 e7) {
                            throw e7;
                        } catch (IOException e8) {
                            throw new ba4(null, e8, 2000);
                        }
                    }
                    long startOffset = openRawResourceFd.getStartOffset();
                    long skip = fileInputStream.skip(li1Var.f7990f + startOffset) - startOffset;
                    if (skip != li1Var.f7990f) {
                        throw new ba4(null, null, 2008);
                    }
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f3785j = -1L;
                            j7 = -1;
                        } else {
                            j7 = channel.size() - channel.position();
                            this.f3785j = j7;
                            if (j7 < 0) {
                                throw new ba4(null, null, 2008);
                            }
                        }
                    } else {
                        j7 = length - skip;
                        this.f3785j = j7;
                        if (j7 < 0) {
                            throw new if1(2008);
                        }
                    }
                    long j8 = li1Var.f7991g;
                    if (j8 != -1) {
                        if (j7 != -1) {
                            j8 = Math.min(j7, j8);
                        }
                        this.f3785j = j8;
                    }
                    this.f3786k = true;
                    r(li1Var);
                    long j9 = li1Var.f7991g;
                    return j9 != -1 ? j9 : this.f3785j;
                }
                openRawResourceFd = this.f3780e.openRawResourceFd(parseInt);
                this.f3783h = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e9) {
                throw new ba4(null, e9, 2005);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            Objects.requireNonNull(lastPathSegment2);
            parseInt = Integer.parseInt(lastPathSegment2);
            q(li1Var);
        } catch (NumberFormatException unused) {
            throw new ba4("Resource identifier must be an integer.", null, 1004);
        }
    }
}
