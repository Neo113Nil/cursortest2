package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.BusInfo;
import com.baidu.mapapi.search.core.CoachInfo;
import com.baidu.mapapi.search.core.PlaneInfo;
import com.baidu.mapapi.search.core.PriceInfo;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapapi.search.core.TrainInfo;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class MassTransitRouteLine extends RouteLine<TransitStep> {
    public static final Parcelable.Creator<MassTransitRouteLine> CREATOR = new a();

    /* renamed from: i, reason: collision with root package name */
    private String f7252i;

    /* renamed from: j, reason: collision with root package name */
    private double f7253j;

    /* renamed from: k, reason: collision with root package name */
    private List<PriceInfo> f7254k;

    /* renamed from: l, reason: collision with root package name */
    private List<List<TransitStep>> f7255l;

    public static class TransitStep extends RouteStep {
        public static final Parcelable.Creator<TransitStep> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        private List<TrafficCondition> f7256e;

        /* renamed from: f, reason: collision with root package name */
        private LatLng f7257f;

        /* renamed from: g, reason: collision with root package name */
        private LatLng f7258g;

        /* renamed from: h, reason: collision with root package name */
        private TrainInfo f7259h;

        /* renamed from: i, reason: collision with root package name */
        private PlaneInfo f7260i;

        /* renamed from: j, reason: collision with root package name */
        private CoachInfo f7261j;

        /* renamed from: k, reason: collision with root package name */
        private BusInfo f7262k;

        /* renamed from: l, reason: collision with root package name */
        private StepVehicleInfoType f7263l;

        /* renamed from: m, reason: collision with root package name */
        private String f7264m;

        /* renamed from: n, reason: collision with root package name */
        private String f7265n;

        public enum StepVehicleInfoType {
            ESTEP_TRAIN(1),
            ESTEP_PLANE(2),
            ESTEP_BUS(3),
            ESTEP_DRIVING(4),
            ESTEP_WALK(5),
            ESTEP_COACH(6);


            /* renamed from: a, reason: collision with root package name */
            private int f7266a;

            StepVehicleInfoType(int i8) {
                this.f7266a = i8;
            }

            public int getInt() {
                return this.f7266a;
            }
        }

        public static class TrafficCondition implements Parcelable {
            public static final Parcelable.Creator<TrafficCondition> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private int f7267a;

            /* renamed from: b, reason: collision with root package name */
            private int f7268b;

            static class a implements Parcelable.Creator<TrafficCondition> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public TrafficCondition createFromParcel(Parcel parcel) {
                    return new TrafficCondition(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public TrafficCondition[] newArray(int i8) {
                    return new TrafficCondition[i8];
                }
            }

            public TrafficCondition() {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public int getTrafficGeoCnt() {
                return this.f7268b;
            }

            public int getTrafficStatus() {
                return this.f7267a;
            }

            public void setTrafficGeoCnt(int i8) {
                this.f7268b = i8;
            }

            public void setTrafficStatus(int i8) {
                this.f7267a = i8;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i8) {
                parcel.writeInt(this.f7267a);
                parcel.writeInt(this.f7268b);
            }

            protected TrafficCondition(Parcel parcel) {
                this.f7267a = parcel.readInt();
                this.f7268b = parcel.readInt();
            }
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

        private List<LatLng> a(String str) {
            String[] split;
            ArrayList arrayList = new ArrayList();
            String[] split2 = str.split(";");
            if (split2 != null) {
                for (String str2 : split2) {
                    if (str2 != null && str2 != "" && (split = str2.split(SystemInfoUtil.COMMA)) != null && split[1] != "" && split[0] != "") {
                        LatLng latLng = new LatLng(Double.parseDouble(split[1]), Double.parseDouble(split[0]));
                        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                            latLng = CoordTrans.baiduToGcj(latLng);
                        }
                        arrayList.add(latLng);
                    }
                }
            }
            return arrayList;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public BusInfo getBusInfo() {
            return this.f7262k;
        }

        public CoachInfo getCoachInfo() {
            return this.f7261j;
        }

        public LatLng getEndLocation() {
            return this.f7258g;
        }

        public String getInstructions() {
            return this.f7264m;
        }

        public PlaneInfo getPlaneInfo() {
            return this.f7260i;
        }

        public LatLng getStartLocation() {
            return this.f7257f;
        }

        public List<TrafficCondition> getTrafficConditions() {
            return this.f7256e;
        }

        public TrainInfo getTrainInfo() {
            return this.f7259h;
        }

        public StepVehicleInfoType getVehileType() {
            return this.f7263l;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = a(this.f7265n);
            }
            return this.mWayPoints;
        }

        public void setBusInfo(BusInfo busInfo) {
            this.f7262k = busInfo;
        }

        public void setCoachInfo(CoachInfo coachInfo) {
            this.f7261j = coachInfo;
        }

        public void setEndLocation(LatLng latLng) {
            this.f7258g = latLng;
        }

        public void setInstructions(String str) {
            this.f7264m = str;
        }

        public void setPathString(String str) {
            this.f7265n = str;
        }

        public void setPlaneInfo(PlaneInfo planeInfo) {
            this.f7260i = planeInfo;
        }

        public void setStartLocation(LatLng latLng) {
            this.f7257f = latLng;
        }

        public void setTrafficConditions(List<TrafficCondition> list) {
            this.f7256e = list;
        }

        public void setTrainInfo(TrainInfo trainInfo) {
            this.f7259h = trainInfo;
        }

        public void setVehileType(StepVehicleInfoType stepVehicleInfoType) {
            this.f7263l = stepVehicleInfoType;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeTypedList(this.f7256e);
            parcel.writeParcelable(this.f7257f, i8);
            parcel.writeParcelable(this.f7258g, i8);
            parcel.writeParcelable(this.f7259h, i8);
            parcel.writeParcelable(this.f7260i, i8);
            parcel.writeParcelable(this.f7261j, i8);
            parcel.writeParcelable(this.f7262k, i8);
            parcel.writeInt(this.f7263l.getInt());
            parcel.writeString(this.f7264m);
            parcel.writeString(this.f7265n);
        }

        protected TransitStep(Parcel parcel) {
            super(parcel);
            this.f7256e = parcel.createTypedArrayList(TrafficCondition.CREATOR);
            this.f7257f = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            this.f7258g = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            this.f7259h = (TrainInfo) parcel.readParcelable(TrainInfo.class.getClassLoader());
            this.f7260i = (PlaneInfo) parcel.readParcelable(PlaneInfo.class.getClassLoader());
            this.f7261j = (CoachInfo) parcel.readParcelable(CoachInfo.class.getClassLoader());
            this.f7262k = (BusInfo) parcel.readParcelable(BusInfo.class.getClassLoader());
            switch (parcel.readInt()) {
                case 1:
                    this.f7263l = StepVehicleInfoType.ESTEP_TRAIN;
                    break;
                case 2:
                    this.f7263l = StepVehicleInfoType.ESTEP_PLANE;
                    break;
                case 3:
                    this.f7263l = StepVehicleInfoType.ESTEP_BUS;
                    break;
                case 4:
                    this.f7263l = StepVehicleInfoType.ESTEP_DRIVING;
                    break;
                case 5:
                    this.f7263l = StepVehicleInfoType.ESTEP_WALK;
                    break;
                case 6:
                    this.f7263l = StepVehicleInfoType.ESTEP_COACH;
                    break;
            }
            this.f7264m = parcel.readString();
            this.f7265n = parcel.readString();
        }
    }

    static class a implements Parcelable.Creator<MassTransitRouteLine> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MassTransitRouteLine createFromParcel(Parcel parcel) {
            return new MassTransitRouteLine(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MassTransitRouteLine[] newArray(int i8) {
            return new MassTransitRouteLine[i8];
        }
    }

    public MassTransitRouteLine() {
        this.f7255l = null;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getArriveTime() {
        return this.f7252i;
    }

    public List<List<TransitStep>> getNewSteps() {
        return this.f7255l;
    }

    public double getPrice() {
        return this.f7253j;
    }

    public List<PriceInfo> getPriceInfo() {
        return this.f7254k;
    }

    public void setArriveTime(String str) {
        this.f7252i = str;
    }

    public void setNewSteps(List<List<TransitStep>> list) {
        this.f7255l = list;
    }

    public void setPrice(double d8) {
        this.f7253j = d8;
    }

    public void setPriceInfo(List<PriceInfo> list) {
        this.f7254k = list;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        List<List<TransitStep>> list = this.f7255l;
        parcel.writeInt(list == null ? 0 : list.size());
        parcel.writeString(this.f7252i);
        parcel.writeDouble(this.f7253j);
        parcel.writeTypedList(this.f7254k);
        Iterator<List<TransitStep>> it = this.f7255l.iterator();
        while (it.hasNext()) {
            parcel.writeTypedList(it.next());
        }
    }

    protected MassTransitRouteLine(Parcel parcel) {
        super(parcel);
        this.f7255l = null;
        int readInt = parcel.readInt();
        this.f7252i = parcel.readString();
        this.f7253j = parcel.readDouble();
        this.f7254k = parcel.createTypedArrayList(PriceInfo.CREATOR);
        if (readInt > 0) {
            this.f7255l = new ArrayList();
            for (int i8 = 0; i8 < readInt; i8++) {
                this.f7255l.add(parcel.createTypedArrayList(TransitStep.CREATOR));
            }
        }
    }
}
