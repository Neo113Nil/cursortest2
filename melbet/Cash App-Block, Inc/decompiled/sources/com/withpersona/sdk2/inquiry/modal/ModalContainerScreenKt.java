package com.withpersona.sdk2.inquiry.modal;

import com.squareup.workflow1.ui.backstack.BackStackScreen;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class ModalContainerScreenKt {
    public static final SandboxFlags_Factory INSTANCE = new SandboxFlags_Factory(18);

    public static final ModalContainerScreen firstInModalStack(String str, Object obj, Object obj2) {
        return new ModalContainerScreen(obj2, str, CollectionsKt__CollectionsJVMKt.listOf(new BackStackScreen(obj, EmptyList.INSTANCE)));
    }
}
