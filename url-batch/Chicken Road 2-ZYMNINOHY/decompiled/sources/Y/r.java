package Y;

import W.J;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class r extends AbstractC0123c {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f3738e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f3739f;

    /* renamed from: g, reason: collision with root package name */
    public long f3740g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3741h;

    @Override // Y.h
    public final Uri B() {
        return this.f3739f;
    }

    @Override // Y.h
    public final long b(k kVar) {
        Uri uri = kVar.f3701a;
        long j4 = kVar.f3705e;
        this.f3739f = uri;
        g();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f3738e = randomAccessFile;
            try {
                randomAccessFile.seek(j4);
                long j5 = kVar.f3706f;
                if (j5 == -1) {
                    j5 = this.f3738e.length() - j4;
                }
                this.f3740g = j5;
                if (j5 < 0) {
                    throw new q(2008, null, null);
                }
                this.f3741h = true;
                h(kVar);
                return this.f3740g;
            } catch (IOException e4) {
                throw new q(e4, 2000);
            }
        } catch (FileNotFoundException e5) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new q(e5, ((e5.getCause() instanceof ErrnoException) && ((ErrnoException) e5.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new q(1004, "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e5);
        } catch (SecurityException e6) {
            throw new q(e6, 2006);
        } catch (RuntimeException e7) {
            throw new q(e7, 2000);
        }
    }

    @Override // Y.h
    public final void close() {
        this.f3739f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f3738e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e4) {
                throw new q(e4, 2000);
            }
        } finally {
            this.f3738e = null;
            if (this.f3741h) {
                this.f3741h = false;
                f();
            }
        }
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f3740g;
        if (j4 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f3738e;
            String str = J.f3263a;
            int read = randomAccessFile.read(bArr, i4, (int) Math.min(j4, i5));
            if (read > 0) {
                this.f3740g -= read;
                a(read);
            }
            return read;
        } catch (IOException e4) {
            throw new q(e4, 2000);
        }
    }
}
