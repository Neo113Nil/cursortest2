package com.crrepa.band.my.device.ai.picture.model;

import com.moyoung.dafit.module.common.utils.x0;
import java.util.List;

/* loaded from: classes2.dex */
public class AIPictureStyleBean {
    private final String name;
    private List<String> sampleImages;
    private final String style;
    private List<String> tags;
    private List<String> tips;
    private final String url;

    public AIPictureStyleBean(String str, String str2, String str3) {
        this.style = str;
        this.name = str2;
        this.url = str3;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getSampleImages() {
        return this.sampleImages;
    }

    public String getStyle() {
        return this.style;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public List<String> getTips() {
        return this.tips;
    }

    public String getUrl() {
        return (x0.isEmpty(this.url) && x0.isNotEmpty(this.sampleImages)) ? getSampleImages().get(0) : this.url;
    }
}
