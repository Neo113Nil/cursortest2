package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.moontiko.really.admiralcasino.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class hc0 {
    public static final ArrayList d = new ArrayList();
    public WeakHashMap a;
    public SparseArray b;
    public WeakReference c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a = a(viewGroup.getChildAt(childCount));
                    if (a != null) {
                        return a;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                g9.b();
            }
        }
        return null;
    }
}
