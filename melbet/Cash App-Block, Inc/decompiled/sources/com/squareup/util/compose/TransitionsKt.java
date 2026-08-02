package com.squareup.util.compose;

import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class TransitionsKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NullStateWidgetView(Painter painter, String str, Modifier modifier, Modifier modifier2, String str2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier3;
        int i4;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        painter.getClass();
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1942922388);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer2.changed(painter) : gapComposer2.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier3 = modifier;
            i3 |= gapComposer2.changed(modifier3) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= gapComposer2.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= gapComposer2.changed(str2) ? 16384 : PKIFailureInfo.certRevoked;
            }
            i4 = i3;
            if (gapComposer2.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
            } else {
                Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier3;
                int i6 = i4 >> 6;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier4);
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
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                gapComposer = gapComposer2;
                ImageKt.Image(painter, null, Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, modifier2), null, ContentScale.Companion.FillWidth, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 24624 | (i4 & 14), 104);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                ViewfinderKt.HeroHeader(str, (Modifier) null, str2, (TextStyle) null, gapComposer, ((i4 >> 3) & 14) | (i6 & 896), 10);
                gapComposer.end(true);
                modifier3 = modifier4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3((Object) painter, (Object) str, (Object) modifier3, (Object) modifier2, (Object) str2, i, i2, 15);
                return;
            }
            return;
        }
        modifier3 = modifier;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i4 = i3;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static ViewEvent.Scroll fromJsonObject(JsonObject jsonObject) {
        try {
            Number asNumber = jsonObject.get("max_depth").getAsNumber();
            Number asNumber2 = jsonObject.get("max_depth_scroll_top").getAsNumber();
            Number asNumber3 = jsonObject.get("max_scroll_height").getAsNumber();
            Number asNumber4 = jsonObject.get("max_scroll_height_time").getAsNumber();
            asNumber.getClass();
            asNumber2.getClass();
            asNumber3.getClass();
            asNumber4.getClass();
            return new ViewEvent.Scroll(asNumber, asNumber2, asNumber3, asNumber4);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Scroll", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Scroll", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Scroll", e3);
            return null;
        }
    }

    public static final boolean isVisibleAndSettled(Transition transition) {
        transition.getClass();
        if (transition.transitionState.getCurrentState() != EnterExitState.Visible) {
            return false;
        }
        while (true) {
            Transition transition2 = transition.parentTransition;
            if (transition2 == null) {
                break;
            }
            transition = transition2;
        }
        return !transition.isRunning();
    }
}
