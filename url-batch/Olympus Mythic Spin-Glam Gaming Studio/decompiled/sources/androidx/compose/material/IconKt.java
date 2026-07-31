package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Icon.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a;\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0015\u001a\u00020\u0012*\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "tint", "", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", k.C, "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "defaultSizeFor", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/geometry/Size;", "", "isInfinite-uvyYCjk", "(J)Z", "isInfinite", "DefaultIconSizeModifier", "Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m357size3ABfNKs(Modifier.INSTANCE, Dp.m2507constructorimpl(24));

    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m887Iconww6aTOc(ImageVector imageVector, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageVector, "imageVector");
        composer.startReplaceableGroup(-800853103);
        m886Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composer, i & 14), str, (i2 & 4) != 0 ? Modifier.INSTANCE : modifier, (i2 & 8) != 0 ? Color.m1445copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).getValue(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j, composer, VectorPainter.$stable | (i & 112) | (i & 896) | (i & 7168), 0);
        composer.endReplaceableGroup();
    }

    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m886Iconww6aTOc(final Painter painter, final String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Composer startRestartGroup = composer.startRestartGroup(-1142959010);
        Modifier modifier3 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        long m1445copywmQWz5c$default = (i2 & 8) != 0 ? Color.m1445copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).getValue(), ((Number) startRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        ColorFilter m1464tintxETnrds$default = Color.m1447equalsimpl0(m1445copywmQWz5c$default, Color.INSTANCE.m1461getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m1464tintxETnrds$default(ColorFilter.INSTANCE, m1445copywmQWz5c$default, 0, 2, null);
        startRestartGroup.startReplaceableGroup(1547385429);
        if (str != null) {
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(str);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material.IconKt$Icon$semantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        SemanticsPropertiesKt.setContentDescription(semantics, str);
                        SemanticsPropertiesKt.m2176setRolekuIjeqM(semantics, Role.INSTANCE.m2166getImageo7Vup1c());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            modifier2 = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null);
        } else {
            modifier2 = Modifier.INSTANCE;
        }
        Modifier modifier4 = modifier2;
        startRestartGroup.endReplaceableGroup();
        BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier3), painter), painter, false, null, ContentScale.INSTANCE.getFit(), 0.0f, m1464tintxETnrds$default, 22, null).then(modifier4), startRestartGroup, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier5 = modifier3;
        final long j2 = m1445copywmQWz5c$default;
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.IconKt$Icon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                IconKt.m886Iconww6aTOc(Painter.this, str, modifier5, j2, composer2, i | 1, i2);
            }
        });
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        Modifier modifier2;
        if (Size.m1332equalsimpl0(painter.getIntrinsicSize(), Size.INSTANCE.m1340getUnspecifiedNHjbRc()) || m888isInfiniteuvyYCjk(painter.getIntrinsicSize())) {
            modifier2 = DefaultIconSizeModifier;
        } else {
            modifier2 = Modifier.INSTANCE;
        }
        return modifier.then(modifier2);
    }

    /* renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m888isInfiniteuvyYCjk(long j) {
        return Float.isInfinite(Size.m1335getWidthimpl(j)) && Float.isInfinite(Size.m1333getHeightimpl(j));
    }
}
