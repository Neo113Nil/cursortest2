package com.moyoung.classes.meditation.onlineclass.model;

import com.moyoung.classes.ClassesLanguageBean;
import java.util.List;

/* loaded from: classes4.dex */
public class OnlineClassResp {
    private String daily_exercises;
    private String day_length;
    private String description;
    private int duration;
    private String file;
    private int frequency;
    private int id;
    private String name;
    private List<ClassesLanguageBean> name_language;
    private String picture;
    private String practice;
    private int sequence;
    private String skill;
    private int status;
    private String thumbnail;

    public String getDaily_exercises() {
        return this.daily_exercises;
    }

    public String getDay_length() {
        return this.day_length;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getFile() {
        return this.file;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<ClassesLanguageBean> getName_language() {
        return this.name_language;
    }

    public String getPicture() {
        return this.picture;
    }

    public String getPractice() {
        return this.practice;
    }

    public int getSequence() {
        return this.sequence;
    }

    public String getSkill() {
        return this.skill;
    }

    public int getStatus() {
        return this.status;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setDaily_exercises(String str) {
        this.daily_exercises = str;
    }

    public void setDay_length(String str) {
        this.day_length = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDuration(int i8) {
        this.duration = i8;
    }

    public void setFile(String str) {
        this.file = str;
    }

    public void setFrequency(int i8) {
        this.frequency = i8;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setName_language(List<ClassesLanguageBean> list) {
        this.name_language = list;
    }

    public void setPicture(String str) {
        this.picture = str;
    }

    public void setPractice(String str) {
        this.practice = str;
    }

    public void setSequence(int i8) {
        this.sequence = i8;
    }

    public void setSkill(String str) {
        this.skill = str;
    }

    public void setStatus(int i8) {
        this.status = i8;
    }

    public void setThumbnail(String str) {
        this.thumbnail = str;
    }
}
