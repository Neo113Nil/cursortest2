package com.youappi.sdk.logic.model;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.gson.a.c;
import com.tapjoy.TJAdUnitConstants;
import com.youappi.sdk.mediation.admob.ParamNames;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @c(a = ParamNames.ACCESS_TOKEN)
    private String f9456a;

    /* renamed from: b, reason: collision with root package name */
    @c(a = "deviceOs")
    private String f9457b;

    /* renamed from: c, reason: collision with root package name */
    @c(a = "deviceId")
    private String f9458c;

    /* renamed from: d, reason: collision with root package name */
    @c(a = "deviceModel")
    private String f9459d;

    @c(a = "deviceOsVersion")
    private String e;

    @c(a = "deviceType")
    private String f;

    @c(a = "sdkVersion")
    private String g;

    @c(a = "logs")
    private List<C0412a> h;

    /* renamed from: com.youappi.sdk.logic.model.a$a, reason: collision with other inner class name */
    public static class C0412a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        @c(a = "responseId")
        private String f9460a;

        /* renamed from: b, reason: collision with root package name */
        @c(a = "logDate")
        private long f9461b;

        /* renamed from: c, reason: collision with root package name */
        @c(a = "tag")
        private String f9462c;

        /* renamed from: d, reason: collision with root package name */
        @c(a = TJAdUnitConstants.String.MESSAGE)
        private String f9463d;

        @c(a = AppLovinEventTypes.USER_COMPLETED_LEVEL)
        private String e;

        public void a(long j) {
            this.f9461b = j;
        }

        public void a(String str) {
            this.f9462c = str;
        }

        public void b(String str) {
            this.f9463d = str;
        }

        public void c(String str) {
            this.e = str;
        }

        public void d(String str) {
            this.f9460a = str;
        }
    }

    public void a(String str) {
        this.f9456a = str;
    }

    public void a(List<C0412a> list) {
        this.h = list;
    }

    public void b(String str) {
        this.f9457b = str;
    }

    public void c(String str) {
        this.f9458c = str;
    }

    public void d(String str) {
        this.f9459d = str;
    }

    public void e(String str) {
        this.e = str;
    }

    public void f(String str) {
        this.f = str;
    }

    public void g(String str) {
        this.g = str;
    }
}
