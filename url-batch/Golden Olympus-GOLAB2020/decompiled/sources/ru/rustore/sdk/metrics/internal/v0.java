package ru.rustore.sdk.metrics.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class v0 {

    public static final class a extends v0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f43773a = new a();
    }

    public static final class b extends v0 {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f43774a;

        public b(ArrayList values) {
            Intrinsics.checkNotNullParameter(values, "values");
            this.f43774a = values;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f43774a, ((b) obj).f43774a);
        }

        public final int hashCode() {
            return this.f43774a.hashCode();
        }

        public final String toString() {
            return "Sent(values=" + this.f43774a + ')';
        }
    }
}
