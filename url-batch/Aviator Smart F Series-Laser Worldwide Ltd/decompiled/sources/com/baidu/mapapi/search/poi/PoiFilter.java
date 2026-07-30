package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.baidu.platform.comapi.map.MapController;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PoiFilter implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    private String f6905b;

    /* renamed from: c, reason: collision with root package name */
    private String f6906c;

    /* renamed from: d, reason: collision with root package name */
    private String f6907d;

    /* renamed from: e, reason: collision with root package name */
    private String f6908e;

    /* renamed from: f, reason: collision with root package name */
    private String f6909f;

    /* renamed from: g, reason: collision with root package name */
    private String f6910g;

    /* renamed from: a, reason: collision with root package name */
    private static Map<SortName, String> f6904a = new HashMap();
    public static final Parcelable.Creator<PoiFilter> CREATOR = new a();

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f6911a;

        /* renamed from: b, reason: collision with root package name */
        private String f6912b;

        /* renamed from: c, reason: collision with root package name */
        private String f6913c;

        /* renamed from: d, reason: collision with root package name */
        private String f6914d;

        /* renamed from: e, reason: collision with root package name */
        private String f6915e;

        /* renamed from: f, reason: collision with root package name */
        private String f6916f;

        public Builder() {
            PoiFilter.f6904a.put(SortName.HotelSortName.DEFAULT, MapController.DEFAULT_LAYER_TAG);
            PoiFilter.f6904a.put(SortName.HotelSortName.HOTEL_LEVEL, "level");
            PoiFilter.f6904a.put(SortName.HotelSortName.HOTEL_PRICE, FirebaseAnalytics.Param.PRICE);
            PoiFilter.f6904a.put(SortName.HotelSortName.HOTEL_DISTANCE, "distance");
            PoiFilter.f6904a.put(SortName.HotelSortName.HOTEL_HEALTH_SCORE, "health_score");
            PoiFilter.f6904a.put(SortName.HotelSortName.HOTEL_TOTAL_SCORE, "total_score");
            PoiFilter.f6904a.put(SortName.CaterSortName.DEFAULT, MapController.DEFAULT_LAYER_TAG);
            PoiFilter.f6904a.put(SortName.CaterSortName.CATER_DISTANCE, "distance");
            PoiFilter.f6904a.put(SortName.CaterSortName.CATER_PRICE, FirebaseAnalytics.Param.PRICE);
            PoiFilter.f6904a.put(SortName.CaterSortName.CATER_OVERALL_RATING, "overall_rating");
            PoiFilter.f6904a.put(SortName.CaterSortName.CATER_SERVICE_RATING, "service_rating");
            PoiFilter.f6904a.put(SortName.CaterSortName.CATER_TASTE_RATING, "taste_rating");
            PoiFilter.f6904a.put(SortName.LifeSortName.DEFAULT, MapController.DEFAULT_LAYER_TAG);
            PoiFilter.f6904a.put(SortName.LifeSortName.PRICE, FirebaseAnalytics.Param.PRICE);
            PoiFilter.f6904a.put(SortName.LifeSortName.LIFE_COMMENT_RATING, "comment_num");
            PoiFilter.f6904a.put(SortName.LifeSortName.LIFE_OVERALL_RATING, "overall_rating");
            PoiFilter.f6904a.put(SortName.LifeSortName.DISTANCE, "distance");
        }

        public PoiFilter build() {
            return new PoiFilter(this.f6911a, this.f6912b, this.f6913c, this.f6915e, this.f6914d, this.f6916f);
        }

        public Builder industryType(IndustryType industryType) {
            int i8 = b.f6921a[industryType.ordinal()];
            if (i8 == 1) {
                this.f6911a = "hotel";
            } else if (i8 == 2) {
                this.f6911a = "cater";
            } else if (i8 != 3) {
                this.f6911a = "";
            } else {
                this.f6911a = "life";
            }
            return this;
        }

        public Builder isDiscount(boolean z7) {
            if (z7) {
                this.f6915e = "1";
            } else {
                this.f6915e = "0";
            }
            return this;
        }

        public Builder isGroupon(boolean z7) {
            if (z7) {
                this.f6914d = "1";
            } else {
                this.f6914d = "0";
            }
            return this;
        }

        public Builder priceSection(String str) {
            this.f6916f = str;
            return this;
        }

        public Builder sortName(SortName sortName) {
            if (sortName != null) {
                this.f6912b = (String) PoiFilter.f6904a.get(sortName);
            }
            return this;
        }

        public Builder sortRule(int i8) {
            this.f6913c = i8 + "";
            return this;
        }
    }

    public enum IndustryType {
        HOTEL,
        CATER,
        LIFE
    }

    public interface SortName {

        public enum CaterSortName implements SortName {
            DEFAULT,
            CATER_PRICE,
            CATER_DISTANCE,
            CATER_TASTE_RATING,
            CATER_OVERALL_RATING,
            CATER_SERVICE_RATING
        }

        public enum HotelSortName implements SortName {
            DEFAULT,
            HOTEL_PRICE,
            HOTEL_DISTANCE,
            HOTEL_TOTAL_SCORE,
            HOTEL_LEVEL,
            HOTEL_HEALTH_SCORE
        }

        public enum LifeSortName implements SortName {
            DEFAULT,
            PRICE,
            DISTANCE,
            LIFE_OVERALL_RATING,
            LIFE_COMMENT_RATING
        }
    }

    static class a implements Parcelable.Creator<PoiFilter> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiFilter createFromParcel(Parcel parcel) {
            return new PoiFilter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiFilter[] newArray(int i8) {
            return new PoiFilter[i8];
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6921a;

        static {
            int[] iArr = new int[IndustryType.values().length];
            f6921a = iArr;
            try {
                iArr[IndustryType.HOTEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6921a[IndustryType.CATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6921a[IndustryType.LIFE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    PoiFilter(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f6905b = str;
        this.f6906c = str2;
        this.f6907d = str3;
        this.f6909f = str4;
        this.f6908e = str5;
        this.f6910g = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f6905b)) {
            sb.append("industry_type:");
            sb.append(this.f6905b);
            sb.append(b5.b.VERTICAL);
        }
        if (!TextUtils.isEmpty(this.f6906c)) {
            sb.append("sort_name:");
            sb.append(this.f6906c);
            sb.append(b5.b.VERTICAL);
        }
        if (!TextUtils.isEmpty(this.f6907d)) {
            sb.append("sort_rule:");
            sb.append(this.f6907d);
            sb.append(b5.b.VERTICAL);
        }
        if (!TextUtils.isEmpty(this.f6909f)) {
            sb.append("discount:");
            sb.append(this.f6909f);
            sb.append(b5.b.VERTICAL);
        }
        if (!TextUtils.isEmpty(this.f6908e)) {
            sb.append("groupon:");
            sb.append(this.f6908e);
            sb.append(b5.b.VERTICAL);
        }
        if (!TextUtils.isEmpty(this.f6910g)) {
            sb.append("price_section:");
            sb.append(this.f6910g);
            sb.append(b5.b.VERTICAL);
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f6905b);
        parcel.writeString(this.f6906c);
        parcel.writeString(this.f6907d);
        parcel.writeString(this.f6909f);
        parcel.writeString(this.f6908e);
        parcel.writeString(this.f6910g);
    }

    protected PoiFilter(Parcel parcel) {
        this.f6905b = "";
        this.f6906c = "";
        this.f6907d = "";
        this.f6908e = "";
        this.f6909f = "";
        this.f6910g = "";
        this.f6905b = parcel.readString();
        this.f6906c = parcel.readString();
        this.f6907d = parcel.readString();
        this.f6909f = parcel.readString();
        this.f6908e = parcel.readString();
        this.f6910g = parcel.readString();
    }
}
