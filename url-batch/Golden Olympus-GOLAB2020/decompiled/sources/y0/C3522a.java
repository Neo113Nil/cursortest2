package y0;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import u0.AbstractC3454a;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3522a extends AbstractC3454a {

    /* renamed from: b, reason: collision with root package name */
    private static final List f46720b = new CopyOnWriteArrayList();

    public static void a() {
        Iterator it = f46720b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }
}
