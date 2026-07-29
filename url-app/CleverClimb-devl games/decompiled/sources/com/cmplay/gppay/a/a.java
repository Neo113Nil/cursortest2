package com.cmplay.gppay.a;

/* loaded from: classes.dex */
public class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    c f4067a;

    public a(int i, String str) {
        this(new c(i, str));
    }

    public a(int i, String str, Exception exc) {
        this(new c(i, str), exc);
    }

    public a(c cVar) {
        this(cVar, (Exception) null);
    }

    public a(c cVar, Exception exc) {
        super(cVar.b(), exc);
        this.f4067a = cVar;
    }

    public c a() {
        return this.f4067a;
    }
}
