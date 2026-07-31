package androidx.media2.session;

/* loaded from: classes.dex */
public final class StarRatingParcelizer {
    public static StarRating read(androidx.versionedparcelable.a aVar) {
        StarRating starRating = new StarRating();
        starRating.f1222a = aVar.v(starRating.f1222a, 1);
        starRating.f1223b = aVar.s(starRating.f1223b, 2);
        return starRating;
    }

    public static void write(StarRating starRating, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.Y(starRating.f1222a, 1);
        aVar.W(starRating.f1223b, 2);
    }
}
