package androidx.compose.ui.viewinterop;

import android.os.Looper;
import com.ironsource.sdk.controller.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidViewHolder.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", f.b.g, "Lkotlin/Function0;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidViewHolder$snapshotObserver$1 extends Lambda implements Function1 {
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$snapshotObserver$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.this$0 = androidViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Function0) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull final Function0 command) {
        Intrinsics.checkNotNullParameter(command, "command");
        if (this.this$0.getHandler().getLooper() == Looper.myLooper()) {
            command.mo4828invoke();
        } else {
            this.this$0.getHandler().post(new Runnable() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$snapshotObserver$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidViewHolder$snapshotObserver$1.m2615invoke$lambda0(Function0.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m2615invoke$lambda0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.mo4828invoke();
    }
}
