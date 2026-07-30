package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class DrawerMenuLayoutBinding implements ViewBinding {
    public final ImageView ivDrawerBackground;
    public final LinearLayout menuAction;
    public final LinearLayout menuAdventure;
    public final LinearLayout menuArcade;
    public final LinearLayout menuPrivacy;
    public final LinearLayout menuPuzzle;
    public final LinearLayout menuRate;
    public final LinearLayout menuShare;
    public final LinearLayout menuSports;
    public final LinearLayout menuStrategy;
    private final RelativeLayout rootView;

    private DrawerMenuLayoutBinding(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9) {
        this.rootView = relativeLayout;
        this.ivDrawerBackground = imageView;
        this.menuAction = linearLayout;
        this.menuAdventure = linearLayout2;
        this.menuArcade = linearLayout3;
        this.menuPrivacy = linearLayout4;
        this.menuPuzzle = linearLayout5;
        this.menuRate = linearLayout6;
        this.menuShare = linearLayout7;
        this.menuSports = linearLayout8;
        this.menuStrategy = linearLayout9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DrawerMenuLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DrawerMenuLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.drawer_menu_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DrawerMenuLayoutBinding bind(View view) {
        int i = R.id.ivDrawerBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.menuAction;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.menuAdventure;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.menuArcade;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.menuPrivacy;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout4 != null) {
                            i = R.id.menuPuzzle;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout5 != null) {
                                i = R.id.menuRate;
                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout6 != null) {
                                    i = R.id.menuShare;
                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout7 != null) {
                                        i = R.id.menuSports;
                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout8 != null) {
                                            i = R.id.menuStrategy;
                                            LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout9 != null) {
                                                return new DrawerMenuLayoutBinding((RelativeLayout) view, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9);
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
