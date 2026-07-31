package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l93 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f7876a;

    public l93(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f7876a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f7876a.matcher(str).matches();
    }
}
