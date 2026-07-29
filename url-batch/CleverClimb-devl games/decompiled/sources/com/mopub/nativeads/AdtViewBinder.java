package com.mopub.nativeads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdtViewBinder {

    /* renamed from: ʻ, reason: contains not printable characters */
    final int f1294;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    final int f1295;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    final int f1296;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    final int f1297;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    final Map<String, Integer> f1298;

    /* renamed from: ʼ, reason: contains not printable characters */
    final int f1299;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    final int f1300;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    final int f1301;

    /* renamed from: ʽ, reason: contains not printable characters */
    final int f1302;

    /* renamed from: ʾ, reason: contains not printable characters */
    final int f1303;

    public static final class Builder {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f1304;

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private final int f1305;

        /* renamed from: ʻʼʽ, reason: contains not printable characters */
        private int f1306;

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private int f1307;

        /* renamed from: ʻʾ, reason: contains not printable characters */
        private int f1308;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f1309;

        /* renamed from: ʼʽ, reason: contains not printable characters */
        private int f1310;

        /* renamed from: ʼʾ, reason: contains not printable characters */
        private Map<String, Integer> f1311 = new HashMap();

        /* renamed from: ʽ, reason: contains not printable characters */
        private int f1312;

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f1313;

        public Builder(int i) {
            this.f1305 = i;
        }

        public final Builder adIconViewID(int i) {
            this.f1310 = i;
            return this;
        }

        public final Builder addExtra(String str, int i) {
            this.f1311.put(str, Integer.valueOf(i));
            return this;
        }

        public final Builder addExtras(Map<String, Integer> map) {
            this.f1311 = new HashMap(map);
            return this;
        }

        public final AdtViewBinder build() {
            return new AdtViewBinder(this, (byte) 0);
        }

        public final Builder callToActionId(int i) {
            this.f1304 = i;
            return this;
        }

        public final Builder iconImageId(int i) {
            this.f1308 = i;
            return this;
        }

        public final Builder mainImageId(int i) {
            this.f1312 = i;
            return this;
        }

        public final Builder mediaViewId(int i) {
            this.f1313 = i;
            return this;
        }

        public final Builder privacyInformationIconImageId(int i) {
            this.f1306 = i;
            return this;
        }

        public final Builder textId(int i) {
            this.f1307 = i;
            return this;
        }

        public final Builder titleId(int i) {
            this.f1309 = i;
            return this;
        }
    }

    private AdtViewBinder(Builder builder) {
        this.f1302 = builder.f1305;
        this.f1294 = builder.f1309;
        this.f1295 = builder.f1307;
        this.f1297 = builder.f1304;
        this.f1299 = builder.f1312;
        this.f1296 = builder.f1308;
        this.f1300 = builder.f1306;
        this.f1301 = builder.f1313;
        this.f1303 = builder.f1310;
        this.f1298 = builder.f1311;
    }

    /* synthetic */ AdtViewBinder(Builder builder, byte b2) {
        this(builder);
    }
}
