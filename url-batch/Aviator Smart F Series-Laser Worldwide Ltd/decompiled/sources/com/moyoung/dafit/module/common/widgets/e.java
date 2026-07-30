package com.moyoung.dafit.module.common.widgets;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.moyoung.dafit.module.common.R$string;
import com.orhanobut.logger.f;

/* loaded from: classes4.dex */
public class e {
    private static final int MESSAGE_COMPLETE = 2;
    private static final int MESSAGE_COUNT_TIMER = 1;
    public static final int TIME_COUNT = 3;
    public static final int TIME_INTERVAL = 1000;
    private int count;
    private d onCompleteListener;
    private int tempCount;
    private TextView textView;
    private boolean showGo = true;
    private Handler handler = new a();
    private Runnable countTimerRunnable = new b();
    private Runnable goRunnable = new c();

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            int i8 = message.arg1;
            f.d("------" + i8);
            int i9 = message.what;
            if (i9 == 1) {
                e.this.showCountTimeText(i8);
                e.this.postCountTimer(1000L);
            } else {
                if (i9 != 2) {
                    return;
                }
                e.this.onFinish();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.sendCountTimerMessage();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.showGoText();
            e.this.sendCompleteMessage(1000L);
        }
    }

    public interface d {
        void onComplete();
    }

    public e(int i8) {
        this.count = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFinish() {
        f.d("onFinish");
        this.textView.setVisibility(8);
        this.onCompleteListener.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postCountTimer(long j8) {
        int i8 = (int) (this.tempCount - (j8 / 1000));
        this.tempCount = i8;
        if (i8 > 0) {
            this.handler.postDelayed(this.countTimerRunnable, j8);
        } else if (this.showGo) {
            this.handler.postDelayed(this.goRunnable, j8);
        } else {
            sendCompleteMessage(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendCompleteMessage(long j8) {
        Message obtainMessage = this.handler.obtainMessage();
        obtainMessage.what = 2;
        this.handler.sendMessageDelayed(obtainMessage, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendCountTimerMessage() {
        Message obtainMessage = this.handler.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.arg1 = this.tempCount;
        this.handler.sendMessage(obtainMessage);
    }

    private void setAnimation(TextView textView) {
        textView.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        animationSet.addAnimation(alphaAnimation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.5f, 0.5f, 1.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(1000L);
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

    public void cancel() {
        f.d("cancel");
        this.handler.removeCallbacks(this.countTimerRunnable);
        this.handler.removeCallbacks(this.goRunnable);
        this.handler.removeMessages(1);
        this.handler.removeMessages(2);
    }

    public e setOnCompleteListener(d dVar) {
        this.onCompleteListener = dVar;
        return this;
    }

    public e setShowGo(boolean z7) {
        this.showGo = z7;
        return this;
    }

    public e setTextView(TextView textView) {
        this.textView = textView;
        return this;
    }

    public e start() {
        this.tempCount = this.count;
        postCountTimer(0L);
        return this;
    }
}
