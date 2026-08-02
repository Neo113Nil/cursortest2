package Y;

import E.AbstractC0005f;
import T.G;
import W.J;
import a.AbstractC0124a;
import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class f extends AbstractC0123c {

    /* renamed from: e, reason: collision with root package name */
    public k f3690e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f3691f;

    /* renamed from: g, reason: collision with root package name */
    public int f3692g;

    /* renamed from: h, reason: collision with root package name */
    public int f3693h;

    @Override // Y.h
    public final Uri B() {
        k kVar = this.f3690e;
        if (kVar != null) {
            return kVar.f3701a;
        }
        return null;
    }

    @Override // Y.h
    public final long b(k kVar) {
        g();
        this.f3690e = kVar;
        Uri uri = kVar.f3701a;
        long j4 = kVar.f3706f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        AbstractC0124a.k("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = J.f3263a;
        String[] split = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (split.length != 2) {
            throw new G("Unexpected URI format: " + normalizeScheme, null, true, 0);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f3691f = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e4) {
                throw new G(AbstractC0005f.n("Error while parsing Base64 encoded string: ", str2), e4, true, 0);
            }
        } else {
            this.f3691f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j5 = kVar.f3705e;
        byte[] bArr = this.f3691f;
        if (j5 > bArr.length) {
            this.f3691f = null;
            throw new i(2008);
        }
        int i4 = (int) j5;
        this.f3692g = i4;
        int length = bArr.length - i4;
        this.f3693h = length;
        if (j4 != -1) {
            this.f3693h = (int) Math.min(length, j4);
        }
        h(kVar);
        return j4 != -1 ? j4 : this.f3693h;
    }

    @Override // Y.h
    public final void close() {
        if (this.f3691f != null) {
            this.f3691f = null;
            f();
        }
        this.f3690e = null;
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f3693h;
        if (i6 == 0) {
            return -1;
        }
        int min = Math.min(i5, i6);
        byte[] bArr2 = this.f3691f;
        String str = J.f3263a;
        System.arraycopy(bArr2, this.f3692g, bArr, i4, min);
        this.f3692g += min;
        this.f3693h -= min;
        a(min);
        return min;
    }
}
