package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* compiled from: AndroidRenderEffect.android.kt */
@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "createRenderEffect", "()Landroid/graphics/RenderEffect;", "androidRenderEffect", "Landroid/graphics/RenderEffect;", "getAndroidRenderEffect", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidRenderEffect extends RenderEffect {
    private final android.graphics.RenderEffect androidRenderEffect;

    @Override // androidx.compose.ui.graphics.RenderEffect
    /* renamed from: createRenderEffect, reason: from getter */
    protected android.graphics.RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}
