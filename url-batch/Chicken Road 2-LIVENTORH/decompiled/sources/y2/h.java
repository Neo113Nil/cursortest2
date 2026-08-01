package y2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f3832a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3833b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3834c;
    public final long d;

    public h(String str, int i, int i4, long j4) {
        this.f3832a = str;
        this.f3833b = i;
        this.f3834c = i4;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return f3.d.a(this.f3832a, hVar.f3832a) && this.f3833b == hVar.f3833b && this.f3834c == hVar.f3834c && this.d == hVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((Integer.hashCode(this.f3834c) + ((Integer.hashCode(this.f3833b) + (this.f3832a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "QuizResultDataModel(quizIdentifier=" + this.f3832a + ", totalQuestionsCount=" + this.f3833b + ", correctAnswersCount=" + this.f3834c + ", completedTimestamp=" + this.d + ")";
    }
}
