package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: ContextualFlowLayout.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r21\u0010\u000e\u001a-\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a\u0084\u0001\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u001921\u0010\u000e\u001a-\u0012\u0004\u0012\u00020\u001a\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u001b\u001a¥\u0001\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010#\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010%¢\u0006\u0002\b\u00140$2;\u0010&\u001a7\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110'¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0002\u0010)\u001a¥\u0001\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010#\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010%¢\u0006\u0002\b\u00140$2;\u0010&\u001a7\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110'¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0002\u0010+¨\u0006,"}, d2 = {"ContextualFlowColumn", "", "itemCount", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "maxItemsInEachColumn", "maxLines", "overflow", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;", "content", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ContextualFlowColumnScope;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/ContextualFlowColumnOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "ContextualFlowRow", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/ContextualFlowRowOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "contextualColumnMeasureHelper", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "maxItemsInMainAxis", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowComposables", "", "Lkotlin/Function0;", "getComposable", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "contextualRowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextualFlowLayoutKt {
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019c, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextualFlowRow(final int i, Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i2, int i3, ContextualFlowRowOverflow contextualFlowRowOverflow, final Function4<? super ContextualFlowRowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        Arrangement.Horizontal horizontal2;
        int i8;
        Arrangement.Vertical vertical2;
        int i9;
        int i10;
        int i11;
        int i12;
        ContextualFlowRowOverflow clip;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object obj;
        final Arrangement.Horizontal horizontal3;
        final ContextualFlowRowOverflow contextualFlowRowOverflow2;
        final int i13;
        final Modifier modifier3;
        final int i14;
        final Arrangement.Vertical vertical3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-341770689);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContextualFlowRow)P(2,5,1,7,3,4,6)74@3434L65,77@3545L193,90@3961L267,82@3763L465,99@4233L90:ContextualFlowLayout.kt#2w3rfo");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (startRestartGroup.changed(i) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                horizontal2 = horizontal;
                i6 |= startRestartGroup.changed(horizontal2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    vertical2 = vertical;
                    i6 |= startRestartGroup.changed(vertical2) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i10 = i2;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 131072 : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(contextualFlowRowOverflow) ? 1048576 : 524288;
                        }
                        if ((i5 & 128) != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i6 |= startRestartGroup.changedInstance(function4) ? 8388608 : 4194304;
                        }
                        if ((4793491 & i6) == 4793490 || !startRestartGroup.getSkipping()) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                horizontal2 = Arrangement.INSTANCE.getStart();
                            }
                            Arrangement.Vertical top = i8 != 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                            int i16 = i9 != 0 ? Integer.MAX_VALUE : i10;
                            int i17 = i11 == 0 ? i3 : Integer.MAX_VALUE;
                            clip = i12 != 0 ? ContextualFlowRowOverflow.INSTANCE.getClip() : contextualFlowRowOverflow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-341770689, i6, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:73)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235053714, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                            int i18 = 3670016 & i6;
                            z = i18 == 1048576;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout_release();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235057394, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                            z2 = i18 == 1048576;
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                                obj = rememberedValue2;
                            }
                            ArrayList arrayList = new ArrayList();
                            clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i19 = i6 >> 6;
                            Arrangement.Vertical vertical4 = top;
                            SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualRowMeasurementHelper(horizontal2, top, i16, i17, flowLayoutOverflowState, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(-8464804, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer2, Integer num2) {
                                    invoke(num.intValue(), flowLineInfo, composer2, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(int i20, FlowLineInfo flowLineInfo, Composer composer2, int i21) {
                                    ComposerKt.sourceInformation(composer2, "C97@4208L14:ContextualFlowLayout.kt#2w3rfo");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-8464804, i21, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:91)");
                                    }
                                    function4.invoke(new ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxMainAxisSize(), flowLineInfo.getMaxCrossAxisSize(), null), Integer.valueOf(i20), composer2, Integer.valueOf((i21 << 3) & 112));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i19 & 7168) | (i19 & 14) | 12582912 | (i19 & 112) | (i19 & 896) | ((i6 << 15) & 458752)), startRestartGroup, (i6 >> 3) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            horizontal3 = horizontal2;
                            contextualFlowRowOverflow2 = clip;
                            i13 = i17;
                            modifier3 = modifier2;
                            i14 = i16;
                            vertical3 = vertical4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i13 = i3;
                            modifier3 = modifier2;
                            horizontal3 = horizontal2;
                            vertical3 = vertical2;
                            i14 = i10;
                            contextualFlowRowOverflow2 = contextualFlowRowOverflow;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$1
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

                                public final void invoke(Composer composer2, int i20) {
                                    ContextualFlowLayoutKt.ContextualFlowRow(i, modifier3, horizontal3, vertical3, i14, i13, contextualFlowRowOverflow2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i2;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    if ((i5 & 128) != 0) {
                    }
                    if ((4793491 & i6) == 4793490) {
                    }
                    if (i15 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235053714, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                    int i182 = 3670016 & i6;
                    if (i182 == 1048576) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = clip.createOverflowState$foundation_layout_release();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    FlowLayoutOverflowState flowLayoutOverflowState2 = (FlowLayoutOverflowState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235057394, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                    if (i182 == 1048576) {
                    }
                    Object rememberedValue22 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2, arrayList2);
                    startRestartGroup.updateRememberedValue(arrayList2);
                    obj = arrayList2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i192 = i6 >> 6;
                    Arrangement.Vertical vertical42 = top;
                    SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualRowMeasurementHelper(horizontal2, top, i16, i17, flowLayoutOverflowState2, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(-8464804, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer2, Integer num2) {
                            invoke(num.intValue(), flowLineInfo, composer2, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i20, FlowLineInfo flowLineInfo, Composer composer2, int i21) {
                            ComposerKt.sourceInformation(composer2, "C97@4208L14:ContextualFlowLayout.kt#2w3rfo");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-8464804, i21, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:91)");
                            }
                            function4.invoke(new ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxMainAxisSize(), flowLineInfo.getMaxCrossAxisSize(), null), Integer.valueOf(i20), composer2, Integer.valueOf((i21 << 3) & 112));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i192 & 7168) | (i192 & 14) | 12582912 | (i192 & 112) | (i192 & 896) | ((i6 << 15) & 458752)), startRestartGroup, (i6 >> 3) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    horizontal3 = horizontal2;
                    contextualFlowRowOverflow2 = clip;
                    i13 = i17;
                    modifier3 = modifier2;
                    i14 = i16;
                    vertical3 = vertical42;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                vertical2 = vertical;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i2;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                if ((i5 & 128) != 0) {
                }
                if ((4793491 & i6) == 4793490) {
                }
                if (i15 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 == 0) {
                }
                if (i12 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235053714, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                int i1822 = 3670016 & i6;
                if (i1822 == 1048576) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = clip.createOverflowState$foundation_layout_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
                FlowLayoutOverflowState flowLayoutOverflowState22 = (FlowLayoutOverflowState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235057394, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                if (i1822 == 1048576) {
                }
                Object rememberedValue222 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                ArrayList arrayList22 = new ArrayList();
                clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState22, arrayList22);
                startRestartGroup.updateRememberedValue(arrayList22);
                obj = arrayList22;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i1922 = i6 >> 6;
                Arrangement.Vertical vertical422 = top;
                SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualRowMeasurementHelper(horizontal2, top, i16, i17, flowLayoutOverflowState22, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(-8464804, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer2, Integer num2) {
                        invoke(num.intValue(), flowLineInfo, composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i20, FlowLineInfo flowLineInfo, Composer composer2, int i21) {
                        ComposerKt.sourceInformation(composer2, "C97@4208L14:ContextualFlowLayout.kt#2w3rfo");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8464804, i21, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:91)");
                        }
                        function4.invoke(new ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxMainAxisSize(), flowLineInfo.getMaxCrossAxisSize(), null), Integer.valueOf(i20), composer2, Integer.valueOf((i21 << 3) & 112));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, (i1922 & 7168) | (i1922 & 14) | 12582912 | (i1922 & 112) | (i1922 & 896) | ((i6 << 15) & 458752)), startRestartGroup, (i6 >> 3) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                horizontal3 = horizontal2;
                contextualFlowRowOverflow2 = clip;
                i13 = i17;
                modifier3 = modifier2;
                i14 = i16;
                vertical3 = vertical422;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            horizontal2 = horizontal;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            vertical2 = vertical;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i2;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            if ((i5 & 128) != 0) {
            }
            if ((4793491 & i6) == 4793490) {
            }
            if (i15 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 == 0) {
            }
            if (i12 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235053714, "CC(remember):ContextualFlowLayout.kt#9igjgp");
            int i18222 = 3670016 & i6;
            if (i18222 == 1048576) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = clip.createOverflowState$foundation_layout_release();
            startRestartGroup.updateRememberedValue(rememberedValue);
            FlowLayoutOverflowState flowLayoutOverflowState222 = (FlowLayoutOverflowState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235057394, "CC(remember):ContextualFlowLayout.kt#9igjgp");
            if (i18222 == 1048576) {
            }
            Object rememberedValue2222 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            ArrayList arrayList222 = new ArrayList();
            clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState222, arrayList222);
            startRestartGroup.updateRememberedValue(arrayList222);
            obj = arrayList222;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i19222 = i6 >> 6;
            Arrangement.Vertical vertical4222 = top;
            SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualRowMeasurementHelper(horizontal2, top, i16, i17, flowLayoutOverflowState222, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(-8464804, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer2, Integer num2) {
                    invoke(num.intValue(), flowLineInfo, composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i20, FlowLineInfo flowLineInfo, Composer composer2, int i21) {
                    ComposerKt.sourceInformation(composer2, "C97@4208L14:ContextualFlowLayout.kt#2w3rfo");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8464804, i21, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:91)");
                    }
                    function4.invoke(new ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxMainAxisSize(), flowLineInfo.getMaxCrossAxisSize(), null), Integer.valueOf(i20), composer2, Integer.valueOf((i21 << 3) & 112));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, (i19222 & 7168) | (i19222 & 14) | 12582912 | (i19222 & 112) | (i19222 & 896) | ((i6 << 15) & 458752)), startRestartGroup, (i6 >> 3) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            horizontal3 = horizontal2;
            contextualFlowRowOverflow2 = clip;
            i13 = i17;
            modifier3 = modifier2;
            i14 = i16;
            vertical3 = vertical4222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        horizontal2 = horizontal;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        vertical2 = vertical;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i2;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        if ((i5 & 128) != 0) {
        }
        if ((4793491 & i6) == 4793490) {
        }
        if (i15 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 == 0) {
        }
        if (i12 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235053714, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        int i182222 = 3670016 & i6;
        if (i182222 == 1048576) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = clip.createOverflowState$foundation_layout_release();
        startRestartGroup.updateRememberedValue(rememberedValue);
        FlowLayoutOverflowState flowLayoutOverflowState2222 = (FlowLayoutOverflowState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235057394, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        if (i182222 == 1048576) {
        }
        Object rememberedValue22222 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        ArrayList arrayList2222 = new ArrayList();
        clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2222, arrayList2222);
        startRestartGroup.updateRememberedValue(arrayList2222);
        obj = arrayList2222;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i192222 = i6 >> 6;
        Arrangement.Vertical vertical42222 = top;
        SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualRowMeasurementHelper(horizontal2, top, i16, i17, flowLayoutOverflowState2222, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(-8464804, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer2, Integer num2) {
                invoke(num.intValue(), flowLineInfo, composer2, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i20, FlowLineInfo flowLineInfo, Composer composer2, int i21) {
                ComposerKt.sourceInformation(composer2, "C97@4208L14:ContextualFlowLayout.kt#2w3rfo");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8464804, i21, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:91)");
                }
                function4.invoke(new ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxMainAxisSize(), flowLineInfo.getMaxCrossAxisSize(), null), Integer.valueOf(i20), composer2, Integer.valueOf((i21 << 3) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, (i192222 & 7168) | (i192222 & 14) | 12582912 | (i192222 & 112) | (i192222 & 896) | ((i6 << 15) & 458752)), startRestartGroup, (i6 >> 3) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        horizontal3 = horizontal2;
        contextualFlowRowOverflow2 = clip;
        i13 = i17;
        modifier3 = modifier2;
        i14 = i16;
        vertical3 = vertical42222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x019c, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextualFlowColumn(final int i, Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i2, int i3, ContextualFlowColumnOverflow contextualFlowColumnOverflow, final Function4<? super ContextualFlowColumnScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        Arrangement.Vertical vertical2;
        int i8;
        Arrangement.Horizontal horizontal2;
        int i9;
        int i10;
        int i11;
        int i12;
        ContextualFlowColumnOverflow clip;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object obj;
        final Arrangement.Vertical vertical3;
        final ContextualFlowColumnOverflow contextualFlowColumnOverflow2;
        final int i13;
        final Modifier modifier3;
        final int i14;
        final Arrangement.Horizontal horizontal3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-588476895);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContextualFlowColumn)P(2,5,7,1,3,4,6)149@6671L65,152@6782L193,165@7201L270,157@7000L471,175@7477L90:ContextualFlowLayout.kt#2w3rfo");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (startRestartGroup.changed(i) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                vertical2 = vertical;
                i6 |= startRestartGroup.changed(vertical2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    horizontal2 = horizontal;
                    i6 |= startRestartGroup.changed(horizontal2) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i10 = i2;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 131072 : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(contextualFlowColumnOverflow) ? 1048576 : 524288;
                        }
                        if ((i5 & 128) != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i6 |= startRestartGroup.changedInstance(function4) ? 8388608 : 4194304;
                        }
                        if ((4793491 & i6) == 4793490 || !startRestartGroup.getSkipping()) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                vertical2 = Arrangement.INSTANCE.getTop();
                            }
                            Arrangement.Horizontal start = i8 != 0 ? Arrangement.INSTANCE.getStart() : horizontal2;
                            int i16 = i9 != 0 ? Integer.MAX_VALUE : i10;
                            int i17 = i11 == 0 ? i3 : Integer.MAX_VALUE;
                            clip = i12 != 0 ? ContextualFlowColumnOverflow.INSTANCE.getClip() : contextualFlowColumnOverflow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-588476895, i6, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:148)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055927072, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                            int i18 = 3670016 & i6;
                            z = i18 == 1048576;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout_release();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055923392, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                            z2 = i18 == 1048576;
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                                obj = rememberedValue2;
                            }
                            ArrayList arrayList = new ArrayList();
                            clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i19 = i6 >> 6;
                            Arrangement.Horizontal horizontal4 = start;
                            SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualColumnMeasureHelper(vertical2, start, i16, i17, flowLayoutOverflowState, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(302435318, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer2, Integer num2) {
                                    invoke(num.intValue(), flowLineInfo, composer2, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(int i20, FlowLineInfo flowLineInfo, Composer composer2, int i21) {
                                    ComposerKt.sourceInformation(composer2, "C172@7451L14:ContextualFlowLayout.kt#2w3rfo");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(302435318, i21, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:166)");
                                    }
                                    function4.invoke(new ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxCrossAxisSize(), flowLineInfo.getMaxMainAxisSize(), null), Integer.valueOf(i20), composer2, Integer.valueOf((i21 << 3) & 112));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i19 & 7168) | (i19 & 14) | 12582912 | (i19 & 112) | (i19 & 896) | ((i6 << 15) & 458752)), startRestartGroup, (i6 >> 3) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            vertical3 = vertical2;
                            contextualFlowColumnOverflow2 = clip;
                            i13 = i17;
                            modifier3 = modifier2;
                            i14 = i16;
                            horizontal3 = horizontal4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i13 = i3;
                            modifier3 = modifier2;
                            vertical3 = vertical2;
                            horizontal3 = horizontal2;
                            i14 = i10;
                            contextualFlowColumnOverflow2 = contextualFlowColumnOverflow;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$1
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

                                public final void invoke(Composer composer2, int i20) {
                                    ContextualFlowLayoutKt.ContextualFlowColumn(i, modifier3, vertical3, horizontal3, i14, i13, contextualFlowColumnOverflow2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i2;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    if ((i5 & 128) != 0) {
                    }
                    if ((4793491 & i6) == 4793490) {
                    }
                    if (i15 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055927072, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                    int i182 = 3670016 & i6;
                    if (i182 == 1048576) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = clip.createOverflowState$foundation_layout_release();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    FlowLayoutOverflowState flowLayoutOverflowState2 = (FlowLayoutOverflowState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055923392, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                    if (i182 == 1048576) {
                    }
                    Object rememberedValue22 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2, arrayList2);
                    startRestartGroup.updateRememberedValue(arrayList2);
                    obj = arrayList2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i192 = i6 >> 6;
                    Arrangement.Horizontal horizontal42 = start;
                    SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualColumnMeasureHelper(vertical2, start, i16, i17, flowLayoutOverflowState2, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(302435318, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer2, Integer num2) {
                            invoke(num.intValue(), flowLineInfo, composer2, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i20, FlowLineInfo flowLineInfo, Composer composer2, int i21) {
                            ComposerKt.sourceInformation(composer2, "C172@7451L14:ContextualFlowLayout.kt#2w3rfo");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(302435318, i21, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:166)");
                            }
                            function4.invoke(new ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxCrossAxisSize(), flowLineInfo.getMaxMainAxisSize(), null), Integer.valueOf(i20), composer2, Integer.valueOf((i21 << 3) & 112));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i192 & 7168) | (i192 & 14) | 12582912 | (i192 & 112) | (i192 & 896) | ((i6 << 15) & 458752)), startRestartGroup, (i6 >> 3) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    vertical3 = vertical2;
                    contextualFlowColumnOverflow2 = clip;
                    i13 = i17;
                    modifier3 = modifier2;
                    i14 = i16;
                    horizontal3 = horizontal42;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                horizontal2 = horizontal;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i2;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                if ((i5 & 128) != 0) {
                }
                if ((4793491 & i6) == 4793490) {
                }
                if (i15 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 == 0) {
                }
                if (i12 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055927072, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                int i1822 = 3670016 & i6;
                if (i1822 == 1048576) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = clip.createOverflowState$foundation_layout_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
                FlowLayoutOverflowState flowLayoutOverflowState22 = (FlowLayoutOverflowState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055923392, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                if (i1822 == 1048576) {
                }
                Object rememberedValue222 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                ArrayList arrayList22 = new ArrayList();
                clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState22, arrayList22);
                startRestartGroup.updateRememberedValue(arrayList22);
                obj = arrayList22;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i1922 = i6 >> 6;
                Arrangement.Horizontal horizontal422 = start;
                SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualColumnMeasureHelper(vertical2, start, i16, i17, flowLayoutOverflowState22, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(302435318, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer2, Integer num2) {
                        invoke(num.intValue(), flowLineInfo, composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i20, FlowLineInfo flowLineInfo, Composer composer2, int i21) {
                        ComposerKt.sourceInformation(composer2, "C172@7451L14:ContextualFlowLayout.kt#2w3rfo");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(302435318, i21, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:166)");
                        }
                        function4.invoke(new ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxCrossAxisSize(), flowLineInfo.getMaxMainAxisSize(), null), Integer.valueOf(i20), composer2, Integer.valueOf((i21 << 3) & 112));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, (i1922 & 7168) | (i1922 & 14) | 12582912 | (i1922 & 112) | (i1922 & 896) | ((i6 << 15) & 458752)), startRestartGroup, (i6 >> 3) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                vertical3 = vertical2;
                contextualFlowColumnOverflow2 = clip;
                i13 = i17;
                modifier3 = modifier2;
                i14 = i16;
                horizontal3 = horizontal422;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            vertical2 = vertical;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            horizontal2 = horizontal;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i2;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            if ((i5 & 128) != 0) {
            }
            if ((4793491 & i6) == 4793490) {
            }
            if (i15 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 == 0) {
            }
            if (i12 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055927072, "CC(remember):ContextualFlowLayout.kt#9igjgp");
            int i18222 = 3670016 & i6;
            if (i18222 == 1048576) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = clip.createOverflowState$foundation_layout_release();
            startRestartGroup.updateRememberedValue(rememberedValue);
            FlowLayoutOverflowState flowLayoutOverflowState222 = (FlowLayoutOverflowState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055923392, "CC(remember):ContextualFlowLayout.kt#9igjgp");
            if (i18222 == 1048576) {
            }
            Object rememberedValue2222 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            ArrayList arrayList222 = new ArrayList();
            clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState222, arrayList222);
            startRestartGroup.updateRememberedValue(arrayList222);
            obj = arrayList222;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i19222 = i6 >> 6;
            Arrangement.Horizontal horizontal4222 = start;
            SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualColumnMeasureHelper(vertical2, start, i16, i17, flowLayoutOverflowState222, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(302435318, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer2, Integer num2) {
                    invoke(num.intValue(), flowLineInfo, composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i20, FlowLineInfo flowLineInfo, Composer composer2, int i21) {
                    ComposerKt.sourceInformation(composer2, "C172@7451L14:ContextualFlowLayout.kt#2w3rfo");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(302435318, i21, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:166)");
                    }
                    function4.invoke(new ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxCrossAxisSize(), flowLineInfo.getMaxMainAxisSize(), null), Integer.valueOf(i20), composer2, Integer.valueOf((i21 << 3) & 112));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, (i19222 & 7168) | (i19222 & 14) | 12582912 | (i19222 & 112) | (i19222 & 896) | ((i6 << 15) & 458752)), startRestartGroup, (i6 >> 3) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            vertical3 = vertical2;
            contextualFlowColumnOverflow2 = clip;
            i13 = i17;
            modifier3 = modifier2;
            i14 = i16;
            horizontal3 = horizontal4222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        vertical2 = vertical;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        horizontal2 = horizontal;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i2;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        if ((i5 & 128) != 0) {
        }
        if ((4793491 & i6) == 4793490) {
        }
        if (i15 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 == 0) {
        }
        if (i12 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055927072, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        int i182222 = 3670016 & i6;
        if (i182222 == 1048576) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = clip.createOverflowState$foundation_layout_release();
        startRestartGroup.updateRememberedValue(rememberedValue);
        FlowLayoutOverflowState flowLayoutOverflowState2222 = (FlowLayoutOverflowState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055923392, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        if (i182222 == 1048576) {
        }
        Object rememberedValue22222 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        ArrayList arrayList2222 = new ArrayList();
        clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2222, arrayList2222);
        startRestartGroup.updateRememberedValue(arrayList2222);
        obj = arrayList2222;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i192222 = i6 >> 6;
        Arrangement.Horizontal horizontal42222 = start;
        SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualColumnMeasureHelper(vertical2, start, i16, i17, flowLayoutOverflowState2222, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(302435318, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer2, Integer num2) {
                invoke(num.intValue(), flowLineInfo, composer2, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i20, FlowLineInfo flowLineInfo, Composer composer2, int i21) {
                ComposerKt.sourceInformation(composer2, "C172@7451L14:ContextualFlowLayout.kt#2w3rfo");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(302435318, i21, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:166)");
                }
                function4.invoke(new ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxCrossAxisSize(), flowLineInfo.getMaxMainAxisSize(), null), Integer.valueOf(i20), composer2, Integer.valueOf((i21 << 3) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, (i192222 & 7168) | (i192222 & 14) | 12582912 | (i192222 & 112) | (i192222 & 896) | ((i6 << 15) & 458752)), startRestartGroup, (i6 >> 3) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        vertical3 = vertical2;
        contextualFlowColumnOverflow2 = clip;
        i13 = i17;
        modifier3 = modifier2;
        i14 = i16;
        horizontal3 = horizontal42222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r28.changed(r20) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> contextualRowMeasurementHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, int i3, List<? extends Function2<? super Composer, ? super Integer, Unit>> list, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i4) {
        boolean z;
        boolean changed;
        Object rememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, -43351224, "C(contextualRowMeasurementHelper)P(1,7,3,4,6,2,5)343@13891L847:ContextualFlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43351224, i4, -1, "androidx.compose.foundation.layout.contextualRowMeasurementHelper (ContextualFlowLayout.kt:342)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1138967354, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        if (((i4 & 14) ^ 6) <= 4) {
        }
        if ((i4 & 6) != 4) {
            z = false;
            changed = z | ((((i4 & 112) ^ 48) <= 32 && composer.changed(vertical)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) <= 256 && composer.changed(i)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) <= 2048 && composer.changed(i2)) || (i4 & 3072) == 2048) | composer.changed(flowLayoutOverflowState) | ((((458752 & i4) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(i3)) || (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((29360128 & i4) ^ 12582912) > 8388608 && composer.changed(function4)) || (i4 & 12582912) == 8388608);
            rememberedValue = composer.rememberedValue();
            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FlowMeasureLazyPolicy(true, horizontal, vertical, horizontal.getSpacing(), FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_TOP(), vertical.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getMeasurePolicy();
                composer.updateRememberedValue(rememberedValue);
            }
            Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function2 = (Function2) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return function2;
        }
        z = true;
        if (((29360128 & i4) ^ 12582912) > 8388608) {
            changed = z | ((((i4 & 112) ^ 48) <= 32 && composer.changed(vertical)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) <= 256 && composer.changed(i)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) <= 2048 && composer.changed(i2)) || (i4 & 3072) == 2048) | composer.changed(flowLayoutOverflowState) | ((((458752 & i4) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(i3)) || (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((29360128 & i4) ^ 12582912) > 8388608 && composer.changed(function4)) || (i4 & 12582912) == 8388608);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new FlowMeasureLazyPolicy(true, horizontal, vertical, horizontal.getSpacing(), FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_TOP(), vertical.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getMeasurePolicy();
            composer.updateRememberedValue(rememberedValue);
            Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function22 = (Function2) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return function22;
        }
        changed = z | ((((i4 & 112) ^ 48) <= 32 && composer.changed(vertical)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) <= 256 && composer.changed(i)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) <= 2048 && composer.changed(i2)) || (i4 & 3072) == 2048) | composer.changed(flowLayoutOverflowState) | ((((458752 & i4) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(i3)) || (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((29360128 & i4) ^ 12582912) > 8388608 && composer.changed(function4)) || (i4 & 12582912) == 8388608);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new FlowMeasureLazyPolicy(true, horizontal, vertical, horizontal.getSpacing(), FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_TOP(), vertical.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getMeasurePolicy();
        composer.updateRememberedValue(rememberedValue);
        Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function222 = (Function2) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function222;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r28.changed(r20) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> contextualColumnMeasureHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, int i3, List<? extends Function2<? super Composer, ? super Integer, Unit>> list, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i4) {
        boolean z;
        boolean changed;
        Object rememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, 1009762916, "C(contextualColumnMeasureHelper)P(7,1,3,4,6,2,5)383@15228L850:ContextualFlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009762916, i4, -1, "androidx.compose.foundation.layout.contextualColumnMeasureHelper (ContextualFlowLayout.kt:382)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1978242771, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        if (((i4 & 14) ^ 6) <= 4) {
        }
        if ((i4 & 6) != 4) {
            z = false;
            changed = z | ((((i4 & 112) ^ 48) <= 32 && composer.changed(horizontal)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) <= 256 && composer.changed(i)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) <= 2048 && composer.changed(i2)) || (i4 & 3072) == 2048) | composer.changed(flowLayoutOverflowState) | ((((458752 & i4) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(i3)) || (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((29360128 & i4) ^ 12582912) > 8388608 && composer.changed(function4)) || (i4 & 12582912) == 8388608);
            rememberedValue = composer.rememberedValue();
            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FlowMeasureLazyPolicy(false, horizontal, vertical, vertical.getSpacing(), FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_START(), horizontal.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getMeasurePolicy();
                composer.updateRememberedValue(rememberedValue);
            }
            Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function2 = (Function2) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return function2;
        }
        z = true;
        if (((29360128 & i4) ^ 12582912) > 8388608) {
            changed = z | ((((i4 & 112) ^ 48) <= 32 && composer.changed(horizontal)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) <= 256 && composer.changed(i)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) <= 2048 && composer.changed(i2)) || (i4 & 3072) == 2048) | composer.changed(flowLayoutOverflowState) | ((((458752 & i4) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(i3)) || (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((29360128 & i4) ^ 12582912) > 8388608 && composer.changed(function4)) || (i4 & 12582912) == 8388608);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new FlowMeasureLazyPolicy(false, horizontal, vertical, vertical.getSpacing(), FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_START(), horizontal.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getMeasurePolicy();
            composer.updateRememberedValue(rememberedValue);
            Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function22 = (Function2) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return function22;
        }
        changed = z | ((((i4 & 112) ^ 48) <= 32 && composer.changed(horizontal)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) <= 256 && composer.changed(i)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) <= 2048 && composer.changed(i2)) || (i4 & 3072) == 2048) | composer.changed(flowLayoutOverflowState) | ((((458752 & i4) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(i3)) || (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((29360128 & i4) ^ 12582912) > 8388608 && composer.changed(function4)) || (i4 & 12582912) == 8388608);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new FlowMeasureLazyPolicy(false, horizontal, vertical, vertical.getSpacing(), FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_START(), horizontal.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getMeasurePolicy();
        composer.updateRememberedValue(rememberedValue);
        Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function222 = (Function2) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function222;
    }
}
