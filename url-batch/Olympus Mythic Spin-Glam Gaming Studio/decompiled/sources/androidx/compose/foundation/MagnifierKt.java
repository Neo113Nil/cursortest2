package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Magnifier.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001al\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0011\u001a\u0019\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\")\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00180\u00178\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "sourceCenter", "magnifierCenter", "", "zoom", "Landroidx/compose/foundation/MagnifierStyle;", "style", "Landroidx/compose/ui/unit/DpSize;", "", "onSizeChanged", "magnifier", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLandroidx/compose/foundation/MagnifierStyle;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLandroidx/compose/foundation/MagnifierStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/PlatformMagnifierFactory;)Landroidx/compose/ui/Modifier;", "", "sdkVersion", "", "isPlatformMagnifierSupported", "(I)Z", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "MagnifierPositionInRoot", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MagnifierKt {
    private static final SemanticsPropertyKey MagnifierPositionInRoot = new SemanticsPropertyKey("MagnifierPositionInRoot", null, 2, null);

    public static final boolean isPlatformMagnifierSupported(int i) {
        return i >= 28;
    }

    public static final SemanticsPropertyKey getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    public static final Modifier magnifier(Modifier modifier, final Function1 sourceCenter, final Function1 magnifierCenter, final float f, final MagnifierStyle style, Function1 function1) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Function1 noInspectorInfo = InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName(MagnifierKt.isPlatformMagnifierSupported$default(0, 1, null) ? "magnifier" : "magnifier (not supported)");
                inspectorInfo.getProperties().set("sourceCenter", Function1.this);
                inspectorInfo.getProperties().set("magnifierCenter", magnifierCenter);
                inspectorInfo.getProperties().set("zoom", Float.valueOf(f));
                inspectorInfo.getProperties().set("style", style);
            }
        } : InspectableValueKt.getNoInspectorInfo();
        Modifier modifier2 = Modifier.INSTANCE;
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            modifier2 = magnifier(modifier2, sourceCenter, magnifierCenter, f, style, function1, PlatformMagnifierFactory.Companion.getForCurrentPlatform());
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, modifier2);
    }

    public static /* synthetic */ Modifier magnifier$default(Modifier modifier, Function1 function1, Function1 function12, float f, MagnifierStyle magnifierStyle, Function1 function13, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return Offset.m1288boximpl(m195invoketuRUvjQ((Density) obj2));
                }

                /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
                public final long m195invoketuRUvjQ(@NotNull Density density) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    return Offset.INSTANCE.m1307getUnspecifiedF1C5BW0();
                }
            };
        }
        Function1 function14 = function12;
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            magnifierStyle = MagnifierStyle.INSTANCE.getDefault();
        }
        MagnifierStyle magnifierStyle2 = magnifierStyle;
        if ((i & 16) != 0) {
            function13 = null;
        }
        return magnifier(modifier, function1, function14, f2, magnifierStyle2, function13);
    }

    public static final Modifier magnifier(Modifier modifier, Function1 sourceCenter, Function1 magnifierCenter, float f, MagnifierStyle style, Function1 function1, PlatformMagnifierFactory platformMagnifierFactory) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(platformMagnifierFactory, "platformMagnifierFactory");
        return ComposedModifierKt.composed$default(modifier, null, new MagnifierKt$magnifier$4(sourceCenter, magnifierCenter, f, function1, platformMagnifierFactory, style), 1, null);
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i);
    }
}
