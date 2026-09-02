package U;

import W.J;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class u extends o {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e4->B:43:0x00e6, LOOP_START, PHI: r0
      0x00e4: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003e, B:43:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // U.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ByteBuffer byteBuffer) {
        int i4;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i5 = limit - position;
        int i6 = this.f3062b.f3057c;
        if (i6 != 3) {
            if (i6 != 4) {
                if (i6 != 21) {
                    if (i6 != 22) {
                        if (i6 != 268435456) {
                            if (i6 != 1342177280) {
                                if (i6 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                        ByteBuffer l4 = l(i5);
                        i4 = this.f3062b.f3057c;
                        if (i4 == 3) {
                            while (position < limit) {
                                l4.put((byte) 0);
                                l4.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i4 == 4) {
                            while (position < limit) {
                                short i7 = (short) (J.i(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                                l4.put((byte) (i7 & 255));
                                l4.put((byte) ((i7 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
                                position += 4;
                            }
                        } else if (i4 == 21) {
                            while (position < limit) {
                                l4.put(byteBuffer.get(position + 1));
                                l4.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i4 == 22) {
                            while (position < limit) {
                                l4.put(byteBuffer.get(position + 2));
                                l4.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i4 == 268435456) {
                            while (position < limit) {
                                l4.put(byteBuffer.get(position + 1));
                                l4.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i4 == 1342177280) {
                            while (position < limit) {
                                l4.put(byteBuffer.get(position + 1));
                                l4.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else {
                            if (i4 != 1610612736) {
                                throw new IllegalStateException();
                            }
                            while (position < limit) {
                                l4.put(byteBuffer.get(position + 1));
                                l4.put(byteBuffer.get(position));
                                position += 4;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        l4.flip();
                    }
                }
                i5 /= 3;
            }
            i5 /= 2;
            ByteBuffer l42 = l(i5);
            i4 = this.f3062b.f3057c;
            if (i4 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            l42.flip();
        }
        i5 *= 2;
        ByteBuffer l422 = l(i5);
        i4 = this.f3062b.f3057c;
        if (i4 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        l422.flip();
    }

    @Override // U.o
    public final k h(k kVar) {
        int i4 = kVar.f3057c;
        if (i4 == 3 || i4 == 2 || i4 == 268435456 || i4 == 21 || i4 == 1342177280 || i4 == 22 || i4 == 1610612736 || i4 == 4) {
            return i4 != 2 ? new k(kVar.f3055a, kVar.f3056b, 2) : k.f3054e;
        }
        throw new m(kVar);
    }
}
