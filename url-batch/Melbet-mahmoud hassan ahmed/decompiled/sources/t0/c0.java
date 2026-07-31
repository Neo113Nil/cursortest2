package t0;

import java.nio.ByteBuffer;
import o2.m0;
import t0.g;

/* loaded from: classes.dex */
final class c0 extends x {

    /* renamed from: i, reason: collision with root package name */
    private static final int f21703i = Float.floatToIntBits(Float.NaN);

    c0() {
    }

    private static void n(int i7, ByteBuffer byteBuffer) {
        double d7 = i7;
        Double.isNaN(d7);
        int floatToIntBits = Float.floatToIntBits((float) (d7 * 4.656612875245797E-10d));
        if (floatToIntBits == f21703i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // t0.g
    public void f(ByteBuffer byteBuffer) {
        ByteBuffer m7;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        int i8 = this.f21877b.f21744c;
        if (i8 == 536870912) {
            m7 = m((i7 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m7);
                position += 3;
            }
        } else {
            if (i8 != 805306368) {
                throw new IllegalStateException();
            }
            m7 = m(i7);
            while (position < limit) {
                n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m7);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m7.flip();
    }

    @Override // t0.x
    public g.a i(g.a aVar) {
        int i7 = aVar.f21744c;
        if (m0.s0(i7)) {
            return i7 != 4 ? new g.a(aVar.f21742a, aVar.f21743b, 4) : g.a.f21741e;
        }
        throw new g.b(aVar);
    }
}
