package com.squareup.util.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import okhttp3.Headers;

/* loaded from: classes5.dex */
public abstract class LifecycleKt {
    public static final void LifecycleLaunchedEffect(Object[] objArr, LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2 function2, Composer composer, int i) {
        function2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-671984804);
        int i2 = i | 400 | (gapComposer.changedInstance(function2) ? 2048 : 1024);
        gapComposer.startMovableGroup(-1532301235, Integer.valueOf(objArr.length));
        int i3 = i2 | (gapComposer.changed(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= gapComposer.changedInstance(obj) ? 4 : 0;
        }
        gapComposer.end(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                lifecycleOwner = (LifecycleOwner) gapComposer.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
                state = Lifecycle.State.RESUMED;
            } else {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Headers.Builder builder = new Headers.Builder(2);
            builder.add(lifecycleOwner);
            builder.addSpread(objArr);
            ArrayList arrayList = builder.namesAndValues;
            Object[] array2 = arrayList.toArray(new Object[arrayList.size()]);
            boolean changedInstance = gapComposer.changedInstance(lifecycleOwner) | gapComposer.changedInstance(function2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LifecycleKt$LifecycleLaunchedEffect$2$1(lifecycleOwner, state, function2, null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(array2, (Function2) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Lifecycle.State state2 = state;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(objArr, i, lifecycleOwner2, state2, function2, 0);
        }
    }
}
