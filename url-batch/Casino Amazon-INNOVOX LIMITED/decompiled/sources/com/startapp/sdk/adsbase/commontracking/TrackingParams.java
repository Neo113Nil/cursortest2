package com.startapp.sdk.adsbase.commontracking;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class TrackingParams implements Serializable {
    private static final long serialVersionUID = 8119468204117511007L;
    private String adTag;
    private String clientSessionId;
    private boolean mraid;
    private String nonImpressionReason;
    private int offset;
    private String profileId;

    public TrackingParams() {
        this(null);
    }

    public final String a() {
        return this.adTag;
    }

    public final int b() {
        return this.offset;
    }

    public String c() {
        return this.offset > 0 ? "&offset=" + this.offset : "";
    }

    public final String d() {
        return this.profileId;
    }

    public String e() {
        StringBuilder sb = new StringBuilder();
        String str = this.adTag;
        String str2 = "";
        StringBuilder append = sb.append((str == null || str.equals("")) ? "" : "&adTag=" + zh.a(this.adTag.substring(0, Math.min(this.adTag.length(), 200)))).append(this.clientSessionId != null ? "&clientSessionId=" + zh.a(this.clientSessionId) : "").append(this.profileId != null ? "&profileId=" + zh.a(this.profileId) : "").append(c()).append(this.mraid ? "&mraid=true" : "");
        String str3 = this.nonImpressionReason;
        if (str3 != null && !str3.equals("")) {
            str2 = "&isShown=false&reason=" + zh.a(this.nonImpressionReason);
        }
        return append.append(str2).toString();
    }

    public TrackingParams(String str) {
        this.adTag = str;
        this.clientSessionId = vf.d.f470a;
        this.profileId = MetaData.A().L();
        this.offset = 0;
    }

    public final TrackingParams a(int i) {
        this.offset = i;
        return this;
    }

    public final void a(boolean z) {
        this.mraid = z;
    }

    public final TrackingParams a(String str) {
        this.nonImpressionReason = str;
        return this;
    }
}
