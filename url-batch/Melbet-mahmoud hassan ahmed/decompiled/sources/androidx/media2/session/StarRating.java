package androidx.media2.session;

import androidx.media2.common.Rating;
import q.d;

/* loaded from: classes.dex */
public final class StarRating implements Rating {

    /* renamed from: a, reason: collision with root package name */
    int f1222a;

    /* renamed from: b, reason: collision with root package name */
    float f1223b;

    StarRating() {
    }

    public boolean c() {
        return this.f1223b >= 0.0f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.f1222a == starRating.f1222a && this.f1223b == starRating.f1223b;
    }

    public int hashCode() {
        return d.b(Integer.valueOf(this.f1222a), Float.valueOf(this.f1223b));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("StarRating: maxStars=");
        sb.append(this.f1222a);
        if (c()) {
            str = ", starRating=" + this.f1223b;
        } else {
            str = ", unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}
