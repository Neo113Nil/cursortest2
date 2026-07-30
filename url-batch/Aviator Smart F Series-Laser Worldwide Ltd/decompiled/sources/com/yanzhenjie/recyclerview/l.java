package com.yanzhenjie.recyclerview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.content.ContextCompat;

/* loaded from: classes4.dex */
public class l {
    private Drawable background;
    private Drawable icon;
    private Context mContext;
    private int textAppearance;
    private Typeface textTypeface;
    private String title;
    private ColorStateList titleColor;
    private int titleSize;
    private int width = -2;
    private int height = -2;
    private int weight = 0;

    public l(Context context) {
        this.mContext = context;
    }

    public Drawable getBackground() {
        return this.background;
    }

    public int getHeight() {
        return this.height;
    }

    public Drawable getImage() {
        return this.icon;
    }

    public String getText() {
        return this.title;
    }

    public int getTextAppearance() {
        return this.textAppearance;
    }

    public int getTextSize() {
        return this.titleSize;
    }

    public Typeface getTextTypeface() {
        return this.textTypeface;
    }

    public ColorStateList getTitleColor() {
        return this.titleColor;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getWidth() {
        return this.width;
    }

    public l setBackground(Drawable drawable) {
        this.background = drawable;
        return this;
    }

    public l setBackgroundColor(@ColorInt int i8) {
        this.background = new ColorDrawable(i8);
        return this;
    }

    public l setBackgroundColorResource(@ColorRes int i8) {
        return setBackgroundColor(ContextCompat.getColor(this.mContext, i8));
    }

    public l setHeight(int i8) {
        this.height = i8;
        return this;
    }

    public l setImage(Drawable drawable) {
        this.icon = drawable;
        return this;
    }

    public l setText(String str) {
        this.title = str;
        return this;
    }

    public l setTextAppearance(@StyleRes int i8) {
        this.textAppearance = i8;
        return this;
    }

    public l setTextColor(@ColorInt int i8) {
        this.titleColor = ColorStateList.valueOf(i8);
        return this;
    }

    public l setTextColorResource(@ColorRes int i8) {
        return setTextColor(ContextCompat.getColor(this.mContext, i8));
    }

    public l setTextSize(int i8) {
        this.titleSize = i8;
        return this;
    }

    public l setTextTypeface(Typeface typeface) {
        this.textTypeface = typeface;
        return this;
    }

    public l setWeight(int i8) {
        this.weight = i8;
        return this;
    }

    public l setWidth(int i8) {
        this.width = i8;
        return this;
    }

    public l setBackground(@DrawableRes int i8) {
        return setBackground(ContextCompat.getDrawable(this.mContext, i8));
    }

    public l setImage(@DrawableRes int i8) {
        return setImage(ContextCompat.getDrawable(this.mContext, i8));
    }

    public l setText(@StringRes int i8) {
        return setText(this.mContext.getString(i8));
    }
}
