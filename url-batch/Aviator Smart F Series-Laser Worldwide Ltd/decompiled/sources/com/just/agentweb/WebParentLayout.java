package com.just.agentweb;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class WebParentLayout extends FrameLayout implements Provider<AbsAgentWebUIController> {
    private static final String TAG = "WebParentLayout";
    private AbsAgentWebUIController mAgentWebUIController;
    private int mClickId;
    private FrameLayout mErrorLayout;
    private int mErrorLayoutRes;
    private View mErrorView;
    private WebView mWebView;

    WebParentLayout(Context context) {
        this(context, null);
        LogUtils.i(TAG, TAG);
    }

    private void createErrorLayout() {
        final FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(-1);
        frameLayout.setId(R.id.mainframe_error_container_id);
        View view = this.mErrorView;
        if (view == null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            LogUtils.i(TAG, "mErrorLayoutRes:" + this.mErrorLayoutRes);
            from.inflate(this.mErrorLayoutRes, (ViewGroup) frameLayout, true);
        } else {
            frameLayout.addView(view);
        }
        View view2 = (ViewStub) findViewById(R.id.mainframe_error_viewsub_id);
        int indexOfChild = indexOfChild(view2);
        removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        this.mErrorLayout = frameLayout;
        if (layoutParams != null) {
            addView(frameLayout, indexOfChild, layoutParams);
        } else {
            addView(frameLayout, indexOfChild);
        }
        frameLayout.setVisibility(0);
        int i8 = this.mClickId;
        if (i8 != -1) {
            final View findViewById = frameLayout.findViewById(i8);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.just.agentweb.WebParentLayout.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        if (WebParentLayout.this.getWebView() != null) {
                            findViewById.setClickable(false);
                            WebParentLayout.this.getWebView().reload();
                        }
                    }
                });
                return;
            } else if (LogUtils.isDebug()) {
                LogUtils.e(TAG, "ClickView is null , cannot bind accurate view to refresh or reload .");
            }
        }
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.just.agentweb.WebParentLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                if (WebParentLayout.this.getWebView() != null) {
                    frameLayout.setClickable(false);
                    WebParentLayout.this.getWebView().reload();
                }
            }
        });
    }

    void bindController(AbsAgentWebUIController absAgentWebUIController) {
        this.mAgentWebUIController = absAgentWebUIController;
        absAgentWebUIController.bindWebParent(this, (Activity) getContext());
    }

    void bindWebView(WebView webView) {
        if (this.mWebView == null) {
            this.mWebView = webView;
        }
    }

    WebView getWebView() {
        return this.mWebView;
    }

    void hideErrorLayout() {
        View findViewById = findViewById(R.id.mainframe_error_container_id);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.just.agentweb.Provider
    public AbsAgentWebUIController provide() {
        return this.mAgentWebUIController;
    }

    void setErrorLayoutRes(int i8, int i9) {
        this.mClickId = i9;
        if (i9 <= 0) {
            this.mClickId = -1;
        }
        this.mErrorLayoutRes = i8;
        if (i8 <= 0) {
            this.mErrorLayoutRes = R.layout.agentweb_error_page;
        }
    }

    void setErrorView(View view) {
        this.mErrorView = view;
    }

    void showPageMainFrameError() {
        View findViewById;
        FrameLayout frameLayout = this.mErrorLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        } else {
            createErrorLayout();
            frameLayout = this.mErrorLayout;
        }
        int i8 = this.mClickId;
        if (i8 == -1 || (findViewById = frameLayout.findViewById(i8)) == null) {
            frameLayout.setClickable(true);
        } else {
            findViewById.setClickable(true);
        }
    }

    WebParentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    WebParentLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mAgentWebUIController = null;
        this.mClickId = -1;
        this.mErrorLayout = null;
        if (!(context instanceof Activity)) {
            throw new IllegalArgumentException("WebParentLayout context must be activity or activity sub class .");
        }
        this.mErrorLayoutRes = R.layout.agentweb_error_page;
    }
}
