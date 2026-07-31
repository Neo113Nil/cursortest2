package androidx.databinding;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.c;
import androidx.databinding.h;
import androidx.databinding.j;
import androidx.databinding.k;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.AbstractC1358y;
import androidx.lifecycle.C;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC1353t;
import androidx.lifecycle.InterfaceC1354u;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class o extends androidx.databinding.a {
    private static final int BINDING_NUMBER_START = 8;
    public static final String BINDING_TAG_PREFIX = "binding_";
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final int REBOUND = 3;
    protected final DataBindingComponent mBindingComponent;
    private Choreographer mChoreographer;
    private o mContainingBinding;
    private final Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;
    protected boolean mInStateFlowRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private InterfaceC1354u mLifecycleOwner;
    private p[] mLocalFieldObservers;
    private k mOnStartListener;
    private boolean mPendingRebind;
    private androidx.databinding.c mRebindCallbacks;
    private boolean mRebindHalted;
    private final Runnable mRebindRunnable;
    private final View mRoot;
    private Handler mUIThreadHandler;
    static int SDK_INT = Build.VERSION.SDK_INT;
    private static final boolean USE_CHOREOGRAPHER = true;
    private static final androidx.databinding.d CREATE_PROPERTY_LISTENER = new a();
    private static final androidx.databinding.d CREATE_LIST_LISTENER = new b();
    private static final androidx.databinding.d CREATE_MAP_LISTENER = new c();
    private static final androidx.databinding.d CREATE_LIVE_DATA_LISTENER = new d();
    private static final c.a REBIND_NOTIFIER = new e();
    private static final ReferenceQueue<o> sReferenceQueue = new ReferenceQueue<>();
    private static final View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER = new f();

    class a implements androidx.databinding.d {
        a() {
        }

        @Override // androidx.databinding.d
        public p a(o oVar, int i4, ReferenceQueue referenceQueue) {
            return new C0102o(oVar, i4, referenceQueue).f();
        }
    }

    class b implements androidx.databinding.d {
        b() {
        }

        @Override // androidx.databinding.d
        public p a(o oVar, int i4, ReferenceQueue referenceQueue) {
            return new m(oVar, i4, referenceQueue).e();
        }
    }

    class c implements androidx.databinding.d {
        c() {
        }

        @Override // androidx.databinding.d
        public p a(o oVar, int i4, ReferenceQueue referenceQueue) {
            return new n(oVar, i4, referenceQueue).e();
        }
    }

    class d implements androidx.databinding.d {
        d() {
        }

        @Override // androidx.databinding.d
        public p a(o oVar, int i4, ReferenceQueue referenceQueue) {
            return new j(oVar, i4, referenceQueue).g();
        }
    }

    class e extends c.a {
        e() {
        }

        @Override // androidx.databinding.c.a
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, int i4, Object obj3) {
            android.support.v4.media.session.b.a(obj);
            b(null, (o) obj2, i4, (Void) obj3);
        }

        public void b(androidx.databinding.m mVar, o oVar, int i4, Void r4) {
            if (i4 == 1) {
                throw null;
            }
            if (i4 == 2) {
                throw null;
            }
            if (i4 == 3) {
                throw null;
            }
        }
    }

    class f implements View.OnAttachStateChangeListener {
        f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            o.getBinding(view).mRebindRunnable.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                o.this.mPendingRebind = false;
            }
            o.g();
            if (o.this.mRoot.isAttachedToWindow()) {
                o.this.executePendingBindings();
            } else {
                o.this.mRoot.removeOnAttachStateChangeListener(o.ROOT_REATTACHED_LISTENER);
                o.this.mRoot.addOnAttachStateChangeListener(o.ROOT_REATTACHED_LISTENER);
            }
        }
    }

    class h implements Choreographer.FrameCallback {
        h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j4) {
            o.this.mRebindRunnable.run();
        }
    }

    protected static class i {
    }

    private static class j implements C, androidx.databinding.l {

        /* renamed from: a, reason: collision with root package name */
        final p f12107a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference f12108b = null;

        public j(o oVar, int i4, ReferenceQueue referenceQueue) {
            this.f12107a = new p(oVar, i4, this, referenceQueue);
        }

        private InterfaceC1354u f() {
            WeakReference weakReference = this.f12108b;
            if (weakReference == null) {
                return null;
            }
            return (InterfaceC1354u) weakReference.get();
        }

        @Override // androidx.databinding.l
        public void a(InterfaceC1354u interfaceC1354u) {
            InterfaceC1354u f4 = f();
            AbstractC1358y abstractC1358y = (AbstractC1358y) this.f12107a.b();
            if (abstractC1358y != null) {
                if (f4 != null) {
                    abstractC1358y.n(this);
                }
                if (interfaceC1354u != null) {
                    abstractC1358y.i(interfaceC1354u, this);
                }
            }
            if (interfaceC1354u != null) {
                this.f12108b = new WeakReference(interfaceC1354u);
            }
        }

        @Override // androidx.lifecycle.C
        public void d(Object obj) {
            o a4 = this.f12107a.a();
            if (a4 != null) {
                p pVar = this.f12107a;
                a4.handleFieldChange(pVar.f12114b, pVar.b(), 0);
            }
        }

        @Override // androidx.databinding.l
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(AbstractC1358y abstractC1358y) {
            InterfaceC1354u f4 = f();
            if (f4 != null) {
                abstractC1358y.i(f4, this);
            }
        }

        public p g() {
            return this.f12107a;
        }

        @Override // androidx.databinding.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void b(AbstractC1358y abstractC1358y) {
            abstractC1358y.n(this);
        }
    }

    static class k implements InterfaceC1353t {

        /* renamed from: b, reason: collision with root package name */
        final WeakReference f12109b;

        /* synthetic */ k(o oVar, a aVar) {
            this(oVar);
        }

        @D(AbstractC1346l.a.ON_START)
        public void onStart() {
            o oVar = (o) this.f12109b.get();
            if (oVar != null) {
                oVar.executePendingBindings();
            }
        }

        private k(o oVar) {
            this.f12109b = new WeakReference(oVar);
        }
    }

    protected static abstract class l extends h.a implements androidx.databinding.g {
    }

    private static class m extends j.a implements androidx.databinding.l {

        /* renamed from: a, reason: collision with root package name */
        final p f12110a;

        public m(o oVar, int i4, ReferenceQueue referenceQueue) {
            this.f12110a = new p(oVar, i4, this, referenceQueue);
        }

        @Override // androidx.databinding.l
        public void a(InterfaceC1354u interfaceC1354u) {
        }

        @Override // androidx.databinding.l
        public /* bridge */ /* synthetic */ void b(Object obj) {
            android.support.v4.media.session.b.a(obj);
            f(null);
        }

        @Override // androidx.databinding.l
        public /* bridge */ /* synthetic */ void c(Object obj) {
            android.support.v4.media.session.b.a(obj);
            d(null);
        }

        public void d(androidx.databinding.j jVar) {
            jVar.c(this);
        }

        public p e() {
            return this.f12110a;
        }

        public void f(androidx.databinding.j jVar) {
            jVar.a(this);
        }
    }

    private static class n extends k.a implements androidx.databinding.l {

        /* renamed from: a, reason: collision with root package name */
        final p f12111a;

        public n(o oVar, int i4, ReferenceQueue referenceQueue) {
            this.f12111a = new p(oVar, i4, this, referenceQueue);
        }

        @Override // androidx.databinding.l
        public void a(InterfaceC1354u interfaceC1354u) {
        }

        @Override // androidx.databinding.l
        public /* bridge */ /* synthetic */ void b(Object obj) {
            android.support.v4.media.session.b.a(obj);
            f(null);
        }

        @Override // androidx.databinding.l
        public /* bridge */ /* synthetic */ void c(Object obj) {
            android.support.v4.media.session.b.a(obj);
            d(null);
        }

        public void d(androidx.databinding.k kVar) {
            kVar.b(this);
        }

        public p e() {
            return this.f12111a;
        }

        public void f(androidx.databinding.k kVar) {
            kVar.d(this);
        }
    }

    /* renamed from: androidx.databinding.o$o, reason: collision with other inner class name */
    private static class C0102o extends h.a implements androidx.databinding.l {

        /* renamed from: a, reason: collision with root package name */
        final p f12112a;

        public C0102o(o oVar, int i4, ReferenceQueue referenceQueue) {
            this.f12112a = new p(oVar, i4, this, referenceQueue);
        }

        @Override // androidx.databinding.l
        public void a(InterfaceC1354u interfaceC1354u) {
        }

        @Override // androidx.databinding.h.a
        public void d(androidx.databinding.h hVar, int i4) {
            o a4 = this.f12112a.a();
            if (a4 != null && ((androidx.databinding.h) this.f12112a.b()) == hVar) {
                a4.handleFieldChange(this.f12112a.f12114b, hVar, i4);
            }
        }

        @Override // androidx.databinding.l
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(androidx.databinding.h hVar) {
            hVar.addOnPropertyChangedCallback(this);
        }

        public p f() {
            return this.f12112a;
        }

        @Override // androidx.databinding.l
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void b(androidx.databinding.h hVar) {
            hVar.removeOnPropertyChangedCallback(this);
        }
    }

    protected o(DataBindingComponent dataBindingComponent, View view, int i4) {
        this.mRebindRunnable = new g();
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mBindingComponent = dataBindingComponent;
        this.mLocalFieldObservers = new p[i4];
        this.mRoot = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (USE_CHOREOGRAPHER) {
            this.mChoreographer = Choreographer.getInstance();
            this.mFrameCallback = new h();
        } else {
            this.mFrameCallback = null;
            this.mUIThreadHandler = new Handler(Looper.myLooper());
        }
    }

    private static DataBindingComponent a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    protected static o bind(Object obj, View view, int i4) {
        return androidx.databinding.f.a(a(obj), view, i4);
    }

    private void c() {
        if (this.mIsExecutingPendingBindings) {
            requestRebind();
            return;
        }
        if (hasPendingBindings()) {
            this.mIsExecutingPendingBindings = true;
            this.mRebindHalted = false;
            androidx.databinding.c cVar = this.mRebindCallbacks;
            if (cVar != null) {
                cVar.g(this, 1, null);
                if (this.mRebindHalted) {
                    this.mRebindCallbacks.g(this, 2, null);
                }
            }
            if (!this.mRebindHalted) {
                executeBindings();
                androidx.databinding.c cVar2 = this.mRebindCallbacks;
                if (cVar2 != null) {
                    cVar2.g(this, 3, null);
                }
            }
            this.mIsExecutingPendingBindings = false;
        }
    }

    private static boolean d(String str, int i4) {
        int length = str.length();
        if (length == i4) {
            return false;
        }
        while (i4 < length) {
            if (!Character.isDigit(str.charAt(i4))) {
                return false;
            }
            i4++;
        }
        return true;
    }

    private static void e(DataBindingComponent dataBindingComponent, View view, Object[] objArr, i iVar, SparseIntArray sparseIntArray, boolean z4) {
        int id;
        int i4;
        if (getBinding(view) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        int i5 = 0;
        boolean z5 = true;
        if (z4 && str != null && str.startsWith("layout")) {
            int lastIndexOf = str.lastIndexOf(95);
            if (lastIndexOf > 0) {
                int i6 = lastIndexOf + 1;
                if (d(str, i6)) {
                    int f4 = f(str, i6);
                    if (objArr[f4] == null) {
                        objArr[f4] = view;
                    }
                }
            }
            z5 = false;
        } else {
            if (str != null && str.startsWith(BINDING_TAG_PREFIX)) {
                int f5 = f(str, BINDING_NUMBER_START);
                if (objArr[f5] == null) {
                    objArr[f5] = view;
                }
            }
            z5 = false;
        }
        if (!z5 && (id = view.getId()) > 0 && sparseIntArray != null && (i4 = sparseIntArray.get(id, -1)) >= 0 && objArr[i4] == null) {
            objArr[i4] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (i5 < childCount) {
                DataBindingComponent dataBindingComponent2 = dataBindingComponent;
                Object[] objArr2 = objArr;
                i iVar2 = iVar;
                SparseIntArray sparseIntArray2 = sparseIntArray;
                e(dataBindingComponent2, viewGroup.getChildAt(i5), objArr2, iVar2, sparseIntArray2, false);
                i5++;
                dataBindingComponent = dataBindingComponent2;
                objArr = objArr2;
                iVar = iVar2;
                sparseIntArray = sparseIntArray2;
            }
        }
    }

    protected static void executeBindingsOn(o oVar) {
        oVar.c();
    }

    private static int f(String str, int i4) {
        int i5 = 0;
        while (i4 < str.length()) {
            i5 = (i5 * 10) + (str.charAt(i4) - '0');
            i4++;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g() {
        while (true) {
            Reference<? extends o> poll = sReferenceQueue.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof p) {
                ((p) poll).e();
            }
        }
    }

    static o getBinding(View view) {
        if (view != null) {
            return (o) view.getTag(P.a.f9015a);
        }
        return null;
    }

    public static int getBuildSdkInt() {
        return SDK_INT;
    }

    protected static int getColorFromResource(View view, int i4) {
        return view.getContext().getColor(i4);
    }

    protected static ColorStateList getColorStateListFromResource(View view, int i4) {
        return view.getContext().getColorStateList(i4);
    }

    protected static Drawable getDrawableFromResource(View view, int i4) {
        return view.getContext().getDrawable(i4);
    }

    protected static <K, T> T getFrom(Map<K, T> map, K k4) {
        if (map == null) {
            return null;
        }
        return map.get(k4);
    }

    protected static <T> T getFromArray(T[] tArr, int i4) {
        if (tArr == null || i4 < 0 || i4 >= tArr.length) {
            return null;
        }
        return tArr[i4];
    }

    protected static <T> T getFromList(List<T> list, int i4) {
        if (list == null || i4 < 0 || i4 >= list.size()) {
            return null;
        }
        return list.get(i4);
    }

    protected static <T extends o> T inflateInternal(LayoutInflater layoutInflater, int i4, ViewGroup viewGroup, boolean z4, Object obj) {
        return (T) androidx.databinding.f.e(layoutInflater, i4, viewGroup, z4, a(obj));
    }

    protected static Object[] mapBindings(DataBindingComponent dataBindingComponent, View view, int i4, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i4];
        e(dataBindingComponent, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    protected static boolean parse(String str, boolean z4) {
        return str == null ? z4 : Boolean.parseBoolean(str);
    }

    protected static int safeUnbox(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    protected static void setBindingInverseListener(o oVar, androidx.databinding.g gVar, l lVar) {
        if (gVar == lVar || gVar == null) {
            return;
        }
        android.support.v4.media.session.b.a(gVar);
        oVar.removeOnPropertyChangedCallback(null);
    }

    protected static <T> void setTo(T[] tArr, int i4, T t4) {
        if (tArr == null || i4 < 0 || i4 >= tArr.length) {
            return;
        }
        tArr[i4] = t4;
    }

    public void addOnRebindCallback(androidx.databinding.m mVar) {
        if (this.mRebindCallbacks == null) {
            this.mRebindCallbacks = new androidx.databinding.c(REBIND_NOTIFIER);
        }
        this.mRebindCallbacks.a(mVar);
    }

    protected void ensureBindingComponentIsNotNull(Class<?> cls) {
        if (this.mBindingComponent != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    protected abstract void executeBindings();

    public void executePendingBindings() {
        o oVar = this.mContainingBinding;
        if (oVar == null) {
            c();
        } else {
            oVar.executePendingBindings();
        }
    }

    void forceExecuteBindings() {
        executeBindings();
    }

    public InterfaceC1354u getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    protected Object getObservedField(int i4) {
        p pVar = this.mLocalFieldObservers[i4];
        if (pVar == null) {
            return null;
        }
        return pVar.b();
    }

    public View getRoot() {
        return this.mRoot;
    }

    protected void handleFieldChange(int i4, Object obj, int i5) {
        if (this.mInLiveDataRegisterObserver || this.mInStateFlowRegisterObserver || !onFieldChange(i4, obj, i5)) {
            return;
        }
        requestRebind();
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    protected abstract boolean onFieldChange(int i4, Object obj, int i5);

    protected void registerTo(int i4, Object obj, androidx.databinding.d dVar) {
        if (obj == null) {
            return;
        }
        p pVar = this.mLocalFieldObservers[i4];
        if (pVar == null) {
            pVar = dVar.a(this, i4, sReferenceQueue);
            this.mLocalFieldObservers[i4] = pVar;
            InterfaceC1354u interfaceC1354u = this.mLifecycleOwner;
            if (interfaceC1354u != null) {
                pVar.c(interfaceC1354u);
            }
        }
        pVar.d(obj);
    }

    public void removeOnRebindCallback(androidx.databinding.m mVar) {
        androidx.databinding.c cVar = this.mRebindCallbacks;
        if (cVar != null) {
            cVar.l(mVar);
        }
    }

    protected void requestRebind() {
        o oVar = this.mContainingBinding;
        if (oVar != null) {
            oVar.requestRebind();
            return;
        }
        InterfaceC1354u interfaceC1354u = this.mLifecycleOwner;
        if (interfaceC1354u == null || interfaceC1354u.getLifecycle().getCurrentState().d(AbstractC1346l.b.STARTED)) {
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

    protected void setContainedBinding(o oVar) {
        if (oVar != null) {
            oVar.mContainingBinding = this;
        }
    }

    public void setLifecycleOwner(InterfaceC1354u interfaceC1354u) {
        if (interfaceC1354u instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        InterfaceC1354u interfaceC1354u2 = this.mLifecycleOwner;
        if (interfaceC1354u2 == interfaceC1354u) {
            return;
        }
        if (interfaceC1354u2 != null) {
            interfaceC1354u2.getLifecycle().removeObserver(this.mOnStartListener);
        }
        this.mLifecycleOwner = interfaceC1354u;
        if (interfaceC1354u != null) {
            if (this.mOnStartListener == null) {
                this.mOnStartListener = new k(this, null);
            }
            interfaceC1354u.getLifecycle().addObserver(this.mOnStartListener);
        }
        for (p pVar : this.mLocalFieldObservers) {
            if (pVar != null) {
                pVar.c(interfaceC1354u);
            }
        }
    }

    protected void setRootTag(View view) {
        view.setTag(P.a.f9015a, this);
    }

    public abstract boolean setVariable(int i4, Object obj);

    public void unbind() {
        for (p pVar : this.mLocalFieldObservers) {
            if (pVar != null) {
                pVar.e();
            }
        }
    }

    protected boolean unregisterFrom(int i4) {
        p pVar = this.mLocalFieldObservers[i4];
        if (pVar != null) {
            return pVar.e();
        }
        return false;
    }

    protected boolean updateLiveDataRegistration(int i4, AbstractC1358y abstractC1358y) {
        this.mInLiveDataRegisterObserver = true;
        try {
            return updateRegistration(i4, abstractC1358y, CREATE_LIVE_DATA_LISTENER);
        } finally {
            this.mInLiveDataRegisterObserver = false;
        }
    }

    protected boolean updateRegistration(int i4, Object obj, androidx.databinding.d dVar) {
        if (obj == null) {
            return unregisterFrom(i4);
        }
        p pVar = this.mLocalFieldObservers[i4];
        if (pVar == null) {
            registerTo(i4, obj, dVar);
            return true;
        }
        if (pVar.b() == obj) {
            return false;
        }
        unregisterFrom(i4);
        registerTo(i4, obj, dVar);
        return true;
    }

    protected static byte parse(String str, byte b4) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b4;
        }
    }

    protected static long safeUnbox(Long l4) {
        if (l4 == null) {
            return 0L;
        }
        return l4.longValue();
    }

    protected void setRootTag(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(P.a.f9015a, this);
        }
    }

    protected static boolean getFromArray(boolean[] zArr, int i4) {
        if (zArr == null || i4 < 0 || i4 >= zArr.length) {
            return false;
        }
        return zArr[i4];
    }

    protected static <T> T getFromList(SparseArray<T> sparseArray, int i4) {
        if (sparseArray == null || i4 < 0) {
            return null;
        }
        return sparseArray.get(i4);
    }

    protected static Object[] mapBindings(DataBindingComponent dataBindingComponent, View[] viewArr, int i4, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i4];
        for (View view : viewArr) {
            e(dataBindingComponent, view, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    protected static short parse(String str, short s4) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s4;
        }
    }

    protected static short safeUnbox(Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    protected static void setTo(boolean[] zArr, int i4, boolean z4) {
        if (zArr == null || i4 < 0 || i4 >= zArr.length) {
            return;
        }
        zArr[i4] = z4;
    }

    protected static <T> T getFromList(LongSparseArray<T> longSparseArray, int i4) {
        if (longSparseArray == null || i4 < 0) {
            return null;
        }
        return longSparseArray.get(i4);
    }

    protected static int parse(String str, int i4) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i4;
        }
    }

    protected static byte safeUnbox(Byte b4) {
        if (b4 == null) {
            return (byte) 0;
        }
        return b4.byteValue();
    }

    protected static byte getFromArray(byte[] bArr, int i4) {
        if (bArr == null || i4 < 0 || i4 >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i4];
    }

    protected static <T> T getFromList(androidx.collection.d dVar, int i4) {
        if (dVar == null || i4 < 0) {
            return null;
        }
        return (T) dVar.i(i4);
    }

    protected static long parse(String str, long j4) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j4;
        }
    }

    protected static char safeUnbox(Character ch) {
        if (ch == null) {
            return (char) 0;
        }
        return ch.charValue();
    }

    protected static void setTo(byte[] bArr, int i4, byte b4) {
        if (bArr == null || i4 < 0 || i4 >= bArr.length) {
            return;
        }
        bArr[i4] = b4;
    }

    protected static boolean getFromList(SparseBooleanArray sparseBooleanArray, int i4) {
        if (sparseBooleanArray == null || i4 < 0) {
            return false;
        }
        return sparseBooleanArray.get(i4);
    }

    protected static float parse(String str, float f4) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f4;
        }
    }

    protected static double safeUnbox(Double d4) {
        if (d4 == null) {
            return 0.0d;
        }
        return d4.doubleValue();
    }

    protected static short getFromArray(short[] sArr, int i4) {
        if (sArr == null || i4 < 0 || i4 >= sArr.length) {
            return (short) 0;
        }
        return sArr[i4];
    }

    protected static int getFromList(SparseIntArray sparseIntArray, int i4) {
        if (sparseIntArray == null || i4 < 0) {
            return 0;
        }
        return sparseIntArray.get(i4);
    }

    protected static double parse(String str, double d4) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d4;
        }
    }

    protected static float safeUnbox(Float f4) {
        if (f4 == null) {
            return 0.0f;
        }
        return f4.floatValue();
    }

    protected static void setTo(short[] sArr, int i4, short s4) {
        if (sArr == null || i4 < 0 || i4 >= sArr.length) {
            return;
        }
        sArr[i4] = s4;
    }

    protected boolean updateRegistration(int i4, androidx.databinding.h hVar) {
        return updateRegistration(i4, hVar, CREATE_PROPERTY_LISTENER);
    }

    protected static long getFromList(SparseLongArray sparseLongArray, int i4) {
        if (sparseLongArray == null || i4 < 0) {
            return 0L;
        }
        return sparseLongArray.get(i4);
    }

    protected static char parse(String str, char c4) {
        return (str == null || str.isEmpty()) ? c4 : str.charAt(0);
    }

    protected static boolean safeUnbox(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected boolean updateRegistration(int i4, androidx.databinding.j jVar) {
        return updateRegistration(i4, jVar, CREATE_LIST_LISTENER);
    }

    protected static char getFromArray(char[] cArr, int i4) {
        if (cArr == null || i4 < 0 || i4 >= cArr.length) {
            return (char) 0;
        }
        return cArr[i4];
    }

    protected static void setTo(char[] cArr, int i4, char c4) {
        if (cArr == null || i4 < 0 || i4 >= cArr.length) {
            return;
        }
        cArr[i4] = c4;
    }

    protected boolean updateRegistration(int i4, androidx.databinding.k kVar) {
        return updateRegistration(i4, kVar, CREATE_MAP_LISTENER);
    }

    protected static int getFromArray(int[] iArr, int i4) {
        if (iArr == null || i4 < 0 || i4 >= iArr.length) {
            return 0;
        }
        return iArr[i4];
    }

    protected static void setTo(int[] iArr, int i4, int i5) {
        if (iArr == null || i4 < 0 || i4 >= iArr.length) {
            return;
        }
        iArr[i4] = i5;
    }

    protected static long getFromArray(long[] jArr, int i4) {
        if (jArr == null || i4 < 0 || i4 >= jArr.length) {
            return 0L;
        }
        return jArr[i4];
    }

    protected static void setTo(long[] jArr, int i4, long j4) {
        if (jArr == null || i4 < 0 || i4 >= jArr.length) {
            return;
        }
        jArr[i4] = j4;
    }

    protected o(Object obj, View view, int i4) {
        this(a(obj), view, i4);
    }

    protected static float getFromArray(float[] fArr, int i4) {
        if (fArr == null || i4 < 0 || i4 >= fArr.length) {
            return 0.0f;
        }
        return fArr[i4];
    }

    protected static void setTo(float[] fArr, int i4, float f4) {
        if (fArr == null || i4 < 0 || i4 >= fArr.length) {
            return;
        }
        fArr[i4] = f4;
    }

    protected static double getFromArray(double[] dArr, int i4) {
        if (dArr == null || i4 < 0 || i4 >= dArr.length) {
            return 0.0d;
        }
        return dArr[i4];
    }

    protected static void setTo(double[] dArr, int i4, double d4) {
        if (dArr == null || i4 < 0 || i4 >= dArr.length) {
            return;
        }
        dArr[i4] = d4;
    }

    protected static <T> void setTo(List<T> list, int i4, T t4) {
        if (list == null || i4 < 0 || i4 >= list.size()) {
            return;
        }
        list.set(i4, t4);
    }

    protected static <T> void setTo(SparseArray<T> sparseArray, int i4, T t4) {
        if (sparseArray == null || i4 < 0 || i4 >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i4, t4);
    }

    protected static <T> void setTo(LongSparseArray<T> longSparseArray, int i4, T t4) {
        if (longSparseArray == null || i4 < 0 || i4 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i4, t4);
    }

    protected static <T> void setTo(androidx.collection.d dVar, int i4, T t4) {
        if (dVar == null || i4 < 0 || i4 >= dVar.p()) {
            return;
        }
        dVar.m(i4, t4);
    }

    protected static void setTo(SparseBooleanArray sparseBooleanArray, int i4, boolean z4) {
        if (sparseBooleanArray == null || i4 < 0 || i4 >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i4, z4);
    }

    protected static void setTo(SparseIntArray sparseIntArray, int i4, int i5) {
        if (sparseIntArray == null || i4 < 0 || i4 >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i4, i5);
    }

    protected static void setTo(SparseLongArray sparseLongArray, int i4, long j4) {
        if (sparseLongArray == null || i4 < 0 || i4 >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i4, j4);
    }

    protected static <K, T> void setTo(Map<K, T> map, K k4, T t4) {
        if (map == null) {
            return;
        }
        map.put(k4, t4);
    }
}
