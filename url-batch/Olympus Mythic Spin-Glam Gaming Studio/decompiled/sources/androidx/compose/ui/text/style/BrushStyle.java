package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextDrawStyle.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/style/BrushStyle;", "Landroidx/compose/ui/text/style/TextDrawStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/ShaderBrush;", "value", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "color", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "brush", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class BrushStyle implements TextDrawStyle {
    private final ShaderBrush value;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BrushStyle) && Intrinsics.areEqual(this.value, ((BrushStyle) other).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "BrushStyle(value=" + this.value + ')';
    }

    @Override // androidx.compose.ui.text.style.TextDrawStyle
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long getValue() {
        return Color.INSTANCE.m1461getUnspecified0d7_KjU();
    }

    @Override // androidx.compose.ui.text.style.TextDrawStyle
    public Brush getBrush() {
        return this.value;
    }
}
