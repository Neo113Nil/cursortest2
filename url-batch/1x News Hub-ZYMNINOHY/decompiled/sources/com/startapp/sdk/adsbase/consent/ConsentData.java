package com.startapp.sdk.adsbase.consent;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class ConsentData implements Serializable {
    private static final long serialVersionUID = 4245437752472461229L;
    private Boolean apc;
    private String infoDialogClickUrl;
    private String infoDialogDParam;
    private String infoDialogImpressionUrl;
    private Long timeStamp;
    private Integer type;

    public final void a(Integer num) {
        this.type = num;
    }

    public final void b(String str) {
        this.infoDialogDParam = str;
    }

    public final String c() {
        return this.infoDialogDParam;
    }

    public final String d() {
        return this.infoDialogImpressionUrl;
    }

    public final Long e() {
        return this.timeStamp;
    }

    public final Integer f() {
        return this.type;
    }

    public final void a(Long l3) {
        this.timeStamp = l3;
    }

    public final String b() {
        return this.infoDialogClickUrl;
    }

    public final void c(String str) {
        this.infoDialogImpressionUrl = str;
    }

    public final Boolean a() {
        return this.apc;
    }

    public final void a(Boolean bool) {
        this.apc = bool;
    }

    public final void a(String str) {
        this.infoDialogClickUrl = str;
    }
}
