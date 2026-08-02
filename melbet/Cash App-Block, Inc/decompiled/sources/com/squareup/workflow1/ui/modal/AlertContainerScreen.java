package com.squareup.workflow1.ui.modal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class AlertContainerScreen implements HasModals {
    public final ModalContainerScreen beneathModals;
    public final List modals;

    public AlertContainerScreen(ModalContainerScreen modalContainerScreen, List list) {
        list.getClass();
        this.beneathModals = modalContainerScreen;
        this.modals = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertContainerScreen)) {
            return false;
        }
        AlertContainerScreen alertContainerScreen = (AlertContainerScreen) obj;
        return Intrinsics.areEqual(this.beneathModals, alertContainerScreen.beneathModals) && Intrinsics.areEqual(this.modals, alertContainerScreen.modals);
    }

    @Override // com.squareup.workflow1.ui.modal.HasModals
    public final Object getBeneathModals() {
        return this.beneathModals;
    }

    @Override // com.squareup.workflow1.ui.modal.HasModals
    public final List getModals() {
        return this.modals;
    }

    public final int hashCode() {
        return this.modals.hashCode() + (this.beneathModals.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlertContainerScreen(beneathModals=");
        sb.append(this.beneathModals);
        sb.append(", modals=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.modals, ')');
    }

    public AlertContainerScreen(ModalContainerScreen modalContainerScreen) {
        this(modalContainerScreen, EmptyList.INSTANCE);
    }
}
