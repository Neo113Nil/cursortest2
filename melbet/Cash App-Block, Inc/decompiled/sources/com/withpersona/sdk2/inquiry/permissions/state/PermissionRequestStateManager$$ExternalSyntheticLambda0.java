package com.withpersona.sdk2.inquiry.permissions.state;

import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes9.dex */
public final /* synthetic */ class PermissionRequestStateManager$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PermissionRequestStateManager f$0;

    public /* synthetic */ PermissionRequestStateManager$$ExternalSyntheticLambda0(PermissionRequestStateManager permissionRequestStateManager, int i) {
        this.$r8$classId = i;
        this.f$0 = permissionRequestStateManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        PermissionRequestStateManager permissionRequestStateManager = this.f$0;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SubtreeManager subtreeManager = (SubtreeManager) permissionRequestStateManager.lastChild;
                if (booleanValue) {
                    subtreeManager.updateState(PermissionRequestStateManager.PermissionRequestState.ShowRequestPermissionRationale.INSTANCE);
                } else {
                    subtreeManager.updateState(PermissionRequestStateManager.PermissionRequestState.RequestPermission.INSTANCE);
                }
                break;
            default:
                PermissionRequestStateManager.PermissionRequestState permissionRequestState = (PermissionRequestStateManager.PermissionRequestState) obj;
                if (permissionRequestState != null) {
                    JobKt.launch$default((ContextScope) permissionRequestStateManager.parent, Dispatchers.Unconfined, null, new InquiryViewModel.AnonymousClass1(permissionRequestStateManager, permissionRequestState, null, 25), 2);
                    break;
                } else {
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
