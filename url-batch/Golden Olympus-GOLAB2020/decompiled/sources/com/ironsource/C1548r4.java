package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.r4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1548r4 {

    /* renamed from: a, reason: collision with root package name */
    private final C1454e2 f18895a;

    public C1548r4(C1454e2 c1454e2) {
        this.f18895a = c1454e2;
    }

    String a(int i4, int i5, int i6, int i7) {
        return "interstitial=" + i4 + ";rewarded=" + i5 + ";banner=" + i6 + ";native=" + i7;
    }

    public void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f18895a.a(EnumC1433b2.AUCTION_REQUEST_WATERFALL, hashMap);
    }

    public void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f18895a.a(EnumC1433b2.AUCTION_RESULT_WATERFALL, hashMap);
    }

    public void a() {
        this.f18895a.a(EnumC1433b2.AUCTION_REQUEST, null);
    }

    public void a(int i4, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i4));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f18895a.a(EnumC1433b2.AUCTION_FAILED_NO_CANDIDATES, hashMap);
    }

    public void a(long j4, int i4, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        hashMap.put("errorCode", Integer.valueOf(i4));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f18895a.a(EnumC1433b2.AUCTION_FAILED, hashMap);
    }

    public void a(long j4, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f18895a.a(EnumC1433b2.AUCTION_SUCCESS, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("auctionId", str);
        this.f18895a.a(EnumC1433b2.AD_FORMAT_CAPPED, hashMap);
    }
}
