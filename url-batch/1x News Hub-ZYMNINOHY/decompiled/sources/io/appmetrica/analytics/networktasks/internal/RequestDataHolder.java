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
    private NetworkTask.Method f8915a = NetworkTask.Method.GET;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f8916b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private byte[] f8917c = null;

    /* renamed from: d, reason: collision with root package name */
    private Long f8918d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f8919e;

    public void applySendTime(long j3) {
        this.f8918d = Long.valueOf(j3);
        this.f8919e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j3) * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
    }

    public Map<String, List<String>> getHeaders() {
        return this.f8916b;
    }

    public NetworkTask.Method getMethod() {
        return this.f8915a;
    }

    public byte[] getPostData() {
        return this.f8917c;
    }

    public Long getSendTimestamp() {
        return this.f8918d;
    }

    public Integer getSendTimezoneSec() {
        return this.f8919e;
    }

    public void setHeader(String str, String... strArr) {
        this.f8916b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f8915a = NetworkTask.Method.POST;
        this.f8917c = bArr;
    }
}
