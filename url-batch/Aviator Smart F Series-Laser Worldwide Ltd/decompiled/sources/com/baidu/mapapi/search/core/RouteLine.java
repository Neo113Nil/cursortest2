package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapapi.search.route.BikingRouteLine;
import com.baidu.mapapi.search.route.DrivingRouteLine;
import com.baidu.mapapi.search.route.TransitRouteLine;
import com.baidu.mapapi.search.route.WalkingRouteLine;
import java.util.List;

/* loaded from: classes2.dex */
public class RouteLine<T extends RouteStep> implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private RouteNode f6813a;

    /* renamed from: b, reason: collision with root package name */
    private RouteNode f6814b;

    /* renamed from: c, reason: collision with root package name */
    private String f6815c;

    /* renamed from: d, reason: collision with root package name */
    private List<T> f6816d;

    /* renamed from: e, reason: collision with root package name */
    private int f6817e;

    /* renamed from: f, reason: collision with root package name */
    private int f6818f;

    /* renamed from: g, reason: collision with root package name */
    private LegLinked f6819g;

    /* renamed from: h, reason: collision with root package name */
    TYPE f6820h;

    protected enum TYPE {
        DRIVESTEP(0),
        TRANSITSTEP(1),
        WALKSTEP(2),
        BIKINGSTEP(3);


        /* renamed from: b, reason: collision with root package name */
        private int f6822b;

        TYPE(int i8) {
            this.f6822b = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.f6822b;
        }
    }

    protected RouteLine() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<T> getAllStep() {
        return this.f6816d;
    }

    public int getDistance() {
        return this.f6817e;
    }

    public int getDuration() {
        return this.f6818f;
    }

    public LegLinked getLegLinked() {
        return this.f6819g;
    }

    public RouteNode getStarting() {
        return this.f6813a;
    }

    public RouteNode getTerminal() {
        return this.f6814b;
    }

    public String getTitle() {
        return this.f6815c;
    }

    protected TYPE getType() {
        return this.f6820h;
    }

    public void setDistance(int i8) {
        this.f6817e = i8;
    }

    public void setDuration(int i8) {
        this.f6818f = i8;
    }

    public void setLegLinked(LegLinked legLinked) {
        this.f6819g = legLinked;
    }

    public void setStarting(RouteNode routeNode) {
        this.f6813a = routeNode;
    }

    public void setSteps(List<T> list) {
        this.f6816d = list;
    }

    public void setTerminal(RouteNode routeNode) {
        this.f6814b = routeNode;
    }

    public void setTitle(String str) {
        this.f6815c = str;
    }

    protected void setType(TYPE type) {
        this.f6820h = type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        TYPE type = this.f6820h;
        if (type != null) {
            parcel.writeInt(type.a());
        } else {
            parcel.writeInt(10);
        }
        parcel.writeValue(this.f6813a);
        parcel.writeValue(this.f6814b);
        parcel.writeString(this.f6815c);
        if (this.f6820h != null) {
            parcel.writeTypedList(this.f6816d);
        }
        parcel.writeInt(this.f6817e);
        parcel.writeInt(this.f6818f);
    }

    protected RouteLine(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f6813a = (RouteNode) parcel.readValue(RouteNode.class.getClassLoader());
        this.f6814b = (RouteNode) parcel.readValue(RouteNode.class.getClassLoader());
        this.f6815c = parcel.readString();
        if (readInt == 0) {
            this.f6816d = parcel.createTypedArrayList(DrivingRouteLine.DrivingStep.CREATOR);
        } else if (readInt == 1) {
            this.f6816d = parcel.createTypedArrayList(TransitRouteLine.TransitStep.CREATOR);
        } else if (readInt == 2) {
            this.f6816d = parcel.createTypedArrayList(WalkingRouteLine.WalkingStep.CREATOR);
        } else if (readInt == 3) {
            this.f6816d = parcel.createTypedArrayList(BikingRouteLine.BikingStep.CREATOR);
        }
        this.f6817e = parcel.readInt();
        this.f6818f = parcel.readInt();
    }
}
