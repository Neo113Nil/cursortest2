package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class i9 implements lf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16701a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f16702b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16703c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final fp f16704d;

    public i9() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.lf
    @NotNull
    public fp a() {
        return this.f16704d;
    }

    @Override // com.ironsource.lf
    @NotNull
    public String b() {
        return this.f16702b;
    }

    @Override // com.ironsource.lf
    @NotNull
    public String c() {
        return this.f16701a;
    }

    @Override // com.ironsource.lf
    public boolean d() {
        return this.f16703c;
    }

    public i9(@NotNull String controllerUrl, @NotNull String cacheFolder, boolean z4, @NotNull fp rootFolder) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.f16701a = controllerUrl;
        this.f16702b = cacheFolder;
        this.f16703c = z4;
        this.f16704d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ i9(String str, String str2, boolean z4, fp fpVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? false : z4, (i4 & 8) != 0 ? new fp(str) : fpVar);
        str = (i4 & 1) != 0 ? "" : str;
    }
}
