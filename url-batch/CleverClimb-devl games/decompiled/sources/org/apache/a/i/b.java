package org.apache.a.i;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BasicHttpParams.java */
/* loaded from: classes2.dex */
public class b extends a implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f9979a = new HashMap();

    @Override // org.apache.a.i.d
    public Object a(String str) {
        return this.f9979a.get(str);
    }

    @Override // org.apache.a.i.d
    public d a(String str, Object obj) {
        this.f9979a.put(str, obj);
        return this;
    }

    public Object clone() throws CloneNotSupportedException {
        b bVar = (b) super.clone();
        a(bVar);
        return bVar;
    }

    protected void a(d dVar) {
        for (Map.Entry entry : this.f9979a.entrySet()) {
            if (entry.getKey() instanceof String) {
                dVar.a((String) entry.getKey(), entry.getValue());
            }
        }
    }
}
