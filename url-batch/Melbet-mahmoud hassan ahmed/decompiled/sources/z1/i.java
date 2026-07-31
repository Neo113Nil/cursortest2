package z1;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i implements s1.a<i> {

    /* renamed from: a, reason: collision with root package name */
    public final String f23600a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f23601b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23602c;

    protected i(String str, List<String> list, boolean z6) {
        this.f23600a = str;
        this.f23601b = Collections.unmodifiableList(list);
        this.f23602c = z6;
    }
}
