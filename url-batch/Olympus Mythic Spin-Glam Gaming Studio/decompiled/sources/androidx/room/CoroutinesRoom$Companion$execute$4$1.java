package androidx.room;

import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutinesRoom.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
final class CoroutinesRoom$Companion$execute$4$1 extends Lambda implements Function1 {
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ Job $job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, Job job) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$job = job;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Throwable th) {
        SupportSQLiteCompat.Api16Impl.cancel(this.$cancellationSignal);
        Job.DefaultImpls.cancel$default(this.$job, null, 1, null);
    }
}
