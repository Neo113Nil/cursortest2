package com.squareup.util.coroutines;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class TakeUntilKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WidgetSectionView(String str, Modifier modifier, String str2, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        String str3;
        int i3;
        Modifier modifier2;
        int i4;
        String str4;
        int i5;
        Function0 function02;
        int i6;
        Modifier modifier3;
        String str5;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        String str6;
        Modifier wrapContentHeight;
        ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1537265182);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            str3 = str;
            i3 = (gapComposer.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                str4 = str2;
                i3 |= gapComposer.changed(str4) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
                    i6 = i3 | 24576;
                    if ((196608 & i) == 0) {
                        i6 |= gapComposer.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                    if (gapComposer.shouldExecute(i6 & 1, (74899 & i6) == 74898)) {
                        gapComposer.skipToGroupEnd();
                        modifier3 = modifier2;
                        str5 = str4;
                    } else {
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        if (i8 != 0) {
                            modifier2 = companion;
                        }
                        if (i4 != 0) {
                            i7 = i5;
                            str6 = null;
                        } else {
                            i7 = i5;
                            str6 = str4;
                        }
                        if (i7 != 0) {
                            function02 = null;
                        }
                        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier2);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        int i9 = i6;
                        Modifier modifier4 = modifier2;
                        ViewfinderDefaults.SectionHeader(str3, (Modifier) null, str6, function02, (String) null, gapComposer, 65422 & i6, 2);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                        wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, wrapContentHeight);
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        composableLambdaImpl2 = composableLambdaImpl;
                        Recorder$$ExternalSyntheticOutline1.m(((i9 >> 12) & 112) | 6, composableLambdaImpl2, ColumnScopeInstance.INSTANCE, gapComposer, true);
                        gapComposer.end(true);
                        str5 = str6;
                        modifier3 = modifier4;
                    }
                    Function0 function03 = function02;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3((Object) str, modifier3, (Object) str5, (Object) function03, (Object) composableLambdaImpl2, i, i2, 16);
                        return;
                    }
                    return;
                }
                function02 = function0;
                i6 = i3 | 24576;
                if ((196608 & i) == 0) {
                }
                if (gapComposer.shouldExecute(i6 & 1, (74899 & i6) == 74898)) {
                }
                Function0 function032 = function02;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str4 = str2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            i6 = i3 | 24576;
            if ((196608 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i6 & 1, (74899 & i6) == 74898)) {
            }
            Function0 function0322 = function02;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str4 = str2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        i6 = i3 | 24576;
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i6 & 1, (74899 & i6) == 74898)) {
        }
        Function0 function03222 = function02;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static ViewEvent.Synthetics fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("test_id").getAsString();
            String asString2 = jsonObject.get("result_id").getAsString();
            JsonElement jsonElement = jsonObject.get("injected");
            Boolean valueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
            asString.getClass();
            asString2.getClass();
            return new ViewEvent.Synthetics(asString, asString2, valueOf);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Synthetics", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Synthetics", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Synthetics", e3);
            return null;
        }
    }

    public static final TakeUntil takeUntil(Flow flow, Flow flow2) {
        flow.getClass();
        flow2.getClass();
        return new TakeUntil(flow, flow2);
    }
}
