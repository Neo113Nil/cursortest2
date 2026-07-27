package a1;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.chicken.road.kedro.laqer.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: a1.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403r {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f4888d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f4889a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f4890b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f4891c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f4889a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
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
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }
}
