package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* compiled from: Divider.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a=\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/Dp;", "thickness", "startIndent", "", "Divider-oMI9zvI", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "Divider", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DividerKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0068  */
    /* renamed from: Divider-oMI9zvI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m836DivideroMI9zvI(Modifier modifier, long j, float f, float f2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        float f3;
        int i4;
        float f4;
        final Modifier modifier3;
        final long m1445copywmQWz5c$default;
        Modifier m338paddingqDBjuR0$default;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1249392198);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                j2 = j;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            j2 = j;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        m1445copywmQWz5c$default = (i2 & 2) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m795getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
                        if (i7 != 0) {
                            f3 = Dp.m2507constructorimpl(1);
                        }
                        if (i4 != 0) {
                            f4 = Dp.m2507constructorimpl(0);
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        m1445copywmQWz5c$default = j2;
                    }
                    startRestartGroup.endDefaults();
                    if (f4 != 0.0f) {
                        m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(Modifier.INSTANCE, f4, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        m338paddingqDBjuR0$default = Modifier.INSTANCE;
                    }
                    startRestartGroup.startReplaceableGroup(1228914189);
                    float m2507constructorimpl = Dp.m2509equalsimpl0(f3, Dp.INSTANCE.m2514getHairlineD9Ej5fM()) ? Dp.m2507constructorimpl(1.0f / ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity()) : f3;
                    startRestartGroup.endReplaceableGroup();
                    BoxKt.Box(BackgroundKt.m158backgroundbw27NRU$default(SizeKt.m347height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(m338paddingqDBjuR0$default), 0.0f, 1, null), m2507constructorimpl), m1445copywmQWz5c$default, null, 2, null), startRestartGroup, 0);
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    m1445copywmQWz5c$default = j2;
                }
                final float f5 = f3;
                final float f6 = f4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.DividerKt$Divider$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i8) {
                        DividerKt.m836DivideroMI9zvI(Modifier.this, m1445copywmQWz5c$default, f5, f6, composer2, i | 1, i2);
                    }
                });
                return;
            }
            f4 = f2;
            if ((i3 & 5851) == 1170) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            startRestartGroup.endDefaults();
            if (f4 != 0.0f) {
            }
            startRestartGroup.startReplaceableGroup(1228914189);
            if (Dp.m2509equalsimpl0(f3, Dp.INSTANCE.m2514getHairlineD9Ej5fM())) {
            }
            startRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m158backgroundbw27NRU$default(SizeKt.m347height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(m338paddingqDBjuR0$default), 0.0f, 1, null), m2507constructorimpl), m1445copywmQWz5c$default, null, 2, null), startRestartGroup, 0);
            final float f52 = f3;
            final float f62 = f4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f3 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        startRestartGroup.endDefaults();
        if (f4 != 0.0f) {
        }
        startRestartGroup.startReplaceableGroup(1228914189);
        if (Dp.m2509equalsimpl0(f3, Dp.INSTANCE.m2514getHairlineD9Ej5fM())) {
        }
        startRestartGroup.endReplaceableGroup();
        BoxKt.Box(BackgroundKt.m158backgroundbw27NRU$default(SizeKt.m347height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(m338paddingqDBjuR0$default), 0.0f, 1, null), m2507constructorimpl), m1445copywmQWz5c$default, null, 2, null), startRestartGroup, 0);
        final float f522 = f3;
        final float f622 = f4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
