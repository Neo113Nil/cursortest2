package androidx.compose.foundation.contextmenu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContextMenuUi.android.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001ai\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2*\b\u0002\u0010\u001a\u001a$\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010¢\u0006\u0002\b\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0 H\u0001¢\u0006\u0002\u0010!\u001aN\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00012\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0002\b\u0013H\u0001¢\u0006\u0002\u0010(\u001aF\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0002\b\u0013H\u0001¢\u0006\u0002\u0010)\u001a!\u0010*\u001a\u00020\u00012\b\b\u0003\u0010+\u001a\u00020,2\b\b\u0003\u0010-\u001a\u00020,H\u0001¢\u0006\u0002\u0010.\u001a \u0010/\u001a\u00020\u001b*\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a \u00104\u001a\u00020\u001b*\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00103\u001a2\u00106\u001a\u00020\u001b*\u0002072\b\b\u0001\u00108\u001a\u00020,2\b\b\u0001\u00109\u001a\u00020,2\u0006\u00101\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\"\u0010<\u001a\u0004\u0018\u000100*\u0002072\b\b\u0001\u00108\u001a\u00020,2\b\b\u0001\u00109\u001a\u00020,H\u0002\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"DefaultContextMenuColors", "Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "getDefaultContextMenuColors$annotations", "()V", "getDefaultContextMenuColors", "()Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "DefaultPopupProperties", "Landroidx/compose/ui/window/PopupProperties;", "DisabledAlpha", "", "ContextMenuColumn", "", "colors", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ContextMenuItem", "label", "", "enabled", "", "leadingIcon", "Landroidx/compose/ui/graphics/Color;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "iconColor", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;ZLandroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ContextMenuPopup", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "onDismiss", "contextMenuBuilderBlock", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/contextmenu/ContextMenuColors;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "computeContextMenuColors", "backgroundStyleId", "", "foregroundStyleId", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "disabledColor", "Landroid/content/res/ColorStateList;", "defaultColor", "disabledColor-4WTKRHQ", "(Landroid/content/res/ColorStateList;J)J", "enabledColor", "enabledColor-4WTKRHQ", "resolveColor", "Landroid/content/Context;", "resId", "attrId", "resolveColor-g2O1Hgs", "(Landroid/content/Context;IIJ)J", "resolveColorStateList", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextMenuUi_androidKt {
    private static final float DisabledAlpha = 0.38f;
    private static final PopupProperties DefaultPopupProperties = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);
    private static final ContextMenuColors DefaultContextMenuColors = new ContextMenuColors(Color.INSTANCE.m3860getWhite0d7_KjU(), Color.INSTANCE.m3849getBlack0d7_KjU(), Color.INSTANCE.m3849getBlack0d7_KjU(), Color.m3822copywmQWz5c$default(Color.INSTANCE.m3849getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3822copywmQWz5c$default(Color.INSTANCE.m3849getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);

    public static /* synthetic */ void getDefaultContextMenuColors$annotations() {
    }

    public static final void ContextMenuPopup(PopupPositionProvider popupPositionProvider, Function0<Unit> function0, Modifier modifier, Function1<? super ContextMenuScope, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        final PopupPositionProvider popupPositionProvider2;
        final Function0<Unit> function02;
        final Function1<? super ContextMenuScope, Unit> function12;
        final Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(712057293);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContextMenuPopup)P(3,2,1)108@4164L26,104@4014L241:ContextMenuUi.android.kt#3xeu6s");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(712057293, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:103)");
            }
            ContextMenuPopup(popupPositionProvider, function0, modifier3, computeContextMenuColors(0, 0, startRestartGroup, 0, 3), function1, startRestartGroup, (i3 & 1022) | ((i3 << 3) & 57344), 0);
            popupPositionProvider2 = popupPositionProvider;
            function02 = function0;
            function12 = function1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            function12 = function1;
            modifier2 = modifier;
            function02 = function0;
            popupPositionProvider2 = popupPositionProvider;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$1
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

                public final void invoke(Composer composer2, int i5) {
                    ContextMenuUi_androidKt.ContextMenuPopup(PopupPositionProvider.this, function02, modifier2, function12, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextMenuPopup(final PopupPositionProvider popupPositionProvider, final Function0<Unit> function0, Modifier modifier, final ContextMenuColors contextMenuColors, final Function1<? super ContextMenuScope, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1447189339);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContextMenuPopup)P(4,3,2)126@4681L257,122@4530L408:ContextMenuUi.android.kt#3xeu6s");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(contextMenuColors) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                final Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1447189339, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:121)");
                }
                AndroidPopup_androidKt.Popup(popupPositionProvider, function0, DefaultPopupProperties, ComposableLambdaKt.rememberComposableLambda(795909757, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2
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

                    public final void invoke(Composer composer2, int i5) {
                        ComposerKt.sourceInformation(composer2, "C127@4727L205,127@4691L241:ContextMenuUi.android.kt#3xeu6s");
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(795909757, i5, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:127)");
                            }
                            ContextMenuColors contextMenuColors2 = ContextMenuColors.this;
                            Modifier modifier3 = companion;
                            final Function1<ContextMenuScope, Unit> function12 = function1;
                            final ContextMenuColors contextMenuColors3 = ContextMenuColors.this;
                            ContextMenuUi_androidKt.ContextMenuColumn(contextMenuColors2, modifier3, ComposableLambdaKt.rememberComposableLambda(1156688164, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                    invoke(columnScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(ColumnScope columnScope, Composer composer3, int i6) {
                                    ComposerKt.sourceInformation(composer3, "C128@4753L31,*132@4893L15:ContextMenuUi.android.kt#3xeu6s");
                                    if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1156688164, i6, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:128)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart(composer3, 1358376149, "CC(remember):ContextMenuUi.android.kt#9igjgp");
                                    Object rememberedValue = composer3.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new ContextMenuScope();
                                        composer3.updateRememberedValue(rememberedValue);
                                    }
                                    ContextMenuScope contextMenuScope = (ContextMenuScope) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Function1<ContextMenuScope, Unit> function13 = function12;
                                    ContextMenuColors contextMenuColors4 = contextMenuColors3;
                                    contextMenuScope.clear$foundation_release();
                                    function13.invoke(contextMenuScope);
                                    contextMenuScope.Content$foundation_release(contextMenuColors4, composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 384, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3456 | (i3 & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$3
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

                    public final void invoke(Composer composer2, int i5) {
                        ContextMenuUi_androidKt.ContextMenuPopup(PopupPositionProvider.this, function0, modifier2, contextMenuColors, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        AndroidPopup_androidKt.Popup(popupPositionProvider, function0, DefaultPopupProperties, ComposableLambdaKt.rememberComposableLambda(795909757, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2
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

            public final void invoke(Composer composer2, int i5) {
                ComposerKt.sourceInformation(composer2, "C127@4727L205,127@4691L241:ContextMenuUi.android.kt#3xeu6s");
                if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(795909757, i5, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:127)");
                    }
                    ContextMenuColors contextMenuColors2 = ContextMenuColors.this;
                    Modifier modifier3 = companion;
                    final Function1<? super ContextMenuScope, Unit> function12 = function1;
                    final ContextMenuColors contextMenuColors3 = ContextMenuColors.this;
                    ContextMenuUi_androidKt.ContextMenuColumn(contextMenuColors2, modifier3, ComposableLambdaKt.rememberComposableLambda(1156688164, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope columnScope, Composer composer3, int i6) {
                            ComposerKt.sourceInformation(composer3, "C128@4753L31,*132@4893L15:ContextMenuUi.android.kt#3xeu6s");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1156688164, i6, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:128)");
                            }
                            ComposerKt.sourceInformationMarkerStart(composer3, 1358376149, "CC(remember):ContextMenuUi.android.kt#9igjgp");
                            Object rememberedValue = composer3.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new ContextMenuScope();
                                composer3.updateRememberedValue(rememberedValue);
                            }
                            ContextMenuScope contextMenuScope = (ContextMenuScope) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Function1<ContextMenuScope, Unit> function13 = function12;
                            ContextMenuColors contextMenuColors4 = contextMenuColors3;
                            contextMenuScope.clear$foundation_release();
                            function13.invoke(contextMenuScope);
                            contextMenuScope.Content$foundation_release(contextMenuColors4, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3456 | (i3 & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextMenuColumn(ContextMenuColors contextMenuColors, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        ContextMenuColors contextMenuColors2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m3316constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-921259293);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContextMenuColumn)P(!1,2)154@5499L21,145@5128L427:ContextMenuUi.android.kt#3xeu6s");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            contextMenuColors2 = contextMenuColors;
        } else if ((i & 6) == 0) {
            contextMenuColors2 = contextMenuColors;
            i3 = (startRestartGroup.changed(contextMenuColors2) ? 4 : 2) | i;
        } else {
            contextMenuColors2 = contextMenuColors;
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-921259293, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.android.kt:144)");
                }
                Modifier verticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m675paddingVpY3zN4$default(IntrinsicKt.width(BackgroundKt.m228backgroundbw27NRU$default(ShadowKt.m3487shadows4CzXII$default(modifier2, ContextMenuSpec.INSTANCE.m348getMenuContainerElevationD9Ej5fM(), RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(ContextMenuSpec.INSTANCE.m340getCornerRadiusD9Ej5fM()), false, 0L, 0L, 28, null), contextMenuColors2.getBackgroundColor(), null, 2, null), IntrinsicSize.Max), 0.0f, ContextMenuSpec.INSTANCE.m349getVerticalPaddingD9Ej5fM(), 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                int i5 = (i3 << 3) & 7168;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                Updater.m3323setimpl(m3316constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                function3.invoke(ColumnScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i5 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final ContextMenuColors contextMenuColors3 = contextMenuColors2;
                final Modifier modifier3 = modifier2;
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuColumn$1
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

                    public final void invoke(Composer composer2, int i6) {
                        ContextMenuUi_androidKt.ContextMenuColumn(ContextMenuColors.this, modifier3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier verticalScroll$default2 = ScrollKt.verticalScroll$default(PaddingKt.m675paddingVpY3zN4$default(IntrinsicKt.width(BackgroundKt.m228backgroundbw27NRU$default(ShadowKt.m3487shadows4CzXII$default(modifier2, ContextMenuSpec.INSTANCE.m348getMenuContainerElevationD9Ej5fM(), RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(ContextMenuSpec.INSTANCE.m340getCornerRadiusD9Ej5fM()), false, 0L, 0L, 28, null), contextMenuColors2.getBackgroundColor(), null, 2, null), IntrinsicSize.Max), 0.0f, ContextMenuSpec.INSTANCE.m349getVerticalPaddingD9Ej5fM(), 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
        int i52 = (i3 << 3) & 7168;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
        Updater.m3323setimpl(m3316constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3316constructorimpl.getInserting()) {
        }
        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m3323setimpl(m3316constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        function3.invoke(ColumnScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i52 >> 6) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextMenuItem(final String str, final boolean z, final ContextMenuColors contextMenuColors, Modifier modifier, Function3<? super Color, ? super Composer, ? super Integer, Unit> function3, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        ContextMenuColors contextMenuColors2;
        Modifier modifier2;
        int i4;
        Function3<? super Color, ? super Composer, ? super Integer, Unit> function32;
        int i5;
        Function3<? super Color, ? super Composer, ? super Integer, Unit> function33;
        boolean z2;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m3316constructorimpl;
        Composer composer2;
        final Modifier modifier3;
        final Function3<? super Color, ? super Composer, ? super Integer, Unit> function34;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(791018367);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContextMenuItem)P(2,1!1,4)189@6696L221,182@6391L1588:ContextMenuUi.android.kt#3xeu6s");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (startRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            contextMenuColors2 = contextMenuColors;
        } else {
            contextMenuColors2 = contextMenuColors;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(contextMenuColors2) ? 256 : 128;
            }
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function32 = function3;
                i3 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
                }
                i5 = i3;
                if ((74899 & i5) == 74898 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    function33 = i4 != 0 ? null : function32;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(791018367, i5, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:181)");
                    }
                    Alignment.Vertical labelVerticalTextAlignment = ContextMenuSpec.INSTANCE.getLabelVerticalTextAlignment();
                    Arrangement.HorizontalOrVertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(ContextMenuSpec.INSTANCE.m342getHorizontalPaddingD9Ej5fM());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1814201532, "CC(remember):ContextMenuUi.android.kt#9igjgp");
                    z2 = ((i5 & 112) == 32) | ((458752 & i5) == 131072);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
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
                                if (z) {
                                    function0.invoke();
                                }
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier modifier4 = companion;
                    Modifier m675paddingVpY3zN4$default = PaddingKt.m675paddingVpY3zN4$default(SizeKt.m721sizeInqDBjuR0(SizeKt.fillMaxWidth$default(ClickableKt.m261clickableXHw0xAI$default(modifier4, z, str2, null, (Function0) rememberedValue, 4, null), 0.0f, 1, null), ContextMenuSpec.INSTANCE.m339getContainerWidthMinD9Ej5fM(), ContextMenuSpec.INSTANCE.m347getListItemHeightD9Ej5fM(), ContextMenuSpec.INSTANCE.m338getContainerWidthMaxD9Ej5fM(), ContextMenuSpec.INSTANCE.m347getListItemHeightD9Ej5fM()), ContextMenuSpec.INSTANCE.m342getHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m553spacedBy0680j_4, labelVerticalTextAlignment, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m675paddingVpY3zN4$default);
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
                    m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                    Updater.m3323setimpl(m3316constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 554565222, "C212@7698L275:ContextMenuUi.android.kt#3xeu6s");
                    if (function33 == null) {
                        startRestartGroup.startReplaceGroup(554568909);
                    } else {
                        startRestartGroup.startReplaceGroup(554568910);
                        ComposerKt.sourceInformation(startRestartGroup, "*204@7349L330");
                        Modifier m714requiredSizeInqDBjuR0$default = SizeKt.m714requiredSizeInqDBjuR0$default(Modifier.INSTANCE, ContextMenuSpec.INSTANCE.m343getIconSizeD9Ej5fM(), 0.0f, ContextMenuSpec.INSTANCE.m343getIconSizeD9Ej5fM(), ContextMenuSpec.INSTANCE.m343getIconSizeD9Ej5fM(), 2, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m714requiredSizeInqDBjuR0$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m3316constructorimpl2 = Updater.m3316constructorimpl(startRestartGroup);
                        Updater.m3323setimpl(m3316constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3316constructorimpl2.getInserting() || !Intrinsics.areEqual(m3316constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m3316constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m3316constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3323setimpl(m3316constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1218311042, "C210@7612L65:ContextMenuUi.android.kt#3xeu6s");
                        function33.invoke(Color.m3813boximpl(z ? contextMenuColors2.getIconColor() : contextMenuColors2.getDisabledIconColor()), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    }
                    startRestartGroup.endReplaceGroup();
                    Function3<? super Color, ? super Composer, ? super Integer, Unit> function35 = function33;
                    composer2 = startRestartGroup;
                    BasicTextKt.m968BasicTextVhcvRP8(str, rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, true), ContextMenuSpec.INSTANCE.m350textStyle8_81llA(z ? contextMenuColors2.getTextColor() : contextMenuColors2.getDisabledTextColor()), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 1, 0, (ColorProducer) null, composer2, (i5 & 14) | 1572864, 440);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    function34 = function35;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                    function34 = function32;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$3
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

                        public final void invoke(Composer composer3, int i7) {
                            ContextMenuUi_androidKt.ContextMenuItem(str, z, contextMenuColors, modifier3, function34, function0, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            function32 = function3;
            if ((i2 & 32) != 0) {
            }
            i5 = i3;
            if ((74899 & i5) == 74898) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Vertical labelVerticalTextAlignment2 = ContextMenuSpec.INSTANCE.getLabelVerticalTextAlignment();
            Arrangement.HorizontalOrVertical m553spacedBy0680j_42 = Arrangement.INSTANCE.m553spacedBy0680j_4(ContextMenuSpec.INSTANCE.m342getHorizontalPaddingD9Ej5fM());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1814201532, "CC(remember):ContextMenuUi.android.kt#9igjgp");
            z2 = ((i5 & 112) == 32) | ((458752 & i5) == 131072);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
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
                    if (z) {
                        function0.invoke();
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier modifier42 = companion;
            Modifier m675paddingVpY3zN4$default2 = PaddingKt.m675paddingVpY3zN4$default(SizeKt.m721sizeInqDBjuR0(SizeKt.fillMaxWidth$default(ClickableKt.m261clickableXHw0xAI$default(modifier42, z, str2, null, (Function0) rememberedValue, 4, null), 0.0f, 1, null), ContextMenuSpec.INSTANCE.m339getContainerWidthMinD9Ej5fM(), ContextMenuSpec.INSTANCE.m347getListItemHeightD9Ej5fM(), ContextMenuSpec.INSTANCE.m338getContainerWidthMaxD9Ej5fM(), ContextMenuSpec.INSTANCE.m347getListItemHeightD9Ej5fM()), ContextMenuSpec.INSTANCE.m342getHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m553spacedBy0680j_42, labelVerticalTextAlignment2, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m675paddingVpY3zN4$default2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
            Updater.m3323setimpl(m3316constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3316constructorimpl.getInserting()) {
            }
            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 554565222, "C212@7698L275:ContextMenuUi.android.kt#3xeu6s");
            if (function33 == null) {
            }
            startRestartGroup.endReplaceGroup();
            Function3<? super Color, ? super Composer, ? super Integer, Unit> function352 = function33;
            composer2 = startRestartGroup;
            BasicTextKt.m968BasicTextVhcvRP8(str, rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, true), ContextMenuSpec.INSTANCE.m350textStyle8_81llA(z ? contextMenuColors2.getTextColor() : contextMenuColors2.getDisabledTextColor()), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 1, 0, (ColorProducer) null, composer2, (i5 & 14) | 1572864, 440);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
            function34 = function352;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function32 = function3;
        if ((i2 & 32) != 0) {
        }
        i5 = i3;
        if ((74899 & i5) == 74898) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Alignment.Vertical labelVerticalTextAlignment22 = ContextMenuSpec.INSTANCE.getLabelVerticalTextAlignment();
        Arrangement.HorizontalOrVertical m553spacedBy0680j_422 = Arrangement.INSTANCE.m553spacedBy0680j_4(ContextMenuSpec.INSTANCE.m342getHorizontalPaddingD9Ej5fM());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1814201532, "CC(remember):ContextMenuUi.android.kt#9igjgp");
        z2 = ((i5 & 112) == 32) | ((458752 & i5) == 131072);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
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
                if (z) {
                    function0.invoke();
                }
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier modifier422 = companion;
        Modifier m675paddingVpY3zN4$default22 = PaddingKt.m675paddingVpY3zN4$default(SizeKt.m721sizeInqDBjuR0(SizeKt.fillMaxWidth$default(ClickableKt.m261clickableXHw0xAI$default(modifier422, z, str2, null, (Function0) rememberedValue, 4, null), 0.0f, 1, null), ContextMenuSpec.INSTANCE.m339getContainerWidthMinD9Ej5fM(), ContextMenuSpec.INSTANCE.m347getListItemHeightD9Ej5fM(), ContextMenuSpec.INSTANCE.m338getContainerWidthMaxD9Ej5fM(), ContextMenuSpec.INSTANCE.m347getListItemHeightD9Ej5fM()), ContextMenuSpec.INSTANCE.m342getHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m553spacedBy0680j_422, labelVerticalTextAlignment22, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m675paddingVpY3zN4$default22);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
        Updater.m3323setimpl(m3316constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3316constructorimpl.getInserting()) {
        }
        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
        Updater.m3323setimpl(m3316constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 554565222, "C212@7698L275:ContextMenuUi.android.kt#3xeu6s");
        if (function33 == null) {
        }
        startRestartGroup.endReplaceGroup();
        Function3<? super Color, ? super Composer, ? super Integer, Unit> function3522 = function33;
        composer2 = startRestartGroup;
        BasicTextKt.m968BasicTextVhcvRP8(str, rowScopeInstance22.weight(Modifier.INSTANCE, 1.0f, true), ContextMenuSpec.INSTANCE.m350textStyle8_81llA(z ? contextMenuColors2.getTextColor() : contextMenuColors2.getDisabledTextColor()), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 1, 0, (ColorProducer) null, composer2, (i5 & 14) | 1572864, 440);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier422;
        function34 = function3522;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final ContextMenuColors getDefaultContextMenuColors() {
        return DefaultContextMenuColors;
    }

    public static final ContextMenuColors computeContextMenuColors(int i, int i2, Composer composer, int i3, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, 1689505294, "C(computeContextMenuColors)355@13081L7,356@13137L7,356@13100L846:ContextMenuUi.android.kt#3xeu6s");
        int i5 = (i4 & 1) != 0 ? R.style.Widget.PopupMenu : i;
        int i6 = (i4 & 2) != 0 ? R.style.TextAppearance.Widget.PopupMenu.Large : i2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1689505294, i3, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:354)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -753201361, "CC(remember):ContextMenuUi.android.kt#9igjgp");
        boolean changed = composer.changed((Configuration) consume2) | composer.changed(context);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            ContextMenuColors contextMenuColors = DefaultContextMenuColors;
            long m354resolveColorg2O1Hgs = m354resolveColorg2O1Hgs(context, i5, R.attr.colorBackground, contextMenuColors.getBackgroundColor());
            ColorStateList resolveColorStateList = resolveColorStateList(context, i6, R.attr.textColorPrimary);
            long m353enabledColor4WTKRHQ = m353enabledColor4WTKRHQ(resolveColorStateList, contextMenuColors.getTextColor());
            long m352disabledColor4WTKRHQ = m352disabledColor4WTKRHQ(resolveColorStateList, contextMenuColors.getDisabledTextColor());
            Object contextMenuColors2 = new ContextMenuColors(m354resolveColorg2O1Hgs, m353enabledColor4WTKRHQ, m353enabledColor4WTKRHQ, m352disabledColor4WTKRHQ, m352disabledColor4WTKRHQ, null);
            composer.updateRememberedValue(contextMenuColors2);
            rememberedValue = contextMenuColors2;
        }
        ContextMenuColors contextMenuColors3 = (ContextMenuColors) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return contextMenuColors3;
    }

    /* renamed from: resolveColor-g2O1Hgs, reason: not valid java name */
    private static final long m354resolveColorg2O1Hgs(Context context, int i, int i2, long j) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        int m3877toArgb8_81llA = ColorKt.m3877toArgb8_81llA(j);
        int color = obtainStyledAttributes.getColor(0, m3877toArgb8_81llA);
        obtainStyledAttributes.recycle();
        return color == m3877toArgb8_81llA ? j : ColorKt.Color(color);
    }

    private static final ColorStateList resolveColorStateList(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        return colorStateList;
    }

    /* renamed from: enabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m353enabledColor4WTKRHQ(ColorStateList colorStateList, long j) {
        int m3877toArgb8_81llA = ColorKt.m3877toArgb8_81llA(j);
        Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, m3877toArgb8_81llA)) : null;
        return (valueOf == null || valueOf.intValue() == m3877toArgb8_81llA) ? j : ColorKt.Color(valueOf.intValue());
    }

    /* renamed from: disabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m352disabledColor4WTKRHQ(ColorStateList colorStateList, long j) {
        int m3877toArgb8_81llA = ColorKt.m3877toArgb8_81llA(j);
        Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, m3877toArgb8_81llA)) : null;
        return (valueOf == null || valueOf.intValue() == m3877toArgb8_81llA) ? j : ColorKt.Color(valueOf.intValue());
    }
}
