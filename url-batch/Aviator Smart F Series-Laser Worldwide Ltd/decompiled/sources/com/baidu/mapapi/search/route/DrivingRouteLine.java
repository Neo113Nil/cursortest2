package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DrivingRouteLine extends RouteLine<DrivingStep> {
    public static final Parcelable.Creator<DrivingRouteLine> CREATOR = new a();

    /* renamed from: i, reason: collision with root package name */
    private boolean f7211i;

    /* renamed from: j, reason: collision with root package name */
    private List<RouteNode> f7212j;

    /* renamed from: k, reason: collision with root package name */
    private int f7213k;

    /* renamed from: l, reason: collision with root package name */
    private int f7214l;

    /* renamed from: m, reason: collision with root package name */
    private int f7215m;

    public static class DrivingStep extends RouteStep {
        public static final Parcelable.Creator<DrivingStep> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        private int f7216e;

        /* renamed from: f, reason: collision with root package name */
        private RouteNode f7217f;

        /* renamed from: g, reason: collision with root package name */
        private RouteNode f7218g;

        /* renamed from: h, reason: collision with root package name */
        private String f7219h;

        /* renamed from: i, reason: collision with root package name */
        private String f7220i;

        /* renamed from: j, reason: collision with root package name */
        private String f7221j;

        /* renamed from: k, reason: collision with root package name */
        private String f7222k;

        /* renamed from: l, reason: collision with root package name */
        private int f7223l;

        /* renamed from: m, reason: collision with root package name */
        List<LatLng> f7224m;

        /* renamed from: n, reason: collision with root package name */
        int[] f7225n;

        /* renamed from: o, reason: collision with root package name */
        private int f7226o;

        /* renamed from: p, reason: collision with root package name */
        private String f7227p;

        static class a implements Parcelable.Creator<DrivingStep> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DrivingStep createFromParcel(Parcel parcel) {
                return new DrivingStep(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DrivingStep[] newArray(int i8) {
                return new DrivingStep[i8];
            }
        }

        public DrivingStep() {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getDirection() {
            return this.f7216e;
        }

        public RouteNode getEntrance() {
            return this.f7217f;
        }

        public String getEntranceInstructions() {
            return this.f7220i;
        }

        public RouteNode getExit() {
            return this.f7218g;
        }

        public String getExitInstructions() {
            return this.f7221j;
        }

        public String getInstructions() {
            return this.f7222k;
        }

        public int getNumTurns() {
            return this.f7223l;
        }

        public int getRoadLevel() {
            return this.f7226o;
        }

        public String getRoadName() {
            return this.f7227p;
        }

        public int[] getTrafficList() {
            return this.f7225n;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = CoordUtil.decodeLocationList(this.f7219h);
            }
            return this.f7224m;
        }

        public void setDirection(int i8) {
            this.f7216e = i8;
        }

        public void setEntrance(RouteNode routeNode) {
            this.f7217f = routeNode;
        }

        public void setEntranceInstructions(String str) {
            this.f7220i = str;
        }

        public void setExit(RouteNode routeNode) {
            this.f7218g = routeNode;
        }

        public void setExitInstructions(String str) {
            this.f7221j = str;
        }

        public void setInstructions(String str) {
            this.f7222k = str;
        }

        public void setNumTurns(int i8) {
            this.f7223l = i8;
        }

        public void setPathList(List<LatLng> list) {
            this.f7224m = list;
        }

        public void setPathString(String str) {
            this.f7219h = str;
        }

        public void setRoadLevel(int i8) {
            this.f7226o = i8;
        }

        public void setRoadName(String str) {
            this.f7227p = str;
        }

        public void setTrafficList(int[] iArr) {
            this.f7225n = iArr;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f7216e);
            parcel.writeParcelable(this.f7217f, 1);
            parcel.writeParcelable(this.f7218g, 1);
            parcel.writeString(this.f7219h);
            parcel.writeString(this.f7220i);
            parcel.writeString(this.f7221j);
            parcel.writeString(this.f7222k);
            parcel.writeInt(this.f7223l);
            parcel.writeTypedList(this.f7224m);
            parcel.writeIntArray(this.f7225n);
            parcel.writeInt(this.f7226o);
            parcel.writeString(this.f7227p);
        }

        protected DrivingStep(Parcel parcel) {
            super(parcel);
            this.f7216e = parcel.readInt();
            this.f7217f = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.f7218g = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.f7219h = parcel.readString();
            this.f7220i = parcel.readString();
            this.f7221j = parcel.readString();
            this.f7222k = parcel.readString();
            this.f7223l = parcel.readInt();
            this.f7224m = parcel.createTypedArrayList(LatLng.CREATOR);
            this.f7225n = parcel.createIntArray();
            this.f7226o = parcel.readInt();
            this.f7227p = parcel.readString();
        }
    }

    static class a implements Parcelable.Creator<DrivingRouteLine> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrivingRouteLine createFromParcel(Parcel parcel) {
            return new DrivingRouteLine(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrivingRouteLine[] newArray(int i8) {
            return new DrivingRouteLine[i8];
        }
    }

    public DrivingRouteLine() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCongestionDistance() {
        return this.f7213k;
    }

    public int getLightNum() {
        return this.f7214l;
    }

    public int getToll() {
        return this.f7215m;
    }

    public List<RouteNode> getWayPoints() {
        return this.f7212j;
    }

    @Deprecated
    public boolean isSupportTraffic() {
        return this.f7211i;
    }

    public void setCongestionDistance(int i8) {
        this.f7213k = i8;
    }

    public void setLightNum(int i8) {
        this.f7214l = i8;
    }

    public void setSupportTraffic(boolean z7) {
        this.f7211i = z7;
    }

    public void setToll(int i8) {
        this.f7215m = i8;
    }

    public void setWayPoints(List<RouteNode> list) {
        this.f7212j = list;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.setType(RouteLine.TYPE.DRIVESTEP);
        super.writeToParcel(parcel, i8);
        parcel.writeByte(this.f7211i ? (byte) 1 : (byte) 0);
        parcel.writeList(this.f7212j);
        parcel.writeInt(this.f7213k);
        parcel.writeInt(this.f7214l);
        parcel.writeInt(this.f7215m);
    }

    protected DrivingRouteLine(Parcel parcel) {
        super(parcel);
        this.f7211i = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        this.f7212j = arrayList;
        parcel.readList(arrayList, RouteNode.class.getClassLoader());
        this.f7213k = parcel.readInt();
        this.f7214l = parcel.readInt();
        this.f7215m = parcel.readInt();
    }
}
