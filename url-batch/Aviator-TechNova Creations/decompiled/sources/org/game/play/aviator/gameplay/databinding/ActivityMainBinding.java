package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.navigation.NavigationView;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class ActivityMainBinding implements ViewBinding {
    public final ImageView btnMenu;
    public final AppCompatButton btnTrending1;
    public final AppCompatButton btnTrending2;
    public final AppCompatButton btnTrending3;
    public final LinearLayout contentLayout;
    public final DrawerLayout drawerLayout;
    public final ImageView ivBackground;
    public final ImageView ivTrending1;
    public final ImageView ivTrending2;
    public final ImageView ivTrending3;
    public final LinearLayout llTrending1;
    public final LinearLayout llTrending2;
    public final LinearLayout llTrending3;
    public final FrameLayout main;
    public final NavigationView navView;
    public final RelativeLayout rlNativeAd;
    private final DrawerLayout rootView;
    public final RecyclerView rvCategories;
    public final RecyclerView rvFaq;
    public final RecyclerView rvTopBanner;
    public final RecyclerView rvTopRated;
    public final TextView tvNativeAd;
    public final TextView tvTrending1;
    public final TextView tvTrending2;
    public final TextView tvTrending3;

    private ActivityMainBinding(DrawerLayout drawerLayout, ImageView imageView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatButton appCompatButton3, LinearLayout linearLayout, DrawerLayout drawerLayout2, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, FrameLayout frameLayout, NavigationView navigationView, RelativeLayout relativeLayout, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = drawerLayout;
        this.btnMenu = imageView;
        this.btnTrending1 = appCompatButton;
        this.btnTrending2 = appCompatButton2;
        this.btnTrending3 = appCompatButton3;
        this.contentLayout = linearLayout;
        this.drawerLayout = drawerLayout2;
        this.ivBackground = imageView2;
        this.ivTrending1 = imageView3;
        this.ivTrending2 = imageView4;
        this.ivTrending3 = imageView5;
        this.llTrending1 = linearLayout2;
        this.llTrending2 = linearLayout3;
        this.llTrending3 = linearLayout4;
        this.main = frameLayout;
        this.navView = navigationView;
        this.rlNativeAd = relativeLayout;
        this.rvCategories = recyclerView;
        this.rvFaq = recyclerView2;
        this.rvTopBanner = recyclerView3;
        this.rvTopRated = recyclerView4;
        this.tvNativeAd = textView;
        this.tvTrending1 = textView2;
        this.tvTrending2 = textView3;
        this.tvTrending3 = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DrawerLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMainBinding bind(View view) {
        int i = R.id.btnMenu;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.btnTrending1;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
            if (appCompatButton != null) {
                i = R.id.btnTrending2;
                AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                if (appCompatButton2 != null) {
                    i = R.id.btnTrending3;
                    AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                    if (appCompatButton3 != null) {
                        i = R.id.contentLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            DrawerLayout drawerLayout = (DrawerLayout) view;
                            i = R.id.ivBackground;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.ivTrending1;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.ivTrending2;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView4 != null) {
                                        i = R.id.ivTrending3;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView5 != null) {
                                            i = R.id.llTrending1;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout2 != null) {
                                                i = R.id.llTrending2;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout3 != null) {
                                                    i = R.id.llTrending3;
                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.main;
                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                        if (frameLayout != null) {
                                                            i = R.id.navView;
                                                            NavigationView navigationView = (NavigationView) ViewBindings.findChildViewById(view, i);
                                                            if (navigationView != null) {
                                                                i = R.id.rlNativeAd;
                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                if (relativeLayout != null) {
                                                                    i = R.id.rvCategories;
                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                    if (recyclerView != null) {
                                                                        i = R.id.rvFaq;
                                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                        if (recyclerView2 != null) {
                                                                            i = R.id.rvTopBanner;
                                                                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                            if (recyclerView3 != null) {
                                                                                i = R.id.rvTopRated;
                                                                                RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                if (recyclerView4 != null) {
                                                                                    i = R.id.tvNativeAd;
                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView != null) {
                                                                                        i = R.id.tvTrending1;
                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView2 != null) {
                                                                                            i = R.id.tvTrending2;
                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView3 != null) {
                                                                                                i = R.id.tvTrending3;
                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView4 != null) {
                                                                                                    return new ActivityMainBinding(drawerLayout, imageView, appCompatButton, appCompatButton2, appCompatButton3, linearLayout, drawerLayout, imageView2, imageView3, imageView4, imageView5, linearLayout2, linearLayout3, linearLayout4, frameLayout, navigationView, relativeLayout, recyclerView, recyclerView2, recyclerView3, recyclerView4, textView, textView2, textView3, textView4);
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
