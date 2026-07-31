package coil.compose;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.size.Dimension;
import coil.size.Dimensions;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.size.SizeResolvers;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AsyncImage.kt */
/* loaded from: classes10.dex */
public abstract class AsyncImageKt {
    /* renamed from: AsyncImage-MvsnxeU, reason: not valid java name */
    public static final void m2900AsyncImageMvsnxeU(final Object obj, final String str, final ImageLoader imageLoader, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, final int i2, final int i3, final int i4) {
        final int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-2030202961);
        final Modifier modifier2 = (i4 & 8) != 0 ? Modifier.INSTANCE : modifier;
        final Function1 defaultTransform = (i4 & 16) != 0 ? AsyncImagePainter.Companion.getDefaultTransform() : function1;
        final Function1 function13 = (i4 & 32) != 0 ? null : function12;
        final Alignment center = (i4 & 64) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        final ContentScale fit = (i4 & 128) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        final float f2 = (i4 & 256) != 0 ? 1.0f : f;
        final ColorFilter colorFilter2 = (i4 & 512) != 0 ? null : colorFilter;
        if ((i4 & 1024) != 0) {
            i6 = i3 & (-15);
            i5 = DrawScope.INSTANCE.m1710getDefaultFilterQualityfv9h1I();
        } else {
            i5 = i;
            i6 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2030202961, i2, i6, "coil.compose.AsyncImage (AsyncImage.kt:116)");
        }
        ImageRequest updateRequest = updateRequest(UtilsKt.requestOf(obj, startRestartGroup, 8), fit, startRestartGroup, 8 | ((i2 >> 18) & 112));
        int i7 = i2 >> 6;
        int i8 = i2 >> 9;
        int i9 = i8 & 57344;
        Function1 function14 = defaultTransform;
        Function1 function15 = function13;
        ContentScale contentScale2 = fit;
        int i10 = i5;
        AsyncImagePainter m2906rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m2906rememberAsyncImagePainter5jETZwI(updateRequest, imageLoader, function14, function15, contentScale2, i10, startRestartGroup, ((i6 << 15) & 458752) | (i7 & 7168) | (i7 & 896) | 72 | i9, 0);
        SizeResolver sizeResolver = updateRequest.getSizeResolver();
        Content(sizeResolver instanceof ConstraintsSizeResolver ? modifier2.then((Modifier) sizeResolver) : modifier2, m2906rememberAsyncImagePainter5jETZwI, str, center, fit, f2, colorFilter2, startRestartGroup, (i8 & 7168) | ((i2 << 3) & 896) | i9 | (i8 & 458752) | (3670016 & i8));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: coil.compose.AsyncImageKt$AsyncImage$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                AsyncImageKt.m2900AsyncImageMvsnxeU(obj, str, imageLoader, modifier2, defaultTransform, function13, center, fit, f2, colorFilter2, i5, composer2, i2 | 1, i3, i4);
            }
        });
    }

    public static final void Content(final Modifier modifier, final Painter painter, final String str, final Alignment alignment, final ContentScale contentScale, final float f, final ColorFilter colorFilter, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(10290533);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10290533, i, -1, "coil.compose.Content (AsyncImage.kt:154)");
        }
        Modifier then = ClipKt.clipToBounds(contentDescription(modifier, str)).then(new ContentPainterModifier(painter, alignment, contentScale, f, colorFilter));
        AsyncImageKt$Content$1 asyncImageKt$Content$1 = new MeasurePolicy() { // from class: coil.compose.AsyncImageKt$Content$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo37measure3p2s80s(MeasureScope measureScope, List list, long j) {
                return MeasureScope.layout$default(measureScope, Constraints.m2489getMinWidthimpl(j), Constraints.m2488getMinHeightimpl(j), null, new Function1() { // from class: coil.compose.AsyncImageKt$Content$1$measure$1
                    public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return Unit.INSTANCE;
                    }
                }, 4, null);
            }
        };
        startRestartGroup.startReplaceableGroup(544976794);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, then);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        final Function0 constructor = companion.getConstructor();
        startRestartGroup.startReplaceableGroup(1405779621);
        if (startRestartGroup.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new Function0() { // from class: coil.compose.AsyncImageKt$Content$$inlined$Layout$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final ComposeUiNode mo4828invoke() {
                    return Function0.this.mo4828invoke();
                }
            });
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl, asyncImageKt$Content$1, companion.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m1153setimpl(m1149constructorimpl, materialize, companion.getSetModifier());
        startRestartGroup.enableReusing();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: coil.compose.AsyncImageKt$Content$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                AsyncImageKt.Content(Modifier.this, painter, str, alignment, contentScale, f, colorFilter, composer2, i | 1);
            }
        });
    }

    public static final ImageRequest updateRequest(ImageRequest imageRequest, ContentScale contentScale, Composer composer, int i) {
        SizeResolver sizeResolver;
        composer.startReplaceableGroup(402368983);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(402368983, i, -1, "coil.compose.updateRequest (AsyncImage.kt:181)");
        }
        if (imageRequest.getDefined().getSizeResolver() == null) {
            if (Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.getNone())) {
                sizeResolver = SizeResolvers.create(Size.ORIGINAL);
            } else {
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new ConstraintsSizeResolver();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                sizeResolver = (SizeResolver) rememberedValue;
            }
            imageRequest = ImageRequest.newBuilder$default(imageRequest, null, 1, null).size(sizeResolver).build();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageRequest;
    }

    private static final Modifier contentDescription(Modifier modifier, final String str) {
        return str != null ? SemanticsModifierKt.semantics$default(modifier, false, new Function1() { // from class: coil.compose.AsyncImageKt$contentDescription$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                SemanticsPropertiesKt.m2176setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m2166getImageo7Vup1c());
            }
        }, 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toSizeOrNull-BRTryo0, reason: not valid java name */
    public static final Size m2902toSizeOrNullBRTryo0(long j) {
        if (Constraints.m2491isZeroimpl(j)) {
            return null;
        }
        return new Size(Constraints.m2483getHasBoundedWidthimpl(j) ? Dimensions.Dimension(Constraints.m2487getMaxWidthimpl(j)) : Dimension.Undefined.INSTANCE, Constraints.m2482getHasBoundedHeightimpl(j) ? Dimensions.Dimension(Constraints.m2486getMaxHeightimpl(j)) : Dimension.Undefined.INSTANCE);
    }
}
