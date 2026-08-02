package Y;

import W.J;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122b extends AbstractC0123c {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f3675e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f3676f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f3677g;

    /* renamed from: h, reason: collision with root package name */
    public long f3678h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3679i;

    public C0122b(Context context) {
        super(false);
        this.f3675e = context.getAssets();
    }

    @Override // Y.h
    public final Uri B() {
        return this.f3676f;
    }

    @Override // Y.h
    public final long b(k kVar) {
        try {
            Uri uri = kVar.f3701a;
            long j4 = kVar.f3705e;
            this.f3676f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            g();
            InputStream open = this.f3675e.open(path, 1);
            this.f3677g = open;
            if (open.skip(j4) < j4) {
                throw new C0121a(null, 2008);
            }
            long j5 = kVar.f3706f;
            if (j5 != -1) {
                this.f3678h = j5;
            } else {
                long available = this.f3677g.available();
                this.f3678h = available;
                if (available == 2147483647L) {
                    this.f3678h = -1L;
                }
            }
            this.f3679i = true;
            h(kVar);
            return this.f3678h;
        } catch (C0121a e4) {
            throw e4;
        } catch (IOException e5) {
            throw new C0121a(e5, e5 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // Y.h
    public final void close() {
        this.f3676f = null;
        try {
            try {
                InputStream inputStream = this.f3677g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e4) {
                throw new C0121a(e4, 2000);
            }
        } finally {
            this.f3677g = null;
            if (this.f3679i) {
                this.f3679i = false;
                f();
            }
        }
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f3678h;
        if (j4 != 0) {
            if (j4 != -1) {
                try {
                    i5 = (int) Math.min(j4, i5);
                } catch (IOException e4) {
                    throw new C0121a(e4, 2000);
                }
            }
            InputStream inputStream = this.f3677g;
            String str = J.f3263a;
            int read = inputStream.read(bArr, i4, i5);
            if (read != -1) {
                long j5 = this.f3678h;
                if (j5 != -1) {
                    this.f3678h = j5 - read;
                }
                a(read);
                return read;
            }
        }
        return -1;
    }
}
