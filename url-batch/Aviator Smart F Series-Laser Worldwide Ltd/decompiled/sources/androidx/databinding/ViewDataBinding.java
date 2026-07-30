package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.Observable;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableMap;
import androidx.databinding.library.R;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewbinding.ViewBinding;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ViewDataBinding extends BaseObservable implements ViewBinding {
    private static final int BINDING_NUMBER_START = 8;
    public static final String BINDING_TAG_PREFIX = "binding_";
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final int REBOUND = 3;
    protected final DataBindingComponent mBindingComponent;
    private Choreographer mChoreographer;
    private ViewDataBinding mContainingBinding;
    private final Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private LifecycleOwner mLifecycleOwner;
    private WeakListener[] mLocalFieldObservers;
    private OnStartListener mOnStartListener;
    private boolean mPendingRebind;
    private CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> mRebindCallbacks;
    private boolean mRebindHalted;
    private final Runnable mRebindRunnable;
    private final View mRoot;
    private Handler mUIThreadHandler;
    static int SDK_INT = Build.VERSION.SDK_INT;
    private static final boolean USE_CHOREOGRAPHER = true;
    private static final CreateWeakListener CREATE_PROPERTY_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.1
        @Override // androidx.databinding.ViewDataBinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i8) {
            return new WeakPropertyListener(viewDataBinding, i8).getListener();
        }
    };
    private static final CreateWeakListener CREATE_LIST_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.2
        @Override // androidx.databinding.ViewDataBinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i8) {
            return new WeakListListener(viewDataBinding, i8).getListener();
        }
    };
    private static final CreateWeakListener CREATE_MAP_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.3
        @Override // androidx.databinding.ViewDataBinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i8) {
            return new WeakMapListener(viewDataBinding, i8).getListener();
        }
    };
    private static final CreateWeakListener CREATE_LIVE_DATA_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.4
        @Override // androidx.databinding.ViewDataBinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i8) {
            return new LiveDataListener(viewDataBinding, i8).getListener();
        }
    };
    private static final CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void> REBIND_NOTIFIER = new CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void>() { // from class: androidx.databinding.ViewDataBinding.5
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public void onNotifyCallback(OnRebindCallback onRebindCallback, ViewDataBinding viewDataBinding, int i8, Void r42) {
            if (i8 == 1) {
                if (onRebindCallback.onPreBind(viewDataBinding)) {
                    return;
                }
                viewDataBinding.mRebindHalted = true;
            } else if (i8 == 2) {
                onRebindCallback.onCanceled(viewDataBinding);
            } else {
                if (i8 != 3) {
                    return;
                }
                onRebindCallback.onBound(viewDataBinding);
            }
        }
    };
    private static final ReferenceQueue<ViewDataBinding> sReferenceQueue = new ReferenceQueue<>();
    private static final View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER = new View.OnAttachStateChangeListener() { // from class: androidx.databinding.ViewDataBinding.6
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.getBinding(view).mRebindRunnable.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    };

    private interface CreateWeakListener {
        WeakListener create(ViewDataBinding viewDataBinding, int i8);
    }

    protected static class IncludedLayouts {
        public final int[][] indexes;
        public final int[][] layoutIds;
        public final String[][] layouts;

        public IncludedLayouts(int i8) {
            this.layouts = new String[i8][];
            this.indexes = new int[i8][];
            this.layoutIds = new int[i8][];
        }

        public void setIncludes(int i8, String[] strArr, int[] iArr, int[] iArr2) {
            this.layouts[i8] = strArr;
            this.indexes[i8] = iArr;
            this.layoutIds[i8] = iArr2;
        }
    }

    private static class LiveDataListener implements Observer, ObservableReference<LiveData<?>> {
        LifecycleOwner mLifecycleOwner;
        final WeakListener<LiveData<?>> mListener;

        public LiveDataListener(ViewDataBinding viewDataBinding, int i8) {
            this.mListener = new WeakListener<>(viewDataBinding, i8, this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public WeakListener<LiveData<?>> getListener() {
            return this.mListener;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable Object obj) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null) {
                WeakListener<LiveData<?>> weakListener = this.mListener;
                binder.handleFieldChange(weakListener.mLocalFieldId, weakListener.getTarget(), 0);
            }
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            LiveData<?> target = this.mListener.getTarget();
            if (target != null) {
                if (this.mLifecycleOwner != null) {
                    target.removeObserver(this);
                }
                if (lifecycleOwner != null) {
                    target.observe(lifecycleOwner, this);
                }
            }
            this.mLifecycleOwner = lifecycleOwner;
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void addListener(LiveData<?> liveData) {
            LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            if (lifecycleOwner != null) {
                liveData.observe(lifecycleOwner, this);
            }
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void removeListener(LiveData<?> liveData) {
            liveData.removeObserver(this);
        }
    }

    private interface ObservableReference<T> {
        void addListener(T t7);

        WeakListener<T> getListener();

        void removeListener(T t7);

        void setLifecycleOwner(LifecycleOwner lifecycleOwner);
    }

    static class OnStartListener implements LifecycleObserver {
        final WeakReference<ViewDataBinding> mBinding;

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.mBinding.get();
            if (viewDataBinding != null) {
                viewDataBinding.executePendingBindings();
            }
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.mBinding = new WeakReference<>(viewDataBinding);
        }
    }

    protected static abstract class PropertyChangedInverseListener extends Observable.OnPropertyChangedCallback implements InverseBindingListener {
        final int mPropertyId;

        public PropertyChangedInverseListener(int i8) {
            this.mPropertyId = i8;
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i8) {
            if (i8 == this.mPropertyId || i8 == 0) {
                onChange();
            }
        }
    }

    private static class WeakListListener extends ObservableList.OnListChangedCallback implements ObservableReference<ObservableList> {
        final WeakListener<ObservableList> mListener;

        public WeakListListener(ViewDataBinding viewDataBinding, int i8) {
            this.mListener = new WeakListener<>(viewDataBinding, i8, this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public WeakListener<ObservableList> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onChanged(ObservableList observableList) {
            ObservableList target;
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && (target = this.mListener.getTarget()) == observableList) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, target, 0);
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeChanged(ObservableList observableList, int i8, int i9) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeInserted(ObservableList observableList, int i8, int i9) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeMoved(ObservableList observableList, int i8, int i9, int i10) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeRemoved(ObservableList observableList, int i8, int i9) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void addListener(ObservableList observableList) {
            observableList.addOnListChangedCallback(this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void removeListener(ObservableList observableList) {
            observableList.removeOnListChangedCallback(this);
        }
    }

    private static class WeakListener<T> extends WeakReference<ViewDataBinding> {
        protected final int mLocalFieldId;
        private final ObservableReference<T> mObservable;
        private T mTarget;

        public WeakListener(ViewDataBinding viewDataBinding, int i8, ObservableReference<T> observableReference) {
            super(viewDataBinding, ViewDataBinding.sReferenceQueue);
            this.mLocalFieldId = i8;
            this.mObservable = observableReference;
        }

        protected ViewDataBinding getBinder() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) get();
            if (viewDataBinding == null) {
                unregister();
            }
            return viewDataBinding;
        }

        public T getTarget() {
            return this.mTarget;
        }

        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            this.mObservable.setLifecycleOwner(lifecycleOwner);
        }

        public void setTarget(T t7) {
            unregister();
            this.mTarget = t7;
            if (t7 != null) {
                this.mObservable.addListener(t7);
            }
        }

        public boolean unregister() {
            boolean z7;
            T t7 = this.mTarget;
            if (t7 != null) {
                this.mObservable.removeListener(t7);
                z7 = true;
            } else {
                z7 = false;
            }
            this.mTarget = null;
            return z7;
        }
    }

    private static class WeakMapListener extends ObservableMap.OnMapChangedCallback implements ObservableReference<ObservableMap> {
        final WeakListener<ObservableMap> mListener;

        public WeakMapListener(ViewDataBinding viewDataBinding, int i8) {
            this.mListener = new WeakListener<>(viewDataBinding, i8, this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public WeakListener<ObservableMap> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ObservableMap.OnMapChangedCallback
        public void onMapChanged(ObservableMap observableMap, Object obj) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder == null || observableMap != this.mListener.getTarget()) {
                return;
            }
            binder.handleFieldChange(this.mListener.mLocalFieldId, observableMap, 0);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void addListener(ObservableMap observableMap) {
            observableMap.addOnMapChangedCallback(this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void removeListener(ObservableMap observableMap) {
            observableMap.removeOnMapChangedCallback(this);
        }
    }

    private static class WeakPropertyListener extends Observable.OnPropertyChangedCallback implements ObservableReference<Observable> {
        final WeakListener<Observable> mListener;

        public WeakPropertyListener(ViewDataBinding viewDataBinding, int i8) {
            this.mListener = new WeakListener<>(viewDataBinding, i8, this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public WeakListener<Observable> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i8) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && this.mListener.getTarget() == observable) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, observable, i8);
            }
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void addListener(Observable observable) {
            observable.addOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void removeListener(Observable observable) {
            observable.removeOnPropertyChangedCallback(this);
        }
    }

    protected ViewDataBinding(DataBindingComponent dataBindingComponent, View view, int i8) {
        this.mRebindRunnable = new Runnable() { // from class: androidx.databinding.ViewDataBinding.7
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    ViewDataBinding.this.mPendingRebind = false;
                }
                ViewDataBinding.processReferenceQueue();
                if (ViewDataBinding.this.mRoot.isAttachedToWindow()) {
                    ViewDataBinding.this.executePendingBindings();
                } else {
                    ViewDataBinding.this.mRoot.removeOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                    ViewDataBinding.this.mRoot.addOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                }
            }
        };
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mBindingComponent = dataBindingComponent;
        this.mLocalFieldObservers = new WeakListener[i8];
        this.mRoot = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (USE_CHOREOGRAPHER) {
            this.mChoreographer = Choreographer.getInstance();
            this.mFrameCallback = new Choreographer.FrameCallback() { // from class: androidx.databinding.ViewDataBinding.8
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j8) {
                    ViewDataBinding.this.mRebindRunnable.run();
                }
            };
        } else {
            this.mFrameCallback = null;
            this.mUIThreadHandler = new Handler(Looper.myLooper());
        }
    }

    protected static ViewDataBinding bind(Object obj, View view, int i8) {
        return DataBindingUtil.bind(checkAndCastToBindingComponent(obj), view, i8);
    }

    private static DataBindingComponent checkAndCastToBindingComponent(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void executeBindingsInternal() {
        if (this.mIsExecutingPendingBindings) {
            requestRebind();
            return;
        }
        if (hasPendingBindings()) {
            this.mIsExecutingPendingBindings = true;
            this.mRebindHalted = false;
            CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry = this.mRebindCallbacks;
            if (callbackRegistry != null) {
                callbackRegistry.notifyCallbacks(this, 1, null);
                if (this.mRebindHalted) {
                    this.mRebindCallbacks.notifyCallbacks(this, 2, null);
                }
            }
            if (!this.mRebindHalted) {
                executeBindings();
                CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry2 = this.mRebindCallbacks;
                if (callbackRegistry2 != null) {
                    callbackRegistry2.notifyCallbacks(this, 3, null);
                }
            }
            this.mIsExecutingPendingBindings = false;
        }
    }

    protected static void executeBindingsOn(ViewDataBinding viewDataBinding) {
        viewDataBinding.executeBindingsInternal();
    }

    private static int findIncludeIndex(String str, int i8, IncludedLayouts includedLayouts, int i9) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = includedLayouts.layouts[i9];
        int length = strArr.length;
        while (i8 < length) {
            if (TextUtils.equals(subSequence, strArr[i8])) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    private static int findLastMatching(ViewGroup viewGroup, int i8) {
        String str = (String) viewGroup.getChildAt(i8).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i9 = i8 + 1; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i8;
                }
                if (isNumeric(str2, length)) {
                    i8 = i9;
                }
            }
        }
        return i8;
    }

    static ViewDataBinding getBinding(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    public static int getBuildSdkInt() {
        return SDK_INT;
    }

    protected static int getColorFromResource(View view, int i8) {
        int color;
        if (Build.VERSION.SDK_INT < 23) {
            return view.getResources().getColor(i8);
        }
        color = view.getContext().getColor(i8);
        return color;
    }

    protected static ColorStateList getColorStateListFromResource(View view, int i8) {
        ColorStateList colorStateList;
        if (Build.VERSION.SDK_INT < 23) {
            return view.getResources().getColorStateList(i8);
        }
        colorStateList = view.getContext().getColorStateList(i8);
        return colorStateList;
    }

    protected static Drawable getDrawableFromResource(View view, int i8) {
        return view.getContext().getDrawable(i8);
    }

    protected static <K, T> T getFrom(Map<K, T> map, K k8) {
        if (map == null) {
            return null;
        }
        return map.get(k8);
    }

    protected static <T> T getFromArray(T[] tArr, int i8) {
        if (tArr == null || i8 < 0 || i8 >= tArr.length) {
            return null;
        }
        return tArr[i8];
    }

    protected static <T> T getFromList(List<T> list, int i8) {
        if (list == null || i8 < 0 || i8 >= list.size()) {
            return null;
        }
        return list.get(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFieldChange(int i8, Object obj, int i9) {
        if (!this.mInLiveDataRegisterObserver && onFieldChange(i8, obj, i9)) {
            requestRebind();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected static <T extends ViewDataBinding> T inflateInternal(@NonNull LayoutInflater layoutInflater, int i8, @Nullable ViewGroup viewGroup, boolean z7, @Nullable Object obj) {
        return (T) DataBindingUtil.inflate(layoutInflater, i8, viewGroup, z7, checkAndCastToBindingComponent(obj));
    }

    private static boolean isNumeric(String str, int i8) {
        int length = str.length();
        if (length == i8) {
            return false;
        }
        while (i8 < length) {
            if (!Character.isDigit(str.charAt(i8))) {
                return false;
            }
            i8++;
        }
        return true;
    }

    protected static Object[] mapBindings(DataBindingComponent dataBindingComponent, View view, int i8, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i8];
        mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        return objArr;
    }

    protected static boolean parse(String str, boolean z7) {
        return str == null ? z7 : Boolean.parseBoolean(str);
    }

    private static int parseTagInt(String str, int i8) {
        int i9 = 0;
        while (i8 < str.length()) {
            i9 = (i9 * 10) + (str.charAt(i8) - '0');
            i8++;
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processReferenceQueue() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = sReferenceQueue.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof WeakListener) {
                ((WeakListener) poll).unregister();
            }
        }
    }

    protected static int safeUnbox(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    protected static void setBindingInverseListener(ViewDataBinding viewDataBinding, InverseBindingListener inverseBindingListener, PropertyChangedInverseListener propertyChangedInverseListener) {
        if (inverseBindingListener != propertyChangedInverseListener) {
            if (inverseBindingListener != null) {
                viewDataBinding.removeOnPropertyChangedCallback((PropertyChangedInverseListener) inverseBindingListener);
            }
            if (propertyChangedInverseListener != null) {
                viewDataBinding.addOnPropertyChangedCallback(propertyChangedInverseListener);
            }
        }
    }

    protected static <T> void setTo(T[] tArr, int i8, T t7) {
        if (tArr == null || i8 < 0 || i8 >= tArr.length) {
            return;
        }
        tArr[i8] = t7;
    }

    private boolean updateRegistration(int i8, Object obj, CreateWeakListener createWeakListener) {
        if (obj == null) {
            return unregisterFrom(i8);
        }
        WeakListener weakListener = this.mLocalFieldObservers[i8];
        if (weakListener == null) {
            registerTo(i8, obj, createWeakListener);
            return true;
        }
        if (weakListener.getTarget() == obj) {
            return false;
        }
        unregisterFrom(i8);
        registerTo(i8, obj, createWeakListener);
        return true;
    }

    public void addOnRebindCallback(@NonNull OnRebindCallback onRebindCallback) {
        if (this.mRebindCallbacks == null) {
            this.mRebindCallbacks = new CallbackRegistry<>(REBIND_NOTIFIER);
        }
        this.mRebindCallbacks.add(onRebindCallback);
    }

    protected void ensureBindingComponentIsNotNull(Class<?> cls) {
        if (this.mBindingComponent != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    protected abstract void executeBindings();

    public void executePendingBindings() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding == null) {
            executeBindingsInternal();
        } else {
            viewDataBinding.executePendingBindings();
        }
    }

    void forceExecuteBindings() {
        executeBindings();
    }

    @Nullable
    public LifecycleOwner getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    protected Object getObservedField(int i8) {
        WeakListener weakListener = this.mLocalFieldObservers[i8];
        if (weakListener == null) {
            return null;
        }
        return weakListener.getTarget();
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.mRoot;
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    protected abstract boolean onFieldChange(int i8, Object obj, int i9);

    protected void registerTo(int i8, Object obj, CreateWeakListener createWeakListener) {
        if (obj == null) {
            return;
        }
        WeakListener weakListener = this.mLocalFieldObservers[i8];
        if (weakListener == null) {
            weakListener = createWeakListener.create(this, i8);
            this.mLocalFieldObservers[i8] = weakListener;
            LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            if (lifecycleOwner != null) {
                weakListener.setLifecycleOwner(lifecycleOwner);
            }
        }
        weakListener.setTarget(obj);
    }

    public void removeOnRebindCallback(@NonNull OnRebindCallback onRebindCallback) {
        CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry = this.mRebindCallbacks;
        if (callbackRegistry != null) {
            callbackRegistry.remove(onRebindCallback);
        }
    }

    protected void requestRebind() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding != null) {
            viewDataBinding.requestRebind();
            return;
        }
        LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            synchronized (this) {
                try {
                    if (this.mPendingRebind) {
                        return;
                    }
                    this.mPendingRebind = true;
                    if (USE_CHOREOGRAPHER) {
                        this.mChoreographer.postFrameCallback(this.mFrameCallback);
                    } else {
                        this.mUIThreadHandler.post(this.mRebindRunnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected void setContainedBinding(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.mContainingBinding = this;
        }
    }

    @MainThread
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        LifecycleOwner lifecycleOwner2 = this.mLifecycleOwner;
        if (lifecycleOwner2 == lifecycleOwner) {
            return;
        }
        if (lifecycleOwner2 != null) {
            lifecycleOwner2.getLifecycle().removeObserver(this.mOnStartListener);
        }
        this.mLifecycleOwner = lifecycleOwner;
        if (lifecycleOwner != null) {
            if (this.mOnStartListener == null) {
                this.mOnStartListener = new OnStartListener();
            }
            lifecycleOwner.getLifecycle().addObserver(this.mOnStartListener);
        }
        for (WeakListener weakListener : this.mLocalFieldObservers) {
            if (weakListener != null) {
                weakListener.setLifecycleOwner(lifecycleOwner);
            }
        }
    }

    protected void setRootTag(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public abstract boolean setVariable(int i8, @Nullable Object obj);

    public void unbind() {
        for (WeakListener weakListener : this.mLocalFieldObservers) {
            if (weakListener != null) {
                weakListener.unregister();
            }
        }
    }

    protected boolean unregisterFrom(int i8) {
        WeakListener weakListener = this.mLocalFieldObservers[i8];
        if (weakListener != null) {
            return weakListener.unregister();
        }
        return false;
    }

    protected boolean updateLiveDataRegistration(int i8, LiveData<?> liveData) {
        this.mInLiveDataRegisterObserver = true;
        try {
            return updateRegistration(i8, liveData, CREATE_LIVE_DATA_LISTENER);
        } finally {
            this.mInLiveDataRegisterObserver = false;
        }
    }

    protected static byte parse(String str, byte b8) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b8;
        }
    }

    protected static long safeUnbox(Long l8) {
        if (l8 == null) {
            return 0L;
        }
        return l8.longValue();
    }

    protected void setRootTag(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(R.id.dataBinding, this);
        }
    }

    protected static boolean getFromArray(boolean[] zArr, int i8) {
        if (zArr == null || i8 < 0 || i8 >= zArr.length) {
            return false;
        }
        return zArr[i8];
    }

    protected static <T> T getFromList(SparseArray<T> sparseArray, int i8) {
        if (sparseArray == null || i8 < 0) {
            return null;
        }
        return sparseArray.get(i8);
    }

    protected static Object[] mapBindings(DataBindingComponent dataBindingComponent, View[] viewArr, int i8, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i8];
        for (View view : viewArr) {
            mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        }
        return objArr;
    }

    protected static short parse(String str, short s7) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s7;
        }
    }

    protected static short safeUnbox(Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    protected static void setTo(boolean[] zArr, int i8, boolean z7) {
        if (zArr == null || i8 < 0 || i8 >= zArr.length) {
            return;
        }
        zArr[i8] = z7;
    }

    @TargetApi(16)
    protected static <T> T getFromList(LongSparseArray<T> longSparseArray, int i8) {
        if (longSparseArray == null || i8 < 0) {
            return null;
        }
        return longSparseArray.get(i8);
    }

    protected static int parse(String str, int i8) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i8;
        }
    }

    protected static byte safeUnbox(Byte b8) {
        if (b8 == null) {
            return (byte) 0;
        }
        return b8.byteValue();
    }

    protected static byte getFromArray(byte[] bArr, int i8) {
        if (bArr == null || i8 < 0 || i8 >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i8];
    }

    protected static <T> T getFromList(androidx.collection.LongSparseArray<T> longSparseArray, int i8) {
        if (longSparseArray == null || i8 < 0) {
            return null;
        }
        return longSparseArray.get(i8);
    }

    protected static long parse(String str, long j8) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j8;
        }
    }

    protected static char safeUnbox(Character ch) {
        if (ch == null) {
            return (char) 0;
        }
        return ch.charValue();
    }

    protected static void setTo(byte[] bArr, int i8, byte b8) {
        if (bArr == null || i8 < 0 || i8 >= bArr.length) {
            return;
        }
        bArr[i8] = b8;
    }

    protected static boolean getFromList(SparseBooleanArray sparseBooleanArray, int i8) {
        if (sparseBooleanArray == null || i8 < 0) {
            return false;
        }
        return sparseBooleanArray.get(i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void mapBindings(DataBindingComponent dataBindingComponent, View view, Object[] objArr, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray, boolean z7) {
        boolean z8;
        int i8;
        int i9;
        int i10;
        boolean z9;
        int findIncludeIndex;
        int id;
        int i11;
        int i12;
        if (getBinding(view) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (z7 && str != null && str.startsWith(TtmlNode.TAG_LAYOUT)) {
            int lastIndexOf = str.lastIndexOf(95);
            if (lastIndexOf > 0) {
                int i13 = lastIndexOf + 1;
                if (isNumeric(str, i13)) {
                    i12 = parseTagInt(str, i13);
                    if (objArr[i12] == null) {
                        objArr[i12] = view;
                    }
                    if (includedLayouts == null) {
                        i12 = -1;
                    }
                    z8 = true;
                    i8 = i12;
                }
            }
            i12 = -1;
            z8 = false;
            i8 = i12;
        } else if (str == null || !str.startsWith(BINDING_TAG_PREFIX)) {
            z8 = false;
            i8 = -1;
        } else {
            int parseTagInt = parseTagInt(str, BINDING_NUMBER_START);
            if (objArr[parseTagInt] == null) {
                objArr[parseTagInt] = view;
            }
            if (includedLayouts == null) {
                parseTagInt = -1;
            }
            i8 = parseTagInt;
            z8 = true;
        }
        if (!z8 && (id = view.getId()) > 0 && sparseIntArray != null && (i11 = sparseIntArray.get(id, -1)) >= 0 && objArr[i11] == null) {
            objArr[i11] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i14 = 0;
            int i15 = 0;
            while (i14 < childCount) {
                View childAt = viewGroup.getChildAt(i14);
                if (i8 >= 0 && (childAt.getTag() instanceof String)) {
                    String str2 = (String) childAt.getTag();
                    if (str2.endsWith("_0") && str2.startsWith(TtmlNode.TAG_LAYOUT) && str2.indexOf(47) > 0 && (findIncludeIndex = findIncludeIndex(str2, i15, includedLayouts, i8)) >= 0) {
                        int i16 = findIncludeIndex + 1;
                        int i17 = includedLayouts.indexes[i8][findIncludeIndex];
                        int i18 = includedLayouts.layoutIds[i8][findIncludeIndex];
                        int findLastMatching = findLastMatching(viewGroup, i14);
                        if (findLastMatching == i14) {
                            objArr[i17] = DataBindingUtil.bind(dataBindingComponent, childAt, i18);
                            i9 = i14;
                            i10 = i16;
                        } else {
                            int i19 = findLastMatching - i14;
                            int i20 = i19 + 1;
                            View[] viewArr = new View[i20];
                            int i21 = 0;
                            while (i21 < i20) {
                                viewArr[i21] = viewGroup.getChildAt(i14 + i21);
                                i21++;
                                i16 = i16;
                            }
                            objArr[i17] = DataBindingUtil.bind(dataBindingComponent, viewArr, i18);
                            i10 = i16;
                            i9 = i14 + i19;
                        }
                        z9 = true;
                        if (z9) {
                            mapBindings(dataBindingComponent, childAt, objArr, includedLayouts, sparseIntArray, false);
                        }
                        i14 = i9 + 1;
                        i15 = i10;
                    }
                }
                i9 = i14;
                i10 = i15;
                z9 = false;
                if (z9) {
                }
                i14 = i9 + 1;
                i15 = i10;
            }
        }
    }

    protected static float parse(String str, float f8) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f8;
        }
    }

    protected static double safeUnbox(Double d8) {
        return d8 == null ? i.DOUBLE_EPSILON : d8.doubleValue();
    }

    protected static short getFromArray(short[] sArr, int i8) {
        if (sArr == null || i8 < 0 || i8 >= sArr.length) {
            return (short) 0;
        }
        return sArr[i8];
    }

    protected static int getFromList(SparseIntArray sparseIntArray, int i8) {
        if (sparseIntArray == null || i8 < 0) {
            return 0;
        }
        return sparseIntArray.get(i8);
    }

    protected static double parse(String str, double d8) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d8;
        }
    }

    protected static float safeUnbox(Float f8) {
        if (f8 == null) {
            return 0.0f;
        }
        return f8.floatValue();
    }

    protected static void setTo(short[] sArr, int i8, short s7) {
        if (sArr == null || i8 < 0 || i8 >= sArr.length) {
            return;
        }
        sArr[i8] = s7;
    }

    protected boolean updateRegistration(int i8, Observable observable) {
        return updateRegistration(i8, observable, CREATE_PROPERTY_LISTENER);
    }

    @TargetApi(18)
    protected static long getFromList(SparseLongArray sparseLongArray, int i8) {
        if (sparseLongArray == null || i8 < 0) {
            return 0L;
        }
        return sparseLongArray.get(i8);
    }

    protected static char parse(String str, char c8) {
        return (str == null || str.isEmpty()) ? c8 : str.charAt(0);
    }

    protected static boolean safeUnbox(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected boolean updateRegistration(int i8, ObservableList observableList) {
        return updateRegistration(i8, observableList, CREATE_LIST_LISTENER);
    }

    protected ViewDataBinding(Object obj, View view, int i8) {
        this(checkAndCastToBindingComponent(obj), view, i8);
    }

    protected static char getFromArray(char[] cArr, int i8) {
        if (cArr == null || i8 < 0 || i8 >= cArr.length) {
            return (char) 0;
        }
        return cArr[i8];
    }

    protected static void setTo(char[] cArr, int i8, char c8) {
        if (cArr == null || i8 < 0 || i8 >= cArr.length) {
            return;
        }
        cArr[i8] = c8;
    }

    protected boolean updateRegistration(int i8, ObservableMap observableMap) {
        return updateRegistration(i8, observableMap, CREATE_MAP_LISTENER);
    }

    protected static int getFromArray(int[] iArr, int i8) {
        if (iArr == null || i8 < 0 || i8 >= iArr.length) {
            return 0;
        }
        return iArr[i8];
    }

    protected static void setTo(int[] iArr, int i8, int i9) {
        if (iArr == null || i8 < 0 || i8 >= iArr.length) {
            return;
        }
        iArr[i8] = i9;
    }

    protected static long getFromArray(long[] jArr, int i8) {
        if (jArr == null || i8 < 0 || i8 >= jArr.length) {
            return 0L;
        }
        return jArr[i8];
    }

    protected static void setTo(long[] jArr, int i8, long j8) {
        if (jArr == null || i8 < 0 || i8 >= jArr.length) {
            return;
        }
        jArr[i8] = j8;
    }

    protected static float getFromArray(float[] fArr, int i8) {
        if (fArr == null || i8 < 0 || i8 >= fArr.length) {
            return 0.0f;
        }
        return fArr[i8];
    }

    protected static void setTo(float[] fArr, int i8, float f8) {
        if (fArr == null || i8 < 0 || i8 >= fArr.length) {
            return;
        }
        fArr[i8] = f8;
    }

    protected static double getFromArray(double[] dArr, int i8) {
        return (dArr == null || i8 < 0 || i8 >= dArr.length) ? i.DOUBLE_EPSILON : dArr[i8];
    }

    protected static void setTo(double[] dArr, int i8, double d8) {
        if (dArr == null || i8 < 0 || i8 >= dArr.length) {
            return;
        }
        dArr[i8] = d8;
    }

    protected static <T> void setTo(List<T> list, int i8, T t7) {
        if (list == null || i8 < 0 || i8 >= list.size()) {
            return;
        }
        list.set(i8, t7);
    }

    protected static <T> void setTo(SparseArray<T> sparseArray, int i8, T t7) {
        if (sparseArray == null || i8 < 0 || i8 >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i8, t7);
    }

    @TargetApi(16)
    protected static <T> void setTo(LongSparseArray<T> longSparseArray, int i8, T t7) {
        if (longSparseArray == null || i8 < 0 || i8 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i8, t7);
    }

    protected static <T> void setTo(androidx.collection.LongSparseArray<T> longSparseArray, int i8, T t7) {
        if (longSparseArray == null || i8 < 0 || i8 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i8, t7);
    }

    protected static void setTo(SparseBooleanArray sparseBooleanArray, int i8, boolean z7) {
        if (sparseBooleanArray == null || i8 < 0 || i8 >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i8, z7);
    }

    protected static void setTo(SparseIntArray sparseIntArray, int i8, int i9) {
        if (sparseIntArray == null || i8 < 0 || i8 >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i8, i9);
    }

    @TargetApi(18)
    protected static void setTo(SparseLongArray sparseLongArray, int i8, long j8) {
        if (sparseLongArray == null || i8 < 0 || i8 >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i8, j8);
    }

    protected static <K, T> void setTo(Map<K, T> map, K k8, T t7) {
        if (map == null) {
            return;
        }
        map.put(k8, t7);
    }
}
