package kotlin.io;

import android.view.Display;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.google.common.primitives.Longs;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractFutureState;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.EngineSurfaceTarget;
import com.squareup.cash.graphics.swampgl.EngineSurfaceViewTarget;
import com.squareup.cash.graphics.swampgl.PerformanceMetrics;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.graphics.views.effect.GLSurfaceConfig$SurfaceView;
import com.squareup.cash.graphics.views.effect.GLSurfaceConfig$TextureView;
import com.squareup.cash.graphics.views.effect.SwampGLEffectKt$SwampGLEffect$6$1;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class ByteStreamsKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwampGLEffect(Modifier modifier, Engine engine, Scene scene, Longs longs, boolean z, Function1 function1, Function1 function12, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        Function1 function13;
        int i6;
        Function1 function14;
        Longs longs2;
        Function1 function15;
        Function1 function16;
        boolean z3;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Display.Mode mode;
        Function1 function17;
        Function1 function18;
        Throwable th;
        MutableState mutableState;
        Function1 function19;
        Throwable th2;
        MutableState mutableState2;
        boolean z4;
        MutableState mutableState3;
        Function1 function110;
        boolean z5;
        MutableState mutableState4;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Modifier.Companion companion;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        boolean z6;
        ?? r3;
        boolean z7;
        GapComposer gapComposer2;
        Modifier modifier2;
        MutableState mutableState5;
        boolean z8;
        engine.getClass();
        scene.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1343745833);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer3.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? gapComposer3.changed(engine) : gapComposer3.changedInstance(engine) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= (i & 512) == 0 ? gapComposer3.changed(scene) : gapComposer3.changedInstance(scene) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer3.changed(longs) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= gapComposer3.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    function13 = function1;
                } else {
                    function13 = function1;
                    if ((i & 196608) == 0) {
                        i3 |= gapComposer3.changedInstance(function13) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    function14 = function12;
                } else {
                    function14 = function12;
                    if ((i & 1572864) == 0) {
                        i3 |= gapComposer3.changedInstance(function14) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                }
                int i8 = 1;
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 599187) != 599186)) {
                    Longs longs3 = i7 != 0 ? GLSurfaceConfig$TextureView.INSTANCE : longs;
                    boolean z9 = i4 != 0 ? false : z2;
                    Object obj = Composer.Companion.Empty;
                    if (i5 != 0) {
                        Object rememberedValue = gapComposer3.rememberedValue();
                        if (rememberedValue == obj) {
                            rememberedValue = new ActivityItemLayout$$ExternalSyntheticLambda4(i8);
                            gapComposer3.updateRememberedValue(rememberedValue);
                        }
                        function13 = (Function1) rememberedValue;
                    }
                    if (i6 != 0) {
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (rememberedValue2 == obj) {
                            rememberedValue2 = new ActivityItemLayout$$ExternalSyntheticLambda4(2);
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        function14 = (Function1) rememberedValue2;
                    }
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) gapComposer3.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    View view = (View) gapComposer3.consume(AndroidCompositionLocals_androidKt.LocalView);
                    boolean changed = gapComposer3.changed(view);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed || rememberedValue3 == obj) {
                        Display display = view.getDisplay();
                        float refreshRate = (display == null || (mode = display.getMode()) == null) ? display != null ? display.getRefreshRate() : 60.0f : mode.getRefreshRate();
                        if (refreshRate < 60.0f) {
                            refreshRate = 60.0f;
                        }
                        rememberedValue3 = Float.valueOf(refreshRate);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    float floatValue = ((Number) rememberedValue3).floatValue();
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (rememberedValue4 == obj) {
                        rememberedValue4 = Updater.mutableStateOf$default(Float.valueOf(RecyclerView.DECELERATION_RATE));
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    MutableState mutableState6 = (MutableState) rememberedValue4;
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (rememberedValue5 == obj) {
                        rememberedValue5 = Updater.mutableStateOf$default(Float.valueOf(floatValue));
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    MutableState mutableState7 = (MutableState) rememberedValue5;
                    int i9 = i3 & 112;
                    boolean z10 = z9;
                    int i10 = i3 & 896;
                    int i11 = i3 & 7168;
                    boolean changed2 = (i9 == 32 || ((i3 & 64) != 0 && gapComposer3.changed(engine))) | (i10 == 256 || ((i3 & 512) != 0 && gapComposer3.changed(scene))) | gapComposer3.changed(floatValue) | (i11 == 2048);
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue6 == obj) {
                        if (longs3 instanceof GLSurfaceConfig$TextureView) {
                            function17 = function14;
                            rememberedValue6 = new EngineSurfaceTarget(engine, scene, floatValue, new CashMapViewKt$$ExternalSyntheticLambda3(function13, mutableState6, 14));
                        } else {
                            function17 = function14;
                            rememberedValue6 = null;
                        }
                        gapComposer3.updateRememberedValue(rememberedValue6);
                    } else {
                        function17 = function14;
                    }
                    final EngineSurfaceTarget engineSurfaceTarget = (EngineSurfaceTarget) rememberedValue6;
                    boolean changed3 = (i9 == 32 || ((i3 & 64) != 0 && gapComposer3.changed(engine))) | (i10 == 256 || ((i3 & 512) != 0 && gapComposer3.changed(scene))) | gapComposer3.changed(floatValue) | (i11 == 2048);
                    Object rememberedValue7 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue7 == obj) {
                        EngineSurfaceViewTarget engineSurfaceViewTarget = longs3 instanceof GLSurfaceConfig$SurfaceView ? new EngineSurfaceViewTarget(engine, scene, floatValue) : null;
                        gapComposer3.updateRememberedValue(engineSurfaceViewTarget);
                        rememberedValue7 = engineSurfaceViewTarget;
                    }
                    final EngineSurfaceViewTarget engineSurfaceViewTarget2 = (EngineSurfaceViewTarget) rememberedValue7;
                    boolean changedInstance = gapComposer3.changedInstance(engineSurfaceTarget);
                    Object rememberedValue8 = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue8 == obj) {
                        final int i12 = 0;
                        rememberedValue8 = new Function1() { // from class: com.squareup.cash.graphics.views.effect.SwampGLEffectKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i13 = i12;
                                EngineSurfaceTarget engineSurfaceTarget2 = engineSurfaceTarget;
                                switch (i13) {
                                    case 0:
                                        ((DisposableEffectScope) obj2).getClass();
                                        break;
                                    case 1:
                                        ((TextureView) obj2).getClass();
                                        engineSurfaceTarget2.destroyInternal();
                                        break;
                                    default:
                                        TextureView textureView = (TextureView) obj2;
                                        textureView.getClass();
                                        textureView.setSurfaceTextureListener(engineSurfaceTarget2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(rememberedValue8);
                    }
                    Updater.DisposableEffect(engineSurfaceTarget, (Function1) rememberedValue8, gapComposer3);
                    boolean changedInstance2 = gapComposer3.changedInstance(engineSurfaceViewTarget2);
                    Object rememberedValue9 = gapComposer3.rememberedValue();
                    if (changedInstance2 || rememberedValue9 == obj) {
                        final int i13 = 1;
                        rememberedValue9 = new Function1() { // from class: com.squareup.cash.graphics.views.effect.SwampGLEffectKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i14 = i13;
                                EngineSurfaceViewTarget engineSurfaceViewTarget3 = engineSurfaceViewTarget2;
                                switch (i14) {
                                    case 0:
                                        ((SurfaceView) obj2).getClass();
                                        engineSurfaceViewTarget3.explicitlyDestroyed = true;
                                        engineSurfaceViewTarget3.destroyInternal();
                                        return Unit.INSTANCE;
                                    default:
                                        ((DisposableEffectScope) obj2).getClass();
                                        return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(engineSurfaceViewTarget3, 22);
                                }
                            }
                        };
                        gapComposer3.updateRememberedValue(rememberedValue9);
                    }
                    Updater.DisposableEffect(engineSurfaceViewTarget2, (Function1) rememberedValue9, gapComposer3);
                    boolean changedInstance3 = gapComposer3.changedInstance(engineSurfaceTarget) | gapComposer3.changedInstance(engineSurfaceViewTarget2) | gapComposer3.changedInstance(lifecycleOwner);
                    Object rememberedValue10 = gapComposer3.rememberedValue();
                    if (changedInstance3 || rememberedValue10 == obj) {
                        rememberedValue10 = new GpsConfigQueries$$ExternalSyntheticLambda3(14, lifecycleOwner, engineSurfaceTarget, engineSurfaceViewTarget2);
                        gapComposer3.updateRememberedValue(rememberedValue10);
                    }
                    Updater.DisposableEffect(lifecycleOwner, engineSurfaceTarget, engineSurfaceViewTarget2, (Function1) rememberedValue10, gapComposer3);
                    MutableState collectAsState = Updater.collectAsState(scene.performanceTracker.metrics, null, gapComposer3, 1);
                    Unit unit = Unit.INSTANCE;
                    boolean changed4 = ((3670016 & i3) == 1048576) | gapComposer3.changed(collectAsState);
                    Object rememberedValue11 = gapComposer3.rememberedValue();
                    if (changed4 || rememberedValue11 == obj) {
                        function18 = function17;
                        th = null;
                        rememberedValue11 = new SwampGLEffectKt$SwampGLEffect$6$1(function18, collectAsState, (Continuation) null);
                        gapComposer3.updateRememberedValue(rememberedValue11);
                    } else {
                        function18 = function17;
                        th = null;
                    }
                    Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue11);
                    boolean z11 = longs3 instanceof GLSurfaceConfig$SurfaceView;
                    if (z11) {
                        gapComposer3.startReplaceGroup(1861234940);
                        boolean changed5 = ((i3 & 458752) == 131072) | gapComposer3.changed(collectAsState);
                        Object rememberedValue12 = gapComposer3.rememberedValue();
                        if (changed5 || rememberedValue12 == obj) {
                            Function1 function111 = function13;
                            rememberedValue12 = new AnimationsKt$takeUntil$1$1.AnonymousClass1(collectAsState, function111, mutableState6, null, 25);
                            mutableState = collectAsState;
                            function19 = function111;
                            mutableState2 = mutableState6;
                            th2 = null;
                            gapComposer3.updateRememberedValue(rememberedValue12);
                        } else {
                            function19 = function13;
                            mutableState2 = mutableState6;
                            mutableState = collectAsState;
                            th2 = null;
                        }
                        Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue12);
                        z4 = false;
                        gapComposer3.end(false);
                    } else {
                        mutableState = collectAsState;
                        function19 = function13;
                        th2 = th;
                        mutableState2 = mutableState6;
                        z4 = false;
                        gapComposer3.startReplaceGroup(1861403115);
                        gapComposer3.end(false);
                    }
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z4);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, modifier);
                    ComposeUiNode.Companion.getClass();
                    Function1 function112 = function19;
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw th2;
                    }
                    gapComposer3.startReusableNode();
                    Function1 function113 = function18;
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$14);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$15);
                    gapComposer3.startMovableGroup(1305993636, gapComposer3.joinKey(longs3, scene));
                    boolean z12 = longs3 instanceof GLSurfaceConfig$TextureView;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (z12) {
                        gapComposer3.startReplaceGroup(1831170927);
                        if (engineSurfaceTarget == null) {
                            gapComposer3.startReplaceGroup(1831170926);
                            gapComposer3.end(false);
                            mutableState3 = mutableState7;
                            z8 = false;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                            companion = companion2;
                            function110 = function113;
                            z5 = z11;
                        } else {
                            gapComposer3.startReplaceGroup(1831170927);
                            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                            boolean changed6 = gapComposer3.changed(floatValue) | gapComposer3.changedInstance(engineSurfaceTarget);
                            Object rememberedValue13 = gapComposer3.rememberedValue();
                            if (changed6 || rememberedValue13 == obj) {
                                modifier2 = fillMaxSize;
                                mutableState5 = mutableState7;
                                rememberedValue13 = new ThumbNode$$ExternalSyntheticLambda0(floatValue, engineSurfaceTarget, mutableState5, 7);
                                gapComposer3.updateRememberedValue(rememberedValue13);
                            } else {
                                modifier2 = fillMaxSize;
                                mutableState5 = mutableState7;
                            }
                            Function1 function114 = (Function1) rememberedValue13;
                            boolean changedInstance4 = gapComposer3.changedInstance(engineSurfaceTarget);
                            Object rememberedValue14 = gapComposer3.rememberedValue();
                            if (changedInstance4 || rememberedValue14 == obj) {
                                final int i14 = 1;
                                rememberedValue14 = new Function1() { // from class: com.squareup.cash.graphics.views.effect.SwampGLEffectKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        int i132 = i14;
                                        EngineSurfaceTarget engineSurfaceTarget2 = engineSurfaceTarget;
                                        switch (i132) {
                                            case 0:
                                                ((DisposableEffectScope) obj2).getClass();
                                                break;
                                            case 1:
                                                ((TextureView) obj2).getClass();
                                                engineSurfaceTarget2.destroyInternal();
                                                break;
                                            default:
                                                TextureView textureView = (TextureView) obj2;
                                                textureView.getClass();
                                                textureView.setSurfaceTextureListener(engineSurfaceTarget2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                gapComposer3.updateRememberedValue(rememberedValue14);
                            }
                            Function1 function115 = (Function1) rememberedValue14;
                            boolean changedInstance5 = gapComposer3.changedInstance(engineSurfaceTarget);
                            Object rememberedValue15 = gapComposer3.rememberedValue();
                            if (changedInstance5 || rememberedValue15 == obj) {
                                final int i15 = 2;
                                rememberedValue15 = new Function1() { // from class: com.squareup.cash.graphics.views.effect.SwampGLEffectKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        int i132 = i15;
                                        EngineSurfaceTarget engineSurfaceTarget2 = engineSurfaceTarget;
                                        switch (i132) {
                                            case 0:
                                                ((DisposableEffectScope) obj2).getClass();
                                                break;
                                            case 1:
                                                ((TextureView) obj2).getClass();
                                                engineSurfaceTarget2.destroyInternal();
                                                break;
                                            default:
                                                TextureView textureView = (TextureView) obj2;
                                                textureView.getClass();
                                                textureView.setSurfaceTextureListener(engineSurfaceTarget2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                gapComposer3.updateRememberedValue(rememberedValue15);
                            }
                            Function1 function116 = (Function1) rememberedValue15;
                            mutableState3 = mutableState5;
                            z5 = z11;
                            function110 = function113;
                            z8 = false;
                            companion = companion2;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                            AndroidView_androidKt.AndroidView(function114, modifier2, null, function115, function116, gapComposer3, 48, 4);
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(z8);
                        r3 = z8;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    } else {
                        mutableState3 = mutableState7;
                        function110 = function113;
                        z5 = z11;
                        final int i16 = 0;
                        gapComposer3.startReplaceGroup(1831776295);
                        longs3.getClass();
                        GLSurfaceConfig$SurfaceView gLSurfaceConfig$SurfaceView = (GLSurfaceConfig$SurfaceView) longs3;
                        if (engineSurfaceViewTarget2 == null) {
                            gapComposer3.startReplaceGroup(1831871185);
                            gapComposer3.end(false);
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                            companion = companion2;
                            z6 = false;
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        } else {
                            gapComposer3.startReplaceGroup(1831871186);
                            Object rememberedValue16 = gapComposer3.rememberedValue();
                            if (rememberedValue16 == obj) {
                                rememberedValue16 = Updater.mutableStateOf$default(engineSurfaceViewTarget2);
                                gapComposer3.updateRememberedValue(rememberedValue16);
                            }
                            MutableState mutableState8 = (MutableState) rememberedValue16;
                            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                            boolean changedInstance6 = (i11 == 2048) | gapComposer3.changedInstance(engineSurfaceViewTarget2) | gapComposer3.changed(floatValue);
                            Object rememberedValue17 = gapComposer3.rememberedValue();
                            if (changedInstance6 || rememberedValue17 == obj) {
                                rememberedValue17 = new SliderKt$$ExternalSyntheticLambda8(gLSurfaceConfig$SurfaceView, engineSurfaceViewTarget2, floatValue, mutableState8, mutableState3);
                                mutableState4 = mutableState8;
                                gapComposer3.updateRememberedValue(rememberedValue17);
                            } else {
                                mutableState4 = mutableState8;
                            }
                            Function1 function117 = (Function1) rememberedValue17;
                            boolean changedInstance7 = gapComposer3.changedInstance(engineSurfaceViewTarget2);
                            Object rememberedValue18 = gapComposer3.rememberedValue();
                            if (changedInstance7 || rememberedValue18 == obj) {
                                rememberedValue18 = new Function1() { // from class: com.squareup.cash.graphics.views.effect.SwampGLEffectKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        int i142 = i16;
                                        EngineSurfaceViewTarget engineSurfaceViewTarget3 = engineSurfaceViewTarget2;
                                        switch (i142) {
                                            case 0:
                                                ((SurfaceView) obj2).getClass();
                                                engineSurfaceViewTarget3.explicitlyDestroyed = true;
                                                engineSurfaceViewTarget3.destroyInternal();
                                                return Unit.INSTANCE;
                                            default:
                                                ((DisposableEffectScope) obj2).getClass();
                                                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(engineSurfaceViewTarget3, 22);
                                        }
                                    }
                                };
                                gapComposer3.updateRememberedValue(rememberedValue18);
                            }
                            Function1 function118 = (Function1) rememberedValue18;
                            boolean changedInstance8 = gapComposer3.changedInstance(engineSurfaceViewTarget2);
                            Object rememberedValue19 = gapComposer3.rememberedValue();
                            if (changedInstance8 || rememberedValue19 == obj) {
                                rememberedValue19 = new GLSceneScope$$ExternalSyntheticLambda10(11, engineSurfaceViewTarget2, mutableState4);
                                gapComposer3.updateRememberedValue(rememberedValue19);
                            }
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                            companion = companion2;
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                            z6 = false;
                            AndroidView_androidKt.AndroidView(function117, fillMaxSize2, null, function118, (Function1) rememberedValue19, gapComposer3, 48, 4);
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(z6);
                        r3 = z6;
                    }
                    gapComposer3.end(r3);
                    if (z10) {
                        gapComposer3.startReplaceGroup(1833016760);
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.TopEnd), RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 9);
                        int i17 = Color.$r8$clinit;
                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(m302paddingqDBjuR0$default, Color.m675copywmQWz5c$default(0.7f, Color.Black, 14), ColorKt.RectangleShape), 8.0f);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, r3);
                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m298padding3ABfNKs);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw th2;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$1, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                        float floatValue2 = ((Number) mutableState3.getValue()).floatValue();
                        if (floatValue2 < 60.0f) {
                            floatValue2 = 60.0f;
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 3456, 0, 4082, Color.Yellow, (Composer) gapComposer3, (Modifier) null, new TextStyle(0L, Room.getSp(12), null, null, 0L, 0L, 0, 0, 0L, null, 16777213), (TextLineBalancing) null, (z5 ? "SurfaceView" : "TextureView") + " | " + ((int) floatValue2) + "Hz (target " + ((int) (1000.0f / floatValue2)) + "ms)", (Map) null, (Function1) null, false);
                        String m = Boxes$$ExternalSyntheticOutline1.m(((PerformanceMetrics) mutableState.getValue()).timeToFirstFrameMs, "First Frame: ", "ms");
                        long j = Color.White;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 3456, 0, 4082, j, (Composer) gapComposer3, (Modifier) null, new TextStyle(0L, Room.getSp(12), null, null, 0L, 0L, 0, 0, 0L, null, 16777213), (TextLineBalancing) null, m, (Map) null, (Function1) null, false);
                        Room.m1165Text25TpFw(0, 0, 0, 0, MLKEMEngine.KyberPolyBytes, 0, 4082, ((Number) mutableState2.getValue()).floatValue() >= floatValue2 * 0.9f ? Color.Green : Color.Red, (Composer) gapComposer3, (Modifier) null, new TextStyle(0L, Room.getSp(14), null, null, 0L, 0L, 0, 0, 0L, null, 16777213), (TextLineBalancing) null, "Perceived FPS (" + (z5 ? "GL" : "UI") + "): " + ((int) ((Number) mutableState2.getValue()).floatValue()), (Map) null, (Function1) null, false);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 3456, 0, 4082, j, (Composer) gapComposer3, (Modifier) null, new TextStyle(0L, Room.getSp(12), null, null, 0L, 0L, 0, 0, 0L, null, 16777213), (TextLineBalancing) null, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((int) ((PerformanceMetrics) mutableState.getValue()).fps, "Engine FPS: "), (Map) null, (Function1) null, false);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 3456, 0, 4082, j, (Composer) gapComposer3, (Modifier) null, new TextStyle(0L, Room.getSp(12), null, null, 0L, 0L, 0, 0, 0L, null, 16777213), (TextLineBalancing) null, Boxes$$ExternalSyntheticOutline1.m(((PerformanceMetrics) mutableState.getValue()).frameTimeMs, "Frame Time: ", "ms"), (Map) null, (Function1) null, false);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 3456, 0, 4082, j, (Composer) gapComposer3, (Modifier) null, new TextStyle(0L, Room.getSp(12), null, null, 0L, 0L, 0, 0, 0L, null, 16777213), (TextLineBalancing) null, Recorder$$ExternalSyntheticOutline2.m("Entities: ", ((PerformanceMetrics) mutableState.getValue()).visibleEntityCount, ((PerformanceMetrics) mutableState.getValue()).entityCount, "/"), (Map) null, (Function1) null, false);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 3456, 0, 4082, j, (Composer) gapComposer3, (Modifier) null, new TextStyle(0L, Room.getSp(12), null, null, 0L, 0L, 0, 0, 0L, null, 16777213), (TextLineBalancing) null, Recorder$$ExternalSyntheticOutline2.m("Viewport: ", ((PerformanceMetrics) mutableState.getValue()).viewportWidth, ((PerformanceMetrics) mutableState.getValue()).viewportHeight, "x"), (Map) null, (Function1) null, false);
                        GapComposer gapComposer4 = gapComposer3;
                        z7 = true;
                        gapComposer4.end(true);
                        gapComposer4.end(r3);
                        gapComposer2 = gapComposer4;
                    } else {
                        z7 = true;
                        gapComposer3.startReplaceGroup(1834793649);
                        gapComposer3.end(r3);
                        gapComposer2 = gapComposer3;
                    }
                    gapComposer2.end(z7);
                    function16 = function112;
                    longs2 = longs3;
                    function15 = function110;
                    z3 = z10;
                    gapComposer = gapComposer2;
                } else {
                    gapComposer3.skipToGroupEnd();
                    longs2 = longs;
                    function15 = function14;
                    function16 = function13;
                    z3 = z2;
                    gapComposer = gapComposer3;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda4(modifier, engine, scene, longs2, z3, function16, function15, i, i2);
                    return;
                }
                return;
            }
            z2 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            int i82 = 1;
            if (gapComposer3.shouldExecute(i3 & 1, (i3 & 599187) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        int i822 = 1;
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 599187) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static long copyTo$default(InputStream inputStream, OutputStream outputStream) {
        inputStream.getClass();
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static Object get(AbstractFuture abstractFuture, long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        abstractFuture.getClass();
        AbstractFutureState.Waiter waiter = AbstractFutureState.Waiter.TOMBSTONE;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = abstractFuture.valueField;
        if ((obj != null) && (!(obj instanceof AbstractFuture.DelegatingToFuture))) {
            return AbstractFuture.getDoneValue$1(obj);
        }
        long j3 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            AbstractFutureState.Waiter waiter2 = abstractFuture.waitersField;
            if (waiter2 != waiter) {
                AbstractFutureState.Waiter waiter3 = new AbstractFutureState.Waiter();
                z = true;
                while (true) {
                    Countries countries = AbstractFutureState.ATOMIC_HELPER;
                    countries.putNext(waiter3, waiter2);
                    if (countries.casWaiters(abstractFuture, waiter2, waiter3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(abstractFuture, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                abstractFuture.removeWaiter(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = abstractFuture.valueField;
                            if ((obj2 != null) && (!(obj2 instanceof AbstractFuture.DelegatingToFuture))) {
                                return AbstractFuture.getDoneValue$1(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        abstractFuture.removeWaiter(waiter3);
                    } else {
                        long j4 = j3;
                        waiter2 = abstractFuture.waitersField;
                        if (waiter2 == waiter) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = abstractFuture.valueField;
            Objects.requireNonNull(obj3);
            return AbstractFuture.getDoneValue$1(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = abstractFuture.valueField;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof AbstractFuture.DelegatingToFuture))) {
                return AbstractFuture.getDoneValue$1(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFuture2 = abstractFuture.toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "Waited ", " ");
        m1149m.append(timeUnit.toString().toLowerCase(locale));
        String sb = m1149m.toString();
        if (nanos + 1000 < j2) {
            String concat = sb.concat(" (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z2 = (convert == j2 || nanos2 > 1000) ? z : false;
            if (convert > j2) {
                String str = concat + convert + " " + lowerCase;
                if (z2) {
                    str = str.concat(",");
                }
                concat = str.concat(" ");
            }
            if (z2) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            sb = concat.concat("delay)");
        }
        if (abstractFuture.isDone()) {
            throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(Recorder$$ExternalSyntheticOutline2.m(sb, " for ", abstractFuture2));
    }

    public static void interruptCurrentThread() {
        Thread.currentThread().interrupt();
    }

    public static final byte[] readBytes(InputStream inputStream) {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(PKIFailureInfo.certRevoked, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static void restoreInterruptIfIsInterruptedException(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static void rethrowIfErrorOtherThanStackOverflow(Throwable th) {
        if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
            throw ((Error) th);
        }
    }

    public static Object get(AbstractFuture abstractFuture) {
        Object obj;
        abstractFuture.getClass();
        AbstractFutureState.Waiter waiter = AbstractFutureState.Waiter.TOMBSTONE;
        if (!Thread.interrupted()) {
            Object obj2 = abstractFuture.valueField;
            if ((obj2 != null) & (!(obj2 instanceof AbstractFuture.DelegatingToFuture))) {
                return AbstractFuture.getDoneValue$1(obj2);
            }
            AbstractFutureState.Waiter waiter2 = abstractFuture.waitersField;
            if (waiter2 != waiter) {
                AbstractFutureState.Waiter waiter3 = new AbstractFutureState.Waiter();
                do {
                    Countries countries = AbstractFutureState.ATOMIC_HELPER;
                    countries.putNext(waiter3, waiter2);
                    if (countries.casWaiters(abstractFuture, waiter2, waiter3)) {
                        do {
                            LockSupport.park(abstractFuture);
                            if (!Thread.interrupted()) {
                                obj = abstractFuture.valueField;
                            } else {
                                abstractFuture.removeWaiter(waiter3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof AbstractFuture.DelegatingToFuture))));
                        return AbstractFuture.getDoneValue$1(obj);
                    }
                    waiter2 = abstractFuture.waitersField;
                } while (waiter2 != waiter);
            }
            Object obj3 = abstractFuture.valueField;
            Objects.requireNonNull(obj3);
            return AbstractFuture.getDoneValue$1(obj3);
        }
        throw new InterruptedException();
    }
}
