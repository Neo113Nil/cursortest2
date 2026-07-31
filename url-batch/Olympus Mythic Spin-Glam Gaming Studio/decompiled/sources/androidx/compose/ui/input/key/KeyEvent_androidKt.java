package androidx.compose.ui.input.key;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyEvent.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"\u0018\u0010\u000f\u001a\u00020\f*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\f*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e*\n\u0010\u0013\"\u00020\u00122\u00020\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "Landroidx/compose/ui/input/key/Key;", "getKey-ZmokQxo", "(Landroid/view/KeyEvent;)J", "key", "", "getUtf16CodePoint-ZmokQxo", "(Landroid/view/KeyEvent;)I", "utf16CodePoint", "Landroidx/compose/ui/input/key/KeyEventType;", "getType-ZmokQxo", "type", "", "isCtrlPressed-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isCtrlPressed", "isShiftPressed-ZmokQxo", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyEvent_androidKt {
    /* renamed from: getKey-ZmokQxo, reason: not valid java name */
    public static final long m1810getKeyZmokQxo(android.view.KeyEvent key) {
        Intrinsics.checkNotNullParameter(key, "$this$key");
        return Key_androidKt.Key(key.getKeyCode());
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo, reason: not valid java name */
    public static final int m1812getUtf16CodePointZmokQxo(android.view.KeyEvent utf16CodePoint) {
        Intrinsics.checkNotNullParameter(utf16CodePoint, "$this$utf16CodePoint");
        return utf16CodePoint.getUnicodeChar();
    }

    /* renamed from: getType-ZmokQxo, reason: not valid java name */
    public static final int m1811getTypeZmokQxo(android.view.KeyEvent type) {
        Intrinsics.checkNotNullParameter(type, "$this$type");
        int action = type.getAction();
        if (action == 0) {
            return KeyEventType.INSTANCE.m1807getKeyDownCS__XNY();
        }
        if (action == 1) {
            return KeyEventType.INSTANCE.m1808getKeyUpCS__XNY();
        }
        return KeyEventType.INSTANCE.m1809getUnknownCS__XNY();
    }

    /* renamed from: isCtrlPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m1813isCtrlPressedZmokQxo(android.view.KeyEvent isCtrlPressed) {
        Intrinsics.checkNotNullParameter(isCtrlPressed, "$this$isCtrlPressed");
        return isCtrlPressed.isCtrlPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m1814isShiftPressedZmokQxo(android.view.KeyEvent isShiftPressed) {
        Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isShiftPressed");
        return isShiftPressed.isShiftPressed();
    }
}
