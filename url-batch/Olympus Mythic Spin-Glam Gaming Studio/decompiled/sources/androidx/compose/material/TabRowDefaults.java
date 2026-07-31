package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.NetError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabRow.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0019\u0010\u0013\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R \u0010\u001b\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "thickness", "Landroidx/compose/ui/graphics/Color;", "color", "", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Divider", "height", "Indicator-9IZ8Weo", "Indicator", "Landroidx/compose/material/TabPosition;", "currentTabPosition", "tabIndicatorOffset", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/TabPosition;)Landroidx/compose/ui/Modifier;", "DividerThickness", "F", "getDividerThickness-D9Ej5fM", "()F", "IndicatorHeight", "getIndicatorHeight-D9Ej5fM", "ScrollableTabRowPadding", "getScrollableTabRowPadding-D9Ej5fM", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TabRowDefaults {
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float DividerThickness = Dp.m2507constructorimpl(1);
    private static final float IndicatorHeight = Dp.m2507constructorimpl(2);
    private static final float ScrollableTabRowPadding = Dp.m2507constructorimpl(52);

    public final Modifier tabIndicatorOffset(Modifier modifier, final TabPosition currentTabPosition) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(currentTabPosition, "currentTabPosition");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("tabIndicatorOffset");
                inspectorInfo.setValue(TabPosition.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-398757863);
                State m101animateDpAsStateKz89ssw = AnimateAsStateKt.m101animateDpAsStateKz89ssw(TabPosition.this.getWidth(), AnimationSpecKt.tween$default(POBCommonConstants.DEFAULT_MIN_BITRATE, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, composer, 0, 4);
                Modifier m362width3ABfNKs = SizeKt.m362width3ABfNKs(OffsetKt.m325offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(composed, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart(), false, 2, null), m1021invoke$lambda1(AnimateAsStateKt.m101animateDpAsStateKz89ssw(TabPosition.this.getLeft(), AnimationSpecKt.tween$default(POBCommonConstants.DEFAULT_MIN_BITRATE, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, composer, 0, 4)), 0.0f, 2, null), m1020invoke$lambda0(m101animateDpAsStateKz89ssw));
                composer.endReplaceableGroup();
                return m362width3ABfNKs;
            }

            /* renamed from: invoke$lambda-0, reason: not valid java name */
            private static final float m1020invoke$lambda0(State state) {
                return ((Dp) state.getValue()).getValue();
            }

            /* renamed from: invoke$lambda-1, reason: not valid java name */
            private static final float m1021invoke$lambda1(State state) {
                return ((Dp) state.getValue()).getValue();
            }
        });
    }

    private TabRowDefaults() {
    }

    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public final void m1016Divider9IZ8Weo(Modifier modifier, float f, long j, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        float f2;
        long j2;
        Modifier modifier3;
        float f3;
        final long m1445copywmQWz5c$default;
        final float f4;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(910934799);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (startRestartGroup.changed(f2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                f2 = f;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            f2 = f;
        }
        if ((i & 896) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(this) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    f3 = DividerThickness;
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                } else {
                    f3 = f2;
                }
                if ((i2 & 4) != 0) {
                    m1445copywmQWz5c$default = Color.m1445copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).getValue(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -897;
                    startRestartGroup.endDefaults();
                    DividerKt.m836DivideroMI9zvI(modifier3, m1445copywmQWz5c$default, f3, 0.0f, startRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 8);
                    f4 = f3;
                    modifier2 = modifier3;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier3 = modifier2;
                f3 = f2;
            }
            m1445copywmQWz5c$default = j2;
            startRestartGroup.endDefaults();
            DividerKt.m836DivideroMI9zvI(modifier3, m1445copywmQWz5c$default, f3, 0.0f, startRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 8);
            f4 = f3;
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            f4 = f2;
            m1445copywmQWz5c$default = j2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabRowDefaults$Divider$1
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
                TabRowDefaults.this.m1016Divider9IZ8Weo(modifier2, f4, m1445copywmQWz5c$default, composer2, i | 1, i2);
            }
        });
    }

    /* renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    public final void m1017Indicator9IZ8Weo(Modifier modifier, float f, long j, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        float f2;
        long j2;
        Modifier modifier3;
        float f3;
        final float f4;
        final long j3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(1499002201);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (startRestartGroup.changed(f2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                f2 = f;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            f2 = f;
        }
        if ((i & 896) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(this) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                f3 = (i2 & 2) != 0 ? IndicatorHeight : f2;
                if ((i2 & 4) != 0) {
                    j2 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).getValue();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                f3 = f2;
            }
            startRestartGroup.endDefaults();
            BoxKt.Box(BackgroundKt.m158backgroundbw27NRU$default(SizeKt.m347height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), f3), j2, null, 2, null), startRestartGroup, 0);
            f4 = f3;
            j3 = j2;
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            f4 = f2;
            j3 = j2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabRowDefaults$Indicator$1
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
                TabRowDefaults.this.m1017Indicator9IZ8Weo(modifier2, f4, j3, composer2, i | 1, i2);
            }
        });
    }

    /* renamed from: getIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1018getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    /* renamed from: getScrollableTabRowPadding-D9Ej5fM, reason: not valid java name */
    public final float m1019getScrollableTabRowPaddingD9Ej5fM() {
        return ScrollableTabRowPadding;
    }
}
