package o3;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f7367d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f7368a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f7369b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f7370c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f7368a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a9 = a(viewGroup.getChildAt(childCount));
                    if (a9 != null) {
                        return a9;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                kotlin.collections.i0.j();
            }
        }
        return null;
    }
}
