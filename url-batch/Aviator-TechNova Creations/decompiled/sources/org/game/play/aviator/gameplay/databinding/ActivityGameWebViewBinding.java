package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class ActivityGameWebViewBinding implements ViewBinding {
    public final FrameLayout fullscreenContainer;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final WebView webView;

    private ActivityGameWebViewBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, RelativeLayout relativeLayout2, WebView webView) {
        this.rootView = relativeLayout;
        this.fullscreenContainer = frameLayout;
        this.main = relativeLayout2;
        this.webView = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGameWebViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGameWebViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_game_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGameWebViewBinding bind(View view) {
        int i = R.id.fullscreen_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i2 = R.id.webView;
            WebView webView = (WebView) ViewBindings.findChildViewById(view, i2);
            if (webView != null) {
                return new ActivityGameWebViewBinding(relativeLayout, frameLayout, relativeLayout, webView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
