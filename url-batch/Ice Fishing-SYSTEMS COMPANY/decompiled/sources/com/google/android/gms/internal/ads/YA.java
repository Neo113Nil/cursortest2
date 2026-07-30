package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class YA extends AbstractC2720Pd implements Serializable {

    /* renamed from: I, reason: collision with root package name */
    public final Pattern f28810I;

    public YA(Pattern pattern) {
        super(false);
        pattern.getClass();
        this.f28810I = pattern;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2720Pd
    public final String toString() {
        return this.f28810I.toString();
    }
}
