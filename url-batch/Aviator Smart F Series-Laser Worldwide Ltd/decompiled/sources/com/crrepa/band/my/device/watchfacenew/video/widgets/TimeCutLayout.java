package com.crrepa.band.my.device.watchfacenew.video.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.LayoutVideoTimeCutBinding;
import com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutView;
import java.io.IOException;

/* loaded from: classes2.dex */
public class TimeCutLayout extends FrameLayout {
    public static final int MAX_COUNT_RANGE = 6;
    public static final long MIN_SHOOT_DURATION = 1000;
    private static final String TAG = "TimeCutLayout";
    private float averageMsPx;
    private float averagePxMs;
    private final TimeCutView.a barChangeListener;
    private LayoutVideoTimeCutBinding binding;
    private ValueAnimator cursorAnimator;
    private int cutEndPos;
    private int cutStartPos;
    private boolean isDestroyed;
    private int ivCursorPos;
    private int lastScrollX;
    private int mScaledTouchSlop;
    private d progressChangeListener;
    private final RecyclerView.OnScrollListener rvScrollListener;
    private int scrollPos;
    private float thumbWidth;
    private int thumbsTotalCount;
    public int videoMaxSecond;
    private VideoThumbsAdapter videoThumbAdapter;

    public static class VideoThumbsAdapter extends BaseQuickAdapter<Bitmap, BaseViewHolder> {
        private final int rvWidth;

        public VideoThumbsAdapter(int i8) {
            super(R.layout.item_video_time_cut_thumbs);
            this.rvWidth = i8;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public void convert(@NonNull BaseViewHolder baseViewHolder, Bitmap bitmap) {
            ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_thumb);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.width = this.rvWidth / 6;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageBitmap(bitmap);
        }
    }

    class a implements TimeCutView.a {
        a() {
        }

        @Override // com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutView.a
        public /* bridge */ /* synthetic */ void onChange(boolean z7, int i8, int i9, int i10) {
            com.crrepa.band.my.device.watchfacenew.video.widgets.d.a(this, z7, i8, i9, i10);
        }

        @Override // com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutView.a
        public void onLeftBarChange(int i8, int i9) {
            TimeCutLayout timeCutLayout = TimeCutLayout.this;
            timeCutLayout.cutStartPos = i8 + timeCutLayout.scrollPos;
            TimeCutLayout timeCutLayout2 = TimeCutLayout.this;
            timeCutLayout2.ivCursorPos = timeCutLayout2.cutStartPos;
            if ((i9 == 2 || i9 == 1) && TimeCutLayout.this.progressChangeListener != null) {
                TimeCutLayout.this.progressChangeListener.onSeek(TimeCutLayout.this.cutStartPos);
            }
            TimeCutLayout.this.renderCutDuration();
        }

        @Override // com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutView.a
        public void onRightBarChange(int i8, int i9) {
            TimeCutLayout timeCutLayout = TimeCutLayout.this;
            timeCutLayout.cutEndPos = i8 + timeCutLayout.scrollPos;
            if (i9 == 2 && TimeCutLayout.this.progressChangeListener != null) {
                TimeCutLayout.this.progressChangeListener.onSeek(TimeCutLayout.this.cutEndPos);
            }
            if (i9 == 1 && TimeCutLayout.this.progressChangeListener != null) {
                TimeCutLayout.this.progressChangeListener.onSeek(TimeCutLayout.this.cutStartPos);
            }
            TimeCutLayout.this.renderCutDuration();
        }
    }

