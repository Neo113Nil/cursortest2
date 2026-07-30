package com.crrepa.band.my.profile.strava.model;

/* loaded from: classes2.dex */
public class GPXUploadResp {
    private String activity_id;
    private String error;
    private String external_id;
    private long id;
    private String id_str;
    private String status;

    public String getActivity_id() {
        return this.activity_id;
    }

    public String getError() {
        return this.error;
    }

    public String getExternal_id() {
        return this.external_id;
    }

    public long getId() {
        return this.id;
    }

    public String getId_str() {
        return this.id_str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setActivity_id(String str) {
        this.activity_id = str;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setExternal_id(String str) {
        this.external_id = str;
    }

    public void setId(long j8) {
        this.id = j8;
    }

    public void setId_str(String str) {
        this.id_str = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
