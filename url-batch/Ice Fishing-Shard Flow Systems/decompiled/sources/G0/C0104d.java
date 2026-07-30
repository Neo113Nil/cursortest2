package G0;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: G0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f791a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f792b;

    public C0104d(boolean z7, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f791a = uri;
        this.f792b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0104d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C0104d c0104d = (C0104d) obj;
        return Intrinsics.a(this.f791a, c0104d.f791a) && this.f792b == c0104d.f792b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f792b) + (this.f791a.hashCode() * 31);
    }
}
