package a3;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    final Map<Integer, Bitmap> f59a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f60b = new AtomicInteger(0);

    public final Bitmap a(Integer num) {
        return this.f59a.get(num);
    }
}
