package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class AppOpenAdBinding implements ViewBinding {
    public final TextView actionBtn;
    public final RelativeLayout btnQureka;
    public final RelativeLayout btnSkip;
    public final TextView description;
    public final ImageView imageview;
    public final LinearLayout ll1;
    public final LinearLayout llAdsview;
    public final LinearLayout llbtn;
    public final LinearLayout llmain;
    public final RelativeLayout openadleft;
    public final RelativeLayout openadright;
    private final LinearLayout rootView;
    public final TextView shortdes;
    public final TextView titel;

    private AppOpenAdBinding(LinearLayout linearLayout, TextView textView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView2, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.actionBtn = textView;
        this.btnQureka = relativeLayout;
        this.btnSkip = relativeLayout2;
        this.description = textView2;
        this.imageview = imageView;
        this.ll1 = linearLayout2;
        this.llAdsview = linearLayout3;
        this.llbtn = linearLayout4;
        this.llmain = linearLayout5;
        this.openadleft = relativeLayout3;
        this.openadright = relativeLayout4;
        this.shortdes = textView3;
        this.titel = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AppOpenAdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppOpenAdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.app_open_ad, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AppOpenAdBinding bind(View view) {
        int i = R.id.action_btn;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.btnQureka;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.btnSkip;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout2 != null) {
                    i = R.id.description;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.imageview;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.ll1;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.ll_adsview;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = R.id.llbtn;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        LinearLayout linearLayout4 = (LinearLayout) view;
                                        i = R.id.openadleft;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout3 != null) {
                                            i = R.id.openadright;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout4 != null) {
                                                i = R.id.shortdes;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    i = R.id.titel;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        return new AppOpenAdBinding(linearLayout4, textView, relativeLayout, relativeLayout2, textView2, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout3, relativeLayout4, textView3, textView4);
                                                    }
                                                }
                                            }
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
