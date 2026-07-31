package g3;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class b extends LinkedHashMap<String, Pair<Long, String>> {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ l f16604f;

    b(l lVar) {
        this.f16604f = lVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry<String, Pair<Long, String>> entry) {
        int i7;
        int size = size();
        i7 = this.f16604f.f16661a;
        return size > i7;
    }
}
