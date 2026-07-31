package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC1282b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import x.InterfaceMenuC3510a;

/* loaded from: classes.dex */
public class e implements InterfaceMenuC3510a {
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private a mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private g mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<g> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<j>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<g> mItems = new ArrayList<>();
    private ArrayList<g> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<g> mActionItems = new ArrayList<>();
    private ArrayList<g> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        h(true);
    }

    private g a(int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        return new g(this, i4, i5, i6, i7, charSequence, i8);
    }

    private void b(boolean z4) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<j>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.mPresenters.remove(next);
            } else {
                jVar.b(z4);
            }
        }
        startDispatchingItemsChanged();
    }

    private boolean c(m mVar, j jVar) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean h4 = jVar != null ? jVar.h(mVar) : false;
        Iterator<WeakReference<j>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.mPresenters.remove(next);
            } else if (!h4) {
                h4 = jVar2.h(mVar);
            }
        }
        return h4;
    }

    private static int d(ArrayList arrayList, int i4) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i4) {
                return size + 1;
            }
        }
        return 0;
    }

    private static int e(int i4) {
        int i5 = ((-65536) & i4) >> 16;
        if (i5 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i5 < iArr.length) {
                return (i4 & 65535) | (iArr[i5] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void f(int i4, boolean z4) {
        if (i4 < 0 || i4 >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i4);
        if (z4) {
            onItemsChanged(true);
        }
    }

    private void g(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i4 > 0) {
                this.mHeaderTitle = resources.getText(i4);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i5 > 0) {
                this.mHeaderIcon = androidx.core.content.a.g(getContext(), i5);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (androidx.core.view.AbstractC1289e0.l(android.view.ViewConfiguration.get(r2.mContext), r2.mContext) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void h(boolean z4) {
        boolean z5;
        if (z4) {
            z5 = true;
            if (this.mResources.getConfiguration().keyboard != 1) {
            }
        }
        z5 = false;
        this.mShortcutsVisible = z5;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i4, i5, i6, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = intent3;
            }
        }
        return size;
    }

    protected MenuItem addInternal(int i4, int i5, int i6, CharSequence charSequence) {
        int e4 = e(i6);
        g a4 = a(i4, i5, i6, e4, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            a4.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.mItems;
        arrayList.add(d(arrayList, e4), a4);
        onItemsChanged(true);
        return a4;
    }

    public void addMenuPresenter(j jVar) {
        addMenuPresenter(jVar, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void changeMenuMode() {
        a aVar = this.mCallback;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.mExpandedItem;
        if (gVar != null) {
            collapseItemActionView(gVar);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z4) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        Iterator<WeakReference<j>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.mPresenters.remove(next);
            } else {
                jVar.a(this, z4);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(g gVar) {
        boolean z4 = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == gVar) {
            stopDispatchingItemsChanged();
            Iterator<WeakReference<j>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.mPresenters.remove(next);
                } else {
                    z4 = jVar.d(this, gVar);
                    if (z4) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (z4) {
                this.mExpandedItem = null;
            }
        }
        return z4;
    }

    boolean dispatchMenuItemSelected(e eVar, MenuItem menuItem) {
        a aVar = this.mCallback;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public boolean expandItemActionView(g gVar) {
        boolean z4 = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<j>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.mPresenters.remove(next);
            } else {
                z4 = jVar.e(this, gVar);
                if (z4) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (z4) {
            this.mExpandedItem = gVar;
        }
        return z4;
    }

    public int findGroupIndex(int i4) {
        return findGroupIndex(i4, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i4) {
        MenuItem findItem;
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            g gVar = this.mItems.get(i5);
            if (gVar.getItemId() == i4) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i4)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.mItems.get(i5).getItemId() == i4) {
                return i5;
            }
        }
        return -1;
    }

    g findItemWithShortcutForKey(int i4, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean isQwertyMode = isQwertyMode();
        for (int i5 = 0; i5 < size; i5++) {
            g gVar = arrayList.get(i5);
            char alphabeticShortcut = isQwertyMode ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (isQwertyMode && alphabeticShortcut == '\b' && i4 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    void findItemsWithShortcutForKey(List<g> list, int i4, KeyEvent keyEvent) {
        boolean isQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            int size = this.mItems.size();
            for (int i5 = 0; i5 < size; i5++) {
                g gVar = this.mItems.get(i5);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).findItemsWithShortcutForKey(list, i4, keyEvent);
                }
                char alphabeticShortcut = isQwertyMode ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((isQwertyMode ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (isQwertyMode && alphabeticShortcut == '\b' && i4 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<g> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            Iterator<WeakReference<j>> it = this.mPresenters.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.mPresenters.remove(next);
                } else {
                    z4 |= jVar.c();
                }
            }
            if (z4) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i4 = 0; i4 < size; i4++) {
                    g gVar = visibleItems.get(i4);
                    if (gVar.l()) {
                        this.mActionItems.add(gVar);
                    } else {
                        this.mNonActionItems.add(gVar);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<g> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    protected String getActionViewStatesKey() {
        return "android:menu:actionviewstates";
    }

    public Context getContext() {
        return this.mContext;
    }

    public g getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i4) {
        return this.mItems.get(i4);
    }

    public ArrayList<g> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    Resources getResources() {
        return this.mResources;
    }

    public e getRootMenu() {
        return this;
    }

    public ArrayList<g> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i4 = 0; i4 < size; i4++) {
            g gVar = this.mItems.get(i4);
            if (gVar.isVisible()) {
                this.mVisibleItems.add(gVar);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.mItems.get(i4).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDispatchingItemsChanged() {
        return !this.mPreventDispatchingItemsChanged;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i4, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    void onItemActionRequestChanged(g gVar) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    void onItemVisibleChanged(g gVar) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z4) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z4) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z4) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        b(z4);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i4, int i5) {
        return performItemAction(findItem(i4), i5);
    }

    public boolean performItemAction(MenuItem menuItem, int i4) {
        return performItemAction(menuItem, null, i4);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        g findItemWithShortcutForKey = findItemWithShortcutForKey(i4, keyEvent);
        boolean performItemAction = findItemWithShortcutForKey != null ? performItemAction(findItemWithShortcutForKey, i5) : false;
        if ((i5 & 2) != 0) {
            close(true);
        }
        return performItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i4) {
        int findGroupIndex = findGroupIndex(i4);
        if (findGroupIndex >= 0) {
            int size = this.mItems.size() - findGroupIndex;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= size || this.mItems.get(findGroupIndex).getGroupId() != i4) {
                    break;
                }
                f(findGroupIndex, false);
                i5 = i6;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i4) {
        f(findItemIndex(i4), true);
    }

    public void removeMenuPresenter(j jVar) {
        Iterator<WeakReference<j>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.mPresenters.remove(next);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i5 = bundle.getInt("android:menu:expandedactionview");
        if (i5 <= 0 || (findItem = findItem(i5)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void setCallback(a aVar) {
        this.mCallback = aVar;
    }

    public e setDefaultShowAsAction(int i4) {
        this.mDefaultShowAsAction = i4;
        return this;
    }

    void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i4 = 0; i4 < size; i4++) {
            g gVar = this.mItems.get(i4);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i4, boolean z4, boolean z5) {
        int size = this.mItems.size();
        for (int i5 = 0; i5 < size; i5++) {
            g gVar = this.mItems.get(i5);
            if (gVar.getGroupId() == i4) {
                gVar.t(z5);
                gVar.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.mGroupDividerEnabled = z4;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i4, boolean z4) {
        int size = this.mItems.size();
        for (int i5 = 0; i5 < size; i5++) {
            g gVar = this.mItems.get(i5);
            if (gVar.getGroupId() == i4) {
                gVar.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i4, boolean z4) {
        int size = this.mItems.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            g gVar = this.mItems.get(i5);
            if (gVar.getGroupId() == i4 && gVar.y(z4)) {
                z5 = true;
            }
        }
        if (z5) {
            onItemsChanged(true);
        }
    }

    protected e setHeaderIconInt(Drawable drawable) {
        g(0, null, 0, drawable, null);
        return this;
    }

    protected e setHeaderTitleInt(CharSequence charSequence) {
        g(0, charSequence, 0, null, null);
        return this;
    }

    protected e setHeaderViewInt(View view) {
        g(0, null, 0, null, view);
        return this;
    }

    public void setOverrideVisibleItems(boolean z4) {
        this.mOverrideVisibleItems = z4;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.mQwertyMode = z4;
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4) {
        return addInternal(0, 0, 0, this.mResources.getString(i4));
    }

    public void addMenuPresenter(j jVar, Context context) {
        this.mPresenters.add(new WeakReference<>(jVar));
        jVar.g(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i4));
    }

    public int findGroupIndex(int i4, int i5) {
        int size = size();
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < size) {
            if (this.mItems.get(i5).getGroupId() == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public boolean performItemAction(MenuItem menuItem, j jVar, int i4) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k4 = gVar.k();
        AbstractC1282b b4 = gVar.b();
        boolean z4 = b4 != null && b4.a();
        if (gVar.j()) {
            boolean expandActionView = gVar.expandActionView() | k4;
            if (expandActionView) {
                close(true);
            }
            return expandActionView;
        }
        if (!gVar.hasSubMenu() && !z4) {
            if ((i4 & 1) == 0) {
                close(true);
            }
            return k4;
        }
        if ((i4 & 4) == 0) {
            close(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.x(new m(getContext(), this, gVar));
        }
        m mVar = (m) gVar.getSubMenu();
        if (z4) {
            b4.e(mVar);
        }
        boolean c4 = c(mVar, jVar) | k4;
        if (!c4) {
            close(true);
        }
        return c4;
    }

    protected e setHeaderIconInt(int i4) {
        g(0, null, i4, null, null);
        return this;
    }

    protected e setHeaderTitleInt(int i4) {
        g(i4, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return addInternal(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        g gVar = (g) addInternal(i4, i5, i6, charSequence);
        m mVar = new m(this.mContext, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, int i7) {
        return addInternal(i4, i5, i6, this.mResources.getString(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.mResources.getString(i7));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }
}
