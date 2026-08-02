package c0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class N extends U.o {

    /* renamed from: i, reason: collision with root package name */
    public static final int f5532i = Float.floatToIntBits(Float.NaN);

    public static void m(int i4, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i4 * 4.656612875245797E-10d));
        if (floatToIntBits == f5532i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // U.n
    public final void d(ByteBuffer byteBuffer) {
        ByteBuffer l4;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i4 = limit - position;
        int i5 = this.f3062b.f3057c;
        if (i5 == 2) {
            l4 = l(i4 * 2);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), l4);
                position += 2;
            }
        } else if (i5 == 1342177280) {
            l4 = l((i4 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l4);
                position += 3;
            }
        } else if (i5 == 1610612736) {
            l4 = l(i4);
            while (position < limit) {
                m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l4);
                position += 4;
            }
        } else if (i5 == 21) {
            l4 = l((i4 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l4);
                position += 3;
            }
        } else {
            if (i5 != 22) {
                throw new IllegalStateException();
            }
            l4 = l(i4);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l4);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l4.flip();
    }

    @Override // U.o
    public final U.k h(U.k kVar) {
        int i4 = kVar.f3057c;
        if (i4 == 21 || i4 == 1342177280 || i4 == 22 || i4 == 1610612736 || i4 == 4 || i4 == 2) {
            return i4 != 4 ? new U.k(kVar.f3055a, kVar.f3056b, 4) : U.k.f3054e;
        }
        throw new U.m(kVar);
    }
}
