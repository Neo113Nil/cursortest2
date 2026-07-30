package J6;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class e extends o {

    /* renamed from: v, reason: collision with root package name */
    public static final JsonFactory f1414v = new JsonFactory();

    /* renamed from: u, reason: collision with root package name */
    public final JsonGenerator f1415u;

    public e(OutputStream outputStream) {
        this.f1415u = f1414v.createGenerator(outputStream);
    }

    @Override // J6.o
    public final void B() {
        this.f1415u.writeEndArray();
    }

    @Override // J6.o
    public final void C() {
        this.f1415u.writeEndObject();
    }

    @Override // J6.o
    public final void D(b bVar, a aVar) {
        this.f1415u.writeNumberField(bVar.f1403d, aVar.f1398a);
    }

    @Override // J6.o
    public final void E(b bVar, int i) {
        this.f1415u.writeNumberField(bVar.f1403d, i);
    }

    @Override // J6.o
    public final void F(b bVar, long j9) {
        this.f1415u.writeStringField(bVar.f1403d, Long.toString(j9));
    }

    @Override // J6.o
    public final void G(b bVar, long j9) {
        this.f1415u.writeStringField(bVar.f1403d, Long.toString(j9));
    }

    @Override // J6.o
    public final void H(String str, byte[] bArr) {
        this.f1415u.writeRaw(str);
    }

    @Override // J6.o
    public final void I(b bVar, String str) {
        this.f1415u.writeStringField(bVar.f1403d, str);
    }

    @Override // J6.o
    public final void K(b bVar, int i) {
        this.f1415u.writeObjectFieldStart(bVar.f1403d);
    }

    @Override // J6.o
    public final void V(b bVar) {
        this.f1415u.writeArrayFieldStart(bVar.f1403d);
    }

    @Override // J6.o
    public final void W(b bVar, int i) {
        this.f1415u.writeStartObject();
    }

    @Override // J6.o
    public final void X(b bVar, String str, int i, j jVar) {
        this.f1415u.writeFieldName(bVar.f1403d);
        this.f1415u.writeString(str);
    }

    @Override // J6.o
    public final void Y(b bVar, byte[] bArr) {
        this.f1415u.writeFieldName(bVar.f1403d);
        this.f1415u.writeString(new String(bArr, StandardCharsets.UTF_8));
    }

    @Override // J6.o
    public final void Z(b bVar, String str) {
        this.f1415u.writeStringField(bVar.f1403d, str);
    }

    @Override // J6.o
    public final void b0(b bVar, int i) {
        this.f1415u.writeNumberField(bVar.f1403d, i);
    }

    public final void c0(f fVar) {
        this.f1415u.writeStartObject();
        fVar.c(this);
        this.f1415u.writeEndObject();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f1415u.close();
    }

    @Override // J6.o
    public final void i(b bVar, List list) {
        this.f1415u.writeArrayFieldStart(bVar.f1403d);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0((f) it.next());
        }
        this.f1415u.writeEndArray();
    }

    @Override // J6.o
    public final void j(b bVar, f[] fVarArr) {
        this.f1415u.writeArrayFieldStart(bVar.f1403d);
        for (f fVar : fVarArr) {
            c0(fVar);
        }
        this.f1415u.writeEndArray();
    }

    @Override // J6.o
    public final void k(b bVar, List list, q qVar, j jVar) {
        this.f1415u.writeArrayFieldStart(bVar.f1403d);
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            this.f1415u.writeStartObject();
            qVar.b(this, obj, jVar);
            this.f1415u.writeEndObject();
        }
        this.f1415u.writeEndArray();
    }

    @Override // J6.o
    public final void q(b bVar, boolean z8) {
        this.f1415u.writeBooleanField(bVar.f1403d, z8);
    }

    @Override // J6.o
    public final void w(b bVar, byte[] bArr) {
        this.f1415u.writeBinaryField(bVar.f1403d, bArr);
    }

    @Override // J6.o
    public final void x(b bVar, double d2) {
        this.f1415u.writeNumberField(bVar.f1403d, d2);
    }

    @Override // J6.o
    public final void z() {
        this.f1415u.writeEndObject();
    }
}
