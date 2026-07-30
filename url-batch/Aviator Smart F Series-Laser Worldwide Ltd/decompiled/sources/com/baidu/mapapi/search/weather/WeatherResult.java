package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: classes2.dex */
public class WeatherResult extends SearchResult {
    public static final Parcelable.Creator<WeatherResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private WeatherSearchRealTime f7456a;

    /* renamed from: b, reason: collision with root package name */
    private WeatherSearchLocation f7457b;

    /* renamed from: c, reason: collision with root package name */
    private List<WeatherSearchForecasts> f7458c;

    /* renamed from: d, reason: collision with root package name */
    private List<WeatherSearchForecastForHours> f7459d;

    /* renamed from: e, reason: collision with root package name */
    private List<WeatherLifeIndexes> f7460e;

    /* renamed from: f, reason: collision with root package name */
    private List<WeatherSearchAlerts> f7461f;

    static class a implements Parcelable.Creator<WeatherResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherResult createFromParcel(Parcel parcel) {
            return new WeatherResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherResult[] newArray(int i8) {
            return new WeatherResult[i8];
        }
    }

    public WeatherResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WeatherSearchForecastForHours> getForecastHours() {
        return this.f7459d;
    }

    public List<WeatherSearchForecasts> getForecasts() {
        return this.f7458c;
    }

    public List<WeatherLifeIndexes> getLifeIndexes() {
        return this.f7460e;
    }

    public WeatherSearchLocation getLocation() {
        return this.f7457b;
    }

    public WeatherSearchRealTime getRealTimeWeather() {
        return this.f7456a;
    }

    public List<WeatherSearchAlerts> getWeatherAlerts() {
        return this.f7461f;
    }

    public void setForecastHours(List<WeatherSearchForecastForHours> list) {
        this.f7459d = list;
    }

    public void setForecasts(List<WeatherSearchForecasts> list) {
        this.f7458c = list;
    }

    public void setLifeIndexes(List<WeatherLifeIndexes> list) {
        this.f7460e = list;
    }

    public void setLocation(WeatherSearchLocation weatherSearchLocation) {
        this.f7457b = weatherSearchLocation;
    }

    public void setRealTimeWeather(WeatherSearchRealTime weatherSearchRealTime) {
        this.f7456a = weatherSearchRealTime;
    }

    public void setWeatherAlerts(List<WeatherSearchAlerts> list) {
        this.f7461f = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeParcelable(this.f7456a, i8);
        parcel.writeParcelable(this.f7457b, i8);
        parcel.writeTypedList(this.f7458c);
        parcel.writeTypedList(this.f7459d);
        parcel.writeTypedList(this.f7460e);
        parcel.writeTypedList(this.f7461f);
    }

    protected WeatherResult(Parcel parcel) {
        super(parcel);
        this.f7456a = (WeatherSearchRealTime) parcel.readParcelable(WeatherSearchRealTime.class.getClassLoader());
        this.f7457b = (WeatherSearchLocation) parcel.readParcelable(WeatherSearchLocation.class.getClassLoader());
        this.f7458c = parcel.createTypedArrayList(WeatherSearchForecasts.CREATOR);
        this.f7459d = parcel.createTypedArrayList(WeatherSearchForecastForHours.CREATOR);
        this.f7460e = parcel.createTypedArrayList(WeatherLifeIndexes.CREATOR);
        this.f7461f = parcel.createTypedArrayList(WeatherSearchAlerts.CREATOR);
    }
}
