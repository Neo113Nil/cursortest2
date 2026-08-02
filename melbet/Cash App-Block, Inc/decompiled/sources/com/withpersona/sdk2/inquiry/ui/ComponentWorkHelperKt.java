package com.withpersona.sdk2.inquiry.ui;

import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.ui.UiState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Reflection;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public abstract class ComponentWorkHelperKt {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        return com.withpersona.sdk2.inquiry.ui.UiState.Displaying.copy$default(r15, null, null, null, null, new com.withpersona.sdk2.inquiry.ui.UiState.Displaying.AutoSubmit(r1, 0, null), null, false, null, null, null, false, null, 0, 65439);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final UiState.Displaying autoSubmitState(UiState.Displaying displaying, String str) {
        AutoSubmitableComponent autoSubmitableComponent;
        displaying.getClass();
        List list = displaying.components;
        if (str == null || str.length() == 0) {
            autoSubmitableComponent = (SubmitButtonComponent) ExtensionsKt.findFirstComponentOrNull(list, Reflection.factory.getOrCreateKotlinClass(SubmitButtonComponent.class), UiWorkflow$render$$inlined$findFirstComponentOrNull$default$1.INSTANCE$1);
        } else {
            autoSubmitableComponent = (ButtonComponent) ExtensionsKt.findFirstComponentOrNull(list, Reflection.factory.getOrCreateKotlinClass(ButtonComponent.class), new StateBindingsKt$$ExternalSyntheticLambda0(str, 19));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x000e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList removeFileUploadComponents(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (UiComponent) it.next();
            if (!(parcelable instanceof InputFileUploadComponent)) {
                if (parcelable instanceof UiComponentGroup) {
                    UiComponentGroup uiComponentGroup = (UiComponentGroup) parcelable;
                    ArrayList removeFileUploadComponents = removeFileUploadComponents(uiComponentGroup.getChildren());
                    if (!removeFileUploadComponents.isEmpty()) {
                        parcelable = uiComponentGroup.updateChildren(removeFileUploadComponents);
                    }
                }
                if (parcelable == null) {
                    arrayList.add(parcelable);
                }
            }
            parcelable = null;
            if (parcelable == null) {
            }
        }
        return arrayList;
    }
}
