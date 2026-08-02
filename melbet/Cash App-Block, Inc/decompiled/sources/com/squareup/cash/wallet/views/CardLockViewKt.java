package com.squareup.cash.wallet.views;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.material.DefaultButtonElevation$elevation$2$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicPropertiesKt;
import com.airbnb.lottie.compose.LottieDynamicProperty;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.RadioKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.views.LockAnimationColorTreatment;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public abstract class CardLockViewKt {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long LockBodyLight = ColorKt.Color(4292993505L);
    public static final long KeyholeDark = ColorKt.Color(4278255873L);
    public static final long LockBodyDark = ColorKt.Color(4278255873L);
    public static final long KeyholeLight = ColorKt.Color(4292993505L);

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CardTheme.Identifier.values().length];
            try {
                iArr[CardTheme.Identifier.BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTheme.Identifier.WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardTheme.Identifier.GLOW_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TagFormFactor.values().length];
            try {
                TagFormFactor tagFormFactor = TagFormFactor.WAND;
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TagFormFactor tagFormFactor2 = TagFormFactor.WAND;
                iArr2[4] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x016f, code lost:
    
        if (r11 == r10) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LockAnimation(boolean z, Modifier modifier, LockAnimationColorTreatment lockAnimationColorTreatment, Composer composer, int i) {
        int i2;
        Object defaultButtonElevation$elevation$2$1;
        Animatable animatable;
        Pair pair;
        Object obj;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1121281171);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changed(lockAnimationColorTreatment) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m1524boximpl(LottieCompositionSpec.RawRes.m1525constructorimpl(R.raw.card_lock)), null, null, null, null, null, gapComposer, 0, 62);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = AnimatableKt.Animatable(!z ? 0.75f : 0.0f, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Animatable animatable2 = (Animatable) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj2) {
                rememberedValue2 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Animatable animatable3 = (Animatable) rememberedValue2;
            Boolean valueOf = Boolean.valueOf(z);
            boolean changedInstance = ((i3 & 14) == 4) | gapComposer.changedInstance(animatable3) | gapComposer.changed(rememberLottieComposition) | gapComposer.changedInstance(animatable2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == obj2) {
                animatable = animatable3;
                defaultButtonElevation$elevation$2$1 = new DefaultButtonElevation$elevation$2$1(z, animatable, animatable2, rememberLottieComposition, null);
                gapComposer.updateRememberedValue(defaultButtonElevation$elevation$2$1);
            } else {
                defaultButtonElevation$elevation$2$1 = rememberedValue3;
                animatable = animatable3;
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) defaultButtonElevation$elevation$2$1);
            boolean equals = lockAnimationColorTreatment.equals(LockAnimationColorTreatment.Adaptive.INSTANCE);
            long j = KeyholeDark;
            long j2 = LockBodyLight;
            Animatable animatable4 = animatable;
            long j3 = KeyholeLight;
            long j4 = LockBodyDark;
            if (equals) {
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = colors.isLight ? new Pair(new Color(j4), new Color(j3)) : new Pair(new Color(j2), new Color(j));
            } else if (lockAnimationColorTreatment.equals(LockAnimationColorTreatment.LightLock.INSTANCE)) {
                pair = new Pair(new Color(j2), new Color(j));
            } else {
                if (!lockAnimationColorTreatment.equals(LockAnimationColorTreatment.DarkLock.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                pair = new Pair(new Color(j4), new Color(j3));
            }
            long j5 = ((Color) pair.first).value;
            long j6 = ((Color) pair.second).value;
            boolean changed = gapComposer.changed(j5);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed) {
                obj = obj2;
            } else {
                obj = obj2;
            }
            rememberedValue4 = new PorterDuffColorFilter(ColorKt.m694toArgb8_81llA(j5), PorterDuff.Mode.SRC_IN);
            gapComposer.updateRememberedValue(rememberedValue4);
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) rememberedValue4;
            boolean changed2 = gapComposer.changed(j6);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue5 == obj) {
                rememberedValue5 = new PorterDuffColorFilter(ColorKt.m694toArgb8_81llA(j6), PorterDuff.Mode.SRC_IN);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) rememberedValue5;
            ColorFilter colorFilter = LottieProperty.COLOR_FILTER;
            LottieDynamicProperties rememberLottieDynamicProperties = LottieDynamicPropertiesKt.rememberLottieDynamicProperties(new LottieDynamicProperty[]{LottieDynamicPropertiesKt.rememberLottieDynamicProperty((PorterDuffColorFilter) colorFilter, porterDuffColorFilter, new String[]{"Shape Layer 54", "**"}, (Composer) gapComposer, 6), LottieDynamicPropertiesKt.rememberLottieDynamicProperty((PorterDuffColorFilter) colorFilter, porterDuffColorFilter, new String[]{"Shape Layer 55", "**"}, (Composer) gapComposer, 6), LottieDynamicPropertiesKt.rememberLottieDynamicProperty((PorterDuffColorFilter) colorFilter, porterDuffColorFilter2, new String[]{"Shape Layer 52", "**"}, (Composer) gapComposer, 6), LottieDynamicPropertiesKt.rememberLottieDynamicProperty((PorterDuffColorFilter) colorFilter, porterDuffColorFilter2, new String[]{"Shape Layer 56", "**"}, (Composer) gapComposer, 6)}, gapComposer, LottieDynamicProperty.$stable);
            boolean changedInstance2 = gapComposer.changedInstance(animatable4);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue6 == obj) {
                rememberedValue6 = new RadioKt$$ExternalSyntheticLambda1(animatable4, 13);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(modifier, (Function1) rememberedValue6);
            LottieComposition lottieComposition = (LottieComposition) rememberLottieComposition.getValue();
            boolean changedInstance3 = gapComposer.changedInstance(animatable2);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue7 == obj) {
                rememberedValue7 = new CardLockViewKt$$ExternalSyntheticLambda1(animatable2, 0);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            LottieAnimationKt.LottieAnimation(lottieComposition, (Function0) rememberedValue7, graphicsLayer, false, false, false, false, null, false, rememberLottieDynamicProperties, null, null, false, false, null, null, false, gapComposer, LottieDynamicProperties.$stable << 27, 0, 130552);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(z, modifier, lockAnimationColorTreatment, i, 0);
        }
    }

    public static final LockAnimationColorTreatment lockAnimationColorTreatment(CardTheme cardTheme) {
        cardTheme.getClass();
        CardTheme.Identifier identifier = cardTheme.id;
        int i = identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? LockAnimationColorTreatment.DarkLock.INSTANCE : LockAnimationColorTreatment.Adaptive.INSTANCE : LockAnimationColorTreatment.LightLock.INSTANCE;
    }
}
