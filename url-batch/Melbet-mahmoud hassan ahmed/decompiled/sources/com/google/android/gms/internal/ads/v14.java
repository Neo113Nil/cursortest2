package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
final class v14 extends u14 {

    /* renamed from: i, reason: collision with root package name */
    private int[] f13071i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f13072j;

    v14() {
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final void h(ByteBuffer byteBuffer) {
        int[] iArr = this.f13072j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j7 = j(((limit - position) / this.f12567b.f12549d) * this.f12568c.f12549d);
        while (position < limit) {
            for (int i7 : iArr) {
                j7.putShort(byteBuffer.getShort(i7 + i7 + position));
            }
            position += this.f12567b.f12549d;
        }
        byteBuffer.position(limit);
        j7.flip();
    }

    @Override // com.google.android.gms.internal.ads.u14
    public final u04 i(u04 u04Var) {
        int[] iArr = this.f13071i;
        if (iArr == null) {
            return u04.f12545e;
        }
        if (u04Var.f12548c != 2) {
            throw new v04(u04Var);
        }
        boolean z6 = u04Var.f12547b != iArr.length;
        int i7 = 0;
        while (true) {
            int length = iArr.length;
            if (i7 >= length) {
                return z6 ? new u04(u04Var.f12546a, length, 2) : u04.f12545e;
            }
            int i8 = iArr[i7];
            if (i8 >= u04Var.f12547b) {
                throw new v04(u04Var);
            }
            z6 |= i8 != i7;
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.u14
    protected final void k() {
        this.f13072j = this.f13071i;
    }

    @Override // com.google.android.gms.internal.ads.u14
    protected final void m() {
        this.f13072j = null;
        this.f13071i = null;
    }

    public final void o(int[] iArr) {
        this.f13071i = iArr;
    }
}
