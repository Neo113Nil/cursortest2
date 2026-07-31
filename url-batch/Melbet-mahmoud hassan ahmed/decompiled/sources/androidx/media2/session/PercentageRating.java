package androidx.media2.session;

import androidx.media2.common.Rating;
import q.d;

/* loaded from: classes.dex */
public final class PercentageRating implements Rating {

    /* renamed from: a, reason: collision with root package name */
    float f1192a = -1.0f;

    public boolean c() {
        return this.f1192a != -1.0f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof PercentageRating) && this.f1192a == ((PercentageRating) obj).f1192a;
    }

    public int hashCode() {
        return d.b(Float.valueOf(this.f1192a));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("PercentageRating: ");
        if (c()) {
            str = "percentage=" + this.f1192a;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}
