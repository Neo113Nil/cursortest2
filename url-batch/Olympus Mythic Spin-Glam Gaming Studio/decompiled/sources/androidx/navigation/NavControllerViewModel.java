package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes11.dex */
class NavControllerViewModel extends ViewModel {
    private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory() { // from class: androidx.navigation.NavControllerViewModel.1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls) {
            return new NavControllerViewModel();
        }
    };
    private final HashMap mViewModelStores = new HashMap();

    NavControllerViewModel() {
    }

    static NavControllerViewModel getInstance(ViewModelStore viewModelStore) {
        return (NavControllerViewModel) new ViewModelProvider(viewModelStore, FACTORY).get(NavControllerViewModel.class);
    }

    void clear(UUID uuid) {
        ViewModelStore viewModelStore = (ViewModelStore) this.mViewModelStores.remove(uuid);
        if (viewModelStore != null) {
            viewModelStore.clear();
        }
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        Iterator it = this.mViewModelStores.values().iterator();
        while (it.hasNext()) {
            ((ViewModelStore) it.next()).clear();
        }
        this.mViewModelStores.clear();
    }

    ViewModelStore getViewModelStore(UUID uuid) {
        ViewModelStore viewModelStore = (ViewModelStore) this.mViewModelStores.get(uuid);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.mViewModelStores.put(uuid, viewModelStore2);
        return viewModelStore2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.mViewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
