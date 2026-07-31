package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0090\u0001\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u0013\u001a:\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\tH\u0002¢\u0006\u0002\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"BaselinesOffsetColumn", "", "offsets", "", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ListItem", "icon", "secondaryText", "singleLineSecondaryText", "", "overlineText", "trailing", "text", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OffsetToBaselineOrCenter", "offset", "OffsetToBaselineOrCenter-Kz89ssw", "(FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "applyTextStyle", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "(Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0180 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListItem(Modifier modifier, Function2 function2, Function2 function22, boolean z, Function2 function23, Function2 function24, final Function2 text, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function2 function25;
        int i5;
        boolean z2;
        int i6;
        Function2 function26;
        int i7;
        Function2 function27;
        final Modifier modifier2;
        Function2 function28;
        Function2 applyTextStyle;
        Function2 applyTextStyle2;
        Function2 applyTextStyle3;
        Function2 applyTextStyle4;
        Modifier semantics;
        Function2 function29;
        final Function2 function210;
        final Function2 function211;
        final Function2 function212;
        final boolean z3;
        final Function2 function213;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-450923337);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function25 = function22;
                i3 |= startRestartGroup.changed(function25) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        function26 = function23;
                        i3 |= startRestartGroup.changed(function26) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((458752 & i) == 0) {
                            function27 = function24;
                            i3 |= startRestartGroup.changed(function27) ? 131072 : 65536;
                            if ((i2 & 64) == 0) {
                                i3 |= 1572864;
                            } else if ((i & 3670016) == 0) {
                                i3 |= startRestartGroup.changed(text) ? 1048576 : 524288;
                            }
                            if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                                modifier2 = i8 == 0 ? Modifier.INSTANCE : modifier;
                                function28 = i9 == 0 ? null : function2;
                                Function2 function214 = i4 == 0 ? null : function25;
                                boolean z4 = i5 == 0 ? true : z2;
                                if (i6 != 0) {
                                    function26 = null;
                                }
                                Function2 function215 = i7 == 0 ? function27 : null;
                                Typography typography = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                                TextStyle subtitle1 = typography.getSubtitle1();
                                ContentAlpha contentAlpha = ContentAlpha.INSTANCE;
                                applyTextStyle = applyTextStyle(subtitle1, contentAlpha.getHigh(startRestartGroup, 6), text);
                                Intrinsics.checkNotNull(applyTextStyle);
                                applyTextStyle2 = applyTextStyle(typography.getBody2(), contentAlpha.getMedium(startRestartGroup, 6), function214);
                                applyTextStyle3 = applyTextStyle(typography.getOverline(), contentAlpha.getHigh(startRestartGroup, 6), function26);
                                applyTextStyle4 = applyTextStyle(typography.getCaption(), contentAlpha.getHigh(startRestartGroup, 6), function215);
                                semantics = SemanticsModifierKt.semantics(modifier2, true, new Function1() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    public final void invoke(@NotNull SemanticsPropertyReceiver semantics2) {
                                        Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((SemanticsPropertyReceiver) obj);
                                        return Unit.INSTANCE;
                                    }
                                });
                                if (applyTextStyle2 == null || applyTextStyle3 != null) {
                                    function29 = function26;
                                    if ((applyTextStyle3 != null && z4) || applyTextStyle2 == null) {
                                        startRestartGroup.startReplaceableGroup(-210280382);
                                        TwoLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                                        startRestartGroup.endReplaceableGroup();
                                    } else {
                                        startRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                                        startRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    startRestartGroup.startReplaceableGroup(-210280579);
                                    function29 = function26;
                                    OneLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle4, startRestartGroup, (i3 & 112) | 24576, 0);
                                    startRestartGroup.endReplaceableGroup();
                                }
                                function210 = function215;
                                function211 = function28;
                                function212 = function214;
                                z3 = z4;
                                function213 = function29;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                function211 = function2;
                                function212 = function25;
                                z3 = z2;
                                function213 = function26;
                                function210 = function27;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ListItemKt$ListItem$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i10) {
                                    ListItemKt.ListItem(Modifier.this, function211, function212, z3, function213, function210, text, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        function27 = function24;
                        if ((i2 & 64) == 0) {
                        }
                        if ((i3 & 2995931) == 599186) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        Typography typography2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                        TextStyle subtitle12 = typography2.getSubtitle1();
                        ContentAlpha contentAlpha2 = ContentAlpha.INSTANCE;
                        applyTextStyle = applyTextStyle(subtitle12, contentAlpha2.getHigh(startRestartGroup, 6), text);
                        Intrinsics.checkNotNull(applyTextStyle);
                        applyTextStyle2 = applyTextStyle(typography2.getBody2(), contentAlpha2.getMedium(startRestartGroup, 6), function214);
                        applyTextStyle3 = applyTextStyle(typography2.getOverline(), contentAlpha2.getHigh(startRestartGroup, 6), function26);
                        applyTextStyle4 = applyTextStyle(typography2.getCaption(), contentAlpha2.getHigh(startRestartGroup, 6), function215);
                        semantics = SemanticsModifierKt.semantics(modifier2, true, new Function1() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            public final void invoke(@NotNull SemanticsPropertyReceiver semantics2) {
                                Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((SemanticsPropertyReceiver) obj);
                                return Unit.INSTANCE;
                            }
                        });
                        if (applyTextStyle2 == null) {
                        }
                        function29 = function26;
                        if (applyTextStyle3 != null) {
                        }
                        startRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                        startRestartGroup.endReplaceableGroup();
                        function210 = function215;
                        function211 = function28;
                        function212 = function214;
                        z3 = z4;
                        function213 = function29;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    function26 = function23;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function27 = function24;
                    if ((i2 & 64) == 0) {
                    }
                    if ((i3 & 2995931) == 599186) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    Typography typography22 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                    TextStyle subtitle122 = typography22.getSubtitle1();
                    ContentAlpha contentAlpha22 = ContentAlpha.INSTANCE;
                    applyTextStyle = applyTextStyle(subtitle122, contentAlpha22.getHigh(startRestartGroup, 6), text);
                    Intrinsics.checkNotNull(applyTextStyle);
                    applyTextStyle2 = applyTextStyle(typography22.getBody2(), contentAlpha22.getMedium(startRestartGroup, 6), function214);
                    applyTextStyle3 = applyTextStyle(typography22.getOverline(), contentAlpha22.getHigh(startRestartGroup, 6), function26);
                    applyTextStyle4 = applyTextStyle(typography22.getCaption(), contentAlpha22.getHigh(startRestartGroup, 6), function215);
                    semantics = SemanticsModifierKt.semantics(modifier2, true, new Function1() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        public final void invoke(@NotNull SemanticsPropertyReceiver semantics2) {
                            Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return Unit.INSTANCE;
                        }
                    });
                    if (applyTextStyle2 == null) {
                    }
                    function29 = function26;
                    if (applyTextStyle3 != null) {
                    }
                    startRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                    startRestartGroup.endReplaceableGroup();
                    function210 = function215;
                    function211 = function28;
                    function212 = function214;
                    z3 = z4;
                    function213 = function29;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function26 = function23;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function27 = function24;
                if ((i2 & 64) == 0) {
                }
                if ((i3 & 2995931) == 599186) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                Typography typography222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                TextStyle subtitle1222 = typography222.getSubtitle1();
                ContentAlpha contentAlpha222 = ContentAlpha.INSTANCE;
                applyTextStyle = applyTextStyle(subtitle1222, contentAlpha222.getHigh(startRestartGroup, 6), text);
                Intrinsics.checkNotNull(applyTextStyle);
                applyTextStyle2 = applyTextStyle(typography222.getBody2(), contentAlpha222.getMedium(startRestartGroup, 6), function214);
                applyTextStyle3 = applyTextStyle(typography222.getOverline(), contentAlpha222.getHigh(startRestartGroup, 6), function26);
                applyTextStyle4 = applyTextStyle(typography222.getCaption(), contentAlpha222.getHigh(startRestartGroup, 6), function215);
                semantics = SemanticsModifierKt.semantics(modifier2, true, new Function1() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    public final void invoke(@NotNull SemanticsPropertyReceiver semantics2) {
                        Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return Unit.INSTANCE;
                    }
                });
                if (applyTextStyle2 == null) {
                }
                function29 = function26;
                if (applyTextStyle3 != null) {
                }
                startRestartGroup.startReplaceableGroup(-210280168);
                ThreeLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                startRestartGroup.endReplaceableGroup();
                function210 = function215;
                function211 = function28;
                function212 = function214;
                z3 = z4;
                function213 = function29;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function25 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function26 = function23;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function27 = function24;
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 2995931) == 599186) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            Typography typography2222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
            TextStyle subtitle12222 = typography2222.getSubtitle1();
            ContentAlpha contentAlpha2222 = ContentAlpha.INSTANCE;
            applyTextStyle = applyTextStyle(subtitle12222, contentAlpha2222.getHigh(startRestartGroup, 6), text);
            Intrinsics.checkNotNull(applyTextStyle);
            applyTextStyle2 = applyTextStyle(typography2222.getBody2(), contentAlpha2222.getMedium(startRestartGroup, 6), function214);
            applyTextStyle3 = applyTextStyle(typography2222.getOverline(), contentAlpha2222.getHigh(startRestartGroup, 6), function26);
            applyTextStyle4 = applyTextStyle(typography2222.getCaption(), contentAlpha2222.getHigh(startRestartGroup, 6), function215);
            semantics = SemanticsModifierKt.semantics(modifier2, true, new Function1() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                public final void invoke(@NotNull SemanticsPropertyReceiver semantics2) {
                    Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return Unit.INSTANCE;
                }
            });
            if (applyTextStyle2 == null) {
            }
            function29 = function26;
            if (applyTextStyle3 != null) {
            }
            startRestartGroup.startReplaceableGroup(-210280168);
            ThreeLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
            startRestartGroup.endReplaceableGroup();
            function210 = function215;
            function211 = function28;
            function212 = function214;
            z3 = z4;
            function213 = function29;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function25 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function26 = function23;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function27 = function24;
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 2995931) == 599186) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        Typography typography22222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
        TextStyle subtitle122222 = typography22222.getSubtitle1();
        ContentAlpha contentAlpha22222 = ContentAlpha.INSTANCE;
        applyTextStyle = applyTextStyle(subtitle122222, contentAlpha22222.getHigh(startRestartGroup, 6), text);
        Intrinsics.checkNotNull(applyTextStyle);
        applyTextStyle2 = applyTextStyle(typography22222.getBody2(), contentAlpha22222.getMedium(startRestartGroup, 6), function214);
        applyTextStyle3 = applyTextStyle(typography22222.getOverline(), contentAlpha22222.getHigh(startRestartGroup, 6), function26);
        applyTextStyle4 = applyTextStyle(typography22222.getCaption(), contentAlpha22222.getHigh(startRestartGroup, 6), function215);
        semantics = SemanticsModifierKt.semantics(modifier2, true, new Function1() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
            public final void invoke(@NotNull SemanticsPropertyReceiver semantics2) {
                Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }
        });
        if (applyTextStyle2 == null) {
        }
        function29 = function26;
        if (applyTextStyle3 != null) {
        }
        startRestartGroup.startReplaceableGroup(-210280168);
        ThreeLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
        startRestartGroup.endReplaceableGroup();
        function210 = function215;
        function211 = function28;
        function212 = function214;
        z3 = z4;
        function213 = function29;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BaselinesOffsetColumn(final List list, Modifier modifier, final Function2 function2, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(1631148337);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List measurables, long j) {
                int i3;
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                long m2478copyZbe2FdA$default = Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 3, null);
                List list2 = measurables;
                final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Measurable) it.next()).mo1944measureBRTryo0(m2478copyZbe2FdA$default));
                }
                Iterator it2 = arrayList.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    i4 = Math.max(i4, ((Placeable) it2.next()).getWidth());
                }
                int size = arrayList.size();
                final Integer[] numArr = new Integer[size];
                for (int i5 = 0; i5 < size; i5++) {
                    numArr[i5] = 0;
                }
                List list3 = list;
                int size2 = arrayList.size();
                int i6 = 0;
                for (int i7 = 0; i7 < size2; i7++) {
                    Placeable placeable = (Placeable) arrayList.get(i7);
                    if (i7 > 0) {
                        int i8 = i7 - 1;
                        i3 = ((Placeable) arrayList.get(i8)).getHeight() - ((Placeable) arrayList.get(i8)).get(AlignmentLineKt.getLastBaseline());
                    } else {
                        i3 = 0;
                    }
                    int max = Math.max(0, (Layout.mo265roundToPx0680j_4(((Dp) list3.get(i7)).getValue()) - placeable.get(AlignmentLineKt.getFirstBaseline())) - i3);
                    numArr[i7] = Integer.valueOf(max + i6);
                    i6 += max + placeable.getHeight();
                }
                return MeasureScope.layout$default(Layout, i4, i6, null, new Function1() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        List<Placeable> list4 = arrayList;
                        Integer[] numArr2 = numArr;
                        int size3 = list4.size();
                        for (int i9 = 0; i9 < size3; i9++) {
                            Placeable.PlacementScope.placeRelative$default(layout, list4.get(i9), 0, numArr2[i9].intValue(), 0.0f, 4, null);
                        }
                    }
                }, 4, null);
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0 constructor = companion.getConstructor();
        Function3 materializerOf = LayoutKt.materializerOf(modifier2);
        int i3 = (((((i >> 6) & 14) | (i & 112)) << 9) & 7168) | 6;
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
        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$2
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
                ListItemKt.BaselinesOffsetColumn(list, modifier2, function2, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    public static final void m889OffsetToBaselineOrCenterKz89ssw(final float f, Modifier modifier, final Function2 function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1062692685);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List measurables, long j) {
                    int max;
                    final int m2554getYimpl;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    final Placeable mo1944measureBRTryo0 = ((Measurable) measurables.get(0)).mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                    int i5 = mo1944measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                    if (i5 != Integer.MIN_VALUE) {
                        m2554getYimpl = Layout.mo265roundToPx0680j_4(f) - i5;
                        max = Math.max(Constraints.m2488getMinHeightimpl(j), mo1944measureBRTryo0.getHeight() + m2554getYimpl);
                    } else {
                        max = Math.max(Constraints.m2488getMinHeightimpl(j), mo1944measureBRTryo0.getHeight());
                        m2554getYimpl = IntOffset.m2554getYimpl(Alignment.INSTANCE.getCenter().mo1228alignKFBX0sM(IntSize.INSTANCE.m2571getZeroYbymL2g(), IntSizeKt.IntSize(0, max - mo1944measureBRTryo0.getHeight()), Layout.getLayoutDirection()));
                    }
                    return MeasureScope.layout$default(Layout, mo1944measureBRTryo0.getWidth(), max, null, new Function1() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, m2554getYimpl, 0.0f, 4, null);
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 constructor = companion.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(modifier);
            int i5 = ((((i3 & 112) | ((i3 >> 6) & 14)) << 9) & 7168) | 6;
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
            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf((i5 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i6) {
                ListItemKt.m889OffsetToBaselineOrCenterKz89ssw(f, modifier2, function2, composer2, i | 1, i2);
            }
        });
    }

    private static final Function2 applyTextStyle(final TextStyle textStyle, final float f, final Function2 function2) {
        if (function2 == null) {
            return null;
        }
        return ComposableLambdaKt.composableLambdaInstance(-830176860, true, new Function2() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(f))};
                    final TextStyle textStyle2 = textStyle;
                    final Function2 function22 = function2;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer, 1665877604, true, new Function2() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i2) {
                            if ((i2 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                TextKt.ProvideTextStyle(TextStyle.this, function22, composer2, 0);
                            }
                        }
                    }), composer, 56);
                    return;
                }
                composer.skipToGroupEnd();
            }
        });
    }
}
