package com.withpersona.sdk2.camera;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.squareup.cash.treehouse.android.broadway.TreehouseViewFactory;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.workflow1.ui.modal.ModalContainer;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionsHelper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final class CameraPreview$rebind$1$1$1 implements DefaultLifecycleObserver {
    public final /* synthetic */ Object $cameraExecutor;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CameraPreview$rebind$1$1$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$cameraExecutor = obj;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        int i = this.$r8$classId;
        Object obj = this.$cameraExecutor;
        switch (i) {
            case 0:
                ((ExecutorService) obj).shutdown();
                break;
            case 1:
                ((ViewBindingUtil$FragmentViewBindingDelegate) obj).c = null;
                break;
            case 2:
                CashTreehouseLayout cashTreehouseLayout = ((TreehouseViewFactory.RetainedTreehouseUi) obj).view;
                cashTreehouseLayout.getClass();
                CashTreehouseLayout.updateState$default(cashTreehouseLayout, CashTreehouseLayout.BindState.NotBound, null, 2);
                break;
            case 3:
                ((ModalContainer.DialogRef) obj).dismiss$wf1_container_android();
                break;
            case 4:
                ((PaymentLauncherViewModel) obj).nextActionHandlerRegistry.onLauncherInvalidated();
                break;
            default:
                ((PermissionsHelper) obj).fragmentManager = null;
                break;
        }
    }
}
