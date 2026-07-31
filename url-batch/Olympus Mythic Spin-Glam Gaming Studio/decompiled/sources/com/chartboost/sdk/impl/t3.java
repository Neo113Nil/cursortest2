package com.chartboost.sdk.impl;

import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class t3 {
    public t3() {
    }

    public /* synthetic */ t3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class a extends t3 {
        public final m8 a;
        public final URL b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m8 reason, URL url) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(url, "url");
            this.a = reason;
            this.b = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Evicted(reason=" + this.a + ", url=" + this.b + ")";
        }

        public final m8 a() {
            return this.a;
        }

        public final URL b() {
            return this.b;
        }
    }
}
