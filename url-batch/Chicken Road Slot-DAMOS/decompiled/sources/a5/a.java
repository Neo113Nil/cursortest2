package a5;

import c6.l;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import u8.d;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final d f289c = new d(2);

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f290d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f291a;

    /* renamed from: b, reason: collision with root package name */
    public final l f292b;

    public a(String str, boolean z10) {
        ReentrantLock reentrantLock;
        synchronized (f289c) {
            try {
                LinkedHashMap linkedHashMap = f290d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f291a = reentrantLock;
        this.f292b = z10 ? new l(str) : null;
    }
}
