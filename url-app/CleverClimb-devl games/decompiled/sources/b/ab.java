package b;

import java.io.IOException;

/* compiled from: RequestBody.java */
/* loaded from: classes.dex */
public abstract class ab {
    public abstract v a();

    public abstract void a(c.d dVar) throws IOException;

    public long b() throws IOException {
        return -1L;
    }

    public static ab a(final v vVar, final c.f fVar) {
        return new ab() { // from class: b.ab.1
            @Override // b.ab
            public v a() {
                return v.this;
            }

            @Override // b.ab
            public long b() throws IOException {
                return fVar.g();
            }

            @Override // b.ab
            public void a(c.d dVar) throws IOException {
                dVar.b(fVar);
            }
        };
    }

    public static ab a(v vVar, byte[] bArr) {
        return a(vVar, bArr, 0, bArr.length);
    }

    public static ab a(final v vVar, final byte[] bArr, final int i, final int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        b.a.c.a(bArr.length, i, i2);
        return new ab() { // from class: b.ab.2
            @Override // b.ab
            public v a() {
                return v.this;
            }

            @Override // b.ab
            public long b() {
                return i2;
            }

            @Override // b.ab
            public void a(c.d dVar) throws IOException {
                dVar.c(bArr, i, i2);
            }
        };
    }
}
