package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class StartupParamsItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f36861a;

    /* renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f36862b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36863c;

    public StartupParamsItem(String str, @NonNull StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f36861a = str;
        this.f36862b = startupParamsItemStatus;
        this.f36863c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StartupParamsItem.class == obj.getClass()) {
            StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
            if (Objects.equals(this.f36861a, startupParamsItem.f36861a) && this.f36862b == startupParamsItem.f36862b && Objects.equals(this.f36863c, startupParamsItem.f36863c)) {
                return true;
            }
        }
        return false;
    }

    public String getErrorDetails() {
        return this.f36863c;
    }

    public String getId() {
        return this.f36861a;
    }

    @NonNull
    public StartupParamsItemStatus getStatus() {
        return this.f36862b;
    }

    public int hashCode() {
        return Objects.hash(this.f36861a, this.f36862b, this.f36863c);
    }

    @NonNull
    public String toString() {
        return "StartupParamsItem{id='" + this.f36861a + "', status=" + this.f36862b + ", errorDetails='" + this.f36863c + "'}";
    }
}
