package com.crrepa.band.my.device.cricket.model;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class DayCricketGameModel {
    private Date date;
    private String dateTitle;
    private List<CricketGameModel> games;

    public Date getDate() {
        return this.date;
    }

    public String getDateTitle() {
        return this.dateTitle;
    }

    public List<CricketGameModel> getGames() {
        return this.games;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDateTitle(String str) {
        this.dateTitle = str;
    }

    public void setGames(List<CricketGameModel> list) {
        this.games = list;
    }
}
