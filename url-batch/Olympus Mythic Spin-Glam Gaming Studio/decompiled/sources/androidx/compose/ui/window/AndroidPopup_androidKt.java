package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aX\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\r\u0010\u0010\u001a*\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\" \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/unit/IntOffset;", "offset", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/PopupProperties;", "properties", "Landroidx/compose/runtime/Composable;", "content", "Popup-K5zGePQ", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Popup", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "tag", "PopupTestTag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/View;", "", "isFlagSecureEnabled", "(Landroid/view/View;)Z", "Landroid/graphics/Rect;", "Landroidx/compose/ui/unit/IntRect;", "toIntBounds", "(Landroid/graphics/Rect;)Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AndroidPopup_androidKt {
    private static final ProvidableCompositionLocal LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final String mo4828invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0054  */
    /* renamed from: Popup-K5zGePQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2622PopupK5zGePQ(Alignment alignment, long j, Function0 function0, PopupProperties popupProperties, final Function2 content, Composer composer, final int i, final int i2) {
        final Alignment alignment2;
        int i3;
        long j2;
        int i4;
        Function0 function02;
        PopupProperties popupProperties2;
        Function0 function03;
        PopupProperties popupProperties3;
        Alignment alignment3;
        long j3;
        boolean changed;
        Object rememberedValue;
        final long j4;
        final Function0 function04;
        final PopupProperties popupProperties4;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(295309329);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            alignment2 = alignment;
        } else if ((i & 14) == 0) {
            alignment2 = alignment;
            i3 = (startRestartGroup.changed(alignment2) ? 4 : 2) | i;
        } else {
            alignment2 = alignment;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changed(function02) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        popupProperties2 = popupProperties;
                        if (startRestartGroup.changed(popupProperties2)) {
                            i5 = 2048;
                            i3 |= i5;
                        }
                    } else {
                        popupProperties2 = popupProperties;
                    }
                    i5 = 1024;
                    i3 |= i5;
                } else {
                    popupProperties2 = popupProperties;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(content) ? 16384 : 8192;
                }
                if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Alignment topStart = i6 != 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                        long IntOffset = i7 != 0 ? IntOffsetKt.IntOffset(0, 0) : j2;
                        if (i4 != 0) {
                            function02 = null;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            popupProperties3 = new PopupProperties(false, false, false, null, false, false, 63, null);
                            j3 = IntOffset;
                            function03 = function02;
                            alignment3 = topStart;
                        } else {
                            function03 = function02;
                            popupProperties3 = popupProperties2;
                            alignment3 = topStart;
                            j3 = IntOffset;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        function03 = function02;
                        popupProperties3 = popupProperties2;
                        alignment3 = alignment2;
                        j3 = j2;
                    }
                    startRestartGroup.endDefaults();
                    IntOffset m2545boximpl = IntOffset.m2545boximpl(j3);
                    startRestartGroup.startReplaceableGroup(511388516);
                    changed = startRestartGroup.changed(m2545boximpl) | startRestartGroup.changed(alignment3);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new AlignmentOffsetPositionProvider(alignment3, j3, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Popup((AlignmentOffsetPositionProvider) rememberedValue, function03, popupProperties3, content, startRestartGroup, (i3 >> 3) & 8176, 0);
                    alignment2 = alignment3;
                    j4 = j3;
                    function04 = function03;
                    popupProperties4 = popupProperties3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    j4 = j2;
                    function04 = function02;
                    popupProperties4 = popupProperties2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i8) {
                        AndroidPopup_androidKt.m2622PopupK5zGePQ(Alignment.this, j4, function04, popupProperties4, content, composer2, i | 1, i2);
                    }
                });
                return;
            }
            function02 = function0;
            if ((i & 7168) == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((46811 & i3) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            startRestartGroup.endDefaults();
            IntOffset m2545boximpl2 = IntOffset.m2545boximpl(j3);
            startRestartGroup.startReplaceableGroup(511388516);
            changed = startRestartGroup.changed(m2545boximpl2) | startRestartGroup.changed(alignment3);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new AlignmentOffsetPositionProvider(alignment3, j3, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            Popup((AlignmentOffsetPositionProvider) rememberedValue, function03, popupProperties3, content, startRestartGroup, (i3 >> 3) & 8176, 0);
            alignment2 = alignment3;
            j4 = j3;
            function04 = function03;
            popupProperties4 = popupProperties3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        j2 = j;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i & 7168) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        startRestartGroup.endDefaults();
        IntOffset m2545boximpl22 = IntOffset.m2545boximpl(j3);
        startRestartGroup.startReplaceableGroup(511388516);
        changed = startRestartGroup.changed(m2545boximpl22) | startRestartGroup.changed(alignment3);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new AlignmentOffsetPositionProvider(alignment3, j3, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        Popup((AlignmentOffsetPositionProvider) rememberedValue, function03, popupProperties3, content, startRestartGroup, (i3 >> 3) & 8176, 0);
        alignment2 = alignment3;
        j4 = j3;
        function04 = function03;
        popupProperties4 = popupProperties3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Popup(final PopupPositionProvider popupPositionProvider, Function0 function0, PopupProperties popupProperties, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        final Function0 function02;
        final PopupProperties popupProperties2;
        int i4;
        PopupProperties popupProperties3;
        Function0 function03;
        Object rememberedValue;
        LayoutDirection layoutDirection;
        Object obj;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Intrinsics.checkNotNullParameter(popupPositionProvider, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-830247068);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changed(function02) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    popupProperties2 = popupProperties;
                    if (startRestartGroup.changed(popupProperties2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    popupProperties2 = popupProperties;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                popupProperties2 = popupProperties;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        function02 = null;
                    }
                    if ((i2 & 4) != 0) {
                        i4 = i3 & (-897);
                        popupProperties3 = new PopupProperties(false, false, false, null, false, false, 63, null);
                        function03 = function02;
                        startRestartGroup.endDefaults();
                        View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        final String str = (String) startRestartGroup.consume(LocalPopupTestTag);
                        LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i4 >> 9) & 14);
                        UUID popupId = (UUID) RememberSaveableKt.rememberSaveable(new Object[0], null, null, new Function0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public final UUID mo4828invoke() {
                                return UUID.randomUUID();
                            }
                        }, startRestartGroup, 3080, 6);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                            layoutDirection = layoutDirection2;
                            final PopupLayout popupLayout = new PopupLayout(function03, popupProperties3, str, view, density, popupPositionProvider, popupId, null, 128, null);
                            popupLayout.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1302892335, true, new Function2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                    invoke((Composer) obj2, ((Number) obj3).intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i7) {
                                    if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                                        Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                invoke((SemanticsPropertyReceiver) obj2);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                SemanticsPropertiesKt.popup(semantics);
                                            }
                                        }, 1, null);
                                        final PopupLayout popupLayout2 = PopupLayout.this;
                                        Modifier alpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(semantics$default, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                m2625invokeozmzZPI(((IntSize) obj2).getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                            public final void m2625invokeozmzZPI(long j) {
                                                PopupLayout.this.m2629setPopupContentSizefhxjrPA(IntSize.m2562boximpl(j));
                                                PopupLayout.this.updatePosition();
                                            }
                                        }), PopupLayout.this.getCanCalculatePosition() ? 1.0f : 0.0f);
                                        final State<Function2> state = rememberUpdatedState;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 606497925, true, new Function2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                invoke((Composer) obj2, ((Number) obj3).intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget
                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i8) {
                                                Function2 m2621Popup$lambda1;
                                                if ((i8 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    m2621Popup$lambda1 = AndroidPopup_androidKt.m2621Popup$lambda1(state);
                                                    m2621Popup$lambda1.invoke(composer3, 0);
                                                }
                                            }
                                        });
                                        composer2.startReplaceableGroup(1406149896);
                                        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1
                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                            /* renamed from: measure-3p2s80s */
                                            public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List measurables, long j) {
                                                int i8;
                                                int i9;
                                                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                                                Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                int size = measurables.size();
                                                if (size == 0) {
                                                    return MeasureScope.layout$default(Layout, 0, 0, null, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$1
                                                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                            invoke((Placeable.PlacementScope) obj2);
                                                            return Unit.INSTANCE;
                                                        }
                                                    }, 4, null);
                                                }
                                                int i10 = 0;
                                                if (size != 1) {
                                                    final ArrayList arrayList = new ArrayList(measurables.size());
                                                    int size2 = measurables.size();
                                                    for (int i11 = 0; i11 < size2; i11++) {
                                                        arrayList.add(((Measurable) measurables.get(i11)).mo1944measureBRTryo0(j));
                                                    }
                                                    int lastIndex = CollectionsKt.getLastIndex(arrayList);
                                                    if (lastIndex >= 0) {
                                                        int i12 = 0;
                                                        int i13 = 0;
                                                        while (true) {
                                                            Placeable placeable = (Placeable) arrayList.get(i10);
                                                            i12 = Math.max(i12, placeable.getWidth());
                                                            i13 = Math.max(i13, placeable.getHeight());
                                                            if (i10 == lastIndex) {
                                                                break;
                                                            }
                                                            i10++;
                                                        }
                                                        i8 = i12;
                                                        i9 = i13;
                                                    } else {
                                                        i8 = 0;
                                                        i9 = 0;
                                                    }
                                                    return MeasureScope.layout$default(Layout, i8, i9, null, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                            invoke((Placeable.PlacementScope) obj2);
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                            int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                                                            if (lastIndex2 < 0) {
                                                                return;
                                                            }
                                                            int i14 = 0;
                                                            while (true) {
                                                                Placeable.PlacementScope.placeRelative$default(layout, arrayList.get(i14), 0, 0, 0.0f, 4, null);
                                                                if (i14 == lastIndex2) {
                                                                    return;
                                                                } else {
                                                                    i14++;
                                                                }
                                                            }
                                                        }
                                                    }, 4, null);
                                                }
                                                final Placeable mo1944measureBRTryo0 = ((Measurable) measurables.get(0)).mo1944measureBRTryo0(j);
                                                return MeasureScope.layout$default(Layout, mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$2
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((Placeable.PlacementScope) obj2);
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                        Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                        };
                                        composer2.startReplaceableGroup(-1323940314);
                                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0 constructor = companion.getConstructor();
                                        Function3 materializerOf = LayoutKt.materializerOf(alpha);
                                        if (composer2.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        composer2.disableReusing();
                                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                                        Updater.m1153setimpl(m1149constructorimpl, androidPopup_androidKt$SimpleStack$1, companion.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl, density2, companion.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection3, companion.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                        composer2.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        composableLambda.invoke(composer2, 6);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }));
                            startRestartGroup.updateRememberedValue(popupLayout);
                            obj = popupLayout;
                        } else {
                            layoutDirection = layoutDirection2;
                            obj = rememberedValue;
                        }
                        startRestartGroup.endReplaceableGroup();
                        final PopupLayout popupLayout2 = (PopupLayout) obj;
                        final Function0 function04 = function03;
                        final PopupProperties popupProperties4 = popupProperties3;
                        final LayoutDirection layoutDirection3 = layoutDirection;
                        EffectsKt.DisposableEffect(popupLayout2, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                PopupLayout.this.show();
                                PopupLayout.this.updateParameters(function04, popupProperties4, str, layoutDirection3);
                                final PopupLayout popupLayout3 = PopupLayout.this;
                                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        PopupLayout.this.disposeComposition();
                                        PopupLayout.this.dismiss();
                                    }
                                };
                            }
                        }, startRestartGroup, 8);
                        EffectsKt.SideEffect(new Function0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                m2624invoke();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m2624invoke() {
                                PopupLayout.this.updateParameters(function04, popupProperties4, str, layoutDirection3);
                            }
                        }, startRestartGroup, 0);
                        EffectsKt.DisposableEffect(popupPositionProvider, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                PopupLayout.this.setPositionProvider(popupPositionProvider);
                                PopupLayout.this.updatePosition();
                                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                    }
                                };
                            }
                        }, startRestartGroup, i4 & 14);
                        EffectsKt.LaunchedEffect(popupLayout2, new AndroidPopup_androidKt$Popup$5(popupLayout2, null), startRestartGroup, 8);
                        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((LayoutCoordinates) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutCoordinates childCoordinates) {
                                Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
                                LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
                                Intrinsics.checkNotNull(parentLayoutCoordinates);
                                PopupLayout.this.updateParentLayoutCoordinates(parentLayoutCoordinates);
                            }
                        });
                        final LayoutDirection layoutDirection4 = layoutDirection;
                        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List list, long j) {
                                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                                Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                                PopupLayout.this.setParentLayoutDirection(layoutDirection4);
                                return MeasureScope.layout$default(Layout, 0, 0, null, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                                    public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((Placeable.PlacementScope) obj2);
                                        return Unit.INSTANCE;
                                    }
                                }, 4, null);
                            }
                        };
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection5 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(onGloballyPositioned);
                        if (startRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        startRestartGroup.disableReusing();
                        Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                        Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density2, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection5, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        startRestartGroup.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        startRestartGroup.startReplaceableGroup(2085825549);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        function02 = function03;
                        popupProperties2 = popupProperties3;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                }
                i4 = i3;
                function03 = function02;
                popupProperties3 = popupProperties2;
                startRestartGroup.endDefaults();
                View view2 = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                final String str2 = (String) startRestartGroup.consume(LocalPopupTestTag);
                LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                CompositionContext rememberCompositionContext2 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                final State<? extends Function2> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i4 >> 9) & 14);
                UUID popupId2 = (UUID) RememberSaveableKt.rememberSaveable(new Object[0], null, null, new Function0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final UUID mo4828invoke() {
                        return UUID.randomUUID();
                    }
                }, startRestartGroup, 3080, 6);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final PopupLayout popupLayout22 = (PopupLayout) obj;
                final Function0 function042 = function03;
                final PopupProperties popupProperties42 = popupProperties3;
                final LayoutDirection layoutDirection32 = layoutDirection;
                EffectsKt.DisposableEffect(popupLayout22, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        PopupLayout.this.show();
                        PopupLayout.this.updateParameters(function042, popupProperties42, str2, layoutDirection32);
                        final PopupLayout popupLayout3 = PopupLayout.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                PopupLayout.this.disposeComposition();
                                PopupLayout.this.dismiss();
                            }
                        };
                    }
                }, startRestartGroup, 8);
                EffectsKt.SideEffect(new Function0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m2624invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m2624invoke() {
                        PopupLayout.this.updateParameters(function042, popupProperties42, str2, layoutDirection32);
                    }
                }, startRestartGroup, 0);
                EffectsKt.DisposableEffect(popupPositionProvider, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        PopupLayout.this.setPositionProvider(popupPositionProvider);
                        PopupLayout.this.updatePosition();
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                            }
                        };
                    }
                }, startRestartGroup, i4 & 14);
                EffectsKt.LaunchedEffect(popupLayout22, new AndroidPopup_androidKt$Popup$5(popupLayout22, null), startRestartGroup, 8);
                Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((LayoutCoordinates) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutCoordinates childCoordinates) {
                        Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
                        LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
                        Intrinsics.checkNotNull(parentLayoutCoordinates);
                        PopupLayout.this.updateParentLayoutCoordinates(parentLayoutCoordinates);
                    }
                });
                final LayoutDirection layoutDirection42 = layoutDirection;
                MeasurePolicy measurePolicy2 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List list, long j) {
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                        PopupLayout.this.setParentLayoutDirection(layoutDirection42);
                        return MeasureScope.layout$default(Layout, 0, 0, null, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((Placeable.PlacementScope) obj2);
                                return Unit.INSTANCE;
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection52 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 constructor2 = companion2.getConstructor();
                Function3 materializerOf2 = LayoutKt.materializerOf(onGloballyPositioned2);
                if (startRestartGroup.getApplier() == null) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl2, measurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl2, density22, companion2.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection52, companion2.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(2085825549);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                function02 = function03;
                popupProperties2 = popupProperties3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i7) {
                    AndroidPopup_androidKt.Popup(PopupPositionProvider.this, function02, popupProperties2, content, composer2, i | 1, i2);
                }
            });
            return;
        }
        function02 = function0;
        if ((i & 896) != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        i4 = i3;
        function03 = function02;
        popupProperties3 = popupProperties2;
        startRestartGroup.endDefaults();
        View view22 = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Density density32 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        final String str22 = (String) startRestartGroup.consume(LocalPopupTestTag);
        LayoutDirection layoutDirection222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        CompositionContext rememberCompositionContext22 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
        final State<? extends Function2> rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i4 >> 9) & 14);
        UUID popupId22 = (UUID) RememberSaveableKt.rememberSaveable(new Object[0], null, null, new Function0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final UUID mo4828invoke() {
                return UUID.randomUUID();
            }
        }, startRestartGroup, 3080, 6);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final PopupLayout popupLayout222 = (PopupLayout) obj;
        final Function0 function0422 = function03;
        final PopupProperties popupProperties422 = popupProperties3;
        final LayoutDirection layoutDirection322 = layoutDirection;
        EffectsKt.DisposableEffect(popupLayout222, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                PopupLayout.this.show();
                PopupLayout.this.updateParameters(function0422, popupProperties422, str22, layoutDirection322);
                final PopupLayout popupLayout3 = PopupLayout.this;
                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        PopupLayout.this.disposeComposition();
                        PopupLayout.this.dismiss();
                    }
                };
            }
        }, startRestartGroup, 8);
        EffectsKt.SideEffect(new Function0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m2624invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m2624invoke() {
                PopupLayout.this.updateParameters(function0422, popupProperties422, str22, layoutDirection322);
            }
        }, startRestartGroup, 0);
        EffectsKt.DisposableEffect(popupPositionProvider, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                PopupLayout.this.setPositionProvider(popupPositionProvider);
                PopupLayout.this.updatePosition();
                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        }, startRestartGroup, i4 & 14);
        EffectsKt.LaunchedEffect(popupLayout222, new AndroidPopup_androidKt$Popup$5(popupLayout222, null), startRestartGroup, 8);
        Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((LayoutCoordinates) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutCoordinates childCoordinates) {
                Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
                LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
                Intrinsics.checkNotNull(parentLayoutCoordinates);
                PopupLayout.this.updateParentLayoutCoordinates(parentLayoutCoordinates);
            }
        });
        final LayoutDirection layoutDirection422 = layoutDirection;
        MeasurePolicy measurePolicy22 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List list, long j) {
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                PopupLayout.this.setParentLayoutDirection(layoutDirection422);
                return MeasureScope.layout$default(Layout, 0, 0, null, new Function1() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                    public final void invoke(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Placeable.PlacementScope) obj2);
                        return Unit.INSTANCE;
                    }
                }, 4, null);
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection522 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
        Function0 constructor22 = companion22.getConstructor();
        Function3 materializerOf22 = LayoutKt.materializerOf(onGloballyPositioned22);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl22, measurePolicy22, companion22.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl22, density222, companion22.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl22, layoutDirection522, companion22.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion22.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(2085825549);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        function02 = function03;
        popupProperties2 = popupProperties3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void PopupTestTag(final String tag, final Function2 content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-498879600);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(tag) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{LocalPopupTestTag.provides(tag)}, content, startRestartGroup, (i2 & 112) | 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$PopupTestTag$1
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
                AndroidPopup_androidKt.PopupTestTag(tag, content, composer2, i | 1);
            }
        });
    }

    public static final boolean isFlagSecureEnabled(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Popup$lambda-1, reason: not valid java name */
    public static final Function2 m2621Popup$lambda1(State state) {
        return (Function2) state.getValue();
    }
}
