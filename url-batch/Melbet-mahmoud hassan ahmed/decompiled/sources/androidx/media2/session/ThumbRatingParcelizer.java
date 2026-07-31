package androidx.media2.session;

/* loaded from: classes.dex */
public final class ThumbRatingParcelizer {
    public static ThumbRating read(androidx.versionedparcelable.a aVar) {
        ThumbRating thumbRating = new ThumbRating();
        thumbRating.f1224a = aVar.i(thumbRating.f1224a, 1);
        thumbRating.f1225b = aVar.i(thumbRating.f1225b, 2);
        return thumbRating;
    }

    public static void write(ThumbRating thumbRating, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.M(thumbRating.f1224a, 1);
        aVar.M(thumbRating.f1225b, 2);
    }
}
