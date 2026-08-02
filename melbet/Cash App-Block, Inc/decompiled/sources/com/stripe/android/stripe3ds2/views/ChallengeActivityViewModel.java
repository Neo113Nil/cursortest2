package com.stripe.android.stripe3ds2.views;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default;
import com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer;
import com.stripe.android.stripe3ds2.utils.ImageCache$Default;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes8.dex */
public final class ChallengeActivityViewModel extends ViewModel {
    public final OnInactiveAwareMutableLiveData _challengeRequestResult;
    public final OnInactiveAwareMutableLiveData _nextScreen;
    public final MutableLiveData _refreshUi;
    public final MutableLiveData _shouldFinish;
    public final MutableLiveData _submitClicked;
    public final ChallengeActionHandler$Default challengeActionHandler;
    public final OnInactiveAwareMutableLiveData challengeRequestResult;
    public final MutableLiveData challengeText;
    public final ImageCache$Default imageCache;
    public final TextSetter imageRepository;
    public final OnInactiveAwareMutableLiveData nextScreen;
    public final MutableLiveData refreshUi;
    public boolean shouldAutoSubmitOOB;
    public final MutableLiveData shouldFinish;
    public boolean shouldRefreshUi;
    public final MutableLiveData submitClicked;
    public final DefaultTransactionTimer transactionTimer;
    public final StandaloneCoroutine transactionTimerJob;

    public final class OnInactiveAwareMutableLiveData extends MutableLiveData {
        @Override // androidx.lifecycle.LiveData
        public final void onInactive() {
            super.onInactive();
            setValue(null);
        }
    }

    public ChallengeActivityViewModel(ChallengeActionHandler$Default challengeActionHandler$Default, DefaultTransactionTimer defaultTransactionTimer, DefaultErrorReporter defaultErrorReporter) {
        ImageCache$Default imageCache$Default = ImageCache$Default.INSTANCE;
        challengeActionHandler$Default.getClass();
        defaultTransactionTimer.getClass();
        defaultErrorReporter.getClass();
        this.challengeActionHandler = challengeActionHandler$Default;
        this.transactionTimer = defaultTransactionTimer;
        this.imageCache = imageCache$Default;
        this.imageRepository = new TextSetter(defaultErrorReporter, ViewModelKt.getViewModelScope(this).coroutineContext);
        MutableLiveData mutableLiveData = new MutableLiveData();
        this._refreshUi = mutableLiveData;
        this.refreshUi = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this._submitClicked = mutableLiveData2;
        this.submitClicked = mutableLiveData2;
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        this._shouldFinish = mutableLiveData3;
        this.shouldFinish = mutableLiveData3;
        this.challengeText = new MutableLiveData();
        OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData = new OnInactiveAwareMutableLiveData();
        this._challengeRequestResult = onInactiveAwareMutableLiveData;
        this.challengeRequestResult = onInactiveAwareMutableLiveData;
        OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData2 = new OnInactiveAwareMutableLiveData();
        this._nextScreen = onInactiveAwareMutableLiveData2;
        this.nextScreen = onInactiveAwareMutableLiveData2;
        this.transactionTimerJob = JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HazeSourceNode$launchPreDraw$1(this, null, 8), 3);
    }

    public final void submit(ChallengeAction challengeAction) {
        challengeAction.getClass();
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new Logger$log$1(this, challengeAction, (Continuation) null, 11), 3);
    }
}
