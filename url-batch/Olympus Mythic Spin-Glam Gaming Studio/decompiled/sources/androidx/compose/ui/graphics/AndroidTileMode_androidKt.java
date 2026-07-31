package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.TileMode;
import kotlin.Metadata;

/* compiled from: AndroidTileMode.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0004\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/TileMode;", "Landroid/graphics/Shader$TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "toAndroidTileMode", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidTileMode_androidKt {

    /* compiled from: AndroidTileMode.android.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m1385toAndroidTileMode0vamqd0(int i) {
        TileMode.Companion companion = TileMode.INSTANCE;
        if (TileMode.m1609equalsimpl0(i, companion.m1613getClamp3opZhB0())) {
            return Shader.TileMode.CLAMP;
        }
        if (TileMode.m1609equalsimpl0(i, companion.m1616getRepeated3opZhB0())) {
            return Shader.TileMode.REPEAT;
        }
        if (TileMode.m1609equalsimpl0(i, companion.m1615getMirror3opZhB0())) {
            return Shader.TileMode.MIRROR;
        }
        if (TileMode.m1609equalsimpl0(i, companion.m1614getDecal3opZhB0())) {
            if (Build.VERSION.SDK_INT >= 31) {
                return TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }
}
