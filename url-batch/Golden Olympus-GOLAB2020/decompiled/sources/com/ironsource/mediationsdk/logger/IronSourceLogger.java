package com.ironsource.mediationsdk.logger;

/* loaded from: classes2.dex */
public abstract class IronSourceLogger {

    /* renamed from: a, reason: collision with root package name */
    int f17648a;

    /* renamed from: b, reason: collision with root package name */
    private String f17649b;

    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int GENERAL = 4;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    IronSourceLogger(String str) {
        this.f17649b = str;
        this.f17648a = 0;
    }

    int a() {
        return this.f17648a;
    }

    String b() {
        return this.f17649b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof IronSourceLogger)) {
            IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
            String str = this.f17649b;
            if (str != null && str.equals(ironSourceLogger.f17649b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i4);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i4) {
        this.f17648a = i4;
    }

    IronSourceLogger(String str, int i4) {
        this.f17649b = str;
        this.f17648a = i4;
    }
}
