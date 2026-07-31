package s2;

import q2.EnumC3383a;
import r2.G;

/* loaded from: classes3.dex */
final class y extends r2.y implements G {
    public y(int i4) {
        super(1, Integer.MAX_VALUE, EnumC3383a.f43421c);
        d(Integer.valueOf(i4));
    }

    @Override // r2.G
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) M()).intValue());
        }
        return valueOf;
    }

    public final boolean a0(int i4) {
        boolean d4;
        synchronized (this) {
            d4 = d(Integer.valueOf(((Number) M()).intValue() + i4));
        }
        return d4;
    }
}
