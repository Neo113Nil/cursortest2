package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class i24 extends u14 {

    /* renamed from: i, reason: collision with root package name */
    private static final int f6501i = Float.floatToIntBits(Float.NaN);

    i24() {
    }

    private static void o(int i7, ByteBuffer byteBuffer) {
        double d7 = i7;
        Double.isNaN(d7);
        int floatToIntBits = Float.floatToIntBits((float) (d7 * 4.656612875245797E-10d));
        if (floatToIntBits == f6501i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final void h(ByteBuffer byteBuffer) {
        ByteBuffer j7;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        int i8 = this.f12567b.f12548c;
        if (i8 == 536870912) {
            j7 = j((i7 / 3) * 4);
            while (position < limit) {
                o(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), j7);
                position += 3;
            }
        } else {
            if (i8 != 805306368) {
                throw new IllegalStateException();
            }
            j7 = j(i7);
            while (position < limit) {
                o((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), j7);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j7.flip();
    }

    @Override // com.google.android.gms.internal.ads.u14
    public final u04 i(u04 u04Var) {
        int i7 = u04Var.f12548c;
        if (n13.q(i7)) {
            return i7 != 4 ? new u04(u04Var.f12546a, u04Var.f12547b, 4) : u04.f12545e;
        }
        throw new v04(u04Var);
    }
}
