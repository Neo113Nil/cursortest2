package b3;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f1361d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f1362a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f1363b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f1364c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f1362a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a3 = a(viewGroup.getChildAt(childCount));
                if (a3 != null) {
                    return a3;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
