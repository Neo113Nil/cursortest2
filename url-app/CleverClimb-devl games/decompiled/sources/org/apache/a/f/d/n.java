package org.apache.a.f.d;

import java.util.Collection;

/* compiled from: BrowserCompatSpecFactory.java */
/* loaded from: classes2.dex */
public class n implements org.apache.a.d.i {
    @Override // org.apache.a.d.i
    public org.apache.a.d.h a(org.apache.a.i.d dVar) {
        if (dVar != null) {
            Collection collection = (Collection) dVar.a("http.protocol.cookie-datepatterns");
            return new m(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null);
        }
        return new m();
    }
}
