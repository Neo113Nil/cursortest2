package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u00ad\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-6oU6zVQ", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "buttons", "AlertDialog-wqdebIU", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ca  */
    /* renamed from: AlertDialog-6oU6zVQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m708AlertDialog6oU6zVQ(final Function0 onDismissRequest, final Function2 confirmButton, Modifier modifier, Function2 function2, Function2 function22, Function2 function23, Shape shape, long j, long j2, DialogProperties dialogProperties, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        int i6;
        Function2 function24;
        Shape shape2;
        long j3;
        Shape shape3;
        long j4;
        DialogProperties dialogProperties2;
        Modifier modifier2;
        Function2 function25;
        Function2 function26;
        long j5;
        Shape shape4;
        long j6;
        final Function2 function27;
        Composer composer2;
        final Function2 function28;
        final Modifier modifier3;
        final Function2 function29;
        final Function2 function210;
        final Shape shape5;
        final long j7;
        final long j8;
        final DialogProperties dialogProperties3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Composer startRestartGroup = composer.startRestartGroup(-606536823);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(confirmButton) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(function2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    i3 |= startRestartGroup.changed(function22) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        function24 = function23;
                        i3 |= startRestartGroup.changed(function24) ? 131072 : 65536;
                        if ((i & 3670016) == 0) {
                            shape2 = shape;
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : 524288;
                        } else {
                            shape2 = shape;
                        }
                        if ((i & 29360128) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(j)) {
                                i8 = 8388608;
                                i3 |= i8;
                            }
                            i8 = 4194304;
                            i3 |= i8;
                        }
                        if ((i & 234881024) == 0) {
                            j3 = j2;
                            i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j3)) ? 67108864 : 33554432;
                        } else {
                            j3 = j2;
                        }
                        if ((1879048192 & i) == 0) {
                            if ((i2 & 512) == 0 && startRestartGroup.changed(dialogProperties)) {
                                i7 = 536870912;
                                i3 |= i7;
                            }
                            i7 = 268435456;
                            i3 |= i7;
                        }
                        if ((i3 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier;
                                Function2 function211 = i4 != 0 ? null : function2;
                                Function2 function212 = i5 != 0 ? null : function22;
                                Function2 function213 = i6 == 0 ? function24 : null;
                                if ((i2 & 64) != 0) {
                                    shape3 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                                    i3 &= -3670017;
                                } else {
                                    shape3 = shape2;
                                }
                                if ((i2 & 128) != 0) {
                                    j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                    i3 &= -29360129;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 256) != 0) {
                                    j3 = ColorsKt.m814contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 21) & 14);
                                    i3 &= -234881025;
                                }
                                if ((i2 & 512) != 0) {
                                    i3 &= -1879048193;
                                    modifier2 = modifier4;
                                    function25 = function213;
                                    dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                } else {
                                    dialogProperties2 = dialogProperties;
                                    modifier2 = modifier4;
                                    function25 = function213;
                                }
                                function26 = function212;
                                j5 = j3;
                                shape4 = shape3;
                                j6 = j4;
                                function27 = function211;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                if ((i2 & 512) != 0) {
                                    i3 &= -1879048193;
                                }
                                modifier2 = modifier;
                                function26 = function22;
                                j6 = j;
                                dialogProperties2 = dialogProperties;
                                j5 = j3;
                                shape4 = shape2;
                                function25 = function24;
                                function27 = function2;
                            }
                            startRestartGroup.endDefaults();
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                                public final void invoke(@Nullable Composer composer3, int i10) {
                                    if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                                        float f = 8;
                                        Modifier m335paddingVpY3zN4 = PaddingKt.m335paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(2));
                                        final Function2 function214 = Function2.this;
                                        final int i11 = i3;
                                        final Function2 function215 = confirmButton;
                                        composer3.startReplaceableGroup(733328855);
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0 constructor = companion.getConstructor();
                                        Function3 materializerOf = LayoutKt.materializerOf(m335paddingVpY3zN4);
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer3);
                                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-2137368960);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(-434861445);
                                        AlertDialogKt.m707AlertDialogFlowRowixp7dh8(Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                            public final void invoke(@Nullable Composer composer4, int i12) {
                                                if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                                    Function2 function216 = Function2.this;
                                                    composer4.startReplaceableGroup(-1046483318);
                                                    if (function216 != null) {
                                                        function216.invoke(composer4, Integer.valueOf((i11 >> 9) & 14));
                                                        Unit unit = Unit.INSTANCE;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    function215.invoke(composer4, Integer.valueOf((i11 >> 3) & 14));
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 438);
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            });
                            int i10 = (i3 & 14) | 48 | (i3 & 896);
                            int i11 = i3 >> 3;
                            composer2 = startRestartGroup;
                            m709AlertDialogwqdebIU(onDismissRequest, composableLambda, modifier2, function26, function25, shape4, j6, j5, dialogProperties2, startRestartGroup, i10 | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024), 0);
                            function28 = function27;
                            modifier3 = modifier2;
                            function29 = function26;
                            function210 = function25;
                            shape5 = shape4;
                            j7 = j6;
                            j8 = j5;
                            dialogProperties3 = dialogProperties2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            function28 = function2;
                            function29 = function22;
                            dialogProperties3 = dialogProperties;
                            composer2 = startRestartGroup;
                            long j9 = j3;
                            shape5 = shape2;
                            j7 = j;
                            function210 = function24;
                            j8 = j9;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i12) {
                                AndroidAlertDialog_androidKt.m708AlertDialog6oU6zVQ(Function0.this, confirmButton, modifier3, function28, function29, function210, shape5, j7, j8, dialogProperties3, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    function24 = function23;
                    if ((i & 3670016) == 0) {
                    }
                    if ((i & 29360128) == 0) {
                    }
                    if ((i & 234881024) == 0) {
                    }
                    if ((1879048192 & i) == 0) {
                    }
                    if ((i3 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    if ((i2 & 512) != 0) {
                    }
                    function26 = function212;
                    j5 = j3;
                    shape4 = shape3;
                    j6 = j4;
                    function27 = function211;
                    startRestartGroup.endDefaults();
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                        public final void invoke(@Nullable Composer composer3, int i102) {
                            if ((i102 & 11) != 2 || !composer3.getSkipping()) {
                                float f = 8;
                                Modifier m335paddingVpY3zN4 = PaddingKt.m335paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(2));
                                final Function2 function214 = Function2.this;
                                final int i112 = i3;
                                final Function2 function215 = confirmButton;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(m335paddingVpY3zN4);
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer m1149constructorimpl = Updater.m1149constructorimpl(composer3);
                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-434861445);
                                AlertDialogKt.m707AlertDialogFlowRowixp7dh8(Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                    public final void invoke(@Nullable Composer composer4, int i12) {
                                        if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                            Function2 function216 = Function2.this;
                                            composer4.startReplaceableGroup(-1046483318);
                                            if (function216 != null) {
                                                function216.invoke(composer4, Integer.valueOf((i112 >> 9) & 14));
                                                Unit unit = Unit.INSTANCE;
                                            }
                                            composer4.endReplaceableGroup();
                                            function215.invoke(composer4, Integer.valueOf((i112 >> 3) & 14));
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 438);
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    int i102 = (i3 & 14) | 48 | (i3 & 896);
                    int i112 = i3 >> 3;
                    composer2 = startRestartGroup;
                    m709AlertDialogwqdebIU(onDismissRequest, composableLambda2, modifier2, function26, function25, shape4, j6, j5, dialogProperties2, startRestartGroup, i102 | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (i112 & 3670016) | (i112 & 29360128) | (i112 & 234881024), 0);
                    function28 = function27;
                    modifier3 = modifier2;
                    function29 = function26;
                    function210 = function25;
                    shape5 = shape4;
                    j7 = j6;
                    j8 = j5;
                    dialogProperties3 = dialogProperties2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function24 = function23;
                if ((i & 3670016) == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((1879048192 & i) == 0) {
                }
                if ((i3 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                function26 = function212;
                j5 = j3;
                shape4 = shape3;
                j6 = j4;
                function27 = function211;
                startRestartGroup.endDefaults();
                ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                    public final void invoke(@Nullable Composer composer3, int i1022) {
                        if ((i1022 & 11) != 2 || !composer3.getSkipping()) {
                            float f = 8;
                            Modifier m335paddingVpY3zN4 = PaddingKt.m335paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(2));
                            final Function2 function214 = Function2.this;
                            final int i1122 = i3;
                            final Function2 function215 = confirmButton;
                            composer3.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(m335paddingVpY3zN4);
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer3);
                            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(-434861445);
                            AlertDialogKt.m707AlertDialogFlowRowixp7dh8(Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                public final void invoke(@Nullable Composer composer4, int i12) {
                                    if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                        Function2 function216 = Function2.this;
                                        composer4.startReplaceableGroup(-1046483318);
                                        if (function216 != null) {
                                            function216.invoke(composer4, Integer.valueOf((i1122 >> 9) & 14));
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        composer4.endReplaceableGroup();
                                        function215.invoke(composer4, Integer.valueOf((i1122 >> 3) & 14));
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 438);
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                });
                int i1022 = (i3 & 14) | 48 | (i3 & 896);
                int i1122 = i3 >> 3;
                composer2 = startRestartGroup;
                m709AlertDialogwqdebIU(onDismissRequest, composableLambda22, modifier2, function26, function25, shape4, j6, j5, dialogProperties2, startRestartGroup, i1022 | (i1122 & 7168) | (57344 & i1122) | (458752 & i1122) | (i1122 & 3670016) | (i1122 & 29360128) | (i1122 & 234881024), 0);
                function28 = function27;
                modifier3 = modifier2;
                function29 = function26;
                function210 = function25;
                shape5 = shape4;
                j7 = j6;
                j8 = j5;
                dialogProperties3 = dialogProperties2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function24 = function23;
            if ((i & 3670016) == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((1879048192 & i) == 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            function26 = function212;
            j5 = j3;
            shape4 = shape3;
            j6 = j4;
            function27 = function211;
            startRestartGroup.endDefaults();
            ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                public final void invoke(@Nullable Composer composer3, int i10222) {
                    if ((i10222 & 11) != 2 || !composer3.getSkipping()) {
                        float f = 8;
                        Modifier m335paddingVpY3zN4 = PaddingKt.m335paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(2));
                        final Function2 function214 = Function2.this;
                        final int i11222 = i3;
                        final Function2 function215 = confirmButton;
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(m335paddingVpY3zN4);
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer3);
                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-434861445);
                        AlertDialogKt.m707AlertDialogFlowRowixp7dh8(Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                            public final void invoke(@Nullable Composer composer4, int i12) {
                                if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                    Function2 function216 = Function2.this;
                                    composer4.startReplaceableGroup(-1046483318);
                                    if (function216 != null) {
                                        function216.invoke(composer4, Integer.valueOf((i11222 >> 9) & 14));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer4.endReplaceableGroup();
                                    function215.invoke(composer4, Integer.valueOf((i11222 >> 3) & 14));
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 438);
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            });
            int i10222 = (i3 & 14) | 48 | (i3 & 896);
            int i11222 = i3 >> 3;
            composer2 = startRestartGroup;
            m709AlertDialogwqdebIU(onDismissRequest, composableLambda222, modifier2, function26, function25, shape4, j6, j5, dialogProperties2, startRestartGroup, i10222 | (i11222 & 7168) | (57344 & i11222) | (458752 & i11222) | (i11222 & 3670016) | (i11222 & 29360128) | (i11222 & 234881024), 0);
            function28 = function27;
            modifier3 = modifier2;
            function29 = function26;
            function210 = function25;
            shape5 = shape4;
            j7 = j6;
            j8 = j5;
            dialogProperties3 = dialogProperties2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function24 = function23;
        if ((i & 3670016) == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((1879048192 & i) == 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        function26 = function212;
        j5 = j3;
        shape4 = shape3;
        j6 = j4;
        function27 = function211;
        startRestartGroup.endDefaults();
        ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
            public final void invoke(@Nullable Composer composer3, int i102222) {
                if ((i102222 & 11) != 2 || !composer3.getSkipping()) {
                    float f = 8;
                    Modifier m335paddingVpY3zN4 = PaddingKt.m335paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(2));
                    final Function2 function214 = Function2.this;
                    final int i112222 = i3;
                    final Function2 function215 = confirmButton;
                    composer3.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(m335paddingVpY3zN4);
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer m1149constructorimpl = Updater.m1149constructorimpl(composer3);
                    Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-434861445);
                    AlertDialogKt.m707AlertDialogFlowRowixp7dh8(Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                        public final void invoke(@Nullable Composer composer4, int i12) {
                            if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                Function2 function216 = Function2.this;
                                composer4.startReplaceableGroup(-1046483318);
                                if (function216 != null) {
                                    function216.invoke(composer4, Integer.valueOf((i112222 >> 9) & 14));
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer4.endReplaceableGroup();
                                function215.invoke(composer4, Integer.valueOf((i112222 >> 3) & 14));
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 438);
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        });
        int i102222 = (i3 & 14) | 48 | (i3 & 896);
        int i112222 = i3 >> 3;
        composer2 = startRestartGroup;
        m709AlertDialogwqdebIU(onDismissRequest, composableLambda2222, modifier2, function26, function25, shape4, j6, j5, dialogProperties2, startRestartGroup, i102222 | (i112222 & 7168) | (57344 & i112222) | (458752 & i112222) | (i112222 & 3670016) | (i112222 & 29360128) | (i112222 & 234881024), 0);
        function28 = function27;
        modifier3 = modifier2;
        function29 = function26;
        function210 = function25;
        shape5 = shape4;
        j7 = j6;
        j8 = j5;
        dialogProperties3 = dialogProperties2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bd  */
    /* renamed from: AlertDialog-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m709AlertDialogwqdebIU(final Function0 onDismissRequest, final Function2 buttons, Modifier modifier, Function2 function2, Function2 function22, Shape shape, long j, long j2, DialogProperties dialogProperties, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function2 function23;
        int i5;
        long j3;
        long j4;
        DialogProperties dialogProperties2;
        Modifier modifier2;
        Shape shape2;
        long j5;
        int i6;
        Function2 function24;
        Shape shape3;
        Function2 function25;
        long j6;
        DialogProperties dialogProperties3;
        long j7;
        final Modifier modifier3;
        final Function2 function26;
        final Function2 function27;
        final Shape shape4;
        final long j8;
        final long j9;
        final DialogProperties dialogProperties4;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Composer startRestartGroup = composer.startRestartGroup(1035523925);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(buttons) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                function23 = function2;
                i3 |= startRestartGroup.changed(function23) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(function22) ? 16384 : 8192;
                    if ((458752 & i) == 0) {
                        if ((i2 & 32) == 0 && startRestartGroup.changed(shape)) {
                            i9 = 131072;
                            i3 |= i9;
                        }
                        i9 = 65536;
                        i3 |= i9;
                    }
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i8 = 1048576;
                                i3 |= i8;
                            }
                        } else {
                            j3 = j;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    } else {
                        j3 = j;
                    }
                    if ((29360128 & i) != 0) {
                        j4 = j2;
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j4)) ? 8388608 : 4194304;
                    } else {
                        j4 = j2;
                    }
                    if ((234881024 & i) != 0) {
                        if ((i2 & 256) == 0) {
                            dialogProperties2 = dialogProperties;
                            if (startRestartGroup.changed(dialogProperties2)) {
                                i7 = 67108864;
                                i3 |= i7;
                            }
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        i7 = 33554432;
                        i3 |= i7;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i10 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                function23 = null;
                            }
                            Function2 function28 = i5 == 0 ? function22 : null;
                            if ((i2 & 32) == 0) {
                                shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 64) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) == 0) {
                                j5 = ColorsKt.m814contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                j5 = j4;
                            }
                            if ((i2 & 256) == 0) {
                                i6 = i3 & (-234881025);
                                function24 = function28;
                                shape3 = shape2;
                                function25 = function23;
                                j6 = j5;
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                j7 = j3;
                                startRestartGroup.endDefaults();
                                final Modifier modifier4 = modifier2;
                                final Function2 function29 = function25;
                                final Function2 function210 = function24;
                                final Shape shape5 = shape3;
                                final long j10 = j7;
                                final long j11 = j6;
                                final int i11 = i6;
                                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, -1787418772, true, new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                            Function2 function211 = Function2.this;
                                            Modifier modifier5 = modifier4;
                                            Function2 function212 = function29;
                                            Function2 function213 = function210;
                                            Shape shape6 = shape5;
                                            long j12 = j10;
                                            long j13 = j11;
                                            int i13 = i11;
                                            AlertDialogKt.m706AlertDialogContentWMdw5o4(function211, modifier5, function212, function213, shape6, j12, j13, composer2, ((i13 >> 3) & 14) | ((i13 >> 3) & 112) | ((i13 >> 3) & 896) | ((i13 >> 3) & 7168) | ((i13 >> 3) & 57344) | ((i13 >> 3) & 458752) | ((i13 >> 3) & 3670016), 0);
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), startRestartGroup, (i6 & 14) | 384 | ((i6 >> 21) & 112), 0);
                                modifier3 = modifier2;
                                function26 = function25;
                                function27 = function24;
                                shape4 = shape3;
                                j8 = j7;
                                j9 = j6;
                                dialogProperties4 = dialogProperties3;
                            } else {
                                i6 = i3;
                                function24 = function28;
                                shape3 = shape2;
                                function25 = function23;
                                j6 = j5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            modifier2 = modifier;
                            function24 = function22;
                            shape3 = shape;
                            i6 = i3;
                            function25 = function23;
                            j6 = j4;
                        }
                        j7 = j3;
                        dialogProperties3 = dialogProperties2;
                        startRestartGroup.endDefaults();
                        final Modifier modifier42 = modifier2;
                        final Function2 function292 = function25;
                        final Function2 function2102 = function24;
                        final Shape shape52 = shape3;
                        final long j102 = j7;
                        final long j112 = j6;
                        final int i112 = i6;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, -1787418772, true, new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                    Function2 function211 = Function2.this;
                                    Modifier modifier5 = modifier42;
                                    Function2 function212 = function292;
                                    Function2 function213 = function2102;
                                    Shape shape6 = shape52;
                                    long j12 = j102;
                                    long j13 = j112;
                                    int i13 = i112;
                                    AlertDialogKt.m706AlertDialogContentWMdw5o4(function211, modifier5, function212, function213, shape6, j12, j13, composer2, ((i13 >> 3) & 14) | ((i13 >> 3) & 112) | ((i13 >> 3) & 896) | ((i13 >> 3) & 7168) | ((i13 >> 3) & 57344) | ((i13 >> 3) & 458752) | ((i13 >> 3) & 3670016), 0);
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, (i6 & 14) | 384 | ((i6 >> 21) & 112), 0);
                        modifier3 = modifier2;
                        function26 = function25;
                        function27 = function24;
                        shape4 = shape3;
                        j8 = j7;
                        j9 = j6;
                        dialogProperties4 = dialogProperties3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function27 = function22;
                        function26 = function23;
                        shape4 = shape;
                        dialogProperties4 = dialogProperties2;
                        j9 = j4;
                        j8 = j3;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidAlertDialog_androidKt.m709AlertDialogwqdebIU(Function0.this, buttons, modifier3, function26, function27, shape4, j8, j9, dialogProperties4, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                if ((458752 & i) == 0) {
                }
                if ((3670016 & i) != 0) {
                }
                if ((29360128 & i) != 0) {
                }
                if ((234881024 & i) != 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
            }
            function23 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((458752 & i) == 0) {
            }
            if ((3670016 & i) != 0) {
            }
            if ((29360128 & i) != 0) {
            }
            if ((234881024 & i) != 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((29360128 & i) != 0) {
        }
        if ((234881024 & i) != 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
    }
}
