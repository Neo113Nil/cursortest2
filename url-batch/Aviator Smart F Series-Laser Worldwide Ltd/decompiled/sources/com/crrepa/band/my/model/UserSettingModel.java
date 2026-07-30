package com.crrepa.band.my.model;

import com.squareup.picasso.v;

/* loaded from: classes2.dex */
public class UserSettingModel {
    private String content;
    private String hintText;
    private v icon;
    private String name;
    private SettingType type;
    private int unreadNews = 0;
    private String url;

    public enum SettingType {
        USER_INFO,
        GOAL_STEPS,
        REGISTER_LOGIN,
        ACCOUNT_MANAGEMENT,
        WECHAT_SPORT,
        USER_GUIDANCE,
        FEEDBACK,
        ABOUT,
        BACKGROUNB_RUN,
        GOOGLE_FIT,
        STRAVA,
        WEBSITE,
        E_MAIL,
        Tel,
        HELP_AND_FEEDBACK
    }

    public String getContent() {
        return this.content;
    }

    public String getHintText() {
        return this.hintText;
    }

    public v getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public SettingType getType() {
        return this.type;
    }

    public int getUnreadNews() {
        return this.unreadNews;
    }

    public String getUrl() {
        return this.url;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setHintText(String str) {
        this.hintText = str;
    }

    public void setIcon(v vVar) {
        this.icon = vVar;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(SettingType settingType) {
        this.type = settingType;
    }

    public void setUnreadNews(int i8) {
        this.unreadNews = i8;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
