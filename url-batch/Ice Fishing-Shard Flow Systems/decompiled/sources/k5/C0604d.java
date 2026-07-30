package k5;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/* renamed from: k5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604d extends l {

    /* renamed from: i, reason: collision with root package name */
    public static final JsonFactory f6066i = new JsonFactory();

    /* renamed from: e, reason: collision with root package name */
    public final JsonGenerator f6067e;

    public C0604d(OutputStream outputStream) {
        this.f6067e = f6066i.createGenerator(outputStream);
    }

    @Override // k5.l
    public final void F(C0602b c0602b, boolean z7) {
        this.f6067e.writeBooleanField(c0602b.f6059d, z7);
    }

    @Override // k5.l
    public final void G(C0602b c0602b, byte[] bArr) {
        this.f6067e.writeBinaryField(c0602b.f6059d, bArr);
    }

    @Override // k5.l
    public final void H(C0602b c0602b, double d7) {
        this.f6067e.writeNumberField(c0602b.f6059d, d7);
    }

    @Override // k5.l
    public final void I() {
        this.f6067e.writeEndObject();
    }

    @Override // k5.l
    public final void J() {
        this.f6067e.writeEndArray();
    }

    @Override // k5.l
    public final void K() {
        this.f6067e.writeEndObject();
    }

    @Override // k5.l
    public final void L(C0602b c0602b, C0601a c0601a) {
        this.f6067e.writeNumberField(c0602b.f6059d, c0601a.f6054a);
    }

    @Override // k5.l
    public final void M(C0602b c0602b, int i2) {
        this.f6067e.writeNumberField(c0602b.f6059d, i2);
    }

    @Override // k5.l
    public final void N(C0602b c0602b, long j) {
        this.f6067e.writeStringField(c0602b.f6059d, Long.toString(j));
    }

    @Override // k5.l
    public final void O(C0602b c0602b, long j) {
        this.f6067e.writeStringField(c0602b.f6059d, Long.toString(j));
    }

    @Override // k5.l
    public final void P(byte[] bArr, String str) {
        this.f6067e.writeRaw(str);
    }

    @Override // k5.l
    public final void Q(C0602b c0602b, String str) {
        this.f6067e.writeStringField(c0602b.f6059d, str);
    }

    @Override // k5.l
    public final void S(C0602b c0602b, int i2) {
        this.f6067e.writeObjectFieldStart(c0602b.f6059d);
    }

    @Override // k5.l
    public final void T(C0602b c0602b) {
        this.f6067e.writeArrayFieldStart(c0602b.f6059d);
    }

    @Override // k5.l
    public final void U(C0602b c0602b, int i2) {
        this.f6067e.writeStartObject();
    }

    @Override // k5.l
    public final void V(C0602b c0602b, String str, int i2, g gVar) {
        this.f6067e.writeFieldName(c0602b.f6059d);
        this.f6067e.writeString(str);
    }

    @Override // k5.l
    public final void W(C0602b c0602b, byte[] bArr) {
        this.f6067e.writeFieldName(c0602b.f6059d);
        this.f6067e.writeString(new String(bArr, StandardCharsets.UTF_8));
    }

    @Override // k5.l
    public final void X(C0602b c0602b, String str) {
        this.f6067e.writeStringField(c0602b.f6059d, str);
    }

    @Override // k5.l
    public final void Z(C0602b c0602b, int i2) {
        this.f6067e.writeNumberField(c0602b.f6059d, i2);
    }

    public final void a0(AbstractC0605e abstractC0605e) {
        this.f6067e.writeStartObject();
        abstractC0605e.c(this);
        this.f6067e.writeEndObject();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f6067e.close();
    }

    @Override // k5.l
    public final void h(C0602b c0602b, List list) {
        this.f6067e.writeArrayFieldStart(c0602b.f6059d);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0((AbstractC0605e) it.next());
        }
        this.f6067e.writeEndArray();
    }

    @Override // k5.l
    public final void j(C0602b c0602b, AbstractC0605e[] abstractC0605eArr) {
        this.f6067e.writeArrayFieldStart(c0602b.f6059d);
        for (AbstractC0605e abstractC0605e : abstractC0605eArr) {
            a0(abstractC0605e);
        }
        this.f6067e.writeEndArray();
    }

    @Override // k5.l
    public final void s(C0602b c0602b, List list, n nVar, g gVar) {
        this.f6067e.writeArrayFieldStart(c0602b.f6059d);
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            this.f6067e.writeStartObject();
            nVar.c(this, obj, gVar);
            this.f6067e.writeEndObject();
        }
        this.f6067e.writeEndArray();
    }
}
