package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a%\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/layout/AndroidWindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "side", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberWindowInsetsConnection-VRgvIgI", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberWindowInsetsConnection", "", "PlatformFlingScrollFriction", "F", "", "DecelerationRate", "D", "DecelMinusOne", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WindowInsetsConnection_androidKt {
    private static final double DecelMinusOne;
    private static final double DecelerationRate;
    private static final float PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();

    /* renamed from: rememberWindowInsetsConnection-VRgvIgI, reason: not valid java name */
    public static final NestedScrollConnection m369rememberWindowInsetsConnectionVRgvIgI(AndroidWindowInsets windowInsets, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        composer.startReplaceableGroup(-1011341039);
        if (Build.VERSION.SDK_INT < 30) {
            DoNothingNestedScrollConnection doNothingNestedScrollConnection = DoNothingNestedScrollConnection.INSTANCE;
            composer.endReplaceableGroup();
            return doNothingNestedScrollConnection;
        }
        SideCalculator m344chooseCalculatorni1skBw = SideCalculator.INSTANCE.m344chooseCalculatorni1skBw(i, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {windowInsets, view, m344chooseCalculatorni1skBw, density};
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new WindowInsetsNestedScrollConnection(windowInsets, view, m344chooseCalculatorni1skBw, density);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) rememberedValue;
        EffectsKt.DisposableEffect(windowInsetsNestedScrollConnection, new Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = WindowInsetsNestedScrollConnection.this;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        WindowInsetsNestedScrollConnection.this.dispose();
                    }
                };
            }
        }, composer, 8);
        composer.endReplaceableGroup();
        return windowInsetsNestedScrollConnection;
    }

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        DecelerationRate = log;
        DecelMinusOne = log - 1.0d;
    }
}
