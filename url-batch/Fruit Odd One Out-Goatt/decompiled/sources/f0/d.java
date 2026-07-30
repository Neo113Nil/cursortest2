package f0;

import android.app.Activity;
import android.content.Intent;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f289a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f290b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f291c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f292d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f293e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f294f;

    public d(Activity activity, androidx.lifecycle.f fVar) {
        new HashSet();
        this.f294f = new HashSet();
        this.f289a = activity;
        new HiddenLifecycleReference(fVar);
    }

    public final boolean a(int i2, int i3, Intent intent) {
        Iterator it = new HashSet(this.f291c).iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                HashMap hashMap = ((q0.a) it.next()).f1088d;
                if (hashMap.containsKey(Integer.valueOf(i2))) {
                    ((m0.k) hashMap.remove(Integer.valueOf(i2))).d(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z2) {
                }
                z2 = true;
            }
            return z2;
        }
    }
}
