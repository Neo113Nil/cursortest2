package org.apache.a;

import java.io.Serializable;

/* compiled from: HttpVersion.java */
/* loaded from: classes2.dex */
public final class u extends aa implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final u f10002a = new u(0, 9);

    /* renamed from: b, reason: collision with root package name */
    public static final u f10003b = new u(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final u f10004c = new u(1, 1);

    public u(int i, int i2) {
        super("HTTP", i, i2);
    }

    @Override // org.apache.a.aa
    public aa a(int i, int i2) {
        if (i == this.e && i2 == this.f) {
            return this;
        }
        if (i == 1) {
            if (i2 == 0) {
                return f10003b;
            }
            if (i2 == 1) {
                return f10004c;
            }
        }
        if (i == 0 && i2 == 9) {
            return f10002a;
        }
        return new u(i, i2);
    }
}
