package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PressGestureScope extends Density {

    /* compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Object awaitRelease(Continuation continuation);

    Object tryAwaitRelease(Continuation continuation);
}
