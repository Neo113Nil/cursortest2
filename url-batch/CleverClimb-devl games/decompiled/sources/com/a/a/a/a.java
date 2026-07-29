package com.a.a.a;

import com.a.a.a.c;
import java.io.Reader;

/* loaded from: classes.dex */
public class a implements c.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.e f2227a = new com.google.gson.e();

    @Override // com.a.a.a.c.b
    public <T> T a(Reader reader, Class<T> cls) {
        return (T) this.f2227a.a(reader, (Class) cls);
    }

    @Override // com.a.a.a.c.b
    public <T> T a(String str, Class<T> cls) {
        return (T) this.f2227a.a(str, (Class) cls);
    }

    @Override // com.a.a.a.c.b
    public String a(Object obj) {
        return this.f2227a.b(obj);
    }
}
