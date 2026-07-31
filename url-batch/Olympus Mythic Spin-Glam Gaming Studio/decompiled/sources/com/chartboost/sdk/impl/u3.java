package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public final class u3 {
    public static final a c = new a(null);
    public final String a;
    public final long b;

    public u3(String originalUrl, long j) {
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.a = originalUrl;
        this.b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return Intrinsics.areEqual(this.a, u3Var.a) && this.b == u3Var.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Long.hashCode(this.b);
    }

    public String toString() {
        return "CacheMetadata(originalUrl=" + this.a + ", expiryTimestampMillis=" + this.b + ")";
    }

    public final String b() {
        return this.a;
    }

    public final long a() {
        return this.b;
    }

    public static final class a {
        public final u3 a(String content) {
            Object obj;
            Object obj2;
            Intrinsics.checkNotNullParameter(content, "content");
            try {
                List lines = StringsKt.lines(content);
                Iterator it = lines.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (StringsKt.startsWith$default((String) obj, "url=", false, 2, (Object) null)) {
                        break;
                    }
                }
                String str = (String) obj;
                Iterator it2 = lines.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (StringsKt.startsWith$default((String) obj2, "expiry=", false, 2, (Object) null)) {
                        break;
                    }
                }
                String str2 = (String) obj2;
                if (str != null && str2 != null) {
                    String substring = str.substring(4);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    String substring2 = str2.substring(7);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    Long longOrNull = StringsKt.toLongOrNull(substring2);
                    if (longOrNull != null) {
                        return new u3(substring, longOrNull.longValue());
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String c() {
        return "url=" + this.a + "\nexpiry=" + this.b;
    }
}
