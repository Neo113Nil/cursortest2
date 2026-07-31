package androidx.media2.session;

import androidx.media2.common.Rating;
import q.d;

/* loaded from: classes.dex */
public final class HeartRating implements Rating {

    /* renamed from: a, reason: collision with root package name */
    boolean f1169a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f1170b;

    public boolean equals(Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        return this.f1170b == heartRating.f1170b && this.f1169a == heartRating.f1169a;
    }

    public int hashCode() {
        return d.b(Boolean.valueOf(this.f1169a), Boolean.valueOf(this.f1170b));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HeartRating: ");
        if (this.f1169a) {
            str = "hasHeart=" + this.f1170b;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}
