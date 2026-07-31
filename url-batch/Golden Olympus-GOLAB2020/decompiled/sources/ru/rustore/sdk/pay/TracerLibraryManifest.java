package ru.rustore.sdk.pay;

import androidx.annotation.NonNull;
import z3.b;

/* loaded from: classes3.dex */
public final class TracerLibraryManifest implements b {
    @Override // z3.a
    @NonNull
    public String appToken() {
        return "iNjSl9NoCpds5VvvI4L2I8F2esuXEXwAXudeIvtvjWj6";
    }

    @Override // z3.a
    public String buildUuid() {
        return "2883c470-1c33-11f1-b4e0-1b76dafce849";
    }

    @Override // z3.a
    public String environment() {
        return "release";
    }

    @Override // z3.a
    public boolean isDisabled() {
        return false;
    }

    @Override // z3.a
    @NonNull
    public String namespace() {
        return BuildConfig.LIBRARY_PACKAGE_NAME;
    }

    @Override // z3.a
    @NonNull
    public String versionName() {
        return BuildConfig.SDK_VERSION;
    }
}
