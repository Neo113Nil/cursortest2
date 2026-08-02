package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmj implements TypeEvaluator {
    public static final dmj a = new dmj();

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        int i = intValue >> 24;
        int i2 = intValue >> 16;
        int i3 = intValue >> 8;
        int i4 = intValue & 255;
        int intValue2 = num2.intValue();
        int i5 = intValue2 >> 16;
        int i6 = intValue2 >> 8;
        return Integer.valueOf((i4 + ((int) (((intValue2 & 255) - i4) * f))) | (((i & 255) + ((int) (f * (((intValue2 >> 24) & 255) - r7)))) << 24) | (((i2 & 255) + ((int) (((i5 & 255) - r0) * f))) << 16) | (((i3 & 255) + ((int) (((i6 & 255) - r1) * f))) << 8));
    }
}