    class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i8) {
            super.onScrollStateChanged(recyclerView, i8);
            Log.d(TimeCutLayout.TAG, "newState = " + i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i8, int i9) {
            super.onScrolled(recyclerView, i8, i9);
            int calcScrollXDistance = TimeCutLayout.this.calcScrollXDistance();
            if (Math.abs(TimeCutLayout.this.lastScrollX - calcScrollXDistance) < TimeCutLayout.this.mScaledTouchSlop) {
                return;
            }
            if (calcScrollXDistance == 0) {
                TimeCutLayout.this.scrollPos = 0;
                TimeCutLayout timeCutLayout = TimeCutLayout.this;
                timeCutLayout.cutStartPos = timeCutLayout.binding.timeCutView.getSelectedMinValue() + TimeCutLayout.this.scrollPos;
                TimeCutLayout timeCutLayout2 = TimeCutLayout.this;
                timeCutLayout2.cutEndPos = timeCutLayout2.binding.timeCutView.getSelectedMaxValue() + TimeCutLayout.this.scrollPos;
                Log.d(TimeCutLayout.TAG, "onScrolled >>>> mLeftProgressPos = " + TimeCutLayout.this.cutStartPos);
                TimeCutLayout timeCutLayout3 = TimeCutLayout.this;
                timeCutLayout3.ivCursorPos = timeCutLayout3.cutStartPos;
            } else {
                TimeCutLayout timeCutLayout4 = TimeCutLayout.this;
                timeCutLayout4.scrollPos = (int) ((timeCutLayout4.averageMsPx * calcScrollXDistance) / TimeCutLayout.this.thumbWidth);
                TimeCutLayout timeCutLayout5 = TimeCutLayout.this;
                timeCutLayout5.cutStartPos = timeCutLayout5.binding.timeCutView.getSelectedMinValue() + TimeCutLayout.this.scrollPos;
                TimeCutLayout timeCutLayout6 = TimeCutLayout.this;
                timeCutLayout6.cutEndPos = timeCutLayout6.binding.timeCutView.getSelectedMaxValue() + TimeCutLayout.this.scrollPos;
                Log.d(TimeCutLayout.TAG, "onScrolled >>>> mLeftProgressPos = " + TimeCutLayout.this.cutStartPos);
                TimeCutLayout timeCutLayout7 = TimeCutLayout.this;
                timeCutLayout7.ivCursorPos = timeCutLayout7.cutStartPos;
                TimeCutLayout.this.binding.ivCursor.setVisibility(8);
                TimeCutLayout.this.binding.timeCutView.invalidate();
                if (TimeCutLayout.this.progressChangeListener != null) {
                    TimeCutLayout.this.progressChangeListener.onSeek(TimeCutLayout.this.cutStartPos);
                }
            }
            TimeCutLayout.this.lastScrollX = calcScrollXDistance;
        }
    }

    class c extends Thread {
        final /* synthetic */ e val$callback;
        final /* synthetic */ Context val$context;
        final /* synthetic */ long val$endPosition;
        final /* synthetic */ long val$startPosition;
        final /* synthetic */ float val$thumbWidth;
        final /* synthetic */ int val$totalThumbsCount;
        final /* synthetic */ Uri val$videoUri;

        c(Context context, Uri uri, long j8, long j9, int i8, float f8, e eVar) {
            this.val$context = context;
            this.val$videoUri = uri;
            this.val$endPosition = j8;
            this.val$startPosition = j9;
            this.val$totalThumbsCount = i8;
            this.val$thumbWidth = f8;
            this.val$callback = eVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(this.val$context, this.val$videoUri);
            long j8 = (this.val$endPosition - this.val$startPosition) / this.val$totalThumbsCount;
            for (long j9 = 0; j9 < this.val$totalThumbsCount; j9++) {
                if (TimeCutLayout.this.isDestroyed) {
                    return;
                }
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime((this.val$startPosition + (j8 * j9)) * 1000, 3);
                if (frameAtTime != null) {
                    try {
                        this.val$callback.singleShoot(Bitmap.createScaledBitmap(frameAtTime, (int) this.val$thumbWidth, (int) ((frameAtTime.getHeight() * this.val$thumbWidth) / frameAtTime.getWidth()), false));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    public interface d {
        void onCursorPlayFinished();

        void onSeek(int i8);
    }

    public interface e {
        void singleShoot(Bitmap bitmap);
    }

    public TimeCutLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calcScrollXDistance() {
        int findFirstVisibleItemPosition;
        View findViewByPosition;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.binding.rvThumb.getLayoutManager();
        if (linearLayoutManager == null || (findViewByPosition = linearLayoutManager.findViewByPosition((findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()))) == null) {
            return 0;
        }
        return (findFirstVisibleItemPosition * findViewByPosition.getWidth()) - findViewByPosition.getLeft();
    }

    private void init(Context context) {
        this.binding = LayoutVideoTimeCutBinding.inflate(LayoutInflater.from(context), this, true);
        initRv();
    }

    private void initRv() {
        RecyclerView recyclerView = this.binding.rvThumb;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        this.binding.rvThumb.addOnScrollListener(this.rvScrollListener);
    }

    private void initTimeCutView(int i8) {
        this.binding.timeCutView.initWidget(this.cutStartPos, this.cutEndPos);
        this.binding.timeCutView.setSelectedMinValue(this.cutStartPos);
        this.binding.timeCutView.setSelectedMaxValue(this.cutEndPos);
        this.binding.timeCutView.setMinShootTime(1000L);
        this.binding.timeCutView.setNotifyWhileDragging(true);
        this.binding.timeCutView.setOnBarChangeListener(this.barChangeListener);
        if (this.thumbsTotalCount - 6 > 0) {
            this.averageMsPx = (i8 - getMaxShootDuration()) / (this.thumbsTotalCount - 6);
        } else {
            this.averageMsPx = 0.0f;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.binding.rvThumb.getLayoutParams();
        layoutParams.leftMargin = this.binding.timeCutView.getThumbHandleWidth();
        layoutParams.rightMargin = this.binding.timeCutView.getThumbHandleWidth();
        this.binding.rvThumb.setLayoutParams(layoutParams);
        this.averagePxMs = (this.binding.rvThumb.getWidth() * 1.0f) / (this.cutEndPos - this.cutStartPos);
        VideoThumbsAdapter videoThumbsAdapter = new VideoThumbsAdapter(this.binding.rvThumb.getWidth());
        this.videoThumbAdapter = videoThumbsAdapter;
        this.binding.rvThumb.setAdapter(videoThumbsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playCursorAnim$0(FrameLayout.LayoutParams layoutParams, int i8, ValueAnimator valueAnimator) {
        layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.binding.ivCursor.setLayoutParams(layoutParams);
        if (((Integer) valueAnimator.getAnimatedValue()).intValue() == i8) {
            this.cursorAnimator.cancel();
            this.binding.ivCursor.setVisibility(8);
            d dVar = this.progressChangeListener;
            if (dVar != null) {
                dVar.onCursorPlayFinished();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startShootVideoThumbs$1(Bitmap bitmap) {
        this.videoThumbAdapter.addData((VideoThumbsAdapter) bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startShootVideoThumbs$2(final Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.binding.rvThumb.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.video.widgets.a
            @Override // java.lang.Runnable
            public final void run() {
                TimeCutLayout.this.lambda$startShootVideoThumbs$1(bitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderCutDuration() {
        this.binding.tvTimeStart.setText(b2.b.convertSecondsToTime(this.cutStartPos / 1000));
        this.binding.tvTimeEnd.setText(b2.b.convertSecondsToTime(this.cutEndPos / 1000));
        this.binding.tvTimeDuration.setText(b2.b.convertSecondsToTime((this.cutEndPos / 1000) - (this.cutStartPos / 1000)));
    }

    private void shootVideoThumbInBackground(Context context, Uri uri, float f8, int i8, long j8, e eVar) {
        new c(context, uri, j8, 0L, i8, f8, eVar).start();
    }

    private void startShootVideoThumbs(Uri uri, int i8, long j8) {
        this.thumbWidth = this.binding.rvThumb.getWidth() / 6.0f;
        shootVideoThumbInBackground(this.binding.rvThumb.getContext(), uri, this.thumbWidth, i8, j8, new e() { // from class: com.crrepa.band.my.device.watchfacenew.video.widgets.c
            @Override // com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutLayout.e
            public final void singleShoot(Bitmap bitmap) {
                TimeCutLayout.this.lambda$startShootVideoThumbs$2(bitmap);
            }
        });
    }

    public void destroy() {
        this.isDestroyed = true;
    }

    public int getCutEndPos() {
        return this.cutEndPos;
    }

    public int getCutStartPos() {
        return this.cutStartPos;
    }

    public int getMaxShootDuration() {
        return this.videoMaxSecond * 1000;
    }

    public void hideTimeHandle() {
        this.binding.timeCutView.hideThumbHandle();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.binding.ivCursor.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        this.binding.ivCursor.setLayoutParams(layoutParams);
    }

    public void hideTvTime() {
        this.binding.tvTimeStart.setVisibility(8);
        this.binding.tvTimeDuration.setVisibility(8);
        this.binding.tvTimeEnd.setVisibility(8);
    }

    public void playCursorAnim() {
        this.binding.ivCursor.setVisibility(0);
        ValueAnimator valueAnimator = this.cursorAnimator;
        if (valueAnimator != null && valueAnimator.isPaused()) {
            this.cursorAnimator.resume();
            return;
        }
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.binding.ivCursor.getLayoutParams();
        float thumbHandleWidth = this.binding.timeCutView.getThumbHandleWidth();
        int i8 = this.ivCursorPos;
        int i9 = this.scrollPos;
        int i10 = (int) (thumbHandleWidth + ((i8 - i9) * this.averagePxMs));
        final int thumbHandleWidth2 = (int) (((this.cutEndPos - i9) * r4) - (this.binding.timeCutView.getThumbHandleWidth() * 0.5d));
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, thumbHandleWidth2);
        int i11 = this.cutEndPos;
        int i12 = this.scrollPos;
        ValueAnimator duration = ofInt.setDuration((i11 - i12) - (this.ivCursorPos - i12));
        this.cursorAnimator = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.cursorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.widgets.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TimeCutLayout.this.lambda$playCursorAnim$0(layoutParams, thumbHandleWidth2, valueAnimator2);
            }
        });
        this.cursorAnimator.start();
    }

    public void renderCursorPause() {
        this.binding.ivCursor.setVisibility(8);
        ValueAnimator valueAnimator = this.cursorAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.cursorAnimator.pause();
    }

    public void renderVideoThumbs(int i8, Uri uri) {
        d dVar = this.progressChangeListener;
        if (dVar != null) {
            dVar.onSeek(this.ivCursorPos);
        }
        this.cutStartPos = 0;
        if (this.cutEndPos == 0) {
            if (i8 <= getMaxShootDuration()) {
                this.thumbsTotalCount = 6;
                this.cutEndPos = i8;
            } else {
                this.thumbsTotalCount = (int) (((i8 * 1.0f) / (getMaxShootDuration() * 1.0f)) * 6.0f);
                this.cutEndPos = getMaxShootDuration();
            }
            renderCutDuration();
        }
        initTimeCutView(i8);
        startShootVideoThumbs(uri, this.thumbsTotalCount, i8);
    }

    public void setProgressChangeListener(d dVar) {
        this.progressChangeListener = dVar;
    }

    public void setVideoMaxSecond(int i8) {
        this.videoMaxSecond = i8;
    }

    public TimeCutLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.videoMaxSecond = 5;
        this.ivCursorPos = 0;
        this.scrollPos = 0;
        this.isDestroyed = false;
        this.barChangeListener = new a();
        this.rvScrollListener = new b();
        init(context);
    }
}
