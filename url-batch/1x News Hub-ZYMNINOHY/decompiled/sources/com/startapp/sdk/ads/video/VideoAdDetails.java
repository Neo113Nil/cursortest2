package com.startapp.sdk.ads.video;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.ads.video.tracking.VideoTrackingDetails;
import com.startapp.sdk.ads.video.vast.VASTResource$CreativeType;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.internal.cj;
import com.startapp.sdk.internal.dj;
import com.startapp.sdk.internal.ti;
import com.startapp.sdk.internal.ui;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class VideoAdDetails implements Serializable {
    private static final long serialVersionUID = 4938639129535870268L;

    @TypeInfo(type = ArrayList.class, value = VerificationDetails.class)
    private List<VerificationDetails> adVerifications;
    private String clickUrl;
    private boolean clickable;
    private boolean closeable;
    private boolean isVideoMuted;
    private String localVideoPath;

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

    public String getLocalVideoPath() {
        return this.localVideoPath;
    }

    public String getPostRollClickThroughUrl() {
        return this.postRollHtml != null ? this.postRollClickThroughUrl : this.clickUrl;
    }

    public String getPostRollHtml(int i3) {
        List<String> list = this.postRollHtml;
        if (list != null && i3 < list.size()) {
            return this.postRollHtml.get(i3);
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

    public void setLocalVideoPath(String str) {
        this.localVideoPath = str;
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

    public VideoAdDetails(ui uiVar, VideoConfig videoConfig, dj djVar, AssetManager assetManager) {
        String a3;
        this.videoTrackingDetails = new VideoTrackingDetails(uiVar);
        this.videoUrl = uiVar.f4583p;
        if (djVar != null) {
            Long l3 = djVar.f3707a;
            this.skippableAfter = l3 != null ? l3.longValue() : uiVar.f4581m != null ? r3.intValue() : videoConfig.n();
            this.skippable = true;
            this.unskipLess = djVar.f3708b;
        } else {
            this.skippable = false;
        }
        String str = uiVar.f4586s;
        this.clickUrl = str;
        this.clickable = str != null;
        this.postRoll = PostRollType.NONE;
        List<ti> list = uiVar.o;
        if (list != null) {
            for (ti tiVar : list) {
                cj cjVar = tiVar.f4491c;
                int ordinal = cjVar.f3668b.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        String str2 = cjVar.f3667a;
                        a3 = str2 == null ? false : Pattern.compile("<body\\b[^>]*>.*?</body>", 34).matcher(str2).find() ? cjVar.f3667a : cjVar.a(assetManager, cjVar.f3667a);
                    }
                    a3 = null;
                } else {
                    if (cjVar.f3669c == VASTResource$CreativeType.IMAGE) {
                        a3 = cjVar.a(assetManager, "<img src=\"" + TextUtils.htmlEncode(cjVar.f3667a) + "\" />");
                    }
                    a3 = null;
                }
                if (a3 != null) {
                    if (this.postRollHtml == null) {
                        this.postRollHtml = new ArrayList();
                    }
                    this.postRollHtml.add(a3);
                }
                if (this.postRollClickThroughUrl == null) {
                    this.postRollClickThroughUrl = tiVar.f4492d;
                }
            }
        }
        setAdVerifications(Collections.unmodifiableList(uiVar.f4587t));
    }
}
