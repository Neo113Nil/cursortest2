package com.chad.library.adapter.base.viewholder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.Keep;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes2.dex */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    private final SparseArray<View> views;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewHolder(View view) {
        super(view);
        s.checkNotNullParameter(view, "view");
        this.views = new SparseArray<>();
    }

    public <T extends View> T findView(int i8) {
        return (T) this.itemView.findViewById(i8);
    }

    public <B extends ViewDataBinding> B getBinding() {
        return (B) DataBindingUtil.getBinding(this.itemView);
    }

    public <T extends View> T getView(@IdRes int i8) {
        T t7 = (T) getViewOrNull(i8);
        if (t7 != null) {
            return t7;
        }
        throw new IllegalStateException(("No view found with id " + i8).toString());
    }

    public <T extends View> T getViewOrNull(@IdRes int i8) {
        T t7;
        T t8 = (T) this.views.get(i8);
        if (t8 == null && (t7 = (T) this.itemView.findViewById(i8)) != null) {
            this.views.put(i8, t7);
            return t7;
        }
        if (t8 == null) {
            return null;
        }
        return t8;
    }

    public BaseViewHolder setBackgroundColor(@IdRes int i8, @ColorInt int i9) {
        getView(i8).setBackgroundColor(i9);
        return this;
    }

    public BaseViewHolder setBackgroundResource(@IdRes int i8, @DrawableRes int i9) {
        getView(i8).setBackgroundResource(i9);
        return this;
    }

    public BaseViewHolder setEnabled(@IdRes int i8, boolean z7) {
        getView(i8).setEnabled(z7);
        return this;
    }

    public BaseViewHolder setGone(@IdRes int i8, boolean z7) {
        getView(i8).setVisibility(z7 ? 8 : 0);
        return this;
    }

    public BaseViewHolder setImageBitmap(@IdRes int i8, Bitmap bitmap) {
        ((ImageView) getView(i8)).setImageBitmap(bitmap);
        return this;
    }

    public BaseViewHolder setImageDrawable(@IdRes int i8, Drawable drawable) {
        ((ImageView) getView(i8)).setImageDrawable(drawable);
        return this;
    }

    public BaseViewHolder setImageResource(@IdRes int i8, @DrawableRes int i9) {
        ((ImageView) getView(i8)).setImageResource(i9);
        return this;
    }

    public BaseViewHolder setText(@IdRes int i8, CharSequence charSequence) {
        ((TextView) getView(i8)).setText(charSequence);
        return this;
    }

    public BaseViewHolder setTextColor(@IdRes int i8, @ColorInt int i9) {
        ((TextView) getView(i8)).setTextColor(i9);
        return this;
    }

    public BaseViewHolder setTextColorRes(@IdRes int i8, @ColorRes int i9) {
        ((TextView) getView(i8)).setTextColor(ContextCompat.getColor(this.itemView.getContext(), i9));
        return this;
    }

    public BaseViewHolder setVisible(@IdRes int i8, boolean z7) {
        getView(i8).setVisibility(z7 ? 0 : 4);
        return this;
    }

    public BaseViewHolder setText(@IdRes int i8, @StringRes int i9) {
        ((TextView) getView(i8)).setText(i9);
        return this;
    }
}
