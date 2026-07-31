package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidRenderEffect.android.kt */
@Immutable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/OffsetEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "createRenderEffect", "()Landroid/graphics/RenderEffect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroidx/compose/ui/geometry/Offset;", "offset", "J", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OffsetEffect extends RenderEffect {
    private final long offset;
    private final RenderEffect renderEffect;

    @Override // androidx.compose.ui.graphics.RenderEffect
    /* renamed from: createRenderEffect */
    protected android.graphics.RenderEffect getAndroidRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m1571createOffsetEffectUv8p0NA(this.renderEffect, this.offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) other;
        return Intrinsics.areEqual(this.renderEffect, offsetEffect.renderEffect) && Offset.m1294equalsimpl0(this.offset, offsetEffect.offset);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.renderEffect;
        return ((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + Offset.m1299hashCodeimpl(this.offset);
    }

    public String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + ((Object) Offset.m1304toStringimpl(this.offset)) + ')';
    }
}
