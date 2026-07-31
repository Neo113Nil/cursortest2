package androidx.media2.session;

/* loaded from: classes.dex */
public final class PercentageRatingParcelizer {
    public static PercentageRating read(androidx.versionedparcelable.a aVar) {
        PercentageRating percentageRating = new PercentageRating();
        percentageRating.f1192a = aVar.s(percentageRating.f1192a, 1);
        return percentageRating;
    }

    public static void write(PercentageRating percentageRating, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.W(percentageRating.f1192a, 1);
    }
}
