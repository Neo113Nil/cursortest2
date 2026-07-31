package t0;

import java.nio.ByteBuffer;
import t0.g;

/* loaded from: classes.dex */
final class y extends x {

    /* renamed from: i, reason: collision with root package name */
    private int[] f21884i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f21885j;

    y() {
    }

    @Override // t0.g
    public void f(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) o2.a.e(this.f21885j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m7 = m(((limit - position) / this.f21877b.f21745d) * this.f21878c.f21745d);
        while (position < limit) {
            for (int i7 : iArr) {
                m7.putShort(byteBuffer.getShort((i7 * 2) + position));
            }
            position += this.f21877b.f21745d;
        }
        byteBuffer.position(limit);
        m7.flip();
    }

    @Override // t0.x
    public g.a i(g.a aVar) {
        int[] iArr = this.f21884i;
        if (iArr == null) {
            return g.a.f21741e;
        }
        if (aVar.f21744c != 2) {
            throw new g.b(aVar);
        }
        boolean z6 = aVar.f21743b != iArr.length;
        int i7 = 0;
        while (i7 < iArr.length) {
            int i8 = iArr[i7];
            if (i8 >= aVar.f21743b) {
                throw new g.b(aVar);
            }
            z6 |= i8 != i7;
            i7++;
        }
        return z6 ? new g.a(aVar.f21742a, iArr.length, 2) : g.a.f21741e;
    }

    @Override // t0.x
    protected void j() {
        this.f21885j = this.f21884i;
    }

    @Override // t0.x
    protected void l() {
        this.f21885j = null;
        this.f21884i = null;
    }

    public void n(int[] iArr) {
        this.f21884i = iArr;
    }
}
