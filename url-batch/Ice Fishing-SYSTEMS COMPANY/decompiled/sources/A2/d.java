package A2;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f29b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f30c = new AtomicReference(a.UNKNOWN);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f31d = new AtomicReference(b.UNKNOWN);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f32e = new AtomicReference(c.UNKNOWN);

    public d(Context context) {
        this.f28a = context;
    }
}
