package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC1976hh;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class mq1 extends AbstractC2189qj {
    mq1() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0 A[ADDED_TO_REGION, LOOP:4: B:33:0x00b0->B:34:0x00b2, LOOP_START, PHI: r0
      0x00b0: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0035, B:34:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer) {
        int i4;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i5 = limit - position;
        int i6 = this.f30796b.f26742c;
        if (i6 != 3) {
            if (i6 != 4) {
                if (i6 != 268435456) {
                    if (i6 == 536870912) {
                        i5 /= 3;
                    } else if (i6 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer a4 = a(i5);
                i4 = this.f30796b.f26742c;
                if (i4 == 3) {
                    while (position < limit) {
                        a4.put((byte) 0);
                        a4.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i4 == 4) {
                    while (position < limit) {
                        float f4 = byteBuffer.getFloat(position);
                        int i7 = u82.f32873a;
                        short max = (short) (Math.max(-1.0f, Math.min(f4, 1.0f)) * 32767.0f);
                        a4.put((byte) (max & 255));
                        a4.put((byte) ((max >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
                        position += 4;
                    }
                } else if (i4 == 268435456) {
                    while (position < limit) {
                        a4.put(byteBuffer.get(position + 1));
                        a4.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i4 == 536870912) {
                    while (position < limit) {
                        a4.put(byteBuffer.get(position + 1));
                        a4.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else {
                    if (i4 != 805306368) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        a4.put(byteBuffer.get(position + 2));
                        a4.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                a4.flip();
            }
            i5 /= 2;
            ByteBuffer a42 = a(i5);
            i4 = this.f30796b.f26742c;
            if (i4 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            a42.flip();
        }
        i5 *= 2;
        ByteBuffer a422 = a(i5);
        i4 = this.f30796b.f26742c;
        if (i4 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        a422.flip();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    public final InterfaceC1976hh.a b(InterfaceC1976hh.a aVar) {
        int i4 = aVar.f26742c;
        if (i4 == 3 || i4 == 2 || i4 == 268435456 || i4 == 536870912 || i4 == 805306368 || i4 == 4) {
            return i4 != 2 ? new InterfaceC1976hh.a(aVar.f26740a, aVar.f26741b, 2) : InterfaceC1976hh.a.f26739e;
        }
        throw new InterfaceC1976hh.b(aVar);
    }
}
