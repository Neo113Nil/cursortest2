package com.squareup.cash.threedsdataonly.backend.real;

import android.content.Context;
import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.api.exceptions.SDKAlreadyInitializedException;
import com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException;
import com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.threedsdataonly.backend.api.SdkAlreadyInitializedException;
import com.squareup.cash.threedsdataonly.backend.api.SdkNotInitializedException;
import com.squareup.cash.threedsdataonly.backend.api.SdkRuntimeException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class RealThreeDsService {
    public final Context context;
    public final DeferredCoroutine init;
    public final CoroutineContext ioDispatcher;
    public final RealLocaleManager localeManager;
    public final Symbol threeDsConfig;
    public ThreeDS2Service threeDsService;

    public RealThreeDsService(Symbol symbol, RealLocaleManager realLocaleManager, CoroutineScope coroutineScope, Context context, CoroutineContext coroutineContext) {
        this.threeDsConfig = symbol;
        this.localeManager = realLocaleManager;
        this.context = context;
        this.ioDispatcher = coroutineContext;
        this.init = JobKt.async(coroutineScope, coroutineContext, CoroutineStart.LAZY, new RealThreeDsService$init$1(this, null));
    }

    public static Throwable asCashType(Throwable th) {
        if (th instanceof SDKAlreadyInitializedException) {
            SDKAlreadyInitializedException sDKAlreadyInitializedException = (SDKAlreadyInitializedException) th;
            return new SdkAlreadyInitializedException(sDKAlreadyInitializedException.getMessage(), sDKAlreadyInitializedException.getCause());
        }
        if (th instanceof SDKNotInitializedException) {
            SDKNotInitializedException sDKNotInitializedException = (SDKNotInitializedException) th;
            return new SdkNotInitializedException(sDKNotInitializedException.getMessage(), sDKNotInitializedException.getCause());
        }
        if (th instanceof InvalidInputException) {
            InvalidInputException invalidInputException = (InvalidInputException) th;
            return new InvalidInputException(invalidInputException.getMessage(), invalidInputException.getCause());
        }
        if (!(th instanceof SDKRuntimeException)) {
            return th == null ? new IllegalStateException("Unknown exception") : th;
        }
        SDKRuntimeException sDKRuntimeException = (SDKRuntimeException) th;
        String message = sDKRuntimeException.getMessage();
        Throwable cause = sDKRuntimeException.getCause();
        sDKRuntimeException.getErrorCode();
        return new SdkRuntimeException(message, cause);
    }
}
