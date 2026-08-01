package androidx.fragment.app;

import android.util.Log;
import defpackage.b90;
import defpackage.dc;
import defpackage.gh;
import defpackage.lq;
import defpackage.om0;
import defpackage.rm0;
import defpackage.s9;
import defpackage.sm0;
import defpackage.wi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
final class FragmentManagerViewModel extends om0 {
    private static final rm0 FACTORY = new d();
    private static final String TAG = "FragmentManager";
    private final boolean mStateAutomaticallySaved;
    private final HashMap<String, a> mRetainedFragments = new HashMap<>();
    private final HashMap<String, FragmentManagerViewModel> mChildNonConfigs = new HashMap<>();
    private final HashMap<String, sm0> mViewModelStores = new HashMap<>();
    private boolean mHasBeenCleared = false;
    private boolean mHasSavedSnapshot = false;
    private boolean mIsStateSaved = false;

    public FragmentManagerViewModel(boolean z) {
        this.mStateAutomaticallySaved = z;
    }

    private void clearNonConfigStateInternal(String str) {
        FragmentManagerViewModel fragmentManagerViewModel = this.mChildNonConfigs.get(str);
        if (fragmentManagerViewModel != null) {
            fragmentManagerViewModel.onCleared();
            this.mChildNonConfigs.remove(str);
        }
        sm0 sm0Var = this.mViewModelStores.get(str);
        if (sm0Var != null) {
            sm0Var.a();
            this.mViewModelStores.remove(str);
        }
    }

    public static FragmentManagerViewModel getInstance(sm0 sm0Var) {
        rm0 rm0Var = FACTORY;
        sm0Var.getClass();
        rm0Var.getClass();
        gh ghVar = gh.b;
        ghVar.getClass();
        wi wiVar = new wi(sm0Var, rm0Var, ghVar);
        dc a = b90.a(FragmentManagerViewModel.class);
        String b = a.b();
        if (b != null) {
            return (FragmentManagerViewModel) wiVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        }
        s9.k("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public void addRetainedFragment(a aVar) {
        if (this.mIsStateSaved) {
            if (c.G(2)) {
                Log.v(TAG, "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.mRetainedFragments.containsKey(aVar.j)) {
                return;
            }
            this.mRetainedFragments.put(aVar.j, aVar);
            if (c.G(2)) {
                Log.v(TAG, "Updating retained Fragments: Added " + aVar);
            }
        }
    }

    public void clearNonConfigState(a aVar) {
        if (c.G(3)) {
            Log.d(TAG, "Clearing non-config state for " + aVar);
        }
        clearNonConfigStateInternal(aVar.j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FragmentManagerViewModel.class == obj.getClass()) {
            FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
            if (this.mRetainedFragments.equals(fragmentManagerViewModel.mRetainedFragments) && this.mChildNonConfigs.equals(fragmentManagerViewModel.mChildNonConfigs) && this.mViewModelStores.equals(fragmentManagerViewModel.mViewModelStores)) {
                return true;
            }
        }
        return false;
    }

    public a findRetainedFragmentByWho(String str) {
        return this.mRetainedFragments.get(str);
    }

    public FragmentManagerViewModel getChildNonConfig(a aVar) {
        FragmentManagerViewModel fragmentManagerViewModel = this.mChildNonConfigs.get(aVar.j);
        if (fragmentManagerViewModel != null) {
            return fragmentManagerViewModel;
        }
        FragmentManagerViewModel fragmentManagerViewModel2 = new FragmentManagerViewModel(this.mStateAutomaticallySaved);
        this.mChildNonConfigs.put(aVar.j, fragmentManagerViewModel2);
        return fragmentManagerViewModel2;
    }

    public Collection<a> getRetainedFragments() {
        return new ArrayList(this.mRetainedFragments.values());
    }

    @Deprecated
    public lq getSnapshot() {
        if (this.mRetainedFragments.isEmpty() && this.mChildNonConfigs.isEmpty() && this.mViewModelStores.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, FragmentManagerViewModel> entry : this.mChildNonConfigs.entrySet()) {
            lq snapshot = entry.getValue().getSnapshot();
            if (snapshot != null) {
                hashMap.put(entry.getKey(), snapshot);
            }
        }
        this.mHasSavedSnapshot = true;
        if (this.mRetainedFragments.isEmpty() && hashMap.isEmpty() && this.mViewModelStores.isEmpty()) {
            return null;
        }
        return new lq(new ArrayList(this.mRetainedFragments.values()), hashMap, new HashMap(this.mViewModelStores));
    }

    public sm0 getViewModelStore(a aVar) {
        sm0 sm0Var = this.mViewModelStores.get(aVar.j);
        if (sm0Var != null) {
            return sm0Var;
        }
        sm0 sm0Var2 = new sm0();
        this.mViewModelStores.put(aVar.j, sm0Var2);
        return sm0Var2;
    }

    public int hashCode() {
        return this.mViewModelStores.hashCode() + ((this.mChildNonConfigs.hashCode() + (this.mRetainedFragments.hashCode() * 31)) * 31);
    }

    public boolean isCleared() {
        return this.mHasBeenCleared;
    }

    @Override // defpackage.om0
    public void onCleared() {
        if (c.G(3)) {
            Log.d(TAG, "onCleared called for " + this);
        }
        this.mHasBeenCleared = true;
    }

    public void removeRetainedFragment(a aVar) {
        if (this.mIsStateSaved) {
            if (c.G(2)) {
                Log.v(TAG, "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.mRetainedFragments.remove(aVar.j) == null || !c.G(2)) {
                return;
            }
            Log.v(TAG, "Updating retained Fragments: Removed " + aVar);
        }
    }

    @Deprecated
    public void restoreFromSnapshot(lq lqVar) {
        this.mRetainedFragments.clear();
        this.mChildNonConfigs.clear();
        this.mViewModelStores.clear();
        if (lqVar != null) {
            ArrayList arrayList = lqVar.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                a aVar = (a) obj;
                if (aVar != null) {
                    this.mRetainedFragments.put(aVar.j, aVar);
                }
            }
            for (Map.Entry entry : lqVar.b.entrySet()) {
                FragmentManagerViewModel fragmentManagerViewModel = new FragmentManagerViewModel(this.mStateAutomaticallySaved);
                fragmentManagerViewModel.restoreFromSnapshot((lq) entry.getValue());
                this.mChildNonConfigs.put((String) entry.getKey(), fragmentManagerViewModel);
            }
            this.mViewModelStores.putAll(lqVar.c);
        }
        this.mHasSavedSnapshot = false;
    }

    public void setIsStateSaved(boolean z) {
        this.mIsStateSaved = z;
    }

    public boolean shouldDestroy(a aVar) {
        if (this.mRetainedFragments.containsKey(aVar.j)) {
            return this.mStateAutomaticallySaved ? this.mHasBeenCleared : !this.mHasSavedSnapshot;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<a> it = this.mRetainedFragments.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.mChildNonConfigs.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.mViewModelStores.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public void clearNonConfigState(String str) {
        if (c.G(3)) {
            Log.d(TAG, "Clearing non-config state for saved state of Fragment " + str);
        }
        clearNonConfigStateInternal(str);
    }
}
