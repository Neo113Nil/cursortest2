package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.media2.session.SessionToken;
import q.d;

/* loaded from: classes.dex */
final class SessionTokenImplBase implements SessionToken.SessionTokenImpl {

    /* renamed from: a, reason: collision with root package name */
    int f1208a;

    /* renamed from: b, reason: collision with root package name */
    int f1209b;

    /* renamed from: c, reason: collision with root package name */
    String f1210c;

    /* renamed from: d, reason: collision with root package name */
    String f1211d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f1212e;

    /* renamed from: f, reason: collision with root package name */
    ComponentName f1213f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f1214g;

    SessionTokenImplBase() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplBase)) {
            return false;
        }
        SessionTokenImplBase sessionTokenImplBase = (SessionTokenImplBase) obj;
        return this.f1208a == sessionTokenImplBase.f1208a && TextUtils.equals(this.f1210c, sessionTokenImplBase.f1210c) && TextUtils.equals(this.f1211d, sessionTokenImplBase.f1211d) && this.f1209b == sessionTokenImplBase.f1209b && d.a(this.f1212e, sessionTokenImplBase.f1212e);
    }

    public int hashCode() {
        return d.b(Integer.valueOf(this.f1209b), Integer.valueOf(this.f1208a), this.f1210c, this.f1211d);
    }

    public String toString() {
        return "SessionToken {pkg=" + this.f1210c + " type=" + this.f1209b + " service=" + this.f1211d + " IMediaSession=" + this.f1212e + " extras=" + this.f1214g + "}";
    }
}
