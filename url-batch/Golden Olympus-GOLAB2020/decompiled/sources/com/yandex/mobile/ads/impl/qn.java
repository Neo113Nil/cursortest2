package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC1976hh;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class qn extends AbstractC2189qj {

    /* renamed from: i, reason: collision with root package name */
    private int[] f30848i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f30849j;

    qn() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f30849j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a4 = a(((limit - position) / this.f30796b.f26743d) * this.f30797c.f26743d);
        while (position < limit) {
            for (int i4 : iArr) {
                a4.putShort(byteBuffer.getShort((i4 * 2) + position));
            }
            position += this.f30796b.f26743d;
        }
        byteBuffer.position(limit);
        a4.flip();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    public final InterfaceC1976hh.a b(InterfaceC1976hh.a aVar) {
        int[] iArr = this.f30848i;
        if (iArr == null) {
            return InterfaceC1976hh.a.f26739e;
        }
        if (aVar.f26742c != 2) {
            throw new InterfaceC1976hh.b(aVar);
        }
        boolean z4 = aVar.f26741b != iArr.length;
        int i4 = 0;
        while (i4 < iArr.length) {
            int i5 = iArr[i4];
            if (i5 >= aVar.f26741b) {
                throw new InterfaceC1976hh.b(aVar);
            }
            z4 |= i5 != i4;
            i4++;
        }
        return z4 ? new InterfaceC1976hh.a(aVar.f26740a, iArr.length, 2) : InterfaceC1976hh.a.f26739e;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    protected final void f() {
        this.f30849j = this.f30848i;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    protected final void h() {
        this.f30849j = null;
        this.f30848i = null;
    }

    public final void a(int[] iArr) {
        this.f30848i = iArr;
    }
}
