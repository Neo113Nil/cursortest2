package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.internal.AnalyticsEvents;
import com.majelw.libystne.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class is0 {
    public final t21 a;
    public final js0 b;
    public final fr0 c;
    public boolean d = false;
    public int e = -1;

    public is0(t21 t21Var, js0 js0Var, ClassLoader classLoader, vr0 vr0Var, hs0 hs0Var) {
        this.a = t21Var;
        this.b = js0Var;
        fr0 instantiate = fr0.instantiate(vr0Var.a.t.n, hs0Var.m, null);
        Bundle bundle = hs0Var.v;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        instantiate.setArguments(bundle);
        instantiate.mWho = hs0Var.n;
        instantiate.mFromLayout = hs0Var.o;
        instantiate.mRestored = true;
        instantiate.mFragmentId = hs0Var.p;
        instantiate.mContainerId = hs0Var.q;
        instantiate.mTag = hs0Var.r;
        instantiate.mRetainInstance = hs0Var.s;
        instantiate.mRemoving = hs0Var.t;
        instantiate.mDetached = hs0Var.u;
        instantiate.mHidden = hs0Var.w;
        instantiate.mMaxState = zc1.values()[hs0Var.x];
        Bundle bundle2 = hs0Var.y;
        if (bundle2 != null) {
            instantiate.mSavedFragmentState = bundle2;
        } else {
            instantiate.mSavedFragmentState = new Bundle();
        }
        this.c = instantiate;
        if (as0.G(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + instantiate);
        }
    }

    public final void a() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.b.m;
        fr0 fr0Var = this.c;
        ViewGroup viewGroup = fr0Var.mContainer;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(fr0Var);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        fr0 fr0Var2 = (fr0) arrayList.get(indexOf);
                        if (fr0Var2.mContainer == viewGroup && (view = fr0Var2.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    fr0 fr0Var3 = (fr0) arrayList.get(i2);
                    if (fr0Var3.mContainer == viewGroup && (view2 = fr0Var3.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        fr0Var.mContainer.addView(fr0Var.mView, i);
    }

    public final void b() {
        boolean G = as0.G(3);
        fr0 fr0Var = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fr0Var);
        }
        fr0 fr0Var2 = fr0Var.mTarget;
        is0 is0Var = null;
        js0 js0Var = this.b;
        if (fr0Var2 != null) {
            is0 is0Var2 = (is0) ((HashMap) js0Var.n).get(fr0Var2.mWho);
            if (is0Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fr0Var);
                fr0 fr0Var3 = fr0Var.mTarget;
                sb.append(" declared target fragment ");
                sb.append(fr0Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            fr0Var.mTargetWho = fr0Var.mTarget.mWho;
            fr0Var.mTarget = null;
            is0Var = is0Var2;
        } else {
            String str = fr0Var.mTargetWho;
            if (str != null && (is0Var = (is0) ((HashMap) js0Var.n).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fr0Var);
                sb2.append(" declared target fragment ");
                lh.g(q40.p(sb2, fr0Var.mTargetWho, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (is0Var != null) {
            is0Var.j();
        }
        as0 as0Var = fr0Var.mFragmentManager;
        fr0Var.mHost = as0Var.t;
        fr0Var.mParentFragment = as0Var.v;
        t21 t21Var = this.a;
        t21Var.o(false);
        fr0Var.performAttach();
        t21Var.j(false);
    }

    public final int c() {
        bo2 bo2Var;
        fr0 fr0Var = this.c;
        if (fr0Var.mFragmentManager == null) {
            return fr0Var.mState;
        }
        int i = this.e;
        int ordinal = fr0Var.mMaxState.ordinal();
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
        if (fr0Var.mFromLayout) {
            boolean z = fr0Var.mInLayout;
            int i3 = this.e;
            if (z) {
                i = Math.max(i3, 2);
                View view = fr0Var.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = i3 < 4 ? Math.min(i, fr0Var.mState) : Math.min(i, 1);
            }
        }
        if (!fr0Var.mAdded) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = fr0Var.mContainer;
        if (viewGroup != null) {
            d90 i4 = d90.i(viewGroup, fr0Var.getParentFragmentManager());
            bo2 f = i4.f(fr0Var);
            int i5 = f != null ? f.b : 0;
            ArrayList arrayList = i4.c;
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    bo2Var = null;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                bo2Var = (bo2) obj;
                if (bo2Var.c.equals(fr0Var) && !bo2Var.f) {
                    break;
                }
            }
            i2 = (bo2Var == null || !(i5 == 0 || i5 == 1)) ? i5 : bo2Var.b;
        }
        if (i2 == 2) {
            i = Math.min(i, 6);
        } else if (i2 == 3) {
            i = Math.max(i, 3);
        } else if (fr0Var.mRemoving) {
            i = fr0Var.isInBackStack() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (fr0Var.mDeferStart && fr0Var.mState < 5) {
            i = Math.min(i, 4);
        }
        if (as0.G(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + fr0Var);
        }
        return i;
    }

    public final void d() {
        boolean G = as0.G(3);
        fr0 fr0Var = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto CREATED: " + fr0Var);
        }
        boolean z = fr0Var.mIsCreated;
        Bundle bundle = fr0Var.mSavedFragmentState;
        if (z) {
            fr0Var.restoreChildFragmentState(bundle);
            fr0Var.mState = 1;
        } else {
            t21 t21Var = this.a;
            t21Var.p(false);
            fr0Var.performCreate(fr0Var.mSavedFragmentState);
            t21Var.k(false);
        }
    }

    public final void e() {
        String str;
        fr0 fr0Var = this.c;
        if (fr0Var.mFromLayout) {
            return;
        }
        int i = 3;
        if (as0.G(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fr0Var);
        }
        LayoutInflater performGetLayoutInflater = fr0Var.performGetLayoutInflater(fr0Var.mSavedFragmentState);
        ViewGroup viewGroup = fr0Var.mContainer;
        if (viewGroup == null) {
            int i2 = fr0Var.mContainerId;
            if (i2 == 0) {
                viewGroup = null;
            } else {
                if (i2 == -1) {
                    lh.e(q40.k("Cannot create fragment ", fr0Var, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fr0Var.mFragmentManager.u.b(i2);
                if (viewGroup == null) {
                    if (!fr0Var.mRestored) {
                        try {
                            str = fr0Var.getResources().getResourceName(fr0Var.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fr0Var.mContainerId) + " (" + str + ") for fragment " + fr0Var);
                    }
                } else if (!(viewGroup instanceof nr0)) {
                    ls0 ls0Var = ms0.a;
                    m93 m93Var = new m93(fr0Var, "Attempting to add fragment " + fr0Var + " to container " + viewGroup + " which is not a FragmentContainerView");
                    ms0.c(m93Var);
                    ls0 a = ms0.a(fr0Var);
                    if (a.a.contains(ks0.t) && ms0.e(a, fr0Var.getClass(), m93.class)) {
                        ms0.b(a, m93Var);
                    }
                }
            }
        }
        fr0Var.mContainer = viewGroup;
        fr0Var.performCreateView(performGetLayoutInflater, viewGroup, fr0Var.mSavedFragmentState);
        View view = fr0Var.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            fr0Var.mView.setTag(R.id.fragment_container_view_tag, fr0Var);
            if (viewGroup != null) {
                a();
            }
            if (fr0Var.mHidden) {
                fr0Var.mView.setVisibility(8);
            }
            View view2 = fr0Var.mView;
            WeakHashMap weakHashMap = e53.a;
            boolean isAttachedToWindow = view2.isAttachedToWindow();
            View view3 = fr0Var.mView;
            if (isAttachedToWindow) {
                view3.requestApplyInsets();
            } else {
                view3.addOnAttachStateChangeListener(new w7(i, view3));
            }
            fr0Var.performViewCreated();
            this.a.u(false);
            int visibility = fr0Var.mView.getVisibility();
            fr0Var.setPostOnViewCreatedAlpha(fr0Var.mView.getAlpha());
            if (fr0Var.mContainer != null && visibility == 0) {
                View findFocus = fr0Var.mView.findFocus();
                if (findFocus != null) {
                    fr0Var.setFocusedView(findFocus);
                    if (as0.G(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fr0Var);
                    }
                }
                fr0Var.mView.setAlpha(0.0f);
            }
        }
        fr0Var.mState = 2;
    }

    public final void f() {
        fr0 i;
        boolean G = as0.G(3);
        fr0 fr0Var = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATED: " + fr0Var);
        }
        int i2 = 0;
        boolean z = true;
        boolean z2 = fr0Var.mRemoving && !fr0Var.isInBackStack();
        js0 js0Var = this.b;
        if (z2 && !fr0Var.mBeingSaved) {
        }
        if (!z2) {
            es0 es0Var = (es0) js0Var.p;
            if (!((es0Var.b.containsKey(fr0Var.mWho) && es0Var.e) ? es0Var.f : true)) {
                String str = fr0Var.mTargetWho;
                if (str != null && (i = js0Var.i(str)) != null && i.mRetainInstance) {
                    fr0Var.mTarget = i;
                }
                fr0Var.mState = 0;
                return;
            }
        }
        pr0 pr0Var = fr0Var.mHost;
        if (pr0Var instanceof u53) {
            z = ((es0) js0Var.p).f;
        } else {
            kr0 kr0Var = pr0Var.n;
            if (kr0Var != null) {
                z = true ^ kr0Var.isChangingConfigurations();
            }
        }
        if ((z2 && !fr0Var.mBeingSaved) || z) {
            ((es0) js0Var.p).f(fr0Var);
        }
        fr0Var.performDestroy();
        this.a.l(false);
        ArrayList s = js0Var.s();
        int size = s.size();
        while (i2 < size) {
            Object obj = s.get(i2);
            i2++;
            is0 is0Var = (is0) obj;
            if (is0Var != null) {
                fr0 fr0Var2 = is0Var.c;
                if (fr0Var.mWho.equals(fr0Var2.mTargetWho)) {
                    fr0Var2.mTarget = fr0Var;
                    fr0Var2.mTargetWho = null;
                }
            }
        }
        String str2 = fr0Var.mTargetWho;
        if (str2 != null) {
            fr0Var.mTarget = js0Var.i(str2);
        }
        js0Var.A(this);
    }

    public final void g() {
        View view;
        boolean G = as0.G(3);
        fr0 fr0Var = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fr0Var);
        }
        ViewGroup viewGroup = fr0Var.mContainer;
        if (viewGroup != null && (view = fr0Var.mView) != null) {
            viewGroup.removeView(view);
        }
        fr0Var.performDestroyView();
        this.a.v(false);
        fr0Var.mContainer = null;
        fr0Var.mView = null;
        fr0Var.mViewLifecycleOwner = null;
        fr0Var.mViewLifecycleOwnerLiveData.d(null);
        fr0Var.mInLayout = false;
    }

    public final void h() {
        boolean G = as0.G(3);
        fr0 fr0Var = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fr0Var);
        }
        fr0Var.performDetach();
        this.a.m(false);
        fr0Var.mState = -1;
        fr0Var.mHost = null;
        fr0Var.mParentFragment = null;
        fr0Var.mFragmentManager = null;
        if (!fr0Var.mRemoving || fr0Var.isInBackStack()) {
            es0 es0Var = (es0) this.b.p;
            if (!((es0Var.b.containsKey(fr0Var.mWho) && es0Var.e) ? es0Var.f : true)) {
                return;
            }
        }
        if (as0.G(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fr0Var);
        }
        fr0Var.initState();
    }

    public final void i() {
        fr0 fr0Var = this.c;
        if (fr0Var.mFromLayout && fr0Var.mInLayout && !fr0Var.mPerformedCreateView) {
            if (as0.G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fr0Var);
            }
            fr0Var.performCreateView(fr0Var.performGetLayoutInflater(fr0Var.mSavedFragmentState), null, fr0Var.mSavedFragmentState);
            View view = fr0Var.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fr0Var.mView.setTag(R.id.fragment_container_view_tag, fr0Var);
                if (fr0Var.mHidden) {
                    fr0Var.mView.setVisibility(8);
                }
                fr0Var.performViewCreated();
                this.a.u(false);
                fr0Var.mState = 2;
            }
        }
    }

    public final void j() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        fr0 fr0Var = this.c;
        if (z) {
            if (as0.G(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fr0Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int c = c();
                int i = fr0Var.mState;
                js0 js0Var = this.b;
                if (c == i) {
                    if (!z2 && i == -1 && fr0Var.mRemoving && !fr0Var.isInBackStack() && !fr0Var.mBeingSaved) {
                        if (as0.G(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fr0Var);
                        }
                        ((es0) js0Var.p).f(fr0Var);
                        js0Var.A(this);
                        if (as0.G(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fr0Var);
                        }
                        fr0Var.initState();
                    }
                    if (fr0Var.mHiddenChanged) {
                        if (fr0Var.mView != null && (viewGroup = fr0Var.mContainer) != null) {
                            d90 i2 = d90.i(viewGroup, fr0Var.getParentFragmentManager());
                            if (fr0Var.mHidden) {
                                if (as0.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fr0Var);
                                }
                                i2.b(3, 1, this);
                            } else {
                                if (as0.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fr0Var);
                                }
                                i2.b(2, 1, this);
                            }
                        }
                        as0 as0Var = fr0Var.mFragmentManager;
                        if (as0Var != null && fr0Var.mAdded && as0.H(fr0Var)) {
                            as0Var.D = true;
                        }
                        fr0Var.mHiddenChanged = false;
                        fr0Var.onHiddenChanged(fr0Var.mHidden);
                        fr0Var.mChildFragmentManager.n();
                    }
                    this.d = false;
                    return;
                }
                t21 t21Var = this.a;
                if (c <= i) {
                    switch (i - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            if (fr0Var.mBeingSaved) {
                                if (((hs0) ((HashMap) js0Var.o).get(fr0Var.mWho)) == null) {
                                    m();
                                }
                            }
                            f();
                            break;
                        case 1:
                            g();
                            fr0Var.mState = 1;
                            break;
                        case 2:
                            fr0Var.mInLayout = false;
                            fr0Var.mState = 2;
                            break;
                        case 3:
                            if (as0.G(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fr0Var);
                            }
                            if (fr0Var.mBeingSaved) {
                                m();
                            } else if (fr0Var.mView != null && fr0Var.mSavedViewState == null) {
                                n();
                            }
                            if (fr0Var.mView != null && (viewGroup2 = fr0Var.mContainer) != null) {
                                d90 i3 = d90.i(viewGroup2, fr0Var.getParentFragmentManager());
                                if (as0.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fr0Var);
                                }
                                i3.b(1, 3, this);
                            }
                            fr0Var.mState = 3;
                            break;
                        case 4:
                            if (as0.G(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fr0Var);
                            }
                            fr0Var.performStop();
                            t21Var.t(false);
                            break;
                        case 5:
                            fr0Var.mState = 5;
                            break;
                        case 6:
                            if (as0.G(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fr0Var);
                            }
                            fr0Var.performPause();
                            t21Var.n(false);
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
                            if (as0.G(3)) {
                                Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fr0Var);
                            }
                            fr0Var.performActivityCreated(fr0Var.mSavedFragmentState);
                            t21Var.h(false);
                            break;
                        case 4:
                            if (fr0Var.mView != null && (viewGroup3 = fr0Var.mContainer) != null) {
                                d90 i4 = d90.i(viewGroup3, fr0Var.getParentFragmentManager());
                                int b = in1.b(fr0Var.mView.getVisibility());
                                if (as0.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fr0Var);
                                }
                                i4.b(b, 2, this);
                            }
                            fr0Var.mState = 4;
                            break;
                        case 5:
                            if (as0.G(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fr0Var);
                            }
                            fr0Var.performStart();
                            t21Var.s(false);
                            break;
                        case 6:
                            fr0Var.mState = 6;
                            break;
                        case l42.DOUBLE_FIELD_NUMBER /* 7 */:
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
        fr0 fr0Var = this.c;
        Bundle bundle = fr0Var.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        fr0Var.mSavedViewState = fr0Var.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        fr0Var.mSavedViewRegistryState = fr0Var.mSavedFragmentState.getBundle("android:view_registry_state");
        fr0Var.mTargetWho = fr0Var.mSavedFragmentState.getString("android:target_state");
        if (fr0Var.mTargetWho != null) {
            fr0Var.mTargetRequestCode = fr0Var.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = fr0Var.mSavedUserVisibleHint;
        if (bool != null) {
            fr0Var.mUserVisibleHint = bool.booleanValue();
            fr0Var.mSavedUserVisibleHint = null;
        } else {
            fr0Var.mUserVisibleHint = fr0Var.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (fr0Var.mUserVisibleHint) {
            return;
        }
        fr0Var.mDeferStart = true;
    }

    public final void l() {
        boolean G = as0.G(3);
        fr0 fr0Var = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto RESUMED: " + fr0Var);
        }
        View focusedView = fr0Var.getFocusedView();
        if (focusedView != null) {
            if (focusedView != fr0Var.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != fr0Var.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (as0.G(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                sb.append(" on Fragment ");
                sb.append(fr0Var);
                sb.append(" resulting in focused view ");
                sb.append(fr0Var.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        fr0Var.setFocusedView(null);
        fr0Var.performResume();
        this.a.q(false);
        fr0Var.mSavedFragmentState = null;
        fr0Var.mSavedViewState = null;
        fr0Var.mSavedViewRegistryState = null;
    }

    public final void m() {
        fr0 fr0Var = this.c;
        hs0 hs0Var = new hs0(fr0Var);
        if (fr0Var.mState <= -1 || hs0Var.y != null) {
            hs0Var.y = fr0Var.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            fr0Var.performSaveInstanceState(bundle);
            this.a.r(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (fr0Var.mView != null) {
                n();
            }
            if (fr0Var.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", fr0Var.mSavedViewState);
            }
            if (fr0Var.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", fr0Var.mSavedViewRegistryState);
            }
            if (!fr0Var.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", fr0Var.mUserVisibleHint);
            }
            hs0Var.y = bundle;
            if (fr0Var.mTargetWho != null) {
                if (bundle == null) {
                    hs0Var.y = new Bundle();
                }
                hs0Var.y.putString("android:target_state", fr0Var.mTargetWho);
                int i = fr0Var.mTargetRequestCode;
                if (i != 0) {
                    hs0Var.y.putInt("android:target_req_state", i);
                }
            }
        }
    }

    public final void n() {
        fr0 fr0Var = this.c;
        if (fr0Var.mView == null) {
            return;
        }
        if (as0.G(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fr0Var + " with view " + fr0Var.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fr0Var.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fr0Var.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fr0Var.mViewLifecycleOwner.q.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fr0Var.mSavedViewRegistryState = bundle;
    }

    public is0(t21 t21Var, js0 js0Var, fr0 fr0Var) {
        this.a = t21Var;
        this.b = js0Var;
        this.c = fr0Var;
    }

    public is0(t21 t21Var, js0 js0Var, fr0 fr0Var, hs0 hs0Var) {
        this.a = t21Var;
        this.b = js0Var;
        this.c = fr0Var;
        fr0Var.mSavedViewState = null;
        fr0Var.mSavedViewRegistryState = null;
        fr0Var.mBackStackNesting = 0;
        fr0Var.mInLayout = false;
        fr0Var.mAdded = false;
        fr0 fr0Var2 = fr0Var.mTarget;
        fr0Var.mTargetWho = fr0Var2 != null ? fr0Var2.mWho : null;
        fr0Var.mTarget = null;
        Bundle bundle = hs0Var.y;
        if (bundle != null) {
            fr0Var.mSavedFragmentState = bundle;
        } else {
            fr0Var.mSavedFragmentState = new Bundle();
        }
    }
}
