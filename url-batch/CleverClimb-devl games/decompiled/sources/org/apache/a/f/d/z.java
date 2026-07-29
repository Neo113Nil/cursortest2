package org.apache.a.f.d;

import java.util.Collection;

/* compiled from: RFC2109SpecFactory.java */
/* loaded from: classes2.dex */
public class z implements org.apache.a.d.i {
    @Override // org.apache.a.d.i
    public org.apache.a.d.h a(org.apache.a.i.d dVar) {
        if (dVar != null) {
            Collection collection = (Collection) dVar.a("http.protocol.cookie-datepatterns");
            return new y(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null, dVar.a("http.protocol.single-cookie-header", false));
        }
        return new y();
    }
}
