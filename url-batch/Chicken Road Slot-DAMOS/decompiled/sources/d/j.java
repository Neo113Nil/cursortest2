package d;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3237a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3238b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3239c;

    /* renamed from: d, reason: collision with root package name */
    public final transient LinkedHashMap f3240d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f3241e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f3242f;

    public j() {
        new LinkedHashMap();
        this.f3239c = new ArrayList();
        this.f3240d = new LinkedHashMap();
        this.f3241e = new LinkedHashMap();
        this.f3242f = new Bundle();
    }

    public final boolean a(int i3, int i10, Intent intent) {
        String str = (String) this.f3237a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        this.f3241e.remove(str);
        this.f3242f.putParcelable(str, new h.a(i10, intent));
        return true;
    }
}
