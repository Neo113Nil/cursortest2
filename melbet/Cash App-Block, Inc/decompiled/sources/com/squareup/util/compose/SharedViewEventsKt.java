package com.squareup.util.compose;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.common.composeui.animations.ArcadeShaker;
import com.squareup.cash.common.composeui.animations.RegularShaker;
import com.squareup.cash.common.composeui.animations.Shaker;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes6.dex */
public abstract class SharedViewEventsKt {
    public static ViewEvent.Resource fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            return new ViewEvent.Resource(jsonObject.get("count").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Resource", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Resource", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Resource", e3);
            return null;
        }
    }

    public static final Shaker rememberShaker(boolean z, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2131321693);
        if ((i & 1) != 0) {
            z = false;
        }
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        if (!z) {
            gapComposer.startReplaceGroup(-1702701302);
            float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(12.0f);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RegularShaker(coroutineScope, mo236toPx0680j_4);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            RegularShaker regularShaker = (RegularShaker) rememberedValue2;
            gapComposer.end(false);
            gapComposer.end(false);
            return regularShaker;
        }
        gapComposer.startReplaceGroup(-1702901190);
        float f = -((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(10.0f);
        Object obj = ((Motion) gapComposer.consume(com.squareup.cash.arcade.MotionKt.LocalMotion)).springs.resultMetadata;
        SpringSpec springSpec = new SpringSpec(0.13f, 1200.0f, null);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new ArcadeShaker(coroutineScope, f, springSpec);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        ArcadeShaker arcadeShaker = (ArcadeShaker) rememberedValue3;
        gapComposer.end(false);
        gapComposer.end(false);
        return arcadeShaker;
    }

    public static final MutableSharedFlow rememberSharedViewEvents(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = FlowKt.MutableSharedFlow$default(0, 50, null, 4);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (MutableSharedFlow) rememberedValue;
    }

    public static final Modifier shakeWith(Modifier modifier, Shaker shaker) {
        modifier.getClass();
        shaker.getClass();
        return OffsetKt.offset(modifier, new CaptureCheckFaceKt$$ExternalSyntheticLambda12(shaker, 25));
    }
}
