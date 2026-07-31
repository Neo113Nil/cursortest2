package com.ironsource;

import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class gv {

    /* renamed from: a, reason: collision with root package name */
    private final C1454e2 f16546a;

    public gv(C1454e2 c1454e2) {
        this.f16546a = c1454e2;
    }

    private String a(long j4, long j5, long j6) {
        return "interval: " + j4 + ", remainingTime: " + j5 + ", timePassed: " + j6;
    }

    public void b() {
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_LOAD, null);
    }

    public void c() {
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    public void d() {
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_SHOW, null);
    }

    public void e() {
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    public void f(@NotNull String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_ILLEGAL_STATE, hashMap);
    }

    public void g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_INTERNAL_ERROR, hashMap);
    }

    public void h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, hashMap);
    }

    public void i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, hashMap);
    }

    public void j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, hashMap);
    }

    public void k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_UNEXPECTED_CLOSED, hashMap);
    }

    public void l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, hashMap);
    }

    public void m(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, hashMap);
    }

    public void n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, hashMap);
    }

    public void o(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, hashMap);
    }

    public void p(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_UNEXPECTED_OPENED, hashMap);
    }

    public void q(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, hashMap);
    }

    public void r(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, hashMap);
    }

    public void s(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, hashMap);
    }

    public void t(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_UNEXPECTED_TIMEOUT, hashMap);
    }

    public void u(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_WATERFALL_OVERHEAD, hashMap);
    }

    public void a() {
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_DISPOSE, null);
    }

    public void b(int i4, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i4));
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    public void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_BN_RELOAD_EXCEPTION, hashMap);
    }

    public void d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, hashMap);
    }

    public void e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, hashMap);
    }

    public void a(int i4, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i4));
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    public void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_IMPRESSION_TIMEOUT, hashMap);
    }

    public void a(int i4, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i4));
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    public void b(String str, long j4, long j5, long j6) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, a(j4, j5, j6));
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_BANNER_REFRESH_RESUMED, hashMap);
    }

    public void a(long j4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, hashMap);
    }

    public void a(LevelPlayAdError levelPlayAdError) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(levelPlayAdError.getErrorCode()));
        hashMap.put("reason", levelPlayAdError.getErrorMessage());
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_SHOW_FAILED, hashMap);
    }

    public void a(@NonNull LevelPlayAdInfo levelPlayAdInfo, @NonNull LevelPlayAdInfo levelPlayAdInfo2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_AD_INFO_CHANGED, hashMap);
    }

    public void a(Long l4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, l4);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_LOAD_WHILE_LOADED, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }

    public void a(@NotNull String str, long j4) {
        String str2;
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "provider=" + str + ";";
        }
        sb.append(str2);
        sb.append("expirationDuration=");
        sb.append(j4);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }

    public void a(String str, long j4, long j5, long j6) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, a(j4, j5, j6));
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_BANNER_REFRESH_PAUSED, hashMap);
    }

    public void a(boolean z4, long j4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z4 ? 1 : 0));
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        this.f16546a.a(EnumC1433b2.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, hashMap);
    }
}
