package n2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f19393e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f19394f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f19395g;

    /* renamed from: h, reason: collision with root package name */
    private long f19396h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19397i;

    public static final class a extends m {
        public a(Throwable th, int i7) {
            super(th, i7);
        }
    }

    public c(Context context) {
        super(false);
        this.f19393e = context.getAssets();
    }

    @Override // n2.l
    public long b(p pVar) {
        try {
            Uri uri = pVar.f19496a;
            this.f19394f = uri;
            String str = (String) o2.a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            s(pVar);
            InputStream open = this.f19393e.open(str, 1);
            this.f19395g = open;
            if (open.skip(pVar.f19502g) < pVar.f19502g) {
                throw new a(null, 2008);
            }
            long j7 = pVar.f19503h;
            if (j7 != -1) {
                this.f19396h = j7;
            } else {
                long available = this.f19395g.available();
                this.f19396h = available;
                if (available == 2147483647L) {
                    this.f19396h = -1L;
                }
            }
            this.f19397i = true;
            t(pVar);
            return this.f19396h;
        } catch (a e7) {
            throw e7;
        } catch (IOException e8) {
            throw new a(e8, e8 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // n2.l
    public void close() {
        this.f19394f = null;
        try {
            try {
                InputStream inputStream = this.f19395g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e7) {
                throw new a(e7, 2000);
            }
        } finally {
            this.f19395g = null;
            if (this.f19397i) {
                this.f19397i = false;
                r();
            }
        }
    }

    @Override // n2.l
    public Uri k() {
        return this.f19394f;
    }

    @Override // n2.i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f19396h;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new a(e7, 2000);
            }
        }
        int read = ((InputStream) o2.m0.j(this.f19395g)).read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f19396h;
        if (j8 != -1) {
            this.f19396h = j8 - read;
        }
        q(read);
        return read;
    }
}
