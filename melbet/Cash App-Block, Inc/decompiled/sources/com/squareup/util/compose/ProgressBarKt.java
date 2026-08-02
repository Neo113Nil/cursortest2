package com.squareup.util.compose;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$Favorite$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ProgressBarKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0069  */
    /* renamed from: ProgressBar--jt2gSs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3992ProgressBarjt2gSs(final Modifier modifier, float f, final float f2, final float f3, Composer composer, final int i, final int i2) {
        int i3;
        float f4;
        final float f5;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1111265870);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f4 = f;
            i3 |= gapComposer.changed(f4) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changed(f2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changed(f3) ? 2048 : 1024;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                f5 = f4;
            } else {
                f5 = i4 != 0 ? RecyclerView.DECELERATION_RATE : f4;
                int i5 = i3 & 896;
                boolean z = ((i3 & 112) == 32) | (i5 == 256);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(f5, gapComposer);
                }
                MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
                Float valueOf = Float.valueOf(f5);
                Float valueOf2 = Float.valueOf(f2);
                boolean changed = gapComposer.changed(mutableFloatState) | (i5 == 256);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ProgressBarKt$ProgressBar$1$1(f2, mutableFloatState, null);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue2, gapComposer);
                State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue(), new TweenSpec(f2 == f5 ? 0 : IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f)), "progress_animation", null, gapComposer, 3072, 20);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.border.brand;
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j2 = colors2.semantic.border.subtle;
                float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f3);
                boolean changed2 = gapComposer.changed(mo236toPx0680j_4) | gapComposer.changed(j2) | gapComposer.changed(j) | gapComposer.changed(animateFloatAsState);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new ProgressBarKt$$ExternalSyntheticLambda0(mo236toPx0680j_4, j2, j, animateFloatAsState);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                CanvasKt.Canvas(i3 & 14, gapComposer, modifier, (Function1) rememberedValue3);
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.squareup.util.compose.ProgressBarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ProgressBarKt.m3992ProgressBarjt2gSs(Modifier.this, f5, f2, f3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        f4 = f;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static ViewEvent.Privacy fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("replay_level").getAsString();
            asString.getClass();
            for (int i : CameraSelector$$ExternalSyntheticOutline0.values(3)) {
                if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue(i).equals(asString)) {
                    return new ViewEvent.Privacy(i);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Privacy", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Privacy", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Privacy", e3);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        if (r0 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Set getTopicsEligibleForGlobalSync(KeysetHandle keysetHandle) {
        Collection collection;
        keysetHandle.getClass();
        Object value = ((SyncValueReader) keysetHandle.entries).getSingleValue((AndroidSyncValueSpecs$Favorite$1) keysetHandle.annotationsMap).getValue();
        if (value != null) {
            List list = ((ClientSyncConfig) value).all_active_topics;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new SyncTopic(((Number) it.next()).intValue()));
            }
            collection = CollectionsKt.toSet(arrayList);
        }
        collection = EmptySet.INSTANCE;
        Set of = SetsKt__SetsJVMKt.setOf(SyncTopic.CLIENT_SYNC_CONFIG);
        List list2 = collection;
        if (list2.isEmpty()) {
            list2 = SyncTopic.KNOWN_SYNC_TOPICS;
        }
        return SetsKt___SetsKt.minus((Set) SetsKt___SetsKt.plus(of, (Iterable) list2), (Iterable) keysetHandle.getTopicsEligibleForTopicSync());
    }
}
