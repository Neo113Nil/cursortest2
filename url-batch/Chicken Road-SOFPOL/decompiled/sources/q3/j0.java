package q3;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.snovikpovik.vuevnxsj.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f6114d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f6115a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f6116b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f6117c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f6115a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a8 = a(viewGroup.getChildAt(childCount));
                if (a8 != null) {
                    return a8;
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
