package com.google.googlesignin;

import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class TokenPendingResult extends PendingResult<TokenResult> {
    private static final String TAG = "TokenPendingResult";
    private CountDownLatch latch = new CountDownLatch(1);
    private final long requestHandle;
    private TokenResult result;
    private ResultCallback<? super TokenResult> resultCallback;

    public TokenPendingResult(long j4) {
        this.requestHandle = j4;
        TokenResult tokenResult = new TokenResult();
        this.result = tokenResult;
        tokenResult.setHandle(j4);
    }

    private synchronized ResultCallback<? super TokenResult> getCallback() {
        return this.resultCallback;
    }

    private synchronized TokenResult getResult() {
        return this.result;
    }

    private synchronized void setCallback(ResultCallback<? super TokenResult> resultCallback) {
        this.resultCallback = resultCallback;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public void cancel() {
        setResult(null, 16);
        this.latch.countDown();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public boolean isCanceled() {
        return getResult() != null && getResult().getStatus().isCanceled();
    }

    public synchronized void setResult(GoogleSignInAccount googleSignInAccount, int i4) {
        TokenResult tokenResult = new TokenResult(googleSignInAccount, i4);
        this.result = tokenResult;
        tokenResult.setHandle(this.requestHandle);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public void setResultCallback(ResultCallback<? super TokenResult> resultCallback) {
        if (this.latch.getCount() == 0) {
            resultCallback.onResult(getResult());
        } else {
            setCallback(resultCallback);
        }
    }

    public void setStatus(int i4) {
        this.result.setStatus(i4);
        this.latch.countDown();
        ResultCallback<? super TokenResult> callback = getCallback();
        TokenResult result = getResult();
        if (callback != null) {
            Log.d(TAG, " Calling onResult for callback. result: " + result);
            getCallback().onResult(result);
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public TokenResult await() {
        try {
            this.latch.await();
        } catch (InterruptedException unused) {
            setResult(null, 14);
        }
        return getResult();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public void setResultCallback(ResultCallback<? super TokenResult> resultCallback, long j4, TimeUnit timeUnit) {
        try {
            if (!this.latch.await(j4, timeUnit)) {
                setResult(null, 15);
            }
        } catch (InterruptedException unused) {
            setResult(null, 14);
        }
        resultCallback.onResult(getResult());
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public TokenResult await(long j4, TimeUnit timeUnit) {
        try {
            if (!this.latch.await(j4, timeUnit)) {
                setResult(null, 15);
            }
        } catch (InterruptedException unused) {
            setResult(null, 14);
        }
        return getResult();
    }
}
