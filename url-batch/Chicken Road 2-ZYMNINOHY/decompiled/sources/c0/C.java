package c0;

import a.AbstractC0124a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class C extends U.o {

    /* renamed from: i, reason: collision with root package name */
    public int[] f5432i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f5433j;

    @Override // U.n
    public final void d(ByteBuffer byteBuffer) {
        int[] iArr = this.f5433j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l4 = l(((limit - position) / this.f3062b.f3058d) * this.f3063c.f3058d);
        while (position < limit) {
            for (int i4 : iArr) {
                int s4 = (W.J.s(this.f3062b.f3057c) * i4) + position;
                int i5 = this.f3062b.f3057c;
                if (i5 != 2) {
                    if (i5 == 3) {
                        l4.put(byteBuffer.get(s4));
                    } else if (i5 != 4) {
                        if (i5 != 21) {
                            if (i5 != 22) {
                                if (i5 != 268435456) {
                                    if (i5 != 1342177280) {
                                        if (i5 != 1610612736) {
                                            throw new IllegalStateException("Unexpected encoding: " + this.f3062b.f3057c);
                                        }
                                    }
                                }
                            }
                            l4.putInt(byteBuffer.getInt(s4));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b4 = byteBuffer.get(order == byteOrder ? s4 : s4 + 2);
                        byte b5 = byteBuffer.get(s4 + 1);
                        if (byteBuffer.order() == byteOrder) {
                            s4 += 2;
                        }
                        int i6 = ((((b4 << 24) & (-16777216)) | ((b5 << 16) & 16711680)) | ((byteBuffer.get(s4) << 8) & 65280)) >> 8;
                        AbstractC0124a.k((i6 & (-16777216)) == 0 || (i6 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i6));
                        AbstractC0124a.h(l4.remaining() >= 3);
                        l4.put((byte) (l4.order() == byteOrder ? (i6 & 16711680) >> 16 : i6 & KotlinVersion.MAX_COMPONENT_VALUE)).put((byte) ((i6 & 65280) >> 8)).put((byte) (l4.order() == byteOrder ? i6 & KotlinVersion.MAX_COMPONENT_VALUE : (i6 & 16711680) >> 16));
                    } else {
                        l4.putFloat(byteBuffer.getFloat(s4));
                    }
                }
                l4.putShort(byteBuffer.getShort(s4));
            }
            position += this.f3062b.f3058d;
        }
        byteBuffer.position(limit);
        l4.flip();
    }

    @Override // U.o
    public final U.k h(U.k kVar) {
        int i4 = kVar.f3057c;
        int[] iArr = this.f5432i;
        if (iArr == null) {
            return U.k.f3054e;
        }
        int i5 = kVar.f3056b;
        if (!W.J.H(i4)) {
            throw new U.m(kVar);
        }
        boolean z = i5 != iArr.length;
        int i6 = 0;
        while (i6 < iArr.length) {
            int i7 = iArr[i6];
            if (i7 >= i5) {
                throw new U.m("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", kVar);
            }
            z |= i7 != i6;
            i6++;
        }
        return z ? new U.k(kVar.f3055a, iArr.length, i4) : U.k.f3054e;
    }

    @Override // U.o
    public final void i() {
        this.f5433j = this.f5432i;
    }

    @Override // U.o
    public final void k() {
        this.f5433j = null;
        this.f5432i = null;
    }
}
