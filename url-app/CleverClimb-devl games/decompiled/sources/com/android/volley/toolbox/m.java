package com.android.volley.toolbox;

import com.android.volley.n;
import java.io.UnsupportedEncodingException;

/* compiled from: StringRequest.java */
/* loaded from: classes.dex */
public class m extends com.android.volley.l<String> {

    /* renamed from: a, reason: collision with root package name */
    private final n.b<String> f2370a;

    public m(int i, String str, n.b<String> bVar, n.a aVar) {
        super(i, str, aVar);
        this.f2370a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
        this.f2370a.onResponse(str);
    }

    @Override // com.android.volley.l
    protected com.android.volley.n<String> a(com.android.volley.i iVar) {
        String str;
        try {
            str = new String(iVar.f2285b, e.a(iVar.f2286c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(iVar.f2285b);
        }
        return com.android.volley.n.a(str, e.a(iVar));
    }
}
