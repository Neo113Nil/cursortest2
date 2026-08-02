package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class RequestDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private NetworkTask.Method f13334a = NetworkTask.Method.GET;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f13335b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private byte[] f13336c = null;

    /* renamed from: d, reason: collision with root package name */
    private Long f13337d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f13338e;

    public void applySendTime(long j4) {
        this.f13337d = Long.valueOf(j4);
        this.f13338e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j4) * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
    }

    public Map<String, List<String>> getHeaders() {
        return this.f13335b;
    }

    public NetworkTask.Method getMethod() {
        return this.f13334a;
    }

    public byte[] getPostData() {
        return this.f13336c;
    }

    public Long getSendTimestamp() {
        return this.f13337d;
    }

    public Integer getSendTimezoneSec() {
        return this.f13338e;
    }

    public void setHeader(String str, String... strArr) {
        this.f13335b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f13334a = NetworkTask.Method.POST;
        this.f13336c = bArr;
    }
}
