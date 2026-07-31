package l0;

import android.net.Uri;

/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489c {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f5252a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5253b;

    public C0489c(boolean z5, Uri uri) {
        this.f5252a = uri;
        this.f5253b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0489c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C0489c c0489c = (C0489c) obj;
        return kotlin.jvm.internal.i.a(this.f5252a, c0489c.f5252a) && this.f5253b == c0489c.f5253b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5253b) + (this.f5252a.hashCode() * 31);
    }
}
