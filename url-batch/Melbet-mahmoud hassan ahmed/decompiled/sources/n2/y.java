package n2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class y extends g {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f19602e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f19603f;

    /* renamed from: g, reason: collision with root package name */
    private long f19604g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19605h;

    private static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static class b extends m {
        public b(String str, Throwable th, int i7) {
            super(str, th, i7);
        }

        public b(Throwable th, int i7) {
            super(th, i7);
        }
    }

    public y() {
        super(false);
    }

    private static RandomAccessFile u(Uri uri) {
        try {
            return new RandomAccessFile((String) o2.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e7) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e7, (o2.m0.f19752a < 21 || !a.b(e7.getCause())) ? 2005 : 2006);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e7, 1004);
        } catch (SecurityException e8) {
            throw new b(e8, 2006);
        } catch (RuntimeException e9) {
            throw new b(e9, 2000);
        }
    }

    @Override // n2.l
    public long b(p pVar) {
        Uri uri = pVar.f19496a;
        this.f19603f = uri;
        s(pVar);
        RandomAccessFile u6 = u(uri);
        this.f19602e = u6;
        try {
            u6.seek(pVar.f19502g);
            long j7 = pVar.f19503h;
            if (j7 == -1) {
                j7 = this.f19602e.length() - pVar.f19502g;
            }
            this.f19604g = j7;
            if (j7 < 0) {
                throw new b(null, null, 2008);
            }
            this.f19605h = true;
            t(pVar);
            return this.f19604g;
        } catch (IOException e7) {
            throw new b(e7, 2000);
        }
    }

    @Override // n2.l
    public void close() {
        this.f19603f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f19602e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e7) {
                throw new b(e7, 2000);
            }
        } finally {
            this.f19602e = null;
            if (this.f19605h) {
                this.f19605h = false;
                r();
            }
        }
    }

    @Override // n2.l
    public Uri k() {
        return this.f19603f;
    }

    @Override // n2.i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (this.f19604g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) o2.m0.j(this.f19602e)).read(bArr, i7, (int) Math.min(this.f19604g, i8));
            if (read > 0) {
                this.f19604g -= read;
                q(read);
            }
            return read;
        } catch (IOException e7) {
            throw new b(e7, 2000);
        }
    }
}
