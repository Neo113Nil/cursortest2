package com.baidu.mapapi.search.building;

import android.os.Parcel;
import android.os.Parcelable;
import cn.hutool.core.text.l;
import com.baidu.mapapi.search.core.BuildingInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: classes2.dex */
public class BuildingResult extends SearchResult {
    public static final Parcelable.Creator<BuildingResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<BuildingInfo> f6714a;

    /* renamed from: b, reason: collision with root package name */
    private int f6715b;

    /* renamed from: c, reason: collision with root package name */
    private double f6716c;

    static class a implements Parcelable.Creator<BuildingResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BuildingResult createFromParcel(Parcel parcel) {
            return new BuildingResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BuildingResult[] newArray(int i8) {
            return new BuildingResult[i8];
        }
    }

    public BuildingResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<BuildingInfo> getBuildingList() {
        return this.f6714a;
    }

    public double getDistance() {
        return this.f6716c;
    }

    public int getRelation() {
        return this.f6715b;
    }

    public void setBuildingList(List<BuildingInfo> list) {
        this.f6714a = list;
    }

    public void setDistance(double d8) {
        this.f6716c = d8;
    }

    public void setRelation(int i8) {
        this.f6715b = i8;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("BuidingResult: ");
        List<BuildingInfo> list = this.f6714a;
        if (list == null || list.isEmpty()) {
            stringBuffer.append("null");
        } else {
            for (int i8 = 0; i8 < this.f6714a.size(); i8++) {
                stringBuffer.append(l.SPACE);
                stringBuffer.append(i8);
                stringBuffer.append(l.SPACE);
                BuildingInfo buildingInfo = this.f6714a.get(i8);
                if (buildingInfo == null) {
                    stringBuffer.append("null");
                } else {
                    stringBuffer.append(buildingInfo.toString());
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeTypedList(this.f6714a);
    }

    protected BuildingResult(Parcel parcel) {
        this.f6714a = parcel.createTypedArrayList(BuildingInfo.CREATOR);
    }
}
