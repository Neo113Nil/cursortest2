package com.moyoung.classes.meditation.onlineclass.model;

import com.moyoung.classes.ClassesLanguageBean;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class OnlineClassBean implements Serializable {
    private final String audioUrl;
    private final String bigImgUrl;
    private final String description;
    private final int duration;
    private final int id;
    private final String skill;
    private final String thumbUrl;
    private final String title;
    private final List<ClassesLanguageBean> titleLanguageList;

    public OnlineClassBean(int i8, String str, List<ClassesLanguageBean> list, int i9, String str2, String str3, String str4, String str5, String str6) {
        this.id = i8;
        this.title = str;
        this.titleLanguageList = list;
        this.duration = i9;
        this.description = str2;
        this.skill = str3;
        this.thumbUrl = str4;
        this.bigImgUrl = str5;
        this.audioUrl = str6;
    }

    public static OnlineClassBean convert(OnlineClassResp onlineClassResp) {
        return new OnlineClassBean(onlineClassResp.getId(), onlineClassResp.getName(), onlineClassResp.getName_language(), onlineClassResp.getDuration(), onlineClassResp.getDescription(), onlineClassResp.getSkill(), onlineClassResp.getPicture(), onlineClassResp.getPractice(), onlineClassResp.getFile());
    }

    public String getAudioUrl() {
        return this.audioUrl;
    }

    public String getBigImgUrl() {
        return this.bigImgUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getId() {
        return this.id;
    }

    public String getSkill() {
        return this.skill;
    }

    public String getThumbUrl() {
        return this.thumbUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public List<ClassesLanguageBean> getTitleLanguageList() {
        return this.titleLanguageList;
    }
}
