package com.onesignal.core.internal.application;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;

/* compiled from: IApplicationLifecycleHandler.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/onesignal/core/internal/application/IApplicationLifecycleHandler;", "", "onFocus", "", "firedOnSubscribe", "", "onUnfocused", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IApplicationLifecycleHandler {
    void onFocus(boolean firedOnSubscribe);

    void onUnfocused();
}
