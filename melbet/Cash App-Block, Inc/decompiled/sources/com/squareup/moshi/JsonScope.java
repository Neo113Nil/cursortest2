package com.squareup.moshi;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public abstract class JsonScope {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCreatePoolNote.deepLinkSpecs;
    }

    public static String getPath(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static final State rememberMenuState(LocalBrand localBrand, GapComposer gapComposer) {
        boolean changed = gapComposer.changed(localBrand);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.derivedStateOf(new Worker$$ExternalSyntheticLambda0(localBrand, 20));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (State) rememberedValue;
    }
}
