package androidx.compose.ui.text.platform.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShaderBrushSpan.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR-\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroidx/compose/ui/graphics/ShaderBrush;", "shaderBrush", "<init>", "(Landroidx/compose/ui/graphics/ShaderBrush;)V", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "Landroidx/compose/ui/graphics/ShaderBrush;", "getShaderBrush", "()Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-VsRJwc0", "()Landroidx/compose/ui/geometry/Size;", "setSize-iaC8Vc4", "(Landroidx/compose/ui/geometry/Size;)V", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    private final ShaderBrush shaderBrush;
    private Size size;

    public ShaderBrushSpan(ShaderBrush shaderBrush) {
        Intrinsics.checkNotNullParameter(shaderBrush, "shaderBrush");
        this.shaderBrush = shaderBrush;
    }

    /* renamed from: setSize-iaC8Vc4, reason: not valid java name */
    public final void m2410setSizeiaC8Vc4(Size size) {
        this.size = size;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Size size;
        if (textPaint == null || (size = this.size) == null) {
            return;
        }
        textPaint.setShader(this.shaderBrush.mo1428createShaderuvyYCjk(size.getPackedValue()));
    }
}
