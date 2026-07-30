package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.ice.fishing.grenza.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qq2 {
    public static final ArrayList Y1f8riQaR6yg = new ArrayList();
    public WeakHashMap PxuCJdSBwIXG;
    public WeakReference TSizfFm2Yiuu;
    public SparseArray lS5Rgt96tfkO;

    public final View PxuCJdSBwIXG(View view) {
        int size;
        WeakHashMap weakHashMap = this.PxuCJdSBwIXG;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View PxuCJdSBwIXG = PxuCJdSBwIXG(viewGroup.getChildAt(childCount));
                    if (PxuCJdSBwIXG != null) {
                        return PxuCJdSBwIXG;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                u9.VhhvGxCb8gfr();
            }
        }
        return null;
    }
}
