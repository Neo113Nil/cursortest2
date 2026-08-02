package Y3;

import X3.k;
import android.media.MediaPlayer;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final a f3766a;

    public b(byte[] bArr) {
        this.f3766a = new a(bArr);
    }

    @Override // Y3.c
    public final void a(MediaPlayer mediaPlayer) {
        i.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f3766a);
    }

    @Override // Y3.c
    public final void b(k kVar) {
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && i.a(this.f3766a, ((b) obj).f3766a);
    }

    public final int hashCode() {
        return this.f3766a.hashCode();
    }

    public final String toString() {
        return "BytesSource(dataSource=" + this.f3766a + ')';
    }
}
