package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapapi.search.core.TaxiInfo;
import com.baidu.mapapi.search.core.VehicleInfo;
import java.util.List;

/* loaded from: classes2.dex */
public final class TransitRouteLine extends RouteLine<TransitStep> {
    public static final Parcelable.Creator<TransitRouteLine> CREATOR = new a();

    /* renamed from: i, reason: collision with root package name */
    private TaxiInfo f7297i;

    public static class TransitStep extends RouteStep {
        public static final Parcelable.Creator<TransitStep> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        private VehicleInfo f7298e;

        /* renamed from: f, reason: collision with root package name */
        private RouteNode f7299f;

        /* renamed from: g, reason: collision with root package name */
        private RouteNode f7300g;

        /* renamed from: h, reason: collision with root package name */
        private TransitRouteStepType f7301h;

        /* renamed from: i, reason: collision with root package name */
        private String f7302i;

        /* renamed from: j, reason: collision with root package name */
        private String f7303j;

        public enum TransitRouteStepType {
            BUSLINE,
            SUBWAY,
            WAKLING
        }

        static class a implements Parcelable.Creator<TransitStep> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TransitStep createFromParcel(Parcel parcel) {
                return new TransitStep(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TransitStep[] newArray(int i8) {
                return new TransitStep[i8];
            }
        }

        public TransitStep() {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public RouteNode getEntrance() {
            return this.f7299f;
        }

        public RouteNode getExit() {
            return this.f7300g;
        }

        public String getInstructions() {
            return this.f7302i;
        }

        public TransitRouteStepType getStepType() {
            return this.f7301h;
        }

        public VehicleInfo getVehicleInfo() {
            return this.f7298e;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = CoordUtil.decodeLocationList(this.f7303j);
            }
            return this.mWayPoints;
        }

        public void setEntrace(RouteNode routeNode) {
            this.f7299f = routeNode;
        }

        public void setExit(RouteNode routeNode) {
            this.f7300g = routeNode;
        }

        public void setInstructions(String str) {
            this.f7302i = str;
        }

        public void setPathString(String str) {
            this.f7303j = str;
        }

        public void setStepType(TransitRouteStepType transitRouteStepType) {
            this.f7301h = transitRouteStepType;
        }

        public void setVehicleInfo(VehicleInfo vehicleInfo) {
            this.f7298e = vehicleInfo;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeParcelable(this.f7298e, 1);
            parcel.writeParcelable(this.f7299f, 1);
            parcel.writeParcelable(this.f7300g, 1);
            TransitRouteStepType transitRouteStepType = this.f7301h;
            parcel.writeInt(transitRouteStepType == null ? -1 : transitRouteStepType.ordinal());
            parcel.writeString(this.f7302i);
            parcel.writeString(this.f7303j);
        }

        protected TransitStep(Parcel parcel) {
            super(parcel);
            this.f7298e = (VehicleInfo) parcel.readParcelable(VehicleInfo.class.getClassLoader());
            this.f7299f = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.f7300g = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            int readInt = parcel.readInt();
            this.f7301h = readInt == -1 ? null : TransitRouteStepType.values()[readInt];
            this.f7302i = parcel.readString();
            this.f7303j = parcel.readString();
        }
    }

    static class a implements Parcelable.Creator<TransitRouteLine> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransitRouteLine createFromParcel(Parcel parcel) {
            return new TransitRouteLine(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransitRouteLine[] newArray(int i8) {
            return new TransitRouteLine[i8];
        }
    }

    public TransitRouteLine() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public TaxiInfo getTaxitInfo() {
        return this.f7297i;
    }

    public void setTaxitInfo(TaxiInfo taxiInfo) {
        this.f7297i = taxiInfo;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.setType(RouteLine.TYPE.TRANSITSTEP);
        super.writeToParcel(parcel, i8);
        parcel.writeParcelable(this.f7297i, 1);
    }

    protected TransitRouteLine(Parcel parcel) {
        super(parcel);
        this.f7297i = (TaxiInfo) parcel.readParcelable(TaxiInfo.class.getClassLoader());
    }
}
