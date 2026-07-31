package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/margelo/nitro/iap/OpenIapException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorJson", "", "<init>", "(Ljava/lang/String;)V", "message", "getMessage", "()Ljava/lang/String;", "toString", "fillInStackTrace", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OpenIapException extends Exception {
    private final String errorJson;

    public OpenIapException(String errorJson) {
        Intrinsics.checkNotNullParameter(errorJson, "errorJson");
        this.errorJson = errorJson;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.errorJson;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.errorJson;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
