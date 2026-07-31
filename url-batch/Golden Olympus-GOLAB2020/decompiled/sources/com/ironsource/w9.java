package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public enum w9 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f20171b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f20177a;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final w9 a(@Nullable String str) {
            w9 w9Var;
            w9[] values = w9.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    w9Var = null;
                    break;
                }
                w9Var = values[i4];
                if (Intrinsics.areEqual(w9Var.b(), str)) {
                    break;
                }
                i4++;
            }
            return w9Var == null ? w9.NONE : w9Var;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    w9(String str) {
        this.f20177a = str;
    }

    @NotNull
    public static final w9 a(@Nullable String str) {
        return f20171b.a(str);
    }

    @NotNull
    public final String b() {
        return this.f20177a;
    }
}
