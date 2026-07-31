package androidx.compose.ui.viewinterop;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidViewHolder.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidViewHolder$onCommitAffectingUpdate$1 extends Lambda implements Function1 {
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$onCommitAffectingUpdate$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.this$0 = androidViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AndroidViewHolder) obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m2613invoke$lambda0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.mo4828invoke();
    }

    public final void invoke(@NotNull AndroidViewHolder it) {
        final Function0 function0;
        Intrinsics.checkNotNullParameter(it, "it");
        Handler handler = this.this$0.getHandler();
        function0 = this.this$0.runUpdate;
        handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$onCommitAffectingUpdate$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AndroidViewHolder$onCommitAffectingUpdate$1.m2613invoke$lambda0(Function0.this);
            }
        });
    }
}
