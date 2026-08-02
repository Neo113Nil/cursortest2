package com.stripe.android.financialconnections.utils;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.insets.SystemBarStateMonitor;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.request.Disposable;
import coil3.request.ImageRequest;
import coil3.size.Scale;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.themes.Dimen$Sp;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.LineHeightReceiver;
import com.squareup.cash.mooncake.themes.widget.MooncakeThemeSpan;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v1.model.TextDecoration;
import com.squareup.protos.cash.discover.api.app.v1.model.TextStyle;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.stripe.android.core.exception.StripeException;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.FlowKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class ErrorsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void applyText(TextView textView, Text text, IntRange intRange) {
        TextThemeInfo textThemeInfo;
        Object strikethroughSpan;
        textView.getClass();
        text.getClass();
        TextStyle textStyle = text.text_style;
        String str = text.text;
        TextDecoration textDecoration = text.text_decoration;
        if (textStyle != null) {
            switch (textStyle) {
                case BIG_MONEY:
                    textThemeInfo = TextStyles.bigMoney;
                    break;
                case HEADER_1:
                    textThemeInfo = TextStyles.header1;
                    break;
                case HEADER_2:
                    textThemeInfo = TextStyles.header2;
                    break;
                case HEADER_3:
                    textThemeInfo = TextStyles.header3;
                    break;
                case HEADER_4:
                    textThemeInfo = TextStyles.header4;
                    break;
                case INPUT:
                    textThemeInfo = TextStyles.input;
                    break;
                case MAIN_TITLE:
                    textThemeInfo = TextStyles.mainTitle;
                    break;
                case MAIN_BODY:
                    textThemeInfo = TextStyles.mainBody;
                    break;
                case SMALL_TITLE:
                    textThemeInfo = TextStyles.smallTitle;
                    break;
                case SMALL_BODY:
                    textThemeInfo = TextStyles.smallBody;
                    break;
                case STRONG_CAPTION:
                    textThemeInfo = TextStyles.strongCaption;
                    break;
                case CAPTION:
                    textThemeInfo = TextStyles.caption;
                    break;
                case IDENTIFIER:
                    textThemeInfo = TextStyles.identifier;
                    break;
                default:
                    a$$ExternalSyntheticBUOutline0.m("Arcade styles are only supported in Compose.");
                    return;
            }
        } else {
            textThemeInfo = null;
        }
        boolean z = (intRange == null && textDecoration == null) ? false : true;
        if (str == null || !z) {
            textView.setText(str);
            if (textThemeInfo != null) {
                Strings.applyStyle(textView, textThemeInfo);
            }
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (intRange != null) {
                Context context = textView.getContext();
                context.getClass();
                spannableStringBuilder.setSpan(new MooncakeThemeSpan(context, textThemeInfo == null ? TextStyles.smallBody : textThemeInfo), intRange.first, intRange.last, 33);
            }
            if (textDecoration != null) {
                int ordinal = textDecoration.ordinal();
                if (ordinal == 0) {
                    strikethroughSpan = new StrikethroughSpan();
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    strikethroughSpan = new UnderlineSpan();
                }
                spannableStringBuilder.setSpan(strikethroughSpan, 0, spannableStringBuilder.length(), 33);
            }
            textView.setText(spannableStringBuilder);
            if (textThemeInfo != null) {
                Dimen$Sp dimen$Sp = textThemeInfo.lineHeight;
                Context context2 = textView.getContext();
                context2.getClass();
                int sp = (int) Views.sp(context2, dimen$Sp.value);
                if (textView instanceof LineHeightReceiver) {
                    ((LineHeightReceiver) textView).setLineHeight(Integer.valueOf(sp));
                } else {
                    PlatformKt.setLineHeight(textView, sp);
                }
            }
        }
        Color color = text.text_color;
        if (color != null) {
            Integer forTheme = ThemablesKt.forTheme(color, ThemeHelpersKt.themeInfo(textView));
            if (forTheme == null) {
                Path$$ExternalSyntheticBUOutline0.m$3(color, "Could not parse Color: ");
                return;
            }
            int intValue = forTheme.intValue();
            textView.setTextColor(intValue);
            textView.setLinkTextColor(intValue);
        }
    }

    public static final void applyText$1(final TextView textView, Text text, IntRange intRange, final RealImageLoader realImageLoader) {
        textView.getClass();
        text.getClass();
        realImageLoader.getClass();
        applyText(textView, text, intRange);
        Image image = text.icon;
        if (image != null) {
            final String urlForTheme = ThemablesKt.urlForTheme(image, ThemeHelpersKt.themeInfo(textView));
            final RecipientQueries$$ExternalSyntheticLambda0 recipientQueries$$ExternalSyntheticLambda0 = new RecipientQueries$$ExternalSyntheticLambda0(textView, 13);
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.squareup.cash.directory_ui.views.ProfileDirectoryUiElementsKt$loadBitmap$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    View view2 = textView;
                    Context context = view2.getContext();
                    context.getClass();
                    ImageRequest.Builder builder = new ImageRequest.Builder(context);
                    builder.data = urlForTheme;
                    builder.size(view2.getHeight(), view2.getHeight());
                    builder.scale = Scale.FIT;
                    builder.listener = new zzr(recipientQueries$$ExternalSyntheticLambda0, 21);
                    Disposable enqueue = RealImageLoader.this.enqueue(builder.build());
                    if (view2.isAttachedToWindow()) {
                        view2.addOnAttachStateChangeListener(new SystemBarStateMonitor.AnonymousClass3(4, view2, enqueue));
                    } else {
                        enqueue.dispose();
                    }
                }
            });
        }
    }

    public static SafeParcelable deserializeFromBytes(byte[] bArr, Parcelable.Creator creator) {
        zzae.checkNotNull(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }

    public static final boolean getShouldRetry(Throwable th) {
        th.getClass();
        StripeException stripeException = th instanceof StripeException ? (StripeException) th : null;
        Integer valueOf = stripeException != null ? Integer.valueOf(stripeException.statusCode) : null;
        return valueOf != null && valueOf.intValue() == 202;
    }

    public static final Object retryOnException(PollTimingOptions pollTimingOptions, Function2 function2, Function1 function1, ContinuationImpl continuationImpl) {
        return FlowKt.first(FlowKt.channelFlow(new NotificationActionService$onHandleIntent$1(pollTimingOptions, function1, function2, (Continuation) null)), continuationImpl);
    }

    public static final void applyText(TextView textView, Text text, IntRange intRange, RealImageLoader realImageLoader) {
        textView.getClass();
        text.getClass();
        realImageLoader.getClass();
        applyText$1(textView, text, intRange, realImageLoader);
    }
}
