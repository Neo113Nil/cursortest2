package com.afollestad.materialdialogs;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;

/* loaded from: classes.dex */
class c {
    c() {
    }

    private static void fixCanvasScalingWhenHardwareAccelerated(ProgressBar progressBar) {
    }

    @LayoutRes
    static int getInflateLayout(MaterialDialog.e eVar) {
        return eVar.customView != null ? R$layout.md_dialog_custom : (eVar.items == null && eVar.adapter == null) ? eVar.progress > -2 ? R$layout.md_dialog_progress : eVar.indeterminateProgress ? eVar.indeterminateIsHorizontalProgress ? R$layout.md_dialog_progress_indeterminate_horizontal : R$layout.md_dialog_progress_indeterminate : eVar.inputCallback != null ? eVar.checkBoxPrompt != null ? R$layout.md_dialog_input_check : R$layout.md_dialog_input : eVar.checkBoxPrompt != null ? R$layout.md_dialog_basic_check : R$layout.md_dialog_basic : eVar.checkBoxPrompt != null ? R$layout.md_dialog_list_check : R$layout.md_dialog_list;
    }

    @StyleRes
    static int getTheme(@NonNull MaterialDialog.e eVar) {
        Context context = eVar.context;
        int i8 = R$attr.md_dark_theme;
        Theme theme = eVar.theme;
        Theme theme2 = Theme.DARK;
        boolean resolveBoolean = com.afollestad.materialdialogs.util.a.resolveBoolean(context, i8, theme == theme2);
        if (!resolveBoolean) {
            theme2 = Theme.LIGHT;
        }
        eVar.theme = theme2;
        return resolveBoolean ? R$style.MD_Dark : R$style.MD_Light;
    }

