package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes10.dex */
public final class CompoundButtonCompat {
    public static void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList) {
        Api21Impl.setButtonTintList(compoundButton, colorStateList);
    }

    public static ColorStateList getButtonTintList(CompoundButton compoundButton) {
        return Api21Impl.getButtonTintList(compoundButton);
    }

    public static void setButtonTintMode(CompoundButton compoundButton, PorterDuff.Mode mode) {
        Api21Impl.setButtonTintMode(compoundButton, mode);
    }

    public static PorterDuff.Mode getButtonTintMode(CompoundButton compoundButton) {
        return Api21Impl.getButtonTintMode(compoundButton);
    }

    public static Drawable getButtonDrawable(CompoundButton compoundButton) {
        return Api23Impl.getButtonDrawable(compoundButton);
    }

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @DoNotInline
        static ColorStateList getButtonTintList(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @DoNotInline
        static void setButtonTintMode(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }

        @DoNotInline
        static PorterDuff.Mode getButtonTintMode(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }
    }

    @RequiresApi
    static class Api23Impl {
        @DoNotInline
        static Drawable getButtonDrawable(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }
}
