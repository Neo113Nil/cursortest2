package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class q {

    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f842f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f843g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ArrayList f844h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ArrayList f845i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayList f846j;

        a(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f842f = i7;
            this.f843g = arrayList;
            this.f844h = arrayList2;
            this.f845i = arrayList3;
            this.f846j = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i7 = 0; i7 < this.f842f; i7++) {
                androidx.core.view.h.m((View) this.f843g.get(i7), (String) this.f844h.get(i7));
                androidx.core.view.h.m((View) this.f845i.get(i7), (String) this.f846j.get(i7));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f848f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map f849g;

        b(ArrayList arrayList, Map map) {
            this.f848f = arrayList;
            this.f849g = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f848f.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) this.f848f.get(i7);
                String g7 = androidx.core.view.h.g(view);
                if (g7 != null) {
                    androidx.core.view.h.m(view, q.i(this.f849g, g7));
                }
            }
        }
    }

    class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f851f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map f852g;

        c(ArrayList arrayList, Map map) {
            this.f851f = arrayList;
            this.f852g = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f851f.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) this.f851f.get(i7);
                androidx.core.view.h.m(view, (String) this.f852g.get(androidx.core.view.h.g(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i7 = size; i7 < list.size(); i7++) {
            View view2 = list.get(i7);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (list.get(i8) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z6 = view instanceof ViewGroup;
            View view2 = view;
            if (z6) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean a7 = androidx.core.view.j.a(viewGroup);
                view2 = viewGroup;
                if (!a7) {
                    int childCount = viewGroup.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        f(arrayList, viewGroup.getChildAt(i7));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    public abstract Object g(Object obj);

    void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String g7 = androidx.core.view.h.g(view);
            if (g7 != null) {
                map.put(g7, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    j(map, viewGroup.getChildAt(i7));
                }
            }
        }
    }

    protected void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = arrayList.get(i7);
            arrayList2.add(androidx.core.view.h.g(view));
            androidx.core.view.h.m(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        androidx.core.view.f.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    void w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        androidx.core.view.f.a(view, new b(arrayList, map));
    }

    void x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = arrayList.get(i7);
            String g7 = androidx.core.view.h.g(view2);
            arrayList4.add(g7);
            if (g7 != null) {
                androidx.core.view.h.m(view2, null);
                String str = map.get(g7);
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i8))) {
                        androidx.core.view.h.m(arrayList2.get(i8), g7);
                        break;
                    }
                    i8++;
                }
            }
        }
        androidx.core.view.f.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
