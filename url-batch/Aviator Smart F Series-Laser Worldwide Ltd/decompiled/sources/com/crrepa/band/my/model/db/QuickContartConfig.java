package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class QuickContartConfig {
    private Integer count;
    private Integer height;
    private Long id;
    private Integer maxNameLength;
    private String name;
    private Boolean supported;
    private Integer width;

    public QuickContartConfig(Long l8, String str, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.id = l8;
        this.name = str;
        this.supported = bool;
        this.count = num;
        this.width = num2;
        this.height = num3;
        this.maxNameLength = num4;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getHeight() {
        return this.height;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getMaxNameLength() {
        return this.maxNameLength;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getSupported() {
        return this.supported;
    }

    public Integer getWidth() {
        return this.width;
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public void setHeight(Integer num) {
        this.height = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setMaxNameLength(Integer num) {
        this.maxNameLength = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSupported(Boolean bool) {
        this.supported = bool;
    }

    public void setWidth(Integer num) {
        this.width = num;
    }

    public QuickContartConfig() {
    }
}
