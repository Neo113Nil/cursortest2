package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class m24 extends u14 {
    m24() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[ADDED_TO_REGION, LOOP:4: B:33:0x00af->B:34:0x00b1, LOOP_START, PHI: r0
      0x00af: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0036, B:34:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.w04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(ByteBuffer byteBuffer) {
        int i7;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i8 = limit - position;
        int i9 = this.f12567b.f12548c;
        if (i9 != 3) {
            if (i9 != 4) {
                if (i9 != 268435456) {
                    if (i9 == 536870912) {
                        i8 /= 3;
                    } else if (i9 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer j7 = j(i8);
                i7 = this.f12567b.f12548c;
                if (i7 == 3) {
                    while (position < limit) {
                        j7.put((byte) 0);
                        j7.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i7 == 4) {
                    while (position < limit) {
                        short A = (short) (n13.A(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                        j7.put((byte) (A & 255));
                        j7.put((byte) ((A >> 8) & 255));
                        position += 4;
                    }
                } else if (i7 == 268435456) {
                    while (position < limit) {
                        j7.put(byteBuffer.get(position + 1));
                        j7.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i7 == 536870912) {
                    while (position < limit) {
                        j7.put(byteBuffer.get(position + 1));
                        j7.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else {
                    if (i7 != 805306368) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        j7.put(byteBuffer.get(position + 2));
                        j7.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                j7.flip();
            }
            i8 /= 2;
            ByteBuffer j72 = j(i8);
            i7 = this.f12567b.f12548c;
            if (i7 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            j72.flip();
        }
        i8 += i8;
        ByteBuffer j722 = j(i8);
        i7 = this.f12567b.f12548c;
        if (i7 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        j722.flip();
    }

    @Override // com.google.android.gms.internal.ads.u14
    public final u04 i(u04 u04Var) {
        int i7 = u04Var.f12548c;
        if (i7 != 3) {
            if (i7 == 2) {
                return u04.f12545e;
            }
            if (i7 != 268435456 && i7 != 536870912 && i7 != 805306368 && i7 != 4) {
                throw new v04(u04Var);
            }
        }
        return new u04(u04Var.f12546a, u04Var.f12547b, 2);
    }
}
