package string;

import androidx.camera.compose.SurfaceRequestScope;
import androidx.camera.compose.ViewfinderArgs;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.camera.viewfinder.core.ImplementationMode;
import androidx.camera.viewfinder.core.TransformationInfo;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.ViewfinderSurfaceRequest;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import androidx.paging.FlowExtKt$simpleScan$1;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import bo.app.h2$$ExternalSyntheticLambda0;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.PromptButtonList;
import com.squareup.cash.moneybot.components.plugins.PromptButtonListPlugin;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.wallet.views.CardTransitionKt$cardBottomNavFadeInOut$1$1;
import com.squareup.protos.cash.kgoose.api.v3.PromptButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class TrimMode {

    /* loaded from: classes10.dex */
    public final class End extends TrimMode {
        public static final End INSTANCE$1 = new End();
        public static final End INSTANCE = new End();
        public static final End INSTANCE$2 = new End();
    }

    public static final void AtmPickerGrid(int i, int i2, Composer composer, Modifier modifier, List list, Function1 function1) {
        int i3;
        list.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-699199391);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = 16;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Object[] objArr = {list};
            boolean changedInstance = gapComposer.changedInstance(list);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new h2$$ExternalSyntheticLambda0(list, 8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
            boolean changed = gapComposer.changed(parcelableSnapshotMutableIntState) | gapComposer.changedInstance(list);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SearchBarBinding$Content$1$1(list, parcelableSnapshotMutableIntState, null, i5);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, list, (Function2) rememberedValue2);
            InputChipKt.InputChipGrid(modifier, 0, Expect_jvmKt.rememberComposableLambda(-932617096, new LocalViewFactory$$ExternalSyntheticLambda6(27, list, parcelableSnapshotMutableIntState, function1), gapComposer), gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda2(modifier, list, function1, i, i2);
        }
    }

    public static final void CameraXViewfinder(SurfaceRequest surfaceRequest, ImplementationMode implementationMode, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1071821681);
        int i2 = (gapComposer.changedInstance(surfaceRequest) ? 4 : 2) | i | 3200;
        final int i3 = 1;
        if ((74899 & i2) == 74898 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                implementationMode = Intrinsics.areEqual(surfaceRequest.mCamera.getCameraInfo().getImplementationType(), "androidx.camera.camera2.legacy") ? ImplementationMode.EMBEDDED : ViewfinderDefaults.getImplementationMode();
            } else {
                gapComposer.skipToGroupEnd();
            }
            int i4 = i2 & (-897);
            gapComposer.endDefaults();
            Object rememberUpdatedState = Updater.rememberUpdatedState(implementationMode, gapComposer);
            boolean changedInstance = gapComposer.changedInstance(surfaceRequest) | gapComposer.changed(rememberUpdatedState);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            Continuation continuation = null;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new SliderDraggableState$drag$2(surfaceRequest, rememberUpdatedState, continuation, 9);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ViewfinderArgs viewfinderArgs = (ViewfinderArgs) Updater.produceState(null, surfaceRequest, (Function2) rememberedValue, gapComposer, ((i4 << 3) & 112) | 6).getValue();
            final int i5 = 0;
            if (viewfinderArgs == null) {
                gapComposer.startReplaceGroup(-1848994217);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1848994216);
                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(viewfinderArgs, gapComposer);
                boolean changed = gapComposer.changed(rememberUpdatedState2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == obj) {
                    rememberedValue2 = new CardTransitionKt$cardBottomNavFadeInOut$1$1(rememberUpdatedState2, continuation, i3);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                final SurfaceRequestScope surfaceRequestScope = (SurfaceRequestScope) Updater.produceState(gapComposer, null, (Function2) rememberedValue2).getValue();
                if (surfaceRequestScope == null) {
                    gapComposer.startReplaceGroup(1261255935);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1261255936);
                    boolean changed2 = gapComposer.changed(surfaceRequestScope);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue3 == obj) {
                        rememberedValue3 = new Function1() { // from class: androidx.camera.compose.CameraXViewfinderKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i6 = i5;
                                SurfaceRequestScope surfaceRequestScope2 = surfaceRequestScope;
                                switch (i6) {
                                    case 0:
                                        return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(surfaceRequestScope2, 2);
                                    default:
                                        ((ViewfinderInitScopeImpl) obj2).onSurfaceSession = new FlowExtKt$simpleScan$1(surfaceRequestScope2, null, 7);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Updater.DisposableEffect(surfaceRequestScope, (Function1) rememberedValue3, gapComposer);
                    ViewfinderSurfaceRequest viewfinderSurfaceRequest = surfaceRequestScope.viewfinderSurfaceRequest;
                    TransformationInfo transformationInfo = viewfinderArgs.transformationInfo;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    boolean changed3 = gapComposer.changed(surfaceRequestScope);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue4 == obj) {
                        rememberedValue4 = new Function1() { // from class: androidx.camera.compose.CameraXViewfinderKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i6 = i3;
                                SurfaceRequestScope surfaceRequestScope2 = surfaceRequestScope;
                                switch (i6) {
                                    case 0:
                                        return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(surfaceRequestScope2, 2);
                                    default:
                                        ((ViewfinderInitScopeImpl) obj2).onSurfaceSession = new FlowExtKt$simpleScan$1(surfaceRequestScope2, null, 7);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    ViewfinderKt.Viewfinder(viewfinderSurfaceRequest, fillMaxSize, transformationInfo, (Function1) rememberedValue4, gapComposer, 224256);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda0(surfaceRequest, implementationMode, i, i3);
        }
    }

    public static final PromptButtonList.PromptButton toPromptButton(ProtoValidationScope protoValidationScope, PromptButton promptButton, PatternRedaction patternRedaction) {
        String reportIfNullAndContinue;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(promptButton, patternRedaction, protoValidationScope);
            String str = promptButton.id;
            String reportIfNullAndContinue2 = protoValidationScope2.reportIfNullAndContinue(promptButton.text, "text", (String) null);
            if (reportIfNullAndContinue2 != null && (reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(promptButton.prompt, "prompt", (String) null)) != null) {
                return new PromptButtonList.PromptButton(str, reportIfNullAndContinue2, reportIfNullAndContinue, promptButton.view_cdf_events, promptButton.tap_cdf_events);
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, promptButton != null ? Reflection.factory.getOrCreateKotlinClass(PromptButton.class) : null, patternRedaction, null);
        }
    }

    public static PromptButtonList toPromptButtonList$default(PromptButtonListPlugin promptButtonListPlugin, com.squareup.protos.cash.kgoose.api.v3.PromptButtonList promptButtonList, String str) {
        PatternRedaction patternRedaction = new PatternRedaction(str, (String) null, 2);
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(promptButtonList, patternRedaction, promptButtonListPlugin);
            List<PromptButton> list = promptButtonList.buttons;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                PromptButtonList.PromptButton promptButton = toPromptButton(protoValidationScope, (PromptButton) it.next(), patternRedaction);
                if (promptButton != null) {
                    arrayList.add(promptButton);
                }
            }
            return new PromptButtonList(str, arrayList);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.PromptButtonList.class), patternRedaction, null);
        }
    }
}
