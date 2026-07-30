package com.baidu.mapapi.search.route;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes2.dex */
public class IndoorRouteLine extends RouteLine<IndoorRouteStep> {
    public static final Parcelable.Creator<IndoorRouteLine> CREATOR = new a();

    public static class IndoorRouteStep extends RouteStep {

        /* renamed from: e, reason: collision with root package name */
        private RouteNode f7238e;

        /* renamed from: f, reason: collision with root package name */
        private RouteNode f7239f;

        /* renamed from: g, reason: collision with root package name */
        private String f7240g;

        /* renamed from: h, reason: collision with root package name */
        private String f7241h;

        /* renamed from: i, reason: collision with root package name */
        private String f7242i;

        /* renamed from: j, reason: collision with root package name */
        private List<IndoorStepNode> f7243j;

        /* renamed from: k, reason: collision with root package name */
        private List<Double> f7244k;

        public static class IndoorStepNode {

            /* renamed from: a, reason: collision with root package name */
            private String f7245a;

            /* renamed from: b, reason: collision with root package name */
            private int f7246b;

            /* renamed from: c, reason: collision with root package name */
            private LatLng f7247c;

            /* renamed from: d, reason: collision with root package name */
            private String f7248d;

            public String getDetail() {
                return this.f7248d;
            }

            public LatLng getLocation() {
                return this.f7247c;
            }

            public String getName() {
                return this.f7245a;
            }

            public int getType() {
                return this.f7246b;
            }

            public void setDetail(String str) {
                this.f7248d = str;
            }

            public void setLocation(LatLng latLng) {
                this.f7247c = latLng;
            }

            public void setName(String str) {
                this.f7245a = str;
            }

            public void setType(int i8) {
                this.f7246b = i8;
            }
        }

        private List<LatLng> a(List<Double> list) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < list.size(); i8 += 2) {
                arrayList.add(new LatLng(list.get(i8).doubleValue(), list.get(i8 + 1).doubleValue()));
            }
            return arrayList;
        }

        public String getBuildingId() {
            return this.f7242i;
        }

        public RouteNode getEntrace() {
            return this.f7238e;
        }

        public RouteNode getExit() {
            return this.f7239f;
        }

        public String getFloorId() {
            return this.f7241h;
        }

        public String getInstructions() {
            return this.f7240g;
        }

        public List<IndoorStepNode> getStepNodes() {
            return this.f7243j;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = a(this.f7244k);
            }
            return this.mWayPoints;
        }

        public void setBuildingId(String str) {
            this.f7242i = str;
        }

        public void setEntrace(RouteNode routeNode) {
            this.f7238e = routeNode;
        }

        public void setExit(RouteNode routeNode) {
            this.f7239f = routeNode;
        }

        public void setFloorId(String str) {
            this.f7241h = str;
        }

        public void setInstructions(String str) {
            this.f7240g = str;
        }

        public void setPath(List<Double> list) {
            this.f7244k = list;
        }

        public void setStepNodes(List<IndoorStepNode> list) {
            this.f7243j = list;
        }
    }

    static class a implements Parcelable.Creator<IndoorRouteLine> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndoorRouteLine createFromParcel(Parcel parcel) {
            return new IndoorRouteLine(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndoorRouteLine[] newArray(int i8) {
            return new IndoorRouteLine[i8];
        }
    }

    public IndoorRouteLine() {
        setType(RouteLine.TYPE.WALKSTEP);
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine
    public List<IndoorRouteStep> getAllStep() {
        return super.getAllStep();
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
    }

    protected IndoorRouteLine(Parcel parcel) {
        super(parcel);
    }
}
