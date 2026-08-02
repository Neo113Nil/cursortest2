package com.stripe.android.financialconnections.features.notice;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;

/* loaded from: classes8.dex */
public final class RealPresentSheet {
    public final AccountUpdateRequiredContentRepository accountUpdateRequiredContentRepository;
    public final NavigationManagerImpl navigationManager;
    public final NoticeSheetContentRepository noticeSheetContentRepository;

    public RealPresentSheet(NavigationManagerImpl navigationManagerImpl, NoticeSheetContentRepository noticeSheetContentRepository, AccountUpdateRequiredContentRepository accountUpdateRequiredContentRepository) {
        navigationManagerImpl.getClass();
        noticeSheetContentRepository.getClass();
        accountUpdateRequiredContentRepository.getClass();
        this.navigationManager = navigationManagerImpl;
        this.noticeSheetContentRepository = noticeSheetContentRepository;
        this.accountUpdateRequiredContentRepository = accountUpdateRequiredContentRepository;
    }

    public final void invoke(NoticeSheetState.NoticeSheetContent noticeSheetContent, FinancialConnectionsSessionManifest.Pane pane) {
        noticeSheetContent.getClass();
        pane.getClass();
        boolean z = noticeSheetContent instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired;
        NavigationManagerImpl navigationManagerImpl = this.navigationManager;
        if (z) {
            AccountUpdateRequiredContentRepository accountUpdateRequiredContentRepository = this.accountUpdateRequiredContentRepository;
            accountUpdateRequiredContentRepository.getClass();
            ((SavedStateHandle) accountUpdateRequiredContentRepository.zzd).set(new AccountUpdateRequiredContentRepository.State((NoticeSheetState.NoticeSheetContent.UpdateRequired) noticeSheetContent), (String) accountUpdateRequiredContentRepository.zza);
            NavigationManagerImpl.tryNavigateTo$default(navigationManagerImpl, Destination.invoke$default(Destination.AccountUpdateRequired.INSTANCE, pane), null, 6);
            return;
        }
        NoticeSheetContentRepository noticeSheetContentRepository = this.noticeSheetContentRepository;
        noticeSheetContentRepository.getClass();
        ((SavedStateHandle) noticeSheetContentRepository.zzd).set(new NoticeSheetContentRepository.State(noticeSheetContent), (String) noticeSheetContentRepository.zza);
        NavigationManagerImpl.tryNavigateTo$default(navigationManagerImpl, Destination.invoke$default(Destination.Notice.INSTANCE, pane), null, 6);
    }
}
