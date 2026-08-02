package com.squareup.protos.cash.composer.app;

import app.cash.trifle.KeyHandle;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Card$Asset$Animation extends KeyHandle.Companion {
    public final Image value;

    public Card$Asset$Animation(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Card$Asset$Animation) && Intrinsics.areEqual(this.value, ((Card$Asset$Animation) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Animation(value=", ")");
    }
}
