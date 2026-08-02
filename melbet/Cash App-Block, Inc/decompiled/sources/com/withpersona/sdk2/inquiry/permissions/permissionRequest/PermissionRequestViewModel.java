package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager_Factory_Impl;

/* loaded from: classes9.dex */
public final class PermissionRequestViewModel extends ViewModel {
    public PermissionRequestStateManager permissionRequestStateManager;
    public final PermissionRequestStateManager_Factory_Impl permissionRequestStateManagerFactory;
    public final SavedStateHandle savedStateHandle;

    public PermissionRequestViewModel(SavedStateHandle savedStateHandle, PermissionRequestStateManager_Factory_Impl permissionRequestStateManager_Factory_Impl) {
        savedStateHandle.getClass();
        permissionRequestStateManager_Factory_Impl.getClass();
        this.savedStateHandle = savedStateHandle;
        this.permissionRequestStateManagerFactory = permissionRequestStateManager_Factory_Impl;
    }
}
