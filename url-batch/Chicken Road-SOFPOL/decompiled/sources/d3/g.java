package d3;

import a4.i;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.Comparator;
import q3.c0;
import q3.k0;
import w4.k;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2242a;

    public /* synthetic */ g(int i) {
        this.f2242a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int top;
        int top2;
        switch (this.f2242a) {
            case 0:
                Field field = k0.f6120a;
                float f6 = c0.f((View) obj);
                float f8 = c0.f((View) obj2);
                if (f6 > f8) {
                    return -1;
                }
                return f6 < f8 ? 1 : 0;
            case 1:
                top = ((View) obj).getTop();
                top2 = ((View) obj2).getTop();
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                top = ((w2.f) obj).f7866e;
                top2 = ((w2.f) obj2).f7866e;
                break;
            default:
                k kVar = (k) obj;
                k kVar2 = (k) obj2;
                RecyclerView recyclerView = kVar.f7963d;
                if ((recyclerView == null) == (kVar2.f7963d == null)) {
                    boolean z3 = kVar.f7960a;
                    if (z3 == kVar2.f7960a) {
                        int i = kVar2.f7961b - kVar.f7961b;
                        if (i != 0) {
                            return i;
                        }
                        int i8 = kVar.f7962c - kVar2.f7962c;
                        if (i8 != 0) {
                            return i8;
                        }
                        return 0;
                    }
                    if (!z3) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
        }
        return top - top2;
    }
}
