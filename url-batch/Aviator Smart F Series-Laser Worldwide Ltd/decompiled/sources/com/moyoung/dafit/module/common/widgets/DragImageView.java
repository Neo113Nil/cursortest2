package com.moyoung.dafit.module.common.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.Nullable;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class DragImageView extends ImageView {
    private int displayWidthPixels;
    private a drawChangeListener;
    private int lastX;

    public interface a {
        void onDragChange(int i8, int i9);
    }

    public DragImageView(Context context) {
        this(context, null);
    }

    private void onDrag(int i8, int i9) {
        a aVar = this.drawChangeListener;
        if (aVar == null) {
            return;
        }
        aVar.onDragChange(i8, i9);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x7 = (int) motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.lastX = x7;
        } else if (action == 2) {
            int i8 = x7 - this.lastX;
            int left = getLeft() + i8;
            int right = getRight() + i8;
            if (left < 0 || this.displayWidthPixels < right) {
                return true;
            }
            layout(left, getTop(), right, getBottom());
            onDrag(left, right);
        }
        return true;
    }

    public void setDragPosition(int i8) {
        int width = getWidth() + i8;
        if (i8 < 0 || this.displayWidthPixels < width) {
            return;
        }
        layout(i8, getTop(), getWidth() + i8, getBottom());
    }

    public void setDrawChangeListener(a aVar) {
        this.drawChangeListener = aVar;
    }

    public DragImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DragImageView(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.displayWidthPixels = context.getResources().getDisplayMetrics().widthPixels;
    }
}
