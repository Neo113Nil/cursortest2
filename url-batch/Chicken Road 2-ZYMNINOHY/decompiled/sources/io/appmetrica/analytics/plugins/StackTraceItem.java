package io.appmetrica.analytics.plugins;

/* loaded from: classes.dex */
public class StackTraceItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f13361a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13362b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f13363c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f13364d;

    /* renamed from: e, reason: collision with root package name */
    private final String f13365e;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f13366a;

        /* renamed from: b, reason: collision with root package name */
        private String f13367b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f13368c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f13369d;

        /* renamed from: e, reason: collision with root package name */
        private String f13370e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f13366a, this.f13367b, this.f13368c, this.f13369d, this.f13370e, 0);
        }

        public Builder withClassName(String str) {
            this.f13366a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f13369d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f13367b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f13368c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f13370e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i4) {
        this(str, str2, num, num2, str3);
    }

    public String getClassName() {
        return this.f13361a;
    }

    public Integer getColumn() {
        return this.f13364d;
    }

    public String getFileName() {
        return this.f13362b;
    }

    public Integer getLine() {
        return this.f13363c;
    }

    public String getMethodName() {
        return this.f13365e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f13361a = str;
        this.f13362b = str2;
        this.f13363c = num;
        this.f13364d = num2;
        this.f13365e = str3;
    }
}
