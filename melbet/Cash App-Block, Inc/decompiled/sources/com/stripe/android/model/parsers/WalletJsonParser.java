package com.stripe.android.model.parsers;

import androidx.compose.ui.Modifier;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public abstract class WalletJsonParser implements ModelJsonParser {
    public static final Modifier provideBounds(ElementBoundsRegistry elementBoundsRegistry, ElementBoundsRegistry.Element element) {
        elementBoundsRegistry.getClass();
        return PlatformKt.composed(Modifier.Companion.$$INSTANCE, new ArcadeModal2Kt$$ExternalSyntheticLambda0(8, element, elementBoundsRegistry));
    }

    public static void zza(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "at index "));
                return;
            }
        }
    }
}
