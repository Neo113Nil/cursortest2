package M;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1293g0;
import androidx.core.view.AbstractC1295h0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f901a = c.f905b;

    /* renamed from: b, reason: collision with root package name */
    private static final int f902b = c.f904a;

    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Iterator it = AbstractC1295h0.a(view).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    public static final void b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Iterator it = AbstractC1293g0.b(viewGroup).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    private static final b c(View view) {
        int i4 = f901a;
        b bVar = (b) view.getTag(i4);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        view.setTag(i4, bVar2);
        return bVar2;
    }

    public static final void d(View view, boolean z4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(f902b, Boolean.valueOf(z4));
    }
}
