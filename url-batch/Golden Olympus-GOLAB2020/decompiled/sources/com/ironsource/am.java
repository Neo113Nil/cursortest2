package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class am {

    /* renamed from: a, reason: collision with root package name */
    private final C1454e2 f15080a;

    public am(C1454e2 c1454e2) {
        this.f15080a = c1454e2;
    }

    public void a() {
        this.f15080a.a(EnumC1433b2.RELOAD_AD, new HashMap());
    }

    public void b(int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i4));
        this.f15080a.a(EnumC1433b2.SKIP_RELOAD_AD, hashMap);
    }

    public void a(int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionDepth", Integer.valueOf(i4));
        this.f15080a.a(EnumC1433b2.DESTROY_AD, hashMap);
    }

    public void b(long j4, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        hashMap.put("errorCode", Integer.valueOf(i4));
        this.f15080a.a(EnumC1433b2.RELOAD_AD_NO_FILL, hashMap);
    }

    public void a(long j4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        this.f15080a.a(EnumC1433b2.RELOAD_AD_SUCCESS, hashMap);
    }

    public void a(long j4, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        hashMap.put("errorCode", Integer.valueOf(i4));
        this.f15080a.a(EnumC1433b2.LOAD_AD_NO_FILL, hashMap);
    }

    public void a(long j4, int i4, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        hashMap.put("errorCode", Integer.valueOf(i4));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f15080a.a(EnumC1433b2.RELOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    public void a(long j4, int i4, String str, boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        hashMap.put("errorCode", Integer.valueOf(i4));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        if (z4) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f15080a.a(EnumC1433b2.LOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    public void a(long j4, int i4, boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        hashMap.put("errorCode", Integer.valueOf(i4));
        if (z4) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f15080a.a(EnumC1433b2.LOAD_AD_FAILED, hashMap);
    }

    public void a(long j4, boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        if (z4) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f15080a.a(EnumC1433b2.LOAD_AD_SUCCESS, hashMap);
    }

    public void a(Boolean bool, String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f15080a.a(bool.booleanValue() ? EnumC1433b2.AD_READY_TRUE : EnumC1433b2.AD_READY_FALSE, hashMap);
    }

    public void a(boolean z4) {
        HashMap hashMap = new HashMap();
        if (z4) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f15080a.a(EnumC1433b2.LOAD_AD, hashMap);
    }

    public void a(boolean z4, long j4, boolean z5) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        if (z5) {
            hashMap.put("errorCode", Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            hashMap.put("reason", "loaded ads are expired");
        }
        this.f15080a.a(z4 ? EnumC1433b2.AD_AVAILABILITY_CHANGED_TRUE : EnumC1433b2.AD_AVAILABILITY_CHANGED_FALSE, hashMap);
    }
}
