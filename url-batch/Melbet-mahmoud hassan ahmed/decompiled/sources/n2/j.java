package n2;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import r0.n2;

/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: e, reason: collision with root package name */
    private p f19454e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f19455f;

    /* renamed from: g, reason: collision with root package name */
    private int f19456g;

    /* renamed from: h, reason: collision with root package name */
    private int f19457h;

    public j() {
        super(false);
    }

    @Override // n2.l
    public long b(p pVar) {
        s(pVar);
        this.f19454e = pVar;
        Uri uri = pVar.f19496a;
        String scheme = uri.getScheme();
        o2.a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] Q0 = o2.m0.Q0(uri.getSchemeSpecificPart(), ",");
        if (Q0.length != 2) {
            throw n2.b("Unexpected URI format: " + uri, null);
        }
        String str = Q0[1];
        if (Q0[0].contains(";base64")) {
            try {
                this.f19455f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e7) {
                throw n2.b("Error while parsing Base64 encoded string: " + str, e7);
            }
        } else {
            this.f19455f = o2.m0.m0(URLDecoder.decode(str, l4.d.f18612a.name()));
        }
        long j7 = pVar.f19502g;
        byte[] bArr = this.f19455f;
        if (j7 > bArr.length) {
            this.f19455f = null;
            throw new m(2008);
        }
        int i7 = (int) j7;
        this.f19456g = i7;
        int length = bArr.length - i7;
        this.f19457h = length;
        long j8 = pVar.f19503h;
        if (j8 != -1) {
            this.f19457h = (int) Math.min(length, j8);
        }
        t(pVar);
        long j9 = pVar.f19503h;
        return j9 != -1 ? j9 : this.f19457h;
    }

    @Override // n2.l
    public void close() {
        if (this.f19455f != null) {
            this.f19455f = null;
            r();
        }
        this.f19454e = null;
    }

    @Override // n2.l
    public Uri k() {
        p pVar = this.f19454e;
        if (pVar != null) {
            return pVar.f19496a;
        }
        return null;
    }

    @Override // n2.i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f19457h;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i8, i9);
        System.arraycopy(o2.m0.j(this.f19455f), this.f19456g, bArr, i7, min);
        this.f19456g += min;
        this.f19457h -= min;
        q(min);
        return min;
    }
}
