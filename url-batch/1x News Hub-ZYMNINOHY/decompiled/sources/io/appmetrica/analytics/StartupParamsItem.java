package io.appmetrica.analytics;

import E1.AbstractC0033i;
import java.util.Objects;

/* loaded from: classes.dex */
public final class StartupParamsItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f5177a;

    /* renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f5178b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5179c;

    public StartupParamsItem(String str, StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f5177a = str;
        this.f5178b = startupParamsItemStatus;
        this.f5179c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StartupParamsItem.class == obj.getClass()) {
            StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
            if (Objects.equals(this.f5177a, startupParamsItem.f5177a) && this.f5178b == startupParamsItem.f5178b && Objects.equals(this.f5179c, startupParamsItem.f5179c)) {
                return true;
            }
        }
        return false;
    }

    public String getErrorDetails() {
        return this.f5179c;
    }

    public String getId() {
        return this.f5177a;
    }

    public StartupParamsItemStatus getStatus() {
        return this.f5178b;
    }

    public int hashCode() {
        return Objects.hash(this.f5177a, this.f5178b, this.f5179c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartupParamsItem{id='");
        sb.append(this.f5177a);
        sb.append("', status=");
        sb.append(this.f5178b);
        sb.append(", errorDetails='");
        return AbstractC0033i.m(sb, this.f5179c, "'}");
    }
}
