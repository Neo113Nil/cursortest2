package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class ActivitySettingPoliceBinding implements ViewBinding {
    public final ImageView back;
    public final LinearLayout main;
    private final LinearLayout rootView;
    public final WebView webview;

    private ActivitySettingPoliceBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, WebView webView) {
        this.rootView = linearLayout;
        this.back = imageView;
        this.main = linearLayout2;
        this.webview = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySettingPoliceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySettingPoliceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_setting_police, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySettingPoliceBinding bind(View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = R.id.webview;
            WebView webView = (WebView) ViewBindings.findChildViewById(view, i2);
            if (webView != null) {
                return new ActivitySettingPoliceBinding(linearLayout, imageView, linearLayout, webView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
