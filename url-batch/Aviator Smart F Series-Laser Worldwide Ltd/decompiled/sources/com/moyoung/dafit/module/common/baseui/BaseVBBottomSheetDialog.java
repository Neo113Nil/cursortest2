package com.moyoung.dafit.module.common.baseui;

import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.moyoung.dafit.module.common.R$style;

/* loaded from: classes4.dex */
public abstract class BaseVBBottomSheetDialog<VB extends ViewBinding> extends BottomSheetDialog {
    protected VB binding;
    protected boolean isFullHeight;
    protected int maxHeight;

    public BaseVBBottomSheetDialog(Context context) {
        super(context, R$style.BaseUIDialog);
        this.isFullHeight = true;
        this.maxHeight = -1;
        init();
    }

    private void init() {
        VB viewBinding = getViewBinding();
        this.binding = viewBinding;
        setContentView(viewBinding.getRoot());
        initBinding();
        setShowBottomWithAnim();
    }

    private void setFullScreenHeight() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        int i8 = this.maxHeight;
        if (i8 > 0) {
            behavior.setMaxHeight(i8);
        } else {
            behavior.setMaxHeight(getWindowHeight());
        }
        behavior.setPeekHeight(getWindowHeight());
    }

    protected abstract VB getViewBinding();

    public int getWindowHeight() {
        return getContext().getResources().getDisplayMetrics().heightPixels;
    }

    protected abstract void initBinding();

    public void setFullHeight(boolean z7) {
        this.isFullHeight = z7;
    }

    public void setMaxHeight(int i8) {
        this.maxHeight = i8;
    }

    public void setShowBottom() {
        setShowPosition(80);
    }

    public void setShowBottomWithAnim() {
        setShowBottom();
        getWindow().setWindowAnimations(R$style.BottomDialogAnimation);
    }

    public void setShowPosition(int i8) {
        Window window = getWindow();
        window.setGravity(i8);
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.isFullHeight) {
            setFullScreenHeight();
        }
        super.show();
    }

    public BaseVBBottomSheetDialog(Context context, int i8) {
        super(context, i8);
        this.isFullHeight = true;
        this.maxHeight = -1;
        init();
    }
}
