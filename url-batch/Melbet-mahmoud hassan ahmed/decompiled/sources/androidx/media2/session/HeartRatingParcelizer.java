package androidx.media2.session;

/* loaded from: classes.dex */
public final class HeartRatingParcelizer {
    public static HeartRating read(androidx.versionedparcelable.a aVar) {
        HeartRating heartRating = new HeartRating();
        heartRating.f1169a = aVar.i(heartRating.f1169a, 1);
        heartRating.f1170b = aVar.i(heartRating.f1170b, 2);
        return heartRating;
    }

    public static void write(HeartRating heartRating, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.M(heartRating.f1169a, 1);
        aVar.M(heartRating.f1170b, 2);
    }
}
