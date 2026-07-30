package com.crrepa.l1;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes3.dex */
public abstract class n {

    class a extends n {
        a() {
        }

        @Override // com.crrepa.l1.n
        public Object a(com.crrepa.t1.a aVar) {
            if (aVar.t() != com.crrepa.t1.c.NULL) {
                return n.this.a(aVar);
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Object obj) {
            if (obj == null) {
                bVar.k();
            } else {
                n.this.a(bVar, obj);
            }
        }
    }

    public final n a() {
        return new a();
    }

    public abstract Object a(com.crrepa.t1.a aVar);

    public abstract void a(com.crrepa.t1.b bVar, Object obj);

    public final h b(Object obj) {
        try {
            com.crrepa.o1.g gVar = new com.crrepa.o1.g();
            a(gVar, obj);
            return gVar.n();
        } catch (IOException e8) {
            throw new l(e8);
        }
    }

    public final Object a(h hVar) {
        try {
            return a((com.crrepa.t1.a) new com.crrepa.o1.f(hVar));
        } catch (IOException e8) {
            throw new l(e8);
        }
    }

    public final Object a(Reader reader) {
        return a(new com.crrepa.t1.a(reader));
    }

    public final Object a(String str) {
        return a((Reader) new StringReader(str));
    }

    public final String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            a(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    public final void a(Writer writer, Object obj) {
        a(new com.crrepa.t1.b(writer), obj);
    }
}