    @UiThread
    static void init(MaterialDialog materialDialog) {
        MaterialDialog.e eVar = materialDialog.builder;
        materialDialog.setCancelable(eVar.cancelable);
        materialDialog.setCanceledOnTouchOutside(eVar.canceledOnTouchOutside);
        if (eVar.backgroundColor == 0) {
            eVar.backgroundColor = com.afollestad.materialdialogs.util.a.resolveColor(eVar.context, R$attr.md_background_color, com.afollestad.materialdialogs.util.a.resolveColor(materialDialog.getContext(), R$attr.colorBackgroundFloating));
        }
        if (eVar.backgroundColor != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(eVar.context.getResources().getDimension(R$dimen.md_bg_corner_radius));
            gradientDrawable.setColor(eVar.backgroundColor);
            materialDialog.getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!eVar.positiveColorSet) {
            eVar.positiveColor = com.afollestad.materialdialogs.util.a.resolveActionTextColorStateList(eVar.context, R$attr.md_positive_color, eVar.positiveColor);
        }
        if (!eVar.neutralColorSet) {
            eVar.neutralColor = com.afollestad.materialdialogs.util.a.resolveActionTextColorStateList(eVar.context, R$attr.md_neutral_color, eVar.neutralColor);
        }
        if (!eVar.negativeColorSet) {
            eVar.negativeColor = com.afollestad.materialdialogs.util.a.resolveActionTextColorStateList(eVar.context, R$attr.md_negative_color, eVar.negativeColor);
        }
        if (!eVar.widgetColorSet) {
            eVar.widgetColor = com.afollestad.materialdialogs.util.a.resolveColor(eVar.context, R$attr.md_widget_color, eVar.widgetColor);
        }
        if (!eVar.titleColorSet) {
            eVar.titleColor = com.afollestad.materialdialogs.util.a.resolveColor(eVar.context, R$attr.md_title_color, com.afollestad.materialdialogs.util.a.resolveColor(materialDialog.getContext(), R.attr.textColorPrimary));
        }
        if (!eVar.contentColorSet) {
            eVar.contentColor = com.afollestad.materialdialogs.util.a.resolveColor(eVar.context, R$attr.md_content_color, com.afollestad.materialdialogs.util.a.resolveColor(materialDialog.getContext(), R.attr.textColorSecondary));
        }
        if (!eVar.itemColorSet) {
            eVar.itemColor = com.afollestad.materialdialogs.util.a.resolveColor(eVar.context, R$attr.md_item_color, eVar.contentColor);
        }
        materialDialog.title = (TextView) materialDialog.view.findViewById(R$id.md_title);
        materialDialog.icon = (ImageView) materialDialog.view.findViewById(R$id.md_icon);
        materialDialog.titleFrame = materialDialog.view.findViewById(R$id.md_titleFrame);
        materialDialog.content = (TextView) materialDialog.view.findViewById(R$id.md_content);
        materialDialog.recyclerView = (RecyclerView) materialDialog.view.findViewById(R$id.md_contentRecyclerView);
        materialDialog.checkBoxPrompt = (CheckBox) materialDialog.view.findViewById(R$id.md_promptCheckbox);
        materialDialog.positiveButton = (MDButton) materialDialog.view.findViewById(R$id.md_buttonDefaultPositive);
        materialDialog.neutralButton = (MDButton) materialDialog.view.findViewById(R$id.md_buttonDefaultNeutral);
        materialDialog.negativeButton = (MDButton) materialDialog.view.findViewById(R$id.md_buttonDefaultNegative);
        if (eVar.inputCallback != null && eVar.positiveText == null) {
            eVar.positiveText = eVar.context.getText(R.string.ok);
        }
        materialDialog.positiveButton.setVisibility(eVar.positiveText != null ? 0 : 8);
        materialDialog.neutralButton.setVisibility(eVar.neutralText != null ? 0 : 8);
        materialDialog.negativeButton.setVisibility(eVar.negativeText != null ? 0 : 8);
        materialDialog.positiveButton.setFocusable(true);
        materialDialog.neutralButton.setFocusable(true);
        materialDialog.negativeButton.setFocusable(true);
        if (eVar.positiveFocus) {
            materialDialog.positiveButton.requestFocus();
        }
        if (eVar.neutralFocus) {
            materialDialog.neutralButton.requestFocus();
        }
        if (eVar.negativeFocus) {
            materialDialog.negativeButton.requestFocus();
        }
        if (eVar.icon != null) {
            materialDialog.icon.setVisibility(0);
            materialDialog.icon.setImageDrawable(eVar.icon);
        } else {
            Drawable resolveDrawable = com.afollestad.materialdialogs.util.a.resolveDrawable(eVar.context, R$attr.md_icon);
            if (resolveDrawable != null) {
                materialDialog.icon.setVisibility(0);
                materialDialog.icon.setImageDrawable(resolveDrawable);
            } else {
                materialDialog.icon.setVisibility(8);
            }
        }
        int i8 = eVar.maxIconSize;
        if (i8 == -1) {
            i8 = com.afollestad.materialdialogs.util.a.resolveDimension(eVar.context, R$attr.md_icon_max_size);
        }
        if (eVar.limitIconToDefaultSize || com.afollestad.materialdialogs.util.a.resolveBoolean(eVar.context, R$attr.md_icon_limit_icon_to_default_size)) {
            i8 = eVar.context.getResources().getDimensionPixelSize(R$dimen.md_icon_max_size);
        }
        if (i8 > -1) {
            materialDialog.icon.setAdjustViewBounds(true);
            materialDialog.icon.setMaxHeight(i8);
            materialDialog.icon.setMaxWidth(i8);
            materialDialog.icon.requestLayout();
        }
        if (!eVar.dividerColorSet) {
            eVar.dividerColor = com.afollestad.materialdialogs.util.a.resolveColor(eVar.context, R$attr.md_divider_color, com.afollestad.materialdialogs.util.a.resolveColor(materialDialog.getContext(), R$attr.md_divider));
        }
        materialDialog.view.setDividerColor(eVar.dividerColor);
        TextView textView = materialDialog.title;
        if (textView != null) {
            materialDialog.setTypeface(textView, eVar.mediumFont);
            materialDialog.title.setTextColor(eVar.titleColor);
            materialDialog.title.setGravity(eVar.titleGravity.getGravityInt());
            materialDialog.title.setTextAlignment(eVar.titleGravity.getTextAlignment());
            CharSequence charSequence = eVar.title;
            if (charSequence == null) {
                materialDialog.titleFrame.setVisibility(8);
            } else {
                materialDialog.title.setText(charSequence);
                materialDialog.titleFrame.setVisibility(0);
            }
        }
        TextView textView2 = materialDialog.content;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            materialDialog.setTypeface(materialDialog.content, eVar.regularFont);
            materialDialog.content.setLineSpacing(0.0f, eVar.contentLineSpacingMultiplier);
            ColorStateList colorStateList = eVar.linkColor;
            if (colorStateList == null) {
                materialDialog.content.setLinkTextColor(com.afollestad.materialdialogs.util.a.resolveColor(materialDialog.getContext(), R.attr.textColorPrimary));
            } else {
                materialDialog.content.setLinkTextColor(colorStateList);
            }
            materialDialog.content.setTextColor(eVar.contentColor);
            materialDialog.content.setGravity(eVar.contentGravity.getGravityInt());
            materialDialog.content.setTextAlignment(eVar.contentGravity.getTextAlignment());
            CharSequence charSequence2 = eVar.content;
            if (charSequence2 != null) {
                materialDialog.content.setText(charSequence2);
                materialDialog.content.setVisibility(0);
            } else {
                materialDialog.content.setVisibility(8);
            }
        }
        CheckBox checkBox = materialDialog.checkBoxPrompt;
        if (checkBox != null) {
            checkBox.setText(eVar.checkBoxPrompt);
            materialDialog.checkBoxPrompt.setChecked(eVar.checkBoxPromptInitiallyChecked);
            materialDialog.checkBoxPrompt.setOnCheckedChangeListener(eVar.checkBoxPromptListener);
            materialDialog.setTypeface(materialDialog.checkBoxPrompt, eVar.regularFont);
            materialDialog.checkBoxPrompt.setTextColor(eVar.contentColor);
            com.afollestad.materialdialogs.internal.a.setTint(materialDialog.checkBoxPrompt, eVar.widgetColor);
        }
        materialDialog.view.setButtonGravity(eVar.buttonsGravity);
        materialDialog.view.setButtonStackedGravity(eVar.btnStackedGravity);
        materialDialog.view.setStackingBehavior(eVar.stackingBehavior);
        boolean resolveBoolean = com.afollestad.materialdialogs.util.a.resolveBoolean(eVar.context, R.attr.textAllCaps, true);
        if (resolveBoolean) {
            resolveBoolean = com.afollestad.materialdialogs.util.a.resolveBoolean(eVar.context, R$attr.textAllCaps, true);
        }
        MDButton mDButton = materialDialog.positiveButton;
        materialDialog.setTypeface(mDButton, eVar.mediumFont);
        mDButton.setAllCapsCompat(resolveBoolean);
        mDButton.setText(eVar.positiveText);
        mDButton.setTextColor(eVar.positiveColor);
        MDButton mDButton2 = materialDialog.positiveButton;
        DialogAction dialogAction = DialogAction.POSITIVE;
        mDButton2.setStackedSelector(materialDialog.getButtonSelector(dialogAction, true));
        materialDialog.positiveButton.setDefaultSelector(materialDialog.getButtonSelector(dialogAction, false));
        materialDialog.positiveButton.setTag(dialogAction);
        materialDialog.positiveButton.setOnClickListener(materialDialog);
        MDButton mDButton3 = materialDialog.negativeButton;
        materialDialog.setTypeface(mDButton3, eVar.mediumFont);
        mDButton3.setAllCapsCompat(resolveBoolean);
        mDButton3.setText(eVar.negativeText);
        mDButton3.setTextColor(eVar.negativeColor);
        MDButton mDButton4 = materialDialog.negativeButton;
        DialogAction dialogAction2 = DialogAction.NEGATIVE;
        mDButton4.setStackedSelector(materialDialog.getButtonSelector(dialogAction2, true));
        materialDialog.negativeButton.setDefaultSelector(materialDialog.getButtonSelector(dialogAction2, false));
        materialDialog.negativeButton.setTag(dialogAction2);
        materialDialog.negativeButton.setOnClickListener(materialDialog);
        MDButton mDButton5 = materialDialog.neutralButton;
        materialDialog.setTypeface(mDButton5, eVar.mediumFont);
        mDButton5.setAllCapsCompat(resolveBoolean);
        mDButton5.setText(eVar.neutralText);
        mDButton5.setTextColor(eVar.neutralColor);
        MDButton mDButton6 = materialDialog.neutralButton;
        DialogAction dialogAction3 = DialogAction.NEUTRAL;
        mDButton6.setStackedSelector(materialDialog.getButtonSelector(dialogAction3, true));
        materialDialog.neutralButton.setDefaultSelector(materialDialog.getButtonSelector(dialogAction3, false));
        materialDialog.neutralButton.setTag(dialogAction3);
        materialDialog.neutralButton.setOnClickListener(materialDialog);
        if (materialDialog.recyclerView != null && eVar.adapter == null) {
            if (eVar.listCallbackSingleChoice != null) {
                materialDialog.listType = MaterialDialog.ListType.SINGLE;
            } else {
                materialDialog.listType = MaterialDialog.ListType.REGULAR;
            }
            eVar.adapter = new a(materialDialog, MaterialDialog.ListType.getLayoutForType(materialDialog.listType));
        }
        setupProgressDialog(materialDialog);
        setupInputDialog(materialDialog);
        if (eVar.customView != null) {
            ((MDRootLayout) materialDialog.view.findViewById(R$id.md_root)).noTitleNoPadding();
            FrameLayout frameLayout = (FrameLayout) materialDialog.view.findViewById(R$id.md_customViewFrame);
            materialDialog.customViewFrame = frameLayout;
            View view = eVar.customView;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (eVar.wrapCustomViewInScroll) {
                Resources resources = materialDialog.getContext().getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.md_dialog_frame_margin);
                ScrollView scrollView = new ScrollView(materialDialog.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.md_content_padding_top);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.md_content_padding_bottom);
                scrollView.setClipToPadding(false);
                if (view instanceof EditText) {
                    scrollView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
                } else {
                    scrollView.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
                scrollView.addView(view, new FrameLayout.LayoutParams(-1, -2));
                view = scrollView;
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
        DialogInterface.OnShowListener onShowListener = eVar.showListener;
        if (onShowListener != null) {
            materialDialog.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = eVar.cancelListener;
        if (onCancelListener != null) {
            materialDialog.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = eVar.dismissListener;
        if (onDismissListener != null) {
            materialDialog.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = eVar.keyListener;
        if (onKeyListener != null) {
            materialDialog.setOnKeyListener(onKeyListener);
        }
        materialDialog.setOnShowListenerInternal();
        materialDialog.invalidateList();
        materialDialog.setViewInternal(materialDialog.view);
        materialDialog.checkIfListInitScroll();
        Display defaultDisplay = materialDialog.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i9 = point.x;
        int i10 = point.y;
        int dimensionPixelSize4 = eVar.context.getResources().getDimensionPixelSize(R$dimen.md_dialog_vertical_margin);
        int dimensionPixelSize5 = eVar.context.getResources().getDimensionPixelSize(R$dimen.md_dialog_horizontal_margin);
        materialDialog.view.setMaxHeight(i10 - (dimensionPixelSize4 * 2));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(materialDialog.getWindow().getAttributes());
        layoutParams.width = Math.min(eVar.context.getResources().getDimensionPixelSize(R$dimen.md_dialog_max_width), i9 - (dimensionPixelSize5 * 2));
        materialDialog.getWindow().setAttributes(layoutParams);
    }

    private static void setupInputDialog(MaterialDialog materialDialog) {
        MaterialDialog.e eVar = materialDialog.builder;
        EditText editText = (EditText) materialDialog.view.findViewById(R.id.input);
        materialDialog.input = editText;
        if (editText == null) {
            return;
        }
        materialDialog.setTypeface(editText, eVar.regularFont);
        CharSequence charSequence = eVar.inputPrefill;
        if (charSequence != null) {
            materialDialog.input.setText(charSequence);
        }
        materialDialog.setInternalInputCallback();
        materialDialog.input.setHint(eVar.inputHint);
        materialDialog.input.setSingleLine();
        materialDialog.input.setTextColor(eVar.contentColor);
        materialDialog.input.setHintTextColor(com.afollestad.materialdialogs.util.a.adjustAlpha(eVar.contentColor, 0.3f));
        com.afollestad.materialdialogs.internal.a.setTint(materialDialog.input, materialDialog.builder.widgetColor);
        int i8 = eVar.inputType;
        if (i8 != -1) {
            materialDialog.input.setInputType(i8);
            int i9 = eVar.inputType;
            if (i9 != 144 && (i9 & 128) == 128) {
                materialDialog.input.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
        TextView textView = (TextView) materialDialog.view.findViewById(R$id.md_minMax);
        materialDialog.inputMinMax = textView;
        if (eVar.inputMinLength > 0 || eVar.inputMaxLength > -1) {
            materialDialog.invalidateInputMinMaxIndicator(materialDialog.input.getText().toString().length(), !eVar.inputAllowEmpty);
        } else {
            textView.setVisibility(8);
            materialDialog.inputMinMax = null;
        }
    }

    private static void setupProgressDialog(MaterialDialog materialDialog) {
        MaterialDialog.e eVar = materialDialog.builder;
        if (eVar.indeterminateProgress || eVar.progress > -2) {
            ProgressBar progressBar = (ProgressBar) materialDialog.view.findViewById(R.id.progress);
            materialDialog.progressBar = progressBar;
            if (progressBar == null) {
                return;
            }
            if (!eVar.indeterminateProgress) {
                HorizontalProgressDrawable horizontalProgressDrawable = new HorizontalProgressDrawable(eVar.getContext());
                horizontalProgressDrawable.setTint(eVar.widgetColor);
                materialDialog.progressBar.setProgressDrawable(horizontalProgressDrawable);
                materialDialog.progressBar.setIndeterminateDrawable(horizontalProgressDrawable);
            } else if (eVar.indeterminateIsHorizontalProgress) {
                IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable(eVar.getContext());
                indeterminateHorizontalProgressDrawable.setTint(eVar.widgetColor);
                materialDialog.progressBar.setProgressDrawable(indeterminateHorizontalProgressDrawable);
                materialDialog.progressBar.setIndeterminateDrawable(indeterminateHorizontalProgressDrawable);
            } else {
                IndeterminateCircularProgressDrawable indeterminateCircularProgressDrawable = new IndeterminateCircularProgressDrawable(eVar.getContext());
                indeterminateCircularProgressDrawable.setTint(eVar.widgetColor);
                materialDialog.progressBar.setProgressDrawable(indeterminateCircularProgressDrawable);
                materialDialog.progressBar.setIndeterminateDrawable(indeterminateCircularProgressDrawable);
            }
            boolean z7 = eVar.indeterminateProgress;
            if (!z7 || eVar.indeterminateIsHorizontalProgress) {
                materialDialog.progressBar.setIndeterminate(z7 && eVar.indeterminateIsHorizontalProgress);
                materialDialog.progressBar.setProgress(0);
                materialDialog.progressBar.setMax(eVar.progressMax);
                TextView textView = (TextView) materialDialog.view.findViewById(R$id.md_label);
                materialDialog.progressLabel = textView;
                if (textView != null) {
                    textView.setTextColor(eVar.contentColor);
                    materialDialog.setTypeface(materialDialog.progressLabel, eVar.mediumFont);
                    materialDialog.progressLabel.setText(eVar.progressPercentFormat.format(0L));
                }
                TextView textView2 = (TextView) materialDialog.view.findViewById(R$id.md_minMax);
                materialDialog.progressMinMax = textView2;
                if (textView2 != null) {
                    textView2.setTextColor(eVar.contentColor);
                    materialDialog.setTypeface(materialDialog.progressMinMax, eVar.regularFont);
                    if (eVar.showMinMax) {
                        materialDialog.progressMinMax.setVisibility(0);
                        materialDialog.progressMinMax.setText(String.format(eVar.progressNumberFormat, 0, Integer.valueOf(eVar.progressMax)));
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) materialDialog.progressBar.getLayoutParams();
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = 0;
                    } else {
                        materialDialog.progressMinMax.setVisibility(8);
                    }
                } else {
                    eVar.showMinMax = false;
                }
            }
        }
        ProgressBar progressBar2 = materialDialog.progressBar;
        if (progressBar2 != null) {
            fixCanvasScalingWhenHardwareAccelerated(progressBar2);
        }
    }
}
