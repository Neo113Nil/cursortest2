package defpackage;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpo {
    public int a;
    public boolean b;
    public final Object c;

    public fpo(int i, kee keeVar) {
        this.c = new WeakReference(keeVar);
        this.a = i;
    }

    final boolean a(kee keeVar) {
        return keeVar != null && ((WeakReference) this.c).get() == keeVar;
    }

    public fpo(FloatingActionButton floatingActionButton) {
        this.b = false;
        this.a = 0;
        this.c = floatingActionButton;
    }
}
