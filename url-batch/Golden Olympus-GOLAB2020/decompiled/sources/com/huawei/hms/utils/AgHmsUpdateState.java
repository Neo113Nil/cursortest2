package com.huawei.hms.utils;

import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public class AgHmsUpdateState {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f14424c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static volatile AgHmsUpdateState f14425d;

    /* renamed from: a, reason: collision with root package name */
    private HmsCheckedState f14426a = HmsCheckedState.UNCHECKED;

    /* renamed from: b, reason: collision with root package name */
    private int f14427b = 0;

    private AgHmsUpdateState() {
    }

    public static AgHmsUpdateState getInstance() {
        if (f14425d == null) {
            synchronized (f14424c) {
                try {
                    if (f14425d == null) {
                        f14425d = new AgHmsUpdateState();
                    }
                } finally {
                }
            }
        }
        return f14425d;
    }

    public HmsCheckedState getCheckedState() {
        return this.f14426a;
    }

    public int getTargetVersionCode() {
        return this.f14427b;
    }

    public boolean isUpdateHms() {
        return getCheckedState() == HmsCheckedState.NEED_UPDATE && this.f14427b != 0;
    }

    public void resetUpdateState() {
        if (getCheckedState() != HmsCheckedState.NEED_UPDATE) {
            return;
        }
        setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
        setTargetVersionCode(0);
    }

    public void setCheckedState(HmsCheckedState hmsCheckedState) {
        if (hmsCheckedState == null) {
            HMSLog.e("AgHmsUpdateState", "para invalid: checkedState is null");
        } else {
            this.f14426a = hmsCheckedState;
        }
    }

    public void setTargetVersionCode(int i4) {
        this.f14427b = i4;
    }
}
