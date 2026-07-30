package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i8) {
            return new RatingCompat[i8];
        }
    };
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final String TAG = "Rating";
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    @RequiresApi(19)
    private static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        static float getPercentRating(Rating rating) {
            return rating.getPercentRating();
        }

        @DoNotInline
        static int getRatingStyle(Rating rating) {
            return rating.getRatingStyle();
        }

        @DoNotInline
        static float getStarRating(Rating rating) {
            return rating.getStarRating();
        }

        @DoNotInline
        static boolean hasHeart(Rating rating) {
            return rating.hasHeart();
        }

        @DoNotInline
        static boolean isRated(Rating rating) {
            return rating.isRated();
        }

        @DoNotInline
        static boolean isThumbUp(Rating rating) {
            return rating.isThumbUp();
        }

        @DoNotInline
        static Rating newHeartRating(boolean z7) {
            return Rating.newHeartRating(z7);
        }

        @DoNotInline
        static Rating newPercentageRating(float f8) {
            return Rating.newPercentageRating(f8);
        }

        @DoNotInline
        static Rating newStarRating(int i8, float f8) {
            return Rating.newStarRating(i8, f8);
        }

        @DoNotInline
        static Rating newThumbRating(boolean z7) {
            return Rating.newThumbRating(z7);
        }

        @DoNotInline
        static Rating newUnratedRating(int i8) {
            return Rating.newUnratedRating(i8);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Style {
    }

    RatingCompat(int i8, float f8) {
        this.mRatingStyle = i8;
        this.mRatingValue = f8;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = Api19Impl.getRatingStyle(rating);
            if (Api19Impl.isRated(rating)) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = newHeartRating(Api19Impl.hasHeart(rating));
                        break;
                    case 2:
                        ratingCompat = newThumbRating(Api19Impl.isThumbUp(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = newStarRating(ratingStyle, Api19Impl.getStarRating(rating));
                        break;
                    case 6:
                        ratingCompat = newPercentageRating(Api19Impl.getPercentRating(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = newUnratedRating(ratingStyle);
            }
            ratingCompat.mRatingObj = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat newHeartRating(boolean z7) {
        return new RatingCompat(1, z7 ? 1.0f : 0.0f);
    }

    public static RatingCompat newPercentageRating(float f8) {
        if (f8 >= 0.0f && f8 <= 100.0f) {
            return new RatingCompat(6, f8);
        }
        Log.e(TAG, "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat newStarRating(int i8, float f8) {
        float f9;
        if (i8 == 3) {
            f9 = 3.0f;
        } else if (i8 == 4) {
            f9 = 4.0f;
        } else {
            if (i8 != 5) {
                Log.e(TAG, "Invalid rating style (" + i8 + ") for a star rating");
                return null;
            }
            f9 = 5.0f;
        }
        if (f8 >= 0.0f && f8 <= f9) {
            return new RatingCompat(i8, f8);
        }
        Log.e(TAG, "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat newThumbRating(boolean z7) {
        return new RatingCompat(2, z7 ? 1.0f : 0.0f);
    }

    public static RatingCompat newUnratedRating(int i8) {
        switch (i8) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i8, -1.0f);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.mRatingStyle;
    }

    public float getPercentRating() {
        if (this.mRatingStyle == 6 && isRated()) {
            return this.mRatingValue;
        }
        return -1.0f;
    }

    public Object getRating() {
        if (this.mRatingObj == null) {
            if (isRated()) {
                int i8 = this.mRatingStyle;
                switch (i8) {
                    case 1:
                        this.mRatingObj = Api19Impl.newHeartRating(hasHeart());
                        break;
                    case 2:
                        this.mRatingObj = Api19Impl.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.mRatingObj = Api19Impl.newStarRating(i8, getStarRating());
                        break;
                    case 6:
                        this.mRatingObj = Api19Impl.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                this.mRatingObj = Api19Impl.newUnratedRating(this.mRatingStyle);
            }
        }
        return this.mRatingObj;
    }

    public int getRatingStyle() {
        return this.mRatingStyle;
    }

    public float getStarRating() {
        int i8 = this.mRatingStyle;
        if ((i8 == 3 || i8 == 4 || i8 == 5) && isRated()) {
            return this.mRatingValue;
        }
        return -1.0f;
    }

    public boolean hasHeart() {
        return this.mRatingStyle == 1 && this.mRatingValue == 1.0f;
    }

    public boolean isRated() {
        return this.mRatingValue >= 0.0f;
    }

    public boolean isThumbUp() {
        return this.mRatingStyle == 2 && this.mRatingValue == 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.mRatingStyle);
        sb.append(" rating=");
        float f8 = this.mRatingValue;
        sb.append(f8 < 0.0f ? "unrated" : String.valueOf(f8));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }
}
