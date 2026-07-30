package com.crrepa.band.my.health.widgets.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RawRes;
import androidx.annotation.StringRes;
import com.airbnb.lottie.LottieAnimationView;
import com.crrepa.band.aviator.R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class j extends Dialog {
    private LottieAnimationView lavLoading;
    private c onDoneListener;
    private TextView tvLoadingHint;

    class a implements com.airbnb.lottie.m0 {
        a() {
        }

        @Override // com.airbnb.lottie.m0
        public void onCompositionLoaded(com.airbnb.lottie.h hVar) {
            com.orhanobut.logger.f.d("onCompositionLoaded");
            j.this.onDone();
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            if (j.this.onDoneListener != null) {
                j.this.dismiss();
                j.this.onDoneListener.onDone();
            }
        }
    }

    public interface c {
        void onDone();
    }

    public j(@NonNull Context context) {
        super(context, R.style.UserInfoChooceDialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void onDone() {
        Observable.timer(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
    }

    private void setHint(String str) {
        this.tvLoadingHint.setText(str);
    }

    private void setLoadingAnimation(@RawRes int i8, boolean z7) {
        this.lavLoading.setAnimation(i8);
        this.lavLoading.setRepeatCount(z7 ? -1 : 0);
        this.lavLoading.playAnimation();
    }

    private void setLoadingResult(@RawRes int i8, @StringRes int i9) {
        this.lavLoading.addLottieOnCompositionLoadedListener(new a());
        setLoadingAnimation(i8, false);
        setHint(getContext().getString(i9));
    }

    public void complete() {
        setLoadingResult(R.raw.ani_loading_complete, R.string.delete_watch_face_complete_hint);
    }

    public void error() {
        setLoadingResult(R.raw.ani_loading_error, R.string.delete_watch_face_error_hint);
    }

    public void loading() {
        setLoadingAnimation(R.raw.ani_loading, true);
        setHint(getContext().getString(R.string.delete_watch_face_hint));
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_loading);
        this.lavLoading = (LottieAnimationView) findViewById(R.id.lav_loading);
        this.tvLoadingHint = (TextView) findViewById(R.id.tv_loading_hint);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    public void setOnDoneListener(c cVar) {
        this.onDoneListener = cVar;
    }

    public void complete(int i8) {
        setLoadingResult(R.raw.ani_loading_complete, i8);
    }

    public void error(int i8) {
        setLoadingResult(R.raw.ani_loading_error, i8);
    }

    public void loading(int i8) {
        setLoadingAnimation(R.raw.ani_loading, true);
        setHint(getContext().getString(i8));
    }
}
