package k3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f41021a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41022b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41023c;

    public b(String event, String reason, int i4) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f41021a = event;
        this.f41022b = reason;
        this.f41023c = i4;
    }

    public final b a(int i4) {
        return new b(this.f41021a, this.f41022b, this.f41023c + i4);
    }

    public final int b() {
        return this.f41023c;
    }

    public final String c() {
        return this.f41021a;
    }

    public final String d() {
        return this.f41022b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f41021a, bVar.f41021a) && Intrinsics.areEqual(this.f41022b, bVar.f41022b) && this.f41023c == bVar.f41023c;
    }

    public int hashCode() {
        return (((this.f41021a.hashCode() * 31) + this.f41022b.hashCode()) * 31) + this.f41023c;
    }

    public String toString() {
        return "DropRecord(event='" + this.f41021a + "', reason='" + this.f41022b + "', count=" + this.f41023c + ')';
    }
}
