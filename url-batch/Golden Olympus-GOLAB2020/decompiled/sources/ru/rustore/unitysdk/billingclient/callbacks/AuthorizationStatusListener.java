package ru.rustore.unitysdk.billingclient.callbacks;

import ru.rustore.sdk.billingclient.model.user.UserAuthorizationStatus;

/* loaded from: classes3.dex */
public interface AuthorizationStatusListener {
    void OnFailure(Throwable th);

    void OnSuccess(UserAuthorizationStatus userAuthorizationStatus);
}
