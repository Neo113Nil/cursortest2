package com.google.android.odml.image;

import defpackage.frk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ImageProperties {

    /* compiled from: PG */
    public abstract class Builder {
        abstract ImageProperties build();

        abstract Builder setImageFormat(int i);

        abstract Builder setStorageType(int i);
    }

    static Builder builder() {
        return new frk();
    }

    public abstract int a();

    public abstract int b();
}
