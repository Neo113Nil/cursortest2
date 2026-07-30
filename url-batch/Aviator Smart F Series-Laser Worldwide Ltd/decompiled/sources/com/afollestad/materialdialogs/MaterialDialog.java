package com.afollestad.materialdialogs;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.a;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import com.google.android.exoplayer2.C;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class MaterialDialog extends com.afollestad.materialdialogs.b implements View.OnClickListener, a.c {
    protected final e builder;
    CheckBox checkBoxPrompt;
    protected TextView content;
    FrameLayout customViewFrame;
    private final Handler handler;
    protected ImageView icon;
    EditText input;
    TextView inputMinMax;
    ListType listType;
    MDButton negativeButton;
    MDButton neutralButton;
    MDButton positiveButton;
    ProgressBar progressBar;
    TextView progressLabel;
    TextView progressMinMax;
    RecyclerView recyclerView;
    List<Integer> selectedIndicesList;
    protected TextView title;
    View titleFrame;

    private static class DialogException extends WindowManager.BadTokenException {
        DialogException(String str) {
            super(str);
        }
    }

    enum ListType {
        REGULAR,
        SINGLE,
        MULTI;

        public static int getLayoutForType(ListType listType) {
            int i8 = d.$SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType[listType.ordinal()];
            if (i8 == 1) {
                return R$layout.md_listitem;
            }
            if (i8 == 2) {
                return R$layout.md_listitem_singlechoice;
            }
            if (i8 == 3) {
                return R$layout.md_listitem_multichoice;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: com.afollestad.materialdialogs.MaterialDialog$a$a, reason: collision with other inner class name */
        class RunnableC0009a implements Runnable {
            final /* synthetic */ int val$fSelectedIndex;

            RunnableC0009a(int i8) {
                this.val$fSelectedIndex = i8;
            }

            @Override // java.lang.Runnable
            public void run() {
                MaterialDialog.this.recyclerView.requestFocus();
                MaterialDialog.this.builder.layoutManager.scrollToPosition(this.val$fSelectedIndex);
            }
        }

        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int intValue;
            MaterialDialog.this.recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MaterialDialog materialDialog = MaterialDialog.this;
            ListType listType = materialDialog.listType;
            ListType listType2 = ListType.SINGLE;
            if (listType == listType2 || listType == ListType.MULTI) {
                if (listType == listType2) {
                    intValue = materialDialog.builder.selectedIndex;
                    if (intValue < 0) {
                        return;
                    }
                } else {
                    List<Integer> list = materialDialog.selectedIndicesList;
                    if (list == null || list.size() == 0) {
                        return;
                    }
                    Collections.sort(MaterialDialog.this.selectedIndicesList);
                    intValue = MaterialDialog.this.selectedIndicesList.get(0).intValue();
                }
                MaterialDialog.this.recyclerView.post(new RunnableC0009a(intValue));
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialDialog materialDialog = MaterialDialog.this;
            TextView textView = materialDialog.progressLabel;
            if (textView != null) {
                textView.setText(materialDialog.builder.progressPercentFormat.format(materialDialog.getCurrentProgress() / MaterialDialog.this.getMaxProgress()));
            }
            MaterialDialog materialDialog2 = MaterialDialog.this;
            TextView textView2 = materialDialog2.progressMinMax;
            if (textView2 != null) {
                textView2.setText(String.format(materialDialog2.builder.progressNumberFormat, Integer.valueOf(materialDialog2.getCurrentProgress()), Integer.valueOf(MaterialDialog.this.getMaxProgress())));
            }
        }
    }

    class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            int length = charSequence.toString().length();
            MaterialDialog materialDialog = MaterialDialog.this;
            if (!materialDialog.builder.inputAllowEmpty) {
                r0 = length == 0;
                materialDialog.getActionButton(DialogAction.POSITIVE).setEnabled(!r0);
            }
            MaterialDialog.this.invalidateInputMinMaxIndicator(length, r0);
            MaterialDialog materialDialog2 = MaterialDialog.this;
            e eVar = materialDialog2.builder;
            if (eVar.alwaysCallInputCallback) {
                eVar.inputCallback.onInput(materialDialog2, charSequence);
            }
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] $SwitchMap$com$afollestad$materialdialogs$DialogAction;
        static final /* synthetic */ int[] $SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType;

        static {
            int[] iArr = new int[ListType.values().length];
            $SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType = iArr;
            try {
                iArr[ListType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType[ListType.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType[ListType.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DialogAction.values().length];
            $SwitchMap$com$afollestad$materialdialogs$DialogAction = iArr2;
            try {
                iArr2[DialogAction.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$afollestad$materialdialogs$DialogAction[DialogAction.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$afollestad$materialdialogs$DialogAction[DialogAction.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class e {
        protected RecyclerView.Adapter<?> adapter;
        protected boolean alwaysCallInputCallback;
        protected boolean alwaysCallMultiChoiceCallback;
        protected boolean alwaysCallSingleChoiceCallback;
        protected boolean autoDismiss;
        protected int backgroundColor;

        @DrawableRes
        protected int btnSelectorNegative;

        @DrawableRes
        protected int btnSelectorNeutral;

        @DrawableRes
        protected int btnSelectorPositive;

        @DrawableRes
        protected int btnSelectorStacked;
        protected GravityEnum btnStackedGravity;
        protected int buttonRippleColor;
        protected GravityEnum buttonsGravity;
        protected f callback;
        protected DialogInterface.OnCancelListener cancelListener;
        protected boolean cancelable;
        protected boolean canceledOnTouchOutside;
        protected CharSequence checkBoxPrompt;
        protected boolean checkBoxPromptInitiallyChecked;
        protected CompoundButton.OnCheckedChangeListener checkBoxPromptListener;
        protected ColorStateList choiceWidgetColor;
        protected CharSequence content;
        protected int contentColor;
        protected boolean contentColorSet;
        protected GravityEnum contentGravity;
        protected float contentLineSpacingMultiplier;
        protected final Context context;
        protected View customView;
        protected Integer[] disabledIndices;
        protected DialogInterface.OnDismissListener dismissListener;
        protected int dividerColor;
        protected boolean dividerColorSet;
        protected Drawable icon;
        protected boolean indeterminateIsHorizontalProgress;
        protected boolean indeterminateProgress;
        protected boolean inputAllowEmpty;
        protected g inputCallback;
        protected CharSequence inputHint;
        protected int inputMaxLength;
        protected int inputMinLength;
        protected CharSequence inputPrefill;
        protected int inputRangeErrorColor;
        protected int inputType;
        protected int itemColor;
        protected boolean itemColorSet;
        protected int[] itemIds;
        protected ArrayList<CharSequence> items;
        protected GravityEnum itemsGravity;
        protected DialogInterface.OnKeyListener keyListener;
        protected RecyclerView.LayoutManager layoutManager;
        protected boolean limitIconToDefaultSize;
        protected ColorStateList linkColor;
        protected h listCallback;
        protected i listCallbackMultiChoice;
        protected j listCallbackSingleChoice;
        protected k listLongCallback;

        @DrawableRes
        protected int listSelector;
        protected int maxIconSize;
        protected Typeface mediumFont;
        protected ColorStateList negativeColor;
        protected boolean negativeColorSet;
        protected boolean negativeFocus;
        protected CharSequence negativeText;
        protected ColorStateList neutralColor;
        protected boolean neutralColorSet;
        protected boolean neutralFocus;
        protected CharSequence neutralText;
        protected l onAnyCallback;
        protected l onNegativeCallback;
        protected l onNeutralCallback;
        protected l onPositiveCallback;
        protected ColorStateList positiveColor;
        protected boolean positiveColorSet;
        protected boolean positiveFocus;
        protected CharSequence positiveText;
        protected int progress;
        protected int progressMax;
        protected String progressNumberFormat;
        protected NumberFormat progressPercentFormat;
        protected Typeface regularFont;
        protected int selectedIndex;
        protected Integer[] selectedIndices;
        protected DialogInterface.OnShowListener showListener;
        protected boolean showMinMax;
        protected StackingBehavior stackingBehavior;
        protected Object tag;
        protected Theme theme;
        protected CharSequence title;
        protected int titleColor;
        protected boolean titleColorSet;
        protected GravityEnum titleGravity;
        protected int widgetColor;
        protected boolean widgetColorSet;
        protected boolean wrapCustomViewInScroll;

        public e(@NonNull Context context) {
            GravityEnum gravityEnum = GravityEnum.START;
            this.titleGravity = gravityEnum;
            this.contentGravity = gravityEnum;
            this.btnStackedGravity = GravityEnum.END;
            this.itemsGravity = gravityEnum;
            this.buttonsGravity = gravityEnum;
            this.buttonRippleColor = 0;
            this.titleColor = -1;
            this.contentColor = -1;
            this.alwaysCallMultiChoiceCallback = false;
            this.alwaysCallSingleChoiceCallback = false;
            Theme theme = Theme.LIGHT;
            this.theme = theme;
            this.cancelable = true;
            this.canceledOnTouchOutside = true;
            this.contentLineSpacingMultiplier = 1.2f;
            this.selectedIndex = -1;
            this.selectedIndices = null;
            this.disabledIndices = null;
            this.autoDismiss = true;
            this.maxIconSize = -1;
            this.progress = -2;
            this.progressMax = 0;
            this.inputType = -1;
            this.inputMinLength = -1;
            this.inputMaxLength = -1;
            this.inputRangeErrorColor = 0;
            this.titleColorSet = false;
            this.contentColorSet = false;
            this.itemColorSet = false;
            this.positiveColorSet = false;
            this.neutralColorSet = false;
            this.negativeColorSet = false;
            this.widgetColorSet = false;
            this.dividerColorSet = false;
            this.context = context;
            int resolveColor = com.afollestad.materialdialogs.util.a.resolveColor(context, R$attr.colorAccent, com.afollestad.materialdialogs.util.a.getColor(context, R$color.md_material_blue_600));
            this.widgetColor = resolveColor;
            int resolveColor2 = com.afollestad.materialdialogs.util.a.resolveColor(context, R.attr.colorAccent, resolveColor);
            this.widgetColor = resolveColor2;
            this.positiveColor = com.afollestad.materialdialogs.util.a.getActionTextStateList(context, resolveColor2);
            this.negativeColor = com.afollestad.materialdialogs.util.a.getActionTextStateList(context, this.widgetColor);
            this.neutralColor = com.afollestad.materialdialogs.util.a.getActionTextStateList(context, this.widgetColor);
            this.linkColor = com.afollestad.materialdialogs.util.a.getActionTextStateList(context, com.afollestad.materialdialogs.util.a.resolveColor(context, R$attr.md_link_color, this.widgetColor));
            this.buttonRippleColor = com.afollestad.materialdialogs.util.a.resolveColor(context, R$attr.md_btn_ripple_color, com.afollestad.materialdialogs.util.a.resolveColor(context, R$attr.colorControlHighlight, com.afollestad.materialdialogs.util.a.resolveColor(context, R.attr.colorControlHighlight)));
            this.progressPercentFormat = NumberFormat.getPercentInstance();
            this.progressNumberFormat = "%1d/%2d";
            this.theme = com.afollestad.materialdialogs.util.a.isColorDark(com.afollestad.materialdialogs.util.a.resolveColor(context, R.attr.textColorPrimary)) ? theme : Theme.DARK;
            checkSingleton();
            this.titleGravity = com.afollestad.materialdialogs.util.a.resolveGravityEnum(context, R$attr.md_title_gravity, this.titleGravity);
            this.contentGravity = com.afollestad.materialdialogs.util.a.resolveGravityEnum(context, R$attr.md_content_gravity, this.contentGravity);
            this.btnStackedGravity = com.afollestad.materialdialogs.util.a.resolveGravityEnum(context, R$attr.md_btnstacked_gravity, this.btnStackedGravity);
            this.itemsGravity = com.afollestad.materialdialogs.util.a.resolveGravityEnum(context, R$attr.md_items_gravity, this.itemsGravity);
            this.buttonsGravity = com.afollestad.materialdialogs.util.a.resolveGravityEnum(context, R$attr.md_buttons_gravity, this.buttonsGravity);
            try {
                typeface(com.afollestad.materialdialogs.util.a.resolveString(context, R$attr.md_medium_font), com.afollestad.materialdialogs.util.a.resolveString(context, R$attr.md_regular_font));
            } catch (Throwable unused) {
            }
            if (this.mediumFont == null) {
                try {
                    this.mediumFont = Typeface.create("sans-serif-medium", 0);
                } catch (Throwable unused2) {
                    this.mediumFont = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.regularFont == null) {
                try {
                    this.regularFont = Typeface.create(C.SANS_SERIF_NAME, 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.regularFont = typeface;
                    if (typeface == null) {
                        this.regularFont = Typeface.DEFAULT;
                    }
                }
            }
        }

        private void checkSingleton() {
            if (com.afollestad.materialdialogs.internal.b.get(false) == null) {
                return;
            }
            com.afollestad.materialdialogs.internal.b bVar = com.afollestad.materialdialogs.internal.b.get();
            if (bVar.darkTheme) {
                this.theme = Theme.DARK;
            }
            int i8 = bVar.titleColor;
            if (i8 != 0) {
                this.titleColor = i8;
            }
            int i9 = bVar.contentColor;
            if (i9 != 0) {
                this.contentColor = i9;
            }
            ColorStateList colorStateList = bVar.positiveColor;
            if (colorStateList != null) {
                this.positiveColor = colorStateList;
            }
            ColorStateList colorStateList2 = bVar.neutralColor;
            if (colorStateList2 != null) {
                this.neutralColor = colorStateList2;
            }
            ColorStateList colorStateList3 = bVar.negativeColor;
            if (colorStateList3 != null) {
                this.negativeColor = colorStateList3;
            }
            int i10 = bVar.itemColor;
            if (i10 != 0) {
                this.itemColor = i10;
            }
            Drawable drawable = bVar.icon;
            if (drawable != null) {
                this.icon = drawable;
            }
            int i11 = bVar.backgroundColor;
            if (i11 != 0) {
                this.backgroundColor = i11;
            }
            int i12 = bVar.dividerColor;
            if (i12 != 0) {
                this.dividerColor = i12;
            }
            int i13 = bVar.btnSelectorStacked;
            if (i13 != 0) {
                this.btnSelectorStacked = i13;
            }
            int i14 = bVar.listSelector;
            if (i14 != 0) {
                this.listSelector = i14;
            }
            int i15 = bVar.btnSelectorPositive;
            if (i15 != 0) {
                this.btnSelectorPositive = i15;
            }
            int i16 = bVar.btnSelectorNeutral;
            if (i16 != 0) {
                this.btnSelectorNeutral = i16;
            }
            int i17 = bVar.btnSelectorNegative;
            if (i17 != 0) {
                this.btnSelectorNegative = i17;
            }
            int i18 = bVar.widgetColor;
            if (i18 != 0) {
                this.widgetColor = i18;
            }
            ColorStateList colorStateList4 = bVar.linkColor;
            if (colorStateList4 != null) {
                this.linkColor = colorStateList4;
            }
            this.titleGravity = bVar.titleGravity;
            this.contentGravity = bVar.contentGravity;
            this.btnStackedGravity = bVar.btnStackedGravity;
            this.itemsGravity = bVar.itemsGravity;
            this.buttonsGravity = bVar.buttonsGravity;
        }

        public e adapter(@NonNull RecyclerView.Adapter<?> adapter, @Nullable RecyclerView.LayoutManager layoutManager) {
            if (this.customView != null) {
                throw new IllegalStateException("You cannot set adapter() when you're using a custom view.");
            }
            if (layoutManager != null && !(layoutManager instanceof LinearLayoutManager) && !(layoutManager instanceof GridLayoutManager)) {
                throw new IllegalStateException("You can currently only use LinearLayoutManager and GridLayoutManager with this library.");
            }
            this.adapter = adapter;
            this.layoutManager = layoutManager;
            return this;
        }

        public e alwaysCallInputCallback() {
            this.alwaysCallInputCallback = true;
            return this;
        }

        public e alwaysCallMultiChoiceCallback() {
            this.alwaysCallMultiChoiceCallback = true;
            return this;
        }

        public e alwaysCallSingleChoiceCallback() {
            this.alwaysCallSingleChoiceCallback = true;
            return this;
        }

        public e autoDismiss(boolean z7) {
            this.autoDismiss = z7;
            return this;
        }

        public e backgroundColor(@ColorInt int i8) {
            this.backgroundColor = i8;
            return this;
        }

        public e backgroundColorAttr(@AttrRes int i8) {
            return backgroundColor(com.afollestad.materialdialogs.util.a.resolveColor(this.context, i8));
        }

        public e backgroundColorRes(@ColorRes int i8) {
            return backgroundColor(com.afollestad.materialdialogs.util.a.getColor(this.context, i8));
        }

        public e btnSelector(@DrawableRes int i8) {
            this.btnSelectorPositive = i8;
            this.btnSelectorNeutral = i8;
            this.btnSelectorNegative = i8;
            return this;
        }

        public e btnSelectorStacked(@DrawableRes int i8) {
            this.btnSelectorStacked = i8;
            return this;
        }

        public e btnStackedGravity(@NonNull GravityEnum gravityEnum) {
            this.btnStackedGravity = gravityEnum;
            return this;
        }

        @UiThread
        public MaterialDialog build() {
            return new MaterialDialog(this);
        }

        public e buttonRippleColor(@ColorInt int i8) {
            this.buttonRippleColor = i8;
            return this;
        }

        public e buttonRippleColorAttr(@AttrRes int i8) {
            return buttonRippleColor(com.afollestad.materialdialogs.util.a.resolveColor(this.context, i8));
        }

        public e buttonRippleColorRes(@ColorRes int i8) {
            return buttonRippleColor(com.afollestad.materialdialogs.util.a.getColor(this.context, i8));
        }

        public e buttonsGravity(@NonNull GravityEnum gravityEnum) {
            this.buttonsGravity = gravityEnum;
            return this;
        }

        public e callback(@NonNull f fVar) {
            this.callback = fVar;
            return this;
        }

        public e cancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
            this.cancelListener = onCancelListener;
            return this;
        }

        public e cancelable(boolean z7) {
            this.cancelable = z7;
            this.canceledOnTouchOutside = z7;
            return this;
        }

        public e canceledOnTouchOutside(boolean z7) {
            this.canceledOnTouchOutside = z7;
            return this;
        }

        public e checkBoxPrompt(@NonNull CharSequence charSequence, boolean z7, @Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.checkBoxPrompt = charSequence;
            this.checkBoxPromptInitiallyChecked = z7;
            this.checkBoxPromptListener = onCheckedChangeListener;
            return this;
        }

        public e checkBoxPromptRes(@StringRes int i8, boolean z7, @Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            return checkBoxPrompt(this.context.getResources().getText(i8), z7, onCheckedChangeListener);
        }

        public e choiceWidgetColor(@Nullable ColorStateList colorStateList) {
            this.choiceWidgetColor = colorStateList;
            return this;
        }

        public e content(@StringRes int i8) {
            return content(i8, false);
        }

        public e contentColor(@ColorInt int i8) {
            this.contentColor = i8;
            this.contentColorSet = true;
            return this;
        }

        public e contentColorAttr(@AttrRes int i8) {
            contentColor(com.afollestad.materialdialogs.util.a.resolveColor(this.context, i8));
            return this;
        }

        public e contentColorRes(@ColorRes int i8) {
            contentColor(com.afollestad.materialdialogs.util.a.getColor(this.context, i8));
            return this;
        }

        public e contentGravity(@NonNull GravityEnum gravityEnum) {
            this.contentGravity = gravityEnum;
            return this;
        }

        public e contentLineSpacing(float f8) {
            this.contentLineSpacingMultiplier = f8;
            return this;
        }

        public e customView(@LayoutRes int i8, boolean z7) {
            return customView(LayoutInflater.from(this.context).inflate(i8, (ViewGroup) null), z7);
        }

        public e dismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
            this.dismissListener = onDismissListener;
            return this;
        }

        public e dividerColor(@ColorInt int i8) {
            this.dividerColor = i8;
            this.dividerColorSet = true;
            return this;
        }

        public e dividerColorAttr(@AttrRes int i8) {
            return dividerColor(com.afollestad.materialdialogs.util.a.resolveColor(this.context, i8));
        }

        public e dividerColorRes(@ColorRes int i8) {
            return dividerColor(com.afollestad.materialdialogs.util.a.getColor(this.context, i8));
        }

        public final Context getContext() {
            return this.context;
        }

        public final int getItemColor() {
            return this.itemColor;
        }

        public final Typeface getRegularFont() {
            return this.regularFont;
        }

        public e icon(@NonNull Drawable drawable) {
            this.icon = drawable;
            return this;
        }

        public e iconAttr(@AttrRes int i8) {
            this.icon = com.afollestad.materialdialogs.util.a.resolveDrawable(this.context, i8);
            return this;
        }

        public e iconRes(@DrawableRes int i8) {
            this.icon = ResourcesCompat.getDrawable(this.context.getResources(), i8, null);
            return this;
        }

        public e input(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, boolean z7, @NonNull g gVar) {
            if (this.customView != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.inputCallback = gVar;
            this.inputHint = charSequence;
            this.inputPrefill = charSequence2;
            this.inputAllowEmpty = z7;
            return this;
        }

        public e inputRange(@IntRange(from = 0, to = 2147483647L) int i8, @IntRange(from = -1, to = 2147483647L) int i9) {
            return inputRange(i8, i9, 0);
        }

        public e inputRangeRes(@IntRange(from = 0, to = 2147483647L) int i8, @IntRange(from = -1, to = 2147483647L) int i9, @ColorRes int i10) {
            return inputRange(i8, i9, com.afollestad.materialdialogs.util.a.getColor(this.context, i10));
        }

        public e inputType(int i8) {
            this.inputType = i8;
            return this;
        }

        public e items(@NonNull Collection collection) {
            if (collection.size() > 0) {
                CharSequence[] charSequenceArr = new CharSequence[collection.size()];
                Iterator it = collection.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    charSequenceArr[i8] = it.next().toString();
                    i8++;
                }
                items(charSequenceArr);
            } else if (collection.size() == 0) {
                this.items = new ArrayList<>();
            }
            return this;
        }

        public e itemsCallback(@NonNull h hVar) {
            this.listCallbackSingleChoice = null;
            return this;
        }

        public e itemsCallbackMultiChoice(@Nullable Integer[] numArr, @NonNull i iVar) {
            this.selectedIndices = numArr;
            this.listCallbackSingleChoice = null;
            return this;
        }

        public e itemsCallbackSingleChoice(int i8, @NonNull j jVar) {
            this.selectedIndex = i8;
            this.listCallbackSingleChoice = jVar;
            return this;
        }

        public e itemsColor(@ColorInt int i8) {
            this.itemColor = i8;
            this.itemColorSet = true;
            return this;
        }

        public e itemsColorAttr(@AttrRes int i8) {
            return itemsColor(com.afollestad.materialdialogs.util.a.resolveColor(this.context, i8));
        }

        public e itemsColorRes(@ColorRes int i8) {
            return itemsColor(com.afollestad.materialdialogs.util.a.getColor(this.context, i8));
        }

        public e itemsDisabledIndices(@Nullable Integer... numArr) {
            this.disabledIndices = numArr;
            return this;
        }

        public e itemsGravity(@NonNull GravityEnum gravityEnum) {
            this.itemsGravity = gravityEnum;
            return this;
        }

        public e itemsIds(@NonNull int[] iArr) {
            this.itemIds = iArr;
            return this;
        }

        public e itemsLongCallback(@NonNull k kVar) {
            this.listCallbackSingleChoice = null;
            return this;
        }

        public e keyListener(@NonNull DialogInterface.OnKeyListener onKeyListener) {
            this.keyListener = onKeyListener;
            return this;
        }

        public e limitIconToDefaultSize() {
            this.limitIconToDefaultSize = true;
            return this;
        }

        public e linkColor(@NonNull ColorStateList colorStateList) {
            this.linkColor = colorStateList;
            return this;
        }

        public e linkColorAttr(@AttrRes int i8) {
            return linkColor(com.afollestad.materialdialogs.util.a.resolveActionTextColorStateList(this.context, i8, null));
        }

        public e linkColorRes(@ColorRes int i8) {
            return linkColor(com.afollestad.materialdialogs.util.a.getActionTextColorStateList(this.context, i8));
        }

        public e listSelector(@DrawableRes int i8) {
            this.listSelector = i8;
            return this;
        }

        public e maxIconSize(int i8) {
            this.maxIconSize = i8;
            return this;
        }

        public e maxIconSizeRes(@DimenRes int i8) {
            return maxIconSize((int) this.context.getResources().getDimension(i8));
        }

        public e negativeColor(@NonNull ColorStateList colorStateList) {
            this.negativeColor = colorStateList;
            this.negativeColorSet = true;
            return this;
        }

        public e negativeColorAttr(@AttrRes int i8) {
            return negativeColor(com.afollestad.materialdialogs.util.a.resolveActionTextColorStateList(this.context, i8, null));
        }

        public e negativeColorRes(@ColorRes int i8) {
            return negativeColor(com.afollestad.materialdialogs.util.a.getActionTextColorStateList(this.context, i8));
        }

        public e negativeFocus(boolean z7) {
            this.negativeFocus = z7;
            return this;
        }

        public e negativeText(@NonNull CharSequence charSequence) {
            this.negativeText = charSequence;
            return this;
        }

        public e neutralColor(@NonNull ColorStateList colorStateList) {
            this.neutralColor = colorStateList;
            this.neutralColorSet = true;
            return this;
        }

        public e neutralColorAttr(@AttrRes int i8) {
            return neutralColor(com.afollestad.materialdialogs.util.a.resolveActionTextColorStateList(this.context, i8, null));
        }

        public e neutralColorRes(@ColorRes int i8) {
            return neutralColor(com.afollestad.materialdialogs.util.a.getActionTextColorStateList(this.context, i8));
        }

        public e neutralFocus(boolean z7) {
            this.neutralFocus = z7;
            return this;
        }

        public e neutralText(@NonNull CharSequence charSequence) {
            this.neutralText = charSequence;
            return this;
        }

        public e onAny(@NonNull l lVar) {
            this.onAnyCallback = lVar;
            return this;
        }

        public e onNegative(@NonNull l lVar) {
            this.onNegativeCallback = lVar;
            return this;
        }

        public e onNeutral(@NonNull l lVar) {
            this.onNeutralCallback = lVar;
            return this;
        }

        public e onPositive(@NonNull l lVar) {
            this.onPositiveCallback = lVar;
            return this;
        }

        public e positiveColor(@NonNull ColorStateList colorStateList) {
            this.positiveColor = colorStateList;
            this.positiveColorSet = true;
            return this;
        }

        public e positiveColorAttr(@AttrRes int i8) {
            return positiveColor(com.afollestad.materialdialogs.util.a.resolveActionTextColorStateList(this.context, i8, null));
        }

        public e positiveColorRes(@ColorRes int i8) {
            return positiveColor(com.afollestad.materialdialogs.util.a.getActionTextColorStateList(this.context, i8));
        }

        public e positiveFocus(boolean z7) {
            this.positiveFocus = z7;
            return this;
        }

        public e positiveText(@NonNull CharSequence charSequence) {
            this.positiveText = charSequence;
            return this;
        }

        public e progress(boolean z7, int i8) {
            if (this.customView != null) {
                throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
            }
            if (z7) {
                this.indeterminateProgress = true;
                this.progress = -2;
            } else {
                this.indeterminateIsHorizontalProgress = false;
                this.indeterminateProgress = false;
                this.progress = -1;
                this.progressMax = i8;
            }
            return this;
        }

        public e progressIndeterminateStyle(boolean z7) {
            this.indeterminateIsHorizontalProgress = z7;
            return this;
        }

        public e progressNumberFormat(@NonNull String str) {
            this.progressNumberFormat = str;
            return this;
        }

        public e progressPercentFormat(@NonNull NumberFormat numberFormat) {
            this.progressPercentFormat = numberFormat;
            return this;
        }

        @UiThread
        public MaterialDialog show() {
            MaterialDialog build = build();
            build.show();
            return build;
        }

        public e showListener(@NonNull DialogInterface.OnShowListener onShowListener) {
            this.showListener = onShowListener;
            return this;
        }

        public e stackingBehavior(@NonNull StackingBehavior stackingBehavior) {
            this.stackingBehavior = stackingBehavior;
            return this;
        }

        public e tag(@Nullable Object obj) {
            this.tag = obj;
            return this;
        }

        public e theme(@NonNull Theme theme) {
            this.theme = theme;
            return this;
        }

        public e title(@NonNull CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }

        public e titleColor(@ColorInt int i8) {
            this.titleColor = i8;
            this.titleColorSet = true;
            return this;
        }

        public e titleColorAttr(@AttrRes int i8) {
            return titleColor(com.afollestad.materialdialogs.util.a.resolveColor(this.context, i8));
        }

        public e titleColorRes(@ColorRes int i8) {
            return titleColor(com.afollestad.materialdialogs.util.a.getColor(this.context, i8));
        }

        public e titleGravity(@NonNull GravityEnum gravityEnum) {
            this.titleGravity = gravityEnum;
            return this;
        }

        public e typeface(@Nullable Typeface typeface, @Nullable Typeface typeface2) {
            this.mediumFont = typeface;
            this.regularFont = typeface2;
            return this;
        }

        public e widgetColor(@ColorInt int i8) {
            this.widgetColor = i8;
            this.widgetColorSet = true;
            return this;
        }

        public e widgetColorAttr(@AttrRes int i8) {
            return widgetColor(com.afollestad.materialdialogs.util.a.resolveColor(this.context, i8));
        }

        public e widgetColorRes(@ColorRes int i8) {
            return widgetColor(com.afollestad.materialdialogs.util.a.getColor(this.context, i8));
        }

        public e btnSelector(@DrawableRes int i8, @NonNull DialogAction dialogAction) {
            int i9 = d.$SwitchMap$com$afollestad$materialdialogs$DialogAction[dialogAction.ordinal()];
            if (i9 == 1) {
                this.btnSelectorNeutral = i8;
            } else if (i9 != 2) {
                this.btnSelectorPositive = i8;
            } else {
                this.btnSelectorNegative = i8;
            }
            return this;
        }

        public e content(@StringRes int i8, boolean z7) {
            CharSequence text = this.context.getText(i8);
            if (z7) {
                text = Html.fromHtml(text.toString().replace("\n", "<br/>"));
            }
            return content(text);
        }

        public e input(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @NonNull g gVar) {
            return input(charSequence, charSequence2, true, gVar);
        }

        public e inputRange(@IntRange(from = 0, to = 2147483647L) int i8, @IntRange(from = -1, to = 2147483647L) int i9, @ColorInt int i10) {
            if (i8 < 0) {
                throw new IllegalArgumentException("Min length for input dialogs cannot be less than 0.");
            }
            this.inputMinLength = i8;
            this.inputMaxLength = i9;
            if (i10 == 0) {
                this.inputRangeErrorColor = com.afollestad.materialdialogs.util.a.getColor(this.context, R$color.md_edittext_error);
            } else {
                this.inputRangeErrorColor = i10;
            }
            if (this.inputMinLength > 0) {
                this.inputAllowEmpty = false;
            }
            return this;
        }

        public e itemsIds(@ArrayRes int i8) {
            return itemsIds(this.context.getResources().getIntArray(i8));
        }

        public e linkColor(@ColorInt int i8) {
            return linkColor(com.afollestad.materialdialogs.util.a.getActionTextStateList(this.context, i8));
        }

        public e negativeColor(@ColorInt int i8) {
            return negativeColor(com.afollestad.materialdialogs.util.a.getActionTextStateList(this.context, i8));
        }

        public e negativeText(@StringRes int i8) {
            return i8 == 0 ? this : negativeText(this.context.getText(i8));
        }

        public e neutralColor(@ColorInt int i8) {
            return neutralColor(com.afollestad.materialdialogs.util.a.getActionTextStateList(this.context, i8));
        }

        public e neutralText(@StringRes int i8) {
            return i8 == 0 ? this : neutralText(this.context.getText(i8));
        }

        public e positiveColor(@ColorInt int i8) {
            return positiveColor(com.afollestad.materialdialogs.util.a.getActionTextStateList(this.context, i8));
        }

        public e positiveText(@StringRes int i8) {
            if (i8 == 0) {
                return this;
            }
            positiveText(this.context.getText(i8));
            return this;
        }

        public e progress(boolean z7, int i8, boolean z8) {
            this.showMinMax = z8;
            return progress(z7, i8);
        }

        public e title(@StringRes int i8) {
            title(this.context.getText(i8));
            return this;
        }

        public e typeface(@Nullable String str, @Nullable String str2) {
            if (str != null && !str.trim().isEmpty()) {
                Typeface typeface = com.afollestad.materialdialogs.util.c.get(this.context, str);
                this.mediumFont = typeface;
                if (typeface == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str + "\"");
                }
            }
            if (str2 != null && !str2.trim().isEmpty()) {
                Typeface typeface2 = com.afollestad.materialdialogs.util.c.get(this.context, str2);
                this.regularFont = typeface2;
                if (typeface2 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str2 + "\"");
                }
            }
            return this;
        }

        public e customView(@NonNull View view, boolean z7) {
            if (this.content != null) {
                throw new IllegalStateException("You cannot use customView() when you have content set.");
            }
            if (this.items != null) {
                throw new IllegalStateException("You cannot use customView() when you have items set.");
            }
            if (this.inputCallback != null) {
                throw new IllegalStateException("You cannot use customView() with an input dialog");
            }
            if (this.progress <= -2 && !this.indeterminateProgress) {
                if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                this.customView = view;
                this.wrapCustomViewInScroll = z7;
                return this;
            }
            throw new IllegalStateException("You cannot use customView() with a progress dialog");
        }

        public e input(@StringRes int i8, @StringRes int i9, boolean z7, @NonNull g gVar) {
            return input(i8 == 0 ? null : this.context.getText(i8), i9 != 0 ? this.context.getText(i9) : null, z7, gVar);
        }

        public e content(@NonNull CharSequence charSequence) {
            if (this.customView != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.content = charSequence;
            return this;
        }

        public e content(@StringRes int i8, Object... objArr) {
            return content(Html.fromHtml(String.format(this.context.getString(i8), objArr).replace("\n", "<br/>")));
        }

        public e input(@StringRes int i8, @StringRes int i9, @NonNull g gVar) {
            return input(i8, i9, true, gVar);
        }

        public e items(@ArrayRes int i8) {
            items(this.context.getResources().getTextArray(i8));
            return this;
        }

        public e items(@NonNull CharSequence... charSequenceArr) {
            if (this.customView == null) {
                ArrayList<CharSequence> arrayList = new ArrayList<>();
                this.items = arrayList;
                Collections.addAll(arrayList, charSequenceArr);
                return this;
            }
            throw new IllegalStateException("You cannot set items() when you're using a custom view.");
        }
    }

    public static abstract class f {
        protected final Object clone() {
            return super.clone();
        }

        public final boolean equals(Object obj) {
            return super.equals(obj);
        }

        protected final void finalize() {
            super.finalize();
        }

        public final int hashCode() {
            return super.hashCode();
        }

        @Deprecated
        public void onAny(MaterialDialog materialDialog) {
        }

        @Deprecated
        public void onNegative(MaterialDialog materialDialog) {
        }

        @Deprecated
        public void onNeutral(MaterialDialog materialDialog) {
        }

        @Deprecated
        public void onPositive(MaterialDialog materialDialog) {
        }

        public final String toString() {
            return super.toString();
        }
    }

    public interface g {
        void onInput(@NonNull MaterialDialog materialDialog, CharSequence charSequence);
    }

    public interface h {
    }

    public interface i {
    }

    public interface j {
        boolean onSelection(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence);
    }

    public interface k {
    }

    public interface l {
        void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction);
    }

    @SuppressLint({"InflateParams"})
    protected MaterialDialog(e eVar) {
        super(eVar.context, com.afollestad.materialdialogs.c.getTheme(eVar));
        this.handler = new Handler();
        this.builder = eVar;
        this.view = (MDRootLayout) LayoutInflater.from(eVar.context).inflate(com.afollestad.materialdialogs.c.getInflateLayout(eVar), (ViewGroup) null);
        com.afollestad.materialdialogs.c.init(this);
    }

    private boolean sendMultiChoiceCallback() {
        this.builder.getClass();
        return false;
    }

    private boolean sendSingleChoiceCallback(View view) {
        CharSequence charSequence;
        e eVar = this.builder;
        if (eVar.listCallbackSingleChoice == null) {
            return false;
        }
        int i8 = eVar.selectedIndex;
        if (i8 < 0 || i8 >= eVar.items.size()) {
            charSequence = null;
        } else {
            e eVar2 = this.builder;
            charSequence = eVar2.items.get(eVar2.selectedIndex);
        }
        e eVar3 = this.builder;
        return eVar3.listCallbackSingleChoice.onSelection(this, view, eVar3.selectedIndex, charSequence);
    }

    final void checkIfListInitScroll() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    public void clearSelectedIndices() {
        clearSelectedIndices(true);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.input != null) {
            com.afollestad.materialdialogs.util.a.hideKeyboard(this, this.builder);
        }
        super.dismiss();
    }

    @Override // com.afollestad.materialdialogs.b, android.app.Dialog
    public /* bridge */ /* synthetic */ View findViewById(int i8) {
        return super.findViewById(i8);
    }

    public final MDButton getActionButton(@NonNull DialogAction dialogAction) {
        int i8 = d.$SwitchMap$com$afollestad$materialdialogs$DialogAction[dialogAction.ordinal()];
        return i8 != 1 ? i8 != 2 ? this.positiveButton : this.negativeButton : this.neutralButton;
    }

    public final e getBuilder() {
        return this.builder;
    }

    Drawable getButtonSelector(DialogAction dialogAction, boolean z7) {
        if (z7) {
            e eVar = this.builder;
            if (eVar.btnSelectorStacked != 0) {
                return ResourcesCompat.getDrawable(eVar.context.getResources(), this.builder.btnSelectorStacked, null);
            }
            Context context = eVar.context;
            int i8 = R$attr.md_btn_stacked_selector;
            Drawable resolveDrawable = com.afollestad.materialdialogs.util.a.resolveDrawable(context, i8);
            return resolveDrawable != null ? resolveDrawable : com.afollestad.materialdialogs.util.a.resolveDrawable(getContext(), i8);
        }
        int i9 = d.$SwitchMap$com$afollestad$materialdialogs$DialogAction[dialogAction.ordinal()];
        if (i9 == 1) {
            e eVar2 = this.builder;
            if (eVar2.btnSelectorNeutral != 0) {
                return ResourcesCompat.getDrawable(eVar2.context.getResources(), this.builder.btnSelectorNeutral, null);
            }
            Context context2 = eVar2.context;
            int i10 = R$attr.md_btn_neutral_selector;
            Drawable resolveDrawable2 = com.afollestad.materialdialogs.util.a.resolveDrawable(context2, i10);
            if (resolveDrawable2 != null) {
                return resolveDrawable2;
            }
            Drawable resolveDrawable3 = com.afollestad.materialdialogs.util.a.resolveDrawable(getContext(), i10);
            com.afollestad.materialdialogs.util.b.applyColor(resolveDrawable3, this.builder.buttonRippleColor);
            return resolveDrawable3;
        }
        if (i9 != 2) {
            e eVar3 = this.builder;
            if (eVar3.btnSelectorPositive != 0) {
                return ResourcesCompat.getDrawable(eVar3.context.getResources(), this.builder.btnSelectorPositive, null);
            }
            Context context3 = eVar3.context;
            int i11 = R$attr.md_btn_positive_selector;
            Drawable resolveDrawable4 = com.afollestad.materialdialogs.util.a.resolveDrawable(context3, i11);
            if (resolveDrawable4 != null) {
                return resolveDrawable4;
            }
            Drawable resolveDrawable5 = com.afollestad.materialdialogs.util.a.resolveDrawable(getContext(), i11);
            com.afollestad.materialdialogs.util.b.applyColor(resolveDrawable5, this.builder.buttonRippleColor);
            return resolveDrawable5;
        }
        e eVar4 = this.builder;
        if (eVar4.btnSelectorNegative != 0) {
            return ResourcesCompat.getDrawable(eVar4.context.getResources(), this.builder.btnSelectorNegative, null);
        }
        Context context4 = eVar4.context;
        int i12 = R$attr.md_btn_negative_selector;
        Drawable resolveDrawable6 = com.afollestad.materialdialogs.util.a.resolveDrawable(context4, i12);
        if (resolveDrawable6 != null) {
            return resolveDrawable6;
        }
        Drawable resolveDrawable7 = com.afollestad.materialdialogs.util.a.resolveDrawable(getContext(), i12);
        com.afollestad.materialdialogs.util.b.applyColor(resolveDrawable7, this.builder.buttonRippleColor);
        return resolveDrawable7;
    }

    @Nullable
    public final TextView getContentView() {
        return this.content;
    }

    public final int getCurrentProgress() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getProgress();
    }

    @Nullable
    public final View getCustomView() {
        return this.builder.customView;
    }

    public ImageView getIconView() {
        return this.icon;
    }

    @Nullable
    public final EditText getInputEditText() {
        return this.input;
    }

    @Nullable
    public final ArrayList<CharSequence> getItems() {
        return this.builder.items;
    }

    final Drawable getListSelector() {
        e eVar = this.builder;
        if (eVar.listSelector != 0) {
            return ResourcesCompat.getDrawable(eVar.context.getResources(), this.builder.listSelector, null);
        }
        Context context = eVar.context;
        int i8 = R$attr.md_list_selector;
        Drawable resolveDrawable = com.afollestad.materialdialogs.util.a.resolveDrawable(context, i8);
        return resolveDrawable != null ? resolveDrawable : com.afollestad.materialdialogs.util.a.resolveDrawable(getContext(), i8);
    }

    public final int getMaxProgress() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getMax();
    }

    public ProgressBar getProgressBar() {
        return this.progressBar;
    }

    public RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public int getSelectedIndex() {
        e eVar = this.builder;
        if (eVar.listCallbackSingleChoice != null) {
            return eVar.selectedIndex;
        }
        return -1;
    }

    @Nullable
    public Integer[] getSelectedIndices() {
        this.builder.getClass();
        return null;
    }

    @Nullable
    public Object getTag() {
        return this.builder.tag;
    }

    public final TextView getTitleView() {
        return this.title;
    }

    public final View getView() {
        return this.view;
    }

    public final boolean hasActionButtons() {
        return numberOfActionButtons() > 0;
    }

    public final void incrementProgress(int i8) {
        setProgress(getCurrentProgress() + i8);
    }

    void invalidateInputMinMaxIndicator(int i8, boolean z7) {
        e eVar;
        int i9;
        TextView textView = this.inputMinMax;
        if (textView != null) {
            if (this.builder.inputMaxLength > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(i8), Integer.valueOf(this.builder.inputMaxLength)));
                this.inputMinMax.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            boolean z8 = (z7 && i8 == 0) || ((i9 = (eVar = this.builder).inputMaxLength) > 0 && i8 > i9) || i8 < eVar.inputMinLength;
            e eVar2 = this.builder;
            int i10 = z8 ? eVar2.inputRangeErrorColor : eVar2.contentColor;
            e eVar3 = this.builder;
            int i11 = z8 ? eVar3.inputRangeErrorColor : eVar3.widgetColor;
            if (this.builder.inputMaxLength > 0) {
                this.inputMinMax.setTextColor(i10);
            }
            com.afollestad.materialdialogs.internal.a.setTint(this.input, i11);
            getActionButton(DialogAction.POSITIVE).setEnabled(!z8);
        }
    }

    final void invalidateList() {
        if (this.recyclerView == null) {
            return;
        }
        ArrayList<CharSequence> arrayList = this.builder.items;
        if ((arrayList == null || arrayList.size() == 0) && this.builder.adapter == null) {
            return;
        }
        e eVar = this.builder;
        if (eVar.layoutManager == null) {
            eVar.layoutManager = new LinearLayoutManager(getContext());
        }
        if (this.recyclerView.getLayoutManager() == null) {
            this.recyclerView.setLayoutManager(this.builder.layoutManager);
        }
        this.recyclerView.setAdapter(this.builder.adapter);
        if (this.listType != null) {
            ((com.afollestad.materialdialogs.a) this.builder.adapter).setCallback(this);
        }
    }

    public final boolean isCancelled() {
        return !isShowing();
    }

    public final boolean isIndeterminateProgress() {
        return this.builder.indeterminateProgress;
    }

    public boolean isPromptCheckBoxChecked() {
        CheckBox checkBox = this.checkBoxPrompt;
        return checkBox != null && checkBox.isChecked();
    }

    @UiThread
    public final void notifyItemChanged(@IntRange(from = 0, to = 2147483647L) int i8) {
        this.builder.adapter.notifyItemChanged(i8);
    }

    @UiThread
    public final void notifyItemInserted(@IntRange(from = 0, to = 2147483647L) int i8) {
        this.builder.adapter.notifyItemInserted(i8);
    }

    @UiThread
    public final void notifyItemsChanged() {
        this.builder.adapter.notifyDataSetChanged();
    }

    public final int numberOfActionButtons() {
        int i8 = this.positiveButton.getVisibility() == 0 ? 1 : 0;
        if (this.neutralButton.getVisibility() == 0) {
            i8++;
        }
        return this.negativeButton.getVisibility() == 0 ? i8 + 1 : i8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText;
        DialogAction dialogAction = (DialogAction) view.getTag();
        int i8 = d.$SwitchMap$com$afollestad$materialdialogs$DialogAction[dialogAction.ordinal()];
        if (i8 == 1) {
            f fVar = this.builder.callback;
            if (fVar != null) {
                fVar.onAny(this);
                this.builder.callback.onNeutral(this);
            }
            l lVar = this.builder.onNeutralCallback;
            if (lVar != null) {
                lVar.onClick(this, dialogAction);
            }
            if (this.builder.autoDismiss) {
                dismiss();
            }
        } else if (i8 == 2) {
            f fVar2 = this.builder.callback;
            if (fVar2 != null) {
                fVar2.onAny(this);
                this.builder.callback.onNegative(this);
            }
            l lVar2 = this.builder.onNegativeCallback;
            if (lVar2 != null) {
                lVar2.onClick(this, dialogAction);
            }
            if (this.builder.autoDismiss) {
                cancel();
            }
        } else if (i8 == 3) {
            f fVar3 = this.builder.callback;
            if (fVar3 != null) {
                fVar3.onAny(this);
                this.builder.callback.onPositive(this);
            }
            l lVar3 = this.builder.onPositiveCallback;
            if (lVar3 != null) {
                lVar3.onClick(this, dialogAction);
            }
            if (!this.builder.alwaysCallSingleChoiceCallback) {
                sendSingleChoiceCallback(view);
            }
            if (!this.builder.alwaysCallMultiChoiceCallback) {
                sendMultiChoiceCallback();
            }
            e eVar = this.builder;
            g gVar = eVar.inputCallback;
            if (gVar != null && (editText = this.input) != null && !eVar.alwaysCallInputCallback) {
                gVar.onInput(this, editText.getText());
            }
            if (this.builder.autoDismiss) {
                dismiss();
            }
        }
        l lVar4 = this.builder.onAnyCallback;
        if (lVar4 != null) {
            lVar4.onClick(this, dialogAction);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (r4 != false) goto L45;
     */
    @Override // com.afollestad.materialdialogs.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onItemSelected(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence, boolean z7) {
        if (!view.isEnabled()) {
            return false;
        }
        ListType listType = this.listType;
        if (listType == null || listType == ListType.REGULAR) {
            if (this.builder.autoDismiss) {
                dismiss();
            }
            if (!z7) {
                this.builder.getClass();
            }
            if (z7) {
                this.builder.getClass();
            }
        } else if (listType == ListType.MULTI) {
            CheckBox checkBox = (CheckBox) view.findViewById(R$id.md_control);
            if (!checkBox.isEnabled()) {
                return false;
            }
            if (!this.selectedIndicesList.contains(Integer.valueOf(i8))) {
                this.selectedIndicesList.add(Integer.valueOf(i8));
                if (!this.builder.alwaysCallMultiChoiceCallback) {
                    checkBox.setChecked(true);
                } else if (sendMultiChoiceCallback()) {
                    checkBox.setChecked(true);
                } else {
                    this.selectedIndicesList.remove(Integer.valueOf(i8));
                }
            } else {
                this.selectedIndicesList.remove(Integer.valueOf(i8));
                if (!this.builder.alwaysCallMultiChoiceCallback) {
                    checkBox.setChecked(false);
                } else if (sendMultiChoiceCallback()) {
                    checkBox.setChecked(false);
                } else {
                    this.selectedIndicesList.add(Integer.valueOf(i8));
                }
            }
        } else if (listType == ListType.SINGLE) {
            RadioButton radioButton = (RadioButton) view.findViewById(R$id.md_control);
            if (!radioButton.isEnabled()) {
                return false;
            }
            e eVar = this.builder;
            int i9 = eVar.selectedIndex;
            if (eVar.autoDismiss && eVar.positiveText == null) {
                dismiss();
                this.builder.selectedIndex = i8;
                sendSingleChoiceCallback(view);
            } else {
                if (eVar.alwaysCallSingleChoiceCallback) {
                    eVar.selectedIndex = i8;
                    boolean sendSingleChoiceCallback = sendSingleChoiceCallback(view);
                    this.builder.selectedIndex = i9;
                }
                this.builder.selectedIndex = i8;
                radioButton.setChecked(true);
                this.builder.adapter.notifyItemChanged(i9);
                this.builder.adapter.notifyItemChanged(i8);
            }
        }
        return true;
    }

    @Override // com.afollestad.materialdialogs.b, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.input != null) {
            com.afollestad.materialdialogs.util.a.showKeyboard(this, this.builder);
            if (this.input.getText().length() > 0) {
                EditText editText = this.input;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    public void selectAllIndices() {
        selectAllIndices(true);
    }

    @UiThread
    public final void setActionButton(@NonNull DialogAction dialogAction, CharSequence charSequence) {
        int i8 = d.$SwitchMap$com$afollestad$materialdialogs$DialogAction[dialogAction.ordinal()];
        if (i8 == 1) {
            this.builder.neutralText = charSequence;
            this.neutralButton.setText(charSequence);
            this.neutralButton.setVisibility(charSequence == null ? 8 : 0);
        } else if (i8 != 2) {
            this.builder.positiveText = charSequence;
            this.positiveButton.setText(charSequence);
            this.positiveButton.setVisibility(charSequence == null ? 8 : 0);
        } else {
            this.builder.negativeText = charSequence;
            this.negativeButton.setText(charSequence);
            this.negativeButton.setVisibility(charSequence == null ? 8 : 0);
        }
    }

    @UiThread
    public final void setContent(CharSequence charSequence) {
        this.content.setText(charSequence);
        this.content.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // com.afollestad.materialdialogs.b, android.app.Dialog
    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(int i8) {
        super.setContentView(i8);
    }

    @UiThread
    public void setIcon(@DrawableRes int i8) {
        this.icon.setImageResource(i8);
        this.icon.setVisibility(i8 != 0 ? 0 : 8);
    }

    @UiThread
    public void setIconAttribute(@AttrRes int i8) {
        setIcon(com.afollestad.materialdialogs.util.a.resolveDrawable(this.builder.context, i8));
    }

    void setInternalInputCallback() {
        EditText editText = this.input;
        if (editText == null) {
            return;
        }
        editText.addTextChangedListener(new c());
    }

    @UiThread
    public final void setItems(CharSequence... charSequenceArr) {
        e eVar = this.builder;
        if (eVar.adapter == null) {
            throw new IllegalStateException("This MaterialDialog instance does not yet have an adapter set to it. You cannot use setItems().");
        }
        if (charSequenceArr != null) {
            eVar.items = new ArrayList<>(charSequenceArr.length);
            Collections.addAll(this.builder.items, charSequenceArr);
        } else {
            eVar.items = null;
        }
        if (!(this.builder.adapter instanceof com.afollestad.materialdialogs.a)) {
            throw new IllegalStateException("When using a custom adapter, setItems() cannot be used. Set items through the adapter instead.");
        }
        notifyItemsChanged();
    }

    public final void setMaxProgress(int i8) {
        if (this.builder.progress <= -2) {
            throw new IllegalStateException("Cannot use setMaxProgress() on this dialog.");
        }
        this.progressBar.setMax(i8);
    }

    public final void setProgress(int i8) {
        if (this.builder.progress <= -2) {
            Log.w("MaterialDialog", "Calling setProgress(int) on an indeterminate progress dialog has no effect!");
        } else {
            this.progressBar.setProgress(i8);
            this.handler.post(new b());
        }
    }

    public final void setProgressNumberFormat(String str) {
        this.builder.progressNumberFormat = str;
        setProgress(getCurrentProgress());
    }

    public final void setProgressPercentFormat(NumberFormat numberFormat) {
        this.builder.progressPercentFormat = numberFormat;
        setProgress(getCurrentProgress());
    }

    public void setPromptCheckBoxChecked(boolean z7) {
        CheckBox checkBox = this.checkBoxPrompt;
        if (checkBox != null) {
            checkBox.setChecked(z7);
        }
    }

    @UiThread
    public void setSelectedIndex(int i8) {
        e eVar = this.builder;
        eVar.selectedIndex = i8;
        RecyclerView.Adapter<?> adapter = eVar.adapter;
        if (adapter == null || !(adapter instanceof com.afollestad.materialdialogs.a)) {
            throw new IllegalStateException("You can only use setSelectedIndex() with the default adapter implementation.");
        }
        adapter.notifyDataSetChanged();
    }

    @UiThread
    public void setSelectedIndices(@NonNull Integer[] numArr) {
        this.selectedIndicesList = new ArrayList(Arrays.asList(numArr));
        RecyclerView.Adapter<?> adapter = this.builder.adapter;
        if (adapter == null || !(adapter instanceof com.afollestad.materialdialogs.a)) {
            throw new IllegalStateException("You can only use setSelectedIndices() with the default adapter implementation.");
        }
        adapter.notifyDataSetChanged();
    }

    @Override // android.app.Dialog
    @UiThread
    public final void setTitle(CharSequence charSequence) {
        this.title.setText(charSequence);
    }

    public final void setTypeface(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setTypeface(typeface);
    }

    @Override // android.app.Dialog
    @UiThread
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            throw new DialogException("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    public void clearSelectedIndices(boolean z7) {
        ListType listType = this.listType;
        if (listType == null || listType != ListType.MULTI) {
            throw new IllegalStateException("You can only use clearSelectedIndices() with multi choice list dialogs.");
        }
        RecyclerView.Adapter<?> adapter = this.builder.adapter;
        if (adapter == null || !(adapter instanceof com.afollestad.materialdialogs.a)) {
            throw new IllegalStateException("You can only use clearSelectedIndices() with the default adapter implementation.");
        }
        List<Integer> list = this.selectedIndicesList;
        if (list != null) {
            list.clear();
        }
        this.builder.adapter.notifyDataSetChanged();
        if (z7) {
            this.builder.getClass();
        }
    }

    public void selectAllIndices(boolean z7) {
        ListType listType = this.listType;
        if (listType == null || listType != ListType.MULTI) {
            throw new IllegalStateException("You can only use selectAllIndices() with multi choice list dialogs.");
        }
        RecyclerView.Adapter<?> adapter = this.builder.adapter;
        if (adapter == null || !(adapter instanceof com.afollestad.materialdialogs.a)) {
            throw new IllegalStateException("You can only use selectAllIndices() with the default adapter implementation.");
        }
        if (this.selectedIndicesList == null) {
            this.selectedIndicesList = new ArrayList();
        }
        for (int i8 = 0; i8 < this.builder.adapter.getItemCount(); i8++) {
            if (!this.selectedIndicesList.contains(Integer.valueOf(i8))) {
                this.selectedIndicesList.add(Integer.valueOf(i8));
            }
        }
        this.builder.adapter.notifyDataSetChanged();
        if (z7) {
            this.builder.getClass();
        }
    }

    @Override // com.afollestad.materialdialogs.b, android.app.Dialog
    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(@NonNull View view) {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    @UiThread
    public final void setTitle(@StringRes int i8) {
        setTitle(this.builder.context.getString(i8));
    }

    @UiThread
    public final void setContent(@StringRes int i8) {
        setContent(this.builder.context.getString(i8));
    }

    @Override // com.afollestad.materialdialogs.b, android.app.Dialog
    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    @UiThread
    public void setIcon(Drawable drawable) {
        this.icon.setImageDrawable(drawable);
        this.icon.setVisibility(drawable != null ? 0 : 8);
    }

    @UiThread
    public final void setTitle(@StringRes int i8, @Nullable Object... objArr) {
        setTitle(this.builder.context.getString(i8, objArr));
    }

    @UiThread
    public final void setContent(@StringRes int i8, @Nullable Object... objArr) {
        setContent(this.builder.context.getString(i8, objArr));
    }

    public final void setActionButton(DialogAction dialogAction, @StringRes int i8) {
        setActionButton(dialogAction, getContext().getText(i8));
    }
}
