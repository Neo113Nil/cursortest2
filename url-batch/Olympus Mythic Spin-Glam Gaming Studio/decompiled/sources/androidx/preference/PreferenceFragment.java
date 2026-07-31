package androidx.preference;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

@Deprecated
/* loaded from: classes12.dex */
public abstract class PreferenceFragment extends Fragment implements PreferenceManager.OnPreferenceTreeClickListener, PreferenceManager.OnDisplayPreferenceDialogListener, PreferenceManager.OnNavigateToScreenListener, DialogPreference.TargetFragment {
    private final DividerDecoration mDividerDecoration;
    private final Handler mHandler;
    private boolean mHavePrefs;
    private boolean mInitDone;
    private int mLayoutResId;
    RecyclerView mList;
    private PreferenceManager mPreferenceManager;
    private final Runnable mRequestFocus;
    private Runnable mSelectPreferenceRunnable;
    private Context mStyledContext;

    public interface OnPreferenceDisplayDialogCallback {
        boolean onPreferenceDisplayDialog(PreferenceFragment preferenceFragment, Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean onPreferenceStartFragment(PreferenceFragment preferenceFragment, Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        boolean onPreferenceStartScreen(PreferenceFragment preferenceFragment, PreferenceScreen preferenceScreen);
    }

    public Fragment getCallbackFragment() {
        return null;
    }

    protected void onBindPreferences() {
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    protected void onUnbindPreferences() {
    }

    /* renamed from: androidx.preference.PreferenceFragment$1, reason: invalid class name */
    class AnonymousClass1 extends Handler {
        final /* synthetic */ PreferenceFragment this$0;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            this.this$0.bindPreferences();
        }
    }

    /* renamed from: androidx.preference.PreferenceFragment$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        final /* synthetic */ PreferenceFragment this$0;

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = this.this$0.mList;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i);
        this.mStyledContext = contextThemeWrapper;
        PreferenceManager preferenceManager = new PreferenceManager(contextThemeWrapper);
        this.mPreferenceManager = preferenceManager;
        preferenceManager.setOnNavigateToScreenListener(this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = this.mStyledContext;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.PreferenceFragment, TypedArrayUtils.getAttr(context, R.attr.preferenceFragmentStyle, android.R.attr.preferenceFragmentStyle), 0);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(R.styleable.PreferenceFragment_android_layout, this.mLayoutResId);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.PreferenceFragment_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PreferenceFragment_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.PreferenceFragment_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.mStyledContext);
        View inflate = cloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        RecyclerView onCreateRecyclerView = onCreateRecyclerView(cloneInContext, viewGroup2, bundle);
        if (onCreateRecyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.mList = onCreateRecyclerView;
        onCreateRecyclerView.addItemDecoration(this.mDividerDecoration);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.mDividerDecoration.setAllowDividerAfterLastItem(z);
        if (this.mList.getParent() == null) {
            viewGroup2.addView(this.mList);
        }
        this.mHandler.post(this.mRequestFocus);
        return inflate;
    }

    public void setDivider(Drawable drawable) {
        this.mDividerDecoration.setDivider(drawable);
    }

    public void setDividerHeight(int i) {
        this.mDividerDecoration.setDividerHeight(i);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.restoreHierarchyState(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.mPreferenceManager.setOnPreferenceTreeClickListener(this);
        this.mPreferenceManager.setOnDisplayPreferenceDialogListener(this);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.mPreferenceManager.setOnPreferenceTreeClickListener(null);
        this.mPreferenceManager.setOnDisplayPreferenceDialogListener(null);
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.getPreferenceScreen();
    }

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    public boolean onPreferenceTreeClick(Preference preference) {
        if (preference.getFragment() == null) {
            return false;
        }
        boolean onPreferenceStartFragment = getCallbackFragment() instanceof OnPreferenceStartFragmentCallback ? ((OnPreferenceStartFragmentCallback) getCallbackFragment()).onPreferenceStartFragment(this, preference) : false;
        return (onPreferenceStartFragment || !(getActivity() instanceof OnPreferenceStartFragmentCallback)) ? onPreferenceStartFragment : ((OnPreferenceStartFragmentCallback) getActivity()).onPreferenceStartFragment(this, preference);
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        if ((getCallbackFragment() instanceof OnPreferenceStartScreenCallback ? ((OnPreferenceStartScreenCallback) getCallbackFragment()).onPreferenceStartScreen(this, preferenceScreen) : false) || !(getActivity() instanceof OnPreferenceStartScreenCallback)) {
            return;
        }
        ((OnPreferenceStartScreenCallback) getActivity()).onPreferenceStartScreen(this, preferenceScreen);
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    public Preference findPreference(CharSequence charSequence) {
        PreferenceManager preferenceManager = this.mPreferenceManager;
        if (preferenceManager == null) {
            return null;
        }
        return preferenceManager.findPreference(charSequence);
    }

    void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.onAttached();
        }
        onBindPreferences();
    }

