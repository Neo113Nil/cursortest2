package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class TodayQuote {
    private Date date;
    private Long id;
    private String queue;

    public TodayQuote(Long l8, Date date, String str) {
        this.id = l8;
        this.date = date;
        this.queue = str;
    }

    public Date getDate() {
        return this.date;
    }

    public Long getId() {
        return this.id;
    }

    public String getQueue() {
        return this.queue;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setQueue(String str) {
        this.queue = str;
    }

    public TodayQuote() {
    }
}
