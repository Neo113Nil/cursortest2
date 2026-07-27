package n5;

import android.media.MediaPlayer;
import kotlin.jvm.internal.i;
import m5.l;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f11472a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11473b;

    public d(String str, boolean z) {
        this.f11472a = str;
        this.f11473b = z;
    }

    @Override // n5.c
    public final void a(l soundPoolPlayer) {
        i.e(soundPoolPlayer, "soundPoolPlayer");
        soundPoolPlayer.release();
        soundPoolPlayer.j(this);
    }

    @Override // n5.c
    public final void b(MediaPlayer mediaPlayer) {
        i.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f11472a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.f11472a, dVar.f11472a) && this.f11473b == dVar.f11473b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11473b) + (this.f11472a.hashCode() * 31);
    }

    public final String toString() {
        return "UrlSource(url=" + this.f11472a + ", isLocal=" + this.f11473b + ')';
    }
}
