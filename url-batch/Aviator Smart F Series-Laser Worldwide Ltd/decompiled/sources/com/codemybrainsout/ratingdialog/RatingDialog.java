package com.codemybrainsout.ratingdialog;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import f6.l;
import f6.p;
import f6.q;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.t;
import y5.w;

/* loaded from: classes2.dex */
public final class RatingDialog extends AppCompatDialog implements RatingBar.OnRatingBarChangeListener, View.OnClickListener {
    public static final b Companion = new b(null);
    private static final int DEFAULT_SESSION = 1;
    private static final int DEFAULT_THRESHOLD = 3;
    private static final String MyPrefs = "RatingDialog";
    private static final String SESSION_COUNT = "session_count";
    private static final String SHOW_NEVER = "show_never";
    private final a builder;
    private EditText editTextFeedback;
    private ImageView icon;
    private RatingBar ratingBar;
    private final int session;
    private final SharedPreferences sharedPreferences;
    private TextView textViewDialogButtonNegative;
    private TextView textViewDialogButtonPositive;
    private TextView textViewDialogTitle;
    private TextView textViewFeedbackCancel;
    private TextView textViewFeedbackSubmit;
    private TextView textViewFeedbackTitle;
    private final int threshold;

    public static final class a {
        private String cancelText;
        private final Context context;
        private String feedbackFormHint;
        private int feedbackTextColor;
        private String formTitle;
        private int hintColor;
        private Drawable iconDrawable;
        private Integer iconRes;
        private String marketUrl;

        @DrawableRes
        private int negativeBackground;
        private l negativeButtonClickListener;
        private String negativeText;
        private int negativeTextColor;

        @DrawableRes
        private int positiveBackground;
        private l positiveButtonClickListener;
        private String positiveText;
        private int positiveTextColor;

        @ColorRes
        private int ratingBarBackgroundColor;
        private int ratingBarColor;
        private l ratingDialogFormListener;
        private p ratingDialogListener;
        private q ratingThresholdClearedListener;
        private q ratingThresholdFailedListener;
        private int session;
        private boolean sessionIncrementAutomatic;
        private String submitText;
        private int threshold;
        private String title;
        private int titleTextColor;

        public a(Context context) {
            s.checkNotNullParameter(context, "context");
            this.context = context;
            this.session = 1;
            this.threshold = 3;
            this.sessionIncrementAutomatic = true;
        }

        public static /* synthetic */ a formCancelText$default(a aVar, Integer num, Integer num2, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                num = null;
            }
            if ((i9 & 2) != 0) {
                num2 = null;
            }
            if ((i9 & 4) != 0) {
                i8 = 0;
            }
            return aVar.formCancelText(num, num2, i8);
        }

