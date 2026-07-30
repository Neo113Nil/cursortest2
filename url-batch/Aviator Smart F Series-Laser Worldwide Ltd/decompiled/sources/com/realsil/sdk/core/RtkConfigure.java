package com.realsil.sdk.core;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class RtkConfigure {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15389a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15390b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15391c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15392d = false;

    /* renamed from: e, reason: collision with root package name */
    public String f15393e = "Realtek";

    /* renamed from: f, reason: collision with root package name */
    public int f15394f = 1;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final RtkConfigure f15395a = new RtkConfigure();

        public RtkConfigure build() {
            return this.f15395a;
        }

        public Builder debugEnabled(boolean z7) {
            this.f15395a.setDebugEnabled(z7);
            return this;
        }

        public Builder devModeEnabled(boolean z7) {
            this.f15395a.setDevModeEnabled(z7);
            return this;
        }

        public Builder dumpData(boolean z7) {
            this.f15395a.setDumpData(z7);
            return this;
        }

        public Builder globalLogLevel(int i8) {
            this.f15395a.setGlobalLogLevel(i8);
            return this;
        }

        public Builder logTag(@NonNull String str) {
            this.f15395a.setLogTag(str);
            return this;
        }

        public Builder printLog(boolean z7) {
            this.f15395a.setPrintLog(z7);
            return this;
        }
    }

    public int getGlobalLogLevel() {
        return this.f15394f;
    }

    public String getLogTag() {
        return this.f15393e;
    }

    public boolean isDebugEnabled() {
        return this.f15390b;
    }

    public boolean isDevModeEnabled() {
        return this.f15389a;
    }

    public boolean isDumpDataEnabled() {
        return this.f15392d;
    }

    public boolean isPrintLog() {
        return this.f15391c;
    }

    public void setDebugEnabled(boolean z7) {
        this.f15390b = z7;
    }

    public void setDevModeEnabled(boolean z7) {
        this.f15389a = z7;
    }

    public void setDumpData(boolean z7) {
        this.f15392d = z7;
    }

    public void setGlobalLogLevel(int i8) {
        this.f15394f = i8;
    }

    public void setLogTag(String str) {
        this.f15393e = str;
    }

    public void setPrintLog(boolean z7) {
        this.f15391c = z7;
    }

    public String toString() {
        return "RtkConfigure{" + String.format("\n\tdebugEnabled=%b, printLog=%b, logTag=%s, globalLogLevel=0x%02X", Boolean.valueOf(this.f15390b), Boolean.valueOf(this.f15391c), this.f15393e, Integer.valueOf(this.f15394f)) + "\n}";
    }
}
