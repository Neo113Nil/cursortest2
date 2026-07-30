package com.donkingliang.groupedadapter.holder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> mViews;

    public BaseViewHolder(View view) {
        super(view);
        this.mViews = new SparseArray<>();
    }

    public <T extends View> T get(int i8) {
        T t7 = (T) this.mViews.get(i8);
        if (t7 != null) {
            return t7;
        }
        T t8 = (T) this.itemView.findViewById(i8);
        this.mViews.put(i8, t8);
        return t8;
    }

    public <T extends ViewDataBinding> T getBinding() {
        return (T) DataBindingUtil.getBinding(this.itemView);
    }

    public BaseViewHolder setBackgroundColor(int i8, int i9) {
        get(i8).setBackgroundColor(i9);
        return this;
    }

    public BaseViewHolder setBackgroundRes(int i8, int i9) {
        get(i8).setBackgroundResource(i9);
        return this;
    }

    public BaseViewHolder setImageBitmap(int i8, Bitmap bitmap) {
        ((ImageView) get(i8)).setImageBitmap(bitmap);
        return this;
    }

    public BaseViewHolder setImageDrawable(int i8, Drawable drawable) {
        ((ImageView) get(i8)).setImageDrawable(drawable);
        return this;
    }

    public BaseViewHolder setImageResource(int i8, int i9) {
        ((ImageView) get(i8)).setImageResource(i9);
        return this;
    }

    public BaseViewHolder setText(int i8, CharSequence charSequence) {
        ((TextView) get(i8)).setText(charSequence);
        return this;
    }

    public BaseViewHolder setTextColor(int i8, int i9) {
        ((TextView) get(i8)).setTextColor(i9);
        return this;
    }

    public BaseViewHolder setTextSize(int i8, float f8) {
        ((TextView) get(i8)).setTextSize(f8);
        return this;
    }

    public BaseViewHolder setVisible(int i8, boolean z7) {
        get(i8).setVisibility(z7 ? 0 : 8);
        return this;
    }

    public BaseViewHolder setText(int i8, int i9) {
        ((TextView) get(i8)).setText(i9);
        return this;
    }

    public BaseViewHolder setVisible(int i8, int i9) {
        get(i8).setVisibility(i9);
        return this;
    }
}
