package com.appsflyer.exceptions;

import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class SDKMissingException extends IllegalStateException {
    public SDKMissingException() {
        super("AppsFlyer SDK required! Did you exclude the dependency from this library?");
    }
}
