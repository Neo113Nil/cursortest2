package androidx.graphics.shapes;

import f6.l;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
final class FeatureMappingKt$featureMapper$2$1$2 extends Lambda implements l {
    final /* synthetic */ int $N;
    final /* synthetic */ DoubleMapper $dm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeatureMappingKt$featureMapper$2$1$2(DoubleMapper doubleMapper, int i8) {
        super(1);
        this.$dm = doubleMapper;
        this.$N = i8;
    }

    @Override // f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final CharSequence invoke(int i8) {
        return Format_jvmKt.toStringWithLessPrecision(this.$dm.mapBack(i8 / this.$N));
    }
}
