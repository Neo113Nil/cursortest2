package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class fd {
    public static final a c;
    public static final fd d = new fd("OPEN", 0, "open");
    public static final fd e = new fd("SET_ORIENTATION_PROPERTIES", 1, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.h);
    public static final fd f = new fd("UNLOAD", 2, "unload");
    public static final /* synthetic */ fd[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String b;

    static {
        fd[] a2 = a();
        g = a2;
        h = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public static final /* synthetic */ fd[] a() {
        return new fd[]{d, e, f};
    }

    public static fd valueOf(String str) {
        return (fd) Enum.valueOf(fd.class, str);
    }

    public static fd[] values() {
        return (fd[]) g.clone();
    }

    public fd(String str, int i, String str2) {
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }

    public static final class a {
        public final fd a(String stringValue) {
            Intrinsics.checkNotNullParameter(stringValue, "stringValue");
            fd fdVar = fd.d;
            if (!Intrinsics.areEqual(stringValue, fdVar.b())) {
                fdVar = fd.e;
                if (!Intrinsics.areEqual(stringValue, fdVar.b())) {
                    fdVar = fd.f;
                    if (!Intrinsics.areEqual(stringValue, fdVar.b())) {
                        throw new IllegalArgumentException("Not a valid MraidJSToNativeCommand.");
                    }
                }
            }
            return fdVar;
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