    private void unbindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.onDetached();
        }
        onUnbindPreferences();
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (this.mStyledContext.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new PreferenceRecyclerViewAccessibilityDelegate(recyclerView2));
        return recyclerView2;
    }

    public RecyclerView.LayoutManager onCreateLayoutManager() {
        return new LinearLayoutManager(getActivity());
    }

    protected RecyclerView.Adapter onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new PreferenceGroupAdapter(preferenceScreen);
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    public void onDisplayPreferenceDialog(Preference preference) {
        DialogFragment newInstance;
        boolean onPreferenceDisplayDialog = getCallbackFragment() instanceof OnPreferenceDisplayDialogCallback ? ((OnPreferenceDisplayDialogCallback) getCallbackFragment()).onPreferenceDisplayDialog(this, preference) : false;
        if (!onPreferenceDisplayDialog && (getActivity() instanceof OnPreferenceDisplayDialogCallback)) {
            onPreferenceDisplayDialog = ((OnPreferenceDisplayDialogCallback) getActivity()).onPreferenceDisplayDialog(this, preference);
        }
        if (!onPreferenceDisplayDialog && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                newInstance = EditTextPreferenceDialogFragment.newInstance(preference.getKey());
            } else if (preference instanceof ListPreference) {
                newInstance = ListPreferenceDialogFragment.newInstance(preference.getKey());
            } else if (preference instanceof MultiSelectListPreference) {
                newInstance = MultiSelectListPreferenceDialogFragment.newInstance(preference.getKey());
            } else {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            newInstance.setTargetFragment(this, 0);
            newInstance.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* renamed from: androidx.preference.PreferenceFragment$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        final /* synthetic */ PreferenceFragment this$0;
        final /* synthetic */ String val$key;
        final /* synthetic */ Preference val$preference;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            int preferenceAdapterPosition;
            RecyclerView.Adapter adapter = this.this$0.mList.getAdapter();
            if (!(adapter instanceof PreferenceGroup.PreferencePositionCallback)) {
                if (adapter != 0) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.val$preference;
            if (preference != null) {
                preferenceAdapterPosition = ((PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(preference);
            } else {
                preferenceAdapterPosition = ((PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(this.val$key);
            }
            if (preferenceAdapterPosition != -1) {
                this.this$0.mList.scrollToPosition(preferenceAdapterPosition);
            } else {
                adapter.registerAdapterDataObserver(new ScrollToPreferenceObserver(adapter, this.this$0.mList, this.val$preference, this.val$key));
            }
        }
    }

    private static class ScrollToPreferenceObserver extends RecyclerView.AdapterDataObserver {
        private final RecyclerView.Adapter mAdapter;
        private final String mKey;
        private final RecyclerView mList;
        private final Preference mPreference;

        ScrollToPreferenceObserver(RecyclerView.Adapter adapter, RecyclerView recyclerView, Preference preference, String str) {
            this.mAdapter = adapter;
            this.mList = recyclerView;
            this.mPreference = preference;
            this.mKey = str;
        }

        private void scrollToPreference() {
            int preferenceAdapterPosition;
            this.mAdapter.unregisterAdapterDataObserver(this);
            Preference preference = this.mPreference;
            if (preference != null) {
                preferenceAdapterPosition = ((PreferenceGroup.PreferencePositionCallback) this.mAdapter).getPreferenceAdapterPosition(preference);
            } else {
                preferenceAdapterPosition = ((PreferenceGroup.PreferencePositionCallback) this.mAdapter).getPreferenceAdapterPosition(this.mKey);
            }
            if (preferenceAdapterPosition != -1) {
                this.mList.scrollToPosition(preferenceAdapterPosition);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            scrollToPreference();
        }
    }

    private class DividerDecoration extends RecyclerView.ItemDecoration {
        private boolean mAllowDividerAfterLastItem;
        private Drawable mDivider;
        private int mDividerHeight;
        final /* synthetic */ PreferenceFragment this$0;

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if (this.mDivider == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (shouldDrawDividerBelow(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.mDivider.setBounds(0, y, width, this.mDividerHeight + y);
                    this.mDivider.draw(canvas);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (shouldDrawDividerBelow(view, recyclerView)) {
                rect.bottom = this.mDividerHeight;
            }
        }

        private boolean shouldDrawDividerBelow(View view, RecyclerView recyclerView) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = false;
            if (!(childViewHolder instanceof PreferenceViewHolder) || !((PreferenceViewHolder) childViewHolder).isDividerAllowedBelow()) {
                return false;
            }
            boolean z2 = this.mAllowDividerAfterLastItem;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
            if ((childViewHolder2 instanceof PreferenceViewHolder) && ((PreferenceViewHolder) childViewHolder2).isDividerAllowedAbove()) {
                z = true;
            }
            return z;
        }

        public void setDivider(Drawable drawable) {
            if (drawable != null) {
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerHeight = 0;
            }
            this.mDivider = drawable;
            this.this$0.mList.invalidateItemDecorations();
        }

        public void setDividerHeight(int i) {
            this.mDividerHeight = i;
            this.this$0.mList.invalidateItemDecorations();
        }

        public void setAllowDividerAfterLastItem(boolean z) {
            this.mAllowDividerAfterLastItem = z;
        }
    }
}
