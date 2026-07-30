package com.just.agentweb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class DefaultWebCreator implements WebCreator {
    private static final String TAG = "DefaultWebCreator";
    private Activity mActivity;
    private BaseIndicatorSpec mBaseIndicatorSpec;
    private int mColor;
    private FrameLayout mFrameLayout;
    private int mHeight;
    private IWebLayout mIWebLayout;
    private int mIndex;
    private boolean mIsCreated;
    private boolean mIsNeedDefaultProgress;
    private ViewGroup.LayoutParams mLayoutParams;
    private BaseIndicatorView mProgressView;
    private View mTargetProgress;
    private ViewGroup mViewGroup;
    private WebView mWebView;
    private int mWebViewType;

    protected DefaultWebCreator(Activity activity, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, int i8, int i9, int i10, WebView webView, IWebLayout iWebLayout) {
        this.mIsCreated = false;
        this.mFrameLayout = null;
        this.mWebViewType = 1;
        this.mActivity = activity;
        this.mViewGroup = viewGroup;
        this.mIsNeedDefaultProgress = true;
        this.mIndex = i8;
        this.mColor = i9;
        this.mLayoutParams = layoutParams;
        this.mHeight = i10;
        this.mWebView = webView;
        this.mIWebLayout = iWebLayout;
    }

    private ViewGroup createLayout() {
        View view;
        BaseIndicatorView baseIndicatorView;
        Activity activity = this.mActivity;
        WebParentLayout webParentLayout = new WebParentLayout(activity);
        webParentLayout.setId(R.id.web_parent_layout_id);
        webParentLayout.setBackgroundColor(-1);
        if (this.mIWebLayout == null) {
            WebView createWebView = createWebView();
            this.mWebView = createWebView;
            view = createWebView;
        } else {
            view = webLayout();
        }
        webParentLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        webParentLayout.bindWebView(this.mWebView);
        LogUtils.i(TAG, "  instanceof  AgentWebView:" + (this.mWebView instanceof AgentWebView));
        if (this.mWebView instanceof AgentWebView) {
            this.mWebViewType = 2;
        }
        ViewStub viewStub = new ViewStub(activity);
        viewStub.setId(R.id.mainframe_error_viewsub_id);
        webParentLayout.addView(viewStub, new FrameLayout.LayoutParams(-1, -1));
        boolean z7 = this.mIsNeedDefaultProgress;
        if (z7) {
            WebIndicator webIndicator = new WebIndicator(activity);
            FrameLayout.LayoutParams layoutParams = this.mHeight > 0 ? new FrameLayout.LayoutParams(-2, AgentWebUtils.dp2px(activity, this.mHeight)) : webIndicator.offerLayoutParams();
            int i8 = this.mColor;
            if (i8 != -1) {
                webIndicator.setColor(i8);
            }
            layoutParams.gravity = 48;
            this.mBaseIndicatorSpec = webIndicator;
            webParentLayout.addView(webIndicator, layoutParams);
            webIndicator.setVisibility(8);
        } else if (!z7 && (baseIndicatorView = this.mProgressView) != null) {
            this.mBaseIndicatorSpec = baseIndicatorView;
            webParentLayout.addView(baseIndicatorView, baseIndicatorView.offerLayoutParams());
            this.mProgressView.setVisibility(8);
        }
        return webParentLayout;
    }

    private WebView createWebView() {
        int i8;
        WebView webView = this.mWebView;
        if (webView != null) {
            i8 = 3;
        } else if (AgentWebConfig.IS_KITKAT_OR_BELOW_KITKAT) {
            webView = new AgentWebView(this.mActivity);
            i8 = 2;
        } else {
            webView = new LollipopFixedWebView(this.mActivity);
            i8 = 1;
        }
        this.mWebViewType = i8;
        return webView;
    }

    private View webLayout() {
        WebView webView = this.mIWebLayout.getWebView();
        if (webView == null) {
            webView = createWebView();
            this.mIWebLayout.getLayout().addView(webView, -1, -1);
            LogUtils.i(TAG, "add webview");
        } else {
            this.mWebViewType = 3;
        }
        this.mWebView = webView;
        return this.mIWebLayout.getLayout();
    }

    @Override // com.just.agentweb.WebCreator
    public DefaultWebCreator create() {
        if (this.mIsCreated) {
            return this;
        }
        this.mIsCreated = true;
        ViewGroup viewGroup = this.mViewGroup;
        if (viewGroup == null) {
            FrameLayout frameLayout = (FrameLayout) createLayout();
            this.mFrameLayout = frameLayout;
            this.mActivity.setContentView(frameLayout);
        } else if (this.mIndex == -1) {
            FrameLayout frameLayout2 = (FrameLayout) createLayout();
            this.mFrameLayout = frameLayout2;
            viewGroup.addView(frameLayout2, this.mLayoutParams);
        } else {
            FrameLayout frameLayout3 = (FrameLayout) createLayout();
            this.mFrameLayout = frameLayout3;
            viewGroup.addView(frameLayout3, this.mIndex, this.mLayoutParams);
        }
        return this;
    }

    public FrameLayout getFrameLayout() {
        return this.mFrameLayout;
    }

    public View getTargetProgress() {
        return this.mTargetProgress;
    }

    @Override // com.just.agentweb.WebCreator
    public FrameLayout getWebParentLayout() {
        return this.mFrameLayout;
    }

    @Override // com.just.agentweb.WebCreator
    public WebView getWebView() {
        return this.mWebView;
    }

    @Override // com.just.agentweb.WebCreator
    public int getWebViewType() {
        return this.mWebViewType;
    }

    @Override // com.just.agentweb.IWebIndicator
    public BaseIndicatorSpec offer() {
        return this.mBaseIndicatorSpec;
    }

    public void setTargetProgress(View view) {
        this.mTargetProgress = view;
    }

    public void setWebView(WebView webView) {
        this.mWebView = webView;
    }

    protected DefaultWebCreator(Activity activity, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, int i8, WebView webView, IWebLayout iWebLayout) {
        this.mColor = -1;
        this.mIsCreated = false;
        this.mFrameLayout = null;
        this.mWebViewType = 1;
        this.mActivity = activity;
        this.mViewGroup = viewGroup;
        this.mIsNeedDefaultProgress = false;
        this.mIndex = i8;
        this.mLayoutParams = layoutParams;
        this.mWebView = webView;
        this.mIWebLayout = iWebLayout;
    }

    protected DefaultWebCreator(Activity activity, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, int i8, BaseIndicatorView baseIndicatorView, WebView webView, IWebLayout iWebLayout) {
        this.mColor = -1;
        this.mIsCreated = false;
        this.mFrameLayout = null;
        this.mWebViewType = 1;
        this.mActivity = activity;
        this.mViewGroup = viewGroup;
        this.mIsNeedDefaultProgress = false;
        this.mIndex = i8;
        this.mLayoutParams = layoutParams;
        this.mProgressView = baseIndicatorView;
        this.mWebView = webView;
        this.mIWebLayout = iWebLayout;
    }
}
