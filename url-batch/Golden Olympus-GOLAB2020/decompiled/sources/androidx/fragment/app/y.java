package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f12527a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f12528b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f12529c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private v f12530d;

    y() {
    }

    void A(v vVar) {
        this.f12530d = vVar;
    }

    FragmentState B(String str, FragmentState fragmentState) {
        return fragmentState != null ? (FragmentState) this.f12529c.put(str, fragmentState) : (FragmentState) this.f12529c.remove(str);
    }

    void a(Fragment fragment) {
        if (this.f12527a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f12527a) {
            this.f12527a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.f12528b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f12528b.get(str) != null;
    }

    void d(int i4) {
        for (x xVar : this.f12528b.values()) {
            if (xVar != null) {
                xVar.t(i4);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f12528b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (x xVar : this.f12528b.values()) {
                printWriter.print(str);
                if (xVar != null) {
                    Fragment k4 = xVar.k();
                    printWriter.println(k4);
                    k4.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f12527a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size; i4++) {
                Fragment fragment = (Fragment) this.f12527a.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        x xVar = (x) this.f12528b.get(str);
        if (xVar != null) {
            return xVar.k();
        }
        return null;
    }

    Fragment g(int i4) {
        for (int size = this.f12527a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f12527a.get(size);
            if (fragment != null && fragment.mFragmentId == i4) {
                return fragment;
            }
        }
        for (x xVar : this.f12528b.values()) {
            if (xVar != null) {
                Fragment k4 = xVar.k();
                if (k4.mFragmentId == i4) {
                    return k4;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f12527a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f12527a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (x xVar : this.f12528b.values()) {
            if (xVar != null) {
                Fragment k4 = xVar.k();
                if (str.equals(k4.mTag)) {
                    return k4;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment findFragmentByWho;
        for (x xVar : this.f12528b.values()) {
            if (xVar != null && (findFragmentByWho = xVar.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f12527a.indexOf(fragment);
        for (int i4 = indexOf - 1; i4 >= 0; i4--) {
            Fragment fragment2 = (Fragment) this.f12527a.get(i4);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f12527a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f12527a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (x xVar : this.f12528b.values()) {
            if (xVar != null) {
                arrayList.add(xVar);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (x xVar : this.f12528b.values()) {
            if (xVar != null) {
                arrayList.add(xVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    ArrayList m() {
        return new ArrayList(this.f12529c.values());
    }

    x n(String str) {
        return (x) this.f12528b.get(str);
    }

    List o() {
        ArrayList arrayList;
        if (this.f12527a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f12527a) {
            arrayList = new ArrayList(this.f12527a);
        }
        return arrayList;
    }

    v p() {
        return this.f12530d;
    }

    FragmentState q(String str) {
        return (FragmentState) this.f12529c.get(str);
    }

    void r(x xVar) {
        Fragment k4 = xVar.k();
        if (c(k4.mWho)) {
            return;
        }
        this.f12528b.put(k4.mWho, xVar);
        if (k4.mRetainInstanceChangedWhileDetached) {
            if (k4.mRetainInstance) {
                this.f12530d.b(k4);
            } else {
                this.f12530d.l(k4);
            }
            k4.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k4);
        }
    }

    void s(x xVar) {
        Fragment k4 = xVar.k();
        if (k4.mRetainInstance) {
            this.f12530d.l(k4);
        }
        if (((x) this.f12528b.put(k4.mWho, null)) != null && FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k4);
        }
    }

    void t() {
        ArrayList arrayList = this.f12527a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            x xVar = (x) this.f12528b.get(((Fragment) obj).mWho);
            if (xVar != null) {
                xVar.m();
            }
        }
        for (x xVar2 : this.f12528b.values()) {
            if (xVar2 != null) {
                xVar2.m();
                Fragment k4 = xVar2.k();
                if (k4.mRemoving && !k4.isInBackStack()) {
                    if (k4.mBeingSaved && !this.f12529c.containsKey(k4.mWho)) {
                        xVar2.r();
                    }
                    s(xVar2);
                }
            }
        }
    }

    void u(Fragment fragment) {
        synchronized (this.f12527a) {
            this.f12527a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void v() {
        this.f12528b.clear();
    }

    void w(List list) {
        this.f12527a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment f4 = f(str);
                if (f4 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f4);
                }
                a(f4);
            }
        }
    }

    void x(ArrayList arrayList) {
        this.f12529c.clear();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            FragmentState fragmentState = (FragmentState) obj;
            this.f12529c.put(fragmentState.f12384c, fragmentState);
        }
    }

    ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f12528b.size());
        for (x xVar : this.f12528b.values()) {
            if (xVar != null) {
                Fragment k4 = xVar.k();
                xVar.r();
                arrayList.add(k4.mWho);
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k4 + ": " + k4.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    ArrayList z() {
        synchronized (this.f12527a) {
            try {
                if (this.f12527a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f12527a.size());
                ArrayList arrayList2 = this.f12527a;
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    Fragment fragment = (Fragment) obj;
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
