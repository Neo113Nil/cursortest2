package b;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f980a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f981b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f982c;

    /* renamed from: d, reason: collision with root package name */
    public final transient LinkedHashMap f983d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f984e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f985f;

    public k() {
        new LinkedHashMap();
        this.f982c = new ArrayList();
        this.f983d = new LinkedHashMap();
        this.f984e = new LinkedHashMap();
        this.f985f = new Bundle();
    }

    public final boolean a(int i, int i8, Intent intent) {
        String str = (String) this.f980a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f984e.remove(str);
        this.f985f.putParcelable(str, new f.a(intent, i8));
        return true;
    }
}
