package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private final int f337f;

    /* renamed from: g, reason: collision with root package name */
    private final float f338g;

    /* renamed from: h, reason: collision with root package name */
    private Object f339h;

    class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i7) {
            return new RatingCompat[i7];
        }
    }

    private static class b {
        static float a(Rating rating) {
            return rating.getPercentRating();
        }

        static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        static float c(Rating rating) {
            return rating.getStarRating();
        }

        static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        static boolean e(Rating rating) {
            return rating.isRated();
        }

        static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        static Rating g(boolean z6) {
            return Rating.newHeartRating(z6);
        }

        static Rating h(float f7) {
            return Rating.newPercentageRating(f7);
        }

        static Rating i(int i7, float f7) {
            return Rating.newStarRating(i7, f7);
        }

        static Rating j(boolean z6) {
            return Rating.newThumbRating(z6);
        }

        static Rating k(int i7) {
            return Rating.newUnratedRating(i7);
        }
    }

    RatingCompat(int i7, float f7) {
        this.f337f = i7;
        this.f338g = f7;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null && Build.VERSION.SDK_INT >= 19) {
            Rating rating = (Rating) obj;
            int b7 = b.b(rating);
            if (b.e(rating)) {
                switch (b7) {
                    case 1:
                        ratingCompat = m(b.d(rating));
                        break;
                    case 2:
                        ratingCompat = p(b.f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = o(b7, b.c(rating));
                        break;
                    case 6:
                        ratingCompat = n(b.a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = q(b7);
            }
            ratingCompat.f339h = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat m(boolean z6) {
        return new RatingCompat(1, z6 ? 1.0f : 0.0f);
    }

    public static RatingCompat n(float f7) {
        if (f7 >= 0.0f && f7 <= 100.0f) {
            return new RatingCompat(6, f7);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat o(int i7, float f7) {
        float f8;
        String str;
        if (i7 == 3) {
            f8 = 3.0f;
        } else if (i7 == 4) {
            f8 = 4.0f;
        } else {
            if (i7 != 5) {
                str = "Invalid rating style (" + i7 + ") for a star rating";
                Log.e("Rating", str);
                return null;
            }
            f8 = 5.0f;
        }
        if (f7 >= 0.0f && f7 <= f8) {
            return new RatingCompat(i7, f7);
        }
        str = "Trying to set out of range star-based rating";
        Log.e("Rating", str);
        return null;
    }

    public static RatingCompat p(boolean z6) {
        return new RatingCompat(2, z6 ? 1.0f : 0.0f);
    }

    public static RatingCompat q(int i7) {
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i7, -1.0f);
            default:
                return null;
        }
    }

    public float c() {
        if (this.f337f == 6 && k()) {
            return this.f338g;
        }
        return -1.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f337f;
    }

    public Object g() {
        Rating k7;
        if (this.f339h == null && Build.VERSION.SDK_INT >= 19) {
            if (k()) {
                int i7 = this.f337f;
                switch (i7) {
                    case 1:
                        k7 = b.g(j());
                        break;
                    case 2:
                        k7 = b.j(l());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        k7 = b.i(i7, i());
                        break;
                    case 6:
                        k7 = b.h(c());
                        break;
                    default:
                        return null;
                }
            } else {
                k7 = b.k(this.f337f);
            }
            this.f339h = k7;
        }
        return this.f339h;
    }

    public int h() {
        return this.f337f;
    }

    public float i() {
        int i7 = this.f337f;
        if ((i7 == 3 || i7 == 4 || i7 == 5) && k()) {
            return this.f338g;
        }
        return -1.0f;
    }

    public boolean j() {
        return this.f337f == 1 && this.f338g == 1.0f;
    }

    public boolean k() {
        return this.f338g >= 0.0f;
    }

    public boolean l() {
        return this.f337f == 2 && this.f338g == 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f337f);
        sb.append(" rating=");
        float f7 = this.f338g;
        sb.append(f7 < 0.0f ? "unrated" : String.valueOf(f7));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f337f);
        parcel.writeFloat(this.f338g);
    }
}
