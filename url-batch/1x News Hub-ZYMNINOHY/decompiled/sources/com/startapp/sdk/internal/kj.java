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
    public final VideoTrackingLink[] f4066a;

    /* renamed from: b, reason: collision with root package name */
    public final VideoTrackingParams f4067b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4068c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4069d;

    /* renamed from: e, reason: collision with root package name */
    public VASTErrorCodes f4070e;

    public kj(int i3, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        this.f4066a = videoTrackingLinkArr;
        this.f4067b = videoTrackingParams;
        this.f4068c = str;
        this.f4069d = i3;
    }

    public final jj a() {
        if (this.f4066a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoTrackingLink videoTrackingLink : this.f4066a) {
            if (videoTrackingLink.c() != null && (this.f4067b.b() <= 0 || videoTrackingLink.f())) {
                String c3 = videoTrackingLink.c();
                String str = this.f4068c;
                String replace = c3.replace("[ASSETURI]", str != null ? TextUtils.htmlEncode(str) : "");
                int i3 = this.f4069d;
                long convert = TimeUnit.SECONDS.convert(i3, TimeUnit.MILLISECONDS);
                long j3 = i3 % AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                Locale locale = Locale.US;
                String replace2 = replace.replace("[CONTENTPLAYHEAD]", TextUtils.htmlEncode(String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(convert / 3600), Long.valueOf((convert % 3600) / 60), Long.valueOf(convert % 60), Long.valueOf(j3)))).replace("[CACHEBUSTING]", TextUtils.htmlEncode(String.valueOf(new SecureRandom().nextInt(90000000) + 10000000)));
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).format(new Date());
                int length = format.length() - 2;
                String replace3 = replace2.replace("[TIMESTAMP]", TextUtils.htmlEncode(format.substring(0, length) + StringUtils.PROCESS_POSTFIX_DELIMITER + format.substring(length)));
                VASTErrorCodes vASTErrorCodes = this.f4070e;
                if (vASTErrorCodes != null) {
                    replace3 = replace3.replace("[ERRORCODE]", String.valueOf(vASTErrorCodes.a()));
                }
                StringBuilder sb = new StringBuilder(replace3);
                VideoTrackingLink.TrackingSource b3 = videoTrackingLink.b();
                if (b3 == null) {
                    b3 = si.e(videoTrackingLink.c()) ? VideoTrackingLink.TrackingSource.STARTAPP : VideoTrackingLink.TrackingSource.EXTERNAL;
                }
                VideoTrackingParams c4 = this.f4067b.b(b3 == VideoTrackingLink.TrackingSource.STARTAPP).c(videoTrackingLink.f()).c(videoTrackingLink.a());
                sb.append(c4.e());
                if (c4.g()) {
                    sb.append(AbstractC0288g.a(AbstractC0288g.c(g0.a(videoTrackingLink.c(), (String) null))));
                }
                arrayList.add(sb.toString());
            }
        }
        return new jj(arrayList);
    }
}
