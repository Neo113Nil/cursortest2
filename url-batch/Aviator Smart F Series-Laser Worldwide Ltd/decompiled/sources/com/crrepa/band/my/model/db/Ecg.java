package com.crrepa.band.my.model.db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* loaded from: classes2.dex */
public class Ecg implements Parcelable {
    public static final Parcelable.Creator<Ecg> CREATOR = new Parcelable.Creator<Ecg>() { // from class: com.crrepa.band.my.model.db.Ecg.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Ecg createFromParcel(Parcel parcel) {
            return new Ecg(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Ecg[] newArray(int i8) {
            return new Ecg[i8];
        }
    };
    private Integer averageHeartRate;
    private Date date;
    private Integer diagnosisType;
    private String diagnosisUrl;
    private Integer fatigue;
    private Integer heartLoad;
    private Boolean heartRateFast;
    private Boolean heartRateMisaligned;
    private Boolean heartRateSlow;
    private Integer heartRateStop;
    private Integer heartRateStrength;
    private Integer heartRateVariability;
    private Long id;
    private Integer leakage;
    private Integer mentalStress;
    private String path;
    private Integer perGridNumber;
    private Integer perGridUvValue;
    private Integer prematureBeat;
    private Integer time;

    public Ecg(Long l8, Date date, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, Integer num6, Integer num7, Integer num8, Boolean bool, Boolean bool2, Boolean bool3, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13) {
        this.id = l8;
        this.date = date;
        this.averageHeartRate = num;
        this.perGridNumber = num2;
        this.perGridUvValue = num3;
        this.heartRateVariability = num4;
        this.fatigue = num5;
        this.path = str;
        this.diagnosisUrl = str2;
        this.mentalStress = num6;
        this.heartLoad = num7;
        this.heartRateStrength = num8;
        this.heartRateSlow = bool;
        this.heartRateFast = bool2;
        this.heartRateMisaligned = bool3;
        this.prematureBeat = num9;
        this.heartRateStop = num10;
        this.leakage = num11;
        this.diagnosisType = num12;
        this.time = num13;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Integer getAverageHeartRate() {
        return this.averageHeartRate;
    }

    public Date getDate() {
        return this.date;
    }

    public Integer getDiagnosisType() {
        return this.diagnosisType;
    }

    public String getDiagnosisUrl() {
        return this.diagnosisUrl;
    }

    public Integer getFatigue() {
        return this.fatigue;
    }

    public Integer getHeartLoad() {
        return this.heartLoad;
    }

    public Boolean getHeartRateFast() {
        return this.heartRateFast;
    }

    public Boolean getHeartRateMisaligned() {
        return this.heartRateMisaligned;
    }

    public Boolean getHeartRateSlow() {
        return this.heartRateSlow;
    }

    public Integer getHeartRateStop() {
        return this.heartRateStop;
    }

    public Integer getHeartRateStrength() {
        return this.heartRateStrength;
    }

    public Integer getHeartRateVariability() {
        return this.heartRateVariability;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getLeakage() {
        return this.leakage;
    }

    public Integer getMentalStress() {
        return this.mentalStress;
    }

    public String getPath() {
        return this.path;
    }

    public Integer getPerGridNumber() {
        return this.perGridNumber;
    }

    public Integer getPerGridUvValue() {
        return this.perGridUvValue;
    }

    public Integer getPrematureBeat() {
        return this.prematureBeat;
    }

    public Integer getTime() {
        return this.time;
    }

    public void setAverageHeartRate(Integer num) {
        this.averageHeartRate = num;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDiagnosisType(Integer num) {
        this.diagnosisType = num;
    }

    public void setDiagnosisUrl(String str) {
        this.diagnosisUrl = str;
    }

    public void setFatigue(Integer num) {
        this.fatigue = num;
    }

    public void setHeartLoad(Integer num) {
        this.heartLoad = num;
    }

    public void setHeartRateFast(Boolean bool) {
        this.heartRateFast = bool;
    }

    public void setHeartRateMisaligned(Boolean bool) {
        this.heartRateMisaligned = bool;
    }

    public void setHeartRateSlow(Boolean bool) {
        this.heartRateSlow = bool;
    }

    public void setHeartRateStop(Integer num) {
        this.heartRateStop = num;
    }

    public void setHeartRateStrength(Integer num) {
        this.heartRateStrength = num;
    }

    public void setHeartRateVariability(Integer num) {
        this.heartRateVariability = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setLeakage(Integer num) {
        this.leakage = num;
    }

    public void setMentalStress(Integer num) {
        this.mentalStress = num;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPerGridNumber(Integer num) {
        this.perGridNumber = num;
    }

    public void setPerGridUvValue(Integer num) {
        this.perGridUvValue = num;
    }

    public void setPrematureBeat(Integer num) {
        this.prematureBeat = num;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeValue(this.id);
        Date date = this.date;
        parcel.writeLong(date != null ? date.getTime() : -1L);
        parcel.writeValue(this.averageHeartRate);
        parcel.writeValue(this.perGridNumber);
        parcel.writeValue(this.perGridUvValue);
        parcel.writeValue(this.heartRateVariability);
        parcel.writeValue(this.fatigue);
        parcel.writeString(this.path);
        parcel.writeString(this.diagnosisUrl);
        parcel.writeValue(this.mentalStress);
        parcel.writeValue(this.heartLoad);
        parcel.writeValue(this.heartRateStrength);
        parcel.writeValue(this.heartRateSlow);
        parcel.writeValue(this.heartRateFast);
        parcel.writeValue(this.heartRateMisaligned);
        parcel.writeValue(this.prematureBeat);
        parcel.writeValue(this.heartRateStop);
        parcel.writeValue(this.leakage);
        parcel.writeValue(this.diagnosisType);
        parcel.writeValue(this.time);
    }

    public Ecg() {
    }

    protected Ecg(Parcel parcel) {
        this.id = (Long) parcel.readValue(Long.class.getClassLoader());
        long readLong = parcel.readLong();
        this.date = readLong == -1 ? null : new Date(readLong);
        this.averageHeartRate = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.perGridNumber = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.perGridUvValue = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.heartRateVariability = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.fatigue = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.path = parcel.readString();
        this.diagnosisUrl = parcel.readString();
        this.mentalStress = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.heartLoad = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.heartRateStrength = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.heartRateSlow = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.heartRateFast = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.heartRateMisaligned = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.prematureBeat = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.heartRateStop = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.leakage = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.diagnosisType = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.time = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }
}
