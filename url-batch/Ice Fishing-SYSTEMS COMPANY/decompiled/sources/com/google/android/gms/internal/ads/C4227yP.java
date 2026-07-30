package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.yP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4227yP extends AbstractC3698oi {
    public TC i;

    /* renamed from: j, reason: collision with root package name */
    public TC f35344j;

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final void a(ByteBuffer byteBuffer) {
        TC tc = this.f35344j;
        tc.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j9 = j(((limit - position) / this.f33178b.f33434d) * this.f33179c.f33434d);
        while (position < limit) {
            for (int i = 0; i < tc.f27727u; i++) {
                int f6 = (AbstractC3548lu.f(this.f33178b.f33433c) * tc.a(i)) + position;
                int i4 = this.f33178b.f33433c;
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 21) {
                                if (i4 != 22) {
                                    if (i4 != 268435456) {
                                        if (i4 != 1342177280) {
                                            if (i4 != 1610612736) {
                                                if (i4 != 1879048192) {
                                                    if (i4 != 1895825408) {
                                                        if (i4 != 1912602624) {
                                                            throw new IllegalStateException(D.y.j(i4, "Unexpected encoding: ", new StringBuilder(String.valueOf(i4).length() + 21)));
                                                        }
                                                    }
                                                }
                                                j9.putDouble(byteBuffer.getDouble(f6));
                                            }
                                        }
                                    }
                                }
                                j9.putInt(byteBuffer.getInt(f6));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            byte b9 = byteBuffer.get(order == byteOrder ? f6 : f6 + 2);
                            byte b10 = byteBuffer.get(f6 + 1);
                            if (byteBuffer.order() == byteOrder) {
                                f6 += 2;
                            }
                            int i9 = ((b9 << 24) & (-16777216)) | ((b10 << 16) & 16711680) | ((byteBuffer.get(f6) << 8) & 65280);
                            int i10 = i9 >> 8;
                            PA.M((i10 & (-16777216)) == 0 || (i10 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i10));
                            PA.n(j9.remaining() >= 3);
                            j9.put((byte) (j9.order() == byteOrder ? (i9 >> 24) & com.anythink.basead.exoplayer.k.p.f8630b : i10 & com.anythink.basead.exoplayer.k.p.f8630b)).put((byte) ((i9 >> 16) & com.anythink.basead.exoplayer.k.p.f8630b)).put((byte) (j9.order() == byteOrder ? i10 & com.anythink.basead.exoplayer.k.p.f8630b : (i9 >> 24) & com.anythink.basead.exoplayer.k.p.f8630b));
                        }
                        j9.putFloat(byteBuffer.getFloat(f6));
                    } else {
                        j9.put(byteBuffer.get(f6));
                    }
                }
                j9.putShort(byteBuffer.getShort(f6));
            }
            position += this.f33178b.f33434d;
        }
        byteBuffer.position(limit);
        j9.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi
    public final C3751ph k(C3751ph c3751ph) {
        TC tc = this.i;
        if (tc == null) {
            return C3751ph.f33430e;
        }
        int i = c3751ph.f33433c;
        if (!AbstractC3548lu.d(i)) {
            throw new C2894Zh("Unhandled input format:", c3751ph);
        }
        int i4 = tc.f27727u;
        int i9 = c3751ph.f33432b;
        boolean z8 = i9 != i4;
        int i10 = 0;
        while (i10 < i4) {
            int a9 = tc.a(i10);
            if (a9 >= i9) {
                String tc2 = tc.toString();
                throw new C2894Zh(D.y.o(new StringBuilder(tc2.length() + 59), "Channel map (", tc2, ") trying to access non-existent input channel."), c3751ph);
            }
            z8 |= a9 != i10;
            i10++;
        }
        return z8 ? new C3751ph(c3751ph.f33431a, i4, i) : C3751ph.f33430e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi
    public final void m() {
        this.f35344j = this.i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi
    public final void n() {
        this.f35344j = null;
        this.i = null;
    }
}
