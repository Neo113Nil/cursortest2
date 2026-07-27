package io.appmetrica.analytics.plugins;

/* loaded from: classes.dex */
public class StackTraceItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f9918a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9919b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f9920c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f9921d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9922e;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f9923a;

        /* renamed from: b, reason: collision with root package name */
        private String f9924b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f9925c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f9926d;

        /* renamed from: e, reason: collision with root package name */
        private String f9927e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f9923a, this.f9924b, this.f9925c, this.f9926d, this.f9927e, 0);
        }

        public Builder withClassName(String str) {
            this.f9923a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f9926d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f9924b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f9925c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f9927e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i2) {
        this(str, str2, num, num2, str3);
    }

    public String getClassName() {
        return this.f9918a;
    }

    public Integer getColumn() {
        return this.f9921d;
    }

    public String getFileName() {
        return this.f9919b;
    }

    public Integer getLine() {
        return this.f9920c;
    }

    public String getMethodName() {
        return this.f9922e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f9918a = str;
        this.f9919b = str2;
        this.f9920c = num;
        this.f9921d = num2;
        this.f9922e = str3;
    }
}
