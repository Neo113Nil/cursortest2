package h2;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f4437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4438b;

    public b(Resources.Theme theme, int i3) {
        this.f4437a = theme;
        this.f4438b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f4437a, bVar.f4437a) && this.f4438b == bVar.f4438b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4438b) + (this.f4437a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f4437a);
        sb2.append(", id=");
        return v4.a.m(sb2, this.f4438b, ')');
    }
}
