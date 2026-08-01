package com.bytedance.sdk.component.pvs;

import io.ktor.client.utils.CacheControl;

/* compiled from: PermissionGroup.java */
/* loaded from: classes.dex */
public enum ny {
    PUBLIC,
    PROTECTED,
    PRIVATE;

    @Override // java.lang.Enum
    public String toString() {
        return this == PRIVATE ? CacheControl.PRIVATE : this == PROTECTED ? "protected" : CacheControl.PUBLIC;
    }
}
