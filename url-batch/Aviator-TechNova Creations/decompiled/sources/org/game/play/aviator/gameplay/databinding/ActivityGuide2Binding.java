package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class ActivityGuide2Binding implements ViewBinding {
    public final AppCompatButton btn2;
    public final LinearLayout contentLayout;
    public final EditText etSearchCountry;
    public final ImageView ivBackground;
    public final LinearLayout llHeader;
    public final ListView lvCountries;
    public final RelativeLayout main;
    public final RelativeLayout rlNativeAd;
    private final RelativeLayout rootView;
    public final TextView tvCountryTitle;
    public final TextView tvNativeAd;

    private ActivityGuide2Binding(RelativeLayout relativeLayout, AppCompatButton appCompatButton, LinearLayout linearLayout, EditText editText, ImageView imageView, LinearLayout linearLayout2, ListView listView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.btn2 = appCompatButton;
        this.contentLayout = linearLayout;
        this.etSearchCountry = editText;
        this.ivBackground = imageView;
        this.llHeader = linearLayout2;
        this.lvCountries = listView;
        this.main = relativeLayout2;
        this.rlNativeAd = relativeLayout3;
        this.tvCountryTitle = textView;
        this.tvNativeAd = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGuide2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGuide2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_guide2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGuide2Binding bind(View view) {
        int i = R.id.btn2;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.contentLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.etSearchCountry;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText != null) {
                    i = R.id.ivBackground;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.llHeader;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.lvCountries;
                            ListView listView = (ListView) ViewBindings.findChildViewById(view, i);
                            if (listView != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                i = R.id.rlNativeAd;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout2 != null) {
                                    i = R.id.tvCountryTitle;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = R.id.tvNativeAd;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            return new ActivityGuide2Binding(relativeLayout, appCompatButton, linearLayout, editText, imageView, linearLayout2, listView, relativeLayout, relativeLayout2, textView, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
