package F;

import E.AbstractActivityC0004e;
import android.content.Intent;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0004e f246a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f247b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f248c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f249d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f250e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f251f;

    public d(AbstractActivityC0004e abstractActivityC0004e, androidx.lifecycle.j jVar) {
        new HashSet();
        this.f251f = new HashSet();
        this.f246a = abstractActivityC0004e;
        new HiddenLifecycleReference(jVar);
    }

    public final boolean a(int i2, int i3, Intent intent) {
        Iterator it = new HashSet(this.f248c).iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                HashMap hashMap = ((Q.a) it.next()).f419e;
                if (hashMap.containsKey(Integer.valueOf(i2))) {
                    ((M.j) hashMap.remove(Integer.valueOf(i2))).c(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z) {
                }
                z = true;
            }
            return z;
        }
    }
}
