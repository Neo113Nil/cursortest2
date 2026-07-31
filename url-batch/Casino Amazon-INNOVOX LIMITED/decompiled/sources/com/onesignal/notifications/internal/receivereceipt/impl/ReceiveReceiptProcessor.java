package com.onesignal.notifications.internal.receivereceipt.impl;

import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.notifications.internal.backend.INotificationBackendService;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptProcessor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReceiveReceiptProcessor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/onesignal/notifications/internal/receivereceipt/impl/ReceiveReceiptProcessor;", "Lcom/onesignal/notifications/internal/receivereceipt/IReceiveReceiptProcessor;", "_deviceService", "Lcom/onesignal/core/internal/device/IDeviceService;", "_backend", "Lcom/onesignal/notifications/internal/backend/INotificationBackendService;", "(Lcom/onesignal/core/internal/device/IDeviceService;Lcom/onesignal/notifications/internal/backend/INotificationBackendService;)V", "sendReceiveReceipt", "", "appId", "", "subscriptionId", "notificationId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReceiveReceiptProcessor implements IReceiveReceiptProcessor {
    private final INotificationBackendService _backend;
    private final IDeviceService _deviceService;

    public ReceiveReceiptProcessor(IDeviceService _deviceService, INotificationBackendService _backend) {
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        this._deviceService = _deviceService;
        this._backend = _backend;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        com.onesignal.debug.internal.logging.Logging.info$default("Receive receipt failed with statusCode: " + r0.getStatusCode() + " response: " + r0.getResponse(), null, 2, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendReceiveReceipt(String str, String str2, String str3, Continuation<? super Unit> continuation) {
        ReceiveReceiptProcessor$sendReceiveReceipt$1 receiveReceiptProcessor$sendReceiveReceipt$1;
        int i;
        if (continuation instanceof ReceiveReceiptProcessor$sendReceiveReceipt$1) {
            receiveReceiptProcessor$sendReceiveReceipt$1 = (ReceiveReceiptProcessor$sendReceiveReceipt$1) continuation;
            if ((receiveReceiptProcessor$sendReceiveReceipt$1.label & Integer.MIN_VALUE) != 0) {
                receiveReceiptProcessor$sendReceiveReceipt$1.label -= Integer.MIN_VALUE;
                ReceiveReceiptProcessor$sendReceiveReceipt$1 receiveReceiptProcessor$sendReceiveReceipt$12 = receiveReceiptProcessor$sendReceiveReceipt$1;
                Object obj = receiveReceiptProcessor$sendReceiveReceipt$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = receiveReceiptProcessor$sendReceiveReceipt$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IDeviceService.DeviceType deviceType = this._deviceService.getDeviceType();
                    INotificationBackendService iNotificationBackendService = this._backend;
                    receiveReceiptProcessor$sendReceiveReceipt$12.label = 1;
                    if (iNotificationBackendService.updateNotificationAsReceived(str, str3, str2, deviceType, receiveReceiptProcessor$sendReceiveReceipt$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        receiveReceiptProcessor$sendReceiveReceipt$1 = new ReceiveReceiptProcessor$sendReceiveReceipt$1(this, continuation);
        ReceiveReceiptProcessor$sendReceiveReceipt$1 receiveReceiptProcessor$sendReceiveReceipt$122 = receiveReceiptProcessor$sendReceiveReceipt$1;
        Object obj2 = receiveReceiptProcessor$sendReceiveReceipt$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = receiveReceiptProcessor$sendReceiveReceipt$122.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
