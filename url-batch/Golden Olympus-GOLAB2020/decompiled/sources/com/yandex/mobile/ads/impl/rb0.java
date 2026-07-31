package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC1976hh;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class rb0 extends AbstractC2189qj {

    /* renamed from: i, reason: collision with root package name */
    private static final int f31102i = Float.floatToIntBits(Float.NaN);

    rb0() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer a4;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i4 = limit - position;
        int i5 = this.f30796b.f26742c;
        if (i5 == 536870912) {
            a4 = a((i4 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits == f31102i) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                a4.putInt(floatToIntBits);
                position += 3;
            }
        } else {
            if (i5 != 805306368) {
                throw new IllegalStateException();
            }
            a4 = a(i4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == f31102i) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                a4.putInt(floatToIntBits2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        a4.flip();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    public final InterfaceC1976hh.a b(InterfaceC1976hh.a aVar) {
        int i4 = aVar.f26742c;
        if (i4 == 536870912 || i4 == 805306368 || i4 == 4) {
            return i4 != 4 ? new InterfaceC1976hh.a(aVar.f26740a, aVar.f26741b, 4) : InterfaceC1976hh.a.f26739e;
        }
        throw new InterfaceC1976hh.b(aVar);
    }
}
