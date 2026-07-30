package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PullToRefresh.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\n\u001a\u00020\u000b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u000b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;", "", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "PositionalThreshold", "getPositionalThreshold-D9Ej5fM", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "indicatorColor", "getIndicatorColor", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "Indicator", "", "state", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "isRefreshing", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "threshold", "Indicator-2poqoh4", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZLandroidx/compose/ui/Modifier;JJFLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullToRefreshDefaults {
    public static final int $stable = 0;
    public static final PullToRefreshDefaults INSTANCE = new PullToRefreshDefaults();
    private static final Shape shape = RoundedCornerShapeKt.getCircleShape();
    private static final float PositionalThreshold = Dp.m6299constructorimpl(80);
    private static final float Elevation = ElevationTokens.INSTANCE.m2855getLevel2D9Ej5fM();

    private PullToRefreshDefaults() {
    }

    public final Shape getShape() {
        return shape;
    }

    public final long getContainerColor(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1066257972, "C419@15907L11:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1066257972, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-containerColor> (PullToRefresh.kt:419)");
        }
        long surfaceContainerHigh = MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurfaceContainerHigh();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return surfaceContainerHigh;
    }

    public final long getIndicatorColor(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1441334156, "C423@16068L11:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1441334156, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorColor> (PullToRefresh.kt:423)");
        }
        long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composer, 6).getOnSurfaceVariant();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return onSurfaceVariant;
    }

    /* renamed from: getPositionalThreshold-D9Ej5fM, reason: not valid java name */
    public final float m2666getPositionalThresholdD9Ej5fM() {
        return PositionalThreshold;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2665getElevationD9Ej5fM() {
        return Elevation;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00bc  */
    /* renamed from: Indicator-2poqoh4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2664Indicator2poqoh4(final PullToRefreshState pullToRefreshState, final boolean z, Modifier modifier, long j, long j2, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        float f2;
        float f3;
        int i4;
        Modifier modifier3;
        Modifier m2679pullToRefreshIndicatorwUdLESc;
        int currentCompositeKeyHash;
        Composer m3333constructorimpl;
        final Modifier modifier4;
        final long j5;
        final float f4;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1076870256);
        ComposerKt.sourceInformation(startRestartGroup, "C(Indicator)P(4,2,3,1:c#ui.graphics.Color,0:c#ui.graphics.Color,5:c#ui.unit.Dp)437@16566L14,438@16627L14,441@16704L1007:PullToRefresh.kt#djiw08");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(pullToRefreshState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    j4 = j2;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (startRestartGroup.changed(f2)) {
                        i5 = 131072;
                        i3 |= i5;
                    }
                } else {
                    f2 = f;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                f2 = f;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changed(this) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j3 = INSTANCE.getContainerColor(startRestartGroup, 6);
                    }
                    if ((i2 & 16) != 0) {
                        j4 = INSTANCE.getIndicatorColor(startRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) == 0) {
                        i4 = i3 & (-458753);
                        modifier3 = companion;
                        f3 = PositionalThreshold;
                    } else {
                        f3 = f;
                        i4 = i3;
                        modifier3 = companion;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    f3 = f;
                    i4 = i3;
                    modifier3 = modifier2;
                }
                long j7 = j3;
                final long j8 = j4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1076870256, i4, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:440)");
                }
                int i9 = i4;
                m2679pullToRefreshIndicatorwUdLESc = PullToRefreshKt.m2679pullToRefreshIndicatorwUdLESc(modifier3, pullToRefreshState, z, (r17 & 4) != 0 ? INSTANCE.m2666getPositionalThresholdD9Ej5fM() : f3, (r17 & 8) != 0 ? INSTANCE.getShape() : null, (r17 & 16) != 0 ? Color.INSTANCE.m3876getUnspecified0d7_KjU() : j7, (r17 & 32) != 0 ? INSTANCE.m2665getElevationD9Ej5fM() : 0.0f);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m2679pullToRefreshIndicatorwUdLESc);
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
                m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 396611011, "C454@17197L504,451@17052L649:PullToRefresh.kt#djiw08");
                CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, AnimationSpecKt.tween$default(100, 0, null, 6, null), (String) null, ComposableLambdaKt.rememberComposableLambda(167807595, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                        invoke(bool.booleanValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z2, Composer composer2, int i10) {
                        float f5;
                        ComposerKt.sourceInformation(composer2, "C:PullToRefresh.kt#djiw08");
                        if ((i10 & 6) == 0) {
                            i10 |= composer2.changed(z2) ? 4 : 2;
                        }
                        if ((i10 & 19) != 18 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(167807595, i10, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:455)");
                            }
                            if (z2) {
                                composer2.startReplaceGroup(576835739);
                                ComposerKt.sourceInformation(composer2, "456@17267L201");
                                f5 = PullToRefreshKt.StrokeWidth;
                                ProgressIndicatorKt.m2047CircularProgressIndicatorLxG7B9w(SizeKt.m726size3ABfNKs(Modifier.INSTANCE, PullToRefreshKt.getSpinnerSize()), j8, f5, 0L, 0, composer2, 390, 24);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(577079337);
                                ComposerKt.sourceInformation(composer2, "463@17581L26,462@17514L155");
                                ComposerKt.sourceInformationMarkerStart(composer2, -1505402512, "CC(remember):PullToRefresh.kt#9igjgp");
                                boolean changed = composer2.changed(pullToRefreshState);
                                final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                Object rememberedValue = composer2.rememberedValue();
                                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1$1$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Float invoke() {
                                            return Float.valueOf(PullToRefreshState.this.getDistanceFraction());
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                PullToRefreshKt.m2671CircularArrowProgressIndicatorRPmYEkk((Function0) rememberedValue, j8, composer2, 0);
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i9 >> 3) & 14) | 24960, 10);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j5 = j7;
                f4 = f3;
                j6 = j8;
            } else {
                startRestartGroup.skipToGroupEnd();
                f4 = f2;
                j6 = j4;
                j5 = j3;
                modifier4 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        PullToRefreshDefaults.this.m2664Indicator2poqoh4(pullToRefreshState, z, modifier4, j5, j6, f4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        long j72 = j3;
        final long j82 = j4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i92 = i4;
        m2679pullToRefreshIndicatorwUdLESc = PullToRefreshKt.m2679pullToRefreshIndicatorwUdLESc(modifier3, pullToRefreshState, z, (r17 & 4) != 0 ? INSTANCE.m2666getPositionalThresholdD9Ej5fM() : f3, (r17 & 8) != 0 ? INSTANCE.getShape() : null, (r17 & 16) != 0 ? Color.INSTANCE.m3876getUnspecified0d7_KjU() : j72, (r17 & 32) != 0 ? INSTANCE.m2665getElevationD9Ej5fM() : 0.0f);
        Alignment center2 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m2679pullToRefreshIndicatorwUdLESc);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl.getInserting()) {
        }
        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m3340setimpl(m3333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 396611011, "C454@17197L504,451@17052L649:PullToRefresh.kt#djiw08");
        CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, AnimationSpecKt.tween$default(100, 0, null, 6, null), (String) null, ComposableLambdaKt.rememberComposableLambda(167807595, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                invoke(bool.booleanValue(), composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z2, Composer composer2, int i10) {
                float f5;
                ComposerKt.sourceInformation(composer2, "C:PullToRefresh.kt#djiw08");
                if ((i10 & 6) == 0) {
                    i10 |= composer2.changed(z2) ? 4 : 2;
                }
                if ((i10 & 19) != 18 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(167807595, i10, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:455)");
                    }
                    if (z2) {
                        composer2.startReplaceGroup(576835739);
                        ComposerKt.sourceInformation(composer2, "456@17267L201");
                        f5 = PullToRefreshKt.StrokeWidth;
                        ProgressIndicatorKt.m2047CircularProgressIndicatorLxG7B9w(SizeKt.m726size3ABfNKs(Modifier.INSTANCE, PullToRefreshKt.getSpinnerSize()), j82, f5, 0L, 0, composer2, 390, 24);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(577079337);
                        ComposerKt.sourceInformation(composer2, "463@17581L26,462@17514L155");
                        ComposerKt.sourceInformationMarkerStart(composer2, -1505402512, "CC(remember):PullToRefresh.kt#9igjgp");
                        boolean changed = composer2.changed(pullToRefreshState);
                        final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                        Object rememberedValue = composer2.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1$1$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(PullToRefreshState.this.getDistanceFraction());
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        PullToRefreshKt.m2671CircularArrowProgressIndicatorRPmYEkk((Function0) rememberedValue, j82, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ((i92 >> 3) & 14) | 24960, 10);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        j5 = j72;
        f4 = f3;
        j6 = j82;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
