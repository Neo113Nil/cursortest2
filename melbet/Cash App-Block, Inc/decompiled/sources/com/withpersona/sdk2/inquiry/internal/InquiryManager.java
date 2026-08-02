package com.withpersona.sdk2.inquiry.internal;

import com.squareup.workflow1.ui.ViewRegistry;
import com.withpersona.sdk2.inquiry.internal.loading.LoadingFragment;
import com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment;
import com.withpersona.sdk2.inquiry.shared.di.BaseDaggerFragment;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import dagger.android.AndroidInjector;
import net.idrnd.face.iad.capture.Plane;

/* loaded from: classes9.dex */
public final class InquiryManager implements AndroidInjector {
    public static final Plane Companion = new Plane(19);
    public static volatile InquiryManager INSTANCE;
    public final /* synthetic */ int $r8$classId;
    public Object onEventListener;

    public /* synthetic */ InquiryManager(DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl, int i) {
        this.$r8$classId = i;
        this.onEventListener = daggerInquiryComponent$InquiryComponentImpl;
    }

    @Override // dagger.android.AndroidInjector
    public void inject(BaseDaggerFragment baseDaggerFragment) {
        switch (this.$r8$classId) {
            case 1:
                LoadingFragment loadingFragment = (LoadingFragment) baseDaggerFragment;
                DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = (DaggerInquiryComponent$InquiryComponentImpl) this.onEventListener;
                loadingFragment.androidInjector = daggerInquiryComponent$InquiryComponentImpl.dispatchingAndroidInjector();
                loadingFragment.systemUiController = (SystemUiController) daggerInquiryComponent$InquiryComponentImpl.systemUiControllerProvider.get();
                break;
            default:
                WorkflowStepFragment workflowStepFragment = (WorkflowStepFragment) baseDaggerFragment;
                DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl2 = (DaggerInquiryComponent$InquiryComponentImpl) this.onEventListener;
                workflowStepFragment.androidInjector = daggerInquiryComponent$InquiryComponentImpl2.dispatchingAndroidInjector();
                workflowStepFragment.viewRegistry = (ViewRegistry) daggerInquiryComponent$InquiryComponentImpl2.viewRegistryProvider.get();
                workflowStepFragment.systemUiController = (SystemUiController) daggerInquiryComponent$InquiryComponentImpl2.systemUiControllerProvider.get();
                break;
        }
    }

    public /* synthetic */ InquiryManager() {
        this.$r8$classId = 0;
    }
}
