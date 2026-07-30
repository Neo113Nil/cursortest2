package com.crrepa.band.my.device.muslim.model;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class DuasChapter {
    private ArrayList<DuasSection> duas;
    private int icon;
    private boolean isExpand;
    private String name;

    public ArrayList<DuasSection> getDuas() {
        return this.duas;
    }

    public int getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public boolean isExpand() {
        return this.isExpand;
    }

    public void setDuas(ArrayList<DuasSection> arrayList) {
        this.duas = arrayList;
    }

    public void setExpand(boolean z7) {
        this.isExpand = z7;
    }

    public void setIcon(int i8) {
        this.icon = i8;
    }

    public void setName(String str) {
        this.name = str;
    }
}
