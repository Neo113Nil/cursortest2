package b6;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1378a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1379b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1380c;

    public l1(String str, List list, int i) {
        this.f1378a = str;
        this.f1379b = list;
        this.f1380c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f1378a.equals(l1Var.f1378a) && this.f1379b.equals(l1Var.f1379b) && this.f1380c == l1Var.f1380c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1380c) + ((this.f1379b.hashCode() + (this.f1378a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "QuizQuestion(question=" + this.f1378a + ", options=" + this.f1379b + ", correctAnswer=" + this.f1380c + ")";
    }
}
