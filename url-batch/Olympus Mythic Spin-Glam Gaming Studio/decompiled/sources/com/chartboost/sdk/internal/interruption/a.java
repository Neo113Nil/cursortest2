package com.chartboost.sdk.internal.interruption;

import com.ironsource.mediationsdk.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public static final C0239a b = new C0239a(null);
    public static final a c = new a("APP_LIFECYCLE");
    public static final a d = new a("AUDIO");
    public static final a e = new a(j.f);
    public final String a;

    /* renamed from: com.chartboost.sdk.internal.interruption.a$a, reason: collision with other inner class name */
    public static final class C0239a {
        public /* synthetic */ C0239a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.c;
        }

        public final a b() {
            return a.d;
        }

        public C0239a() {
        }
    }

    public a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "InterruptionType(name=" + this.a + ")";
    }
}
