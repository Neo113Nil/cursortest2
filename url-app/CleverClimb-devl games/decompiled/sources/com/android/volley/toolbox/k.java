package com.android.volley.toolbox;

import com.android.volley.n;
import com.android.volley.t;
import com.facebook.ads.AudienceNetworkActivity;
import java.io.UnsupportedEncodingException;

/* compiled from: JsonRequest.java */
/* loaded from: classes.dex */
public abstract class k<T> extends com.android.volley.l<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2366a = String.format("application/json; charset=%s", AudienceNetworkActivity.WEBVIEW_ENCODING);

    /* renamed from: b, reason: collision with root package name */
    private final n.b<T> f2367b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2368c;

    @Override // com.android.volley.l
    protected abstract com.android.volley.n<T> a(com.android.volley.i iVar);

    public k(int i, String str, String str2, n.b<T> bVar, n.a aVar) {
        super(i, str, aVar);
        this.f2367b = bVar;
        this.f2368c = str2;
    }

    @Override // com.android.volley.l
    protected void a(T t) {
        this.f2367b.onResponse(t);
    }

    @Override // com.android.volley.l
    public String k() {
        return o();
    }

    @Override // com.android.volley.l
    public byte[] l() {
        return p();
    }

    @Override // com.android.volley.l
    public String o() {
        return f2366a;
    }

    @Override // com.android.volley.l
    public byte[] p() {
        try {
            if (this.f2368c == null) {
                return null;
            }
            return this.f2368c.getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING);
        } catch (UnsupportedEncodingException unused) {
            t.d("Unsupported Encoding while trying to get the bytes of %s using %s", this.f2368c, AudienceNetworkActivity.WEBVIEW_ENCODING);
            return null;
        }
    }
}
