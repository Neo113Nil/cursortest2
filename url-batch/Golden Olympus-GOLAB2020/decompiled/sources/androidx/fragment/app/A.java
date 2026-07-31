package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import k0.C3197e;

/* loaded from: classes.dex */
abstract class A {

    /* renamed from: a, reason: collision with root package name */
    static final C f12222a = new B();

    /* renamed from: b, reason: collision with root package name */
    static final C f12223b = b();

    static void a(Fragment fragment, Fragment fragment2, boolean z4, androidx.collection.a aVar, boolean z5) {
        if (z4) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    private static C b() {
        try {
            return (C) C3197e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static void c(androidx.collection.a aVar, androidx.collection.a aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.q(size))) {
                aVar.o(size);
            }
        }
    }

    static void d(ArrayList arrayList, int i4) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i4);
        }
    }
}
