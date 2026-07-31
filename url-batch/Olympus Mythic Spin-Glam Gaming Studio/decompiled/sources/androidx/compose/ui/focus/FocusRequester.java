package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FocusRequester.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "<init>", "()V", "", "requestFocus", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "focusRequesterModifierLocals", "Landroidx/compose/runtime/collection/MutableVector;", "getFocusRequesterModifierLocals$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FocusRequester {
    private final MutableVector focusRequesterModifierLocals = new MutableVector(new FocusRequesterModifierLocal[16], 0);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = MutableVector.$stable;
    private static final FocusRequester Default = new FocusRequester();

    /* renamed from: getFocusRequesterModifierLocals$ui_release, reason: from getter */
    public final MutableVector getFocusRequesterModifierLocals() {
        return this.focusRequesterModifierLocals;
    }

    public final void requestFocus() {
        if (!this.focusRequesterModifierLocals.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector mutableVector = this.focusRequesterModifierLocals;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                FocusModifier findFocusNode = ((FocusRequesterModifierLocal) content[i]).findFocusNode();
                if (findFocusNode != null) {
                    FocusTransactionsKt.requestFocus(findFocusNode);
                }
                i++;
            } while (i < size);
        }
    }

    /* compiled from: FocusRequester.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/focus/FocusRequester;", "Default", "Landroidx/compose/ui/focus/FocusRequester;", "getDefault", "()Landroidx/compose/ui/focus/FocusRequester;", "FocusRequesterFactory", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FocusRequester getDefault() {
            return FocusRequester.Default;
        }

        /* compiled from: FocusRequester.kt */
        @StabilityInferred
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        @ExperimentalComposeUiApi
        public static final class FocusRequesterFactory {
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            private FocusRequesterFactory() {
            }
        }
    }
}
