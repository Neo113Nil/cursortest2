package s0;

import java.util.List;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3635a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3636b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3637c;

    public C0342a(String str, List list, int i) {
        this.f3635a = str;
        this.f3636b = list;
        this.f3637c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0342a)) {
            return false;
        }
        C0342a c0342a = (C0342a) obj;
        return this.f3635a.equals(c0342a.f3635a) && this.f3636b.equals(c0342a.f3636b) && this.f3637c == c0342a.f3637c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3637c) + ((this.f3636b.hashCode() + (this.f3635a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "QuizQuestion(question=" + this.f3635a + ", options=" + this.f3636b + ", correctIndex=" + this.f3637c + ")";
    }
}
