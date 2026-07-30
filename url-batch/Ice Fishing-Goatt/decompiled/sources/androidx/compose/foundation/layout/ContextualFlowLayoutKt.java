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
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019c, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ad  */
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
        int i13;
        ContextualFlowRowOverflow clip;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object obj;
        Composer composer2;
        final ContextualFlowRowOverflow contextualFlowRowOverflow2;
        final Arrangement.Horizontal horizontal3;
        final int i14;
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
                            if (i8 != 0) {
                                vertical2 = Arrangement.INSTANCE.getTop();
                            }
                            i13 = i9 != 0 ? Integer.MAX_VALUE : i10;
                            int i16 = i11 != 0 ? Integer.MAX_VALUE : i3;
                            clip = i12 != 0 ? ContextualFlowRowOverflow.INSTANCE.getClip() : contextualFlowRowOverflow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-341770689, i6, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:73)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235053714, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                            int i17 = 3670016 & i6;
                            z = i17 == 1048576;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout_release();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235057394, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                            z2 = i17 == 1048576;
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                                obj = rememberedValue2;
                            }
                            ArrayList arrayList = new ArrayList();
                            clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i18 = i6 >> 6;
                            Arrangement.Horizontal horizontal4 = horizontal2;
                            composer2 = startRestartGroup;
                            SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualRowMeasurementHelper(horizontal4, vertical2, i13, i16, flowLayoutOverflowState, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(-8464804, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer3, Integer num2) {
                                    invoke(num.intValue(), flowLineInfo, composer3, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(int i19, FlowLineInfo flowLineInfo, Composer composer3, int i20) {
                                    ComposerKt.sourceInformation(composer3, "C97@4208L14:ContextualFlowLayout.kt#2w3rfo");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-8464804, i20, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:91)");
                                    }
                                    function4.invoke(new ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxMainAxisSize(), flowLineInfo.getMaxCrossAxisSize(), null), Integer.valueOf(i19), composer3, Integer.valueOf((i20 << 3) & 112));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i18 & 7168) | (i18 & 14) | 12582912 | (i18 & 112) | (i18 & 896) | ((i6 << 15) & 458752)), composer2, (i6 >> 3) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            contextualFlowRowOverflow2 = clip;
                            horizontal3 = horizontal4;
                            i14 = i16;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i14 = i3;
                            composer2 = startRestartGroup;
                            horizontal3 = horizontal2;
                            i13 = i10;
                            contextualFlowRowOverflow2 = contextualFlowRowOverflow;
                        }
                        final Arrangement.Vertical vertical3 = vertical2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final int i19 = i13;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$1
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

                                public final void invoke(Composer composer3, int i20) {
                                    ContextualFlowLayoutKt.ContextualFlowRow(i, modifier3, horizontal3, vertical3, i19, i14, contextualFlowRowOverflow2, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
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
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235053714, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                    int i172 = 3670016 & i6;
                    if (i172 == 1048576) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = clip.createOverflowState$foundation_layout_release();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    FlowLayoutOverflowState flowLayoutOverflowState2 = (FlowLayoutOverflowState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235057394, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                    if (i172 == 1048576) {
                    }
                    Object rememberedValue22 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2, arrayList2);
                    startRestartGroup.updateRememberedValue(arrayList2);
                    obj = arrayList2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i182 = i6 >> 6;
                    Arrangement.Horizontal horizontal42 = horizontal2;
                    composer2 = startRestartGroup;
                    SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualRowMeasurementHelper(horizontal42, vertical2, i13, i16, flowLayoutOverflowState2, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(-8464804, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer3, Integer num2) {
                            invoke(num.intValue(), flowLineInfo, composer3, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i192, FlowLineInfo flowLineInfo, Composer composer3, int i20) {
                            ComposerKt.sourceInformation(composer3, "C97@4208L14:ContextualFlowLayout.kt#2w3rfo");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-8464804, i20, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:91)");
                            }
                            function4.invoke(new ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxMainAxisSize(), flowLineInfo.getMaxCrossAxisSize(), null), Integer.valueOf(i192), composer3, Integer.valueOf((i20 << 3) & 112));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i182 & 7168) | (i182 & 14) | 12582912 | (i182 & 112) | (i182 & 896) | ((i6 << 15) & 458752)), composer2, (i6 >> 3) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    contextualFlowRowOverflow2 = clip;
                    horizontal3 = horizontal42;
                    i14 = i16;
                    final Arrangement.Vertical vertical32 = vertical2;
                    endRestartGroup = composer2.endRestartGroup();
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
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235053714, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                int i1722 = 3670016 & i6;
                if (i1722 == 1048576) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = clip.createOverflowState$foundation_layout_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
                FlowLayoutOverflowState flowLayoutOverflowState22 = (FlowLayoutOverflowState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235057394, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                if (i1722 == 1048576) {
                }
                Object rememberedValue222 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                ArrayList arrayList22 = new ArrayList();
                clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState22, arrayList22);
                startRestartGroup.updateRememberedValue(arrayList22);
                obj = arrayList22;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i1822 = i6 >> 6;
                Arrangement.Horizontal horizontal422 = horizontal2;
                composer2 = startRestartGroup;
                SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualRowMeasurementHelper(horizontal422, vertical2, i13, i16, flowLayoutOverflowState22, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(-8464804, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer3, Integer num2) {
                        invoke(num.intValue(), flowLineInfo, composer3, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i192, FlowLineInfo flowLineInfo, Composer composer3, int i20) {
                        ComposerKt.sourceInformation(composer3, "C97@4208L14:ContextualFlowLayout.kt#2w3rfo");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8464804, i20, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:91)");
                        }
                        function4.invoke(new ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxMainAxisSize(), flowLineInfo.getMaxCrossAxisSize(), null), Integer.valueOf(i192), composer3, Integer.valueOf((i20 << 3) & 112));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, (i1822 & 7168) | (i1822 & 14) | 12582912 | (i1822 & 112) | (i1822 & 896) | ((i6 << 15) & 458752)), composer2, (i6 >> 3) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                contextualFlowRowOverflow2 = clip;
                horizontal3 = horizontal422;
                i14 = i16;
                final Arrangement.Vertical vertical322 = vertical2;
                endRestartGroup = composer2.endRestartGroup();
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
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235053714, "CC(remember):ContextualFlowLayout.kt#9igjgp");
            int i17222 = 3670016 & i6;
            if (i17222 == 1048576) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = clip.createOverflowState$foundation_layout_release();
            startRestartGroup.updateRememberedValue(rememberedValue);
            FlowLayoutOverflowState flowLayoutOverflowState222 = (FlowLayoutOverflowState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235057394, "CC(remember):ContextualFlowLayout.kt#9igjgp");
            if (i17222 == 1048576) {
            }
            Object rememberedValue2222 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            ArrayList arrayList222 = new ArrayList();
            clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState222, arrayList222);
            startRestartGroup.updateRememberedValue(arrayList222);
            obj = arrayList222;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i18222 = i6 >> 6;
            Arrangement.Horizontal horizontal4222 = horizontal2;
            composer2 = startRestartGroup;
            SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualRowMeasurementHelper(horizontal4222, vertical2, i13, i16, flowLayoutOverflowState222, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(-8464804, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer3, Integer num2) {
                    invoke(num.intValue(), flowLineInfo, composer3, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i192, FlowLineInfo flowLineInfo, Composer composer3, int i20) {
                    ComposerKt.sourceInformation(composer3, "C97@4208L14:ContextualFlowLayout.kt#2w3rfo");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8464804, i20, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:91)");
                    }
                    function4.invoke(new ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxMainAxisSize(), flowLineInfo.getMaxCrossAxisSize(), null), Integer.valueOf(i192), composer3, Integer.valueOf((i20 << 3) & 112));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, (i18222 & 7168) | (i18222 & 14) | 12582912 | (i18222 & 112) | (i18222 & 896) | ((i6 << 15) & 458752)), composer2, (i6 >> 3) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            contextualFlowRowOverflow2 = clip;
            horizontal3 = horizontal4222;
            i14 = i16;
            final Arrangement.Vertical vertical3222 = vertical2;
            endRestartGroup = composer2.endRestartGroup();
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
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235053714, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        int i172222 = 3670016 & i6;
        if (i172222 == 1048576) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = clip.createOverflowState$foundation_layout_release();
        startRestartGroup.updateRememberedValue(rememberedValue);
        FlowLayoutOverflowState flowLayoutOverflowState2222 = (FlowLayoutOverflowState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1235057394, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        if (i172222 == 1048576) {
        }
        Object rememberedValue22222 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        ArrayList arrayList2222 = new ArrayList();
        clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2222, arrayList2222);
        startRestartGroup.updateRememberedValue(arrayList2222);
        obj = arrayList2222;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i182222 = i6 >> 6;
        Arrangement.Horizontal horizontal42222 = horizontal2;
        composer2 = startRestartGroup;
        SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualRowMeasurementHelper(horizontal42222, vertical2, i13, i16, flowLayoutOverflowState2222, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(-8464804, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer3, Integer num2) {
                invoke(num.intValue(), flowLineInfo, composer3, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i192, FlowLineInfo flowLineInfo, Composer composer3, int i20) {
                ComposerKt.sourceInformation(composer3, "C97@4208L14:ContextualFlowLayout.kt#2w3rfo");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8464804, i20, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:91)");
                }
                function4.invoke(new ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxMainAxisSize(), flowLineInfo.getMaxCrossAxisSize(), null), Integer.valueOf(i192), composer3, Integer.valueOf((i20 << 3) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, (i182222 & 7168) | (i182222 & 14) | 12582912 | (i182222 & 112) | (i182222 & 896) | ((i6 << 15) & 458752)), composer2, (i6 >> 3) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        contextualFlowRowOverflow2 = clip;
        horizontal3 = horizontal42222;
        i14 = i16;
        final Arrangement.Vertical vertical32222 = vertical2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x019c, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ad  */
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
        int i13;
        ContextualFlowColumnOverflow clip;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object obj;
        Composer composer2;
        final ContextualFlowColumnOverflow contextualFlowColumnOverflow2;
        final Arrangement.Vertical vertical3;
        final int i14;
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
                            if (i8 != 0) {
                                horizontal2 = Arrangement.INSTANCE.getStart();
                            }
                            i13 = i9 != 0 ? Integer.MAX_VALUE : i10;
                            int i16 = i11 != 0 ? Integer.MAX_VALUE : i3;
                            clip = i12 != 0 ? ContextualFlowColumnOverflow.INSTANCE.getClip() : contextualFlowColumnOverflow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-588476895, i6, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:148)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055927072, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                            int i17 = 3670016 & i6;
                            z = i17 == 1048576;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout_release();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055923392, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                            z2 = i17 == 1048576;
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                                obj = rememberedValue2;
                            }
                            ArrayList arrayList = new ArrayList();
                            clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i18 = i6 >> 6;
                            Arrangement.Vertical vertical4 = vertical2;
                            composer2 = startRestartGroup;
                            SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualColumnMeasureHelper(vertical4, horizontal2, i13, i16, flowLayoutOverflowState, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(302435318, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer3, Integer num2) {
                                    invoke(num.intValue(), flowLineInfo, composer3, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(int i19, FlowLineInfo flowLineInfo, Composer composer3, int i20) {
                                    ComposerKt.sourceInformation(composer3, "C172@7451L14:ContextualFlowLayout.kt#2w3rfo");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(302435318, i20, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:166)");
                                    }
                                    function4.invoke(new ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxCrossAxisSize(), flowLineInfo.getMaxMainAxisSize(), null), Integer.valueOf(i19), composer3, Integer.valueOf((i20 << 3) & 112));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i18 & 7168) | (i18 & 14) | 12582912 | (i18 & 112) | (i18 & 896) | ((i6 << 15) & 458752)), composer2, (i6 >> 3) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            contextualFlowColumnOverflow2 = clip;
                            vertical3 = vertical4;
                            i14 = i16;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i14 = i3;
                            composer2 = startRestartGroup;
                            vertical3 = vertical2;
                            i13 = i10;
                            contextualFlowColumnOverflow2 = contextualFlowColumnOverflow;
                        }
                        final Arrangement.Horizontal horizontal3 = horizontal2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final int i19 = i13;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$1
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

                                public final void invoke(Composer composer3, int i20) {
                                    ContextualFlowLayoutKt.ContextualFlowColumn(i, modifier3, vertical3, horizontal3, i19, i14, contextualFlowColumnOverflow2, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
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
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055927072, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                    int i172 = 3670016 & i6;
                    if (i172 == 1048576) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = clip.createOverflowState$foundation_layout_release();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    FlowLayoutOverflowState flowLayoutOverflowState2 = (FlowLayoutOverflowState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055923392, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                    if (i172 == 1048576) {
                    }
                    Object rememberedValue22 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2, arrayList2);
                    startRestartGroup.updateRememberedValue(arrayList2);
                    obj = arrayList2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i182 = i6 >> 6;
                    Arrangement.Vertical vertical42 = vertical2;
                    composer2 = startRestartGroup;
                    SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualColumnMeasureHelper(vertical42, horizontal2, i13, i16, flowLayoutOverflowState2, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(302435318, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer3, Integer num2) {
                            invoke(num.intValue(), flowLineInfo, composer3, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i192, FlowLineInfo flowLineInfo, Composer composer3, int i20) {
                            ComposerKt.sourceInformation(composer3, "C172@7451L14:ContextualFlowLayout.kt#2w3rfo");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(302435318, i20, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:166)");
                            }
                            function4.invoke(new ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxCrossAxisSize(), flowLineInfo.getMaxMainAxisSize(), null), Integer.valueOf(i192), composer3, Integer.valueOf((i20 << 3) & 112));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i182 & 7168) | (i182 & 14) | 12582912 | (i182 & 112) | (i182 & 896) | ((i6 << 15) & 458752)), composer2, (i6 >> 3) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    contextualFlowColumnOverflow2 = clip;
                    vertical3 = vertical42;
                    i14 = i16;
                    final Arrangement.Horizontal horizontal32 = horizontal2;
                    endRestartGroup = composer2.endRestartGroup();
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
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055927072, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                int i1722 = 3670016 & i6;
                if (i1722 == 1048576) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = clip.createOverflowState$foundation_layout_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
                FlowLayoutOverflowState flowLayoutOverflowState22 = (FlowLayoutOverflowState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055923392, "CC(remember):ContextualFlowLayout.kt#9igjgp");
                if (i1722 == 1048576) {
                }
                Object rememberedValue222 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                ArrayList arrayList22 = new ArrayList();
                clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState22, arrayList22);
                startRestartGroup.updateRememberedValue(arrayList22);
                obj = arrayList22;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i1822 = i6 >> 6;
                Arrangement.Vertical vertical422 = vertical2;
                composer2 = startRestartGroup;
                SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualColumnMeasureHelper(vertical422, horizontal2, i13, i16, flowLayoutOverflowState22, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(302435318, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer3, Integer num2) {
                        invoke(num.intValue(), flowLineInfo, composer3, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i192, FlowLineInfo flowLineInfo, Composer composer3, int i20) {
                        ComposerKt.sourceInformation(composer3, "C172@7451L14:ContextualFlowLayout.kt#2w3rfo");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(302435318, i20, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:166)");
                        }
                        function4.invoke(new ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxCrossAxisSize(), flowLineInfo.getMaxMainAxisSize(), null), Integer.valueOf(i192), composer3, Integer.valueOf((i20 << 3) & 112));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, (i1822 & 7168) | (i1822 & 14) | 12582912 | (i1822 & 112) | (i1822 & 896) | ((i6 << 15) & 458752)), composer2, (i6 >> 3) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                contextualFlowColumnOverflow2 = clip;
                vertical3 = vertical422;
                i14 = i16;
                final Arrangement.Horizontal horizontal322 = horizontal2;
                endRestartGroup = composer2.endRestartGroup();
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
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055927072, "CC(remember):ContextualFlowLayout.kt#9igjgp");
            int i17222 = 3670016 & i6;
            if (i17222 == 1048576) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = clip.createOverflowState$foundation_layout_release();
            startRestartGroup.updateRememberedValue(rememberedValue);
            FlowLayoutOverflowState flowLayoutOverflowState222 = (FlowLayoutOverflowState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055923392, "CC(remember):ContextualFlowLayout.kt#9igjgp");
            if (i17222 == 1048576) {
            }
            Object rememberedValue2222 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            ArrayList arrayList222 = new ArrayList();
            clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState222, arrayList222);
            startRestartGroup.updateRememberedValue(arrayList222);
            obj = arrayList222;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i18222 = i6 >> 6;
            Arrangement.Vertical vertical4222 = vertical2;
            composer2 = startRestartGroup;
            SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualColumnMeasureHelper(vertical4222, horizontal2, i13, i16, flowLayoutOverflowState222, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(302435318, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer3, Integer num2) {
                    invoke(num.intValue(), flowLineInfo, composer3, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i192, FlowLineInfo flowLineInfo, Composer composer3, int i20) {
                    ComposerKt.sourceInformation(composer3, "C172@7451L14:ContextualFlowLayout.kt#2w3rfo");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(302435318, i20, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:166)");
                    }
                    function4.invoke(new ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxCrossAxisSize(), flowLineInfo.getMaxMainAxisSize(), null), Integer.valueOf(i192), composer3, Integer.valueOf((i20 << 3) & 112));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, (i18222 & 7168) | (i18222 & 14) | 12582912 | (i18222 & 112) | (i18222 & 896) | ((i6 << 15) & 458752)), composer2, (i6 >> 3) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            contextualFlowColumnOverflow2 = clip;
            vertical3 = vertical4222;
            i14 = i16;
            final Arrangement.Horizontal horizontal3222 = horizontal2;
            endRestartGroup = composer2.endRestartGroup();
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
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055927072, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        int i172222 = 3670016 & i6;
        if (i172222 == 1048576) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = clip.createOverflowState$foundation_layout_release();
        startRestartGroup.updateRememberedValue(rememberedValue);
        FlowLayoutOverflowState flowLayoutOverflowState2222 = (FlowLayoutOverflowState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1055923392, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        if (i172222 == 1048576) {
        }
        Object rememberedValue22222 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        ArrayList arrayList2222 = new ArrayList();
        clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2222, arrayList2222);
        startRestartGroup.updateRememberedValue(arrayList2222);
        obj = arrayList2222;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i182222 = i6 >> 6;
        Arrangement.Vertical vertical42222 = vertical2;
        composer2 = startRestartGroup;
        SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualColumnMeasureHelper(vertical42222, horizontal2, i13, i16, flowLayoutOverflowState2222, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(302435318, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer3, Integer num2) {
                invoke(num.intValue(), flowLineInfo, composer3, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i192, FlowLineInfo flowLineInfo, Composer composer3, int i20) {
                ComposerKt.sourceInformation(composer3, "C172@7451L14:ContextualFlowLayout.kt#2w3rfo");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(302435318, i20, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:166)");
                }
                function4.invoke(new ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxCrossAxisSize(), flowLineInfo.getMaxMainAxisSize(), null), Integer.valueOf(i192), composer3, Integer.valueOf((i20 << 3) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, (i182222 & 7168) | (i182222 & 14) | 12582912 | (i182222 & 112) | (i182222 & 896) | ((i6 << 15) & 458752)), composer2, (i6 >> 3) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        contextualFlowColumnOverflow2 = clip;
        vertical3 = vertical42222;
        i14 = i16;
        final Arrangement.Horizontal horizontal32222 = horizontal2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r28.changed(r27) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        r1 = r2 | r4;
        r2 = r28.rememberedValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r1 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (r2 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:
    
        r2 = (kotlin.jvm.functions.Function2) r2;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        androidx.compose.runtime.ComposerKt.traceEventEnd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f9, code lost:
    
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        r2 = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy(true, r20, r21, r20.getSpacing(), androidx.compose.foundation.layout.FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_TOP(), r21.getSpacing(), r25, r23, r22, r24, r26, r27, null).getMeasurePolicy();
        r28.updateRememberedValue(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        if ((r29 & 12582912) == 8388608) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> contextualRowMeasurementHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, int i3, List<? extends Function2<? super Composer, ? super Integer, Unit>> list, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, -43351224, "C(contextualRowMeasurementHelper)P(1,7,3,4,6,2,5)343@13891L847:ContextualFlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43351224, i4, -1, "androidx.compose.foundation.layout.contextualRowMeasurementHelper (ContextualFlowLayout.kt:342)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1138967354, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        boolean z = false;
        boolean changed = ((((i4 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && composer.changed(i)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) > 2048 && composer.changed(i2)) || (i4 & 3072) == 2048) | composer.changed(flowLayoutOverflowState) | ((((458752 & i4) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(i3)) || (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072);
        if (((29360128 & i4) ^ 12582912) <= 8388608) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r28.changed(r27) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        r1 = r2 | r4;
        r2 = r28.rememberedValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r1 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (r2 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:
    
        r2 = (kotlin.jvm.functions.Function2) r2;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        androidx.compose.runtime.ComposerKt.traceEventEnd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f9, code lost:
    
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        r2 = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy(false, r21, r20, r20.getSpacing(), androidx.compose.foundation.layout.FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_START(), r21.getSpacing(), r25, r23, r22, r24, r26, r27, null).getMeasurePolicy();
        r28.updateRememberedValue(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        if ((r29 & 12582912) == 8388608) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> contextualColumnMeasureHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, int i3, List<? extends Function2<? super Composer, ? super Integer, Unit>> list, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, 1009762916, "C(contextualColumnMeasureHelper)P(7,1,3,4,6,2,5)383@15228L850:ContextualFlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009762916, i4, -1, "androidx.compose.foundation.layout.contextualColumnMeasureHelper (ContextualFlowLayout.kt:382)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1978242771, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        boolean z = false;
        boolean changed = ((((i4 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && composer.changed(i)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) > 2048 && composer.changed(i2)) || (i4 & 3072) == 2048) | composer.changed(flowLayoutOverflowState) | ((((458752 & i4) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(i3)) || (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072);
        if (((29360128 & i4) ^ 12582912) <= 8388608) {
        }
    }
}
