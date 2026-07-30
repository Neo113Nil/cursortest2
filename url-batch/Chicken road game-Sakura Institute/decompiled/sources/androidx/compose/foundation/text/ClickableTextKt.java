package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ClickableText.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008c\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001av\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\f*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"ClickableText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "onHover", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "onClick", "ClickableText-03UYbkw", "(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ClickableText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "containsWithinBounds", "Landroidx/compose/ui/text/MultiParagraph;", "positionOffset", "Landroidx/compose/ui/geometry/Offset;", "containsWithinBounds-Uv8p0NA", "(Landroidx/compose/ui/text/MultiParagraph;J)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableTextKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ae  */
    @Deprecated(message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation")
    /* renamed from: ClickableText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m982ClickableText4YKlhWE(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z, int i, int i2, Function1<? super TextLayoutResult, Unit> function1, final Function1<? super Integer, Unit> function12, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final Function1<? super TextLayoutResult, Unit> function13;
        Object rememberedValue;
        boolean z3;
        ClickableTextKt$ClickableText$pressIndicator$1$1 rememberedValue2;
        boolean z4;
        Object rememberedValue3;
        final boolean z5;
        final int i13;
        final Function1<? super TextLayoutResult, Unit> function14;
        final Modifier modifier3;
        final int i14;
        final TextStyle textStyle3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-246609449);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClickableText)P(7,1,6,5,4:c#ui.text.style.TextOverflow!1,3)84@3976L52,85@4085L184,100@4490L76,93@4275L297:ClickableText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    z2 = z;
                    i5 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            i11 = i2;
                        } else {
                            i11 = i2;
                            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i5 |= startRestartGroup.changed(i11) ? 131072 : 65536;
                            }
                        }
                        i12 = i4 & 64;
                        if (i12 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                        }
                        if ((i4 & 128) != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i5 |= startRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                        }
                        if ((4793491 & i5) == 4793490 || !startRestartGroup.getSkipping()) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            TextStyle textStyle4 = i6 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                            boolean z6 = i7 != 0 ? true : z2;
                            int m6237getClipgIe3tQ8 = i8 != 0 ? TextOverflow.INSTANCE.m6237getClipgIe3tQ8() : i9;
                            if (i10 != 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            function13 = i12 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextLayoutResult textLayoutResult) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            } : function1;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498074812, "CC(remember):ClickableText.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final MutableState mutableState = (MutableState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498078432, "CC(remember):ClickableText.kt#9igjgp");
                            z3 = (29360128 & i5) == 8388608;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function12, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier then = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion, function12, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498091284, "CC(remember):ClickableText.kt#9igjgp");
                            z4 = (i5 & 3670016) == 1048576;
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!z4 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult textLayoutResult) {
                                        mutableState.setValue(textLayoutResult);
                                        function13.invoke(textLayoutResult);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Function1<? super TextLayoutResult, Unit> function15 = function13;
                            BasicTextKt.m975BasicTextRWo7tUw(annotatedString, then, textStyle4, (Function1) rememberedValue3, m6237getClipgIe3tQ8, z6, i11, 0, null, null, startRestartGroup, (58254 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z6;
                            i13 = m6237getClipgIe3tQ8;
                            function14 = function15;
                            modifier3 = modifier2;
                            i14 = i11;
                            textStyle3 = textStyle4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            function14 = function1;
                            modifier3 = modifier2;
                            z5 = z2;
                            i13 = i9;
                            i14 = i11;
                            textStyle3 = textStyle2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
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

                                public final void invoke(Composer composer2, int i16) {
                                    ClickableTextKt.m982ClickableText4YKlhWE(AnnotatedString.this, modifier3, textStyle3, z5, i13, i14, function14, function12, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i12 = i4 & 64;
                    if (i12 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if ((4793491 & i5) == 4793490) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498074812, "CC(remember):ClickableText.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState<TextLayoutResult> mutableState2 = (MutableState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498078432, "CC(remember):ClickableText.kt#9igjgp");
                    if ((29360128 & i5) == 8388608) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z3) {
                    }
                    rememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState2, function12, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier then2 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion2, function12, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498091284, "CC(remember):ClickableText.kt#9igjgp");
                    if ((i5 & 3670016) == 1048576) {
                    }
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z4) {
                    }
                    rememberedValue3 = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextLayoutResult textLayoutResult) {
                            mutableState2.setValue(textLayoutResult);
                            function13.invoke(textLayoutResult);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Function1<? super TextLayoutResult, Unit> function152 = function13;
                    BasicTextKt.m975BasicTextRWo7tUw(annotatedString, then2, textStyle4, (Function1) rememberedValue3, m6237getClipgIe3tQ8, z6, i11, 0, null, null, startRestartGroup, (58254 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z6;
                    i13 = m6237getClipgIe3tQ8;
                    function14 = function152;
                    modifier3 = modifier2;
                    i14 = i11;
                    textStyle3 = textStyle4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i12 = i4 & 64;
                if (i12 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if ((4793491 & i5) == 4793490) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498074812, "CC(remember):ClickableText.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState<TextLayoutResult> mutableState22 = (MutableState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498078432, "CC(remember):ClickableText.kt#9igjgp");
                if ((29360128 & i5) == 8388608) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState22, function12, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier then22 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion22, function12, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498091284, "CC(remember):ClickableText.kt#9igjgp");
                if ((i5 & 3670016) == 1048576) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue3 = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextLayoutResult textLayoutResult) {
                        mutableState22.setValue(textLayoutResult);
                        function13.invoke(textLayoutResult);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Function1<? super TextLayoutResult, Unit> function1522 = function13;
                BasicTextKt.m975BasicTextRWo7tUw(annotatedString, then22, textStyle4, (Function1) rememberedValue3, m6237getClipgIe3tQ8, z6, i11, 0, null, null, startRestartGroup, (58254 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z6;
                i13 = m6237getClipgIe3tQ8;
                function14 = function1522;
                modifier3 = modifier2;
                i14 = i11;
                textStyle3 = textStyle4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            z2 = z;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i12 = i4 & 64;
            if (i12 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if ((4793491 & i5) == 4793490) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498074812, "CC(remember):ClickableText.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState<TextLayoutResult> mutableState222 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier.Companion companion222 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498078432, "CC(remember):ClickableText.kt#9igjgp");
            if ((29360128 & i5) == 8388608) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState222, function12, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier then222 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion222, function12, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498091284, "CC(remember):ClickableText.kt#9igjgp");
            if ((i5 & 3670016) == 1048576) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue3 = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                    invoke2(textLayoutResult);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TextLayoutResult textLayoutResult) {
                    mutableState222.setValue(textLayoutResult);
                    function13.invoke(textLayoutResult);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function1<? super TextLayoutResult, Unit> function15222 = function13;
            BasicTextKt.m975BasicTextRWo7tUw(annotatedString, then222, textStyle4, (Function1) rememberedValue3, m6237getClipgIe3tQ8, z6, i11, 0, null, null, startRestartGroup, (58254 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z6;
            i13 = m6237getClipgIe3tQ8;
            function14 = function15222;
            modifier3 = modifier2;
            i14 = i11;
            textStyle3 = textStyle4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        z2 = z;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i12 = i4 & 64;
        if (i12 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if ((4793491 & i5) == 4793490) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498074812, "CC(remember):ClickableText.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState<TextLayoutResult> mutableState2222 = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier.Companion companion2222 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498078432, "CC(remember):ClickableText.kt#9igjgp");
        if ((29360128 & i5) == 8388608) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState2222, function12, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier then2222 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion2222, function12, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498091284, "CC(remember):ClickableText.kt#9igjgp");
        if ((i5 & 3670016) == 1048576) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue3 = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                invoke2(textLayoutResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextLayoutResult textLayoutResult) {
                mutableState2222.setValue(textLayoutResult);
                function13.invoke(textLayoutResult);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Function1<? super TextLayoutResult, Unit> function152222 = function13;
        BasicTextKt.m975BasicTextRWo7tUw(annotatedString, then2222, textStyle4, (Function1) rememberedValue3, m6237getClipgIe3tQ8, z6, i11, 0, null, null, startRestartGroup, (58254 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z6;
        i13 = m6237getClipgIe3tQ8;
        function14 = function152222;
        modifier3 = modifier2;
        i14 = i11;
        textStyle3 = textStyle4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    @Deprecated(message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation")
    /* renamed from: ClickableText-03UYbkw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m981ClickableText03UYbkw(final AnnotatedString annotatedString, final Function1<? super Integer, Unit> function1, Modifier modifier, TextStyle textStyle, boolean z, int i, int i2, Function1<? super TextLayoutResult, Unit> function12, final Function1<? super Integer, Unit> function13, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        final ClickableTextKt$ClickableText$4 clickableTextKt$ClickableText$4;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changedInstance;
        Object rememberedValue3;
        boolean z3;
        Object rememberedValue4;
        final TextStyle textStyle3;
        final boolean z4;
        final int i12;
        final Modifier modifier3;
        final int i13;
        final Function1<? super TextLayoutResult, Unit> function14;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1020774372);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClickableText)P(8,3,1,7,6,5:c#ui.text.style.TextOverflow!1,4)163@7538L52,164@7616L24,171@7916L413,193@8556L76,186@8335L303:ClickableText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i14 = i4 & 4;
        if (i14 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    z2 = z;
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i9 = i;
                    } else {
                        i9 = i;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changed(i9) ? 131072 : 65536;
                        }
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i5 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                    }
                    i11 = i4 & 128;
                    if (i11 == 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i5 |= startRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                    }
                    if ((i4 & 256) == 0) {
                        i5 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i5 |= startRestartGroup.changedInstance(function13) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((38347923 & i5) == 38347922 || !startRestartGroup.getSkipping()) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        TextStyle textStyle4 = i6 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                        boolean z5 = i7 == 0 ? true : z2;
                        if (i8 != 0) {
                            i9 = TextOverflow.INSTANCE.m6237getClipgIe3tQ8();
                        }
                        int i15 = i10 == 0 ? Integer.MAX_VALUE : i2;
                        clickableTextKt$ClickableText$4 = i11 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextLayoutResult textLayoutResult) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        } : function12;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:162)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498188796, "CC(remember):ClickableText.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final MutableState mutableState = (MutableState) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498201253, "CC(remember):ClickableText.kt#9igjgp");
                        changedInstance = startRestartGroup.changedInstance(coroutineScope) | ((i5 & 112) != 32) | ((234881024 & i5) != 67108864);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (Function2) new ClickableTextKt$ClickableText$pointerInputModifier$1$1(coroutineScope, function1, mutableState, function13, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier then = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion, function13, function1, (Function2) rememberedValue3));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498221396, "CC(remember):ClickableText.kt#9igjgp");
                        z3 = (29360128 & i5) != 8388608;
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!z3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextLayoutResult textLayoutResult) {
                                    mutableState.setValue(textLayoutResult);
                                    clickableTextKt$ClickableText$4.invoke(textLayoutResult);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i16 = i5 >> 3;
                        BasicTextKt.m975BasicTextRWo7tUw(annotatedString, then, textStyle4, (Function1) rememberedValue4, i9, z5, i15, 0, null, null, startRestartGroup, (i5 & 14) | (i16 & 896) | (i16 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        textStyle3 = textStyle4;
                        z4 = z5;
                        i12 = i9;
                        modifier3 = modifier2;
                        i13 = i15;
                        function14 = clickableTextKt$ClickableText$4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        i12 = i9;
                        modifier3 = modifier2;
                        textStyle3 = textStyle2;
                        z4 = z2;
                        i13 = i2;
                        function14 = function12;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
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

                            public final void invoke(Composer composer2, int i17) {
                                ClickableTextKt.m981ClickableText03UYbkw(AnnotatedString.this, function1, modifier3, textStyle3, z4, i12, i13, function14, function13, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                            }
                        });
                        return;
                    }
                    return;
                }
                z2 = z;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                i11 = i4 & 128;
                if (i11 == 0) {
                }
                if ((i4 & 256) == 0) {
                }
                if ((38347923 & i5) == 38347922) {
                }
                if (i14 != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498188796, "CC(remember):ClickableText.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState<TextLayoutResult> mutableState2 = (MutableState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498201253, "CC(remember):ClickableText.kt#9igjgp");
                changedInstance = startRestartGroup.changedInstance(coroutineScope2) | ((i5 & 112) != 32) | ((234881024 & i5) != 67108864);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue3 = (Function2) new ClickableTextKt$ClickableText$pointerInputModifier$1$1(coroutineScope2, function1, mutableState2, function13, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier then2 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion2, function13, function1, (Function2) rememberedValue3));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498221396, "CC(remember):ClickableText.kt#9igjgp");
                if ((29360128 & i5) != 8388608) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue4 = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextLayoutResult textLayoutResult) {
                        mutableState2.setValue(textLayoutResult);
                        clickableTextKt$ClickableText$4.invoke(textLayoutResult);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i162 = i5 >> 3;
                BasicTextKt.m975BasicTextRWo7tUw(annotatedString, then2, textStyle4, (Function1) rememberedValue4, i9, z5, i15, 0, null, null, startRestartGroup, (i5 & 14) | (i162 & 896) | (i162 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle4;
                z4 = z5;
                i12 = i9;
                modifier3 = modifier2;
                i13 = i15;
                function14 = clickableTextKt$ClickableText$4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            z2 = z;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            i11 = i4 & 128;
            if (i11 == 0) {
            }
            if ((i4 & 256) == 0) {
            }
            if ((38347923 & i5) == 38347922) {
            }
            if (i14 != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498188796, "CC(remember):ClickableText.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState<TextLayoutResult> mutableState22 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier.Companion companion22 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498201253, "CC(remember):ClickableText.kt#9igjgp");
            changedInstance = startRestartGroup.changedInstance(coroutineScope22) | ((i5 & 112) != 32) | ((234881024 & i5) != 67108864);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue3 = (Function2) new ClickableTextKt$ClickableText$pointerInputModifier$1$1(coroutineScope22, function1, mutableState22, function13, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier then22 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion22, function13, function1, (Function2) rememberedValue3));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498221396, "CC(remember):ClickableText.kt#9igjgp");
            if ((29360128 & i5) != 8388608) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue4 = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                    invoke2(textLayoutResult);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TextLayoutResult textLayoutResult) {
                    mutableState22.setValue(textLayoutResult);
                    clickableTextKt$ClickableText$4.invoke(textLayoutResult);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i1622 = i5 >> 3;
            BasicTextKt.m975BasicTextRWo7tUw(annotatedString, then22, textStyle4, (Function1) rememberedValue4, i9, z5, i15, 0, null, null, startRestartGroup, (i5 & 14) | (i1622 & 896) | (i1622 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
            if (ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle4;
            z4 = z5;
            i12 = i9;
            modifier3 = modifier2;
            i13 = i15;
            function14 = clickableTextKt$ClickableText$4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        z2 = z;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        i11 = i4 & 128;
        if (i11 == 0) {
        }
        if ((i4 & 256) == 0) {
        }
        if ((38347923 & i5) == 38347922) {
        }
        if (i14 != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 != 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498188796, "CC(remember):ClickableText.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState<TextLayoutResult> mutableState222 = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier.Companion companion222 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498201253, "CC(remember):ClickableText.kt#9igjgp");
        changedInstance = startRestartGroup.changedInstance(coroutineScope222) | ((i5 & 112) != 32) | ((234881024 & i5) != 67108864);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue3 = (Function2) new ClickableTextKt$ClickableText$pointerInputModifier$1$1(coroutineScope222, function1, mutableState222, function13, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier then222 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion222, function13, function1, (Function2) rememberedValue3));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1498221396, "CC(remember):ClickableText.kt#9igjgp");
        if ((29360128 & i5) != 8388608) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue4 = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                invoke2(textLayoutResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextLayoutResult textLayoutResult) {
                mutableState222.setValue(textLayoutResult);
                clickableTextKt$ClickableText$4.invoke(textLayoutResult);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i16222 = i5 >> 3;
        BasicTextKt.m975BasicTextRWo7tUw(annotatedString, then222, textStyle4, (Function1) rememberedValue4, i9, z5, i15, 0, null, null, startRestartGroup, (i5 & 14) | (i16222 & 896) | (i16222 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
        if (ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle4;
        z4 = z5;
        i12 = i9;
        modifier3 = modifier2;
        i13 = i15;
        function14 = clickableTextKt$ClickableText$4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer ClickableText_03UYbkw$getOffset(MutableState<TextLayoutResult> mutableState, long j) {
        MultiParagraph multiParagraph;
        TextLayoutResult value = mutableState.getValue();
        if (value == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return null;
        }
        if (!m983containsWithinBoundsUv8p0NA(multiParagraph, j)) {
            multiParagraph = null;
        }
        if (multiParagraph != null) {
            return Integer.valueOf(multiParagraph.m5650getOffsetForPositionk4lQ0M(j));
        }
        return null;
    }

    /* renamed from: containsWithinBounds-Uv8p0NA, reason: not valid java name */
    private static final boolean m983containsWithinBoundsUv8p0NA(MultiParagraph multiParagraph, long j) {
        float m3599getXimpl = Offset.m3599getXimpl(j);
        float m3600getYimpl = Offset.m3600getYimpl(j);
        return m3599getXimpl > 0.0f && m3600getYimpl >= 0.0f && m3599getXimpl <= multiParagraph.getWidth() && m3600getYimpl <= multiParagraph.getHeight();
    }
}
