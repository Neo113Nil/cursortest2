package D4;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends n {

    /* renamed from: h, reason: collision with root package name */
    public static final JsonFactory f524h = new JsonFactory();

    /* renamed from: g, reason: collision with root package name */
    public final JsonGenerator f525g;

    public e(OutputStream outputStream) {
        this.f525g = f524h.createGenerator(outputStream);
    }

    @Override // D4.n
    public final void F(b bVar, boolean z5) {
        this.f525g.writeBooleanField(bVar.f513d, z5);
    }

    @Override // D4.n
    public final void G(b bVar, byte[] bArr) {
        this.f525g.writeBinaryField(bVar.f513d, bArr);
    }

    @Override // D4.n
    public final void H(b bVar, double d7) {
        this.f525g.writeNumberField(bVar.f513d, d7);
    }

    @Override // D4.n
    public final void I() {
        this.f525g.writeEndObject();
    }

    @Override // D4.n
    public final void J() {
        this.f525g.writeEndArray();
    }

    @Override // D4.n
    public final void K() {
        this.f525g.writeEndObject();
    }

    @Override // D4.n
    public final void L(b bVar, a aVar) {
        this.f525g.writeNumberField(bVar.f513d, aVar.f508a);
    }

    @Override // D4.n
    public final void M(b bVar, int i7) {
        this.f525g.writeNumberField(bVar.f513d, i7);
    }

    @Override // D4.n
    public final void N(b bVar, long j4) {
        this.f525g.writeStringField(bVar.f513d, Long.toString(j4));
    }

    @Override // D4.n
    public final void O(b bVar, long j4) {
        this.f525g.writeStringField(bVar.f513d, Long.toString(j4));
    }

    @Override // D4.n
    public final void P(byte[] bArr, String str) {
        this.f525g.writeRaw(str);
    }

    @Override // D4.n
    public final void Q(b bVar, String str) {
        this.f525g.writeStringField(bVar.f513d, str);
    }

    @Override // D4.n
    public final void S(b bVar, int i7) {
        this.f525g.writeObjectFieldStart(bVar.f513d);
    }

    @Override // D4.n
    public final void T(b bVar) {
        this.f525g.writeArrayFieldStart(bVar.f513d);
    }

    @Override // D4.n
    public final void U(b bVar, int i7) {
        this.f525g.writeStartObject();
    }

    @Override // D4.n
    public final void V(b bVar, String str, int i7, i iVar) {
        this.f525g.writeFieldName(bVar.f513d);
        this.f525g.writeString(str);
    }

    @Override // D4.n
    public final void W(b bVar, byte[] bArr) {
        this.f525g.writeFieldName(bVar.f513d);
        this.f525g.writeString(new String(bArr, StandardCharsets.UTF_8));
    }

    @Override // D4.n
    public final void X(b bVar, String str) {
        this.f525g.writeStringField(bVar.f513d, str);
    }

    @Override // D4.n
    public final void Z(b bVar, int i7) {
        this.f525g.writeNumberField(bVar.f513d, i7);
    }

    public final void a0(f fVar) {
        this.f525g.writeStartObject();
        fVar.c(this);
        this.f525g.writeEndObject();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f525g.close();
    }

    @Override // D4.n
    public final void g(b bVar, List list) {
        this.f525g.writeArrayFieldStart(bVar.f513d);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0((f) it.next());
        }
        this.f525g.writeEndArray();
    }

    @Override // D4.n
    public final void h(b bVar, f[] fVarArr) {
        this.f525g.writeArrayFieldStart(bVar.f513d);
        for (f fVar : fVarArr) {
            a0(fVar);
        }
        this.f525g.writeEndArray();
    }

    @Override // D4.n
    public final void m(b bVar, List list, p pVar, i iVar) {
        this.f525g.writeArrayFieldStart(bVar.f513d);
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object obj = list.get(i7);
            this.f525g.writeStartObject();
            pVar.b(this, obj, iVar);
            this.f525g.writeEndObject();
        }
        this.f525g.writeEndArray();
    }
}
