package com.squareup.workflow1;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.ecr.BuildConfig;
import com.squareup.scannerview.ScannerView;
import com.squareup.workflow1.Worker;
import com.squareup.workflow1.WorkflowIdentifier;
import com.squareup.workflow1.Workflows;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class Workflows {
    /* renamed from: ArcadeBottomNavigation-bogVsAg, reason: not valid java name */
    public static final void m4003ArcadeBottomNavigationbogVsAg(final Modifier modifier, final List list, final Integer num, final boolean z, final long j, final long j2, final Function1 function1, final ElementBoundsRegistry elementBoundsRegistry, Composer composer, final int i) {
        int i2;
        boolean z2;
        Function1 function12;
        GapComposer gapComposer;
        long j3;
        int i3;
        boolean z3;
        long j4;
        list.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1576997650);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= gapComposer2.changed(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(j) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(j2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            function12 = function1;
            i2 |= gapComposer2.changedInstance(function12) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            function12 = function1;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changedInstance(elementBoundsRegistry) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer2.startReplaceGroup(628730424);
            if (j != 16) {
                j3 = j;
            } else {
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j3 = colors.component.bottomNavigation.icon.selected;
            }
            gapComposer2.end(false);
            gapComposer2.startReplaceGroup(628734487);
            if (j2 != 16) {
                i3 = i2;
                j4 = j2;
                z3 = false;
            } else {
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                i3 = i2;
                if (colors2 == null) {
                    z3 = false;
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    z3 = false;
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j4 = colors2.component.bottomNavigation.icon.f147default;
            }
            gapComposer2.end(z3);
            gapComposer = gapComposer2;
            ModalKt.BottomNavigation(modifier, z2, TransactorKt.m1173invokeRGew2ao(0L, j3, j4, gapComposer2, 1), Expect_jvmKt.rememberComposableLambda(-296348284, new ComposeDialogKt$$ExternalSyntheticLambda12(list, num, elementBoundsRegistry, function12, 27), gapComposer2), gapComposer, (i3 & 14) | 3072 | ((i3 >> 6) & 112));
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    Workflows.m4003ArcadeBottomNavigationbogVsAg(Modifier.this, list, num, z, j, j2, function1, elementBoundsRegistry, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static EmitWorkerOutputAction action$default(StatefulWorkflow statefulWorkflow, Function1 function1) {
        statefulWorkflow.getClass();
        return new EmitWorkerOutputAction(function1, new Workflows__WorkflowActionKt$action$1("", 10), statefulWorkflow);
    }

    public static TelemetryDebugEvent.Telemetry fromJsonObject(JsonObject jsonObject) {
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        jsonObject.getClass();
        try {
            JsonElement jsonElement = jsonObject.get("device");
            TelemetryDebugEvent.Device fromJsonObject = (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) ? null : Worker.DefaultImpls.fromJsonObject(asJsonObject2);
            JsonElement jsonElement2 = jsonObject.get("os");
            TelemetryDebugEvent.Os fromJsonObject2 = (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) ? null : WorkflowIdentifier.Companion.fromJsonObject(asJsonObject);
            JsonElement jsonElement3 = jsonObject.get("type");
            String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
            String asString2 = jsonObject.get("status").getAsString();
            String asString3 = jsonObject.get("message").getAsString();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (!ArraysKt___ArraysKt.contains(TelemetryDebugEvent.Telemetry.RESERVED_PROPERTIES, entry.getKey())) {
                    String key = entry.getKey();
                    key.getClass();
                    linkedHashMap.put(key, entry.getValue());
                }
            }
            if (asString != null && !asString.equals("log")) {
                throw new IllegalStateException("Check failed.");
            }
            if (!Intrinsics.areEqual(asString2, BuildConfig.BUILD_TYPE)) {
                throw new IllegalStateException("Check failed.");
            }
            asString3.getClass();
            return new TelemetryDebugEvent.Telemetry(fromJsonObject, fromJsonObject2, asString3, linkedHashMap);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Telemetry", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Telemetry", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Telemetry", e3);
            return null;
        }
    }

    public static final WorkflowIdentifier getIdentifier(StatefulWorkflow statefulWorkflow) {
        statefulWorkflow.getClass();
        WorkerWorkflow workerWorkflow = statefulWorkflow instanceof WorkerWorkflow ? (WorkerWorkflow) statefulWorkflow : null;
        return new WorkflowIdentifier(Reflection.factory.getOrCreateKotlinClass(statefulWorkflow.getClass()), workerWorkflow == null ? null : workerWorkflow.realIdentifier, workerWorkflow != null ? new ScannerView.AnonymousClass1(0, workerWorkflow, WorkerWorkflow.class, "describeRealIdentifier", "describeRealIdentifier()Ljava/lang/String;", 0, 4) : null);
    }

    public static final void runningWorker(BaseRenderContext baseRenderContext, Worker worker, KType kType, String str, Function1 function1) {
        baseRenderContext.getClass();
        worker.getClass();
        kType.getClass();
        str.getClass();
        baseRenderContext.renderChild(new WorkerWorkflow(kType, str), worker, str, function1);
    }

    public static Workflows__WorkflowActionKt$action$2 action$default(Function1 function1) {
        int i = 0;
        return new Workflows__WorkflowActionKt$action$2(i, function1, new Workflows__WorkflowActionKt$action$1("", i));
    }
}
