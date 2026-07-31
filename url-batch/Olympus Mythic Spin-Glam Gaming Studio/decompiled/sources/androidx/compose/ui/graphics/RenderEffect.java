package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AndroidRenderEffect.android.kt */
@Immutable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H%¢\u0006\u0004\b\u0007\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/RenderEffect;", "", "<init>", "()V", "Landroid/graphics/RenderEffect;", "asAndroidRenderEffect", "()Landroid/graphics/RenderEffect;", "createRenderEffect", "internalRenderEffect", "Landroid/graphics/RenderEffect;", "Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/OffsetEffect;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class RenderEffect {
    private android.graphics.RenderEffect internalRenderEffect;

    public /* synthetic */ RenderEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected abstract android.graphics.RenderEffect createRenderEffect();

    private RenderEffect() {
    }

    public final android.graphics.RenderEffect asAndroidRenderEffect() {
        android.graphics.RenderEffect renderEffect = this.internalRenderEffect;
        if (renderEffect != null) {
            return renderEffect;
        }
        android.graphics.RenderEffect createRenderEffect = createRenderEffect();
        this.internalRenderEffect = createRenderEffect;
        return createRenderEffect;
    }
}
