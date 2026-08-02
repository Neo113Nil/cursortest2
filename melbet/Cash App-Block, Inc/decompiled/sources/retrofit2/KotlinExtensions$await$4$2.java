package retrofit2;

import coil3.network.okhttp.internal.CallsKt$await$2$2$onResponse$1;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.squareup.address.typeahead.backend.api.AddressSearcher$SearchResult;
import java.io.IOException;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import timber.log.Timber;

/* loaded from: classes9.dex */
public final class KotlinExtensions$await$4$2 implements okhttp3.Callback, OnFailureListener, OnCompleteListener, Callback {
    public final /* synthetic */ CancellableContinuationImpl $continuation;

    public /* synthetic */ KotlinExtensions$await$4$2(CancellableContinuationImpl cancellableContinuationImpl) {
        this.$continuation = cancellableContinuationImpl;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        task.getClass();
        boolean isSuccessful = task.isSuccessful();
        CancellableContinuationImpl cancellableContinuationImpl = this.$continuation;
        if (!isSuccessful) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(null);
        } else {
            Object result = task.getResult();
            result.getClass();
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl.resumeWith((String) result);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Timber.Forest.e("Places autocomplete failed", new Object[0], exc);
        Result.Companion companion = Result.Companion;
        this.$continuation.resumeWith(AddressSearcher$SearchResult.Failure.INSTANCE);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        call.getClass();
        boolean z = response.rawResponse.isSuccessful;
        CancellableContinuationImpl cancellableContinuationImpl = this.$continuation;
        if (z) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(response.body);
        } else {
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl.resumeWith(new Result.Failure(new HttpException(response)));
        }
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        Result.Companion companion = Result.Companion;
        this.$continuation.resumeWith(new Result.Failure(th));
    }

    @Override // okhttp3.Callback
    public void onFailure(okhttp3.Call call, IOException iOException) {
        Result.Companion companion = Result.Companion;
        this.$continuation.resumeWith(new Result.Failure(iOException));
    }

    @Override // okhttp3.Callback
    public void onResponse(okhttp3.Call call, okhttp3.Response response) {
        this.$continuation.resume(response, CallsKt$await$2$2$onResponse$1.INSTANCE);
    }
}
