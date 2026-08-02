package com.withpersona.sdk2.inquiry.shared.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.components.AlertDialogView$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.shared.R$styleable;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2NavigationBarBinding;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final class Pi2NavigationBar extends ConstraintLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Pi2NavigationBarBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2NavigationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.binding = Pi2NavigationBarBinding.inflate(LayoutInflater.from(getContext()), this);
        init(attributeSet, 0, 0);
    }

    public final void init(AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.Pi2NavigationBar, i, i2);
            obtainStyledAttributes.getClass();
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                Pi2NavigationBarBinding pi2NavigationBarBinding = this.binding;
                if (index == 0) {
                    ((ImageView) pi2NavigationBarBinding.navBarBackButton).setImageResource(obtainStyledAttributes.getResourceId(index, R.drawable.pi2_shared_arrow_back_16));
                } else if (index == 1) {
                    ((ImageView) pi2NavigationBarBinding.navBarCancelButton).setImageResource(obtainStyledAttributes.getResourceId(index, R.drawable.pi2_shared_close_icon));
                } else if (index == 2) {
                    ((ImageView) pi2NavigationBarBinding.navBarHelpButton).setImageResource(obtainStyledAttributes.getResourceId(index, R.drawable.pi2_shared_troubleshooting_tips_icon));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.pi2_navigation_bar_padding);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
    }

    public final void setControlsColor(int i) {
        Pi2NavigationBarBinding pi2NavigationBarBinding = this.binding;
        ((ImageView) pi2NavigationBarBinding.navBarBackButton).setColorFilter(i);
        ((ImageView) pi2NavigationBarBinding.navBarCancelButton).setColorFilter(i);
        ((ImageView) pi2NavigationBarBinding.navBarHelpButton).setColorFilter(i);
    }

    public final void setState$shared_release(NavigationState navigationState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        navigationState.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        boolean z = navigationState.showNavBar;
        boolean z2 = navigationState.isNavigationEnabled;
        Pi2NavigationBarBinding pi2NavigationBarBinding = this.binding;
        if (!z) {
            ((ImageView) pi2NavigationBarBinding.navBarBackButton).setVisibility(8);
            ((ImageView) pi2NavigationBarBinding.navBarCancelButton).setVisibility(8);
            ((ImageView) pi2NavigationBarBinding.navBarHelpButton).setVisibility(8);
            return;
        }
        ImageView imageView = (ImageView) pi2NavigationBarBinding.navBarBackButton;
        ImageView imageView2 = (ImageView) pi2NavigationBarBinding.navBarBackButton;
        ImageView imageView3 = (ImageView) pi2NavigationBarBinding.navBarHelpButton;
        ImageView imageView4 = (ImageView) pi2NavigationBarBinding.navBarCancelButton;
        imageView.setVisibility(navigationState.showBackButton ? 0 : 4);
        imageView2.setOnClickListener(new AlertDialogView$$ExternalSyntheticLambda0(6, function0));
        imageView4.setVisibility(navigationState.showCancelButton ? 0 : 4);
        imageView4.setOnClickListener(new AlertDialogView$$ExternalSyntheticLambda0(7, function02));
        imageView3.setVisibility(navigationState.showHelpButton ? 0 : 4);
        imageView3.setOnClickListener(new AlertDialogView$$ExternalSyntheticLambda0(8, function03));
        imageView2.setEnabled(z2);
        imageView4.setEnabled(z2);
        imageView3.setEnabled(z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2NavigationBar(Context context) {
        super(context);
        context.getClass();
        this.binding = Pi2NavigationBarBinding.inflate(LayoutInflater.from(getContext()), this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.binding = Pi2NavigationBarBinding.inflate(LayoutInflater.from(getContext()), this);
        init(attributeSet, i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2NavigationBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.binding = Pi2NavigationBarBinding.inflate(LayoutInflater.from(getContext()), this);
        init(attributeSet, i, i2);
    }
}
