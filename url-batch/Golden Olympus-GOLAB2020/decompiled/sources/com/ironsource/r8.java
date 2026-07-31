package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public class r8 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18900a = true;

    /* renamed from: b, reason: collision with root package name */
    private IronSourceError f18901b = null;

    public IronSourceError a() {
        return this.f18901b;
    }

    public boolean b() {
        return this.f18900a;
    }

    public void c() {
        this.f18900a = true;
        this.f18901b = null;
    }

    public String toString() {
        StringBuilder sb;
        if (b()) {
            sb = new StringBuilder();
            sb.append("valid:");
            sb.append(this.f18900a);
        } else {
            sb = new StringBuilder();
            sb.append("valid:");
            sb.append(this.f18900a);
            sb.append(", IronSourceError:");
            sb.append(this.f18901b);
        }
        return sb.toString();
    }

    public void a(IronSourceError ironSourceError) {
        this.f18900a = false;
        this.f18901b = ironSourceError;
    }
}
