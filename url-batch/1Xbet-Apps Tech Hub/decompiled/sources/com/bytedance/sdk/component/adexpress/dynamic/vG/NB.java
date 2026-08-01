package com.bytedance.sdk.component.adexpress.dynamic.vG;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DynamicLayoutBrick.java */
/* loaded from: classes.dex */
public class NB {
    public static final Map<String, Integer> pvs;
    private sUS Jd;
    private sUS NB;
    private String icD;
    private String sUS;
    private String vG;

    static {
        HashMap hashMap = new HashMap();
        pvs = hashMap;
        hashMap.put("root", 8);
        hashMap.put("footer", 6);
        hashMap.put("empty", 6);
        hashMap.put(LinkHeader.Parameters.Title, 0);
        hashMap.put("subtitle", 0);
        hashMap.put(FirebaseAnalytics.Param.SOURCE, 0);
        hashMap.put("score-count", 0);
        hashMap.put("text_star", 0);
        hashMap.put("text", 0);
        hashMap.put("tag-group", 17);
        hashMap.put("app-version", 0);
        hashMap.put("development-name", 0);
        hashMap.put("privacy-detail", 23);
        hashMap.put("image", 1);
        hashMap.put("image-wide", 1);
        hashMap.put("image-square", 1);
        hashMap.put("image-long", 1);
        hashMap.put("image-splash", 1);
        hashMap.put("image-cover", 1);
        hashMap.put("app-icon", 1);
        hashMap.put("icon-download", 1);
        hashMap.put("logoad", 4);
        hashMap.put("logounion", 5);
        hashMap.put("logo-union", 9);
        hashMap.put("dislike", 3);
        hashMap.put("close", 3);
        hashMap.put("close-fill", 3);
        hashMap.put("webview-close", 22);
        hashMap.put("feedback-dislike", 12);
        hashMap.put("button", 2);
        hashMap.put("downloadWithIcon", 2);
        hashMap.put("downloadButton", 2);
        hashMap.put("fillButton", 2);
        hashMap.put("laceButton", 2);
        hashMap.put("cardButton", 2);
        hashMap.put("colourMixtureButton", 2);
        hashMap.put("arrowButton", 1);
        hashMap.put("download-progress-button", 2);
        hashMap.put("vessel", 6);
        hashMap.put("image-group", 6);
        hashMap.put("custom-component-vessel", 6);
        hashMap.put("carousel", 24);
        hashMap.put("carousel-vessel", 26);
        hashMap.put("leisure-interact", 25);
        hashMap.put("video-hd", 7);
        hashMap.put("video", 7);
        hashMap.put("video-vd", 7);
        hashMap.put("video-sq", 7);
        hashMap.put("muted", 10);
        hashMap.put("star", 11);
        hashMap.put("skip-countdowns", 19);
        hashMap.put("skip-with-countdowns-skip-btn", 21);
        hashMap.put("skip-with-countdowns-video-countdown", 13);
        hashMap.put("skip-with-countdowns-skip-countdown", 20);
        hashMap.put("skip-with-time", 14);
        hashMap.put("skip-with-time-countdown", 13);
        hashMap.put("skip-with-time-skip-btn", 15);
        hashMap.put("skip", 27);
        hashMap.put("timedown", 13);
        hashMap.put("icon", 16);
        hashMap.put("scoreCountWithIcon", 6);
        hashMap.put("split-line", 18);
        hashMap.put("creative-playable-bait", 0);
        hashMap.put("score-count-type-2", 0);
        hashMap.put("lottie", 28);
    }

    public int pvs() {
        if (TextUtils.isEmpty(this.icD)) {
            return 0;
        }
        if (this.icD.equals("logo")) {
            String str = this.icD + this.vG;
            this.icD = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.icD.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = pvs;
        if (map.get(this.icD) != null) {
            return map.get(this.icD).intValue();
        }
        return -1;
    }

    public String icD() {
        return this.icD;
    }

    public void pvs(String str) {
        this.icD = str;
    }

    public String vG() {
        return this.vG;
    }

    public void icD(String str) {
        this.vG = str;
    }

    public void vG(String str) {
        this.sUS = str;
    }

    public String Jd() {
        return this.sUS;
    }

    public sUS NB() {
        return this.Jd;
    }

    public int sUS() {
        return this.Jd.MY();
    }

    public void pvs(sUS sus) {
        this.Jd = sus;
    }

    public void icD(sUS sus) {
        this.NB = sus;
    }

    public sUS yiw() {
        return this.NB;
    }

    public String toString() {
        return "DynamicLayoutBrick{type='" + this.icD + "', data='" + this.vG + "', value=" + this.Jd + ", themeValue=" + this.NB + ", dataExtraInfo='" + this.sUS + "'}";
    }
}
