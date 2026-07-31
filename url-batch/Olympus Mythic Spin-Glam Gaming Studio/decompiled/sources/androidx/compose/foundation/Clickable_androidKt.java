package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Clickable.android.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\f\u0010\f\u001a\u00020\u0005*\u00020\rH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0004\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"TapIndicationDelay", "", "getTapIndicationDelay", "()J", "isClick", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isClick-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isComposeRootInScrollableContainer", "Lkotlin/Function0;", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "isInScrollableViewGroup", "Landroid/view/View;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final Function0 isComposeRootInScrollableContainer(Composer composer, int i) {
        composer.startReplaceableGroup(-1990508712);
        final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Function0 function0 = new Function0() { // from class: androidx.compose.foundation.Clickable_androidKt$isComposeRootInScrollableContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Boolean mo4828invoke() {
                boolean isInScrollableViewGroup;
                isInScrollableViewGroup = Clickable_androidKt.isInScrollableViewGroup(view);
                return Boolean.valueOf(isInScrollableViewGroup);
            }
        };
        composer.endReplaceableGroup();
        return function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m183isClickZmokQxo(KeyEvent isClick) {
        int m1818getNativeKeyCodeYVgTNJs;
        Intrinsics.checkNotNullParameter(isClick, "$this$isClick");
        return KeyEventType.m1803equalsimpl0(KeyEvent_androidKt.m1811getTypeZmokQxo(isClick), KeyEventType.INSTANCE.m1808getKeyUpCS__XNY()) && ((m1818getNativeKeyCodeYVgTNJs = Key_androidKt.m1818getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m1810getKeyZmokQxo(isClick))) == 23 || m1818getNativeKeyCodeYVgTNJs == 66 || m1818getNativeKeyCodeYVgTNJs == 160);
    }
}
