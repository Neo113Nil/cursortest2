package y2;

import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f3826a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3827b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3828c;
    public final List d;

    public f(String str, String str2, String str3, List list) {
        this.f3826a = str;
        this.f3827b = str2;
        this.f3828c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return f3.d.a(this.f3826a, fVar.f3826a) && f3.d.a(this.f3827b, fVar.f3827b) && f3.d.a(this.f3828c, fVar.f3828c) && f3.d.a(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f3828c.hashCode() + ((this.f3827b.hashCode() + (this.f3826a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "QuizDataModel(quizIdentifier=" + this.f3826a + ", quizTitle=" + this.f3827b + ", quizEmoji=" + this.f3828c + ", questionsListData=" + this.d + ")";
    }
}
