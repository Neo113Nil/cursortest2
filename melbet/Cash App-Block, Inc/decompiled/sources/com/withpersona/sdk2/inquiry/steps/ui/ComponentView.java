package com.withpersona.sdk2.inquiry.steps.ui;

import android.view.View;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class ComponentView {
    public final UiComponent component;
    public final View view;

    public ComponentView(UiComponent uiComponent, View view) {
        uiComponent.getClass();
        this.component = uiComponent;
        this.view = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentView)) {
            return false;
        }
        ComponentView componentView = (ComponentView) obj;
        return Intrinsics.areEqual(this.component, componentView.component) && this.view.equals(componentView.view);
    }

    public final int hashCode() {
        return this.view.hashCode() + (this.component.hashCode() * 31);
    }

    public final String toString() {
        return "ComponentView(component=" + this.component + ", view=" + this.view + ")";
    }
}
