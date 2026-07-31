package n2;

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

/* loaded from: classes.dex */
public final class k0 extends g {

    /* renamed from: e, reason: collision with root package name */
    private final Resources f19464e;

    /* renamed from: f, reason: collision with root package name */
    private final String f19465f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f19466g;

    /* renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f19467h;

    /* renamed from: i, reason: collision with root package name */
    private InputStream f19468i;

    /* renamed from: j, reason: collision with root package name */
    private long f19469j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19470k;

    public static class a extends m {
        public a(String str, Throwable th, int i7) {
            super(str, th, i7);
        }
    }

    public k0(Context context) {
        super(false);
        this.f19464e = context.getResources();
        this.f19465f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
    }

    @Override // n2.l
    public long b(p pVar) {
        int parseInt;
        String str;
        Uri uri = pVar.f19496a;
        this.f19466g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) o2.a.e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = Integer.parseInt((String) o2.a.e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String str2 = (String) o2.a.e(uri.getPath());
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(str2);
            parseInt = this.f19464e.getIdentifier(sb.toString(), "raw", this.f19465f);
            if (parseInt == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        }
        s(pVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f19464e.openRawResourceFd(parseInt);
            this.f19467h = openRawResourceFd;
            if (openRawResourceFd == null) {
                throw new a("Resource is compressed: " + uri, null, 2000);
            }
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.f19468i = fileInputStream;
            if (length != -1) {
                try {
                    if (pVar.f19502g > length) {
                        throw new a(null, null, 2008);
                    }
                } catch (a e7) {
                    throw e7;
                } catch (IOException e8) {
                    throw new a(null, e8, 2000);
                }
            }
            long startOffset = openRawResourceFd.getStartOffset();
            long skip = fileInputStream.skip(pVar.f19502g + startOffset) - startOffset;
            if (skip != pVar.f19502g) {
                throw new a(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f19469j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f19469j = size;
                    if (size < 0) {
                        throw new a(null, null, 2008);
                    }
                }
            } else {
                long j7 = length - skip;
                this.f19469j = j7;
                if (j7 < 0) {
                    throw new m(2008);
                }
            }
            long j8 = pVar.f19503h;
            if (j8 != -1) {
                long j9 = this.f19469j;
                if (j9 != -1) {
                    j8 = Math.min(j9, j8);
                }
                this.f19469j = j8;
            }
            this.f19470k = true;
            t(pVar);
            long j10 = pVar.f19503h;
            return j10 != -1 ? j10 : this.f19469j;
        } catch (Resources.NotFoundException e9) {
            throw new a(null, e9, 2005);
        }
    }

    @Override // n2.l
    public void close() {
        this.f19466g = null;
        try {
            try {
                InputStream inputStream = this.f19468i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f19468i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f19467h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f19467h = null;
                        if (this.f19470k) {
                            this.f19470k = false;
                            r();
                        }
                    }
                } catch (IOException e7) {
                    throw new a(null, e7, 2000);
                }
            } catch (IOException e8) {
                throw new a(null, e8, 2000);
            }
        } catch (Throwable th) {
            this.f19468i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f19467h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f19467h = null;
                    if (this.f19470k) {
                        this.f19470k = false;
                        r();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new a(null, e9, 2000);
                }
            } finally {
                this.f19467h = null;
                if (this.f19470k) {
                    this.f19470k = false;
                    r();
                }
            }
        }
    }

    @Override // n2.l
    public Uri k() {
        return this.f19466g;
    }

    @Override // n2.i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f19469j;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new a(null, e7, 2000);
            }
        }
        int read = ((InputStream) o2.m0.j(this.f19468i)).read(bArr, i7, i8);
        if (read == -1) {
            if (this.f19469j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j8 = this.f19469j;
        if (j8 != -1) {
            this.f19469j = j8 - read;
        }
        q(read);
        return read;
    }
}
