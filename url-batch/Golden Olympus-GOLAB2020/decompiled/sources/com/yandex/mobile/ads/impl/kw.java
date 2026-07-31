package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kw {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f28336a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f28337b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f28338c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f28339c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f28340d;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f28341b;

        static {
            a aVar = new a(0, "ERROR", "error");
            a aVar2 = new a(1, "MESSAGE", CrashHianalyticsData.MESSAGE);
            f28339c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f28340d = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str, String str2) {
            this.f28341b = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f28340d.clone();
        }

        @NotNull
        public final String a() {
            return this.f28341b;
        }
    }

    public kw(@Nullable String str, @Nullable String str2, @NotNull a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f28336a = str;
        this.f28337b = str2;
        this.f28338c = type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw)) {
            return false;
        }
        kw kwVar = (kw) obj;
        return Intrinsics.areEqual(this.f28336a, kwVar.f28336a) && Intrinsics.areEqual(this.f28337b, kwVar.f28337b) && this.f28338c == kwVar.f28338c;
    }

    public final int hashCode() {
        String str = this.f28336a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f28337b;
        return this.f28338c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAlertData(title=" + this.f28336a + ", message=" + this.f28337b + ", type=" + this.f28338c + ")";
    }
}
