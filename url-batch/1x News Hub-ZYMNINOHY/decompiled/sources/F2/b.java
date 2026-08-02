package F2;

import E2.l;
import android.media.MediaPlayer;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final a f526a;

    public b(byte[] bArr) {
        this.f526a = new a(bArr);
    }

    @Override // F2.c
    public final void a(MediaPlayer mediaPlayer) {
        j.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f526a);
    }

    @Override // F2.c
    public final void b(l soundPoolPlayer) {
        j.e(soundPoolPlayer, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f526a, ((b) obj).f526a);
    }

    public final int hashCode() {
        return this.f526a.hashCode();
    }

    public final String toString() {
        return "BytesSource(dataSource=" + this.f526a + ')';
    }
}
