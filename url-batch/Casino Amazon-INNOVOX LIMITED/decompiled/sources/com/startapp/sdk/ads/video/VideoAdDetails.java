package com.startapp.sdk.ads.video;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.ads.video.tracking.VideoTrackingDetails;
import com.startapp.sdk.ads.video.vast.VASTResource$CreativeType;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.internal.ai;
import com.startapp.sdk.internal.bi;
import com.startapp.sdk.internal.ji;
import com.startapp.sdk.internal.ki;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class VideoAdDetails implements Serializable {
    private static final long serialVersionUID = 4938639129535870268L;

    @TypeInfo(type = ArrayList.class, value = VerificationDetails.class)
    private List<VerificationDetails> adVerifications;
    private String clickUrl;
    private boolean clickable;
    private boolean closeable;
    private String filePath;
    private boolean isVideoMuted;

    @TypeInfo(type = PostRollType.class)
    private PostRollType postRoll;
    private String postRollClickThroughUrl;

    @TypeInfo(type = ArrayList.class)
    private List<String> postRollHtml;
    private boolean skippable;
    private long skippableAfter;
    private Long unskipLess;

    @TypeInfo(complex = true)
    private VideoTrackingDetails videoTrackingDetails;
    private String videoUrl;

    /* compiled from: Sta */
    public enum PostRollType {
        IMAGE,
        LAST_FRAME,
        NONE
    }

    public VideoAdDetails() {
    }

    public List<VerificationDetails> getAdVerifications() {
        return this.adVerifications;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getPostRollClickThroughUrl() {
        return this.postRollHtml != null ? this.postRollClickThroughUrl : this.clickUrl;
    }

    public String getPostRollHtml(int i) {
        List<String> list = this.postRollHtml;
        if (list != null && i < list.size()) {
            return this.postRollHtml.get(i);
        }
        return null;
    }

    public int getPostRollHtmlNum() {
        List<String> list = this.postRollHtml;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public PostRollType getPostRollType() {
        return this.postRoll;
    }

    public long getSkippableAfter() {
        return this.skippableAfter;
    }

    public Long getUnskipLess() {
        return this.unskipLess;
    }

    public VideoTrackingDetails getVideoTrackingDetails() {
        return this.videoTrackingDetails;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public boolean hasPostRoll() {
        return (this.postRoll == PostRollType.NONE && this.postRollHtml == null) ? false : true;
    }

    public boolean isClickable() {
        return this.clickable;
    }

    public boolean isCloseable() {
        return this.closeable;
    }

    public boolean isSkippable() {
        return this.skippable;
    }

    public boolean isVideoMuted() {
        return this.isVideoMuted;
    }

    public void setAdVerifications(List<VerificationDetails> list) {
        this.adVerifications = list;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setVideoMuted(boolean z) {
        this.isVideoMuted = z;
    }

    public void setup() {
        this.skippableAfter = TimeUnit.SECONDS.toMillis(this.skippableAfter);
    }

    public String toString() {
        return super.toString();
    }

    public VideoAdDetails(bi biVar, VideoConfig videoConfig, ki kiVar, AssetManager assetManager) {
        String a2;
        this.videoTrackingDetails = new VideoTrackingDetails(biVar);
        this.videoUrl = biVar.p;
        if (kiVar != null) {
            Long l = kiVar.f309a;
            this.skippableAfter = l != null ? l.longValue() : biVar.m != null ? r3.intValue() : videoConfig.p();
            this.skippable = true;
            this.unskipLess = kiVar.b;
        } else {
            this.skippable = false;
        }
        String str = biVar.s;
        this.clickUrl = str;
        this.clickable = str != null;
        this.postRoll = PostRollType.NONE;
        List<ai> list = biVar.o;
        if (list != null) {
            for (ai aiVar : list) {
                ji jiVar = aiVar.c;
                int ordinal = jiVar.b.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        String str2 = jiVar.f292a;
                        boolean find = str2 == null ? false : Pattern.compile("<body\\b[^>]*>.*?</body>", 34).matcher(str2).find();
                        a2 = jiVar.f292a;
                        if (!find) {
                            a2 = jiVar.a(assetManager, a2);
                        }
                    }
                    a2 = null;
                } else {
                    if (jiVar.c == VASTResource$CreativeType.IMAGE) {
                        a2 = jiVar.a(assetManager, "<img src=\"" + TextUtils.htmlEncode(jiVar.f292a) + "\" />");
                    }
                    a2 = null;
                }
                if (a2 != null) {
                    if (this.postRollHtml == null) {
                        this.postRollHtml = new ArrayList();
                    }
                    this.postRollHtml.add(a2);
                }
                if (this.postRollClickThroughUrl == null) {
                    this.postRollClickThroughUrl = aiVar.d;
                }
            }
        }
        setAdVerifications(Collections.unmodifiableList(biVar.t));
    }
}
