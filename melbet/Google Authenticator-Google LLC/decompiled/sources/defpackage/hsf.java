package defpackage;

import j$.net.URLDecoder;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hsf extends hdg implements Cloneable, Serializable {
    public static final hsf a = new hsf(hcv.a);
    private static final long serialVersionUID = -3053773769157973706L;
    public final hgv b;

    public hsf(hgv hgvVar) {
        this.b = new hry(hgvVar);
    }

    public static String e(String str, int i, int i2, Charset charset, boolean z) {
        try {
            return z ? new String(URLDecoder.decode(str.substring(i, i2), "ISO-8859-1").getBytes(StandardCharsets.ISO_8859_1), charset) : URLDecoder.decode(str.substring(i, i2), charset.name());
        } catch (UnsupportedEncodingException unused) {
            return str.substring(i, i2);
        } catch (IllegalArgumentException unused2) {
            return str.substring(i, i2);
        }
    }

    @Override // defpackage.hdg
    protected final hgv a() {
        return this.b;
    }

    @Override // defpackage.hdg, defpackage.hdj
    /* renamed from: b */
    protected final /* synthetic */ hhu f() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new hsf(new hgu(this.b));
    }

    @Override // defpackage.hdj, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.b;
    }

    @Override // defpackage.hdk
    public final String toString() {
        Charset charset = hse.a;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = o().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((CharSequence) hse.a((String) entry.getKey(), charset));
                if (!((String) entry.getValue()).isEmpty()) {
                    sb.append('=').append(hse.a((String) entry.getValue(), charset));
                }
                if (it.hasNext()) {
                    sb.append('&');
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
