package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;

/* compiled from: PointerIcon.kt */
@StabilityInferred
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIconDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerIcon;", "Default", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getDefault", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "Crosshair", "getCrosshair", "Text", "getText", "Hand", "getHand", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PointerIconDefaults {
    public static final PointerIconDefaults INSTANCE = new PointerIconDefaults();
    private static final PointerIcon Default = PointerIcon_androidKt.getPointerIconDefault();
    private static final PointerIcon Crosshair = PointerIcon_androidKt.getPointerIconCrosshair();
    private static final PointerIcon Text = PointerIcon_androidKt.getPointerIconText();
    private static final PointerIcon Hand = PointerIcon_androidKt.getPointerIconHand();

    private PointerIconDefaults() {
    }
}
