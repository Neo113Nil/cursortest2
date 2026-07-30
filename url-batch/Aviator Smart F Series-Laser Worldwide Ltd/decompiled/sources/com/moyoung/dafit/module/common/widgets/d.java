package com.moyoung.dafit.module.common.widgets;

import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.moyoung.dafit.module.common.R$string;
import com.moyoung.dafit.module.common.widgets.d;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class d {
    public static final int DEFAULT_COUNT = 3;
    private static final int DEFAULT_TIME_INTERVAL = 1000;
    private final int count;
    private boolean isCanceled;
    private b onCompleteListener;
    private boolean showGo;
    private int tempCount;
    private TextView textView;
    private final int timeInterval;
    private Timer timer;

    class a extends TimerTask {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            if (d.this.tempCount > 0) {
                d dVar = d.this;
                dVar.showCountTimeText(dVar.tempCount);
            } else if (d.this.showGo) {
                d.this.showGoText();
                d.this.showGo = false;
            } else {
                d.this.onFinish();
            }
            d.access$210(d.this);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Log.d("onAnimationEnd", "=" + d.this.isCanceled);
            if (d.this.isCanceled) {
                return;
            }
            d.this.textView.post(new Runnable() { // from class: com.moyoung.dafit.module.common.widgets.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.a.this.lambda$run$0();
                }
            });
        }
    }

    public interface b {
        void onComplete();
    }

    public d(int i8, int i9) {
        this.showGo = true;
        this.isCanceled = false;
        this.count = i8;
        this.timeInterval = i9;
    }

    static /* synthetic */ int access$210(d dVar) {
        int i8 = dVar.tempCount;
        dVar.tempCount = i8 - 1;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFinish() {
        this.timer.cancel();
        this.textView.setVisibility(8);
        b bVar = this.onCompleteListener;
        if (bVar != null) {
            bVar.onComplete();
        }
    }

    private void setAnimation(TextView textView) {
        if (this.isCanceled) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(this.timeInterval);
        animationSet.addAnimation(alphaAnimation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.5f, 0.5f, 1.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(this.timeInterval);
        animationSet.addAnimation(scaleAnimation);
        textView.startAnimation(animationSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCountTimeText(int i8) {
        this.textView.setText(String.valueOf(i8));
        setAnimation(this.textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showGoText() {
        this.textView.setText(R$string.go);
        setAnimation(this.textView);
    }

    private void startTimer() {
        a aVar = new a();
        Timer timer = new Timer();
        this.timer = timer;
        timer.scheduleAtFixedRate(aVar, 0L, this.timeInterval);
    }

    public void cancel() {
        this.isCanceled = true;
        this.timer.cancel();
        this.textView.clearAnimation();
        this.textView.setVisibility(8);
    }

    public d setOnCompleteListener(b bVar) {
        this.onCompleteListener = bVar;
        return this;
    }

    public d setShowGo(boolean z7) {
        this.showGo = z7;
        return this;
    }

    public d setTextView(TextView textView) {
        this.textView = textView;
        textView.setVisibility(0);
        textView.setText("");
        return this;
    }

    public d start() {
        this.tempCount = this.count;
        this.isCanceled = false;
        startTimer();
        return this;
    }

    public d() {
        this.showGo = true;
        this.isCanceled = false;
        this.count = 3;
        this.timeInterval = 1000;
    }
}
