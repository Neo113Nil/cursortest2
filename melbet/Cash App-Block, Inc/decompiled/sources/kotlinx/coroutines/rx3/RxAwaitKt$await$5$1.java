package kotlinx.coroutines.rx3;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancelledContinuation;
import kotlinx.coroutines.NotCompleted;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class RxAwaitKt$await$5$1 implements CredentialManagerCallback, OnFailureListener, OnCompleteListener, SingleObserver {
    public final /* synthetic */ CancellableContinuationImpl $cont;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RxAwaitKt$await$5$1(CancellableContinuationImpl cancellableContinuationImpl, int i) {
        this.$r8$classId = i;
        this.$cont = cancellableContinuationImpl;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.$r8$classId;
        CancellableContinuationImpl cancellableContinuationImpl = this.$cont;
        task.getClass();
        switch (i) {
            case 3:
                if (!task.isSuccessful()) {
                    Exception exception = task.getException();
                    exception.getClass();
                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiException) exception).mStatus.zza, "Failure: status code = "), new Object[0]);
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(null);
                    break;
                } else {
                    Object result = task.getResult();
                    result.getClass();
                    Timber.Forest.d("Success: wallet ID", new Object[0]);
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuationImpl.resumeWith((String) result);
                    break;
                }
            default:
                Result.Companion companion3 = Result.Companion;
                cancellableContinuationImpl.resumeWith(task);
                break;
        }
    }

    @Override // androidx.credentials.CredentialManagerCallback
    public void onError(Object obj) {
        GetCredentialException getCredentialException = (GetCredentialException) obj;
        getCredentialException.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = this.$cont;
        if (cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof NotCompleted) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(new Result.Failure(getCredentialException));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        CancellableContinuationImpl cancellableContinuationImpl = this.$cont;
        if (cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation) {
            return;
        }
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(new Result.Failure(exc));
    }

    @Override // androidx.credentials.CredentialManagerCallback
    public void onResult(Object obj) {
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
        getCredentialResponse.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = this.$cont;
        if (cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof NotCompleted) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(getCredentialResponse);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSubscribe(Disposable disposable) {
        this.$cont.invokeOnCancellation(new ForwardingFileSystem$$ExternalSyntheticLambda0(disposable, 18));
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(Object obj) {
        Result.Companion companion = Result.Companion;
        this.$cont.resumeWith(obj);
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        this.$cont.resumeWith(SafeTrace.createFailure(th));
    }
}
