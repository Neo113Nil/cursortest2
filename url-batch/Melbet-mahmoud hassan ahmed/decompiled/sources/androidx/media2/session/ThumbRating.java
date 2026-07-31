package androidx.media2.session;

import androidx.media2.common.Rating;
import q.d;

/* loaded from: classes.dex */
public final class ThumbRating implements Rating {

    /* renamed from: a, reason: collision with root package name */
    boolean f1224a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f1225b;

    public boolean equals(Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        return this.f1225b == thumbRating.f1225b && this.f1224a == thumbRating.f1224a;
    }

    public int hashCode() {
        return d.b(Boolean.valueOf(this.f1224a), Boolean.valueOf(this.f1225b));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ThumbRating: ");
        if (this.f1224a) {
            str = "isThumbUp=" + this.f1225b;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}
