package k0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.gglhk.bofio.fortunetiger.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f2743d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2744a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f2745b;
    public WeakReference c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f2744a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a4 = a(viewGroup.getChildAt(childCount));
                if (a4 != null) {
                    return a4;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        throw androidx.fragment.app.w0.d(arrayList, size);
    }
}
