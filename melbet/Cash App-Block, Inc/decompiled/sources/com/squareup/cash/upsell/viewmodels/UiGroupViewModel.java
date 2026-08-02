package com.squareup.cash.upsell.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class UiGroupViewModel {
    public final List elements;
    public final int index;

    public UiGroupViewModel(List list, int i) {
        list.getClass();
        this.elements = list;
        this.index = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiGroupViewModel)) {
            return false;
        }
        UiGroupViewModel uiGroupViewModel = (UiGroupViewModel) obj;
        return Intrinsics.areEqual(this.elements, uiGroupViewModel.elements) && this.index == uiGroupViewModel.index;
    }

    public final int hashCode() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, this.elements.hashCode() * 31, 31);
    }

    public final String toString() {
        return "UiGroupViewModel(elements=" + this.elements + ", index=" + this.index + ", treatment=)";
    }
}
