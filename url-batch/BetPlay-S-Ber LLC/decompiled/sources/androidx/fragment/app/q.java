package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.awerser.monnit.betplay.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.al;
import defpackage.bl;
import defpackage.cl;
import defpackage.e90;
import defpackage.h5;
import defpackage.hq;
import defpackage.i9;
import defpackage.nk;
import defpackage.o30;
import defpackage.o8;
import defpackage.r3;
import defpackage.r90;
import defpackage.sk;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class q {
    public final h5 a;
    public final r b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public q(h5 h5Var, r rVar, ClassLoader classLoader, sk skVar, p pVar) {
        this.a = h5Var;
        this.b = rVar;
        Fragment instantiate = Fragment.instantiate(skVar.a.t.g, pVar.f, null);
        Bundle bundle = pVar.o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        instantiate.setArguments(bundle);
        instantiate.mWho = pVar.g;
        instantiate.mFromLayout = pVar.h;
        instantiate.mRestored = true;
        instantiate.mFragmentId = pVar.i;
        instantiate.mContainerId = pVar.j;
        instantiate.mTag = pVar.k;
        instantiate.mRetainInstance = pVar.l;
        instantiate.mRemoving = pVar.m;
        instantiate.mDetached = pVar.n;
        instantiate.mHidden = pVar.p;
        instantiate.mMaxState = hq.values()[pVar.q];
        Bundle bundle2 = pVar.r;
        if (bundle2 != null) {
            instantiate.mSavedFragmentState = bundle2;
        } else {
            instantiate.mSavedFragmentState = new Bundle();
        }
        this.c = instantiate;
        if (n.G(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + instantiate);
        }
    }

    public final void a() {
        View view;
        View view2;
        ArrayList arrayList = this.b.a;
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.mContainer;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(fragment);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) arrayList.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) arrayList.get(i2);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, i);
    }

    public final void b() {
        boolean G = n.G(3);
        Fragment fragment = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        q qVar = null;
        r rVar = this.b;
        if (fragment2 != null) {
            q qVar2 = (q) rVar.b.get(fragment2.mWho);
            if (qVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                Fragment fragment3 = fragment.mTarget;
                sb.append(" declared target fragment ");
                sb.append(fragment3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            qVar = qVar2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (qVar = (q) rVar.b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                String str2 = fragment.mTargetWho;
                sb2.append(" declared target fragment ");
                sb2.append(str2);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (qVar != null) {
            qVar.j();
        }
        n nVar = fragment.mFragmentManager;
        fragment.mHost = nVar.t;
        fragment.mParentFragment = nVar.v;
        h5 h5Var = this.a;
        h5Var.j(false);
        fragment.performAttach();
        h5Var.e(false);
    }

    public final int c() {
        s sVar;
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.e;
        int ordinal = fragment.mMaxState.ordinal();
        int i2 = 0;
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (fragment.mFromLayout) {
            boolean z = fragment.mInLayout;
            int i3 = this.e;
            if (z) {
                i = Math.max(i3, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = i3 < 4 ? Math.min(i, fragment.mState) : Math.min(i, 1);
            }
        }
        if (!fragment.mAdded) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            f i4 = f.i(viewGroup, fragment.getParentFragmentManager());
            s f = i4.f(fragment);
            int i5 = f != null ? f.b : 0;
            ArrayList arrayList = i4.c;
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    sVar = null;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                sVar = (s) obj;
                if (sVar.c.equals(fragment) && !sVar.f) {
                    break;
                }
            }
            i2 = (sVar == null || !(i5 == 0 || i5 == 1)) ? i5 : sVar.b;
        }
        if (i2 == 2) {
            i = Math.min(i, 6);
        } else if (i2 == 3) {
            i = Math.max(i, 3);
        } else if (fragment.mRemoving) {
            i = fragment.isInBackStack() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i = Math.min(i, 4);
        }
        if (n.G(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + fragment);
        }
        return i;
    }

    public final void d() {
        boolean G = n.G(3);
        Fragment fragment = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        boolean z = fragment.mIsCreated;
        Bundle bundle = fragment.mSavedFragmentState;
        if (z) {
            fragment.restoreChildFragmentState(bundle);
            fragment.mState = 1;
        } else {
            h5 h5Var = this.a;
            h5Var.k(false);
            fragment.performCreate(fragment.mSavedFragmentState);
            h5Var.f(false);
        }
    }

    public final void e() {
        String str;
        Fragment fragment = this.c;
        if (fragment.mFromLayout) {
            return;
        }
        if (n.G(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            int i = fragment.mContainerId;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    o8.j(o30.f("Cannot create fragment ", fragment, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.u.m(i);
                if (viewGroup == null) {
                    if (!fragment.mRestored) {
                        try {
                            str = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    bl blVar = cl.a;
                    cl.b(new al(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    cl.a(fragment).getClass();
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(performGetLayoutInflater, viewGroup, fragment.mSavedFragmentState);
        View view = fragment.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view2 = fragment.mView;
            WeakHashMap weakHashMap = e90.a;
            boolean isAttachedToWindow = view2.isAttachedToWindow();
            View view3 = fragment.mView;
            if (isAttachedToWindow) {
                view3.requestApplyInsets();
            } else {
                view3.addOnAttachStateChangeListener(new i9(2, view3));
            }
            fragment.performViewCreated();
            this.a.q(false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (n.G(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void f() {
        Fragment b;
        boolean G = n.G(3);
        Fragment fragment = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        int i = 0;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        r rVar = this.b;
        if (z2 && !fragment.mBeingSaved) {
        }
        if (!z2) {
            o oVar = rVar.d;
            if (!((oVar.d.containsKey(fragment.mWho) && oVar.g) ? oVar.h : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (b = rVar.b(str)) != null && b.mRetainInstance) {
                    fragment.mTarget = b;
                }
                fragment.mState = 0;
                return;
            }
        }
        nk nkVar = fragment.mHost;
        if (nkVar instanceof r90) {
            z = rVar.d.h;
        } else {
            r3 r3Var = nkVar.g;
            if (r3Var != null) {
                z = true ^ r3Var.isChangingConfigurations();
            }
        }
        if ((z2 && !fragment.mBeingSaved) || z) {
            rVar.d.d(fragment);
        }
        fragment.performDestroy();
        this.a.g(false);
        ArrayList d = rVar.d();
        int size = d.size();
        while (i < size) {
            Object obj = d.get(i);
            i++;
            q qVar = (q) obj;
            if (qVar != null) {
                Fragment fragment2 = qVar.c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = rVar.b(str2);
        }
        rVar.h(this);
    }

    public final void g() {
        View view;
        boolean G = n.G(3);
        Fragment fragment = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.a.r(false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.e(null);
        fragment.mInLayout = false;
    }

    public final void h() {
        boolean G = n.G(3);
        Fragment fragment = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.a.h(false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            o oVar = this.b.d;
            if (!((oVar.d.containsKey(fragment.mWho) && oVar.g) ? oVar.h : true)) {
                return;
            }
        }
        if (n.G(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void i() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (n.G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.a.q(false);
                fragment.mState = 2;
            }
        }
    }

    public final void j() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        Fragment fragment = this.c;
        if (z) {
            if (n.G(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int c = c();
                int i = fragment.mState;
                r rVar = this.b;
                if (c == i) {
                    if (!z2 && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (n.G(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        rVar.d.d(fragment);
                        rVar.h(this);
                        if (n.G(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            f i2 = f.i(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                if (n.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                i2.b(3, 1, this);
                            } else {
                                if (n.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                i2.b(2, 1, this);
                            }
                        }
                        n nVar = fragment.mFragmentManager;
                        if (nVar != null && fragment.mAdded && n.H(fragment)) {
                            nVar.D = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.n();
                    }
                    this.d = false;
                    return;
                }
                h5 h5Var = this.a;
                if (c <= i) {
                    switch (i - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (((p) rVar.c.get(fragment.mWho)) == null) {
                                    m();
                                }
                            }
                            f();
                            break;
                        case 1:
                            g();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (n.G(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mBeingSaved) {
                                m();
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                n();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                f i3 = f.i(viewGroup2, fragment.getParentFragmentManager());
                                if (n.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                i3.b(1, 3, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (n.G(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.performStop();
                            h5Var.p(false);
                            break;
                        case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                            fragment.mState = 5;
                            break;
                        case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                            if (n.G(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.performPause();
                            h5Var.i(false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            if (n.G(3)) {
                                Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
                            }
                            fragment.performActivityCreated(fragment.mSavedFragmentState);
                            h5Var.d(false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                f i4 = f.i(viewGroup3, fragment.getParentFragmentManager());
                                int b = o30.b(fragment.mView.getVisibility());
                                if (n.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                }
                                i4.b(b, 2, this);
                            }
                            fragment.mState = 4;
                            break;
                        case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                            if (n.G(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.performStart();
                            h5Var.o(false);
                            break;
                        case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                            fragment.mState = 6;
                            break;
                        case 7:
                            l();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void k(ClassLoader classLoader) {
        Fragment fragment = this.c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("android:view_registry_state");
        fragment.mTargetWho = fragment.mSavedFragmentState.getString("android:target_state");
        if (fragment.mTargetWho != null) {
            fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = fragment.mSavedUserVisibleHint;
        if (bool != null) {
            fragment.mUserVisibleHint = bool.booleanValue();
            fragment.mSavedUserVisibleHint = null;
        } else {
            fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    public final void l() {
        boolean G = n.G(3);
        Fragment fragment = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView != fragment.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != fragment.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (n.G(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(fragment);
                sb.append(" resulting in focused view ");
                sb.append(fragment.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.a.l(false);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final void m() {
        Fragment fragment = this.c;
        p pVar = new p(fragment);
        if (fragment.mState <= -1 || pVar.r != null) {
            pVar.r = fragment.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            fragment.performSaveInstanceState(bundle);
            this.a.m(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (fragment.mView != null) {
                n();
            }
            if (fragment.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
            }
            if (fragment.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", fragment.mSavedViewRegistryState);
            }
            if (!fragment.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
            }
            pVar.r = bundle;
            if (fragment.mTargetWho != null) {
                if (bundle == null) {
                    pVar.r = new Bundle();
                }
                pVar.r.putString("android:target_state", fragment.mTargetWho);
                int i = fragment.mTargetRequestCode;
                if (i != 0) {
                    pVar.r.putInt("android:target_req_state", i);
                }
            }
        }
    }

    public final void n() {
        Fragment fragment = this.c;
        if (fragment.mView == null) {
            return;
        }
        if (n.G(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.i.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public q(h5 h5Var, r rVar, Fragment fragment) {
        this.a = h5Var;
        this.b = rVar;
        this.c = fragment;
    }

    public q(h5 h5Var, r rVar, Fragment fragment, p pVar) {
        this.a = h5Var;
        this.b = rVar;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = pVar.r;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
