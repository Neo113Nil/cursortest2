package com.withpersona.sdk2.inquiry.modal;

import com.squareup.workflow1.ui.Compatible;
import com.squareup.workflow1.ui.modal.HasModals;
import java.util.List;

/* loaded from: classes9.dex */
public final class ModalContainerScreen implements HasModals, Compatible {
    public final Object baseScreen;
    public final Object beneathModals;
    public final String compatibilityKey;
    public final List modals;

    public ModalContainerScreen(Object obj, String str, List list) {
        list.getClass();
        this.baseScreen = obj;
        this.modals = list;
        this.compatibilityKey = str;
        this.beneathModals = obj;
    }

    @Override // com.squareup.workflow1.ui.modal.HasModals
    public final Object getBeneathModals() {
        return this.beneathModals;
    }

    @Override // com.squareup.workflow1.ui.Compatible
    public final String getCompatibilityKey() {
        return this.compatibilityKey;
    }

    @Override // com.squareup.workflow1.ui.modal.HasModals
    public final List getModals() {
        return this.modals;
    }
}
