package com.cmplay.policy.gdpr;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.cmplay.commondialog.R;

/* loaded from: classes.dex */
public class GDPRCancelDialog extends Dialog implements View.OnClickListener {
    private static final int ID_CLOSE_BTN = 1;
    private static final int ID_EXIT_BTN = 3;
    private static final int ID_NEXT_BTN = 2;
    private View mCloseBtn;
    private Activity mContext;
    private View mExitBtn;
    private int mFrom;
    private boolean mIsAttached;
    private IGDPRDialogListener mListener;
    private View mNextBtn;
    private View mRootView;

    public GDPRCancelDialog(Activity activity, int i) {
        super(activity);
        this.mIsAttached = false;
        this.mFrom = 100;
        this.mContext = activity;
        this.mFrom = i;
        init();
    }

    private void init() {
        requestWindowFeature(1);
        setContentView(R.layout.cmplay_dialog_gdpr_cancel_main_layout);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.setGravity(17);
            window.setAttributes(attributes);
        }
        this.mRootView = findViewById(R.id.root);
        this.mCloseBtn = findViewById(R.id.close_btn);
        this.mCloseBtn.setId(1);
        this.mNextBtn = findViewById(R.id.next_btn);
        this.mNextBtn.setId(2);
        this.mExitBtn = findViewById(R.id.exit_btn);
        this.mExitBtn.setId(3);
        adjustDialogWidth();
        this.mCloseBtn.setOnClickListener(this);
        this.mNextBtn.setOnClickListener(this);
        this.mExitBtn.setOnClickListener(this);
    }

    private void adjustDialogWidth() {
        int screenWidth = DimenUtils.getScreenWidth(this.mContext.getApplicationContext());
        ViewGroup.LayoutParams layoutParams = this.mRootView.getLayoutParams();
        layoutParams.width = screenWidth - DimenUtils.dp2px(this.mContext.getApplicationContext(), 48.0f);
        this.mRootView.setLayoutParams(layoutParams);
    }

    public void setDialogListener(IGDPRDialogListener iGDPRDialogListener) {
        this.mListener = iGDPRDialogListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
        }
        switch (view.getId()) {
            case 1:
            case 3:
                dismiss();
                if (this.mListener != null) {
                    this.mListener.onNegativeClick();
                }
                new gdpr_dialog_rpt().report(this.mContext, 2, 4);
                break;
            case 2:
                dismiss();
                GDPRController.showGDPRPolicyAndAdStayInformedDialog(this.mContext, this.mListener, this.mFrom);
                new gdpr_dialog_rpt().report(this.mContext, 2, 3);
                break;
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        if (this.mListener != null) {
            this.mListener.onNegativeClick();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.mContext == null || !this.mContext.isFinishing()) {
            super.show();
            new gdpr_dialog_rpt().report(this.mContext, 2, 10);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.mIsAttached) {
            super.dismiss();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsAttached = true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mIsAttached = false;
    }
}
