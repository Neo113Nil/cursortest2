package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: KeyboardActions.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0097\u0001\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0012\u0010\u000fR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0013\u0010\u000fR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "", "onDone", "onGo", "onNext", "onPrevious", "onSearch", "onSend", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "getOnDone", "()Lkotlin/jvm/functions/Function1;", "getOnGo", "getOnNext", "getOnPrevious", "getOnSearch", "getOnSend", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class KeyboardActions {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);
    private final Function1 onDone;
    private final Function1 onGo;
    private final Function1 onNext;
    private final Function1 onPrevious;
    private final Function1 onSearch;
    private final Function1 onSend;

    public KeyboardActions(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16) {
        this.onDone = function1;
        this.onGo = function12;
        this.onNext = function13;
        this.onPrevious = function14;
        this.onSearch = function15;
        this.onSend = function16;
    }

    public /* synthetic */ KeyboardActions(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function14, (i & 16) != 0 ? null : function15, (i & 32) != 0 ? null : function16);
    }

    public final Function1 getOnDone() {
        return this.onDone;
    }

    public final Function1 getOnGo() {
        return this.onGo;
    }

    public final Function1 getOnNext() {
        return this.onNext;
    }

    public final Function1 getOnPrevious() {
        return this.onPrevious;
    }

    public final Function1 getOnSearch() {
        return this.onSearch;
    }

    public final Function1 getOnSend() {
        return this.onSend;
    }

    /* compiled from: KeyboardActions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions$Companion;", "", "()V", "Default", "Landroidx/compose/foundation/text/KeyboardActions;", "getDefault", "()Landroidx/compose/foundation/text/KeyboardActions;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }
    }
}
