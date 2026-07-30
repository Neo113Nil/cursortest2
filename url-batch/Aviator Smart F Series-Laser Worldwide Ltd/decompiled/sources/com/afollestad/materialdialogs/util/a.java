package com.afollestad.materialdialogs.util;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;

/* loaded from: classes.dex */
public class a {

    /* renamed from: com.afollestad.materialdialogs.util.a$a, reason: collision with other inner class name */
    static class RunnableC0011a implements Runnable {
        final /* synthetic */ MaterialDialog.e val$builder;
        final /* synthetic */ MaterialDialog val$dialog;

        RunnableC0011a(MaterialDialog materialDialog, MaterialDialog.e eVar) {
            this.val$dialog = materialDialog;
            this.val$builder = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.val$dialog.getInputEditText().requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) this.val$builder.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.val$dialog.getInputEditText(), 1);
            }
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$com$afollestad$materialdialogs$GravityEnum;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            $SwitchMap$com$afollestad$materialdialogs$GravityEnum = iArr;
            try {
                iArr[GravityEnum.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$afollestad$materialdialogs$GravityEnum[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @ColorInt
    public static int adjustAlpha(@ColorInt int i8, float f8) {
        return Color.argb(Math.round(Color.alpha(i8) * f8), Color.red(i8), Color.green(i8), Color.blue(i8));
    }

    public static ColorStateList getActionTextColorStateList(Context context, @ColorRes int i8) {
        ColorStateList colorStateList;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i8, typedValue, true);
        int i9 = typedValue.type;
        if (i9 >= 28 && i9 <= 31) {
            return getActionTextStateList(context, typedValue.data);
        }
        if (Build.VERSION.SDK_INT <= 22) {
            return context.getResources().getColorStateList(i8);
        }
        colorStateList = context.getColorStateList(i8);
        return colorStateList;
    }

    public static ColorStateList getActionTextStateList(Context context, int i8) {
        int resolveColor = resolveColor(context, R.attr.textColorPrimary);
        if (i8 == 0) {
            i8 = resolveColor;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{adjustAlpha(i8, 0.4f), i8});
    }

    @ColorInt
    public static int getColor(Context context, @ColorRes int i8) {
        return ContextCompat.getColor(context, i8);
    }

    public static int[] getColorArray(@NonNull Context context, @ArrayRes int i8) {
        if (i8 == 0) {
            return null;
        }
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i8);
        int[] iArr = new int[obtainTypedArray.length()];
        for (int i9 = 0; i9 < obtainTypedArray.length(); i9++) {
            iArr[i9] = obtainTypedArray.getColor(i9, 0);
        }
        obtainTypedArray.recycle();
        return iArr;
    }

    @ColorInt
    public static int getDisabledColor(Context context) {
        return adjustAlpha(isColorDark(resolveColor(context, R.attr.textColorPrimary)) ? -16777216 : -1, 0.3f);
    }

    private static int gravityEnumToAttrInt(GravityEnum gravityEnum) {
        int i8 = b.$SwitchMap$com$afollestad$materialdialogs$GravityEnum[gravityEnum.ordinal()];
        int i9 = 1;
        if (i8 != 1) {
            i9 = 2;
            if (i8 != 2) {
                return 0;
            }
        }
        return i9;
    }

    public static void hideKeyboard(@NonNull DialogInterface dialogInterface, @NonNull MaterialDialog.e eVar) {
        InputMethodManager inputMethodManager;
        MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
        if (materialDialog.getInputEditText() == null || (inputMethodManager = (InputMethodManager) eVar.getContext().getSystemService("input_method")) == null) {
            return;
        }
        View currentFocus = materialDialog.getCurrentFocus();
        IBinder windowToken = currentFocus != null ? currentFocus.getWindowToken() : materialDialog.getView() != null ? materialDialog.getView().getWindowToken() : null;
        if (windowToken != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    public static boolean isColorDark(@ColorInt int i8) {
        return 1.0d - ((((((double) Color.red(i8)) * 0.299d) + (((double) Color.green(i8)) * 0.587d)) + (((double) Color.blue(i8)) * 0.114d)) / 255.0d) >= 0.5d;
    }

    public static <T> boolean isIn(@NonNull T t7, @Nullable T[] tArr) {
        if (tArr != null && tArr.length != 0) {
            for (T t8 : tArr) {
                if (t8.equals(t7)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ColorStateList resolveActionTextColorStateList(Context context, @AttrRes int i8, ColorStateList colorStateList) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i8});
        try {
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            if (peekValue == null) {
                return colorStateList;
            }
            int i9 = peekValue.type;
            if (i9 >= 28 && i9 <= 31) {
                return getActionTextStateList(context, peekValue.data);
            }
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
            return colorStateList2 != null ? colorStateList2 : colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static boolean resolveBoolean(Context context, @AttrRes int i8, boolean z7) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i8});
        try {
            return obtainStyledAttributes.getBoolean(0, z7);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @ColorInt
    public static int resolveColor(Context context, @AttrRes int i8) {
        return resolveColor(context, i8, 0);
    }

    public static int resolveDimension(Context context, @AttrRes int i8) {
        return resolveDimension(context, i8, -1);
    }

    public static Drawable resolveDrawable(Context context, @AttrRes int i8) {
        return resolveDrawable(context, i8, null);
    }

    public static GravityEnum resolveGravityEnum(Context context, @AttrRes int i8, GravityEnum gravityEnum) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i8});
        try {
            int i9 = obtainStyledAttributes.getInt(0, gravityEnumToAttrInt(gravityEnum));
            return i9 != 1 ? i9 != 2 ? GravityEnum.START : GravityEnum.END : GravityEnum.CENTER;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static String resolveString(Context context, @AttrRes int i8) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i8, typedValue, true);
        return (String) typedValue.string;
    }

    public static void setBackgroundCompat(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void showKeyboard(@NonNull DialogInterface dialogInterface, @NonNull MaterialDialog.e eVar) {
        MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
        if (materialDialog.getInputEditText() == null) {
            return;
        }
        materialDialog.getInputEditText().post(new RunnableC0011a(materialDialog, eVar));
    }

    @ColorInt
    public static int resolveColor(Context context, @AttrRes int i8, int i9) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i8});
        try {
            return obtainStyledAttributes.getColor(0, i9);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static int resolveDimension(Context context, @AttrRes int i8, int i9) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i8});
        try {
            return obtainStyledAttributes.getDimensionPixelSize(0, i9);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static Drawable resolveDrawable(Context context, @AttrRes int i8, Drawable drawable) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i8});
        try {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 != null || drawable == null) {
                drawable = drawable2;
            }
            return drawable;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static boolean resolveBoolean(Context context, @AttrRes int i8) {
        return resolveBoolean(context, i8, false);
    }
}
