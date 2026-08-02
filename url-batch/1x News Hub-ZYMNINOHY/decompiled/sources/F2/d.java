package F2;

import E2.l;
import android.media.MediaPlayer;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f527a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f528b;

    public d(String str, boolean z) {
        this.f527a = str;
        this.f528b = z;
    }

    @Override // F2.c
    public final void a(MediaPlayer mediaPlayer) {
        j.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f527a);
    }

    @Override // F2.c
    public final void b(l soundPoolPlayer) {
        j.e(soundPoolPlayer, "soundPoolPlayer");
        soundPoolPlayer.release();
        soundPoolPlayer.d(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f527a, dVar.f527a) && this.f528b == dVar.f528b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f528b) + (this.f527a.hashCode() * 31);
    }

    public final String toString() {
        return "UrlSource(url=" + this.f527a + ", isLocal=" + this.f528b + ')';
    }
}
