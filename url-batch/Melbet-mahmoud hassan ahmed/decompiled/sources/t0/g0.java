package t0;

import java.nio.ByteBuffer;
import o2.m0;
import t0.g;

/* loaded from: classes.dex */
final class g0 extends x {
    g0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0 A[ADDED_TO_REGION, LOOP:4: B:33:0x00b0->B:34:0x00b2, LOOP_START, PHI: r0
      0x00b0: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0037, B:34:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // t0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(ByteBuffer byteBuffer) {
        int i7;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i8 = limit - position;
        int i9 = this.f21877b.f21744c;
        if (i9 != 3) {
            if (i9 != 4) {
                if (i9 != 268435456) {
                    if (i9 == 536870912) {
                        i8 /= 3;
                    } else if (i9 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer m7 = m(i8);
                i7 = this.f21877b.f21744c;
                if (i7 == 3) {
                    while (position < limit) {
                        m7.put((byte) 0);
                        m7.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i7 == 4) {
                    while (position < limit) {
                        short p7 = (short) (m0.p(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                        m7.put((byte) (p7 & 255));
                        m7.put((byte) ((p7 >> 8) & 255));
                        position += 4;
                    }
                } else if (i7 == 268435456) {
                    while (position < limit) {
                        m7.put(byteBuffer.get(position + 1));
                        m7.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i7 == 536870912) {
                    while (position < limit) {
                        m7.put(byteBuffer.get(position + 1));
                        m7.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else {
                    if (i7 != 805306368) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        m7.put(byteBuffer.get(position + 2));
                        m7.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                m7.flip();
            }
            i8 /= 2;
            ByteBuffer m72 = m(i8);
            i7 = this.f21877b.f21744c;
            if (i7 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            m72.flip();
        }
        i8 *= 2;
        ByteBuffer m722 = m(i8);
        i7 = this.f21877b.f21744c;
        if (i7 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        m722.flip();
    }

    @Override // t0.x
    public g.a i(g.a aVar) {
        int i7 = aVar.f21744c;
        if (i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 536870912 || i7 == 805306368 || i7 == 4) {
            return i7 != 2 ? new g.a(aVar.f21742a, aVar.f21743b, 2) : g.a.f21741e;
        }
        throw new g.b(aVar);
    }
}
