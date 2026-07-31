package u0;

import android.content.Context;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f46381a;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f46383c;

    /* renamed from: b, reason: collision with root package name */
    private C3455b f46382b = C3455b.f46375b;

    /* renamed from: d, reason: collision with root package name */
    private final Map f46384d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final List f46385e = new ArrayList();

    public d a(Context context) {
        return new w0.c(context, this.f46381a, this.f46382b, this.f46383c, this.f46384d, this.f46385e, null);
    }

    public e b(InputStream inputStream) {
        this.f46383c = inputStream;
        return this;
    }
}
