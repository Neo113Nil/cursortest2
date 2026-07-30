package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class CricketTeamModel {
    private Integer icon;
    private Long id;
    private String name;
    private Boolean selected;

    public CricketTeamModel(Long l8, Integer num, String str, Boolean bool) {
        this.id = l8;
        this.icon = num;
        this.name = str;
        this.selected = bool;
    }

    public Integer getIcon() {
        return this.icon;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getSelected() {
        return this.selected;
    }

    public void setIcon(Integer num) {
        this.icon = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSelected(Boolean bool) {
        this.selected = bool;
    }

    public CricketTeamModel() {
    }
}
