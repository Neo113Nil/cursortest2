package com.stripe.android.financialconnections.features.notice;

import androidx.lifecycle.ViewModelKt;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import kotlinx.coroutines.JobKt;

/* loaded from: classes8.dex */
public final class NoticeSheetViewModel extends FinancialConnectionsViewModel {
    public final HandleClickableUrl handleClickableUrl;
    public final NavigationManagerImpl navigationManager;
    public final NoticeSheetContentRepository noticeSheetContentRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeSheetViewModel(NoticeSheetState noticeSheetState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, NavigationManagerImpl navigationManagerImpl, NoticeSheetContentRepository noticeSheetContentRepository, HandleClickableUrl handleClickableUrl) {
        super(noticeSheetState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        navigationManagerImpl.getClass();
        noticeSheetContentRepository.getClass();
        handleClickableUrl.getClass();
        this.navigationManager = navigationManagerImpl;
        this.noticeSheetContentRepository = noticeSheetContentRepository;
        this.handleClickableUrl = handleClickableUrl;
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CameraHelper$unbind$2(this, null, 16), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.noticeSheetContentRepository.clear();
        super.onCleared();
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        ((NoticeSheetState) obj).getClass();
        return null;
    }
}
