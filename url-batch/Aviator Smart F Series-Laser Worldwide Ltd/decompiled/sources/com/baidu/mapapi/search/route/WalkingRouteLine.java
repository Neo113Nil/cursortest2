package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import java.util.List;

/* loaded from: classes2.dex */
public class WalkingRouteLine extends RouteLine<WalkingStep> {
    public static final Parcelable.Creator<WalkingRouteLine> CREATOR = new a();

    public static class WalkingStep extends RouteStep {
        public static final Parcelable.Creator<WalkingStep> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        private int f7309e;

        /* renamed from: f, reason: collision with root package name */
        private RouteNode f7310f;

        /* renamed from: g, reason: collision with root package name */
        private RouteNode f7311g;

        /* renamed from: h, reason: collision with root package name */
        private String f7312h;

        /* renamed from: i, reason: collision with root package name */
        private String f7313i;

        /* renamed from: j, reason: collision with root package name */
        private String f7314j;

        /* renamed from: k, reason: collision with root package name */
        private String f7315k;

        static class a implements Parcelable.Creator<WalkingStep> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public WalkingStep createFromParcel(Parcel parcel) {
                return new WalkingStep(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public WalkingStep[] newArray(int i8) {
                return new WalkingStep[i8];
            }
        }

        public WalkingStep() {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getDirection() {
            return this.f7309e;
        }

        public RouteNode getEntrance() {
            return this.f7310f;
        }

        public String getEntranceInstructions() {
            return this.f7313i;
        }

        public RouteNode getExit() {
            return this.f7311g;
        }

        public String getExitInstructions() {
            return this.f7314j;
        }

        public String getInstructions() {
            return this.f7315k;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = CoordUtil.decodeLocationList(this.f7312h);
            }
            return this.mWayPoints;
        }

        public void setDirection(int i8) {
            this.f7309e = i8;
        }

        public void setEntrance(RouteNode routeNode) {
            this.f7310f = routeNode;
        }

        public void setEntranceInstructions(String str) {
            this.f7313i = str;
        }

        public void setExit(RouteNode routeNode) {
            this.f7311g = routeNode;
        }

        public void setExitInstructions(String str) {
            this.f7314j = str;
        }

        public void setInstructions(String str) {
            this.f7315k = str;
        }

        public void setPathString(String str) {
            this.f7312h = str;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, 1);
            parcel.writeInt(this.f7309e);
            parcel.writeParcelable(this.f7310f, 1);
            parcel.writeParcelable(this.f7311g, 1);
            parcel.writeString(this.f7312h);
            parcel.writeString(this.f7313i);
            parcel.writeString(this.f7314j);
            parcel.writeString(this.f7315k);
        }

        protected WalkingStep(Parcel parcel) {
            super(parcel);
            this.f7309e = parcel.readInt();
            this.f7310f = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.f7311g = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.f7312h = parcel.readString();
            this.f7313i = parcel.readString();
            this.f7314j = parcel.readString();
            this.f7315k = parcel.readString();
        }
    }

    static class a implements Parcelable.Creator<WalkingRouteLine> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WalkingRouteLine createFromParcel(Parcel parcel) {
            return new WalkingRouteLine(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WalkingRouteLine[] newArray(int i8) {
            return new WalkingRouteLine[i8];
        }
    }

    public WalkingRouteLine() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine
    public List<WalkingStep> getAllStep() {
        return super.getAllStep();
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.setType(RouteLine.TYPE.WALKSTEP);
        super.writeToParcel(parcel, 1);
    }

    protected WalkingRouteLine(Parcel parcel) {
        super(parcel);
    }
}
