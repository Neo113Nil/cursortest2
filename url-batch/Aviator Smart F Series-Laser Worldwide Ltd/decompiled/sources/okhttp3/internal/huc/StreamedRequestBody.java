package okhttp3.internal.huc;

import android.support.v4.media.session.PlaybackStateCompat;
import okhttp3.internal.http.UnrepeatableRequestBody;
import okio.c;
import okio.d;
import okio.j0;
import okio.q0;

/* loaded from: classes5.dex */
final class StreamedRequestBody extends OutputStreamRequestBody implements UnrepeatableRequestBody {
    private final q0 pipe;

    StreamedRequestBody(long j8) {
        q0 q0Var = new q0(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
        this.pipe = q0Var;
        initOutputStream(j0.buffer(q0Var.sink()), j8);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(d dVar) {
        c cVar = new c();
        while (this.pipe.source().read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            dVar.write(cVar, cVar.size());
        }
    }
}
