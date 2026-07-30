package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public class FillBgView extends FrameLayout {
    private int backgroundResource;
    private int imageResource;
    private ImageView ivProgress;
    private int progress;

    public FillBgView(@NonNull Context context) {
        super(context, null);
        initView(context);
    }

    private void initView(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.fill_bg_view, (ViewGroup) null);
        addView(inflate);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_progress);
        this.ivProgress = imageView;
        imageView.post(new Runnable() { // from class: com.crrepa.band.my.health.widgets.d
            @Override // java.lang.Runnable
            public final void run() {
                FillBgView.this.lambda$initView$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0() {
        this.ivProgress.setBackgroundResource(this.backgroundResource);
        this.ivProgress.setImageResource(this.imageResource);
        ClipDrawable clipDrawable = (ClipDrawable) this.ivProgress.getDrawable();
        if (clipDrawable != null) {
            clipDrawable.setLevel(this.progress);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        this.backgroundResource = i8;
    }

    public void setImageResource(int i8) {
        this.imageResource = i8;
    }

    public void setProgress(int i8) {
        this.progress = Math.min(Math.max(0, i8 * 100), 10000);
    }

    public FillBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        initView(context);
    }

    public FillBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        initView(context);
    }
}
