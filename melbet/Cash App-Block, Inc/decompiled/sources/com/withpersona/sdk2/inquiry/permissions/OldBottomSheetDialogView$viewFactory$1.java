package com.withpersona.sdk2.inquiry.permissions;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.permissions.databinding.Pi2RequestPermissionRationaleBinding;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class OldBottomSheetDialogView$viewFactory$1 extends FunctionReferenceImpl implements Function3 {
    public static final OldBottomSheetDialogView$viewFactory$1 INSTANCE = new OldBottomSheetDialogView$viewFactory$1(3, Pi2RequestPermissionRationaleBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2RequestPermissionRationaleBinding;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        return Pi2RequestPermissionRationaleBinding.inflate(layoutInflater, (ViewGroup) obj2, booleanValue);
    }
}
