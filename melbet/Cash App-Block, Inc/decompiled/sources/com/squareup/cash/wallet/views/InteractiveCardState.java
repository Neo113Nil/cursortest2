package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardContouredText;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.android.StringsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class InteractiveCardState {
    public final ParcelableSnapshotMutableState flipToBack$delegate;
    public final ParcelableSnapshotMutableState flipToFront$delegate;
    public final ParcelableSnapshotMutableState isCardHome$delegate;
    public final ParcelableSnapshotMutableState touchEnabled$delegate;
    public final Animatable copyScale = AnimatableKt.Animatable(1.0f, 0.01f);
    public final Animatable copyAlpha = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
    public final Animatable copyOffset = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
    public final Animatable dimmer = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
    public final Animatable shimmerOffset = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
    public final Animatable lockScale = AnimatableKt.Animatable(1.0f, 0.01f);
    public final Animatable lockOffset = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
    public final Animatable lockDimmer = AnimatableKt.Animatable(1.0f, 0.01f);
    public final Animatable zTranslation = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);

    public InteractiveCardState() {
        Boolean bool = Boolean.FALSE;
        this.flipToBack$delegate = Updater.mutableStateOf$default(bool);
        this.flipToFront$delegate = Updater.mutableStateOf$default(bool);
        this.touchEnabled$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
        this.isCardHome$delegate = Updater.mutableStateOf$default(bool);
    }

    public static Object animateCardTranslation$default(InteractiveCardState interactiveCardState, boolean z, boolean z2, boolean z3, SuspendLambda suspendLambda) {
        interactiveCardState.getClass();
        return JobKt.coroutineScope(new InteractiveCardState$animateCardTranslation$2(z, z2, interactiveCardState, z3, false, null), suspendLambda);
    }

    public final Object animateCopyAlpha(boolean z, SuspendLambda suspendLambda) {
        Object animateTo$default = Animatable.animateTo$default(this.copyAlpha, new Float(z ? 1.0f : RecyclerView.DECELERATION_RATE), AnimatableKt.spring$default(1.15f, z ? 100.0f : 50.0f, null, 4), null, null, suspendLambda, 12);
        return animateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? animateTo$default : Unit.INSTANCE;
    }

    public final Object animateDimmer(boolean z, boolean z2, SuspendLambda suspendLambda) {
        float f = z ? 0.4f : RecyclerView.DECELERATION_RATE;
        Animatable animatable = this.dimmer;
        if (z2) {
            Object snapTo = animatable.snapTo(new Float(f), suspendLambda);
            return snapTo == CoroutineSingletons.COROUTINE_SUSPENDED ? snapTo : Unit.INSTANCE;
        }
        Object animateTo$default = Animatable.animateTo$default(animatable, new Float(f), AnimatableKt.spring$default(1.0f, 400.0f, null, 4), null, null, suspendLambda, 12);
        return animateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? animateTo$default : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r5.copyScale.snapTo(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r5.copyOffset.snapTo(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object interruptCopyAnimation(ContinuationImpl continuationImpl) {
        InteractiveCardState$interruptCopyAnimation$1 interactiveCardState$interruptCopyAnimation$1;
        int i;
        if (continuationImpl instanceof InteractiveCardState$interruptCopyAnimation$1) {
            interactiveCardState$interruptCopyAnimation$1 = (InteractiveCardState$interruptCopyAnimation$1) continuationImpl;
            int i2 = interactiveCardState$interruptCopyAnimation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                interactiveCardState$interruptCopyAnimation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = interactiveCardState$interruptCopyAnimation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = interactiveCardState$interruptCopyAnimation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f = new Float(RecyclerView.DECELERATION_RATE);
                    interactiveCardState$interruptCopyAnimation$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Float f2 = new Float(1.0f);
                interactiveCardState$interruptCopyAnimation$1.label = 2;
            }
        }
        interactiveCardState$interruptCopyAnimation$1 = new InteractiveCardState$interruptCopyAnimation$1(this, continuationImpl);
        Object obj2 = interactiveCardState$interruptCopyAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = interactiveCardState$interruptCopyAnimation$1.label;
        if (i != 0) {
        }
        Float f22 = new Float(1.0f);
        interactiveCardState$interruptCopyAnimation$1.label = 2;
    }

    public final CardModelView.ViewModel toCardViewModel(CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, Composer composer) {
        String str;
        MutableState mutableState;
        String str2;
        CardContouredText cardContouredText;
        boolean z;
        CardContouredText cardContouredText2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2041935892);
        CardTheme cardTheme = heroCardDetails.cardTheme;
        String str3 = cardTheme.ink_color;
        Timber.Forest forest = Timber.Forest;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new ScannerView.AnonymousClass3(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 13);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Integer safeParseColor = StringsKt.safeParseColor(str3, (Function1) ((KFunction) rememberedValue));
        safeParseColor.getClass();
        int intValue = safeParseColor.intValue();
        MutableState cardQuickFadeInOut = CardTransitionKt.cardQuickFadeInOut(6, 0, gapComposer);
        CardTheme.Identifier identifier = cardTheme.id;
        String str4 = cardTheme.card_color;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            str = str4;
            ScannerView.AnonymousClass3 anonymousClass3 = new ScannerView.AnonymousClass3(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 10);
            gapComposer.updateRememberedValue(anonymousClass3);
            rememberedValue2 = anonymousClass3;
        } else {
            str = str4;
        }
        Integer safeParseColor2 = StringsKt.safeParseColor(str, (Function1) ((KFunction) rememberedValue2));
        safeParseColor2.getClass();
        int intValue2 = safeParseColor2.intValue();
        Integer safeParseColor3 = StringsKt.safeParseColor(cardTheme.card_info_text_color, null);
        int intValue3 = safeParseColor3 != null ? safeParseColor3.intValue() : intValue;
        String str5 = cardTheme.mag_stripe_color;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            cardContouredText = null;
            mutableState = cardQuickFadeInOut;
            str2 = str5;
            ScannerView.AnonymousClass3 anonymousClass32 = new ScannerView.AnonymousClass3(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 11);
            gapComposer.updateRememberedValue(anonymousClass32);
            rememberedValue3 = anonymousClass32;
        } else {
            mutableState = cardQuickFadeInOut;
            str2 = str5;
            cardContouredText = null;
        }
        Integer safeParseColor4 = StringsKt.safeParseColor(str2, (Function1) ((KFunction) rememberedValue3));
        int intValue4 = safeParseColor4 != null ? safeParseColor4.intValue() : -12303292;
        String str6 = cardTheme.mag_stripe_back_color;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new ScannerView.AnonymousClass3(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 12);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Integer safeParseColor5 = StringsKt.safeParseColor(str6, (Function1) ((KFunction) rememberedValue4));
        int intValue5 = safeParseColor5 != null ? safeParseColor5.intValue() : CardModelView.DEFAULT_MAG_BACK_COLOR;
        CardTheme.BackgroundImage backgroundImage = cardTheme.background_image;
        CardTheme.CardCustomizationMargin cardCustomizationMargin = cardTheme.card_customization_margin;
        String str7 = heroCardDetails.cashtag;
        CardTheme.Font font = cardTheme.font;
        if (heroCardDetails.showPrepurchaseContourText) {
            gapComposer.startReplaceGroup(658485585);
            String stringResource = Room.stringResource(gapComposer, R.string.prepurchase_contour_text);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            CardContouredText cardContouredText3 = new CardContouredText(stringResource, Integer.valueOf(ColorKt.m694toArgb8_81llA(colors.semantic.text.standard)), ((Number) mutableState.getValue()).floatValue(), 8, 0);
            z = false;
            gapComposer.end(false);
            cardContouredText2 = cardContouredText3;
        } else {
            z = false;
            gapComposer.startReplaceGroup(658730795);
            gapComposer.end(false);
            cardContouredText2 = cardContouredText;
        }
        CardModelView.ViewModel viewModel = new CardModelView.ViewModel(intValue2, intValue, intValue3, identifier, backgroundImage, font, null, cardCustomizationMargin, str7, intValue4, intValue5, heroCardDetails.name, CollectionsKt.joinToString$default(StringsKt___StringsKt.chunked(4, heroCardDetails.pan), " ", null, null, 0, null, null, 62), heroCardDetails.cvv, heroCardDetails.exp, null, cardContouredText2, !heroCardDetails.isEnabled, ((Number) this.dimmer.getValue()).floatValue(), ((Number) this.shimmerOffset.getValue()).floatValue() + 0.22222222f, 2013757408, 2032);
        gapComposer.end(z);
        return viewModel;
    }

    public final CardModelView.PanEntity toPanEntity() {
        Animatable animatable = this.zTranslation;
        return new CardModelView.PanEntity(new Vector4(RecyclerView.DECELERATION_RATE, (-((Number) animatable.getValue()).floatValue()) * 3.0f, -Math.abs(((Number) animatable.getValue()).floatValue() * 0.7f), RecyclerView.DECELERATION_RATE), ((Number) this.copyAlpha.getValue()).floatValue());
    }
}
