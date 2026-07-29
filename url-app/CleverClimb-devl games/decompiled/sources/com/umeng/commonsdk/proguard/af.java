package com.umeng.commonsdk.proguard;

/* compiled from: TMessage.java */
/* loaded from: classes2.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public final String f9019a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f9020b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9021c;

    public af() {
        this("", (byte) 0, 0);
    }

    public af(String str, byte b2, int i) {
        this.f9019a = str;
        this.f9020b = b2;
        this.f9021c = i;
    }

    public String toString() {
        return "<TMessage name:'" + this.f9019a + "' type: " + ((int) this.f9020b) + " seqid:" + this.f9021c + ">";
    }

    public boolean equals(Object obj) {
        if (obj instanceof af) {
            return a((af) obj);
        }
        return false;
    }

    public boolean a(af afVar) {
        return this.f9019a.equals(afVar.f9019a) && this.f9020b == afVar.f9020b && this.f9021c == afVar.f9021c;
    }
}
