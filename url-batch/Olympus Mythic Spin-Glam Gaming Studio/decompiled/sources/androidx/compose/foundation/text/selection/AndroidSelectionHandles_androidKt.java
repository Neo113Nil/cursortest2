package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidSelectionHandles.android.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\t\u001a8\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aR\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u0011H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0005H\u0000\u001a \u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\u001a$\u0010\u001f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"DefaultSelectionHandle", "", "modifier", "Landroidx/compose/ui/Modifier;", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "handlesCrossed", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/runtime/Composer;I)V", "HandlePopup", X3.i.L, "Landroidx/compose/ui/geometry/Offset;", "handleReferencePoint", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "HandlePopup-ULxng0E", "(JLandroidx/compose/foundation/text/selection/HandleReferencePoint;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionHandle", "SelectionHandle-8fL75-g", "(JZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isHandleLtrDirection", "areHandlesCrossed", "isLeft", "createHandleImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/draw/CacheDrawScope;", "radius", "", "drawSelectionHandle", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AndroidSelectionHandles_androidKt {
    /* renamed from: SelectionHandle-8fL75-g, reason: not valid java name */
    public static final void m610SelectionHandle8fL75g(final long j, final boolean z, final ResolvedTextDirection direction, final boolean z2, final Modifier modifier, final Function2 function2, Composer composer, final int i) {
        int i2;
        HandleReferencePoint handleReferencePoint;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-616295642);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(direction) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 131072 : 65536;
        }
        final int i3 = i2;
        if ((i3 & 374491) != 74898 || !startRestartGroup.getSkipping()) {
            if (isLeft(z, direction, z2)) {
                handleReferencePoint = HandleReferencePoint.TopRight;
            } else {
                handleReferencePoint = HandleReferencePoint.TopLeft;
            }
            m609HandlePopupULxng0E(j, handleReferencePoint, ComposableLambdaKt.composableLambda(startRestartGroup, 732099485, true, new Function2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget
                @Composable
                public final void invoke(@Nullable Composer composer2, int i4) {
                    if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                        if (Function2.this == null) {
                            composer2.startReplaceableGroup(386443790);
                            Modifier modifier2 = modifier;
                            Boolean valueOf = Boolean.valueOf(z);
                            Offset m1288boximpl = Offset.m1288boximpl(j);
                            final boolean z3 = z;
                            final long j2 = j;
                            composer2.startReplaceableGroup(511388516);
                            boolean changed = composer2.changed(valueOf) | composer2.changed(m1288boximpl);
                            Object rememberedValue = composer2.rememberedValue();
                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function1() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1
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
                                        Handle handle;
                                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        SemanticsPropertyKey selectionHandleInfoKey = SelectionHandlesKt.getSelectionHandleInfoKey();
                                        if (z3) {
                                            handle = Handle.SelectionStart;
                                        } else {
                                            handle = Handle.SelectionEnd;
                                        }
                                        semantics.set(selectionHandleInfoKey, new SelectionHandleInfo(handle, j2, null));
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            AndroidSelectionHandles_androidKt.DefaultSelectionHandle(SemanticsModifierKt.semantics$default(modifier2, false, (Function1) rememberedValue, 1, null), z, direction, z2, composer2, i3 & 8176);
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.startReplaceableGroup(386444465);
                        Function2.this.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i3 & 14) | 384);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                AndroidSelectionHandles_androidKt.m610SelectionHandle8fL75g(j, z, direction, z2, modifier, function2, composer2, i | 1);
            }
        });
    }

    public static final void DefaultSelectionHandle(final Modifier modifier, final boolean z, final ResolvedTextDirection direction, final boolean z2, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Composer startRestartGroup = composer.startRestartGroup(47957398);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(direction) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            SpacerKt.Spacer(drawSelectionHandle(SizeKt.m359sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), z, direction, z2), startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1
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
                AndroidSelectionHandles_androidKt.DefaultSelectionHandle(Modifier.this, z, direction, z2, composer2, i | 1);
            }
        });
    }

    public static final Modifier drawSelectionHandle(Modifier modifier, final boolean z, final ResolvedTextDirection direction, final boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return ComposedModifierKt.composed$default(modifier, null, new Function3() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1538687176);
                final long selectionHandleColor = ((SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionHandleColor();
                Modifier.Companion companion = Modifier.INSTANCE;
                final boolean z3 = z;
                final ResolvedTextDirection resolvedTextDirection = direction;
                final boolean z4 = z2;
                Modifier then = composed.then(DrawModifierKt.drawWithCache(companion, new Function1() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                        final ImageBitmap createHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(drawWithCache, Size.m1335getWidthimpl(drawWithCache.m1236getSizeNHjbRc()) / 2.0f);
                        final ColorFilter m1464tintxETnrds$default = ColorFilter.Companion.m1464tintxETnrds$default(ColorFilter.INSTANCE, selectionHandleColor, 0, 2, null);
                        final boolean z5 = z3;
                        final ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
                        final boolean z6 = z4;
                        return drawWithCache.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.drawSelectionHandle.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((ContentDrawScope) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull ContentDrawScope onDrawWithContent) {
                                boolean isLeft;
                                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                                onDrawWithContent.drawContent();
                                isLeft = AndroidSelectionHandles_androidKt.isLeft(z5, resolvedTextDirection2, z6);
                                if (isLeft) {
                                    ImageBitmap imageBitmap = createHandleImage;
                                    ColorFilter colorFilter = m1464tintxETnrds$default;
                                    long mo1707getCenterF1C5BW0 = onDrawWithContent.mo1707getCenterF1C5BW0();
                                    DrawContext drawContext = onDrawWithContent.getDrawContext();
                                    long mo1685getSizeNHjbRc = drawContext.mo1685getSizeNHjbRc();
                                    drawContext.getCanvas().save();
                                    drawContext.getTransform().mo1691scale0AR0LA0(-1.0f, 1.0f, mo1707getCenterF1C5BW0);
                                    DrawScope.m1696drawImagegbVJVH8$default(onDrawWithContent, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                    drawContext.getCanvas().restore();
                                    drawContext.mo1686setSizeuvyYCjk(mo1685getSizeNHjbRc);
                                    return;
                                }
                                DrawScope.m1696drawImagegbVJVH8$default(onDrawWithContent, createHandleImage, 0L, 0.0f, null, m1464tintxETnrds$default, 0, 46, null);
                            }
                        });
                    }
                }));
                composer.endReplaceableGroup();
                return then;
            }
        }, 1, null);
    }

    public static final ImageBitmap createHandleImage(CacheDrawScope cacheDrawScope, float f) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "<this>");
        int ceil = ((int) Math.ceil(f)) * 2;
        HandleImageCache handleImageCache = HandleImageCache.INSTANCE;
        ImageBitmap imageBitmap = handleImageCache.getImageBitmap();
        Canvas canvas = handleImageCache.getCanvas();
        CanvasDrawScope canvasDrawScope = handleImageCache.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || ceil > imageBitmap.getWidth() || ceil > imageBitmap.getHeight()) {
            imageBitmap = ImageBitmapKt.m1512ImageBitmapx__hDU$default(ceil, ceil, ImageBitmapConfig.INSTANCE.m1506getAlpha8_sVssgQ(), false, null, 24, null);
            handleImageCache.setImageBitmap(imageBitmap);
            canvas = CanvasKt.Canvas(imageBitmap);
            handleImageCache.setCanvas(canvas);
        }
        ImageBitmap imageBitmap2 = imageBitmap;
        Canvas canvas2 = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            handleImageCache.setCanvasDrawScope(canvasDrawScope);
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long Size = androidx.compose.ui.geometry.SizeKt.Size(imageBitmap2.getWidth(), imageBitmap2.getHeight());
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m1684setSizeuvyYCjk(Size);
        canvas2.save();
        DrawScope.m1703drawRectnJ9OG0$default(canvasDrawScope2, Color.INSTANCE.m1456getBlack0d7_KjU(), 0L, canvasDrawScope2.mo1708getSizeNHjbRc(), 0.0f, null, null, BlendMode.INSTANCE.m1394getClear0nO6VwU(), 58, null);
        DrawScope.m1703drawRectnJ9OG0$default(canvasDrawScope2, ColorKt.Color(4278190080L), Offset.INSTANCE.m1308getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size(f, f), 0.0f, null, null, 0, 120, null);
        DrawScope.m1694drawCircleVaOC9Bg$default(canvasDrawScope2, ColorKt.Color(4278190080L), f, OffsetKt.Offset(f, f), 0.0f, null, null, 0, 120, null);
        canvas2.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas3);
        drawParams3.m1684setSizeuvyYCjk(size);
        return imageBitmap2;
    }

    /* renamed from: HandlePopup-ULxng0E, reason: not valid java name */
    public static final void m609HandlePopupULxng0E(final long j, final HandleReferencePoint handleReferencePoint, final Function2 content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(handleReferencePoint, "handleReferencePoint");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1409050158);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(handleReferencePoint) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(content) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            long IntOffset = IntOffsetKt.IntOffset(MathKt.roundToInt(Offset.m1297getXimpl(j)), MathKt.roundToInt(Offset.m1298getYimpl(j)));
            IntOffset m2545boximpl = IntOffset.m2545boximpl(IntOffset);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(m2545boximpl) | startRestartGroup.changed(handleReferencePoint);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new HandlePositionProvider(handleReferencePoint, IntOffset, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidPopup_androidKt.Popup((HandlePositionProvider) rememberedValue, null, new PopupProperties(false, false, false, null, true, false, 15, null), content, startRestartGroup, (i2 << 3) & 7168, 2);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
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
                AndroidSelectionHandles_androidKt.m609HandlePopupULxng0E(j, handleReferencePoint, content, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLeft(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        if (z) {
            return isHandleLtrDirection(resolvedTextDirection, z2);
        }
        return !isHandleLtrDirection(resolvedTextDirection, z2);
    }

    public static final boolean isHandleLtrDirection(ResolvedTextDirection direction, boolean z) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        return (direction == ResolvedTextDirection.Ltr && !z) || (direction == ResolvedTextDirection.Rtl && z);
    }
}
