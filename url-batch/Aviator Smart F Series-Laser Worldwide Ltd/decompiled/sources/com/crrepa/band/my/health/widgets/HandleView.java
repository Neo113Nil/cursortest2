package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.HandleViewBinding;

/* loaded from: classes2.dex */
public class HandleView extends LinearLayout {
    private final HandleViewBinding binding;
    private int displayWidthPixels;
    private int lastX;
    private int marginPixels;
    private a onHandleDrawChangeListener;

    public interface a {
        void onCompleted();

        void onDragChange(int i8, int i9);

        void onStarted();
    }

    public HandleView(Context context) {
        this(context, null);
    }

    private void complete() {
        a aVar = this.onHandleDrawChangeListener;
        if (aVar == null) {
            return;
        }
        aVar.onCompleted();
    }

    private void handleTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x7 = (int) motionEvent.getX();
        if (action == 0) {
            this.lastX = x7;
            start();
            sendNestedScrollChangeEvent(false);
            return;
        }
        if (action != 1) {
            if (action == 2) {
                int i8 = x7 - this.lastX;
                int left = getLeft() + i8;
                int right = getRight() + i8;
                int i9 = this.marginPixels;
                if (left >= (-i9) && this.displayWidthPixels + i9 >= right) {
                    onDrag(left, right);
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        sendNestedScrollChangeEvent(true);
        complete();
    }

    private void onDrag(int i8, int i9) {
        a aVar = this.onHandleDrawChangeListener;
        if (aVar == null) {
            return;
        }
        aVar.onDragChange(i8, i9);
    }

    private void sendNestedScrollChangeEvent(boolean z7) {
        org.greenrobot.eventbus.c.getDefault().post(new l0.h(z7));
    }

    private void start() {
        a aVar = this.onHandleDrawChangeListener;
        if (aVar == null) {
            return;
        }
        aVar.onStarted();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        handleTouchEvent(motionEvent);
        return true;
    }

    public void setHandleLine(@DrawableRes int i8) {
        this.binding.ivHandleLine.setImageResource(i8);
    }

    public void setHandleView(@DrawableRes int i8) {
        this.binding.ivHandle.setImageResource(i8);
    }

    public void setOnHandleDrawChangeListener(a aVar) {
        this.onHandleDrawChangeListener = aVar;
    }

    public void updatePosition(int i8, int i9) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        if (layoutParams.getLayoutDirection() == 1) {
            i8 = this.displayWidthPixels - i9;
        }
        layoutParams.setMarginStart(i8);
        setLayoutParams(layoutParams);
    }

    public HandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HandleView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.binding = HandleViewBinding.inflate(LayoutInflater.from(context), this, true);
        this.displayWidthPixels = context.getResources().getDisplayMetrics().widthPixels;
        this.marginPixels = (int) context.getResources().getDimension(R.dimen.handle_view_margin);
    }
}
