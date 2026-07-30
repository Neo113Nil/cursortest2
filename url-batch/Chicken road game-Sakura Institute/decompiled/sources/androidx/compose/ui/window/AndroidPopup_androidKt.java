package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutCoordinates;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aD\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0017\u001a(\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0013\b\b\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u0012H\u0083\b¢\u0006\u0002\u0010\u001e\u001a \u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020!H\u0002\u001a\u001c\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002H\u0007\u001a\u0014\u0010)\u001a\u00020\u0006*\u00020\u00102\u0006\u0010*\u001a\u00020!H\u0002\u001a\f\u0010+\u001a\u00020!*\u00020'H\u0000\u001a\f\u0010,\u001a\u00020-*\u00020.H\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/²\u0006\u0015\u00100\u001a\r\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u0012X\u008a\u0084\u0002"}, d2 = {"LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "PopupPropertiesBaseFlags", "", "Popup", "", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Landroidx/compose/runtime/Composable;", "Popup-K5zGePQ", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PopupTestTag", "tag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SimpleStack", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "createFlags", "focusable", "", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "clippingEnabled", "isPopupLayout", "view", "Landroid/view/View;", "testTag", "flagsWithSecureFlagInherited", "isParentFlagSecureEnabled", "isFlagSecureEnabled", "toIntBounds", "Landroidx/compose/ui/unit/IntRect;", "Landroid/graphics/Rect;", "ui_release", "currentContent"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidPopup_androidKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, new Function0<String>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);
    private static final int PopupPropertiesBaseFlags = 262144;

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0051  */
    /* renamed from: Popup-K5zGePQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6554PopupK5zGePQ(Alignment alignment, long j, Function0<Unit> function0, PopupProperties popupProperties, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Alignment alignment2;
        int i3;
        long j2;
        int i4;
        Function0<Unit> function02;
        int i5;
        PopupProperties popupProperties2;
        Alignment topStart;
        boolean z;
        Object rememberedValue;
        final Function0<Unit> function03;
        final PopupProperties popupProperties3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(295309329);
        ComposerKt.sourceInformation(startRestartGroup, "C(Popup)P(!1,2:c#ui.unit.IntOffset,3,4)269@12290L128,276@12424L165:AndroidPopup.android.kt#2oxthz");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            alignment2 = alignment;
        } else if ((i & 6) == 0) {
            alignment2 = alignment;
            i3 = (startRestartGroup.changed(alignment2) ? 4 : 2) | i;
        } else {
            alignment2 = alignment;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    popupProperties2 = popupProperties;
                    i3 |= startRestartGroup.changed(popupProperties2) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
                        if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                            topStart = i6 != 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                            if (i7 != 0) {
                                j2 = IntOffsetKt.IntOffset(0, 0);
                            }
                            DefaultConstructorMarker defaultConstructorMarker = null;
                            Function0<Unit> function04 = i4 != 0 ? null : function02;
                            PopupProperties popupProperties4 = i5 != 0 ? new PopupProperties(false, false, false, false, 15, (DefaultConstructorMarker) null) : popupProperties2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(295309329, i3, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370836537, "CC(remember):AndroidPopup.android.kt#9igjgp");
                            z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new AlignmentOffsetPositionProvider(topStart, j2, defaultConstructorMarker);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            long j3 = j2;
                            Popup((AlignmentOffsetPositionProvider) rememberedValue, function04, popupProperties4, function2, startRestartGroup, (i3 >> 3) & 8176, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j2 = j3;
                            function03 = function04;
                            popupProperties3 = popupProperties4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            topStart = alignment2;
                            function03 = function02;
                            popupProperties3 = popupProperties2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Alignment alignment3 = topStart;
                            final long j4 = j2;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i8) {
                                    AndroidPopup_androidKt.m6554PopupK5zGePQ(Alignment.this, j4, function03, popupProperties3, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i3 & 9363) == 9362) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    DefaultConstructorMarker defaultConstructorMarker2 = null;
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370836537, "CC(remember):AndroidPopup.android.kt#9igjgp");
                    z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new AlignmentOffsetPositionProvider(topStart, j2, defaultConstructorMarker2);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    long j32 = j2;
                    Popup((AlignmentOffsetPositionProvider) rememberedValue, function04, popupProperties4, function2, startRestartGroup, (i3 >> 3) & 8176, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j2 = j32;
                    function03 = function04;
                    popupProperties3 = popupProperties4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                popupProperties2 = popupProperties;
                if ((i2 & 16) == 0) {
                }
                if ((i3 & 9363) == 9362) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                DefaultConstructorMarker defaultConstructorMarker22 = null;
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370836537, "CC(remember):AndroidPopup.android.kt#9igjgp");
                z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new AlignmentOffsetPositionProvider(topStart, j2, defaultConstructorMarker22);
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                long j322 = j2;
                Popup((AlignmentOffsetPositionProvider) rememberedValue, function04, popupProperties4, function2, startRestartGroup, (i3 >> 3) & 8176, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j2 = j322;
                function03 = function04;
                popupProperties3 = popupProperties4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function02 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            popupProperties2 = popupProperties;
            if ((i2 & 16) == 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            DefaultConstructorMarker defaultConstructorMarker222 = null;
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370836537, "CC(remember):AndroidPopup.android.kt#9igjgp");
            z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new AlignmentOffsetPositionProvider(topStart, j2, defaultConstructorMarker222);
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long j3222 = j2;
            Popup((AlignmentOffsetPositionProvider) rememberedValue, function04, popupProperties4, function2, startRestartGroup, (i3 >> 3) & 8176, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            j2 = j3222;
            function03 = function04;
            popupProperties3 = popupProperties4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        j2 = j;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        popupProperties2 = popupProperties;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        DefaultConstructorMarker defaultConstructorMarker2222 = null;
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370836537, "CC(remember):AndroidPopup.android.kt#9igjgp");
        z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new AlignmentOffsetPositionProvider(topStart, j2, defaultConstructorMarker2222);
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        long j32222 = j2;
        Popup((AlignmentOffsetPositionProvider) rememberedValue, function04, popupProperties4, function2, startRestartGroup, (i3 >> 3) & 8176, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        j2 = j32222;
        function03 = function04;
        popupProperties3 = popupProperties4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Popup(final PopupPositionProvider popupPositionProvider, Function0<Unit> function0, PopupProperties popupProperties, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        PopupProperties popupProperties2;
        int i5;
        Function0<Unit> function03;
        PopupProperties popupProperties3;
        Object rememberedValue;
        String str;
        boolean z;
        String str2;
        int i6;
        int i7;
        Object obj;
        boolean changedInstance;
        Object rememberedValue2;
        boolean changedInstance2;
        Object rememberedValue3;
        int i8;
        boolean z2;
        Object rememberedValue4;
        boolean changedInstance3;
        AndroidPopup_androidKt$Popup$5$1 rememberedValue5;
        boolean changedInstance4;
        Object rememberedValue6;
        boolean changedInstance5;
        MeasurePolicy rememberedValue7;
        int currentCompositeKeyHash;
        Composer m3333constructorimpl;
        final Function0<Unit> function04;
        final PopupProperties popupProperties4;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-830247068);
        ComposerKt.sourceInformation(startRestartGroup, "C(Popup)P(2,1,3)303@13293L7,304@13332L7,305@13376L7,306@13431L7,307@13467L28,308@13522L29,309@13570L38,310@13631L944,338@14611L387,338@14581L417,353@15015L218,353@15004L229,362@15279L126,362@15239L166,374@15996L147,374@15968L175,387@16413L573,395@16993L99,384@16321L771:AndroidPopup.android.kt#2oxthz");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                popupProperties2 = popupProperties;
                i3 |= startRestartGroup.changed(popupProperties2) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                i5 = i3;
                if ((i5 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    function03 = i9 != 0 ? null : function02;
                    popupProperties3 = i4 != 0 ? new PopupProperties(false, false, false, false, 15, (DefaultConstructorMarker) null) : popupProperties2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-830247068, i5, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)");
                    }
                    ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localView);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    View view = (View) consume;
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density = (Density) consume2;
                    ProvidableCompositionLocal<String> providableCompositionLocal = LocalPopupTestTag;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume3 = startRestartGroup.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    String str3 = (String) consume3;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume4 = startRestartGroup.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final LayoutDirection layoutDirection = (LayoutDirection) consume4;
                    CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                    final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i5 >> 9) & 14);
                    UUID uuid = (UUID) RememberSaveableKt.m3426rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                        @Override // kotlin.jvm.functions.Function0
                        public final UUID invoke() {
                            return UUID.randomUUID();
                        }
                    }, startRestartGroup, 3072, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370792809, "CC(remember):AndroidPopup.android.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        str = str3;
                        str2 = "CC(remember):AndroidPopup.android.kt#9igjgp";
                        i6 = i5;
                        i7 = 32;
                        final PopupLayout popupLayout = new PopupLayout(function03, popupProperties3, str, view, density, popupPositionProvider, uuid, null, 128, null);
                        Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                ComposerKt.sourceInformation(composer2, "C325@14200L122,331@14489L56,321@14012L533:AndroidPopup.android.kt#2oxthz");
                                if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1302892335, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)");
                                    }
                                    Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
                                        }
                                    }, 1, null);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -382903426, "CC(remember):AndroidPopup.android.kt#9igjgp");
                                    boolean changedInstance6 = composer2.changedInstance(PopupLayout.this);
                                    final PopupLayout popupLayout2 = PopupLayout.this;
                                    Object rememberedValue8 = composer2.rememberedValue();
                                    if (changedInstance6 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue8 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$2$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                m6555invokeozmzZPI(intSize.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                            public final void m6555invokeozmzZPI(long j) {
                                                PopupLayout.this.m6559setPopupContentSizefhxjrPA(IntSize.m6461boximpl(j));
                                                PopupLayout.this.updatePosition();
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue8);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Modifier alpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(semantics$default, (Function1) rememberedValue8), PopupLayout.this.getCanCalculatePosition() ? 1.0f : 0.0f);
                                    final State<Function2<Composer, Integer, Unit>> state = rememberUpdatedState;
                                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(606497925, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i11) {
                                            Function2 Popup$lambda$1;
                                            ComposerKt.sourceInformation(composer3, "C332@14511L16:AndroidPopup.android.kt#2oxthz");
                                            if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(606497925, i11, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:332)");
                                            }
                                            Popup$lambda$1 = AndroidPopup_androidKt.Popup$lambda$1(state);
                                            Popup$lambda$1.invoke(composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer2, 1406149896, "CC(SimpleStack)P(1)437@18427L979:AndroidPopup.android.kt#2oxthz");
                                    AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, alpha);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer2);
                                    Updater.m3340setimpl(m3333constructorimpl2, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    rememberComposableLambda.invoke(composer2, 6);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        };
                        z = true;
                        popupLayout.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1302892335, true, function22));
                        startRestartGroup.updateRememberedValue(popupLayout);
                        obj = popupLayout;
                    } else {
                        str = str3;
                        z = true;
                        str2 = "CC(remember):AndroidPopup.android.kt#9igjgp";
                        i6 = i5;
                        i7 = 32;
                        obj = rememberedValue;
                    }
                    final PopupLayout popupLayout2 = (PopupLayout) obj;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    String str4 = str2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370762006, str4);
                    int i10 = i6;
                    int i11 = i10 & 112;
                    int i12 = i10 & 896;
                    final String str5 = str;
                    changedInstance = startRestartGroup.changedInstance(popupLayout2) | (i11 == i7 ? z : false) | (i12 == 256 ? z : false) | startRestartGroup.changed(str5) | startRestartGroup.changed(layoutDirection);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final Function0<Unit> function05 = function03;
                        final PopupProperties popupProperties5 = popupProperties3;
                        rememberedValue2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                PopupLayout.this.show();
                                PopupLayout.this.updateParameters(function05, popupProperties5, str5, layoutDirection);
                                final PopupLayout popupLayout3 = PopupLayout.this;
                                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        PopupLayout.this.disposeComposition();
                                        PopupLayout.this.dismiss();
                                    }
                                };
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.DisposableEffect(popupLayout2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370749247, str4);
                    changedInstance2 = (i11 == i7 ? z : false) | startRestartGroup.changedInstance(popupLayout2) | (i12 == 256 ? z : false) | startRestartGroup.changed(str5) | startRestartGroup.changed(layoutDirection);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final Function0<Unit> function06 = function03;
                        final PopupProperties popupProperties6 = popupProperties3;
                        rememberedValue3 = (Function0) new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                PopupLayout.this.updateParameters(function06, popupProperties6, str5, layoutDirection);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.SideEffect((Function0) rememberedValue3, startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370740891, str4);
                    boolean changedInstance6 = startRestartGroup.changedInstance(popupLayout2);
                    i8 = i10 & 14;
                    if (i8 != 4) {
                        z = false;
                    }
                    z2 = z | changedInstance6;
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                PopupLayout.this.setPositionProvider(popupPositionProvider);
                                PopupLayout.this.updatePosition();
                                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                    }
                                };
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.DisposableEffect(popupPositionProvider, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, i8);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370717926, str4);
                    changedInstance3 = startRestartGroup.changedInstance(popupLayout2);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new AndroidPopup_androidKt$Popup$5$1(popupLayout2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.LaunchedEffect(popupLayout2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370704156, str4);
                    changedInstance4 = startRestartGroup.changedInstance(popupLayout2);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changedInstance4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                invoke2(layoutCoordinates);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                                Intrinsics.checkNotNull(parentLayoutCoordinates);
                                PopupLayout.this.updateParentLayoutCoordinates(parentLayoutCoordinates);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) rememberedValue6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370686070, str4);
                    changedInstance5 = startRestartGroup.changedInstance(popupLayout2) | startRestartGroup.changed(layoutDirection);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changedInstance5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                PopupLayout.this.setParentLayoutDirection(layoutDirection);
                                return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }
                                }, 4, null);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue7;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                    Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2112480445, "C:AndroidPopup.android.kt#2oxthz");
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function04 = function03;
                    popupProperties4 = popupProperties3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function04 = function02;
                    popupProperties4 = popupProperties2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i13) {
                            AndroidPopup_androidKt.Popup(PopupPositionProvider.this, function04, popupProperties4, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            popupProperties2 = popupProperties;
            if ((i2 & 8) != 0) {
            }
            i5 = i3;
            if ((i5 & 1171) == 1170) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(localView2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            View view2 = (View) consume5;
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume22;
            ProvidableCompositionLocal<String> providableCompositionLocal2 = LocalPopupTestTag;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume32 = startRestartGroup.consume(providableCompositionLocal2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            String str32 = (String) consume32;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume42 = startRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final LayoutDirection layoutDirection2 = (LayoutDirection) consume42;
            CompositionContext rememberCompositionContext2 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            final State<? extends Function2<? super Composer, ? super Integer, Unit>> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i5 >> 9) & 14);
            UUID uuid2 = (UUID) RememberSaveableKt.m3426rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                @Override // kotlin.jvm.functions.Function0
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, startRestartGroup, 3072, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370792809, "CC(remember):AndroidPopup.android.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final PopupLayout popupLayout22 = (PopupLayout) obj;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            String str42 = str2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370762006, str42);
            int i102 = i6;
            int i112 = i102 & 112;
            int i122 = i102 & 896;
            final String str52 = str;
            changedInstance = startRestartGroup.changedInstance(popupLayout22) | (i112 == i7 ? z : false) | (i122 == 256 ? z : false) | startRestartGroup.changed(str52) | startRestartGroup.changed(layoutDirection2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            final Function0<Unit> function052 = function03;
            final PopupProperties popupProperties52 = popupProperties3;
            rememberedValue2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    PopupLayout.this.show();
                    PopupLayout.this.updateParameters(function052, popupProperties52, str52, layoutDirection2);
                    final PopupLayout popupLayout3 = PopupLayout.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            PopupLayout.this.disposeComposition();
                            PopupLayout.this.dismiss();
                        }
                    };
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(popupLayout22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370749247, str42);
            changedInstance2 = (i112 == i7 ? z : false) | startRestartGroup.changedInstance(popupLayout22) | (i122 == 256 ? z : false) | startRestartGroup.changed(str52) | startRestartGroup.changed(layoutDirection2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            final Function0<Unit> function062 = function03;
            final PopupProperties popupProperties62 = popupProperties3;
            rememberedValue3 = (Function0) new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    PopupLayout.this.updateParameters(function062, popupProperties62, str52, layoutDirection2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.SideEffect((Function0) rememberedValue3, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370740891, str42);
            boolean changedInstance62 = startRestartGroup.changedInstance(popupLayout22);
            i8 = i102 & 14;
            if (i8 != 4) {
            }
            z2 = z | changedInstance62;
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    PopupLayout.this.setPositionProvider(popupPositionProvider);
                    PopupLayout.this.updatePosition();
                    return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(popupPositionProvider, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, i8);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370717926, str42);
            changedInstance3 = startRestartGroup.changedInstance(popupLayout22);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue5 = new AndroidPopup_androidKt$Popup$5$1(popupLayout22, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(popupLayout22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370704156, str42);
            changedInstance4 = startRestartGroup.changedInstance(popupLayout22);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue6 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                    LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                    Intrinsics.checkNotNull(parentLayoutCoordinates);
                    PopupLayout.this.updateParentLayoutCoordinates(parentLayoutCoordinates);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (Function1) rememberedValue6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370686070, str42);
            changedInstance5 = startRestartGroup.changedInstance(popupLayout22) | startRestartGroup.changed(layoutDirection2);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue7 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                    PopupLayout.this.setParentLayoutDirection(layoutDirection2);
                    return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue7);
            MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, measurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3333constructorimpl.getInserting()) {
            }
            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2112480445, "C:AndroidPopup.android.kt#2oxthz");
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            function04 = function03;
            popupProperties4 = popupProperties3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        popupProperties2 = popupProperties;
        if ((i2 & 8) != 0) {
        }
        i5 = i3;
        if ((i5 & 1171) == 1170) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<View> localView22 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume52 = startRestartGroup.consume(localView22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        View view22 = (View) consume52;
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22 = (Density) consume222;
        ProvidableCompositionLocal<String> providableCompositionLocal22 = LocalPopupTestTag;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume322 = startRestartGroup.consume(providableCompositionLocal22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        String str322 = (String) consume322;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume422 = startRestartGroup.consume(localLayoutDirection22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final LayoutDirection layoutDirection22 = (LayoutDirection) consume422;
        CompositionContext rememberCompositionContext22 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
        final State<? extends Function2<? super Composer, ? super Integer, Unit>> rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i5 >> 9) & 14);
        UUID uuid22 = (UUID) RememberSaveableKt.m3426rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
            @Override // kotlin.jvm.functions.Function0
            public final UUID invoke() {
                return UUID.randomUUID();
            }
        }, startRestartGroup, 3072, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370792809, "CC(remember):AndroidPopup.android.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final PopupLayout popupLayout222 = (PopupLayout) obj;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        String str422 = str2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370762006, str422);
        int i1022 = i6;
        int i1122 = i1022 & 112;
        int i1222 = i1022 & 896;
        final String str522 = str;
        changedInstance = startRestartGroup.changedInstance(popupLayout222) | (i1122 == i7 ? z : false) | (i1222 == 256 ? z : false) | startRestartGroup.changed(str522) | startRestartGroup.changed(layoutDirection22);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        final Function0<Unit> function0522 = function03;
        final PopupProperties popupProperties522 = popupProperties3;
        rememberedValue2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                PopupLayout.this.show();
                PopupLayout.this.updateParameters(function0522, popupProperties522, str522, layoutDirection22);
                final PopupLayout popupLayout3 = PopupLayout.this;
                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        PopupLayout.this.disposeComposition();
                        PopupLayout.this.dismiss();
                    }
                };
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.DisposableEffect(popupLayout222, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370749247, str422);
        changedInstance2 = (i1122 == i7 ? z : false) | startRestartGroup.changedInstance(popupLayout222) | (i1222 == 256 ? z : false) | startRestartGroup.changed(str522) | startRestartGroup.changed(layoutDirection22);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        final Function0<Unit> function0622 = function03;
        final PopupProperties popupProperties622 = popupProperties3;
        rememberedValue3 = (Function0) new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PopupLayout.this.updateParameters(function0622, popupProperties622, str522, layoutDirection22);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.SideEffect((Function0) rememberedValue3, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370740891, str422);
        boolean changedInstance622 = startRestartGroup.changedInstance(popupLayout222);
        i8 = i1022 & 14;
        if (i8 != 4) {
        }
        z2 = z | changedInstance622;
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                PopupLayout.this.setPositionProvider(popupPositionProvider);
                PopupLayout.this.updatePosition();
                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.DisposableEffect(popupPositionProvider, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, i8);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370717926, str422);
        changedInstance3 = startRestartGroup.changedInstance(popupLayout222);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue5 = new AndroidPopup_androidKt$Popup$5$1(popupLayout222, null);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.LaunchedEffect(popupLayout222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
        Modifier.Companion companion22 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370704156, str422);
        changedInstance4 = startRestartGroup.changedInstance(popupLayout222);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changedInstance4) {
        }
        rememberedValue6 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                Intrinsics.checkNotNull(parentLayoutCoordinates);
                PopupLayout.this.updateParentLayoutCoordinates(parentLayoutCoordinates);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion22, (Function1) rememberedValue6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1370686070, str422);
        changedInstance5 = startRestartGroup.changedInstance(popupLayout222) | startRestartGroup.changed(layoutDirection22);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changedInstance5) {
        }
        rememberedValue7 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                PopupLayout.this.setParentLayoutDirection(layoutDirection22);
                return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }
                }, 4, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        MeasurePolicy measurePolicy22 = (MeasurePolicy) rememberedValue7;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl, measurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl.getInserting()) {
        }
        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m3340setimpl(m3333constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2112480445, "C:AndroidPopup.android.kt#2oxthz");
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        function04 = function03;
        popupProperties4 = popupProperties3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createFlags(boolean z, SecureFlagPolicy secureFlagPolicy, boolean z2) {
        int i = !z ? 262152 : 262144;
        if (secureFlagPolicy == SecureFlagPolicy.SecureOn) {
            i |= 8192;
        }
        return !z2 ? i | 512 : i;
    }

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    public static final void PopupTestTag(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-498879600);
        ComposerKt.sourceInformation(startRestartGroup, "C(PopupTestTag)P(1)429@18089L75:AndroidPopup.android.kt#2oxthz");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498879600, i2, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:428)");
            }
            CompositionLocalKt.CompositionLocalProvider(LocalPopupTestTag.provides(str), function2, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$PopupTestTag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    AndroidPopup_androidKt.PopupTestTag(str, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final void SimpleStack(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1406149896, "CC(SimpleStack)P(1)437@18427L979:AndroidPopup.android.kt#2oxthz");
        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.INSTANCE;
        int i2 = ((i << 3) & 112) | ((i >> 3) & 14) | 384;
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        int i3 = ((i2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3333constructorimpl = Updater.m3333constructorimpl(composer);
        Updater.m3340setimpl(m3333constructorimpl, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        function2.invoke(composer, Integer.valueOf((i3 >> 6) & 14));
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int flagsWithSecureFlagInherited(PopupProperties popupProperties, boolean z) {
        if (popupProperties.getInheritSecurePolicy() && z) {
            return popupProperties.getFlags() | 8192;
        }
        if (popupProperties.getInheritSecurePolicy() && !z) {
            return popupProperties.getFlags() & (-8193);
        }
        return popupProperties.getFlags();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    public static final boolean isPopupLayout(View view, String str) {
        return (view instanceof PopupLayout) && (str == null || Intrinsics.areEqual(str, ((PopupLayout) view).getTestTag()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> Popup$lambda$1(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
