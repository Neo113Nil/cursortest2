package S0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4024d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Context f4025e;

    public p(Context context) {
        this.f4025e = context;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f4024d.iterator();
    }
}
