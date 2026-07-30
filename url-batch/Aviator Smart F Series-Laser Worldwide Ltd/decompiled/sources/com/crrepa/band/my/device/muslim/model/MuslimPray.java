package com.crrepa.band.my.device.muslim.model;

/* loaded from: classes2.dex */
public class MuslimPray {
    private boolean current;
    private int icon;
    private String name;
    private boolean remind;
    private String time;

    public int getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getTime() {
        return this.time;
    }

    public boolean isCurrent() {
        return this.current;
    }

    public boolean isRemind() {
        return this.remind;
    }

    public void setCurrent(boolean z7) {
        this.current = z7;
    }

    public void setIcon(int i8) {
        this.icon = i8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRemind(boolean z7) {
        this.remind = z7;
    }

    public void setTime(String str) {
        this.time = str;
    }
}
