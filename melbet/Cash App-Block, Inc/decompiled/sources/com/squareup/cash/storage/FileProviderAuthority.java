package com.squareup.cash.storage;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class FileProviderAuthority {
    public final String id;

    public FileProviderAuthority(String str) {
        this.id = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FileProviderAuthority) && this.id.equals(((FileProviderAuthority) obj).id);
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FileProviderAuthority(id=", this.id, ")");
    }
}
