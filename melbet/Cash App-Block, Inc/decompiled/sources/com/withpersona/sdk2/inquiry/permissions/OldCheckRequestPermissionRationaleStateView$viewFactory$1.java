package com.withpersona.sdk2.inquiry.permissions;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.permissions.databinding.Pi2CheckRequestPermissionRationaleStateBinding;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class OldCheckRequestPermissionRationaleStateView$viewFactory$1 extends FunctionReferenceImpl implements Function3 {
    public static final OldCheckRequestPermissionRationaleStateView$viewFactory$1 INSTANCE = new OldCheckRequestPermissionRationaleStateView$viewFactory$1(3, Pi2CheckRequestPermissionRationaleStateBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2CheckRequestPermissionRationaleStateBinding;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.pi2_check_request_permission_rationale_state, viewGroup, false);
        if (booleanValue) {
            viewGroup.addView(inflate);
        }
        if (inflate != null) {
            return new Pi2CheckRequestPermissionRationaleStateBinding(inflate);
        }
        a$$ExternalSyntheticBUOutline0.m$2("rootView");
        return null;
    }
}
