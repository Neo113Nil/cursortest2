package c2;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class g extends u0.j<l, m, j> implements i {

    /* renamed from: n, reason: collision with root package name */
    private final String f1870n;

    class a extends m {
        a() {
        }

        @Override // u0.h
        public void q() {
            g.this.s(this);
        }
    }

    protected g(String str) {
        super(new l[2], new m[2]);
        this.f1870n = str;
        v(1024);
    }

    protected abstract h A(byte[] bArr, int i7, boolean z6);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u0.j
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final j k(l lVar, m mVar, boolean z6) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) o2.a.e(lVar.f22411h);
            mVar.r(lVar.f22413j, A(byteBuffer.array(), byteBuffer.limit(), z6), lVar.f1873n);
            mVar.i(Integer.MIN_VALUE);
            return null;
        } catch (j e7) {
            return e7;
        }
    }

    @Override // c2.i
    public void b(long j7) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u0.j
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final l h() {
        return new l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u0.j
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final m i() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u0.j
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final j j(Throwable th) {
        return new j("Unexpected decode error", th);
    }
}
