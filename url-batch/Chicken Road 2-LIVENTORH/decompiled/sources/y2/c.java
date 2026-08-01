package y2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3811a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3812b;

    public c(String str, String str2) {
        this.f3811a = str;
        this.f3812b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f3.d.a(this.f3811a, cVar.f3811a) && f3.d.a(this.f3812b, cVar.f3812b);
    }

    public final int hashCode() {
        return this.f3812b.hashCode() + (this.f3811a.hashCode() * 31);
    }

    public final String toString() {
        return "InfoChapterDataModel(chapterTitle=" + this.f3811a + ", chapterContent=" + this.f3812b + ")";
    }
}
