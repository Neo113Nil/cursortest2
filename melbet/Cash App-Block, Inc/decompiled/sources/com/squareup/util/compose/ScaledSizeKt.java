package com.squareup.util.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.brand.menu.LocalMenuComboDetailsViewKt$$ExternalSyntheticLambda13;
import app.cash.molecule.PlatformKt;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.arcade.components.RadioKt$$ExternalSyntheticLambda1;
import com.squareup.cash.common.composeui.animations.HypeIntroAnimationKt$HypeIntroAnimation$1$1;
import com.squareup.cash.common.composeui.animations.IntroPhase;
import com.squareup.util.cash.Countries;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ScaledSizeKt {
    /* renamed from: HypeIntroAnimation-cf5BqRc, reason: not valid java name */
    public static final void m3993HypeIntroAnimationcf5BqRc(boolean z, Modifier modifier, long j, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        Animatable animatable;
        MutableState mutableState;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2107526668);
        int i2 = ((i & 6) == 0 ? (gapComposer2.changed(z) ? 4 : 2) | i : i) | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new IntroPhase[]{IntroPhase.HEART, IntroPhase.CARD, IntroPhase.WAND});
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                for (int i3 = 0; i3 < 3; i3++) {
                    createListBuilder.addAll(listOf);
                }
                rememberedValue = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            List list = (List) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = AnimatableKt.Animatable(-15.0f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Animatable animatable2 = (Animatable) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.mutableStateOf$default(z ? IntroPhase.HEART : IntroPhase.COMPLETE);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState2 = (MutableState) rememberedValue3;
            Boolean valueOf = Boolean.valueOf(z);
            boolean changedInstance = ((i2 & 7168) == 2048) | ((i2 & 14) == 4) | gapComposer2.changedInstance(list) | gapComposer2.changedInstance(animatable2);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                animatable = animatable2;
                mutableState = mutableState2;
                HypeIntroAnimationKt$HypeIntroAnimation$1$1 hypeIntroAnimationKt$HypeIntroAnimation$1$1 = new HypeIntroAnimationKt$HypeIntroAnimation$1$1(z, list, animatable, function0, mutableState, null);
                gapComposer2.updateRememberedValue(hypeIntroAnimationKt$HypeIntroAnimation$1$1);
                rememberedValue4 = hypeIntroAnimationKt$HypeIntroAnimation$1$1;
            } else {
                animatable = animatable2;
                mutableState = mutableState2;
            }
            Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue4);
            IntroPhase introPhase = (IntroPhase) mutableState.getValue();
            IntroPhase introPhase2 = IntroPhase.COMPLETE;
            modifier2 = Modifier.Companion.$$INSTANCE;
            if (introPhase != introPhase2) {
                gapComposer2.startReplaceGroup(1497209755);
                boolean changedInstance2 = gapComposer2.changedInstance(animatable);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new RadioKt$$ExternalSyntheticLambda1(animatable, 8);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                Modifier graphicsLayer = ColorKt.graphicsLayer(modifier2, (Function1) rememberedValue5);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, graphicsLayer);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer2.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                ImageKt.Image(Countries.painterResource(((IntroPhase) mutableState.getValue()).drawableId, 0, gapComposer2), null, null, null, null, RecyclerView.DECELERATION_RATE, j != 16 ? new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))) : null, gapComposer2, Painter.$stable | 48, 60);
                gapComposer = gapComposer2;
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                gapComposer.startReplaceGroup(1497543222);
                gapComposer.end(false);
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMenuComboDetailsViewKt$$ExternalSyntheticLambda13(z, modifier2, j, function0, i);
        }
    }

    public static ViewEvent.ReplayStats fromJsonObject(JsonObject jsonObject) {
        try {
            JsonElement jsonElement = jsonObject.get("records_count");
            Long valueOf = jsonElement != null ? Long.valueOf(jsonElement.getAsLong()) : null;
            JsonElement jsonElement2 = jsonObject.get("segments_count");
            Long valueOf2 = jsonElement2 != null ? Long.valueOf(jsonElement2.getAsLong()) : null;
            JsonElement jsonElement3 = jsonObject.get("segments_total_raw_size");
            return new ViewEvent.ReplayStats(valueOf, valueOf2, jsonElement3 != null ? Long.valueOf(jsonElement3.getAsLong()) : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ReplayStats", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ReplayStats", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ReplayStats", e3);
            return null;
        }
    }

    /* renamed from: scaleHeightToTextHeight-r9BaKPg, reason: not valid java name */
    public static final Modifier m3994scaleHeightToTextHeightr9BaKPg(Modifier modifier, long j, Composer composer) {
        modifier.getClass();
        return SizeKt.m277height3ABfNKs(modifier, ((Density) ((GapComposer) composer).consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(j));
    }
}
