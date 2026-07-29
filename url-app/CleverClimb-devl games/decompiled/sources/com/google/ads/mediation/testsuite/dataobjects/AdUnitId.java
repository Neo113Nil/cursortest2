package com.google.ads.mediation.testsuite.dataobjects;

/* loaded from: classes.dex */
public class AdUnitId {
    private String id;
    private String name;

    public AdUnitId(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getPubId() {
        return this.id.substring(0, 26);
    }

    public String getSlotId() {
        return this.id.substring(28);
    }

    public String getTitle() {
        if (this.name != null) {
            return this.name;
        }
        return getSlotId();
    }

    public boolean matches(String str) {
        return (this.name != null && this.name.toLowerCase().contains(str)) || getSlotId().toLowerCase().startsWith(str);
    }
}
