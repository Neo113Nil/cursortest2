package com.trembin.nirefon.betfury.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.trembin.nirefon.betfury.R;
import defpackage.bd0;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ActivityMainBinding {
    public final ConstraintLayout main;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;

    private ActivityMainBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.main = constraintLayout2;
        this.progressBar = progressBar;
    }

    public static ActivityMainBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        ProgressBar progressBar = (ProgressBar) bd0.d(view, R.id.progressBar);
        if (progressBar != null) {
            return new ActivityMainBinding(constraintLayout, constraintLayout, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.progressBar)));
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
