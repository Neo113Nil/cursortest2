package com.squareup.cash.tabs.viewmodels;

import androidx.media3.muxer.Av1ConfigUtil;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TabToolbarViewModel$TabToolbarTitle$TextTitle extends Av1ConfigUtil {
    public final String title;

    public TabToolbarViewModel$TabToolbarTitle$TextTitle(String str) {
        str.getClass();
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TabToolbarViewModel$TabToolbarTitle$TextTitle) && Intrinsics.areEqual(this.title, ((TabToolbarViewModel$TabToolbarTitle$TextTitle) obj).title);
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextTitle(title=", this.title, ")");
    }
}
