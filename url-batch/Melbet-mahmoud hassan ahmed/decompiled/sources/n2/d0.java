package n2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f19402a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f19403b;

    public synchronized void a(Map<String, String> map) {
        this.f19403b = null;
        this.f19402a.clear();
        this.f19402a.putAll(map);
    }

    public synchronized Map<String, String> b() {
        if (this.f19403b == null) {
            this.f19403b = Collections.unmodifiableMap(new HashMap(this.f19402a));
        }
        return this.f19403b;
    }
}
