package l2;

import r4.f;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6264a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6265b;

    public C0660a(String str, String str2) {
        this.f6264a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f6265b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0660a) {
            C0660a c0660a = (C0660a) obj;
            if (this.f6264a.equals(c0660a.f6264a) && this.f6265b.equals(c0660a.f6265b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6264a.hashCode() ^ 1000003) * 1000003) ^ this.f6265b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f6264a);
        sb.append(", version=");
        return f.f(sb, this.f6265b, "}");
    }
}
