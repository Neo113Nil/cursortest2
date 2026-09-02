package y2;

import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f3829a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3830b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3831c;

    public g(String str, List list, int i) {
        this.f3829a = str;
        this.f3830b = list;
        this.f3831c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3829a.equals(gVar.f3829a) && this.f3830b.equals(gVar.f3830b) && this.f3831c == gVar.f3831c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3831c) + ((this.f3830b.hashCode() + (this.f3829a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "QuizQuestionDataModel(questionText=" + this.f3829a + ", optionsAnswersList=" + this.f3830b + ", correctAnswerIndex=" + this.f3831c + ")";
    }
}
