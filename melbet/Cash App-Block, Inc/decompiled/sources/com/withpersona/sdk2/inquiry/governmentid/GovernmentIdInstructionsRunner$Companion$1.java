package com.withpersona.sdk2.inquiry.governmentid;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidInstructionsBinding;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdInstructionsRunner$Companion$1 extends FunctionReferenceImpl implements Function3 {
    public static final GovernmentIdInstructionsRunner$Companion$1 INSTANCE = new GovernmentIdInstructionsRunner$Companion$1(3, Pi2GovernmentidInstructionsBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        return Pi2GovernmentidInstructionsBinding.inflate(layoutInflater, (ViewGroup) obj2, booleanValue);
    }
}
