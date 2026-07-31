package v0;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class o0 extends IOException {

    /* renamed from: f, reason: collision with root package name */
    public final n2.p f22691f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f22692g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<String, List<String>> f22693h;

    /* renamed from: i, reason: collision with root package name */
    public final long f22694i;

    public o0(n2.p pVar, Uri uri, Map<String, List<String>> map, long j7, Throwable th) {
        super(th);
        this.f22691f = pVar;
        this.f22692g = uri;
        this.f22693h = map;
        this.f22694i = j7;
    }
}
