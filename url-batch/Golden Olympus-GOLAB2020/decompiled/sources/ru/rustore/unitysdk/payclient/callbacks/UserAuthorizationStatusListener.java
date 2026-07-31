package ru.rustore.unitysdk.payclient.callbacks;

import ru.rustore.sdk.pay.model.UserAuthorizationStatus;

/* loaded from: classes3.dex */
public interface UserAuthorizationStatusListener {
    void OnFailure(Throwable th);

    void OnSuccess(UserAuthorizationStatus userAuthorizationStatus);
}
