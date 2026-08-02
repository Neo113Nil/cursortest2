package retrofit2;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class KotlinExtensions$awaitResponse$2$2 implements OnFailureListener, OnCompleteListener, Callback {
    public final /* synthetic */ CancellableContinuationImpl $continuation;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ KotlinExtensions$awaitResponse$2$2(CancellableContinuationImpl cancellableContinuationImpl, int i) {
        this.$r8$classId = i;
        this.$continuation = cancellableContinuationImpl;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        task.getClass();
        Result.Companion companion = Result.Companion;
        this.$continuation.resumeWith(task);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = this.$r8$classId;
        CancellableContinuationImpl cancellableContinuationImpl = this.$continuation;
        switch (i) {
            case 1:
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(null);
                break;
            case 2:
                Timber.Forest.e("Current location failure", new Object[0], exc);
                Result.Companion companion2 = Result.Companion;
                cancellableContinuationImpl.resumeWith(null);
                break;
            case 3:
            default:
                Result.Companion companion3 = Result.Companion;
                cancellableContinuationImpl.resumeWith(new Result(new Result.Failure(exc)));
                break;
            case 4:
                Result.Companion companion4 = Result.Companion;
                cancellableContinuationImpl.resumeWith(new Result(new Result.Failure(exc)));
                break;
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        call.getClass();
        Result.Companion companion = Result.Companion;
        this.$continuation.resumeWith(response);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        Result.Companion companion = Result.Companion;
        this.$continuation.resumeWith(new Result.Failure(th));
    }
}
