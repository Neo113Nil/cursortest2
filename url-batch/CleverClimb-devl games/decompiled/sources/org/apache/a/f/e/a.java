package org.apache.a.f.e;

import com.aiming.mdt.utils.Constants;
import java.io.IOException;
import org.apache.a.e.e;
import org.apache.a.f.f.g;
import org.apache.a.g.f;
import org.apache.a.j;
import org.apache.a.l;
import org.apache.a.o;

/* compiled from: EntityDeserializer.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final e f9889a;

    public a(e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("Content length strategy may not be null");
        }
        this.f9889a = eVar;
    }

    protected org.apache.a.e.b a(f fVar, o oVar) throws l, IOException {
        org.apache.a.e.b bVar = new org.apache.a.e.b();
        long a2 = this.f9889a.a(oVar);
        if (a2 == -2) {
            bVar.a(true);
            bVar.a(-1L);
            bVar.a(new org.apache.a.f.f.e(fVar));
        } else if (a2 == -1) {
            bVar.a(false);
            bVar.a(-1L);
            bVar.a(new org.apache.a.f.f.l(fVar));
        } else {
            bVar.a(false);
            bVar.a(a2);
            bVar.a(new g(fVar, a2));
        }
        org.apache.a.d firstHeader = oVar.getFirstHeader(Constants.KEY_CONTENT_TYPE);
        if (firstHeader != null) {
            bVar.a(firstHeader);
        }
        org.apache.a.d firstHeader2 = oVar.getFirstHeader("Content-Encoding");
        if (firstHeader2 != null) {
            bVar.b(firstHeader2);
        }
        return bVar;
    }

    public j b(f fVar, o oVar) throws l, IOException {
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        return a(fVar, oVar);
    }
}
