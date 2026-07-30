package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class RoundedWhiteBgBinding implements ViewBinding {
    private final ConstraintLayout rootView;

    private RoundedWhiteBgBinding(ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static RoundedWhiteBgBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RoundedWhiteBgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.rounded_white_bg, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RoundedWhiteBgBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RoundedWhiteBgBinding((ConstraintLayout) view);
    }
}
