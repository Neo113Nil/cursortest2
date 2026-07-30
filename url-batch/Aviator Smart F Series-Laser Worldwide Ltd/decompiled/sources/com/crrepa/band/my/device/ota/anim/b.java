package com.crrepa.band.my.device.ota.anim;

import android.widget.ImageView;

/* loaded from: classes2.dex */
public class b {
    public static final int ANIMATION_DURATION = 40;
    private boolean isOneShot = false;
    private boolean isRun = false;
    private int mDuration;
    private int[] mDurations;
    private int[] mFrameRess;
    private ImageView mImageView;
    private int mLastFrameNo;

    class a implements Runnable {
        final /* synthetic */ int val$frameNo;

        a(int i8) {
            this.val$frameNo = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!b.this.isRun) {
                b.this.mImageView.removeCallbacks(this);
                return;
            }
            if (this.val$frameNo >= b.this.mFrameRess.length) {
                return;
            }
            b.this.mImageView.setBackgroundResource(b.this.mFrameRess[this.val$frameNo]);
            if (this.val$frameNo != b.this.mLastFrameNo) {
                b.this.mImageView.setClickable(false);
                b.this.playConstant(this.val$frameNo + 1);
                return;
            }
            b.this.mImageView.setClickable(true);
            if (b.this.isOneShot) {
                b.this.mImageView.removeCallbacks(this);
            } else {
                b.this.playConstant(0);
            }
        }
    }

    public b(ImageView imageView, int[] iArr, int i8) {
        this.mImageView = imageView;
        this.mFrameRess = iArr;
        this.mDuration = i8;
        this.mLastFrameNo = iArr.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playConstant(int i8) {
        this.mImageView.postDelayed(new a(i8), this.mDuration);
    }

    public boolean isRun() {
        return this.isRun;
    }

    public void play(boolean z7) {
        this.isOneShot = z7;
        this.isRun = true;
        this.mImageView.setBackgroundResource(this.mFrameRess[0]);
        playConstant(1);
    }

    public void setmFrameRess(int[] iArr) {
        this.mFrameRess = iArr;
    }

    public void stop() {
        this.isRun = false;
    }
}
