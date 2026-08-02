package com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidChooseCaptureMethodBinding;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class ChooseCaptureMethodScreenRunner$Companion$1 extends FunctionReferenceImpl implements Function3 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public ChooseCaptureMethodScreenRunner$Companion$1() {
        super(3, Pi2GovernmentidChooseCaptureMethodBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidChooseCaptureMethodBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        return Pi2GovernmentidChooseCaptureMethodBinding.inflate(layoutInflater, (ViewGroup) obj2, booleanValue);
    }
}
