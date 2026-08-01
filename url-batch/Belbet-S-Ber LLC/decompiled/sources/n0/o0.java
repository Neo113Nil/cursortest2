package n0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.gdmhkmf.belbet.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o0 {
    public static final ArrayList d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2812a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f2813b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f2814c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f2812a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a5 = a(viewGroup.getChildAt(childCount));
                if (a5 != null) {
                    return a5;
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
