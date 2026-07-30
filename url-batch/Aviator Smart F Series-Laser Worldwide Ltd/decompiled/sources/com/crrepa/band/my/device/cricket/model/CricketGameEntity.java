package com.crrepa.band.my.device.cricket.model;

import java.util.List;

/* loaded from: classes2.dex */
public class CricketGameEntity {
    private String created_at;
    private Object deleted_at;
    private String end_time;
    private Long end_time_timestamp;
    private Integer fixture_id;
    private Integer id;
    private String link;
    private String link_result;
    private String start_time;
    private Long start_time_timestamp;
    private List<CricketTeamEntity> teams;
    private String title;
    private String updated_at;

    public String getCreated_at() {
        return this.created_at;
    }

    public Object getDeleted_at() {
        return this.deleted_at;
    }

    public String getEnd_time() {
        return this.end_time;
    }

    public Long getEnd_time_timestamp() {
        return this.end_time_timestamp;
    }

    public Integer getFixture_id() {
        return this.fixture_id;
    }

    public Integer getId() {
        return this.id;
    }

    public String getLink() {
        return this.link;
    }

    public String getLink_result() {
        return this.link_result;
    }

    public String getStart_time() {
        return this.start_time;
    }

    public Long getStart_time_timestamp() {
        return this.start_time_timestamp;
    }

    public List<CricketTeamEntity> getTeams() {
        return this.teams;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUpdated_at() {
        return this.updated_at;
    }

    public void setCreated_at(String str) {
        this.created_at = str;
    }

    public void setDeleted_at(Object obj) {
        this.deleted_at = obj;
    }

    public void setEnd_time(String str) {
        this.end_time = str;
    }

    public void setEnd_time_timestamp(Long l8) {
        this.end_time_timestamp = l8;
    }

    public void setFixture_id(Integer num) {
        this.fixture_id = num;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setLink_result(String str) {
        this.link_result = str;
    }

    public void setStart_time(String str) {
        this.start_time = str;
    }

    public void setStart_time_timestamp(Long l8) {
        this.start_time_timestamp = l8;
    }

    public void setTeams(List<CricketTeamEntity> list) {
        this.teams = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUpdated_at(String str) {
        this.updated_at = str;
    }
}
