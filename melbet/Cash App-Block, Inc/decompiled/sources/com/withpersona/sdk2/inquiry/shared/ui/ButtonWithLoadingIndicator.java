package com.withpersona.sdk2.inquiry.shared.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.miteksystems.misnap.workflow.a.o;

/* loaded from: classes9.dex */
public final class ButtonWithLoadingIndicator extends FrameLayout {
    public final o binding;
    public final PersonaMaterialButton button;
    public boolean isLoading;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(Context context) {
        super(context);
        context.getClass();
        this.binding = o.inflate(LayoutInflater.from(getContext()), this);
        this.button = addButton(0);
        initiate();
    }

    public final PersonaMaterialButton addButton(Integer num) {
        PersonaMaterialButton personaMaterialButton;
        if (num.intValue() == 0) {
            Context context = getContext();
            context.getClass();
            personaMaterialButton = new PersonaMaterialButton(context);
        } else {
            Context context2 = getContext();
            context2.getClass();
            personaMaterialButton = new PersonaMaterialButton(context2, null, num.intValue());
        }
        addView(personaMaterialButton, 0);
        return personaMaterialButton;
    }

    public final void initiate() {
        ((ProgressBar) this.binding.c).setIndeterminateTintList(ColorStateList.valueOf(this.button.getCurrentTextColor()));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (isEnabled() == z) {
            return;
        }
        super.setEnabled(z);
        this.button.setEnabled(z);
        update();
    }

    public final void setIsLoading(boolean z) {
        if (this.isLoading == z) {
            return;
        }
        this.isLoading = z;
        this.button.setActivated(z);
        update();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.button.setOnClickListener(onClickListener);
    }

    public final void setText(CharSequence charSequence) {
        charSequence.getClass();
        this.button.setText(charSequence);
    }

    public final void update() {
        boolean z = this.isLoading;
        o oVar = this.binding;
        PersonaMaterialButton personaMaterialButton = this.button;
        if (z) {
            personaMaterialButton.setTextScaleX(RecyclerView.DECELERATION_RATE);
            ((ProgressBar) oVar.c).setVisibility(0);
        } else {
            personaMaterialButton.setTextScaleX(1.0f);
            ((ProgressBar) oVar.c).setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(Context context, int i) {
        super(context);
        context.getClass();
        this.binding = o.inflate(LayoutInflater.from(getContext()), this);
        this.button = addButton(Integer.valueOf(i));
        initiate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.binding = o.inflate(LayoutInflater.from(getContext()), this);
        this.button = addButton(0);
        initiate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.binding = o.inflate(LayoutInflater.from(getContext()), this);
        this.button = addButton(0);
        initiate();
    }
}
