package Y3;

import X3.k;
import android.media.MediaPlayer;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3767a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3768b;

    public d(String str, boolean z) {
        this.f3767a = str;
        this.f3768b = z;
    }

    @Override // Y3.c
    public final void a(MediaPlayer mediaPlayer) {
        i.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f3767a);
    }

    @Override // Y3.c
    public final void b(k kVar) {
        kVar.release();
        kVar.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.f3767a, dVar.f3767a) && this.f3768b == dVar.f3768b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3768b) + (this.f3767a.hashCode() * 31);
    }

    public final String toString() {
        return "UrlSource(url=" + this.f3767a + ", isLocal=" + this.f3768b + ')';
    }
}
