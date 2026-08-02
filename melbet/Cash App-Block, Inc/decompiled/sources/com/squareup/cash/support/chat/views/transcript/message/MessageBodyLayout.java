package com.squareup.cash.support.chat.views.transcript.message;

import android.content.Context;
import android.util.Patterns;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.google.android.material.chip.Chip;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.dialog.ComposeDialogKt$Modal$3$1$1$dialog$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$FileBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TransactionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TypingIndicatorBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import com.squareup.cash.support.chat.views.transcript.FileAttachmentView;
import com.squareup.cash.support.chat.views.transcript.message.ImagePlaceholderView;
import com.squareup.util.android.Views;
import com.squareup.util.android.Views$SCALE$1;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.Regex;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class MessageBodyLayout extends FrameLayout {
    public BodyViewModel$ActionBodyViewModel action;
    public ActionBodyView actionBodyView;
    public final ParcelableSnapshotMutableState activityBodyViewModel$delegate;
    public final SupportActivityItemLoader activityItemLoader;
    public final RealImageLoader authenticatedImageLoader;
    public BodyViewModel$FileBodyViewModel file;
    public FileAttachmentView fileView;
    public final RealImageLoader imageLoader;
    public ImagePlaceholderView imagePlaceholderView;
    public String imageUrl;
    public AppCompatImageView imageView;
    public boolean isUnknownMessage;
    public int maxWidth;
    public final ParcelableSnapshotMutableState messageBody$delegate;
    public Function1 onActionClick;
    public Function1 onActivityTransactionClick;
    public Function1 onImageClick;
    public Function1 onImageLoadFailed;
    public Function0 onRetryImageLoadClick;
    public Function0 onTextBodyClick;
    public Function0 onUpdateCashAppClick;
    public Function1 onUrlClick;
    public final ParcelableSnapshotMutableState sender$delegate;
    public final AndroidStringManager stringManager;
    public String text;
    public final ParcelableSnapshotMutableState textContent$delegate;
    public boolean textHasLinks;
    public final ComposeView textView;
    public BodyViewModel$TransactionBodyViewModel transaction;
    public ComposeDialogKt$Modal$3$1$1$dialog$1 transactionBodyView;
    public BodyViewModel$TypingIndicatorBodyViewModel typingIndicator;
    public TypingIndicatorBodyView typingIndicatorBodyView;
    public ComposeView unifiedTransactionBodyView;
    public UnknownMessageBodyView unknownMessageBodyView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBodyLayout(Context context, AndroidStringManager androidStringManager, RealImageLoader realImageLoader, RealImageLoader realImageLoader2, SupportActivityItemLoader supportActivityItemLoader) {
        super(context);
        context.getClass();
        androidStringManager.getClass();
        realImageLoader.getClass();
        realImageLoader2.getClass();
        supportActivityItemLoader.getClass();
        this.stringManager = androidStringManager;
        this.imageLoader = realImageLoader;
        this.authenticatedImageLoader = realImageLoader2;
        this.activityItemLoader = supportActivityItemLoader;
        this.onUpdateCashAppClick = new SheetKt$$ExternalSyntheticLambda9(18);
        this.onUrlClick = new ChatSurveyKt$$ExternalSyntheticLambda11(5);
        this.onActionClick = new ChatSurveyKt$$ExternalSyntheticLambda11(6);
        this.onImageClick = new ChatSurveyKt$$ExternalSyntheticLambda11(7);
        this.onImageLoadFailed = new ChatSurveyKt$$ExternalSyntheticLambda11(8);
        this.onRetryImageLoadClick = new SheetKt$$ExternalSyntheticLambda9(19);
        this.onActivityTransactionClick = new ChatSurveyKt$$ExternalSyntheticLambda11(9);
        this.textContent$delegate = Updater.mutableStateOf$default(null);
        this.sender$delegate = Updater.mutableStateOf$default(ChatContentViewModel.EntryViewModel.Sender.CUSTOMER);
        this.messageBody$delegate = Updater.mutableStateOf$default(null);
        this.activityBodyViewModel$delegate = Updater.mutableStateOf$default(null);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new MessageBodyLayout$$ExternalSyntheticLambda8(this, 0), true, 232339777));
        this.textView = composeView;
        addView(composeView, new FrameLayout.LayoutParams(-2, -2));
        setClipToOutline(true);
        setOutlineProvider(new Chip.AnonymousClass2(this, 3));
    }

    public final void createImageBodyViews() {
        if (this.imageView == null || this.imagePlaceholderView == null) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setAdjustViewBounds(true);
            Views$SCALE$1 views$SCALE$1 = Views.SCALE;
            appCompatImageView.setContentDescription(appCompatImageView.getContext().getResources().getString(R.string.support_chat_content_description_image));
            appCompatImageView.setVisibility(8);
            this.imageView = appCompatImageView;
            addView(appCompatImageView, new FrameLayout.LayoutParams(-2, -2));
            Context context = getContext();
            context.getClass();
            ImagePlaceholderView imagePlaceholderView = new ImagePlaceholderView(context, new MessageBodyLayout$$ExternalSyntheticLambda0(this, 0));
            imagePlaceholderView.setVisibility(8);
            this.imagePlaceholderView = imagePlaceholderView;
            addView(imagePlaceholderView, new FrameLayout.LayoutParams(-2, -2));
            AppCompatImageView appCompatImageView2 = this.imageView;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setMaxHeight(this.maxWidth);
            }
        }
    }

    public final void loadImage(AppCompatImageView appCompatImageView, ImagePlaceholderView imagePlaceholderView, String str) {
        if (appCompatImageView == null || imagePlaceholderView == null) {
            return;
        }
        imagePlaceholderView.state.setValue(ImagePlaceholderView.State.LOADING);
        appCompatImageView.setVisibility(8);
        imagePlaceholderView.setVisibility(str != null ? 0 : 8);
        if (str == null) {
            appCompatImageView.setImageDrawable(null);
            appCompatImageView.setOnClickListener(null);
            appCompatImageView.setClickable(false);
            return;
        }
        Context context = getContext();
        context.getClass();
        int roundToInt = MathKt__MathJVMKt.roundToInt((r1 - (Views.dip(context, 16) * 2)) - (context.getResources().getDisplayMetrics().widthPixels * 0.2f));
        Context context2 = getContext();
        context2.getClass();
        ImageRequest.Builder builder = new ImageRequest.Builder(context2);
        builder.data = str;
        builder.size(roundToInt, roundToInt);
        ImageRequests_androidKt.target(builder, appCompatImageView);
        builder.listener = new AssetPublicSuffixList(imagePlaceholderView, appCompatImageView, this, appCompatImageView, imagePlaceholderView, str);
        this.authenticatedImageLoader.enqueue(builder.build());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        loadImage(this.imageView, this.imagePlaceholderView, this.imageUrl);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.maxWidth, PKIFailureInfo.systemUnavail), i2);
    }

    public final void setMaxWidth(int i) {
        if (this.maxWidth != i) {
            this.maxWidth = i;
            AppCompatImageView appCompatImageView = this.imageView;
            if (appCompatImageView != null) {
                appCompatImageView.setMaxHeight(i);
            }
        }
    }

    public final void setOnActionClick(Function1<? super BodyViewModel$ActionBodyViewModel.Action, Unit> function1) {
        function1.getClass();
        this.onActionClick = function1;
    }

    public final void setOnActivityTransactionClick(Function1<? super FormattedPaymentHistoryActivityItem, Unit> function1) {
        function1.getClass();
        this.onActivityTransactionClick = function1;
    }

    public final void setOnImageClick(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.onImageClick = function1;
    }

    public final void setOnImageLoadFailed(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.onImageLoadFailed = function1;
    }

    public final void setOnRetryImageLoadClick(Function0<Unit> function0) {
        function0.getClass();
        this.onRetryImageLoadClick = function0;
    }

    public final void setOnTextBodyClick(Function0<Unit> function0) {
        this.onTextBodyClick = function0;
    }

    public final void setOnUpdateCashAppClick(Function0<Unit> function0) {
        function0.getClass();
        this.onUpdateCashAppClick = function0;
    }

    public final void setOnUrlClick(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.onUrlClick = function1;
    }

    public final void setText(String str) {
        boolean z;
        if (Intrinsics.areEqual(this.text, str)) {
            return;
        }
        this.text = str;
        this.textContent$delegate.setValue(str);
        if (str != null) {
            Pattern pattern = Patterns.WEB_URL;
            pattern.getClass();
            z = new Regex(pattern).containsMatchIn(str);
        } else {
            z = false;
        }
        this.textHasLinks = z;
        this.textView.setVisibility((str == null || str.length() <= 0) ? 8 : 0);
    }
}
