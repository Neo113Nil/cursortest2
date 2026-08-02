package com.withpersona.sdk2.inquiry.document;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepScreenBinding;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class DocumentInstructionsView$special$$inlined$getViewFactoryForScreen$default$1 extends FunctionReferenceImpl implements Function3 {
    public static final DocumentInstructionsView$special$$inlined$getViewFactoryForScreen$default$1 INSTANCE = new DocumentInstructionsView$special$$inlined$getViewFactoryForScreen$default$1(3, Pi2GenericUiStepScreenBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        return Pi2GenericUiStepScreenBinding.inflate(layoutInflater, (ViewGroup) obj2, booleanValue);
    }
}
