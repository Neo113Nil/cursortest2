package d2;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2220b;

    public /* synthetic */ w(int i, Object obj) {
        this.f2219a = i;
        this.f2220b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2219a) {
            case 0:
                return ((Number) ((p6.e) this.f2220b).g(obj, obj2)).intValue();
            case 1:
                for (p6.c cVar : (p6.c[]) this.f2220b) {
                    int g3 = a.a.g((Comparable) cVar.i(obj), (Comparable) cVar.i(obj2));
                    if (g3 != 0) {
                        return g3;
                    }
                }
                return 0;
            default:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f2220b;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f1881r).compareTo(Boolean.valueOf(materialButton2.f1881r));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return compareTo2 != 0 ? compareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
        }
    }
}
