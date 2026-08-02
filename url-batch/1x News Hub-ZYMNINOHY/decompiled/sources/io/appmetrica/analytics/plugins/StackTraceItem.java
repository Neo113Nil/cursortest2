package io.appmetrica.analytics.plugins;

/* loaded from: classes.dex */
public class StackTraceItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f8939a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8940b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f8941c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f8942d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8943e;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f8944a;

        /* renamed from: b, reason: collision with root package name */
        private String f8945b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f8946c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f8947d;

        /* renamed from: e, reason: collision with root package name */
        private String f8948e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f8944a, this.f8945b, this.f8946c, this.f8947d, this.f8948e, 0);
        }

        public Builder withClassName(String str) {
            this.f8944a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f8947d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f8945b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f8946c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f8948e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i3) {
        this(str, str2, num, num2, str3);
    }

    public String getClassName() {
        return this.f8939a;
    }

    public Integer getColumn() {
        return this.f8942d;
    }

    public String getFileName() {
        return this.f8940b;
    }

    public Integer getLine() {
        return this.f8941c;
    }

    public String getMethodName() {
        return this.f8943e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f8939a = str;
        this.f8940b = str2;
        this.f8941c = num;
        this.f8942d = num2;
        this.f8943e = str3;
    }
}
