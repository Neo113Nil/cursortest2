package jf;

import com.google.android.gms.internal.measurement.se;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final hf.b f5254e = new hf.b();

    /* renamed from: a, reason: collision with root package name */
    public final se f5255a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f5256b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f5257c;

    /* renamed from: d, reason: collision with root package name */
    public final lf.a f5258d;

    public b(se seVar) {
        this.f5255a = seVar;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        newSetFromMap.getClass();
        this.f5256b = newSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f5257c = concurrentHashMap;
        hf.b bVar = f5254e;
        lf.a aVar = new lf.a(bVar, "_root_", null, seVar, 8);
        this.f5258d = aVar;
        newSetFromMap.add(bVar);
        concurrentHashMap.put("_root_", aVar);
    }
}
