package kotlin.collections;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil3.size.DimensionKt;
import com.google.common.util.concurrent.CombinedFuture;
import com.squareup.cash.graphics.views.effect.LightSource;
import com.squareup.cash.graphics.views.effect.LightSourceKt$produceLightSource$1$1;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sensors.RealLifecycleAwareSensorManagerKt$rememberSensorEvents$listener$1$1;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class SlidingWindowKt {
    public static final void checkWindowSizeStep(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) (i != i2 ? Recorder$$ExternalSyntheticOutline2.m(i, i2, "Both size ", " and step ", " must be greater than zero.") : JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "size ", " must be greater than zero.")));
        }
    }

    public static final MutableState produceLightSource(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = new CalloutKt$$ExternalSyntheticLambda1(28);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        final Function1 function1 = (Function1) rememberedValue;
        function1.getClass();
        Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            Object systemService = context.getSystemService("sensor");
            systemService.getClass();
            rememberedValue3 = (SensorManager) systemService;
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        SensorManager sensorManager = (SensorManager) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = sensorManager.getDefaultSensor(4);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Object obj2 = (Sensor) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        Continuation continuation = null;
        int i = 0;
        if (rememberedValue5 == obj) {
            rememberedValue5 = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        final MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj) {
            rememberedValue6 = new SensorEventListener() { // from class: com.squareup.cash.sensors.RealLifecycleAwareSensorManagerKt$rememberSensorEvents$listener$1$1
                @Override // android.hardware.SensorEventListener
                public final void onAccuracyChanged(Sensor sensor, int i2) {
                }

                @Override // android.hardware.SensorEventListener
                public final void onSensorChanged(SensorEvent sensorEvent) {
                    if (sensorEvent != null) {
                        JobKt.launch$default(CoroutineScope.this, null, null, new BasicShieetKt$BasicShieet$4$1(mutableSharedFlow, function1, sensorEvent, null, 11), 3);
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        RealLifecycleAwareSensorManagerKt$rememberSensorEvents$listener$1$1 realLifecycleAwareSensorManagerKt$rememberSensorEvents$listener$1$1 = (RealLifecycleAwareSensorManagerKt$rememberSensorEvents$listener$1$1) rememberedValue6;
        boolean changedInstance = gapComposer.changedInstance(obj2) | gapComposer.changedInstance(mutableSharedFlow);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue7 == obj) {
            Object basicShieetKt$BasicShieet$4$1 = new BasicShieetKt$BasicShieet$4$1(obj2, mutableSharedFlow, function1, continuation, 10);
            gapComposer.updateRememberedValue(basicShieetKt$BasicShieet$4$1);
            rememberedValue7 = basicShieetKt$BasicShieet$4$1;
        }
        Updater.LaunchedEffect(gapComposer, obj2, (Function2) rememberedValue7);
        boolean changedInstance2 = gapComposer.changedInstance(obj2) | gapComposer.changedInstance(sensorManager);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue8 == obj) {
            rememberedValue8 = new CardTransitionKt$$ExternalSyntheticLambda4(7, obj2, sensorManager, realLifecycleAwareSensorManagerKt$rememberSensorEvents$listener$1$1);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        DimensionKt.LifecycleResumeEffect(obj2, null, (Function1) rememberedValue8, gapComposer, 0);
        LightSource lightSource = LightSource.Default;
        boolean changed = ((GapComposer) composer).changed(false);
        GapComposer gapComposer2 = (GapComposer) composer;
        boolean changedInstance3 = changed | gapComposer2.changedInstance(mutableSharedFlow);
        Object rememberedValue9 = gapComposer2.rememberedValue();
        if (changedInstance3 || rememberedValue9 == obj) {
            rememberedValue9 = new LightSourceKt$produceLightSource$1$1(mutableSharedFlow, continuation, i);
            gapComposer2.updateRememberedValue(rememberedValue9);
        }
        return Updater.produceState(gapComposer2, lightSource, (Function2) rememberedValue9);
    }

    public static final Iterator windowedIterator(Iterator it, int i, int i2, boolean z, boolean z2) {
        it.getClass();
        return !it.hasNext() ? EmptyIterator.INSTANCE : SequencesKt__SequenceBuilderKt.iterator(new SlidingWindowKt$windowedIterator$1(i, i2, it, z2, z, null));
    }

    public abstract void compareAndSetSeenExceptions(CombinedFuture combinedFuture, Set set);

    public abstract int decrementAndGetRemainingCount(CombinedFuture combinedFuture);
}
