package com.startapp.sdk.internal;

import android.text.TextUtils;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class kj {

    /* renamed from: a, reason: collision with root package name */
    public final VideoTrackingLink[] f7194a;

    /* renamed from: b, reason: collision with root package name */
    public final VideoTrackingParams f7195b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7196c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7197d;

    /* renamed from: e, reason: collision with root package name */
    public VASTErrorCodes f7198e;

    public kj(int i4, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        this.f7194a = videoTrackingLinkArr;
        this.f7195b = videoTrackingParams;
        this.f7196c = str;
        this.f7197d = i4;
    }

    public final jj a() {
        if (this.f7194a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoTrackingLink videoTrackingLink : this.f7194a) {
            if (videoTrackingLink.c() != null && (this.f7195b.b() <= 0 || videoTrackingLink.f())) {
                String c4 = videoTrackingLink.c();
                String str = this.f7196c;
                String replace = c4.replace("[ASSETURI]", str != null ? TextUtils.htmlEncode(str) : "");
                int i4 = this.f7197d;
                long convert = TimeUnit.SECONDS.convert(i4, TimeUnit.MILLISECONDS);
                long j4 = i4 % AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                Locale locale = Locale.US;
                String replace2 = replace.replace("[CONTENTPLAYHEAD]", TextUtils.htmlEncode(String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(convert / 3600), Long.valueOf((convert % 3600) / 60), Long.valueOf(convert % 60), Long.valueOf(j4)))).replace("[CACHEBUSTING]", TextUtils.htmlEncode(String.valueOf(new SecureRandom().nextInt(90000000) + 10000000)));
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).format(new Date());
                int length = format.length() - 2;
                String replace3 = replace2.replace("[TIMESTAMP]", TextUtils.htmlEncode(format.substring(0, length) + StringUtils.PROCESS_POSTFIX_DELIMITER + format.substring(length)));
                VASTErrorCodes vASTErrorCodes = this.f7198e;
                if (vASTErrorCodes != null) {
                    replace3 = replace3.replace("[ERRORCODE]", String.valueOf(vASTErrorCodes.a()));
                }
                StringBuilder sb = new StringBuilder(replace3);
                VideoTrackingLink.TrackingSource b4 = videoTrackingLink.b();
                if (b4 == null) {
                    b4 = si.e(videoTrackingLink.c()) ? VideoTrackingLink.TrackingSource.STARTAPP : VideoTrackingLink.TrackingSource.EXTERNAL;
                }
                VideoTrackingParams c5 = this.f7195b.b(b4 == VideoTrackingLink.TrackingSource.STARTAPP).c(videoTrackingLink.f()).c(videoTrackingLink.a());
                sb.append(c5.e());
                if (c5.g()) {
                    sb.append(AbstractC0366g.a(AbstractC0366g.c(g0.a(videoTrackingLink.c(), (String) null))));
                }
                arrayList.add(sb.toString());
            }
        }
        return new jj(arrayList);
    }
}
