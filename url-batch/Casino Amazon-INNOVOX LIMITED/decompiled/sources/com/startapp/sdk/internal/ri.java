package com.startapp.sdk.internal;

import android.text.TextUtils;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ri {

    /* renamed from: a, reason: collision with root package name */
    public final VideoTrackingLink[] f408a;
    public final VideoTrackingParams b;
    public final String c;
    public final int d;
    public VASTErrorCodes e;

    public ri(int i, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        this.f408a = videoTrackingLinkArr;
        this.b = videoTrackingParams;
        this.c = str;
        this.d = i;
    }

    public final qi a() {
        if (this.f408a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoTrackingLink videoTrackingLink : this.f408a) {
            if (videoTrackingLink.c() != null && (this.b.b() <= 0 || videoTrackingLink.f())) {
                String c = videoTrackingLink.c();
                String str = this.c;
                String replace = c.replace("[ASSETURI]", str != null ? TextUtils.htmlEncode(str) : "");
                int i = this.d;
                long j = i / 1000;
                long j2 = i % 1000;
                Locale locale = Locale.US;
                String replace2 = replace.replace("[CONTENTPLAYHEAD]", TextUtils.htmlEncode(String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(j / 3600), Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60), Long.valueOf(j2)))).replace("[CACHEBUSTING]", TextUtils.htmlEncode(String.valueOf(new SecureRandom().nextInt(90000000) + 10000000)));
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).format(new Date());
                int length = format.length() - 2;
                String replace3 = replace2.replace("[TIMESTAMP]", TextUtils.htmlEncode(format.substring(0, length) + StringUtils.PROCESS_POSTFIX_DELIMITER + format.substring(length)));
                VASTErrorCodes vASTErrorCodes = this.e;
                if (vASTErrorCodes != null) {
                    replace3 = replace3.replace("[ERRORCODE]", String.valueOf(vASTErrorCodes.a()));
                }
                StringBuilder sb = new StringBuilder(replace3);
                VideoTrackingLink.TrackingSource b = videoTrackingLink.b();
                if (b == null) {
                    b = zh.d(videoTrackingLink.c()) ? VideoTrackingLink.TrackingSource.STARTAPP : VideoTrackingLink.TrackingSource.EXTERNAL;
                }
                VideoTrackingParams c2 = this.b.b(b == VideoTrackingLink.TrackingSource.STARTAPP).c(videoTrackingLink.f()).c(videoTrackingLink.a());
                sb.append(c2.e());
                if (c2.g()) {
                    sb.append(g.a(g.c(e0.a(videoTrackingLink.c(), (String) null))));
                }
                arrayList.add(sb.toString());
            }
        }
        return new qi(arrayList);
    }
}
