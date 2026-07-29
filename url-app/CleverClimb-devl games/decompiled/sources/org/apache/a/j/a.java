package org.apache.a.j;

import java.util.HashMap;
import java.util.Map;

/* compiled from: BasicHttpContext.java */
/* loaded from: classes2.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final e f9980a;

    /* renamed from: b, reason: collision with root package name */
    private Map f9981b;

    public a() {
        this(null);
    }

    public a(e eVar) {
        this.f9981b = null;
        this.f9980a = eVar;
    }

    @Override // org.apache.a.j.e
    public Object a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        Object obj = this.f9981b != null ? this.f9981b.get(str) : null;
        return (obj != null || this.f9980a == null) ? obj : this.f9980a.a(str);
    }

    @Override // org.apache.a.j.e
    public void a(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        if (this.f9981b == null) {
            this.f9981b = new HashMap();
        }
        this.f9981b.put(str, obj);
    }
}
