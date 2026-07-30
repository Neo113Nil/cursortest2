package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.TypedValueCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.baidu.ar.util.SystemInfoUtil;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;

    @NonNull
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;

    @NonNull
    private final TextView mView;
    private int mStyle = 0;
    private int mFontWeight = -1;

    @RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static LocaleList forLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        static void setTextLocales(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i8, int i9, int i10, int i11) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
        }

        @DoNotInline
        static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i8) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
        }

        @DoNotInline
        static boolean setFontVariationSettings(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static Typeface create(Typeface typeface, int i8, boolean z7) {
            return Typeface.create(typeface, i8, z7);
        }
    }

    AppCompatTextHelper(@NonNull TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i8) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i8);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.mView;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.mView.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.mView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
        TextView textView2 = this.mView;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setTextSizeInternal(int i8, float f8) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i8, f8);
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        String string;
        this.mStyle = tintTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, this.mStyle);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = tintTypedArray.getInt(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.mFontWeight = i9;
            if (i9 != -1) {
                this.mStyle &= 2;
            }
        }
        int i10 = R.styleable.TextAppearance_android_fontFamily;
        if (!tintTypedArray.hasValue(i10) && !tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            int i11 = R.styleable.TextAppearance_android_typeface;
            if (tintTypedArray.hasValue(i11)) {
                this.mAsyncFontPending = false;
                int i12 = tintTypedArray.getInt(i11, 1);
                if (i12 == 1) {
                    this.mFontTypeface = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.mFontTypeface = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.mFontTypeface = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.mFontTypeface = null;
        int i13 = R.styleable.TextAppearance_fontFamily;
        if (tintTypedArray.hasValue(i13)) {
            i10 = i13;
        }
        final int i14 = this.mFontWeight;
        final int i15 = this.mStyle;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.mView);
            try {
                Typeface font = tintTypedArray.getFont(i10, this.mStyle, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    /* renamed from: onFontRetrievalFailed */
                    public void lambda$callbackFailAsync$1(int i16) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    /* renamed from: onFontRetrieved */
                    public void lambda$callbackSuccessAsync$0(@NonNull Typeface typeface) {
                        int i16;
                        if (Build.VERSION.SDK_INT >= 28 && (i16 = i14) != -1) {
                            typeface = Api28Impl.create(typeface, i16, (i15 & 2) != 0);
                        }
                        AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
                    }
                });
                if (font != null) {
                    if (i8 < 28 || this.mFontWeight == -1) {
                        this.mFontTypeface = font;
                    } else {
                        this.mFontTypeface = Api28Impl.create(Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                    }
                }
                this.mAsyncFontPending = this.mFontTypeface == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.mFontTypeface != null || (string = tintTypedArray.getString(i10)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.mFontWeight == -1) {
            this.mFontTypeface = Typeface.create(string, this.mStyle);
        } else {
            this.mFontTypeface = Api28Impl.create(Typeface.create(string, 0), this.mFontWeight, (this.mStyle & 2) != 0);
        }
    }

    void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
        applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
        applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    @Nullable
    ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    @Nullable
    PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e2  */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void loadFromAttributes(@Nullable AttributeSet attributeSet, int i8) {
        String str;
        ColorStateList colorStateList;
        boolean z7;
        boolean z8;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        String str2;
        boolean z9;
        int i9;
        int i10;
        AppCompatDrawableManager appCompatDrawableManager;
        Typeface typeface;
        TintTypedArray obtainStyledAttributes;
        int i11;
        int i12;
        int i13;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int i14;
        int i15;
        float f8;
        int i16;
        int[] autoSizeTextAvailableSizes;
        int i17;
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager2 = AppCompatDrawableManager.get();
        int[] iArr = R.styleable.AppCompatTextHelper;
        TintTypedArray obtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i8, 0);
        TextView textView = this.mView;
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes2.getWrappedTypeArray(), i8, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        int i18 = R.styleable.AppCompatTextHelper_android_drawableLeft;
        if (obtainStyledAttributes2.hasValue(i18)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager2, obtainStyledAttributes2.getResourceId(i18, 0));
        }
        int i19 = R.styleable.AppCompatTextHelper_android_drawableTop;
        if (obtainStyledAttributes2.hasValue(i19)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager2, obtainStyledAttributes2.getResourceId(i19, 0));
        }
        int i20 = R.styleable.AppCompatTextHelper_android_drawableRight;
        if (obtainStyledAttributes2.hasValue(i20)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager2, obtainStyledAttributes2.getResourceId(i20, 0));
        }
        int i21 = R.styleable.AppCompatTextHelper_android_drawableBottom;
        if (obtainStyledAttributes2.hasValue(i21)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager2, obtainStyledAttributes2.getResourceId(i21, 0));
        }
        int i22 = R.styleable.AppCompatTextHelper_android_drawableStart;
        if (obtainStyledAttributes2.hasValue(i22)) {
            this.mDrawableStartTint = createTintInfo(context, appCompatDrawableManager2, obtainStyledAttributes2.getResourceId(i22, 0));
        }
        int i23 = R.styleable.AppCompatTextHelper_android_drawableEnd;
        if (obtainStyledAttributes2.hasValue(i23)) {
            this.mDrawableEndTint = createTintInfo(context, appCompatDrawableManager2, obtainStyledAttributes2.getResourceId(i23, 0));
        }
        obtainStyledAttributes2.recycle();
        boolean z10 = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId != -1) {
            TintTypedArray obtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, resourceId, R.styleable.TextAppearance);
            if (!z10) {
                int i24 = R.styleable.TextAppearance_textAllCaps;
                if (obtainStyledAttributes3.hasValue(i24)) {
                    z7 = obtainStyledAttributes3.getBoolean(i24, false);
                    z8 = true;
                    updateTypefaceAndStyle(context, obtainStyledAttributes3);
                    i17 = Build.VERSION.SDK_INT;
                    if (i17 >= 23) {
                        int i25 = R.styleable.TextAppearance_android_textColor;
                        colorStateList = obtainStyledAttributes3.hasValue(i25) ? obtainStyledAttributes3.getColorStateList(i25) : null;
                        int i26 = R.styleable.TextAppearance_android_textColorHint;
                        colorStateList2 = obtainStyledAttributes3.hasValue(i26) ? obtainStyledAttributes3.getColorStateList(i26) : null;
                        int i27 = R.styleable.TextAppearance_android_textColorLink;
                        if (obtainStyledAttributes3.hasValue(i27)) {
                            colorStateList3 = obtainStyledAttributes3.getColorStateList(i27);
                            int i28 = R.styleable.TextAppearance_textLocale;
                            str = obtainStyledAttributes3.hasValue(i28) ? obtainStyledAttributes3.getString(i28) : null;
                            if (i17 >= 26) {
                                int i29 = R.styleable.TextAppearance_fontVariationSettings;
                                if (obtainStyledAttributes3.hasValue(i29)) {
                                    str2 = obtainStyledAttributes3.getString(i29);
                                    obtainStyledAttributes3.recycle();
                                }
                            }
                            str2 = null;
                            obtainStyledAttributes3.recycle();
                        }
                    } else {
                        colorStateList = null;
                        colorStateList2 = null;
                    }
                    colorStateList3 = null;
                    int i282 = R.styleable.TextAppearance_textLocale;
                    if (obtainStyledAttributes3.hasValue(i282)) {
                    }
                    if (i17 >= 26) {
                    }
                    str2 = null;
                    obtainStyledAttributes3.recycle();
                }
            }
            z7 = false;
            z8 = false;
            updateTypefaceAndStyle(context, obtainStyledAttributes3);
            i17 = Build.VERSION.SDK_INT;
            if (i17 >= 23) {
            }
            colorStateList3 = null;
            int i2822 = R.styleable.TextAppearance_textLocale;
            if (obtainStyledAttributes3.hasValue(i2822)) {
            }
            if (i17 >= 26) {
            }
            str2 = null;
            obtainStyledAttributes3.recycle();
        } else {
            str = null;
            colorStateList = null;
            z7 = false;
            z8 = false;
            colorStateList2 = null;
            colorStateList3 = null;
            str2 = null;
        }
        TintTypedArray obtainStyledAttributes4 = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.TextAppearance, i8, 0);
        if (!z10) {
            int i30 = R.styleable.TextAppearance_textAllCaps;
            if (obtainStyledAttributes4.hasValue(i30)) {
                z7 = obtainStyledAttributes4.getBoolean(i30, false);
                z9 = true;
                i9 = Build.VERSION.SDK_INT;
                if (i9 < 23) {
                    int i31 = R.styleable.TextAppearance_android_textColor;
                    if (obtainStyledAttributes4.hasValue(i31)) {
                        colorStateList = obtainStyledAttributes4.getColorStateList(i31);
                    }
                    int i32 = R.styleable.TextAppearance_android_textColorHint;
                    if (obtainStyledAttributes4.hasValue(i32)) {
                        colorStateList2 = obtainStyledAttributes4.getColorStateList(i32);
                    }
                    int i33 = R.styleable.TextAppearance_android_textColorLink;
                    if (obtainStyledAttributes4.hasValue(i33)) {
                        colorStateList3 = obtainStyledAttributes4.getColorStateList(i33);
                    }
                }
                i10 = R.styleable.TextAppearance_textLocale;
                if (obtainStyledAttributes4.hasValue(i10)) {
                    str = obtainStyledAttributes4.getString(i10);
                }
                if (i9 >= 26) {
                    int i34 = R.styleable.TextAppearance_fontVariationSettings;
                    if (obtainStyledAttributes4.hasValue(i34)) {
                        str2 = obtainStyledAttributes4.getString(i34);
                    }
                }
                if (i9 >= 28) {
                    int i35 = R.styleable.TextAppearance_android_textSize;
                    if (obtainStyledAttributes4.hasValue(i35) && obtainStyledAttributes4.getDimensionPixelSize(i35, -1) == 0) {
                        appCompatDrawableManager = appCompatDrawableManager2;
                        this.mView.setTextSize(0, 0.0f);
                        updateTypefaceAndStyle(context, obtainStyledAttributes4);
                        obtainStyledAttributes4.recycle();
                        if (colorStateList != null) {
                            this.mView.setTextColor(colorStateList);
                        }
                        if (colorStateList2 != null) {
                            this.mView.setHintTextColor(colorStateList2);
                        }
                        if (colorStateList3 != null) {
                            this.mView.setLinkTextColor(colorStateList3);
                        }
                        if (!z10 && z9) {
                            setAllCaps(z7);
                        }
                        typeface = this.mFontTypeface;
                        if (typeface != null) {
                            if (this.mFontWeight == -1) {
                                this.mView.setTypeface(typeface, this.mStyle);
                            } else {
                                this.mView.setTypeface(typeface);
                            }
                        }
                        if (str2 != null) {
                            Api26Impl.setFontVariationSettings(this.mView, str2);
                        }
                        if (str != null) {
                            if (i9 >= 24) {
                                Api24Impl.setTextLocales(this.mView, Api24Impl.forLanguageTags(str));
                            } else {
                                this.mView.setTextLocale(Api21Impl.forLanguageTag(str.split(SystemInfoUtil.COMMA)[0]));
                            }
                        }
                        this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i8);
                        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && this.mAutoSizeTextHelper.getAutoSizeTextType() != 0) {
                            autoSizeTextAvailableSizes = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
                            if (autoSizeTextAvailableSizes.length > 0) {
                                if (Api26Impl.getAutoSizeStepGranularity(this.mView) != -1.0f) {
                                    Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(this.mView, this.mAutoSizeTextHelper.getAutoSizeMinTextSize(), this.mAutoSizeTextHelper.getAutoSizeMaxTextSize(), this.mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
                                } else {
                                    Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(this.mView, autoSizeTextAvailableSizes, 0);
                                }
                            }
                        }
                        obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.AppCompatTextView);
                        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableLeftCompat, -1);
                        AppCompatDrawableManager appCompatDrawableManager3 = appCompatDrawableManager;
                        Drawable drawable = resourceId2 != -1 ? appCompatDrawableManager3.getDrawable(context, resourceId2) : null;
                        int resourceId3 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableTopCompat, -1);
                        Drawable drawable2 = resourceId3 != -1 ? appCompatDrawableManager3.getDrawable(context, resourceId3) : null;
                        int resourceId4 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableRightCompat, -1);
                        Drawable drawable3 = resourceId4 != -1 ? appCompatDrawableManager3.getDrawable(context, resourceId4) : null;
                        int resourceId5 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableBottomCompat, -1);
                        Drawable drawable4 = resourceId5 != -1 ? appCompatDrawableManager3.getDrawable(context, resourceId5) : null;
                        int resourceId6 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableStartCompat, -1);
                        Drawable drawable5 = resourceId6 != -1 ? appCompatDrawableManager3.getDrawable(context, resourceId6) : null;
                        int resourceId7 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableEndCompat, -1);
                        setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId7 != -1 ? appCompatDrawableManager3.getDrawable(context, resourceId7) : null);
                        i11 = R.styleable.AppCompatTextView_drawableTint;
                        if (obtainStyledAttributes.hasValue(i11)) {
                            TextViewCompat.setCompoundDrawableTintList(this.mView, obtainStyledAttributes.getColorStateList(i11));
                        }
                        i12 = R.styleable.AppCompatTextView_drawableTintMode;
                        if (obtainStyledAttributes.hasValue(i12)) {
                            i13 = -1;
                            TextViewCompat.setCompoundDrawableTintMode(this.mView, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(i12, -1), null));
                        } else {
                            i13 = -1;
                        }
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppCompatTextView_firstBaselineToTopHeight, i13);
                        dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppCompatTextView_lastBaselineToBottomHeight, i13);
                        i14 = R.styleable.AppCompatTextView_lineHeight;
                        if (obtainStyledAttributes.hasValue(i14)) {
                            TypedValue peekValue = obtainStyledAttributes.peekValue(i14);
                            if (peekValue != null && peekValue.type == 5) {
                                int unitFromComplexDimension = TypedValueCompat.getUnitFromComplexDimension(peekValue.data);
                                f8 = TypedValue.complexToFloat(peekValue.data);
                                i16 = unitFromComplexDimension;
                                i15 = -1;
                                obtainStyledAttributes.recycle();
                                if (dimensionPixelSize != i15) {
                                    TextViewCompat.setFirstBaselineToTopHeight(this.mView, dimensionPixelSize);
                                }
                                if (dimensionPixelSize2 != i15) {
                                    TextViewCompat.setLastBaselineToBottomHeight(this.mView, dimensionPixelSize2);
                                }
                                if (f8 == -1.0f) {
                                    if (i16 == i15) {
                                        TextViewCompat.setLineHeight(this.mView, (int) f8);
                                        return;
                                    } else {
                                        TextViewCompat.setLineHeight(this.mView, i16, f8);
                                        return;
                                    }
                                }
                                return;
                            }
                            i15 = -1;
                            f8 = obtainStyledAttributes.getDimensionPixelSize(i14, -1);
                        } else {
                            i15 = -1;
                            f8 = -1.0f;
                        }
                        i16 = -1;
                        obtainStyledAttributes.recycle();
                        if (dimensionPixelSize != i15) {
                        }
                        if (dimensionPixelSize2 != i15) {
                        }
                        if (f8 == -1.0f) {
                        }
                    }
                }
                appCompatDrawableManager = appCompatDrawableManager2;
                updateTypefaceAndStyle(context, obtainStyledAttributes4);
                obtainStyledAttributes4.recycle();
                if (colorStateList != null) {
                }
                if (colorStateList2 != null) {
                }
                if (colorStateList3 != null) {
                }
                if (!z10) {
                    setAllCaps(z7);
                }
                typeface = this.mFontTypeface;
                if (typeface != null) {
                }
                if (str2 != null) {
                }
                if (str != null) {
                }
                this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i8);
                if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
                    autoSizeTextAvailableSizes = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
                    if (autoSizeTextAvailableSizes.length > 0) {
                    }
                }
                obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.AppCompatTextView);
                int resourceId22 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableLeftCompat, -1);
                AppCompatDrawableManager appCompatDrawableManager32 = appCompatDrawableManager;
                if (resourceId22 != -1) {
                }
                int resourceId32 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableTopCompat, -1);
                if (resourceId32 != -1) {
                }
                int resourceId42 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableRightCompat, -1);
                if (resourceId42 != -1) {
                }
                int resourceId52 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableBottomCompat, -1);
                if (resourceId52 != -1) {
                }
                int resourceId62 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableStartCompat, -1);
                if (resourceId62 != -1) {
                }
                int resourceId72 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableEndCompat, -1);
                setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId72 != -1 ? appCompatDrawableManager32.getDrawable(context, resourceId72) : null);
                i11 = R.styleable.AppCompatTextView_drawableTint;
                if (obtainStyledAttributes.hasValue(i11)) {
                }
                i12 = R.styleable.AppCompatTextView_drawableTintMode;
                if (obtainStyledAttributes.hasValue(i12)) {
                }
                dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppCompatTextView_firstBaselineToTopHeight, i13);
                dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppCompatTextView_lastBaselineToBottomHeight, i13);
                i14 = R.styleable.AppCompatTextView_lineHeight;
                if (obtainStyledAttributes.hasValue(i14)) {
                }
                i16 = -1;
                obtainStyledAttributes.recycle();
                if (dimensionPixelSize != i15) {
                }
                if (dimensionPixelSize2 != i15) {
                }
                if (f8 == -1.0f) {
                }
            }
        }
        z9 = z8;
        i9 = Build.VERSION.SDK_INT;
        if (i9 < 23) {
        }
        i10 = R.styleable.TextAppearance_textLocale;
        if (obtainStyledAttributes4.hasValue(i10)) {
        }
        if (i9 >= 26) {
        }
        if (i9 >= 28) {
        }
        appCompatDrawableManager = appCompatDrawableManager2;
        updateTypefaceAndStyle(context, obtainStyledAttributes4);
        obtainStyledAttributes4.recycle();
        if (colorStateList != null) {
        }
        if (colorStateList2 != null) {
        }
        if (colorStateList3 != null) {
        }
        if (!z10) {
        }
        typeface = this.mFontTypeface;
        if (typeface != null) {
        }
        if (str2 != null) {
        }
        if (str != null) {
        }
        this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i8);
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
        }
        obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.AppCompatTextView);
        int resourceId222 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        AppCompatDrawableManager appCompatDrawableManager322 = appCompatDrawableManager;
        if (resourceId222 != -1) {
        }
        int resourceId322 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableTopCompat, -1);
        if (resourceId322 != -1) {
        }
        int resourceId422 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableRightCompat, -1);
        if (resourceId422 != -1) {
        }
        int resourceId522 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        if (resourceId522 != -1) {
        }
        int resourceId622 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableStartCompat, -1);
        if (resourceId622 != -1) {
        }
        int resourceId722 = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_drawableEndCompat, -1);
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId722 != -1 ? appCompatDrawableManager322.getDrawable(context, resourceId722) : null);
        i11 = R.styleable.AppCompatTextView_drawableTint;
        if (obtainStyledAttributes.hasValue(i11)) {
        }
        i12 = R.styleable.AppCompatTextView_drawableTintMode;
        if (obtainStyledAttributes.hasValue(i12)) {
        }
        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppCompatTextView_firstBaselineToTopHeight, i13);
        dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppCompatTextView_lastBaselineToBottomHeight, i13);
        i14 = R.styleable.AppCompatTextView_lineHeight;
        if (obtainStyledAttributes.hasValue(i14)) {
        }
        i16 = -1;
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize != i15) {
        }
        if (dimensionPixelSize2 != i15) {
        }
        if (f8 == -1.0f) {
        }
    }

    void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final TextView textView = weakReference.get();
            if (textView != null) {
                if (!textView.isAttachedToWindow()) {
                    textView.setTypeface(typeface, this.mStyle);
                } else {
                    final int i8 = this.mStyle;
                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i8);
                        }
                    });
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return;
        }
        autoSizeText();
    }

    void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    void onSetTextAppearance(Context context, int i8) {
        String string;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i8, R.styleable.TextAppearance);
        int i9 = R.styleable.TextAppearance_textAllCaps;
        if (obtainStyledAttributes.hasValue(i9)) {
            setAllCaps(obtainStyledAttributes.getBoolean(i9, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            int i11 = R.styleable.TextAppearance_android_textColor;
            if (obtainStyledAttributes.hasValue(i11) && (colorStateList3 = obtainStyledAttributes.getColorStateList(i11)) != null) {
                this.mView.setTextColor(colorStateList3);
            }
            int i12 = R.styleable.TextAppearance_android_textColorLink;
            if (obtainStyledAttributes.hasValue(i12) && (colorStateList2 = obtainStyledAttributes.getColorStateList(i12)) != null) {
                this.mView.setLinkTextColor(colorStateList2);
            }
            int i13 = R.styleable.TextAppearance_android_textColorHint;
            if (obtainStyledAttributes.hasValue(i13) && (colorStateList = obtainStyledAttributes.getColorStateList(i13)) != null) {
                this.mView.setHintTextColor(colorStateList);
            }
        }
        int i14 = R.styleable.TextAppearance_android_textSize;
        if (obtainStyledAttributes.hasValue(i14) && obtainStyledAttributes.getDimensionPixelSize(i14, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, obtainStyledAttributes);
        if (i10 >= 26) {
            int i15 = R.styleable.TextAppearance_fontVariationSettings;
            if (obtainStyledAttributes.hasValue(i15) && (string = obtainStyledAttributes.getString(i15)) != null) {
                Api26Impl.setFontVariationSettings(this.mView, string);
            }
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    void populateSurroundingTextIfNeeded(@NonNull TextView textView, @Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
    }

    void setAllCaps(boolean z7) {
        this.mView.setAllCaps(z7);
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i8) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
    }

    void setAutoSizeTextTypeWithDefaults(int i8) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i8);
    }

    void setCompoundDrawableTintList(@Nullable ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        setCompoundTints();
    }

    void setCompoundDrawableTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        setCompoundTints();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void setTextSize(int i8, float f8) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE || isAutoSizeEnabled()) {
            return;
        }
        setTextSizeInternal(i8, f8);
    }
}
