package t5;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f9290a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9291b;

    public c(boolean z10, Uri uri) {
        uri.getClass();
        this.f9290a = uri;
        this.f9291b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        c cVar = (c) obj;
        return Intrinsics.a(this.f9290a, cVar.f9290a) && this.f9291b == cVar.f9291b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9291b) + (this.f9290a.hashCode() * 31);
    }
}
