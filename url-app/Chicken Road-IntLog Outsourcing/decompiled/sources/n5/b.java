package n5;

import android.media.MediaPlayer;
import kotlin.jvm.internal.i;
import m5.l;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final a f11471a;

    public b(byte[] bArr) {
        this.f11471a = new a(bArr);
    }

    @Override // n5.c
    public final void a(l soundPoolPlayer) {
        i.e(soundPoolPlayer, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.");
    }

    @Override // n5.c
    public final void b(MediaPlayer mediaPlayer) {
        i.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f11471a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && i.a(this.f11471a, ((b) obj).f11471a);
    }

    public final int hashCode() {
        return this.f11471a.hashCode();
    }

    public final String toString() {
        return "BytesSource(dataSource=" + this.f11471a + ')';
    }
}
