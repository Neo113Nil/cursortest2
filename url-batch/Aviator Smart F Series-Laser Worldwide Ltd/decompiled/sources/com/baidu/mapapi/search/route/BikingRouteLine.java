package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class BikingRouteLine extends RouteLine<BikingStep> {
    public static final Parcelable.Creator<BikingRouteLine> CREATOR = new a();

    public static class BikingStep extends RouteStep {
        public static final Parcelable.Creator<BikingStep> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        private int f7197e;

        /* renamed from: f, reason: collision with root package name */
        private RouteNode f7198f;

        /* renamed from: g, reason: collision with root package name */
        private RouteNode f7199g;

        /* renamed from: h, reason: collision with root package name */
        private String f7200h;

        /* renamed from: i, reason: collision with root package name */
        private String f7201i;

        /* renamed from: j, reason: collision with root package name */
        private String f7202j;

        /* renamed from: k, reason: collision with root package name */
        private String f7203k;

        /* renamed from: l, reason: collision with root package name */
        private String f7204l;

        /* renamed from: m, reason: collision with root package name */
        private String f7205m;

        /* renamed from: n, reason: collision with root package name */
        private int f7206n;

        static class a implements Parcelable.Creator<BikingStep> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BikingStep createFromParcel(Parcel parcel) {
                return new BikingStep(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BikingStep[] newArray(int i8) {
                return new BikingStep[i8];
            }
        }

        public BikingStep() {
        }

        private List<LatLng> a(String str) {
            if (str != null && str.length() != 0) {
                ArrayList arrayList = new ArrayList();
                String[] split = str.split(";");
                if (split != null && split.length != 0) {
                    for (String str2 : split) {
                        String[] split2 = str2.split(SystemInfoUtil.COMMA);
                        if (split2 != null && split2.length >= 2) {
                            LatLng latLng = new LatLng(Double.valueOf(split2[1]).doubleValue(), Double.valueOf(split2[0]).doubleValue());
                            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                                latLng = CoordTrans.baiduToGcj(latLng);
                            }
                            arrayList.add(latLng);
                        }
                    }
                    return arrayList;
                }
            }
            return null;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getDirection() {
            return this.f7197e;
        }

        public RouteNode getEntrance() {
            return this.f7198f;
        }

        public String getEntranceInstructions() {
            return this.f7201i;
        }

        public RouteNode getExit() {
            return this.f7199g;
        }

        public String getExitInstructions() {
            return this.f7202j;
        }

        public String getInstructions() {
            return this.f7203k;
        }

        public String getRestrictionsInfo() {
            return this.f7205m;
        }

        public int getRestrictionsStatus() {
            return this.f7206n;
        }

        public String getTurnType() {
            return this.f7204l;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = a(this.f7200h);
            }
            return this.mWayPoints;
        }

        public void setDirection(int i8) {
            this.f7197e = i8;
        }

        public void setEntrance(RouteNode routeNode) {
            this.f7198f = routeNode;
        }

        public void setEntranceInstructions(String str) {
            this.f7201i = str;
        }

        public void setExit(RouteNode routeNode) {
            this.f7199g = routeNode;
        }

        public void setExitInstructions(String str) {
            this.f7202j = str;
        }

        public void setInstructions(String str) {
            this.f7203k = str;
        }

        public void setPathString(String str) {
            this.f7200h = str;
        }

        public void setRestrictionsInfo(String str) {
            this.f7205m = str;
        }

        public void setRestrictionsStatus(int i8) {
            this.f7206n = i8;
        }

        public void setTurnType(String str) {
            this.f7204l = str;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, 1);
            parcel.writeInt(this.f7197e);
            parcel.writeParcelable(this.f7198f, 1);
            parcel.writeParcelable(this.f7199g, 1);
            parcel.writeString(this.f7200h);
            parcel.writeString(this.f7201i);
            parcel.writeString(this.f7202j);
            parcel.writeString(this.f7203k);
            parcel.writeString(this.f7204l);
        }

        protected BikingStep(Parcel parcel) {
            super(parcel);
            this.f7197e = parcel.readInt();
            this.f7198f = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.f7199g = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.f7200h = parcel.readString();
            this.f7201i = parcel.readString();
            this.f7202j = parcel.readString();
            this.f7203k = parcel.readString();
            this.f7204l = parcel.readString();
        }
    }

    static class a implements Parcelable.Creator<BikingRouteLine> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BikingRouteLine createFromParcel(Parcel parcel) {
            return new BikingRouteLine(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BikingRouteLine[] newArray(int i8) {
            return new BikingRouteLine[i8];
        }
    }

    public BikingRouteLine() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine
    public List<BikingStep> getAllStep() {
        return super.getAllStep();
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.setType(RouteLine.TYPE.BIKINGSTEP);
        super.writeToParcel(parcel, 1);
    }

    protected BikingRouteLine(Parcel parcel) {
        super(parcel);
    }
}
