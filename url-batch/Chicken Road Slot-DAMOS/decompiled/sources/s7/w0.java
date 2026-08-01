package s7;

import android.os.Bundle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9077a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9078b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9079c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9080d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f9081e;

    public w0(long j, long j3, Bundle bundle, String str, String str2) {
        this.f9077a = str;
        this.f9078b = str2;
        this.f9081e = bundle;
        this.f9079c = j;
        this.f9080d = j3;
    }

    public static w0 a(u uVar) {
        String str = uVar.f9035d;
        String str2 = uVar.f9037i;
        return new w0(uVar.f9038r, uVar.f9039s, uVar.f9036e.f(), str, str2);
    }

    public final u b() {
        t tVar = new t(new Bundle(this.f9081e));
        return new u(this.f9077a, tVar, this.f9078b, this.f9079c, this.f9080d);
    }

    public final String toString() {
        String obj = this.f9081e.toString();
        String str = this.f9078b;
        int length = String.valueOf(str).length();
        String str2 = this.f9077a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
        n0.l.l(sb2, "origin=", str, ",name=", str2);
        return v4.a.o(sb2, ",params=", obj);
    }
}
