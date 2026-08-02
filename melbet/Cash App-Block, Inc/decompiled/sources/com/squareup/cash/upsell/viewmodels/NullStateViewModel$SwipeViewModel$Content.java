package com.squareup.cash.upsell.viewmodels;

import com.squareup.cash.upsell.viewmodels.UiGroupElementViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class NullStateViewModel$SwipeViewModel$Content {
    public final UiGroupElementViewModel.ButtonViewModel button;
    public final List pages;

    public NullStateViewModel$SwipeViewModel$Content(List list, UiGroupElementViewModel.ButtonViewModel buttonViewModel) {
        list.getClass();
        this.pages = list;
        this.button = buttonViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullStateViewModel$SwipeViewModel$Content)) {
            return false;
        }
        NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content = (NullStateViewModel$SwipeViewModel$Content) obj;
        return Intrinsics.areEqual(this.pages, nullStateViewModel$SwipeViewModel$Content.pages) && this.button.equals(nullStateViewModel$SwipeViewModel$Content.button);
    }

    public final int hashCode() {
        return (this.button.hashCode() + (this.pages.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "Content(pages=" + this.pages + ", button=" + this.button + ", treatment=)";
    }
}
