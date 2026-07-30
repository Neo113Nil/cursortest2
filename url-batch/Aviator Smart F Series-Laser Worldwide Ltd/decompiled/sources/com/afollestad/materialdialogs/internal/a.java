package com.afollestad.materialdialogs.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.afollestad.materialdialogs.R$attr;
import com.afollestad.materialdialogs.R$drawable;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class a {
    private static ColorStateList createEditTextColorStateList(@NonNull Context context, @ColorInt int i8) {
        int i9 = R$attr.colorControlNormal;
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{com.afollestad.materialdialogs.util.a.resolveColor(context, i9), com.afollestad.materialdialogs.util.a.resolveColor(context, i9), i8});
    }

    private static void setCursorTint(@NonNull EditText editText, @ColorInt int i8) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i9 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {ContextCompat.getDrawable(editText.getContext(), i9), ContextCompat.getDrawable(editText.getContext(), i9)};
            Drawable drawable = drawableArr[0];
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(i8, mode);
            drawableArr[1].setColorFilter(i8, mode);
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e8) {
            Log.d("MDTintHelper", "Device issue with cursor tinting: " + e8.getMessage());
            e8.printStackTrace();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static void setTint(@NonNull RadioButton radioButton, @NonNull ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 22) {
            radioButton.setButtonTintList(colorStateList);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(radioButton.getContext(), R$drawable.abc_btn_radio_material));
        DrawableCompat.setTintList(wrap, colorStateList);
        radioButton.setButtonDrawable(wrap);
    }

    public static void setTint(@NonNull RadioButton radioButton, @ColorInt int i8) {
        int disabledColor = com.afollestad.materialdialogs.util.a.getDisabledColor(radioButton.getContext());
        setTint(radioButton, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{com.afollestad.materialdialogs.util.a.resolveColor(radioButton.getContext(), R$attr.colorControlNormal), i8, disabledColor, disabledColor}));
    }

    public static void setTint(@NonNull CheckBox checkBox, @NonNull ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 22) {
            checkBox.setButtonTintList(colorStateList);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(checkBox.getContext(), R$drawable.abc_btn_check_material));
        DrawableCompat.setTintList(wrap, colorStateList);
        checkBox.setButtonDrawable(wrap);
    }

    public static void setTint(@NonNull CheckBox checkBox, @ColorInt int i8) {
        int disabledColor = com.afollestad.materialdialogs.util.a.getDisabledColor(checkBox.getContext());
        setTint(checkBox, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{com.afollestad.materialdialogs.util.a.resolveColor(checkBox.getContext(), R$attr.colorControlNormal), i8, disabledColor, disabledColor}));
    }

    public static void setTint(@NonNull SeekBar seekBar, @ColorInt int i8) {
        ColorStateList valueOf = ColorStateList.valueOf(i8);
        seekBar.setThumbTintList(valueOf);
        seekBar.setProgressTintList(valueOf);
    }

    public static void setTint(@NonNull ProgressBar progressBar, @ColorInt int i8) {
        setTint(progressBar, i8, false);
    }

    private static void setTint(@NonNull ProgressBar progressBar, @ColorInt int i8, boolean z7) {
        ColorStateList valueOf = ColorStateList.valueOf(i8);
        progressBar.setProgressTintList(valueOf);
        progressBar.setSecondaryProgressTintList(valueOf);
        if (z7) {
            return;
        }
        progressBar.setIndeterminateTintList(valueOf);
    }

    public static void setTint(@NonNull EditText editText, @ColorInt int i8) {
        ColorStateList createEditTextColorStateList = createEditTextColorStateList(editText.getContext(), i8);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(createEditTextColorStateList);
        } else {
            editText.setBackgroundTintList(createEditTextColorStateList);
        }
        setCursorTint(editText, i8);
    }
}
