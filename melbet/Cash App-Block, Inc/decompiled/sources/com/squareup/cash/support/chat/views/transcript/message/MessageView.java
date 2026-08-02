package com.squareup.cash.support.chat.views.transcript.message;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.common.FileTypes;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes7.dex */
public final class MessageView extends LinearLayout {
    public final String enumerationComma;
    public String idempotenceToken;
    public final MessageBodyLayout messageBodyLayout;
    public String name;
    public final NameView nameView;
    public Function1 onStatusIconClick;
    public final boolean screenReaderEnabled;
    public ChatContentViewModel.EntryViewModel.Sender sender;
    public boolean showTimestamp;
    public FileTypes status;
    public final int statusIconSize;
    public final ComposeView statusIconView;
    public final StatusTimestampView statusTimestampView;
    public String timestampText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageView(Context context, AndroidStringManager androidStringManager, RealImageLoader realImageLoader, RealImageLoader realImageLoader2, SupportActivityItemLoader supportActivityItemLoader) {
        super(context);
        context.getClass();
        androidStringManager.getClass();
        realImageLoader.getClass();
        realImageLoader2.getClass();
        supportActivityItemLoader.getClass();
        String string2 = context.getString(R.string.support_chat_message_content_description_enumeration_comma);
        string2.getClass();
        this.enumerationComma = string2;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService(AccessibilityManager.class);
        int i = 0;
        this.screenReaderEnabled = accessibilityManager != null ? accessibilityManager.isTouchExplorationEnabled() : false;
        MessageBodyLayout messageBodyLayout = new MessageBodyLayout(context, androidStringManager, realImageLoader, realImageLoader2, supportActivityItemLoader);
        this.messageBodyLayout = messageBodyLayout;
        NameView nameView = new NameView(context);
        nameView.setVisibility(8);
        this.nameView = nameView;
        StatusTimestampView statusTimestampView = new StatusTimestampView(context);
        this.statusTimestampView = statusTimestampView;
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setVisibility(8);
        composeView.setContent(new ComposableLambdaImpl(new MessageView$$ExternalSyntheticLambda0(composeView, this, i), true, -2126622529));
        this.statusIconView = composeView;
        this.onStatusIconClick = new ChatSurveyKt$$ExternalSyntheticLambda11(12);
        this.sender = ChatContentViewModel.EntryViewModel.Sender.CUSTOMER;
        int dip = Views.dip((View) this, 48);
        this.statusIconSize = dip;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.addView(messageBodyLayout, new LinearLayout.LayoutParams(-2, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dip, dip);
        layoutParams.gravity = 16;
        linearLayout.addView(composeView, layoutParams);
        setOrientation(1);
        setPadding(Views.dip((View) this, 16), Views.dip((View) this, 8), getPaddingRight(), getPaddingBottom());
        addView(nameView, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, -2, -2);
        addView(statusTimestampView, new LinearLayout.LayoutParams(-2, -2));
        composeView.setTranslationX(-Views.dip((View) this, 4.0f));
        updateLayout();
        updateClickListener();
    }

    public static Integer avatarDrawableRes(ChatContentViewModel.EntryViewModel.Sender sender) {
        int ordinal = sender.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Integer.valueOf(R.drawable.support_chat_message_avatar_advocate);
            }
            if (ordinal == 2) {
                return Integer.valueOf(R.drawable.support_chat_message_avatar_bot);
            }
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return null;
    }

    public final String createContentDescription(ChatContentViewModel.EntryViewModel.ContentDescription contentDescription, String str) {
        return CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str == null ? contentDescription.messageDescription : contentDescription.messagePrefix, str, contentDescription.status}), this.enumerationComma, null, null, 0, null, null, 62);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.messageBodyLayout.setMaxWidth(MathKt__MathJVMKt.roundToInt((View.MeasureSpec.getSize(i) - (Views.dip((View) this, 16) * 2)) * (this.sender == ChatContentViewModel.EntryViewModel.Sender.SYSTEM ? 1.0f : 0.8f)));
        super.onMeasure(i, i2);
    }

    public final void setActionClickListener(Function1<? super BodyViewModel$ActionBodyViewModel.Action, Unit> function1) {
        function1.getClass();
        this.messageBodyLayout.setOnActionClick(function1);
    }

    public final void setActivityTransactionClickListener(Function1<? super FormattedPaymentHistoryActivityItem, Unit> function1) {
        function1.getClass();
        this.messageBodyLayout.setOnActivityTransactionClick(function1);
    }

    public final void setImageClickListener(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.messageBodyLayout.setOnImageClick(function1);
    }

    public final void setImageLoadFailedListener(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.messageBodyLayout.setOnImageLoadFailed(function1);
    }

    public final void setOnStatusIconClickListener(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.onStatusIconClick = function1;
    }

    public final void setRetryImageLoadClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.messageBodyLayout.setOnRetryImageLoadClick(function0);
    }

    public final void setUpdateCashAppClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.messageBodyLayout.setOnUpdateCashAppClick(function0);
    }

    public final void setUrlClickListener(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.messageBodyLayout.setOnUrlClick(function1);
    }

    public final void updateClickListener() {
        boolean z = this.screenReaderEnabled;
        MessageBodyLayout messageBodyLayout = this.messageBodyLayout;
        if (!z && this.sender != ChatContentViewModel.EntryViewModel.Sender.SYSTEM) {
            messageBodyLayout.setOnTextBodyClick(new MessageView$$ExternalSyntheticLambda3(this, 0));
            setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 10));
        } else {
            messageBodyLayout.setOnTextBodyClick(null);
            setOnClickListener(null);
            setClickable(false);
        }
    }

    public final void updateLayout() {
        int i;
        int ordinal = this.sender.ordinal();
        if (ordinal == 0) {
            i = 8388613;
        } else if (ordinal == 1 || ordinal == 2) {
            i = 8388611;
        } else {
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i = 17;
        }
        setGravity(i);
        int dip = Views.dip((View) this, 16);
        ComposeView composeView = this.statusIconView;
        setPaddingRelative(dip, getPaddingTop(), composeView.getVisibility() == 0 ? 0 : Views.dip((View) this, 16), getPaddingBottom());
        Views.updateMargins$default(this.statusTimestampView, 0, 0, composeView.getVisibility() == 0 ? this.statusIconSize : 0, 0, 11);
    }
}
