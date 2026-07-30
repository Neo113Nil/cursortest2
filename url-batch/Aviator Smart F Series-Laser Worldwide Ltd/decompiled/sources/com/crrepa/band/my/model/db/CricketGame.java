package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class CricketGame {
    private Long endTimestamp;
    private Boolean gameEndReminder;
    private Integer gameId;
    private Boolean gameStartReminder;
    private Long id;
    private Boolean reserved;
    private Long startTimestamp;
    private String teams;
    private String title;
    private Boolean todayReminder;

    public CricketGame(Long l8, Integer num, String str, Long l9, Long l10, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.id = l8;
        this.gameId = num;
        this.title = str;
        this.startTimestamp = l9;
        this.endTimestamp = l10;
        this.teams = str2;
        this.reserved = bool;
        this.todayReminder = bool2;
        this.gameStartReminder = bool3;
        this.gameEndReminder = bool4;
    }

    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public Boolean getGameEndReminder() {
        return this.gameEndReminder;
    }

    public Integer getGameId() {
        return this.gameId;
    }

    public Boolean getGameStartReminder() {
        return this.gameStartReminder;
    }

    public Long getId() {
        return this.id;
    }

    public Boolean getReserved() {
        return this.reserved;
    }

    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public String getTeams() {
        return this.teams;
    }

    public String getTitle() {
        return this.title;
    }

    public Boolean getTodayReminder() {
        return this.todayReminder;
    }

    public void setEndTimestamp(Long l8) {
        this.endTimestamp = l8;
    }

    public void setGameEndReminder(Boolean bool) {
        this.gameEndReminder = bool;
    }

    public void setGameId(Integer num) {
        this.gameId = num;
    }

    public void setGameStartReminder(Boolean bool) {
        this.gameStartReminder = bool;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setReserved(Boolean bool) {
        this.reserved = bool;
    }

    public void setStartTimestamp(Long l8) {
        this.startTimestamp = l8;
    }

    public void setTeams(String str) {
        this.teams = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTodayReminder(Boolean bool) {
        this.todayReminder = bool;
    }

    public CricketGame() {
    }
}
