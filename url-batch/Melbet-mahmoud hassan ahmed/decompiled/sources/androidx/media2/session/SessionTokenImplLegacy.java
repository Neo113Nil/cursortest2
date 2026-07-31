package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media2.session.SessionToken;
import androidx.versionedparcelable.CustomVersionedParcelable;
import q.d;

/* loaded from: classes.dex */
final class SessionTokenImplLegacy extends CustomVersionedParcelable implements SessionToken.SessionTokenImpl {

    /* renamed from: a, reason: collision with root package name */
    private MediaSessionCompat.Token f1215a;

    /* renamed from: b, reason: collision with root package name */
    Bundle f1216b;

    /* renamed from: c, reason: collision with root package name */
    int f1217c;

    /* renamed from: d, reason: collision with root package name */
    int f1218d;

    /* renamed from: e, reason: collision with root package name */
    ComponentName f1219e;

    /* renamed from: f, reason: collision with root package name */
    String f1220f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f1221g;

    SessionTokenImplLegacy() {
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void c() {
        this.f1215a = MediaSessionCompat.Token.a(this.f1216b);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void d(boolean z6) {
        MediaSessionCompat.Token token = this.f1215a;
        if (token == null) {
            this.f1216b = null;
            return;
        }
        synchronized (token) {
            a0.b i7 = this.f1215a.i();
            this.f1215a.l(null);
            this.f1216b = this.f1215a.m();
            this.f1215a.l(i7);
        }
    }

    public boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (!(obj instanceof SessionTokenImplLegacy)) {
            return false;
        }
        SessionTokenImplLegacy sessionTokenImplLegacy = (SessionTokenImplLegacy) obj;
        int i7 = this.f1218d;
        if (i7 != sessionTokenImplLegacy.f1218d) {
            return false;
        }
        if (i7 == 100) {
            obj2 = this.f1215a;
            obj3 = sessionTokenImplLegacy.f1215a;
        } else {
            if (i7 != 101) {
                return false;
            }
            obj2 = this.f1219e;
            obj3 = sessionTokenImplLegacy.f1219e;
        }
        return d.a(obj2, obj3);
    }

    public int hashCode() {
        return d.b(Integer.valueOf(this.f1218d), this.f1219e, this.f1215a);
    }

    public String toString() {
        return "SessionToken {legacyToken=" + this.f1215a + "}";
    }
}
