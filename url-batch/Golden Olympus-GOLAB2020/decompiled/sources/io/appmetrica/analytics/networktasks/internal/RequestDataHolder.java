package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class RequestDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private NetworkTask.Method f40623a = NetworkTask.Method.GET;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f40624b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private byte[] f40625c = null;

    /* renamed from: d, reason: collision with root package name */
    private Long f40626d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f40627e;

    public void applySendTime(long j4) {
        this.f40626d = Long.valueOf(j4);
        this.f40627e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j4) * 1000) / 1000);
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f40624b;
    }

    @NonNull
    public NetworkTask.Method getMethod() {
        return this.f40623a;
    }

    public byte[] getPostData() {
        return this.f40625c;
    }

    public Long getSendTimestamp() {
        return this.f40626d;
    }

    public Integer getSendTimezoneSec() {
        return this.f40627e;
    }

    public void setHeader(@NonNull String str, @NonNull String... strArr) {
        this.f40624b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f40623a = NetworkTask.Method.POST;
        this.f40625c = bArr;
    }
}
