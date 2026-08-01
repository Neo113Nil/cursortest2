package p2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f7603a;

    /* renamed from: b, reason: collision with root package name */
    public final s f7604b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7605c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7606d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7607e;

    public a0(i iVar, s sVar, int i3, int i10, Object obj) {
        this.f7603a = iVar;
        this.f7604b = sVar;
        this.f7605c = i3;
        this.f7606d = i10;
        this.f7607e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.a(this.f7603a, a0Var.f7603a) && Intrinsics.a(this.f7604b, a0Var.f7604b) && this.f7605c == a0Var.f7605c && this.f7606d == a0Var.f7606d && Intrinsics.a(this.f7607e, a0Var.f7607e);
    }

    public final int hashCode() {
        i iVar = this.f7603a;
        int x10 = v4.a.x(this.f7606d, v4.a.x(this.f7605c, (((iVar == null ? 0 : iVar.hashCode()) * 31) + this.f7604b.f7648d) * 31, 31), 31);
        Object obj = this.f7607e;
        return x10 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f7603a);
        sb2.append(", fontWeight=");
        sb2.append(this.f7604b);
        sb2.append(", fontStyle=");
        String str = "Invalid";
        int i3 = this.f7605c;
        sb2.append((Object) (i3 == 0 ? "Normal" : i3 == 1 ? "Italic" : "Invalid"));
        sb2.append(", fontSynthesis=");
        int i10 = this.f7606d;
        if (i10 == 0) {
            str = "None";
        } else if (i10 == 1) {
            str = "Weight";
        } else if (i10 == 2) {
            str = "Style";
        } else if (i10 == 65535) {
            str = "All";
        }
        sb2.append((Object) str);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f7607e);
        sb2.append(')');
        return sb2.toString();
    }
}
