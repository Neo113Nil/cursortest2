package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class zn implements zp {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f20561a;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f20562a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f20563b = "IronSource";

        private a() {
        }
    }

    public zn(@NotNull String networkInstanceId) {
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.f20561a = networkInstanceId;
    }

    @Override // com.ironsource.zp
    @NotNull
    public String value() {
        if (this.f20561a.length() == 0) {
            return "";
        }
        if (Intrinsics.areEqual(this.f20561a, "0") || Intrinsics.areEqual(this.f20561a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.f20561a;
    }
}
