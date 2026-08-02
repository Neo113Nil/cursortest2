package io.appmetrica.analytics;

import E.AbstractC0005f;
import java.util.Objects;

/* loaded from: classes.dex */
public final class StartupParamsItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f9412a;

    /* renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f9413b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9414c;

    public StartupParamsItem(String str, StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f9412a = str;
        this.f9413b = startupParamsItemStatus;
        this.f9414c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StartupParamsItem.class == obj.getClass()) {
            StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
            if (Objects.equals(this.f9412a, startupParamsItem.f9412a) && this.f9413b == startupParamsItem.f9413b && Objects.equals(this.f9414c, startupParamsItem.f9414c)) {
                return true;
            }
        }
        return false;
    }

    public String getErrorDetails() {
        return this.f9414c;
    }

    public String getId() {
        return this.f9412a;
    }

    public StartupParamsItemStatus getStatus() {
        return this.f9413b;
    }

    public int hashCode() {
        return Objects.hash(this.f9412a, this.f9413b, this.f9414c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartupParamsItem{id='");
        sb.append(this.f9412a);
        sb.append("', status=");
        sb.append(this.f9413b);
        sb.append(", errorDetails='");
        return AbstractC0005f.q(sb, this.f9414c, "'}");
    }
}
