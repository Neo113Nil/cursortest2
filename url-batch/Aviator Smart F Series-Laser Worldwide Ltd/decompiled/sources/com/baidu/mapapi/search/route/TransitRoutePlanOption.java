package com.baidu.mapapi.search.route;

/* loaded from: classes2.dex */
public class TransitRoutePlanOption {
    public PlanNode mFrom = null;
    public PlanNode mTo = null;
    public String mCityName = null;
    public TransitPolicy mPolicy = TransitPolicy.EBUS_TIME_FIRST;

    public enum TransitPolicy {
        EBUS_TIME_FIRST(0),
        EBUS_TRANSFER_FIRST(2),
        EBUS_WALK_FIRST(3),
        EBUS_NO_SUBWAY(4);


        /* renamed from: b, reason: collision with root package name */
        private int f7305b;

        TransitPolicy(int i8) {
            this.f7305b = i8;
        }

        public int getInt() {
            return this.f7305b;
        }
    }

    public TransitRoutePlanOption city(String str) {
        this.mCityName = str;
        return this;
    }

    public TransitRoutePlanOption from(PlanNode planNode) {
        this.mFrom = planNode;
        return this;
    }

    public TransitRoutePlanOption policy(TransitPolicy transitPolicy) {
        this.mPolicy = transitPolicy;
        return this;
    }

    public TransitRoutePlanOption to(PlanNode planNode) {
        this.mTo = planNode;
        return this;
    }
}
