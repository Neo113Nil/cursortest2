package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC1281a0;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.c0;
import com.ironsource.b9;

/* loaded from: classes.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    private final o f12519a;

    /* renamed from: b, reason: collision with root package name */
    private final y f12520b;

    /* renamed from: c, reason: collision with root package name */
    private final Fragment f12521c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12522d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f12523e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f12524a;

        a(View view) {
            this.f12524a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f12524a.removeOnAttachStateChangeListener(this);
            AbstractC1281a0.l0(this.f12524a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12526a;

        static {
            int[] iArr = new int[AbstractC1346l.b.values().length];
            f12526a = iArr;
            try {
                iArr[AbstractC1346l.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12526a[AbstractC1346l.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12526a[AbstractC1346l.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12526a[AbstractC1346l.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    x(o oVar, y yVar, Fragment fragment) {
        this.f12519a = oVar;
        this.f12520b = yVar;
        this.f12521c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f12521c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f12521c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f12521c.performSaveInstanceState(bundle);
        this.f12519a.j(this.f12521c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f12521c.mView != null) {
            s();
        }
        if (this.f12521c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f12521c.mSavedViewState);
        }
        if (this.f12521c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f12521c.mSavedViewRegistryState);
        }
        if (!this.f12521c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f12521c.mUserVisibleHint);
        }
        return bundle;
    }

    void a() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f12521c);
        }
        Fragment fragment = this.f12521c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        o oVar = this.f12519a;
        Fragment fragment2 = this.f12521c;
        oVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    void b() {
        int j4 = this.f12520b.j(this.f12521c);
        Fragment fragment = this.f12521c;
        fragment.mContainer.addView(fragment.mView, j4);
    }

    void c() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f12521c);
        }
        Fragment fragment = this.f12521c;
        Fragment fragment2 = fragment.mTarget;
        x xVar = null;
        if (fragment2 != null) {
            x n4 = this.f12520b.n(fragment2.mWho);
            if (n4 == null) {
                throw new IllegalStateException("Fragment " + this.f12521c + " declared target fragment " + this.f12521c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f12521c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            xVar = n4;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (xVar = this.f12520b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f12521c + " declared target fragment " + this.f12521c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (xVar != null) {
            xVar.m();
        }
        Fragment fragment4 = this.f12521c;
        fragment4.mHost = fragment4.mFragmentManager.t0();
        Fragment fragment5 = this.f12521c;
        fragment5.mParentFragment = fragment5.mFragmentManager.w0();
        this.f12519a.g(this.f12521c, false);
        this.f12521c.performAttach();
        this.f12519a.b(this.f12521c, false);
    }

    int d() {
        Fragment fragment = this.f12521c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i4 = this.f12523e;
        int i5 = b.f12526a[fragment.mMaxState.ordinal()];
        if (i5 != 1) {
            i4 = i5 != 2 ? i5 != 3 ? i5 != 4 ? Math.min(i4, -1) : Math.min(i4, 0) : Math.min(i4, 1) : Math.min(i4, 5);
        }
        Fragment fragment2 = this.f12521c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i4 = Math.max(this.f12523e, 2);
                View view = this.f12521c.mView;
                if (view != null && view.getParent() == null) {
                    i4 = Math.min(i4, 2);
                }
            } else {
                i4 = this.f12523e < 4 ? Math.min(i4, fragment2.mState) : Math.min(i4, 1);
            }
        }
        if (!this.f12521c.mAdded) {
            i4 = Math.min(i4, 1);
        }
        Fragment fragment3 = this.f12521c;
        ViewGroup viewGroup = fragment3.mContainer;
        G.e.b l4 = viewGroup != null ? G.n(viewGroup, fragment3.getParentFragmentManager()).l(this) : null;
        if (l4 == G.e.b.ADDING) {
            i4 = Math.min(i4, 6);
        } else if (l4 == G.e.b.REMOVING) {
            i4 = Math.max(i4, 3);
        } else {
            Fragment fragment4 = this.f12521c;
            if (fragment4.mRemoving) {
                i4 = fragment4.isInBackStack() ? Math.min(i4, 1) : Math.min(i4, -1);
            }
        }
        Fragment fragment5 = this.f12521c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i4 = Math.min(i4, 4);
        }
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i4 + " for " + this.f12521c);
        }
        return i4;
    }

    void e() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f12521c);
        }
        Fragment fragment = this.f12521c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f12521c.mState = 1;
            return;
        }
        this.f12519a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f12521c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        o oVar = this.f12519a;
        Fragment fragment3 = this.f12521c;
        oVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    void f() {
        String str;
        if (this.f12521c.mFromLayout) {
            return;
        }
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f12521c);
        }
        Fragment fragment = this.f12521c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f12521c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i4 = fragment2.mContainerId;
            if (i4 == 0) {
                viewGroup = null;
            } else {
                if (i4 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f12521c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.p0().c(this.f12521c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f12521c;
                    if (!fragment3.mRestored) {
                        try {
                            str = fragment3.getResources().getResourceName(this.f12521c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f12521c.mContainerId) + " (" + str + ") for fragment " + this.f12521c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    X.c.n(this.f12521c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f12521c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f12521c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f12521c;
            fragment5.mView.setTag(W.b.f9591a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f12521c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (AbstractC1281a0.S(this.f12521c.mView)) {
                AbstractC1281a0.l0(this.f12521c.mView);
            } else {
                View view2 = this.f12521c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f12521c.performViewCreated();
            o oVar = this.f12519a;
            Fragment fragment7 = this.f12521c;
            oVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f12521c.mView.getVisibility();
            this.f12521c.setPostOnViewCreatedAlpha(this.f12521c.mView.getAlpha());
            Fragment fragment8 = this.f12521c;
            if (fragment8.mContainer != null && visibility == 0) {
                View findFocus = fragment8.mView.findFocus();
                if (findFocus != null) {
                    this.f12521c.setFocusedView(findFocus);
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f12521c);
                    }
                }
                this.f12521c.mView.setAlpha(0.0f);
            }
        }
        this.f12521c.mState = 2;
    }

    void g() {
        Fragment f4;
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f12521c);
        }
        Fragment fragment = this.f12521c;
        boolean z4 = true;
        boolean z5 = fragment.mRemoving && !fragment.isInBackStack();
        if (z5) {
            Fragment fragment2 = this.f12521c;
            if (!fragment2.mBeingSaved) {
                this.f12520b.B(fragment2.mWho, null);
            }
        }
        if (!z5 && !this.f12520b.p().n(this.f12521c)) {
            String str = this.f12521c.mTargetWho;
            if (str != null && (f4 = this.f12520b.f(str)) != null && f4.mRetainInstance) {
                this.f12521c.mTarget = f4;
            }
            this.f12521c.mState = 0;
            return;
        }
        m mVar = this.f12521c.mHost;
        if (mVar instanceof c0) {
            z4 = this.f12520b.p().k();
        } else if (mVar.f() instanceof Activity) {
            z4 = true ^ ((Activity) mVar.f()).isChangingConfigurations();
        }
        if ((z5 && !this.f12521c.mBeingSaved) || z4) {
            this.f12520b.p().c(this.f12521c);
        }
        this.f12521c.performDestroy();
        this.f12519a.d(this.f12521c, false);
        for (x xVar : this.f12520b.k()) {
            if (xVar != null) {
                Fragment k4 = xVar.k();
                if (this.f12521c.mWho.equals(k4.mTargetWho)) {
                    k4.mTarget = this.f12521c;
                    k4.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f12521c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f12520b.f(str2);
        }
        this.f12520b.s(this);
    }

    void h() {
        View view;
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f12521c);
        }
        Fragment fragment = this.f12521c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f12521c.performDestroyView();
        this.f12519a.n(this.f12521c, false);
        Fragment fragment2 = this.f12521c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.o(null);
        this.f12521c.mInLayout = false;
    }

    void i() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f12521c);
        }
        this.f12521c.performDetach();
        this.f12519a.e(this.f12521c, false);
        Fragment fragment = this.f12521c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f12520b.p().n(this.f12521c)) {
            return;
        }
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f12521c);
        }
        this.f12521c.initState();
    }

    void j() {
        Fragment fragment = this.f12521c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.G0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f12521c);
            }
            Fragment fragment2 = this.f12521c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f12521c.mSavedFragmentState);
            View view = this.f12521c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f12521c;
                fragment3.mView.setTag(W.b.f9591a, fragment3);
                Fragment fragment4 = this.f12521c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f12521c.performViewCreated();
                o oVar = this.f12519a;
                Fragment fragment5 = this.f12521c;
                oVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f12521c.mState = 2;
            }
        }
    }

    Fragment k() {
        return this.f12521c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f12522d) {
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f12522d = true;
            boolean z4 = false;
            while (true) {
                int d4 = d();
                Fragment fragment = this.f12521c;
                int i4 = fragment.mState;
                if (d4 == i4) {
                    if (!z4 && i4 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f12521c.mBeingSaved) {
                        if (FragmentManager.G0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f12521c);
                        }
                        this.f12520b.p().c(this.f12521c);
                        this.f12520b.s(this);
                        if (FragmentManager.G0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f12521c);
                        }
                        this.f12521c.initState();
                    }
                    Fragment fragment2 = this.f12521c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            G n4 = G.n(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f12521c.mHidden) {
                                n4.c(this);
                            } else {
                                n4.e(this);
                            }
                        }
                        Fragment fragment3 = this.f12521c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.E0(fragment3);
                        }
                        Fragment fragment4 = this.f12521c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f12521c.mChildFragmentManager.I();
                    }
                    this.f12522d = false;
                    return;
                }
                if (d4 <= i4) {
                    switch (i4 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f12520b.q(fragment.mWho) == null) {
                                r();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f12521c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.G0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f12521c);
                            }
                            Fragment fragment5 = this.f12521c;
                            if (fragment5.mBeingSaved) {
                                r();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment6 = this.f12521c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                G.n(viewGroup2, fragment6.getParentFragmentManager()).d(this);
                            }
                            this.f12521c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i4 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                G.n(viewGroup3, fragment.getParentFragmentManager()).b(G.e.c.b(this.f12521c.mView.getVisibility()), this);
                            }
                            this.f12521c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z4 = true;
            }
        } catch (Throwable th) {
            this.f12522d = false;
            throw th;
        }
    }

    void n() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f12521c);
        }
        this.f12521c.performPause();
        this.f12519a.f(this.f12521c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f12521c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f12521c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f12521c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f12521c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f12521c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f12521c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f12521c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f12521c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    void p() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f12521c);
        }
        View focusedView = this.f12521c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.G0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : b9.h.f15504t);
                sb.append(" on Fragment ");
                sb.append(this.f12521c);
                sb.append(" resulting in focused view ");
                sb.append(this.f12521c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f12521c.setFocusedView(null);
        this.f12521c.performResume();
        this.f12519a.i(this.f12521c, false);
        Fragment fragment = this.f12521c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    void r() {
        FragmentState fragmentState = new FragmentState(this.f12521c);
        Fragment fragment = this.f12521c;
        if (fragment.mState <= -1 || fragmentState.f12395n != null) {
            fragmentState.f12395n = fragment.mSavedFragmentState;
        } else {
            Bundle q4 = q();
            fragmentState.f12395n = q4;
            if (this.f12521c.mTargetWho != null) {
                if (q4 == null) {
                    fragmentState.f12395n = new Bundle();
                }
                fragmentState.f12395n.putString("android:target_state", this.f12521c.mTargetWho);
                int i4 = this.f12521c.mTargetRequestCode;
                if (i4 != 0) {
                    fragmentState.f12395n.putInt("android:target_req_state", i4);
                }
            }
        }
        this.f12520b.B(this.f12521c.mWho, fragmentState);
    }

    void s() {
        if (this.f12521c.mView == null) {
            return;
        }
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f12521c + " with view " + this.f12521c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f12521c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f12521c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f12521c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f12521c.mSavedViewRegistryState = bundle;
    }

    void t(int i4) {
        this.f12523e = i4;
    }

    void u() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f12521c);
        }
        this.f12521c.performStart();
        this.f12519a.k(this.f12521c, false);
    }

    void v() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f12521c);
        }
        this.f12521c.performStop();
        this.f12519a.l(this.f12521c, false);
    }

    x(o oVar, y yVar, ClassLoader classLoader, l lVar, FragmentState fragmentState) {
        this.f12519a = oVar;
        this.f12520b = yVar;
        Fragment a4 = fragmentState.a(lVar, classLoader);
        this.f12521c = a4;
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a4);
        }
    }

    x(o oVar, y yVar, Fragment fragment, FragmentState fragmentState) {
        this.f12519a = oVar;
        this.f12520b = yVar;
        this.f12521c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f12395n;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
