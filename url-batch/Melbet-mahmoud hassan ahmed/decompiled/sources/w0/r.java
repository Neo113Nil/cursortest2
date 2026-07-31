package w0;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f22961a = new r() { // from class: w0.p
        @Override // w0.r
        public final l[] a() {
            l[] c7;
            c7 = q.c();
            return c7;
        }

        @Override // w0.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    l[] a();

    l[] b(Uri uri, Map<String, List<String>> map);
}
