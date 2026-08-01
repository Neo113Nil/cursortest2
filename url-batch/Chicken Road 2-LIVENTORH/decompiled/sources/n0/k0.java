package n0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.oriondriftchasers.arordrft.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k0 {
    public static final ArrayList d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2753a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f2754b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f2755c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f2753a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a2 = a(viewGroup.getChildAt(childCount));
                if (a2 != null) {
                    return a2;
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