        public static /* synthetic */ a formHint$default(a aVar, Integer num, Integer num2, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                num = null;
            }
            if ((i8 & 2) != 0) {
                num2 = null;
            }
            return aVar.formHint(num, num2);
        }

        public static /* synthetic */ a formSubmitText$default(a aVar, Integer num, Integer num2, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                num = null;
            }
            if ((i9 & 2) != 0) {
                num2 = null;
            }
            if ((i9 & 4) != 0) {
                i8 = 0;
            }
            return aVar.formSubmitText(num, num2, i8);
        }

        public static /* synthetic */ a formTitle$default(a aVar, Integer num, Integer num2, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                num = null;
            }
            if ((i8 & 2) != 0) {
                num2 = null;
            }
            return aVar.formTitle(num, num2);
        }

        public static /* synthetic */ a negativeButton$default(a aVar, Integer num, Integer num2, int i8, l lVar, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                num = null;
            }
            if ((i9 & 2) != 0) {
                num2 = null;
            }
            if ((i9 & 4) != 0) {
                i8 = 0;
            }
            if ((i9 & 8) != 0) {
                lVar = null;
            }
            return aVar.negativeButton(num, num2, i8, lVar);
        }

        public static /* synthetic */ a positiveButton$default(a aVar, Integer num, Integer num2, int i8, l lVar, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                num = null;
            }
            if ((i9 & 2) != 0) {
                num2 = null;
            }
            if ((i9 & 4) != 0) {
                i8 = 0;
            }
            if ((i9 & 8) != 0) {
                lVar = null;
            }
            return aVar.positiveButton(num, num2, i8, lVar);
        }

        public static /* synthetic */ a ratingBarColor$default(a aVar, Integer num, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                num = null;
            }
            if ((i9 & 2) != 0) {
                i8 = 0;
            }
            return aVar.ratingBarColor(num, i8);
        }

        public static /* synthetic */ a title$default(a aVar, Integer num, Integer num2, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                num = null;
            }
            if ((i8 & 2) != 0) {
                num2 = null;
            }
            return aVar.title(num, num2);
        }

        public final RatingDialog build() {
            return new RatingDialog(this.context, this);
        }

        public final a feedbackTextColor(@ColorRes int i8) {
            this.feedbackTextColor = ContextCompat.getColor(this.context, i8);
            return this;
        }

        public final a formCancelText(@StringRes Integer num, @ColorRes Integer num2, @ColorRes int i8) {
            String string;
            int color;
            if (num == null) {
                string = null;
            } else {
                string = this.context.getString(num.intValue());
            }
            this.cancelText = string;
            if (num2 == null) {
                color = 0;
            } else {
                color = ContextCompat.getColor(this.context, num2.intValue());
            }
            this.negativeTextColor = color;
            this.negativeBackground = i8;
            return this;
        }

        public final a formHint(@StringRes Integer num, @ColorRes Integer num2) {
            String string;
            int color;
            if (num == null) {
                string = null;
            } else {
                string = this.context.getString(num.intValue());
            }
            this.feedbackFormHint = string;
            if (num2 == null) {
                color = 0;
            } else {
                color = ContextCompat.getColor(this.context, num2.intValue());
            }
            this.hintColor = color;
            return this;
        }

        public final a formSubmitText(@StringRes Integer num, @ColorRes Integer num2, @ColorRes int i8) {
            String string;
            int color;
            if (num == null) {
                string = null;
            } else {
                string = this.context.getString(num.intValue());
            }
            this.submitText = string;
            if (num2 == null) {
                color = 0;
            } else {
                color = ContextCompat.getColor(this.context, num2.intValue());
            }
            this.positiveTextColor = color;
            this.positiveBackground = i8;
            return this;
        }

        public final a formTitle(@StringRes Integer num, @ColorRes Integer num2) {
            String string;
            int color;
            if (num == null) {
                string = null;
            } else {
                string = this.context.getString(num.intValue());
            }
            this.formTitle = string;
            if (num2 == null) {
                color = 0;
            } else {
                color = ContextCompat.getColor(this.context, num2.intValue());
            }
            this.titleTextColor = color;
            return this;
        }

        public final String getCancelText$ratingdialog_release() {
            return this.cancelText;
        }

        public final String getFeedbackFormHint$ratingdialog_release() {
            return this.feedbackFormHint;
        }

        public final int getFeedbackTextColor$ratingdialog_release() {
            return this.feedbackTextColor;
        }

        public final String getFormTitle$ratingdialog_release() {
            return this.formTitle;
        }

        public final int getHintColor$ratingdialog_release() {
            return this.hintColor;
        }

        public final Drawable getIconDrawable$ratingdialog_release() {
            return this.iconDrawable;
        }

        public final Integer getIconRes$ratingdialog_release() {
            return this.iconRes;
        }

        public final String getMarketUrl$ratingdialog_release() {
            return this.marketUrl;
        }

        public final int getNegativeBackground$ratingdialog_release() {
            return this.negativeBackground;
        }

        public final l getNegativeButtonClickListener$ratingdialog_release() {
            return this.negativeButtonClickListener;
        }

        public final String getNegativeText$ratingdialog_release() {
            return this.negativeText;
        }

        public final int getNegativeTextColor$ratingdialog_release() {
            return this.negativeTextColor;
        }

        public final int getPositiveBackground$ratingdialog_release() {
            return this.positiveBackground;
        }

        public final l getPositiveButtonClickListener$ratingdialog_release() {
            return this.positiveButtonClickListener;
        }

        public final String getPositiveText$ratingdialog_release() {
            return this.positiveText;
        }

        public final int getPositiveTextColor$ratingdialog_release() {
            return this.positiveTextColor;
        }

        public final int getRatingBarBackgroundColor$ratingdialog_release() {
            return this.ratingBarBackgroundColor;
        }

        public final int getRatingBarColor$ratingdialog_release() {
            return this.ratingBarColor;
        }

        public final l getRatingDialogFormListener$ratingdialog_release() {
            return this.ratingDialogFormListener;
        }

        public final p getRatingDialogListener$ratingdialog_release() {
            return this.ratingDialogListener;
        }

        public final q getRatingThresholdClearedListener$ratingdialog_release() {
            return this.ratingThresholdClearedListener;
        }

        public final q getRatingThresholdFailedListener$ratingdialog_release() {
            return this.ratingThresholdFailedListener;
        }

        public final int getSession$ratingdialog_release() {
            return this.session;
        }

        public final boolean getSessionIncrementAutomatic$ratingdialog_release() {
            return this.sessionIncrementAutomatic;
        }

        public final String getSubmitText$ratingdialog_release() {
            return this.submitText;
        }

        public final int getThreshold$ratingdialog_release() {
            return this.threshold;
        }

        public final String getTitle$ratingdialog_release() {
            return this.title;
        }

        public final int getTitleTextColor$ratingdialog_release() {
            return this.titleTextColor;
        }

        public final a icon(Drawable icon) {
            s.checkNotNullParameter(icon, "icon");
            this.iconDrawable = icon;
            return this;
        }

        public final a incrementSessionsAutomatically(boolean z7) {
            this.sessionIncrementAutomatic = z7;
            return this;
        }

        public final a negativeButton(@StringRes Integer num, @ColorRes Integer num2, @DrawableRes int i8, l lVar) {
            String string;
            int color;
            if (num == null) {
                string = null;
            } else {
                string = this.context.getString(num.intValue());
            }
            this.negativeText = string;
            if (num2 == null) {
                color = 0;
            } else {
                color = ContextCompat.getColor(this.context, num2.intValue());
            }
            this.negativeTextColor = color;
            this.negativeBackground = i8;
            this.negativeButtonClickListener = lVar;
            return this;
        }

        public final a onRatingBarFormSubmit(l lVar) {
            this.ratingDialogFormListener = lVar;
            return this;
        }

        public final a onRatingChanged(p pVar) {
            this.ratingDialogListener = pVar;
            return this;
        }

        public final a onThresholdCleared(q qVar) {
            this.ratingThresholdClearedListener = qVar;
            return this;
        }

        public final a onThresholdFailed(q qVar) {
            this.ratingThresholdFailedListener = qVar;
            return this;
        }

        public final a playstoreUrl(String url) {
            s.checkNotNullParameter(url, "url");
            this.marketUrl = url;
            return this;
        }

        public final a positiveButton(@StringRes Integer num, @ColorRes Integer num2, @DrawableRes int i8, l lVar) {
            String string;
            int color;
            if (num == null) {
                string = null;
            } else {
                string = this.context.getString(num.intValue());
            }
            this.positiveText = string;
            if (num2 == null) {
                color = 0;
            } else {
                color = ContextCompat.getColor(this.context, num2.intValue());
            }
            this.positiveTextColor = color;
            this.positiveBackground = i8;
            this.positiveButtonClickListener = lVar;
            return this;
        }

        public final a ratingBarColor(@ColorRes Integer num, @ColorRes int i8) {
            int color;
            if (num == null) {
                color = 0;
            } else {
                color = ContextCompat.getColor(this.context, num.intValue());
            }
            this.ratingBarColor = color;
            this.ratingBarBackgroundColor = i8;
            return this;
        }

        public final a session(int i8) {
            this.session = i8;
            return this;
        }

        public final void setCancelText$ratingdialog_release(String str) {
            this.cancelText = str;
        }

        public final void setFeedbackFormHint$ratingdialog_release(String str) {
            this.feedbackFormHint = str;
        }

        public final void setFeedbackTextColor$ratingdialog_release(int i8) {
            this.feedbackTextColor = i8;
        }

        public final void setFormTitle$ratingdialog_release(String str) {
            this.formTitle = str;
        }

        public final void setHintColor$ratingdialog_release(int i8) {
            this.hintColor = i8;
        }

        public final void setIconDrawable$ratingdialog_release(Drawable drawable) {
            this.iconDrawable = drawable;
        }

        public final void setIconRes$ratingdialog_release(Integer num) {
            this.iconRes = num;
        }

        public final void setMarketUrl$ratingdialog_release(String str) {
            this.marketUrl = str;
        }

        public final void setNegativeBackground$ratingdialog_release(int i8) {
            this.negativeBackground = i8;
        }

        public final void setNegativeButtonClickListener$ratingdialog_release(l lVar) {
            this.negativeButtonClickListener = lVar;
        }

        public final void setNegativeText$ratingdialog_release(String str) {
            this.negativeText = str;
        }

        public final void setNegativeTextColor$ratingdialog_release(int i8) {
            this.negativeTextColor = i8;
        }

        public final void setPositiveBackground$ratingdialog_release(int i8) {
            this.positiveBackground = i8;
        }

        public final void setPositiveButtonClickListener$ratingdialog_release(l lVar) {
            this.positiveButtonClickListener = lVar;
        }

        public final void setPositiveText$ratingdialog_release(String str) {
            this.positiveText = str;
        }

        public final void setPositiveTextColor$ratingdialog_release(int i8) {
            this.positiveTextColor = i8;
        }

        public final void setRatingBarBackgroundColor$ratingdialog_release(int i8) {
            this.ratingBarBackgroundColor = i8;
        }

        public final void setRatingBarColor$ratingdialog_release(int i8) {
            this.ratingBarColor = i8;
        }

        public final void setRatingDialogFormListener$ratingdialog_release(l lVar) {
            this.ratingDialogFormListener = lVar;
        }

        public final void setRatingDialogListener$ratingdialog_release(p pVar) {
            this.ratingDialogListener = pVar;
        }

        public final void setRatingThresholdClearedListener$ratingdialog_release(q qVar) {
            this.ratingThresholdClearedListener = qVar;
        }

        public final void setRatingThresholdFailedListener$ratingdialog_release(q qVar) {
            this.ratingThresholdFailedListener = qVar;
        }

        public final void setSession$ratingdialog_release(int i8) {
            this.session = i8;
        }

        public final void setSessionIncrementAutomatic$ratingdialog_release(boolean z7) {
            this.sessionIncrementAutomatic = z7;
        }

        public final void setSubmitText$ratingdialog_release(String str) {
            this.submitText = str;
        }

        public final void setThreshold$ratingdialog_release(int i8) {
            this.threshold = i8;
        }

        public final void setTitle$ratingdialog_release(String str) {
            this.title = str;
        }

        public final void setTitleTextColor$ratingdialog_release(int i8) {
            this.titleTextColor = i8;
        }

        public final a threshold(int i8) {
            this.threshold = i8;
            return this;
        }

        public final a title(@StringRes Integer num, @ColorRes Integer num2) {
            String string;
            int color;
            if (num == null) {
                string = null;
            } else {
                string = this.context.getString(num.intValue());
            }
            this.title = string;
            if (num2 == null) {
                color = 0;
            } else {
                color = ContextCompat.getColor(this.context, num2.intValue());
            }
            this.titleTextColor = color;
            return this;
        }

        public final a icon(@DrawableRes int i8) {
            this.iconRes = Integer.valueOf(i8);
            return this;
        }

        public final a playstoreUrl(@StringRes int i8) {
            this.marketUrl = this.context.getString(i8);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingDialog(Context context, a builder) {
        super(context);
        s.checkNotNullParameter(context, "context");
        s.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        SharedPreferences sharedPreferences = context.getSharedPreferences(MyPrefs, 0);
        s.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…fs, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
        this.threshold = builder.getThreshold$ratingdialog_release();
        this.session = builder.getSession$ratingdialog_release();
    }

    private final boolean checkIfSessionMatches(int i8) {
        if (i8 == 1) {
            return true;
        }
        if (this.sharedPreferences.getBoolean(SHOW_NEVER, false)) {
            return false;
        }
        int i9 = this.sharedPreferences.getInt(SESSION_COUNT, 1);
        if (i8 == i9) {
            resetCount();
            return true;
        }
        if (i8 <= i9) {
            saveCount(i9);
        } else if (this.builder.getSessionIncrementAutomatic$ratingdialog_release()) {
            saveCount(i9 + 1);
        }
        return false;
    }

    private final void initViews() {
        this.textViewDialogTitle = (TextView) findViewById(R$id.dialog_rating_title);
        this.textViewDialogButtonNegative = (TextView) findViewById(R$id.dialog_rating_button_negative);
        this.textViewDialogButtonPositive = (TextView) findViewById(R$id.dialog_rating_button_positive);
        this.textViewFeedbackTitle = (TextView) findViewById(R$id.dialog_rating_feedback_title);
        this.textViewFeedbackSubmit = (TextView) findViewById(R$id.dialog_rating_button_feedback_submit);
        this.textViewFeedbackCancel = (TextView) findViewById(R$id.dialog_rating_button_feedback_cancel);
        this.ratingBar = (RatingBar) findViewById(R$id.dialog_rating_rating_bar);
        this.icon = (ImageView) findViewById(R$id.dialog_rating_icon);
        this.editTextFeedback = (EditText) findViewById(R$id.dialog_rating_feedback);
    }

    private final void onFeedbackSubmit() {
        showNever$default(this, false, 1, null);
        EditText editText = this.editTextFeedback;
        String valueOf = String.valueOf(editText != null ? editText.getText() : null);
        int length = valueOf.length() - 1;
        int i8 = 0;
        boolean z7 = false;
        while (i8 <= length) {
            boolean z8 = s.compare((int) valueOf.charAt(!z7 ? i8 : length), 32) <= 0;
            if (z7) {
                if (!z8) {
                    break;
                } else {
                    length--;
                }
            } else if (z8) {
                i8++;
            } else {
                z7 = true;
            }
        }
        String obj = valueOf.subSequence(i8, length + 1).toString();
        if (TextUtils.isEmpty(obj)) {
            EditText editText2 = this.editTextFeedback;
            if (editText2 == null) {
                return;
            }
            shake(editText2);
            return;
        }
        l ratingDialogFormListener$ratingdialog_release = this.builder.getRatingDialogFormListener$ratingdialog_release();
        if (ratingDialogFormListener$ratingdialog_release != null) {
            ratingDialogFormListener$ratingdialog_release.invoke(obj);
        }
        dismiss();
    }

    private final void onNegativeButtonClick() {
        showNever$default(this, false, 1, null);
        if (this.builder.getNegativeButtonClickListener$ratingdialog_release() == null) {
            dismiss();
            return;
        }
        l negativeButtonClickListener$ratingdialog_release = this.builder.getNegativeButtonClickListener$ratingdialog_release();
        if (negativeButtonClickListener$ratingdialog_release == null) {
            return;
        }
        negativeButtonClickListener$ratingdialog_release.invoke(this);
    }

    private final void onPositiveButtonClick() {
        if (this.builder.getPositiveButtonClickListener$ratingdialog_release() == null) {
            dismiss();
            return;
        }
        l positiveButtonClickListener$ratingdialog_release = this.builder.getPositiveButtonClickListener$ratingdialog_release();
        if (positiveButtonClickListener$ratingdialog_release == null) {
            return;
        }
        positiveButtonClickListener$ratingdialog_release.invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openGooglePlay(Context context) {
        String marketUrl$ratingdialog_release = this.builder.getMarketUrl$ratingdialog_release();
        if (marketUrl$ratingdialog_release == null || t.isBlank(marketUrl$ratingdialog_release)) {
            this.builder.setMarketUrl$ratingdialog_release(s.stringPlus(context.getString(R$string.market_prefix), context.getPackageName()));
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.builder.getMarketUrl$ratingdialog_release())));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, context.getString(R$string.error_no_google_play), 0).show();
        }
    }

    private final void saveCount(int i8) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putInt(SESSION_COUNT, i8);
        edit.apply();
    }

    private final void setRatingThresholdClearedListener() {
        this.builder.setRatingThresholdClearedListener$ratingdialog_release(new q() { // from class: com.codemybrainsout.ratingdialog.RatingDialog$setRatingThresholdClearedListener$1
            {
                super(3);
            }

            @Override // f6.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((RatingDialog) obj, ((Number) obj2).floatValue(), ((Boolean) obj3).booleanValue());
                return w.INSTANCE;
            }

            public final void invoke(RatingDialog ratingDialog, float f8, boolean z7) {
                RatingDialog ratingDialog2 = RatingDialog.this;
                Context context = ratingDialog2.getContext();
                s.checkNotNullExpressionValue(context, "context");
                ratingDialog2.openGooglePlay(context);
                RatingDialog.this.dismiss();
            }
        });
    }

    private final void setRatingThresholdFailedListener() {
        this.builder.setRatingThresholdFailedListener$ratingdialog_release(new q() { // from class: com.codemybrainsout.ratingdialog.RatingDialog$setRatingThresholdFailedListener$1
            {
                super(3);
            }

            @Override // f6.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((RatingDialog) obj, ((Number) obj2).floatValue(), ((Boolean) obj3).booleanValue());
                return w.INSTANCE;
            }

            public final void invoke(RatingDialog ratingDialog, float f8, boolean z7) {
                RatingDialog.this.showFeedbackForm();
            }
        });
    }

    private final void setTheme() {
        EditText editText;
        EditText editText2;
        if (this.builder.getTitleTextColor$ratingdialog_release() != 0) {
            TextView textView = this.textViewDialogTitle;
            if (textView != null) {
                textView.setTextColor(this.builder.getTitleTextColor$ratingdialog_release());
            }
            TextView textView2 = this.textViewFeedbackTitle;
            if (textView2 != null) {
                textView2.setTextColor(this.builder.getTitleTextColor$ratingdialog_release());
            }
        }
        if (this.builder.getNegativeTextColor$ratingdialog_release() != 0) {
            TextView textView3 = this.textViewDialogButtonNegative;
            if (textView3 != null) {
                textView3.setTextColor(this.builder.getNegativeTextColor$ratingdialog_release());
            }
            TextView textView4 = this.textViewFeedbackCancel;
            if (textView4 != null) {
                textView4.setTextColor(this.builder.getNegativeTextColor$ratingdialog_release());
            }
        }
        if (this.builder.getPositiveTextColor$ratingdialog_release() != 0) {
            TextView textView5 = this.textViewDialogButtonPositive;
            if (textView5 != null) {
                textView5.setTextColor(this.builder.getPositiveTextColor$ratingdialog_release());
            }
            TextView textView6 = this.textViewFeedbackSubmit;
            if (textView6 != null) {
                textView6.setTextColor(this.builder.getPositiveTextColor$ratingdialog_release());
            }
        }
        if (this.builder.getPositiveBackground$ratingdialog_release() != 0) {
            TextView textView7 = this.textViewDialogButtonPositive;
            if (textView7 != null) {
                textView7.setBackgroundResource(this.builder.getPositiveBackground$ratingdialog_release());
            }
            TextView textView8 = this.textViewFeedbackSubmit;
            if (textView8 != null) {
                textView8.setBackgroundResource(this.builder.getPositiveBackground$ratingdialog_release());
            }
        }
        if (this.builder.getNegativeBackground$ratingdialog_release() != 0) {
            TextView textView9 = this.textViewDialogButtonNegative;
            if (textView9 != null) {
                textView9.setBackgroundResource(this.builder.getNegativeBackground$ratingdialog_release());
            }
            TextView textView10 = this.textViewFeedbackCancel;
            if (textView10 != null) {
                textView10.setBackgroundResource(this.builder.getNegativeBackground$ratingdialog_release());
            }
        }
        if (this.builder.getFeedbackTextColor$ratingdialog_release() != 0 && (editText2 = this.editTextFeedback) != null) {
            editText2.setTextColor(this.builder.getFeedbackTextColor$ratingdialog_release());
        }
        if (this.builder.getHintColor$ratingdialog_release() == 0 || (editText = this.editTextFeedback) == null) {
            return;
        }
        editText.setHintTextColor(this.builder.getHintColor$ratingdialog_release());
    }

    private final void setValues() {
        w wVar;
        TextView textView = this.textViewDialogTitle;
        if (textView != null) {
            String title$ratingdialog_release = this.builder.getTitle$ratingdialog_release();
            if (title$ratingdialog_release == null) {
                title$ratingdialog_release = getContext().getString(R$string.rating_dialog_experience);
            }
            textView.setText(title$ratingdialog_release);
        }
        TextView textView2 = this.textViewFeedbackTitle;
        if (textView2 != null) {
            String formTitle$ratingdialog_release = this.builder.getFormTitle$ratingdialog_release();
            if (formTitle$ratingdialog_release == null) {
                formTitle$ratingdialog_release = getContext().getString(R$string.rating_dialog_feedback_title);
            }
            textView2.setText(formTitle$ratingdialog_release);
        }
        EditText editText = this.editTextFeedback;
        if (editText != null) {
            String feedbackFormHint$ratingdialog_release = this.builder.getFeedbackFormHint$ratingdialog_release();
            if (feedbackFormHint$ratingdialog_release == null) {
                feedbackFormHint$ratingdialog_release = getContext().getString(R$string.rating_dialog_suggestions);
            }
            editText.setHint(feedbackFormHint$ratingdialog_release);
        }
        TextView textView3 = this.textViewDialogButtonNegative;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
            String negativeText$ratingdialog_release = this.builder.getNegativeText$ratingdialog_release();
            if (negativeText$ratingdialog_release == null) {
                negativeText$ratingdialog_release = textView3.getContext().getString(R$string.rating_dialog_never);
            }
            textView3.setText(negativeText$ratingdialog_release);
            textView3.setVisibility(this.session != 1 ? 0 : 8);
        }
        TextView textView4 = this.textViewDialogButtonPositive;
        if (textView4 != null) {
            textView4.setOnClickListener(this);
            String positiveText$ratingdialog_release = this.builder.getPositiveText$ratingdialog_release();
            if (positiveText$ratingdialog_release == null) {
                positiveText$ratingdialog_release = textView4.getContext().getString(R$string.rating_dialog_maybe_later);
            }
            textView4.setText(positiveText$ratingdialog_release);
        }
        TextView textView5 = this.textViewFeedbackSubmit;
        if (textView5 != null) {
            textView5.setOnClickListener(this);
            String submitText$ratingdialog_release = this.builder.getSubmitText$ratingdialog_release();
            if (submitText$ratingdialog_release == null) {
                submitText$ratingdialog_release = textView5.getContext().getString(R$string.rating_dialog_submit);
            }
            textView5.setText(submitText$ratingdialog_release);
        }
        TextView textView6 = this.textViewFeedbackCancel;
        if (textView6 != null) {
            textView6.setOnClickListener(this);
            String cancelText$ratingdialog_release = this.builder.getCancelText$ratingdialog_release();
            if (cancelText$ratingdialog_release == null) {
                cancelText$ratingdialog_release = textView6.getContext().getString(R$string.rating_dialog_cancel);
            }
            textView6.setText(cancelText$ratingdialog_release);
        }
        RatingBar ratingBar = this.ratingBar;
        if (ratingBar != null) {
            ratingBar.setOnRatingBarChangeListener(this);
            if (this.builder.getRatingBarColor$ratingdialog_release() != 0) {
                Drawable progressDrawable = ratingBar.getProgressDrawable();
                if (progressDrawable == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                }
                LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
                Drawable drawable = layerDrawable.getDrawable(2);
                int ratingBarColor$ratingdialog_release = this.builder.getRatingBarColor$ratingdialog_release();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                drawable.setColorFilter(ratingBarColor$ratingdialog_release, mode);
                layerDrawable.getDrawable(1).setColorFilter(this.builder.getRatingBarColor$ratingdialog_release(), mode);
                layerDrawable.getDrawable(0).setColorFilter(ContextCompat.getColor(ratingBar.getContext(), this.builder.getRatingBarBackgroundColor$ratingdialog_release() != 0 ? this.builder.getRatingBarBackgroundColor$ratingdialog_release() : R$color.secondaryTextColor), mode);
            }
        }
        ImageView imageView = this.icon;
        if (imageView != null) {
            Integer iconRes$ratingdialog_release = this.builder.getIconRes$ratingdialog_release();
            if (iconRes$ratingdialog_release == null) {
                wVar = null;
            } else {
                imageView.setImageResource(iconRes$ratingdialog_release.intValue());
                wVar = w.INSTANCE;
            }
            if (wVar == null) {
                Drawable applicationIcon = imageView.getContext().getPackageManager().getApplicationIcon(imageView.getContext().getApplicationInfo());
                s.checkNotNullExpressionValue(applicationIcon, "context.packageManager.g…(context.applicationInfo)");
                if (this.builder.getIconDrawable$ratingdialog_release() != null) {
                    applicationIcon = this.builder.getIconDrawable$ratingdialog_release();
                }
                imageView.setImageDrawable(applicationIcon);
            }
        }
        if (this.builder.getRatingThresholdClearedListener$ratingdialog_release() == null) {
            setRatingThresholdClearedListener();
        }
        if (this.builder.getRatingThresholdFailedListener$ratingdialog_release() == null) {
            setRatingThresholdFailedListener();
        }
    }

    private final void shake(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R$anim.shake));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFeedbackForm() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.layout_rating);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R$id.layout_feedback);
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(0);
    }

    private final void showNever(boolean z7) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean(SHOW_NEVER, z7);
        edit.apply();
    }

    static /* synthetic */ void showNever$default(RatingDialog ratingDialog, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        ratingDialog.showNever(z7);
    }

    public final void incrementSessionCount() {
        int i8 = this.sharedPreferences.getInt(SESSION_COUNT, 1) + 1;
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putInt(SESSION_COUNT, i8);
        edit.apply();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        s.checkNotNullParameter(view, "view");
        int id = view.getId();
        if (id == R$id.dialog_rating_button_negative) {
            onNegativeButtonClick();
            return;
        }
        if (id == R$id.dialog_rating_button_positive) {
            onPositiveButtonClick();
        } else if (id == R$id.dialog_rating_button_feedback_submit) {
            onFeedbackSubmit();
        } else if (id == R$id.dialog_rating_button_feedback_cancel) {
            dismiss();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(R$layout.dialog_rating);
        initViews();
        setValues();
        setTheme();
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public void onRatingChanged(RatingBar ratingBar, float f8, boolean z7) {
        s.checkNotNullParameter(ratingBar, "ratingBar");
        if (ratingBar.getRating() >= this.threshold) {
            showNever$default(this, false, 1, null);
            q ratingThresholdClearedListener$ratingdialog_release = this.builder.getRatingThresholdClearedListener$ratingdialog_release();
            if (ratingThresholdClearedListener$ratingdialog_release != null) {
                ratingThresholdClearedListener$ratingdialog_release.invoke(this, Float.valueOf(ratingBar.getRating()), Boolean.valueOf(ratingBar.getRating() >= ((float) this.threshold)));
            }
        } else {
            q ratingThresholdFailedListener$ratingdialog_release = this.builder.getRatingThresholdFailedListener$ratingdialog_release();
            if (ratingThresholdFailedListener$ratingdialog_release != null) {
                ratingThresholdFailedListener$ratingdialog_release.invoke(this, Float.valueOf(ratingBar.getRating()), Boolean.valueOf(ratingBar.getRating() >= ((float) this.threshold)));
            }
        }
        p ratingDialogListener$ratingdialog_release = this.builder.getRatingDialogListener$ratingdialog_release();
        if (ratingDialogListener$ratingdialog_release == null) {
            return;
        }
        ratingDialogListener$ratingdialog_release.invoke(Float.valueOf(ratingBar.getRating()), Boolean.valueOf(ratingBar.getRating() >= ((float) this.threshold)));
    }

    public final void resetCount() {
        saveCount(1);
    }

    @Override // android.app.Dialog
    public void show() {
        if (checkIfSessionMatches(this.session)) {
            super.show();
        }
    }
}
