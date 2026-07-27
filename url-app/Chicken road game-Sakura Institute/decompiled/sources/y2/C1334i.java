package y2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: y2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1334i implements Comparable<C1334i> {

    /* renamed from: e, reason: collision with root package name */
    public static final a f11667e = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final C1334i f11668i = new C1334i();

    /* renamed from: d, reason: collision with root package name */
    public final int f11669d = 131093;

    @Metadata
    /* renamed from: y2.i$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1334i c1334i) {
        C1334i other = c1334i;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f11669d - other.f11669d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1334i c1334i = obj instanceof C1334i ? (C1334i) obj : null;
        return c1334i != null && this.f11669d == c1334i.f11669d;
    }

    public final int hashCode() {
        return this.f11669d;
    }

    public final String toString() {
        return "2.0.21";
    }
}
