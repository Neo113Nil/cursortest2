package com.squareup.util.coroutines;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import coil3.compose.AsyncImageKt;
import coil3.size.SizeKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.widgets.LinkStyle;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.workflow1.TimerWorker$run$1;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class FirstOrNullOnTimeoutKt {
    public static final void UpSellButton(Modifier modifier, LinkStyle linkStyle, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1507184926);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(linkStyle.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            int ordinal = linkStyle.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-957840915);
                SizeKt.Button(function0, modifier, null, false, false, null, composableLambdaImpl, gapComposer, ((i2 >> 6) & 14) | ((i2 << 3) & 112) | ((i2 << 9) & 3670016), 60);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1000730322, false);
                }
                gapComposer.startReplaceGroup(-957732756);
                SizeKt.Button(function0, modifier, ButtonProminence.SUBTLE, false, false, null, composableLambdaImpl, gapComposer, ((i2 >> 6) & 14) | MLKEMEngine.KyberPolyBytes | ((i2 << 3) & 112) | ((i2 << 9) & 3670016), 56);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(modifier, i, linkStyle, function0, composableLambdaImpl, 27);
        }
    }

    public static final void UpsellWidget(Image image, String str, String str2, String str3, Function0 function0, Modifier modifier, LinkStyle linkStyle, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2;
        boolean z;
        char c;
        Modifier.Companion companion;
        boolean z2;
        Modifier.Companion companion2;
        boolean z3;
        String str4 = str3;
        function0.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-670028460);
        if ((i & 6) == 0) {
            i2 = (gapComposer3.changedInstance(image) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer3.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer3.changed(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer3.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer3.changed(modifier) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer3.changed(linkStyle.ordinal()) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i3 = i2;
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 599187) != 599186)) {
            Strings.getSizes(gapComposer3).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            long j = Strings.getColors(gapComposer3).semantic.border.subtle;
            Strings.getSizes(gapComposer3).getClass();
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(modifier, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Strings.getSizes(gapComposer3).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m178borderxT4_qwU, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m298padding3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            if (image == null) {
                gapComposer3.startReplaceGroup(-1860974815);
                gapComposer3.end(false);
                gapComposer2 = gapComposer3;
                z = false;
                c = 0;
            } else {
                gapComposer3.startReplaceGroup(-1860974814);
                gapComposer2 = gapComposer3;
                z = false;
                c = 0;
                AsyncImageKt.m1438AsyncImage10Xjiaw(image, null, androidx.compose.foundation.layout.SizeKt.m279heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion3, 1.0f), 118.0f, RecyclerView.DECELERATION_RATE, 2), null, null, null, gapComposer2, 432, 2040);
                Strings.getSizes(gapComposer2).getClass();
                SpacerKt.Spacer(gapComposer2, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion3, 16.0f));
                gapComposer2.end(false);
            }
            if (str == null) {
                gapComposer2.startReplaceGroup(-1860719158);
                gapComposer2.end(z);
                gapComposer = gapComposer2;
                z2 = z;
                companion = companion3;
            } else {
                gapComposer2.startReplaceGroup(-1860719157);
                gapComposer = gapComposer2;
                companion = companion3;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer2).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                z2 = false;
                gapComposer.end(false);
            }
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1860624329);
                gapComposer.end(z2);
                z3 = z2;
                companion2 = companion;
            } else {
                gapComposer.startReplaceGroup(-1860624328);
                Strings.getSizes(gapComposer).getClass();
                SpacerKt.Spacer(gapComposer, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 8.0f));
                companion2 = companion;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                z3 = false;
                gapComposer.end(false);
            }
            str4 = str3;
            if (str4 == null) {
                gapComposer.startReplaceGroup(-1860446606);
                gapComposer.end(z3);
            } else {
                gapComposer.startReplaceGroup(-1860446605);
                Modifier.Companion companion4 = companion2;
                Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion4, 16.0f, gapComposer);
                UpSellButton(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion4, 1.0f), linkStyle, function0, Expect_jvmKt.rememberComposableLambda(1794935246, new SetPinViewKt$$ExternalSyntheticLambda7(str4, 27), gapComposer), gapComposer, ((i3 >> 15) & 112) | 3078 | ((i3 >> 6) & 896));
                gapComposer.end(z3);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScaffoldKt$$ExternalSyntheticLambda5(image, str, str2, str4, function0, modifier, linkStyle, i, 8);
        }
    }

    public static final Object firstOrNullWithTimeout(SharedFlow sharedFlow, Function2 function2, ContinuationImpl continuationImpl) {
        return JobKt.withTimeoutOrNull(2000L, new TimerWorker$run$1(sharedFlow, function2, null, 20), continuationImpl);
    }

    public static ViewEvent.SlowFrame fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            return new ViewEvent.SlowFrame(jsonObject.get("start").getAsLong(), jsonObject.get("duration").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type SlowFrame", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type SlowFrame", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type SlowFrame", e3);
            return null;
        }
    }
}
