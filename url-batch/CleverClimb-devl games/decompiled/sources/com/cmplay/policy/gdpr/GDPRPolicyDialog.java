package com.cmplay.policy.gdpr;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.cmplay.commondialog.R;
import com.cmplay.policy.gdpr.GDPRDialogViewPagerAdapter;

/* loaded from: classes.dex */
public class GDPRPolicyDialog extends Dialog implements View.OnClickListener {
    private static final long DELAY_CHECK = 5000;
    private static final long DELAY_NORMAL = 3000;
    private static final int ID_NEXT_BTN = 100001;
    public static int PAGE_NUM = 2;
    private GDPRDialogViewPagerAdapter mAdapter;
    private Activity mContext;
    private int mCurrentItem;
    private LinearLayout mDotLayout;
    private int mFrom;
    private Handler mHandler;
    private boolean mIsAttached;
    private boolean mIsScrolled;
    private boolean mIsShowAdPage;
    private IGDPRDialogListener mListener;
    private View mNextBtn;
    private View mRootView;
    private ViewPager mViewPager;
    private Runnable task;

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    public GDPRPolicyDialog(Activity activity, int i) {
        super(activity);
        this.mIsAttached = false;
        this.mFrom = 100;
        this.mIsShowAdPage = false;
        this.mIsScrolled = false;
        this.mCurrentItem = 0;
        this.mHandler = new Handler();
        this.task = new Runnable() { // from class: com.cmplay.policy.gdpr.GDPRPolicyDialog.4
            @Override // java.lang.Runnable
            public void run() {
                GDPRPolicyDialog.this.mCurrentItem = (GDPRPolicyDialog.this.mCurrentItem + 1) % GDPRPolicyDialog.PAGE_NUM;
                GDPRPolicyDialog.this.mViewPager.setCurrentItem(GDPRPolicyDialog.this.mCurrentItem, true);
            }
        };
        this.mContext = activity;
        this.mFrom = i;
        init();
    }

    private void init() {
        requestWindowFeature(1);
        setContentView(R.layout.cmplay_dialog_gdpr_policy_main_layout);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.setGravity(17);
            window.setAttributes(attributes);
        }
        this.mRootView = findViewById(R.id.root);
        this.mNextBtn = findViewById(R.id.next_btn);
        this.mNextBtn.setId(ID_NEXT_BTN);
        this.mViewPager = (ViewPager) findViewById(R.id.main_pager);
        this.mAdapter = new GDPRDialogViewPagerAdapter(this.mContext);
        this.mAdapter.setListener(new GDPRDialogViewPagerAdapter.IDialogPagerListener() { // from class: com.cmplay.policy.gdpr.GDPRPolicyDialog.1
            @Override // com.cmplay.policy.gdpr.GDPRDialogViewPagerAdapter.IDialogPagerListener
            public void onScrollChange() {
                if (GDPRPolicyDialog.this.mIsScrolled) {
                    return;
                }
                GDPRPolicyDialog.this.mIsScrolled = true;
            }
        });
        this.mViewPager.setAdapter(this.mAdapter);
        this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.cmplay.policy.gdpr.GDPRPolicyDialog.2
            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                for (int i2 = 0; i2 < GDPRPolicyDialog.this.mDotLayout.getChildCount(); i2++) {
                    if (i2 == i) {
                        GDPRPolicyDialog.this.mDotLayout.getChildAt(i2).setBackgroundResource(R.drawable.cmplay_bg_gdpr_dialog_circle_selected);
                    } else {
                        GDPRPolicyDialog.this.mDotLayout.getChildAt(i2).setBackgroundResource(R.drawable.cmplay_bg_gdpr_dialog_circle_normal);
                    }
                }
                if (i == 1) {
                    GDPRPolicyDialog.this.mIsShowAdPage = true;
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                switch (i) {
                    case 0:
                        GDPRPolicyDialog.this.mCurrentItem = GDPRPolicyDialog.this.mViewPager.getCurrentItem();
                        break;
                }
            }
        });
        this.mDotLayout = (LinearLayout) findViewById(R.id.dot_layout);
        setIndicator();
        this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.cmplay.policy.gdpr.GDPRPolicyDialog.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT >= 16) {
                    GDPRPolicyDialog.this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    GDPRPolicyDialog.this.mRootView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                GDPRPolicyDialog.this.mHandler.removeCallbacksAndMessages(null);
                GDPRPolicyDialog.this.mHandler.postDelayed(GDPRPolicyDialog.this.task, GDPRPolicyDialog.DELAY_NORMAL);
            }
        });
        adjustDialogWidth();
        this.mNextBtn.setOnClickListener(this);
    }

    private void adjustDialogWidth() {
        int screenWidth = DimenUtils.getScreenWidth(this.mContext.getApplicationContext());
        ViewGroup.LayoutParams layoutParams = this.mRootView.getLayoutParams();
        layoutParams.width = screenWidth - DimenUtils.dp2px(this.mContext.getApplicationContext(), 24.0f);
        this.mRootView.setLayoutParams(layoutParams);
    }

    private void setIndicator() {
        int dp2px = DimenUtils.dp2px(this.mContext, 6.0f);
        int dp2px2 = DimenUtils.dp2px(this.mContext, 6.0f);
        this.mDotLayout.removeAllViews();
        for (int i = 0; i < PAGE_NUM; i++) {
            View view = new View(this.mContext);
            view.setBackgroundResource(R.drawable.cmplay_bg_gdpr_dialog_circle_normal);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dp2px, dp2px);
            int i2 = dp2px2 / 2;
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
            layoutParams.topMargin = i2;
            layoutParams.bottomMargin = i2;
            this.mDotLayout.addView(view, layoutParams);
        }
        this.mDotLayout.getChildAt(0).setBackgroundResource(R.drawable.cmplay_bg_gdpr_dialog_circle_selected);
    }

    public void setDialogListener(IGDPRDialogListener iGDPRDialogListener) {
        this.mListener = iGDPRDialogListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != null && view.getId() == ID_NEXT_BTN) {
            dismiss();
            if (this.mListener != null) {
                this.mListener.onPositiveClick();
            }
            GDPRController.setGDPRAgreed(this.mContext);
            new gdpr_dialog_rpt().report(this.mContext, 1, 1);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.mContext == null || !this.mContext.isFinishing()) {
            super.show();
            new gdpr_dialog_rpt().report(this.mContext, 1, 10);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.mIsAttached) {
            super.dismiss();
        }
        if (this.mHandler != null) {
            this.mHandler.removeCallbacksAndMessages(null);
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
