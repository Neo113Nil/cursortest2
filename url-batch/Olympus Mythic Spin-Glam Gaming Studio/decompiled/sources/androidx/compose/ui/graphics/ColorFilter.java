package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorFilter.kt */
@Immutable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0013\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "", "nativeColorFilter", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "(Landroid/graphics/ColorFilter;)V", "getNativeColorFilter$ui_graphics_release", "()Landroid/graphics/ColorFilter;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorFilter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final android.graphics.ColorFilter nativeColorFilter;

    public ColorFilter(android.graphics.ColorFilter nativeColorFilter) {
        Intrinsics.checkNotNullParameter(nativeColorFilter, "nativeColorFilter");
        this.nativeColorFilter = nativeColorFilter;
    }

    /* compiled from: ColorFilter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "tint-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "tint", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m1464tintxETnrds$default(Companion companion, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = BlendMode.INSTANCE.m1419getSrcIn0nO6VwU();
            }
            return companion.m1465tintxETnrds(j, i);
        }

        /* renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m1465tintxETnrds(long color, int blendMode) {
            return AndroidColorFilter_androidKt.m1355actualTintColorFilterxETnrds(color, blendMode);
        }
    }

    /* renamed from: getNativeColorFilter$ui_graphics_release, reason: from getter */
    public final android.graphics.ColorFilter getNativeColorFilter() {
        return this.nativeColorFilter;
    }
}
