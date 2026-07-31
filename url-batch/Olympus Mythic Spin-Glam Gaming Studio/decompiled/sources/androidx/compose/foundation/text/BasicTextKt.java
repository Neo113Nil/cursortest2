package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a{\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001e\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"BasicText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0069  */
    /* renamed from: BasicText-BpD7jsM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m520BasicTextBpD7jsM(final String text, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        TextStyle textStyle2;
        int i7;
        Function1 function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        Modifier modifier2;
        Function1 function13;
        int i14;
        TextState textState;
        final int i15;
        final Modifier modifier3;
        final Function1 function14;
        final int i16;
        final boolean z3;
        final TextStyle textStyle3;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(1022429478);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i17 = i4 & 2;
        if (i17 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changed(function12) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((57344 & i3) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else if ((458752 & i3) == 0) {
                            z2 = z;
                            i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            i11 = i4 & 64;
                            if (i11 == 0) {
                                i5 |= 1572864;
                            } else if ((3670016 & i3) == 0) {
                                i12 = i2;
                                i5 |= startRestartGroup.changed(i12) ? 1048576 : 524288;
                                if ((i5 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                                    Modifier modifier4 = i17 != 0 ? Modifier.INSTANCE : modifier;
                                    TextStyle textStyle4 = i6 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                                    if (i7 != 0) {
                                        function12 = new Function1() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                            public final void invoke(@NotNull TextLayoutResult it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((TextLayoutResult) obj);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                    }
                                    if (i8 != 0) {
                                        i9 = TextOverflow.INSTANCE.m2473getClipgIe3tQ8();
                                    }
                                    if (i10 != 0) {
                                        z2 = true;
                                    }
                                    i13 = i11 != 0 ? Integer.MAX_VALUE : i12;
                                    if (i13 <= 0) {
                                        throw new IllegalArgumentException("maxLines should be greater than 0");
                                    }
                                    final SelectionRegistrar selectionRegistrar = (SelectionRegistrar) startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                                    Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    FontFamily.Resolver resolver = (FontFamily.Resolver) startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                    long longValue = ((Number) RememberSaveableKt.rememberSaveable(new Object[]{text, selectionRegistrar}, selectionIdSaver(selectionRegistrar), null, new Function0() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        /* renamed from: invoke */
                                        public final Long mo4828invoke() {
                                            SelectionRegistrar selectionRegistrar2 = SelectionRegistrar.this;
                                            return Long.valueOf(selectionRegistrar2 != null ? selectionRegistrar2.nextSelectableId() : 0L);
                                        }
                                    }, startRestartGroup, 72, 4)).longValue();
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new TextController(new TextState(new TextDelegate(new AnnotatedString(text, null, null, 6, null), textStyle4, i13, z2, i9, density, resolver, null, 128, null), longValue));
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    TextController textController = (TextController) rememberedValue;
                                    TextState state = textController.getState();
                                    if (startRestartGroup.getInserting()) {
                                        modifier2 = modifier4;
                                        function13 = function12;
                                        i14 = i9;
                                        textState = state;
                                    } else {
                                        modifier2 = modifier4;
                                        function13 = function12;
                                        int i18 = i9;
                                        i14 = i9;
                                        textState = state;
                                        textController.setTextDelegate(CoreTextKt.m531updateTextDelegatey0kMQk(state.getTextDelegate(), text, textStyle4, density, resolver, z2, i18, i13));
                                    }
                                    textState.setOnTextLayout(function13);
                                    textController.update(selectionRegistrar);
                                    startRestartGroup.startReplaceableGroup(959239573);
                                    if (selectionRegistrar != null) {
                                        textState.m608setSelectionBackgroundColor8_81llA(((SelectionColors) startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor());
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    Modifier then = modifier2.then(textController.getModifiers());
                                    MeasurePolicy measurePolicy = textController.getMeasurePolicy();
                                    startRestartGroup.startReplaceableGroup(544976794);
                                    Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                                        startRestartGroup.createNode(new Function0() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
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
                                    Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl, density2, companion.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                    Updater.m1153setimpl(m1149constructorimpl, materialize, companion.getSetModifier());
                                    startRestartGroup.enableReusing();
                                    startRestartGroup.endNode();
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    i15 = i14;
                                    modifier3 = modifier2;
                                    function14 = function13;
                                    i16 = i13;
                                    z3 = z2;
                                    textStyle3 = textStyle4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    textStyle3 = textStyle2;
                                    function14 = function12;
                                    i15 = i9;
                                    z3 = z2;
                                    i16 = i12;
                                }
                                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer2, int i19) {
                                        BasicTextKt.m520BasicTextBpD7jsM(text, modifier3, textStyle3, function14, i15, z3, i16, composer2, i3 | 1, i4);
                                    }
                                });
                                return;
                            }
                            i12 = i2;
                            if ((i5 & 2995931) == 599186) {
                            }
                            if (i17 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i13 <= 0) {
                            }
                        }
                        z2 = z;
                        i11 = i4 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i2;
                        if ((i5 & 2995931) == 599186) {
                        }
                        if (i17 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i13 <= 0) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    z2 = z;
                    i11 = i4 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i2;
                    if ((i5 & 2995931) == 599186) {
                    }
                    if (i17 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i13 <= 0) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                z2 = z;
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                i12 = i2;
                if ((i5 & 2995931) == 599186) {
                }
                if (i17 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i13 <= 0) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            i12 = i2;
            if ((i5 & 2995931) == 599186) {
            }
            if (i17 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 <= 0) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        i12 = i2;
        if ((i5 & 2995931) == 599186) {
        }
        if (i17 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 <= 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c3  */
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m519BasicText4YKlhWE(final AnnotatedString text, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Map map, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        Function1 function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        Function1 function13;
        boolean z3;
        Map map2;
        int i15;
        TextStyle textStyle2;
        List list;
        long j;
        SelectionRegistrar selectionRegistrar;
        int i16;
        Map map3;
        Function1 function14;
        Function2 composableLambda;
        final Function1 function15;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final int i17;
        final boolean z4;
        final int i18;
        final Map map4;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-648605928);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i19 = i4 & 2;
        if (i19 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                i5 |= startRestartGroup.changed(textStyle) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changed(function12) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((57344 & i3) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else if ((458752 & i3) == 0) {
                            z2 = z;
                            i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            i11 = i4 & 64;
                            if (i11 == 0) {
                                i5 |= 1572864;
                            } else if ((i3 & 3670016) == 0) {
                                i5 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i12 = i4 & 128;
                            if (i12 != 0) {
                                i5 |= 4194304;
                            }
                            if (i12 == 128 || (23967451 & i5) != 4793490 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i19 == 0 ? Modifier.INSTANCE : modifier;
                                    TextStyle textStyle4 = i6 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                    if (i7 != 0) {
                                        function12 = new Function1() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                            public final void invoke(@NotNull TextLayoutResult it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((TextLayoutResult) obj);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                    }
                                    int m2473getClipgIe3tQ8 = i8 == 0 ? TextOverflow.INSTANCE.m2473getClipgIe3tQ8() : i;
                                    if (i10 != 0) {
                                        z2 = true;
                                    }
                                    int i20 = i11 == 0 ? Integer.MAX_VALUE : i2;
                                    if (i12 == 0) {
                                        modifier2 = modifier4;
                                        i13 = m2473getClipgIe3tQ8;
                                        i14 = i20;
                                        function13 = function12;
                                        z3 = z2;
                                        i15 = i5 & (-29360129);
                                        map2 = MapsKt.emptyMap();
                                    } else {
                                        modifier2 = modifier4;
                                        i13 = m2473getClipgIe3tQ8;
                                        i14 = i20;
                                        function13 = function12;
                                        z3 = z2;
                                        map2 = map;
                                        i15 = i5;
                                    }
                                    textStyle2 = textStyle4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if (i12 != 0) {
                                        i5 &= -29360129;
                                    }
                                    modifier2 = modifier;
                                    i13 = i;
                                    i14 = i2;
                                    i15 = i5;
                                    function13 = function12;
                                    z3 = z2;
                                    textStyle2 = textStyle;
                                    map2 = map;
                                }
                                startRestartGroup.endDefaults();
                                if (i14 > 0) {
                                    throw new IllegalArgumentException("maxLines should be greater than 0");
                                }
                                final SelectionRegistrar selectionRegistrar2 = (SelectionRegistrar) startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                FontFamily.Resolver resolver = (FontFamily.Resolver) startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                long selectionBackgroundColor = ((SelectionColors) startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor();
                                Pair resolveInlineContent = CoreTextKt.resolveInlineContent(text, map2);
                                List list2 = (List) resolveInlineContent.component1();
                                List list3 = (List) resolveInlineContent.component2();
                                long longValue = ((Number) RememberSaveableKt.rememberSaveable(new Object[]{text, selectionRegistrar2}, selectionIdSaver(selectionRegistrar2), null, new Function0() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    /* renamed from: invoke */
                                    public final Long mo4828invoke() {
                                        SelectionRegistrar selectionRegistrar3 = SelectionRegistrar.this;
                                        return Long.valueOf(selectionRegistrar3 != null ? selectionRegistrar3.nextSelectableId() : 0L);
                                    }
                                }, startRestartGroup, 72, 4)).longValue();
                                startRestartGroup.startReplaceableGroup(-492369756);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    list = list3;
                                    j = selectionBackgroundColor;
                                    selectionRegistrar = selectionRegistrar2;
                                    i16 = i15;
                                    map3 = map2;
                                    function14 = function13;
                                    TextController textController = new TextController(new TextState(new TextDelegate(text, textStyle2, i14, z3, i13, density, resolver, list2, null), longValue));
                                    startRestartGroup.updateRememberedValue(textController);
                                    rememberedValue = textController;
                                } else {
                                    list = list3;
                                    j = selectionBackgroundColor;
                                    selectionRegistrar = selectionRegistrar2;
                                    i16 = i15;
                                    map3 = map2;
                                    function14 = function13;
                                }
                                startRestartGroup.endReplaceableGroup();
                                TextController textController2 = (TextController) rememberedValue;
                                TextState state = textController2.getState();
                                if (!startRestartGroup.getInserting()) {
                                    textController2.setTextDelegate(CoreTextKt.m529updateTextDelegatex_uQXYA(state.getTextDelegate(), text, textStyle2, density, resolver, z3, i13, i14, list2));
                                }
                                state.setOnTextLayout(function14);
                                state.m608setSelectionBackgroundColor8_81llA(j);
                                textController2.update(selectionRegistrar);
                                if (list.isEmpty()) {
                                    composableLambda = ComposableSingletons$BasicTextKt.INSTANCE.m525getLambda1$foundation_release();
                                } else {
                                    final List list4 = list;
                                    final int i21 = i16;
                                    composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1892283635, true, new Function2() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
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
                                        public final void invoke(@Nullable Composer composer2, int i22) {
                                            if ((i22 & 11) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                            } else {
                                                CoreTextKt.InlineChildren(AnnotatedString.this, list4, composer2, (i21 & 14) | 64);
                                            }
                                        }
                                    });
                                }
                                Modifier then = modifier2.then(textController2.getModifiers());
                                MeasurePolicy measurePolicy = textController2.getMeasurePolicy();
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(then);
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
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                startRestartGroup.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(2058660585);
                                composableLambda.invoke(startRestartGroup, 0);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                function15 = function14;
                                modifier3 = modifier2;
                                textStyle3 = textStyle2;
                                i17 = i13;
                                z4 = z3;
                                i18 = i14;
                                map4 = map3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                textStyle3 = textStyle;
                                map4 = map;
                                function15 = function12;
                                i17 = i9;
                                z4 = z2;
                                i18 = i2;
                            }
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i22) {
                                    BasicTextKt.m519BasicText4YKlhWE(AnnotatedString.this, modifier3, textStyle3, function15, i17, z4, i18, map4, composer2, i3 | 1, i4);
                                }
                            });
                            return;
                        }
                        z2 = z;
                        i11 = i4 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i4 & 128;
                        if (i12 != 0) {
                        }
                        if (i12 == 128) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        textStyle2 = textStyle4;
                        startRestartGroup.endDefaults();
                        if (i14 > 0) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    z2 = z;
                    i11 = i4 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i4 & 128;
                    if (i12 != 0) {
                    }
                    if (i12 == 128) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    textStyle2 = textStyle4;
                    startRestartGroup.endDefaults();
                    if (i14 > 0) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                z2 = z;
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                }
                if (i12 == 128) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i19 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                textStyle2 = textStyle4;
                startRestartGroup.endDefaults();
                if (i14 > 0) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            i12 = i4 & 128;
            if (i12 != 0) {
            }
            if (i12 == 128) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i19 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if (i10 != 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            textStyle2 = textStyle4;
            startRestartGroup.endDefaults();
            if (i14 > 0) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        i12 = i4 & 128;
        if (i12 != 0) {
        }
        if (i12 == 128) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i19 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if (i10 != 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        textStyle2 = textStyle4;
        startRestartGroup.endDefaults();
        if (i14 > 0) {
        }
    }

    private static final Saver selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new Function2() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((SaverScope) obj, ((Number) obj2).longValue());
            }

            @Nullable
            public final Long invoke(@NotNull SaverScope Saver, long j) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                if (SelectionRegistrarKt.hasSelection(SelectionRegistrar.this, j)) {
                    return Long.valueOf(j);
                }
                return null;
            }
        }, new Function1() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            @Nullable
            public final Long invoke(long j) {
                return Long.valueOf(j);
            }
        });
    }
}
