package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
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
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidCursorHandle.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a:\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0002*\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u001d\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001d\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "handlePosition", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "CursorHandle-ULxng0E", "(JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "CursorHandle", "DefaultCursorHandle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "drawCursorHandle", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "CursorHandleHeight", "F", "getCursorHandleHeight", "()F", "CursorHandleWidth", "getCursorHandleWidth", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AndroidCursorHandle_androidKt {
    private static final float CursorHandleHeight;
    private static final float CursorHandleWidth;

    /* renamed from: CursorHandle-ULxng0E, reason: not valid java name */
    public static final void m511CursorHandleULxng0E(final long j, final Modifier modifier, final Function2 function2, Composer composer, final int i) {
        final int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-5185995);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            AndroidSelectionHandles_androidKt.m609HandlePopupULxng0E(j, HandleReferencePoint.TopMiddle, ComposableLambdaKt.composableLambda(startRestartGroup, -1458480226, true, new Function2() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$1
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
                public final void invoke(@Nullable Composer composer2, int i3) {
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        if (Function2.this == null) {
                            composer2.startReplaceableGroup(1275643833);
                            AndroidCursorHandle_androidKt.DefaultCursorHandle(modifier, composer2, (i2 >> 3) & 14);
                            composer2.endReplaceableGroup();
                            return;
                        } else {
                            composer2.startReplaceableGroup(1275643903);
                            Function2.this.invoke(composer2, Integer.valueOf((i2 >> 6) & 14));
                            composer2.endReplaceableGroup();
                            return;
                        }
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i2 & 14) | 432);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$2
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
                AndroidCursorHandle_androidKt.m511CursorHandleULxng0E(j, modifier, function2, composer2, i | 1);
            }
        });
    }

    public static final void DefaultCursorHandle(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(694251107);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            SpacerKt.Spacer(drawCursorHandle(SizeKt.m359sizeVpY3zN4(modifier, CursorHandleWidth, CursorHandleHeight)), startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$DefaultCursorHandle$1
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
                AndroidCursorHandle_androidKt.DefaultCursorHandle(Modifier.this, composer2, i | 1);
            }
        });
    }

    public static final Modifier drawCursorHandle(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed$default(modifier, null, new Function3() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-2126899193);
                final long selectionHandleColor = ((SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionHandleColor();
                Modifier then = composed.then(DrawModifierKt.drawWithCache(Modifier.INSTANCE, new Function1() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                        final float m1335getWidthimpl = Size.m1335getWidthimpl(drawWithCache.m1236getSizeNHjbRc()) / 2.0f;
                        final ImageBitmap createHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(drawWithCache, m1335getWidthimpl);
                        final ColorFilter m1464tintxETnrds$default = ColorFilter.Companion.m1464tintxETnrds$default(ColorFilter.INSTANCE, selectionHandleColor, 0, 2, null);
                        return drawWithCache.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt.drawCursorHandle.1.1.1
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
                                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                                onDrawWithContent.drawContent();
                                float f = m1335getWidthimpl;
                                ImageBitmap imageBitmap = createHandleImage;
                                ColorFilter colorFilter = m1464tintxETnrds$default;
                                DrawContext drawContext = onDrawWithContent.getDrawContext();
                                long mo1685getSizeNHjbRc = drawContext.mo1685getSizeNHjbRc();
                                drawContext.getCanvas().save();
                                DrawTransform transform = drawContext.getTransform();
                                DrawTransform.translate$default(transform, f, 0.0f, 2, null);
                                transform.mo1690rotateUv8p0NA(45.0f, Offset.INSTANCE.m1308getZeroF1C5BW0());
                                DrawScope.m1696drawImagegbVJVH8$default(onDrawWithContent, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                drawContext.getCanvas().restore();
                                drawContext.mo1686setSizeuvyYCjk(mo1685getSizeNHjbRc);
                            }
                        });
                    }
                }));
                composer.endReplaceableGroup();
                return then;
            }
        }, 1, null);
    }

    static {
        float m2507constructorimpl = Dp.m2507constructorimpl(25);
        CursorHandleHeight = m2507constructorimpl;
        CursorHandleWidth = Dp.m2507constructorimpl(Dp.m2507constructorimpl(m2507constructorimpl * 2.0f) / 2.4142137f);
    }
}
