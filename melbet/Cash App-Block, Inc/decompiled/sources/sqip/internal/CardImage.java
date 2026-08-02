package sqip.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.Card$Brand;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import sqip.internal.contracts.CardImageContract;
import sqip.internal.presenters.CardImagePresenter;

@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b$*\u0001\f\b\u0000\u0018\u0000 \u0093\u00012\u00020\u00012\u00020\u0002:\u0002\u0093\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0012H\u0016J\u0018\u0010N\u001a\u00020L2\u0006\u0010O\u001a\u00020,2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020LH\u0002J\b\u0010S\u001a\u00020LH\u0002J\b\u0010T\u001a\u00020LH\u0002J\u0010\u0010U\u001a\u00020L2\u0006\u0010V\u001a\u00020DH\u0002J \u0010W\u001a\u00020L2\u0006\u0010V\u001a\u00020D2\u0006\u0010X\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u0015H\u0002J\u0010\u0010Z\u001a\u00020L2\u0006\u0010V\u001a\u00020DH\u0002J\u0010\u0010[\u001a\u00020L2\u0006\u0010V\u001a\u00020DH\u0002J6\u0010\\\u001a\u00020L2\u0006\u0010V\u001a\u00020D2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010^\u001a\u00020\u00152\u0006\u0010_\u001a\u00020\u00152\u0006\u0010`\u001a\u00020\nH\u0002J\u0010\u0010a\u001a\u00020L2\u0006\u0010V\u001a\u00020DH\u0002J\u0010\u0010b\u001a\u00020L2\u0006\u0010V\u001a\u00020DH\u0002J.\u0010c\u001a\u00020L2\u0006\u0010V\u001a\u00020D2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010e\u001a\u00020\u001dH\u0002J&\u0010f\u001a\u00020L2\u0006\u0010V\u001a\u00020D2\u0006\u0010Y\u001a\u00020\u00152\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00150\tH\u0002J\u0010\u0010g\u001a\u00020L2\u0006\u0010V\u001a\u00020DH\u0002J\u0010\u0010h\u001a\u00020L2\u0006\u0010V\u001a\u00020DH\u0002J\b\u0010i\u001a\u00020LH\u0016J\b\u0010j\u001a\u00020LH\u0016J\b\u0010k\u001a\u00020LH\u0002J\u0010\u0010l\u001a\u00020L2\u0006\u0010:\u001a\u00020,H\u0002J\b\u0010m\u001a\u00020LH\u0016J\b\u0010n\u001a\u00020LH\u0016J\b\u0010o\u001a\u00020pH\u0002J\u0010\u0010q\u001a\u00020p2\u0006\u0010r\u001a\u00020\u000fH\u0002J\b\u0010s\u001a\u00020\u0015H\u0002J\b\u0010t\u001a\u00020LH\u0016J\b\u0010u\u001a\u00020,H\u0002J\b\u0010v\u001a\u00020,H\u0002J\b\u0010w\u001a\u00020,H\u0002J\b\u0010x\u001a\u00020,H\u0002J\u0010\u0010y\u001a\u00020L2\u0006\u0010V\u001a\u00020DH\u0014J(\u0010z\u001a\u00020L2\u0006\u0010{\u001a\u00020\n2\u0006\u0010|\u001a\u00020\n2\u0006\u0010}\u001a\u00020\n2\u0006\u0010~\u001a\u00020\nH\u0014J\u0011\u0010\u007f\u001a\u00020L2\u0007\u0010\u0080\u0001\u001a\u00020,H\u0002J\u0012\u0010\u0081\u0001\u001a\u00020L2\u0007\u0010\u0082\u0001\u001a\u00020\u000fH\u0002J\u0012\u0010\u0083\u0001\u001a\u00020L2\u0007\u0010\u0084\u0001\u001a\u00020\u0012H\u0016J\u0012\u0010\u0085\u0001\u001a\u00020L2\u0007\u0010\u0086\u0001\u001a\u00020\u0018H\u0016J\t\u0010\u0087\u0001\u001a\u00020LH\u0016J\u0012\u0010\u0088\u0001\u001a\u00020L2\u0007\u0010\u0089\u0001\u001a\u00020\u000fH\u0002J\u0012\u0010\u008a\u0001\u001a\u00020L2\u0007\u0010\u008b\u0001\u001a\u00020\nH\u0016J\u0012\u0010\u008c\u0001\u001a\u00020L2\u0007\u0010\u008b\u0001\u001a\u00020\nH\u0016J\u0012\u0010\u008d\u0001\u001a\u00020L2\u0007\u0010\u008b\u0001\u001a\u00020\nH\u0016J\u001b\u0010\u008e\u0001\u001a\u00020\n2\u0007\u0010\u008f\u0001\u001a\u00020\u00152\u0007\u0010\u0090\u0001\u001a\u00020\nH\u0002J\u0012\u0010\u0091\u0001\u001a\u00020L2\u0007\u0010\u0084\u0001\u001a\u00020\u0012H\u0016J\r\u0010\u0092\u0001\u001a\u00020\u0015*\u00020\u0015H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00106\u001a\u00020,X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u000e\u0010:\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020AX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0094\u0001"}, d2 = {"Lsqip/internal/CardImage;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lsqip/internal/contracts/CardImageContract$View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "amexCardNumberDotGroup", "", "", "animationReplayListenerAdapter", "sqip/internal/CardImage$animationReplayListenerAdapter$1", "Lsqip/internal/CardImage$animationReplayListenerAdapter$1;", "bigCardAsset", "Lsqip/internal/CardAsset;", "brandToBigDrawables", "", "Lcom/squareup/Card$Brand;", "brandToSmallDrawables", "cardBrandAnimationFraction", "", "cardHeight", "cardImagePresenter", "Lsqip/internal/presenters/CardImagePresenter;", "cardNumberAnimationFraction", "cardNumberDotGroup", "cardWidth", "clearPaint", "Landroid/graphics/Paint;", "cvvDotPaint", "cvvFocusAnimationFraction", "cvvFocusPaint", "cvvFocusShadowPaint", "cvvFocusedDotPaint", "cvvFrontDotPaint", "dateDigitOffsetTemplate", "dateDotOffsetsTemplate", "dateDotPaint", "dateFocusedDotPaint", "dinerCardNumberDotGroup", "dotAnimationFraction", "errorResId", "flipInProgress", "", "flipOut", "Landroid/animation/Animator;", "flipOutInProgress", "flipSetWithShadowFade", "Landroid/animation/AnimatorSet;", "flipSetWithoutShadow", "focusedCvvDigit", "focusedExpDigit", "focusedPanDigit", "isBigCard", "()Z", "setBigCard", "(Z)V", "isFront", "lastFourAnimationFraction", "panDigitPaint", "panFocusedDigitPaint", "path", "Landroid/graphics/Path;", "previousCardBitmap", "Landroid/graphics/Bitmap;", "previousCardMaskedBitmap", "previousCardMaskedCanvas", "Landroid/graphics/Canvas;", "rect", "Landroid/graphics/Rect;", "scaleRatio", "smallCardAsset", "smallCardHeight", "smallCardWidth", "animateCardTransition", "", "oldBrand", "animateCvv", "show", "startDelay", "", "animateFocusedDot", "animateLargeCardNumberDots", "createPreviousCardEmptyBitmaps", "drawAmex", "canvas", "drawAmexCvv", "firstCvvDotCenterX", "cvvCenterY", "drawCard", "drawCardBack", "drawCardDotsAndNumbers", "numberDotGroup", "firstDotOffset", "blockSpacing", "startShowingDigitsPos", "drawCardFront", "drawCardTransition", "drawCvvDots", "cvvDotList", "paint", "drawCvvFocusBubble", "drawDiner", "drawExpirationDateDots", "fadeCvvBubbleIn", "fadeCvvBubbleOut", "fadeToError", "flipCardDrawable", "flipToBack", "flipToFront", "getCurrentDrawable", "Landroid/graphics/drawable/Drawable;", "getDrawableWith", "asset", "getExpirationDotCenterX", "init", "isAmex", "isCurrentBrandUnknown", "isDiners", "isExpDateInputFinished", "onDraw", "onSizeChanged", "w", "h", "oldw", "oldh", "setBig", "big", "setCrossFadeDrawable", "oldSmallAssets", "setNewCardAssetsWith", "brand", "setPresenter", "presenter", "showLastFewDigits", "startCurtainAnimation", "oldBigAssets", "switchCvvDigitFocusedTo", "position", "switchExpDotFocusedTo", "switchPanDigitFocusedTo", "updateAlpha", "alphaFraction", "targetColor", "updatePaintFor", "toPixels", "Companion", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardImage extends AppCompatImageView implements CardImageContract.View {
    private static final float AMEX_CVV_LEFT = 150.0f;
    private static final float AMEX_CVV_TOP = 45.0f;
    private static final float AMEX_FIRST_DOT_OFFSET = 0.0f;
    private static final int ANTI_ALIASING_PADDING_PX = 8;
    private static final float CAMERA_DISTANCE_MULTIPLIER = 32.0f;
    private static final long CARD_CVV_DURATION_MS = 500;
    private static final long CARD_DIGIT_DURATION_MS = 500;
    private static final float CARD_RATIO = 0.627451f;
    private static final float CARD_TEMPLATE_HEIGHT = 128.0f;
    private static final float CARD_TEMPLATE_WIDTH = 204.0f;
    private static final float CLIP_WIDTH_TEMPLATE = 32.0f;
    private static final long CURTAIN_ANIMATION_DURATION = 200;
    private static final float CVV_DOT_RADIUS = 2.0f;
    private static final float CVV_DOT_SPACING = 6.0f;
    private static final float CVV_FIRST_DOT_CENTER_X = 128.0f;
    private static final float CVV_FOCUS_DOT_RADIUS = 3.0f;
    private static final float CVV_FOCUS_RADIUS = 25.0f;
    private static final float CVV_FOCUS_SHADOW_Y = 2.0f;
    private static final float DATE_DIGIT_Y_OFFSET = 2.8f;
    private static final float DATE_DOT_RADIUS = 1.5f;
    private static final float DATE_DOT_TEXT_SIZE = 10.0f;
    private static final float DATE_FIRST_DOT_CENTER_X = 29.5f;
    private static final float DATE_FIRST_DOT_CENTER_Y = 102.5f;
    private static final int DEFAULT_DOT_INDEX = -1;
    private static final long DOT_FOCUS_ANIMATION_DURATION_MS = 180;
    public static final String ELEVATION = "elevation";
    public static final float ELEVATION_DP = 12.0f;
    private static final int FADE_DURATION_MS = 200;
    private static final long FLIP_DURATION_MS = 150;
    private static final int INDEX_TO_SHOW_DIGITS_FOR_AMEX = 9;
    private static final int INDEX_TO_SHOW_DIGITS_FOR_DINER = 9;
    private static final int INDEX_TO_SHOW_DIGITS_FOR_OTHER = 11;
    private static final float PAN_BLOCK_SPACING = 8.0f;
    private static final float PAN_DIGIT_CENTER_Y = 69.0f;
    private static final float PAN_DIGIT_FIRST_CENTER_X = 30.0f;
    private static final float PAN_DIGIT_RADIUS = 2.0f;
    private static final float PAN_DIGIT_SPACING = 8.0f;
    private static final float PAN_FOCUSED_DIGIT_RADIUS = 3.0f;
    private static final float PAN_FONT_SIZE = 14.0f;
    private static final String ROTATION_AXIS = "rotationY";
    public static final float SHADOW_CORNER_RADIUS_DP = 12.0f;
    private static final long SHADOW_FADE_DURATION_MS = 100;
    public static final int SHADOW_OUTLINE_MARGIN = 16;
    public static final int SHADOW_OUTLINE_TOP_OFFSET = 100;
    private static final float SIG_HEIGHT = 22.0f;
    private static final float SIG_TOP = 56.0f;
    private static final float SPECIAL_PAN_BLOCK_SPACING = 16.0f;
    private final List<Integer> amexCardNumberDotGroup;
    private final CardImage$animationReplayListenerAdapter$1 animationReplayListenerAdapter;
    private CardAsset bigCardAsset;
    private final Map<Card$Brand, CardAsset> brandToBigDrawables;
    private final Map<Card$Brand, CardAsset> brandToSmallDrawables;
    private float cardBrandAnimationFraction;
    private float cardHeight;
    private CardImagePresenter cardImagePresenter;
    private float cardNumberAnimationFraction;
    private final List<Integer> cardNumberDotGroup;
    private float cardWidth;
    private final Paint clearPaint;
    private final Paint cvvDotPaint;
    private float cvvFocusAnimationFraction;
    private final Paint cvvFocusPaint;
    private final Paint cvvFocusShadowPaint;
    private final Paint cvvFocusedDotPaint;
    private final Paint cvvFrontDotPaint;
    private final List<Float> dateDigitOffsetTemplate;
    private final List<Float> dateDotOffsetsTemplate;
    private final Paint dateDotPaint;
    private final Paint dateFocusedDotPaint;
    private final List<Integer> dinerCardNumberDotGroup;
    private float dotAnimationFraction;
    private final int errorResId;
    private boolean flipInProgress;
    private final Animator flipOut;
    private boolean flipOutInProgress;
    private final AnimatorSet flipSetWithShadowFade;
    private final AnimatorSet flipSetWithoutShadow;
    private int focusedCvvDigit;
    private int focusedExpDigit;
    private int focusedPanDigit;
    private boolean isBigCard;
    private boolean isFront;
    private float lastFourAnimationFraction;
    private final Paint panDigitPaint;
    private final Paint panFocusedDigitPaint;
    private final Path path;
    private Bitmap previousCardBitmap;
    private Bitmap previousCardMaskedBitmap;
    private Canvas previousCardMaskedCanvas;
    private final Rect rect;
    private float scaleRatio;
    private CardAsset smallCardAsset;
    private final int smallCardHeight;
    private final int smallCardWidth;
    private static final CardAsset defaultSmallCard = new CardAsset(sqip.cardentry.R.drawable.sqip_small_unknown_card_front, sqip.cardentry.R.drawable.sqip_small_unknown_card_back);
    private static final CardAsset defaultBigCard = new CardAsset(sqip.cardentry.R.drawable.sqip_big_unknown_card_front, sqip.cardentry.R.drawable.sqip_big_unknown_card_back);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Card$Brand.values().length];
            try {
                iArr[11] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[12] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v36, types: [android.animation.Animator$AnimatorListener, sqip.internal.CardImage$animationReplayListenerAdapter$1] */
    public CardImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        CardAsset cardAsset = new CardAsset(sqip.cardentry.R.drawable.sqip_small_visa_front, sqip.cardentry.R.drawable.sqip_small_visa_back);
        Card$Brand.AnonymousClass1 anonymousClass1 = Card$Brand.VISA;
        Pair pair = new Pair(anonymousClass1, cardAsset);
        CardAsset cardAsset2 = new CardAsset(sqip.cardentry.R.drawable.sqip_small_master_card_front, sqip.cardentry.R.drawable.sqip_small_master_card_back);
        Card$Brand card$Brand = Card$Brand.MASTER_CARD;
        Pair pair2 = new Pair(card$Brand, cardAsset2);
        CardAsset cardAsset3 = new CardAsset(sqip.cardentry.R.drawable.sqip_small_unknown_card_front, sqip.cardentry.R.drawable.sqip_small_unknown_card_back);
        Card$Brand card$Brand2 = Card$Brand.UNKNOWN;
        Pair pair3 = new Pair(card$Brand2, cardAsset3);
        CardAsset cardAsset4 = new CardAsset(sqip.cardentry.R.drawable.sqip_small_amex_front, sqip.cardentry.R.drawable.sqip_small_amex_back);
        Card$Brand.AnonymousClass2 anonymousClass2 = Card$Brand.AMERICAN_EXPRESS;
        Pair pair4 = new Pair(anonymousClass2, cardAsset4);
        CardAsset cardAsset5 = new CardAsset(sqip.cardentry.R.drawable.sqip_small_discover_front, sqip.cardentry.R.drawable.sqip_small_white_card_back);
        Card$Brand card$Brand3 = Card$Brand.DISCOVER;
        Pair pair5 = new Pair(card$Brand3, cardAsset5);
        CardAsset cardAsset6 = new CardAsset(sqip.cardentry.R.drawable.sqip_small_diners_front, sqip.cardentry.R.drawable.sqip_small_diners_back);
        Card$Brand card$Brand4 = Card$Brand.DISCOVER_DINERS;
        Pair pair6 = new Pair(card$Brand4, cardAsset6);
        CardAsset cardAsset7 = new CardAsset(sqip.cardentry.R.drawable.sqip_small_jcb_front, sqip.cardentry.R.drawable.sqip_small_white_card_back);
        Card$Brand card$Brand5 = Card$Brand.JCB;
        Pair pair7 = new Pair(card$Brand5, cardAsset7);
        int i = sqip.cardentry.R.drawable.sqip_small_gift_card;
        Pair pair8 = new Pair(Card$Brand.SQUARE_GIFT_CARD_V2, new CardAsset(i, i));
        CardAsset cardAsset8 = new CardAsset(sqip.cardentry.R.drawable.sqip_small_union_front, sqip.cardentry.R.drawable.sqip_small_white_card_back);
        Card$Brand.AnonymousClass4 anonymousClass4 = Card$Brand.UNION_PAY;
        this.brandToSmallDrawables = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair(anonymousClass4, cardAsset8));
        this.brandToBigDrawables = MapsKt__MapsKt.mapOf(new Pair(anonymousClass1, new CardAsset(sqip.cardentry.R.drawable.sqip_big_visa_front, sqip.cardentry.R.drawable.sqip_big_visa_back)), new Pair(card$Brand, new CardAsset(sqip.cardentry.R.drawable.sqip_big_mastercard_front, sqip.cardentry.R.drawable.sqip_big_mastercard_back)), new Pair(card$Brand2, new CardAsset(sqip.cardentry.R.drawable.sqip_big_unknown_card_front, sqip.cardentry.R.drawable.sqip_big_unknown_card_back)), new Pair(anonymousClass2, new CardAsset(sqip.cardentry.R.drawable.sqip_big_amex_front, sqip.cardentry.R.drawable.sqip_big_amex_back)), new Pair(card$Brand3, new CardAsset(sqip.cardentry.R.drawable.sqip_big_discover_front, sqip.cardentry.R.drawable.sqip_big_discover_back)), new Pair(card$Brand4, new CardAsset(sqip.cardentry.R.drawable.sqip_big_diners_front, sqip.cardentry.R.drawable.sqip_big_diners_back)), new Pair(card$Brand5, new CardAsset(sqip.cardentry.R.drawable.sqip_big_jcb_front, sqip.cardentry.R.drawable.sqip_big_white_card_back)), new Pair(anonymousClass4, new CardAsset(sqip.cardentry.R.drawable.sqip_big_union_front, sqip.cardentry.R.drawable.sqip_big_white_card_back)));
        this.errorResId = sqip.cardentry.R.drawable.sqip_small_error_front;
        this.isFront = true;
        this.isBigCard = true;
        this.dateDotOffsetsTemplate = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.0f), Float.valueOf(CVV_DOT_SPACING), Float.valueOf(SPECIAL_PAN_BLOCK_SPACING), Float.valueOf(SIG_HEIGHT)});
        this.dateDigitOffsetTemplate = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(3.0f), Float.valueOf(9.0f), Float.valueOf(PAN_FONT_SIZE), Float.valueOf(19.0f), Float.valueOf(CVV_FOCUS_RADIUS)});
        this.amexCardNumberDotGroup = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{4, 6, 5});
        this.dinerCardNumberDotGroup = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{4, 6, 4});
        this.cardNumberDotGroup = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{4, 4, 4, 4});
        this.rect = new Rect();
        this.path = new Path();
        Paint paint = new Paint(1);
        paint.setColor(getContext().getColor(R.color.sqip_cvv_dot_paint));
        this.cvvDotPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(getContext().getColor(R.color.sqip_cvv_front_dot_paint));
        this.cvvFrontDotPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(getContext().getColor(R.color.sqip_cvv_focus_dot_paint));
        this.cvvFocusedDotPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(getContext().getColor(R.color.sqip_cvv_focus_paint));
        this.cvvFocusPaint = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(getContext().getColor(R.color.sqip_cvv_focus_shadow_paint));
        this.cvvFocusShadowPaint = paint5;
        this.panDigitPaint = new Paint(1);
        Paint paint6 = new Paint(1);
        Paint.Align align = Paint.Align.CENTER;
        paint6.setTextAlign(align);
        paint6.setTextSize(PAN_FONT_SIZE);
        this.panFocusedDigitPaint = paint6;
        Paint paint7 = new Paint(1);
        paint7.setTextAlign(align);
        paint7.setTextSize(DATE_DOT_TEXT_SIZE);
        this.dateDotPaint = paint7;
        Paint paint8 = new Paint(1);
        paint8.setTextAlign(align);
        paint8.setTextSize(DATE_DOT_TEXT_SIZE);
        this.dateFocusedDotPaint = paint8;
        Paint paint9 = new Paint(1);
        paint9.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint9.setStyle(Paint.Style.FILL);
        this.clearPaint = paint9;
        this.cardBrandAnimationFraction = 1.0f;
        this.cardNumberAnimationFraction = 0.5f;
        this.dotAnimationFraction = 0.5f;
        this.focusedCvvDigit = -1;
        this.focusedExpDigit = -1;
        this.smallCardAsset = new CardAsset(sqip.cardentry.R.drawable.sqip_small_unknown_card_front, sqip.cardentry.R.drawable.sqip_small_unknown_card_back);
        this.bigCardAsset = new CardAsset(sqip.cardentry.R.drawable.sqip_big_unknown_card_front, sqip.cardentry.R.drawable.sqip_big_unknown_card_back);
        ?? r4 = new AnimatorListenerAdapter() { // from class: sqip.internal.CardImage$animationReplayListenerAdapter$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                boolean z;
                CardImagePresenter cardImagePresenter;
                CardImagePresenter cardImagePresenter2;
                animation.getClass();
                CardImage.this.flipInProgress = false;
                z = CardImage.this.isFront;
                cardImagePresenter = CardImage.this.cardImagePresenter;
                if (cardImagePresenter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
                    throw null;
                }
                if (z != cardImagePresenter.getShouldShowFront()) {
                    CardImage cardImage = CardImage.this;
                    cardImagePresenter2 = cardImage.cardImagePresenter;
                    if (cardImagePresenter2 != null) {
                        cardImage.flipCardDrawable(cardImagePresenter2.getShouldShowFront());
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
                        throw null;
                    }
                }
            }
        };
        this.animationReplayListenerAdapter = r4;
        setOutlineProvider(new ViewOutlineProvider() { // from class: sqip.internal.CardImage.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                view.getClass();
                outline.getClass();
                if (CardImage.this.getIsBigCard()) {
                    outline.setRoundRect(16, 100, view.getWidth() - 16, view.getHeight(), CardImage.this.toPixels(12.0f));
                } else {
                    outline.setEmpty();
                }
            }
        });
        setElevation(toPixels(12.0f));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ELEVATION, toPixels(12.0f), 0.0f);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setDuration(SHADOW_FADE_DURATION_MS);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, ELEVATION, 0.0f, toPixels(12.0f));
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ofFloat2.setDuration(SHADOW_FADE_DURATION_MS);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, ROTATION_AXIS, 90.0f, 0.0f);
        ofFloat3.setInterpolator(new DecelerateInterpolator());
        ofFloat3.setDuration(FLIP_DURATION_MS);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, ROTATION_AXIS, 0.0f, -90.0f);
        ofFloat4.setInterpolator(new AccelerateInterpolator());
        ofFloat4.setDuration(FLIP_DURATION_MS);
        this.flipOut = ofFloat4;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat4, ofFloat3, ofFloat2);
        animatorSet.addListener(r4);
        this.flipSetWithShadowFade = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(ofFloat4, ofFloat3);
        animatorSet2.addListener(r4);
        this.flipSetWithoutShadow = animatorSet2;
        this.smallCardWidth = getResources().getDimensionPixelSize(sqip.cardentry.R.dimen.sqip_small_card_width);
        this.smallCardHeight = getResources().getDimensionPixelSize(sqip.cardentry.R.dimen.sqip_small_card_height);
    }

    private final void animateCvv(boolean show, long startDelay) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new CardImage$$ExternalSyntheticLambda0(this, 4));
        ofFloat.setDuration(500L);
        ofFloat.setStartDelay(startDelay);
        if (show) {
            ofFloat.start();
        } else {
            ofFloat.reverse();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateCvv$lambda$29$lambda$28(CardImage cardImage, ValueAnimator valueAnimator) {
        cardImage.cvvFocusAnimationFraction = ((Float) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).floatValue();
        cardImage.invalidate();
    }

    private final void animateFocusedDot() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        ofFloat.addUpdateListener(new CardImage$$ExternalSyntheticLambda0(this, 1));
        ofFloat.setDuration(DOT_FOCUS_ANIMATION_DURATION_MS);
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateFocusedDot$lambda$27$lambda$26(CardImage cardImage, ValueAnimator valueAnimator) {
        cardImage.dotAnimationFraction = ((Float) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).floatValue();
        cardImage.invalidate();
    }

    private final void animateLargeCardNumberDots() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        ofFloat.addUpdateListener(new CardImage$$ExternalSyntheticLambda0(this, 0));
        ofFloat.setDuration(DOT_FOCUS_ANIMATION_DURATION_MS);
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLargeCardNumberDots$lambda$25$lambda$24(CardImage cardImage, ValueAnimator valueAnimator) {
        cardImage.cardNumberAnimationFraction = ((Float) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).floatValue();
        cardImage.invalidate();
    }

    private final void createPreviousCardEmptyBitmaps() {
        Bitmap bitmap = this.previousCardBitmap;
        if (bitmap != null) {
            if (bitmap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previousCardBitmap");
                throw null;
            }
            bitmap.recycle();
            Bitmap bitmap2 = this.previousCardMaskedBitmap;
            if (bitmap2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previousCardMaskedBitmap");
                throw null;
            }
            bitmap2.recycle();
        }
        int i = ((int) this.cardWidth) + 8;
        int i2 = ((int) this.cardHeight) + 8;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        createBitmap.getClass();
        this.previousCardBitmap = createBitmap;
        Bitmap createBitmap2 = Bitmap.createBitmap(((int) this.cardWidth) + 8, ((int) this.cardHeight) + 8, config);
        createBitmap2.getClass();
        this.previousCardMaskedBitmap = createBitmap2;
        Bitmap bitmap3 = this.previousCardMaskedBitmap;
        if (bitmap3 != null) {
            this.previousCardMaskedCanvas = new Canvas(bitmap3);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("previousCardMaskedBitmap");
            throw null;
        }
    }

    private final void drawAmex(Canvas canvas) {
        drawCardDotsAndNumbers(canvas, this.amexCardNumberDotGroup, 0.0f, SPECIAL_PAN_BLOCK_SPACING, 9);
        drawExpirationDateDots(canvas);
        float f = this.scaleRatio;
        drawAmexCvv(canvas, AMEX_CVV_LEFT * f, f * AMEX_CVV_TOP);
    }

    private final void drawAmexCvv(Canvas canvas, float firstCvvDotCenterX, float cvvCenterY) {
        float f = this.scaleRatio * 8.0f;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            arrayList.add(Float.valueOf((i * f) + firstCvvDotCenterX));
        }
        int size = (arrayList.size() / 2) - 1;
        float f2 = this.cvvFocusAnimationFraction;
        if (f2 <= 0.0f) {
            drawCvvDots(canvas, arrayList, cvvCenterY, this.cvvFrontDotPaint);
            return;
        }
        float f3 = f2 * CVV_FOCUS_RADIUS * this.scaleRatio;
        float floatValue = arrayList.get(size).floatValue() + (f / 2.0f);
        canvas.drawCircle(floatValue, (this.scaleRatio * 2.0f) + cvvCenterY, f3, this.cvvFocusShadowPaint);
        canvas.drawCircle(floatValue, cvvCenterY, f3, this.cvvFocusPaint);
        int color = this.cvvDotPaint.getColor();
        this.cvvDotPaint.setColor(updateAlpha(this.cvvFocusAnimationFraction, color));
        drawCvvDots(canvas, arrayList, cvvCenterY, this.cvvDotPaint);
        this.cvvDotPaint.setColor(color);
    }

    private final void drawCard(Canvas canvas) {
        if (isAmex()) {
            drawAmex(canvas);
        } else if (isDiners() && this.isFront) {
            drawDiner(canvas);
        } else if (this.isFront) {
            drawCardFront(canvas);
        } else {
            drawCardBack(canvas);
        }
        if (this.cardBrandAnimationFraction < 1.0f) {
            drawCardTransition(canvas);
        }
    }

    private final void drawCardBack(Canvas canvas) {
        float f = this.scaleRatio;
        float f2 = 128.0f * f;
        float f3 = ((SIG_HEIGHT * f) / 2.0f) + (SIG_TOP * f);
        float f4 = f * CVV_DOT_SPACING;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.add(Float.valueOf((i * f4) + f2));
        }
        drawCvvFocusBubble(canvas, f3, arrayList);
        drawCvvDots(canvas, arrayList, f3, this.cvvDotPaint);
    }

    private final void drawCardDotsAndNumbers(Canvas canvas, List<Integer> numberDotGroup, float firstDotOffset, float blockSpacing, int startShowingDigitsPos) {
        String str;
        CardImagePresenter cardImagePresenter = this.cardImagePresenter;
        String str2 = "cardImagePresenter";
        if (cardImagePresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
            throw null;
        }
        String cardNumberSuffix = cardImagePresenter.getCardNumberSuffix();
        float f = firstDotOffset + PAN_DIGIT_FIRST_CENTER_X;
        float f2 = this.scaleRatio;
        float f3 = f * f2;
        float f4 = PAN_DIGIT_CENTER_Y * f2;
        float f5 = 2.0f;
        float f6 = f2 * 2.0f;
        float f7 = 3.0f * f2 * this.cardNumberAnimationFraction;
        float f8 = 8.0f * f2;
        float f9 = f2 * blockSpacing;
        int i = 0;
        this.panFocusedDigitPaint.getTextBounds(cardNumberSuffix, 0, cardNumberSuffix.length(), this.rect);
        float height = (this.rect.height() / 2) + f4;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : numberDotGroup) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            int intValue = ((Number) obj).intValue();
            float f10 = f5;
            int i5 = i3;
            while (i < intValue) {
                String str3 = str2;
                float f11 = (i5 * f8) + (i2 * f9) + f3;
                int i6 = intValue;
                CardImagePresenter cardImagePresenter2 = this.cardImagePresenter;
                if (cardImagePresenter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str3);
                    throw null;
                }
                if (!cardImagePresenter2.getIsCardPanVisible() || i5 <= startShowingDigitsPos) {
                    str = cardNumberSuffix;
                    if (i5 == this.focusedPanDigit) {
                        canvas.drawCircle(f11, f4, f7, this.panFocusedDigitPaint);
                    } else {
                        canvas.drawCircle(f11, f4, f6, this.panDigitPaint);
                    }
                } else {
                    str = cardNumberSuffix;
                    canvas.drawText(String.valueOf(cardNumberSuffix.charAt(i)), f11 - (f8 / f10), height, this.panFocusedDigitPaint);
                }
                i5++;
                i++;
                intValue = i6;
                str2 = str3;
                cardNumberSuffix = str;
            }
            i3 = i5;
            i2 = i4;
            i = 0;
            f5 = f10;
        }
    }

    private final void drawCardFront(Canvas canvas) {
        ArrayList mutableList = CollectionsKt.toMutableList((Collection) this.cardNumberDotGroup);
        CardImagePresenter cardImagePresenter = this.cardImagePresenter;
        if (cardImagePresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
            throw null;
        }
        int length = cardImagePresenter.getCardNumberSuffix().length();
        CardImagePresenter cardImagePresenter2 = this.cardImagePresenter;
        if (cardImagePresenter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
            throw null;
        }
        if (cardImagePresenter2.getIsCardPanVisible()) {
            mutableList.remove(Integer.valueOf(mutableList.size()));
            mutableList.add(Integer.valueOf(length));
        }
        drawCardDotsAndNumbers(canvas, mutableList, 0.0f, 8.0f, 11);
        drawExpirationDateDots(canvas);
    }

    private final void drawCardTransition(Canvas canvas) {
        float min;
        float f = this.scaleRatio * 32.0f;
        this.path.reset();
        boolean isCurrentBrandUnknown = isCurrentBrandUnknown();
        float f2 = this.cardBrandAnimationFraction;
        if (isCurrentBrandUnknown) {
            f2 = 1.0f - f2;
        }
        float f3 = (this.cardWidth + f) * f2;
        float f4 = f3 - f;
        if (isCurrentBrandUnknown()) {
            if (this.previousCardBitmap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previousCardBitmap");
                throw null;
            }
            min = Math.max(r2.getWidth(), f3);
        } else {
            min = Math.min(0.0f, f4);
        }
        this.path.moveTo(min, 0.0f);
        this.path.lineTo(f3, 0.0f);
        this.path.lineTo(f4, this.cardHeight);
        this.path.lineTo(min, this.cardHeight);
        this.path.close();
        Bitmap bitmap = this.previousCardMaskedBitmap;
        if (bitmap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previousCardMaskedBitmap");
            throw null;
        }
        bitmap.eraseColor(0);
        Canvas canvas2 = this.previousCardMaskedCanvas;
        if (canvas2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previousCardMaskedCanvas");
            throw null;
        }
        Bitmap bitmap2 = this.previousCardBitmap;
        if (bitmap2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previousCardBitmap");
            throw null;
        }
        canvas2.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        Canvas canvas3 = this.previousCardMaskedCanvas;
        if (canvas3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previousCardMaskedCanvas");
            throw null;
        }
        canvas3.drawPath(this.path, this.clearPaint);
        Bitmap bitmap3 = this.previousCardMaskedBitmap;
        if (bitmap3 != null) {
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("previousCardMaskedBitmap");
            throw null;
        }
    }

    private final void drawCvvDots(Canvas canvas, List<Float> cvvDotList, float cvvCenterY, Paint paint) {
        int i = 0;
        boolean z = this.cvvFocusAnimationFraction > 0.0f;
        for (Object obj : cvvDotList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            float floatValue = ((Number) obj).floatValue();
            if (i == this.focusedCvvDigit && z) {
                canvas.drawCircle(floatValue, cvvCenterY, this.cvvFocusAnimationFraction * 3.0f * this.scaleRatio * this.dotAnimationFraction, this.cvvFocusedDotPaint);
            } else {
                canvas.drawCircle(floatValue, cvvCenterY, this.scaleRatio * 2.0f, paint);
            }
            i = i2;
        }
    }

    private final void drawCvvFocusBubble(Canvas canvas, float cvvCenterY, List<Float> cvvDotList) {
        float f = this.cvvFocusAnimationFraction;
        if (f > 0.0f) {
            float f2 = f * CVV_FOCUS_RADIUS * this.scaleRatio;
            float floatValue = cvvDotList.get(cvvDotList.size() / 2).floatValue();
            canvas.drawCircle(floatValue, (this.scaleRatio * 2.0f) + cvvCenterY, f2, this.cvvFocusShadowPaint);
            canvas.drawCircle(floatValue, cvvCenterY, f2, this.cvvFocusPaint);
        }
    }

    private final void drawDiner(Canvas canvas) {
        drawCardDotsAndNumbers(canvas, this.dinerCardNumberDotGroup, 0.0f, SPECIAL_PAN_BLOCK_SPACING, 9);
        drawExpirationDateDots(canvas);
    }

    private final void drawExpirationDateDots(Canvas canvas) {
        CardImagePresenter cardImagePresenter = this.cardImagePresenter;
        if (cardImagePresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
            throw null;
        }
        String stripNonDigits = UtilsKt.stripNonDigits(cardImagePresenter.getExpDate());
        boolean isExpDateInputFinished = isExpDateInputFinished();
        float expirationDotCenterX = getExpirationDotCenterX();
        float f = this.scaleRatio;
        float f2 = DATE_FIRST_DOT_CENTER_Y * f;
        float f3 = f * DATE_DOT_RADIUS;
        int i = 0;
        if (isExpDateInputFinished) {
            for (Object obj : this.dateDigitOffsetTemplate) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                float floatValue = ((Number) obj).floatValue();
                float f4 = this.scaleRatio;
                if (i == 2) {
                    canvas.drawText("/", CameraState$Type$EnumUnboxingLocalUtility.m(floatValue, 1.0f, f4, expirationDotCenterX), (DATE_DIGIT_Y_OFFSET * f3) + f2, this.dateFocusedDotPaint);
                } else {
                    float m = CameraState$Type$EnumUnboxingLocalUtility.m(floatValue, 1.0f, f4, expirationDotCenterX);
                    float f5 = (DATE_DIGIT_Y_OFFSET * f3) + f2;
                    if (i > 2) {
                        i--;
                    }
                    canvas.drawText(String.valueOf(stripNonDigits.charAt(i)), m, f5, this.dateFocusedDotPaint);
                }
                i = i2;
            }
            return;
        }
        int i3 = 0;
        for (Object obj2 : this.dateDotOffsetsTemplate) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            float floatValue2 = ((Number) obj2).floatValue();
            int i5 = this.focusedExpDigit;
            float f6 = this.scaleRatio;
            if (i3 == i5) {
                canvas.drawCircle((floatValue2 * f6) + expirationDotCenterX, f2, this.dotAnimationFraction * f3, this.dateFocusedDotPaint);
            } else {
                canvas.drawCircle((floatValue2 * f6) + expirationDotCenterX, f2, f3, this.dateDotPaint);
            }
            i3 = i4;
        }
        this.dateDotPaint.getTextBounds("0", 0, 1, this.rect);
        canvas.drawText("/", ((((Number) CollectionsKt.last((List) this.dateDotOffsetsTemplate)).floatValue() / 2.0f) * this.scaleRatio) + expirationDotCenterX, (this.rect.height() / 2.0f) + f2, this.dateDotPaint);
    }

    private final void fadeToError() {
        Drawable currentDrawable = getCurrentDrawable();
        Drawable drawable = getContext().getDrawable(this.errorResId);
        drawable.getClass();
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{currentDrawable, drawable});
        setImageDrawable(transitionDrawable);
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(200);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flipCardDrawable(final boolean isFront) {
        setCameraDistance(getWidth() * 32.0f);
        AnimatorSet animatorSet = getIsBigCard() ? this.flipSetWithShadowFade : this.flipSetWithoutShadow;
        if (this.flipInProgress) {
            return;
        }
        this.flipOut.removeAllListeners();
        this.flipOut.addListener(new AnimatorListenerAdapter() { // from class: sqip.internal.CardImage$flipCardDrawable$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Drawable currentDrawable;
                animation.getClass();
                CardImage.this.isFront = isFront;
                CardImage.this.flipOutInProgress = false;
                CardImage cardImage = CardImage.this;
                currentDrawable = cardImage.getCurrentDrawable();
                cardImage.setImageDrawable(currentDrawable);
            }
        });
        animatorSet.start();
        this.flipOutInProgress = true;
        this.flipInProgress = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getCurrentDrawable() {
        if (!getIsBigCard()) {
            CardImagePresenter cardImagePresenter = this.cardImagePresenter;
            if (cardImagePresenter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
                throw null;
            }
            if (cardImagePresenter.getHasError()) {
                Drawable drawable = getContext().getDrawable(this.errorResId);
                drawable.getClass();
                return drawable;
            }
        }
        CardAsset cardAsset = getIsBigCard() ? this.bigCardAsset : this.smallCardAsset;
        Drawable drawable2 = getContext().getDrawable(this.isFront ? cardAsset.getFront() : cardAsset.getBack());
        drawable2.getClass();
        return drawable2;
    }

    private final Drawable getDrawableWith(CardAsset asset) {
        if (this.isFront) {
            Drawable drawable = getContext().getDrawable(asset.getFront());
            drawable.getClass();
            return drawable;
        }
        Drawable drawable2 = getContext().getDrawable(asset.getBack());
        drawable2.getClass();
        return drawable2;
    }

    private final float getExpirationDotCenterX() {
        boolean isAmex = isAmex();
        float f = this.scaleRatio;
        return isAmex ? f * DATE_FIRST_DOT_CENTER_X : f * DATE_FIRST_DOT_CENTER_X;
    }

    private final boolean isAmex() {
        CardImagePresenter cardImagePresenter = this.cardImagePresenter;
        if (cardImagePresenter != null) {
            return cardImagePresenter.getCurrentBrand() == Card$Brand.AMERICAN_EXPRESS;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
        throw null;
    }

    private final boolean isCurrentBrandUnknown() {
        CardImagePresenter cardImagePresenter = this.cardImagePresenter;
        if (cardImagePresenter != null) {
            return cardImagePresenter.getCurrentBrand() == Card$Brand.UNKNOWN;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
        throw null;
    }

    private final boolean isDiners() {
        CardImagePresenter cardImagePresenter = this.cardImagePresenter;
        if (cardImagePresenter != null) {
            return cardImagePresenter.getCurrentBrand() == Card$Brand.DISCOVER_DINERS;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
        throw null;
    }

    private final boolean isExpDateInputFinished() {
        CardImagePresenter cardImagePresenter = this.cardImagePresenter;
        if (cardImagePresenter != null) {
            return cardImagePresenter.getExpDate().length() == 5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
        throw null;
    }

    private final void setBig(boolean big) {
        setBigCard(big);
        if (!big) {
            CardImagePresenter cardImagePresenter = this.cardImagePresenter;
            if (cardImagePresenter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
                throw null;
            }
            if (cardImagePresenter.getHasError()) {
                fadeToError();
                return;
            }
        }
        if (this.flipOutInProgress) {
            return;
        }
        setImageDrawable(getCurrentDrawable());
    }

    private final void setCrossFadeDrawable(CardAsset oldSmallAssets) {
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{getDrawableWith(oldSmallAssets), getCurrentDrawable()});
        setImageDrawable(transitionDrawable);
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(200);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLastFewDigits$lambda$23$lambda$22(CardImage cardImage, ValueAnimator valueAnimator) {
        cardImage.lastFourAnimationFraction = ((Float) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).floatValue();
        cardImage.invalidate();
    }

    private final void startCurtainAnimation(CardAsset oldBigAssets) {
        if (this.previousCardBitmap != null) {
            this.previousCardBitmap = UtilsKt.toBitmap(getDrawableWith(oldBigAssets));
            Bitmap bitmap = this.previousCardBitmap;
            if (bitmap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previousCardBitmap");
                throw null;
            }
            Canvas canvas = new Canvas(bitmap);
            setImageDrawable(getCurrentDrawable());
            drawCard(canvas);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new CardImage$$ExternalSyntheticLambda0(this, 2));
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCurtainAnimation$lambda$16$lambda$15(CardImage cardImage, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        cardImage.cardBrandAnimationFraction = valueAnimator.getAnimatedFraction();
        cardImage.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float toPixels(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    private final int updateAlpha(float alphaFraction, int targetColor) {
        return Color.argb((int) (alphaFraction * 255.0f), Color.red(targetColor), Color.green(targetColor), Color.blue(targetColor));
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void animateCardTransition(Card$Brand oldBrand) {
        oldBrand.getClass();
        if (getIsBigCard()) {
            CardAsset cardAsset = this.brandToBigDrawables.get(oldBrand);
            if (cardAsset == null) {
                cardAsset = defaultBigCard;
            }
            startCurtainAnimation(cardAsset);
            return;
        }
        CardAsset cardAsset2 = this.brandToSmallDrawables.get(oldBrand);
        if (cardAsset2 == null) {
            cardAsset2 = defaultSmallCard;
        }
        setCrossFadeDrawable(cardAsset2);
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void fadeCvvBubbleIn() {
        animateCvv(true, 0L);
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void fadeCvvBubbleOut() {
        animateCvv(false, 0L);
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void flipToBack() {
        flipCardDrawable(false);
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void flipToFront() {
        flipCardDrawable(true);
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void init() {
        CardImagePresenter cardImagePresenter = this.cardImagePresenter;
        if (cardImagePresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
            throw null;
        }
        this.isFront = cardImagePresenter.getShouldShowFront();
        setImageDrawable(getCurrentDrawable());
        if (!this.isFront || isAmex()) {
            fadeCvvBubbleIn();
        }
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    /* renamed from: isBigCard, reason: from getter */
    public boolean getIsBigCard() {
        return this.isBigCard;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (getIsBigCard()) {
            drawCard(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        if (getIsBigCard() && w <= this.smallCardWidth && h <= this.smallCardHeight) {
            setBig(false);
        } else if (!getIsBigCard() && w > this.smallCardWidth && h > this.smallCardHeight) {
            setBig(true);
        }
        if (getIsBigCard()) {
            float f = w * 1.0f;
            this.cardWidth = f;
            float f2 = f * CARD_RATIO;
            this.cardHeight = f2;
            float f3 = f2 / 128.0f;
            this.scaleRatio = f3;
            this.panFocusedDigitPaint.setTextSize(f3 * PAN_FONT_SIZE);
            this.dateFocusedDotPaint.setTextSize(this.scaleRatio * DATE_DOT_TEXT_SIZE);
            this.dateDotPaint.setTextSize(this.scaleRatio * DATE_DOT_TEXT_SIZE);
            createPreviousCardEmptyBitmaps();
        }
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void setBigCard(boolean z) {
        this.isBigCard = z;
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void setNewCardAssetsWith(Card$Brand brand) {
        brand.getClass();
        CardAsset cardAsset = this.brandToSmallDrawables.get(brand);
        if (cardAsset == null) {
            cardAsset = defaultSmallCard;
        }
        this.smallCardAsset = cardAsset;
        CardAsset cardAsset2 = this.brandToBigDrawables.get(brand);
        if (cardAsset2 == null) {
            cardAsset2 = defaultBigCard;
        }
        this.bigCardAsset = cardAsset2;
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void showLastFewDigits() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new CardImage$$ExternalSyntheticLambda0(this, 3));
        ofFloat.setDuration(500L);
        ofFloat.start();
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void switchCvvDigitFocusedTo(int position) {
        this.focusedCvvDigit = position;
        animateFocusedDot();
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void switchExpDotFocusedTo(int position) {
        this.focusedExpDigit = position;
        animateFocusedDot();
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void switchPanDigitFocusedTo(int position) {
        this.focusedPanDigit = position;
        animateLargeCardNumberDots();
    }

    @Override // sqip.internal.contracts.CardImageContract.View
    public void updatePaintFor(Card$Brand brand) {
        brand.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[brand.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            this.panDigitPaint.setColor(getContext().getColor(R.color.sqip_white_card_digit_paint));
            this.panFocusedDigitPaint.setColor(getContext().getColor(R.color.sqip_white_card_focused_paint));
            this.dateDotPaint.setColor(getContext().getColor(R.color.sqip_white_card_digit_paint));
            this.dateFocusedDotPaint.setColor(getContext().getColor(R.color.sqip_white_card_focused_paint));
            return;
        }
        this.panDigitPaint.setColor(getContext().getColor(R.color.sqip_non_white_card_digit_paint));
        this.panFocusedDigitPaint.setColor(getContext().getColor(R.color.sqip_non_white_card_focused_paint));
        this.dateDotPaint.setColor(getContext().getColor(R.color.sqip_non_white_card_digit_paint));
        this.dateFocusedDotPaint.setColor(getContext().getColor(R.color.sqip_non_white_card_focused_paint));
    }

    @Override // sqip.internal.BaseView
    public void setPresenter(CardImagePresenter presenter) {
        presenter.getClass();
        this.cardImagePresenter = presenter;
    }
}
