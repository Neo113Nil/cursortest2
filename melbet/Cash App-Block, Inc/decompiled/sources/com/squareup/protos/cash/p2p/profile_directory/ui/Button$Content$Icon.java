package com.squareup.protos.cash.p2p.profile_directory.ui;

import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Button$Content$Icon extends ErrorEvent.Companion {
    public final Image value;

    public Button$Content$Icon(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Button$Content$Icon) && Intrinsics.areEqual(this.value, ((Button$Content$Icon) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Icon(value=", ")");
    }
}
