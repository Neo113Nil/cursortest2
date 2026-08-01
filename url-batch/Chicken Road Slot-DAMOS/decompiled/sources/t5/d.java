package t5;

import java.util.Set;
import kotlin.collections.l0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final d f9292i = new d(1, false, false, false, false, -1, -1, l0.f5576d);

    /* renamed from: a, reason: collision with root package name */
    public final int f9293a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9294b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9295c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9296d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9297e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9298f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f9299h;

    public d(int i3, boolean z10, boolean z11, boolean z12, boolean z13, long j, long j3, Set set) {
        if (i3 == 0) {
            throw null;
        }
        set.getClass();
        this.f9293a = i3;
        this.f9294b = z10;
        this.f9295c = z11;
        this.f9296d = z12;
        this.f9297e = z13;
        this.f9298f = j;
        this.g = j3;
        this.f9299h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.class.equals(obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f9294b == dVar.f9294b && this.f9295c == dVar.f9295c && this.f9296d == dVar.f9296d && this.f9297e == dVar.f9297e && this.f9298f == dVar.f9298f && this.g == dVar.g && this.f9293a == dVar.f9293a) {
            return Intrinsics.a(this.f9299h, dVar.f9299h);
        }
        return false;
    }

    public final int hashCode() {
        int b10 = ((((((((a4.i.b(this.f9293a) * 31) + (this.f9294b ? 1 : 0)) * 31) + (this.f9295c ? 1 : 0)) * 31) + (this.f9296d ? 1 : 0)) * 31) + (this.f9297e ? 1 : 0)) * 31;
        long j = this.f9298f;
        int i3 = (b10 + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.g;
        return this.f9299h.hashCode() + ((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }
}
