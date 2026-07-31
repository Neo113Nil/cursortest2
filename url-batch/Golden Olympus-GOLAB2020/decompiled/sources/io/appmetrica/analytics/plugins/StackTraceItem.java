package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class StackTraceItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f40650a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40651b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f40652c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f40653d;

    /* renamed from: e, reason: collision with root package name */
    private final String f40654e;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f40655a;

        /* renamed from: b, reason: collision with root package name */
        private String f40656b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f40657c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f40658d;

        /* renamed from: e, reason: collision with root package name */
        private String f40659e;

        @NonNull
        public StackTraceItem build() {
            return new StackTraceItem(this.f40655a, this.f40656b, this.f40657c, this.f40658d, this.f40659e, 0);
        }

        @NonNull
        public Builder withClassName(String str) {
            this.f40655a = str;
            return this;
        }

        @NonNull
        public Builder withColumn(Integer num) {
            this.f40658d = num;
            return this;
        }

        @NonNull
        public Builder withFileName(String str) {
            this.f40656b = str;
            return this;
        }

        @NonNull
        public Builder withLine(Integer num) {
            this.f40657c = num;
            return this;
        }

        @NonNull
        public Builder withMethodName(String str) {
            this.f40659e = str;
            return this;
        }
    }

    /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i4) {
        this(str, str2, num, num2, str3);
    }

    public String getClassName() {
        return this.f40650a;
    }

    public Integer getColumn() {
        return this.f40653d;
    }

    public String getFileName() {
        return this.f40651b;
    }

    public Integer getLine() {
        return this.f40652c;
    }

    public String getMethodName() {
        return this.f40654e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f40650a = str;
        this.f40651b = str2;
        this.f40652c = num;
        this.f40653d = num2;
        this.f40654e = str3;
    }
}
