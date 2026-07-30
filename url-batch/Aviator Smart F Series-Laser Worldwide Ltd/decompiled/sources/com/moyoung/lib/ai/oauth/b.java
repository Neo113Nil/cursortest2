package com.moyoung.lib.ai.oauth;

/* loaded from: classes4.dex */
public class b {
    private String bearerToken;
    private long createTime = System.currentTimeMillis();
    private int expiresIn;
    private String refreshToken;
    private String status;
    private String tokenType;

    public String getBearerToken() {
        return this.bearerToken;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public int getExpiresIn() {
        return this.expiresIn;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() >= this.createTime + (((long) this.expiresIn) * 1000);
    }

    public void setBearerToken(String str) {
        this.bearerToken = str;
        this.createTime = System.currentTimeMillis();
    }

    public void setExpiresIn(int i8) {
        this.expiresIn = i8;
    }

    public void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTokenType(String str) {
        this.tokenType = str;
    }

    public String toString() {
        return "AuthToken{status='" + this.status + "', bearerToken='" + this.bearerToken + "', refreshToken='" + this.refreshToken + "', expiresIn=" + this.expiresIn + ", tokenType='" + this.tokenType + "', createTime=" + this.createTime + '}';
    }
}
