package com.crrepa.band.my.device.appmarket.openharmony.bridge.bean;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class WatchDeviceCapability {
    private int ability3D;
    private int abilityKaleidoscope;
    private int abilityVideo;
    private List<String> videoFormatList;

    public WatchDeviceCapability() {
        this.videoFormatList = new ArrayList();
    }

    public int getAbility3D() {
        return this.ability3D;
    }

    public int getAbilityKaleidoscope() {
        return this.abilityKaleidoscope;
    }

    public int getAbilityVideo() {
        return this.abilityVideo;
    }

    public List<String> getVideoFormatList() {
        return this.videoFormatList;
    }

    public void setAbility3D(int i8) {
        this.ability3D = i8;
    }

    public void setAbilityKaleidoscope(int i8) {
        this.abilityKaleidoscope = i8;
    }

    public void setAbilityVideo(int i8) {
        this.abilityVideo = i8;
    }

    public void setVideoFormatList(List<String> list) {
        this.videoFormatList = list;
    }

    public WatchDeviceCapability(int i8, int i9, int i10, List<String> list) {
        new ArrayList();
        this.abilityKaleidoscope = i8;
        this.ability3D = i9;
        this.abilityVideo = i10;
        this.videoFormatList = list;
    }
}
