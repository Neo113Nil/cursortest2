package androidx.fragment.app;

import E.AbstractC0005f;
import E.AbstractC0024z;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.EnumC0230i;
import com.rockchicken.pump.up.road.R;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import io.flutter.embedding.android.FlutterFragmentActivity;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final L f4923a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f4924b;

    /* renamed from: c, reason: collision with root package name */
    public final F f4925c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4926d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f4927e = -1;

    public m0(L l4, n0 n0Var, F f4) {
        this.f4923a = l4;
        this.f4924b = n0Var;
        this.f4925c = f4;
    }

    public final void a() {
        boolean J4 = f0.J(3);
        F f4 = this.f4925c;
        if (J4) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + f4);
        }
        Bundle bundle = f4.mSavedFragmentState;
        f4.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f4923a.a(f4, false);
    }

    public final void b() {
        F f4;
        View view;
        View view2;
        F f5 = this.f4925c;
        View view3 = f5.mContainer;
        while (true) {
            f4 = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            F f6 = tag instanceof F ? (F) tag : null;
            if (f6 != null) {
                f4 = f6;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        F parentFragment = f5.getParentFragment();
        if (f4 != null && !f4.equals(parentFragment)) {
            int i4 = f5.mContainerId;
            Q.c cVar = Q.d.f2120a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(f5);
            sb.append(" within the view of parent fragment ");
            sb.append(f4);
            sb.append(" via container with ID ");
            Q.d.b(new Q.a(f5, AbstractC0005f.o(sb, i4, " without using parent's childFragmentManager")));
            Q.d.a(f5).getClass();
        }
        ArrayList arrayList = this.f4924b.f4931a;
        ViewGroup viewGroup = f5.mContainer;
        int i5 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(f5);
            int i6 = indexOf - 1;
            while (true) {
                if (i6 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        F f7 = (F) arrayList.get(indexOf);
                        if (f7.mContainer == viewGroup && (view = f7.mView) != null) {
                            i5 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    F f8 = (F) arrayList.get(i6);
                    if (f8.mContainer == viewGroup && (view2 = f8.mView) != null) {
                        i5 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i6--;
                }
            }
        }
        f5.mContainer.addView(f5.mView, i5);
    }

    public final void c() {
        boolean J4 = f0.J(3);
        F f4 = this.f4925c;
        if (J4) {
            Log.d("FragmentManager", "moveto ATTACHED: " + f4);
        }
        F f5 = f4.mTarget;
        m0 m0Var = null;
        n0 n0Var = this.f4924b;
        if (f5 != null) {
            m0 m0Var2 = (m0) n0Var.f4932b.get(f5.mWho);
            if (m0Var2 == null) {
                throw new IllegalStateException("Fragment " + f4 + " declared target fragment " + f4.mTarget + " that does not belong to this FragmentManager!");
            }
            f4.mTargetWho = f4.mTarget.mWho;
            f4.mTarget = null;
            m0Var = m0Var2;
        } else {
            String str = f4.mTargetWho;
            if (str != null && (m0Var = (m0) n0Var.f4932b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(f4);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC0005f.q(sb, f4.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (m0Var != null) {
            m0Var.k();
        }
        f0 f0Var = f4.mFragmentManager;
        f4.mHost = f0Var.v;
        f4.mParentFragment = f0Var.f4867x;
        L l4 = this.f4923a;
        l4.g(f4, false);
        f4.performAttach();
        l4.b(f4, false);
    }

    public final int d() {
        F f4 = this.f4925c;
        if (f4.mFragmentManager == null) {
            return f4.mState;
        }
        int i4 = this.f4927e;
        int ordinal = f4.mMaxState.ordinal();
        if (ordinal == 1) {
            i4 = Math.min(i4, 0);
        } else if (ordinal == 2) {
            i4 = Math.min(i4, 1);
        } else if (ordinal == 3) {
            i4 = Math.min(i4, 5);
        } else if (ordinal != 4) {
            i4 = Math.min(i4, -1);
        }
        if (f4.mFromLayout) {
            if (f4.mInLayout) {
                i4 = Math.max(this.f4927e, 2);
                View view = f4.mView;
                if (view != null && view.getParent() == null) {
                    i4 = Math.min(i4, 2);
                }
            } else {
                i4 = this.f4927e < 4 ? Math.min(i4, f4.mState) : Math.min(i4, 1);
            }
        }
        if (!f4.mAdded) {
            i4 = Math.min(i4, 1);
        }
        ViewGroup viewGroup = f4.mContainer;
        if (viewGroup != null) {
            C0211o j4 = C0211o.j(viewGroup, f4.getParentFragmentManager());
            j4.getClass();
            B0 g4 = j4.g(f4);
            int i5 = g4 != null ? g4.f4724b : 0;
            B0 h2 = j4.h(f4);
            r3 = h2 != null ? h2.f4724b : 0;
            int i6 = i5 == 0 ? -1 : C0.f4752a[M.j.b(i5)];
            if (i6 != -1 && i6 != 1) {
                r3 = i5;
            }
        }
        if (r3 == 2) {
            i4 = Math.min(i4, 6);
        } else if (r3 == 3) {
            i4 = Math.max(i4, 3);
        } else if (f4.mRemoving) {
            i4 = f4.isInBackStack() ? Math.min(i4, 1) : Math.min(i4, -1);
        }
        if (f4.mDeferStart && f4.mState < 5) {
            i4 = Math.min(i4, 4);
        }
        if (f4.mTransitioning && f4.mContainer != null) {
            i4 = Math.max(i4, 3);
        }
        if (f0.J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i4 + " for " + f4);
        }
        return i4;
    }

    public final void e() {
        boolean J4 = f0.J(3);
        F f4 = this.f4925c;
        if (J4) {
            Log.d("FragmentManager", "moveto CREATED: " + f4);
        }
        Bundle bundle = f4.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (f4.mIsCreated) {
            f4.mState = 1;
            f4.restoreChildFragmentState();
        } else {
            L l4 = this.f4923a;
            l4.h(f4, false);
            f4.performCreate(bundle2);
            l4.c(f4, false);
        }
    }

    public final void f() {
        String str;
        F f4 = this.f4925c;
        if (f4.mFromLayout) {
            return;
        }
        if (f0.J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + f4);
        }
        Bundle bundle = f4.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = f4.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = f4.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i4 = f4.mContainerId;
            if (i4 != 0) {
                if (i4 == -1) {
                    throw new IllegalArgumentException(AbstractC0005f.m("Cannot create fragment ", f4, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) f4.mFragmentManager.f4866w.b(i4);
                if (viewGroup == null) {
                    if (!f4.mRestored) {
                        try {
                            str = f4.getResources().getResourceName(f4.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(f4.mContainerId) + " (" + str + ") for fragment " + f4);
                    }
                } else if (!(viewGroup instanceof O)) {
                    Q.c cVar = Q.d.f2120a;
                    Q.d.b(new Q.e(f4, viewGroup, 1));
                    Q.d.a(f4).getClass();
                }
            }
        }
        f4.mContainer = viewGroup;
        f4.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (f4.mView != null) {
            if (f0.J(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + f4);
            }
            f4.mView.setSaveFromParentEnabled(false);
            f4.mView.setTag(R.id.fragment_container_view_tag, f4);
            if (viewGroup != null) {
                b();
            }
            if (f4.mHidden) {
                f4.mView.setVisibility(8);
            }
            if (f4.mView.isAttachedToWindow()) {
                View view = f4.mView;
                Field field = E.H.f375a;
                AbstractC0024z.c(view);
            } else {
                View view2 = f4.mView;
                view2.addOnAttachStateChangeListener(new l0(view2));
            }
            f4.performViewCreated();
            this.f4923a.m(f4, f4.mView, false);
            int visibility = f4.mView.getVisibility();
            f4.setPostOnViewCreatedAlpha(f4.mView.getAlpha());
            if (f4.mContainer != null && visibility == 0) {
                View findFocus = f4.mView.findFocus();
                if (findFocus != null) {
                    f4.setFocusedView(findFocus);
                    if (f0.J(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + f4);
                    }
                }
                f4.mView.setAlpha(0.0f);
            }
        }
        f4.mState = 2;
    }

    public final void g() {
        F b4;
        boolean J4 = f0.J(3);
        F f4 = this.f4925c;
        if (J4) {
            Log.d("FragmentManager", "movefrom CREATED: " + f4);
        }
        boolean z = true;
        int i4 = 0;
        boolean z4 = f4.mRemoving && !f4.isInBackStack();
        n0 n0Var = this.f4924b;
        if (z4 && !f4.mBeingSaved) {
            n0Var.i(null, f4.mWho);
        }
        if (!z4) {
            i0 i0Var = n0Var.f4934d;
            if (!((i0Var.f4886d.containsKey(f4.mWho) && i0Var.f4889g) ? i0Var.f4890h : true)) {
                String str = f4.mTargetWho;
                if (str != null && (b4 = n0Var.b(str)) != null && b4.mRetainInstance) {
                    f4.mTarget = b4;
                }
                f4.mState = 0;
                return;
            }
        }
        Q q4 = f4.mHost;
        if (q4 instanceof androidx.lifecycle.P) {
            z = n0Var.f4934d.f4890h;
        } else {
            FlutterFragmentActivity flutterFragmentActivity = q4.f4773b;
            if (flutterFragmentActivity != null) {
                z = true ^ flutterFragmentActivity.isChangingConfigurations();
            }
        }
        if ((z4 && !f4.mBeingSaved) || z) {
            n0Var.f4934d.d(f4, false);
        }
        f4.performDestroy();
        this.f4923a.d(f4, false);
        ArrayList d4 = n0Var.d();
        int size = d4.size();
        while (i4 < size) {
            Object obj = d4.get(i4);
            i4++;
            m0 m0Var = (m0) obj;
            if (m0Var != null) {
                F f5 = m0Var.f4925c;
                if (f4.mWho.equals(f5.mTargetWho)) {
                    f5.mTarget = f4;
                    f5.mTargetWho = null;
                }
            }
        }
        String str2 = f4.mTargetWho;
        if (str2 != null) {
            f4.mTarget = n0Var.b(str2);
        }
        n0Var.h(this);
    }

    public final void h() {
        View view;
        boolean J4 = f0.J(3);
        F f4 = this.f4925c;
        if (J4) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + f4);
        }
        ViewGroup viewGroup = f4.mContainer;
        if (viewGroup != null && (view = f4.mView) != null) {
            viewGroup.removeView(view);
        }
        f4.performDestroyView();
        this.f4923a.n(f4, false);
        f4.mContainer = null;
        f4.mView = null;
        f4.mViewLifecycleOwner = null;
        f4.mViewLifecycleOwnerLiveData.d(null);
        f4.mInLayout = false;
    }

    public final void i() {
        boolean J4 = f0.J(3);
        F f4 = this.f4925c;
        if (J4) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + f4);
        }
        f4.performDetach();
        this.f4923a.e(f4, false);
        f4.mState = -1;
        f4.mHost = null;
        f4.mParentFragment = null;
        f4.mFragmentManager = null;
        if (!f4.mRemoving || f4.isInBackStack()) {
            i0 i0Var = this.f4924b.f4934d;
            if (!((i0Var.f4886d.containsKey(f4.mWho) && i0Var.f4889g) ? i0Var.f4890h : true)) {
                return;
            }
        }
        if (f0.J(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + f4);
        }
        f4.initState();
    }

    public final void j() {
        F f4 = this.f4925c;
        if (f4.mFromLayout && f4.mInLayout && !f4.mPerformedCreateView) {
            if (f0.J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + f4);
            }
            Bundle bundle = f4.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            f4.performCreateView(f4.performGetLayoutInflater(bundle2), null, bundle2);
            View view = f4.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                f4.mView.setTag(R.id.fragment_container_view_tag, f4);
                if (f4.mHidden) {
                    f4.mView.setVisibility(8);
                }
                f4.performViewCreated();
                this.f4923a.m(f4, f4.mView, false);
                f4.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b4, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.f4926d;
        F f4 = this.f4925c;
        if (z) {
            if (f0.J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + f4);
                return;
            }
            return;
        }
        try {
            this.f4926d = true;
            boolean z4 = false;
            while (true) {
                int d4 = d();
                int i4 = f4.mState;
                n0 n0Var = this.f4924b;
                int i5 = 3;
                if (d4 == i4) {
                    if (!z4 && i4 == -1 && f4.mRemoving && !f4.isInBackStack() && !f4.mBeingSaved) {
                        if (f0.J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + f4);
                        }
                        n0Var.f4934d.d(f4, true);
                        n0Var.h(this);
                        if (f0.J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + f4);
                        }
                        f4.initState();
                    }
                    if (f4.mHiddenChanged) {
                        if (f4.mView != null && (viewGroup = f4.mContainer) != null) {
                            C0211o j4 = C0211o.j(viewGroup, f4.getParentFragmentManager());
                            if (f4.mHidden) {
                                j4.getClass();
                                if (f0.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + f4);
                                }
                                j4.d(3, 1, this);
                            } else {
                                j4.getClass();
                                if (f0.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + f4);
                                }
                                j4.d(2, 1, this);
                            }
                        }
                        f0 f0Var = f4.mFragmentManager;
                        if (f0Var != null && f4.mAdded && f0.K(f4)) {
                            f0Var.f4838F = true;
                        }
                        f4.mHiddenChanged = false;
                        f4.onHiddenChanged(f4.mHidden);
                        f4.mChildFragmentManager.o();
                    }
                    this.f4926d = false;
                    return;
                }
                L l4 = this.f4923a;
                if (d4 <= i4) {
                    switch (i4 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (f4.mBeingSaved) {
                                if (((Bundle) n0Var.f4933c.get(f4.mWho)) == null) {
                                    n0Var.i(n(), f4.mWho);
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            f4.mState = 1;
                            break;
                        case 2:
                            f4.mInLayout = false;
                            f4.mState = 2;
                            break;
                        case 3:
                            if (f0.J(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + f4);
                            }
                            if (f4.mBeingSaved) {
                                n0Var.i(n(), f4.mWho);
                            } else if (f4.mView != null && f4.mSavedViewState == null) {
                                o();
                            }
                            if (f4.mView != null && (viewGroup2 = f4.mContainer) != null) {
                                C0211o j5 = C0211o.j(viewGroup2, f4.getParentFragmentManager());
                                j5.getClass();
                                if (f0.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + f4);
                                }
                                j5.d(1, 3, this);
                            }
                            f4.mState = 3;
                            break;
                        case 4:
                            if (f0.J(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + f4);
                            }
                            f4.performStop();
                            l4.l(f4, false);
                            break;
                        case 5:
                            f4.mState = 5;
                            break;
                        case 6:
                            if (f0.J(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + f4);
                            }
                            f4.performPause();
                            l4.f(f4, false);
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
                            if (f4.mView != null && (viewGroup3 = f4.mContainer) != null) {
                                C0211o j6 = C0211o.j(viewGroup3, f4.getParentFragmentManager());
                                int visibility = f4.mView.getVisibility();
                                if (visibility == 0) {
                                    i5 = 2;
                                } else if (visibility == 4) {
                                    i5 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                j6.getClass();
                                AbstractC0005f.t(i5, "finalState");
                                if (f0.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + f4);
                                }
                                j6.d(i5, 2, this);
                            }
                            f4.mState = 4;
                            break;
                        case 5:
                            if (f0.J(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + f4);
                            }
                            f4.performStart();
                            l4.k(f4, false);
                            break;
                        case 6:
                            f4.mState = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z4 = true;
            }
        } catch (Throwable th) {
            this.f4926d = false;
            throw th;
        }
    }

    public final void l(ClassLoader classLoader) {
        F f4 = this.f4925c;
        Bundle bundle = f4.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (f4.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            f4.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            f4.mSavedViewState = f4.mSavedFragmentState.getSparseParcelableArray("viewState");
            f4.mSavedViewRegistryState = f4.mSavedFragmentState.getBundle("viewRegistryState");
            k0 k0Var = (k0) f4.mSavedFragmentState.getParcelable("state");
            if (k0Var != null) {
                f4.mTargetWho = k0Var.f4905l;
                f4.mTargetRequestCode = k0Var.f4906m;
                Boolean bool = f4.mSavedUserVisibleHint;
                if (bool != null) {
                    f4.mUserVisibleHint = bool.booleanValue();
                    f4.mSavedUserVisibleHint = null;
                } else {
                    f4.mUserVisibleHint = k0Var.n;
                }
            }
            if (f4.mUserVisibleHint) {
                return;
            }
            f4.mDeferStart = true;
        } catch (BadParcelableException e4) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + f4, e4);
        }
    }

    public final void m() {
        boolean J4 = f0.J(3);
        F f4 = this.f4925c;
        if (J4) {
            Log.d("FragmentManager", "moveto RESUMED: " + f4);
        }
        View focusedView = f4.getFocusedView();
        if (focusedView != null) {
            if (focusedView != f4.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != f4.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (f0.J(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(f4);
                sb.append(" resulting in focused view ");
                sb.append(f4.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        f4.setFocusedView(null);
        f4.performResume();
        this.f4923a.i(f4, false);
        this.f4924b.i(null, f4.mWho);
        f4.mSavedFragmentState = null;
        f4.mSavedViewState = null;
        f4.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        F f4 = this.f4925c;
        if (f4.mState == -1 && (bundle = f4.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new k0(f4));
        if (f4.mState > -1) {
            Bundle bundle3 = new Bundle();
            f4.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f4923a.j(f4, bundle3, false);
            Bundle bundle4 = new Bundle();
            f4.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle U4 = f4.mChildFragmentManager.U();
            if (!U4.isEmpty()) {
                bundle2.putBundle("childFragmentManager", U4);
            }
            if (f4.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = f4.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = f4.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = f4.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        F f4 = this.f4925c;
        if (f4.mView == null) {
            return;
        }
        if (f0.J(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + f4 + " with view " + f4.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        f4.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            f4.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        f4.mViewLifecycleOwner.f4995e.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        f4.mSavedViewRegistryState = bundle;
    }

    public m0(L l4, n0 n0Var, ClassLoader classLoader, Y y4, Bundle bundle) {
        this.f4923a = l4;
        this.f4924b = n0Var;
        k0 k0Var = (k0) bundle.getParcelable("state");
        F instantiate = F.instantiate(y4.f4786a.v.f4773b, k0Var.f4894a, null);
        instantiate.mWho = k0Var.f4895b;
        instantiate.mFromLayout = k0Var.f4896c;
        instantiate.mRestored = true;
        instantiate.mFragmentId = k0Var.f4897d;
        instantiate.mContainerId = k0Var.f4898e;
        instantiate.mTag = k0Var.f4899f;
        instantiate.mRetainInstance = k0Var.f4900g;
        instantiate.mRemoving = k0Var.f4901h;
        instantiate.mDetached = k0Var.f4902i;
        instantiate.mHidden = k0Var.f4903j;
        instantiate.mMaxState = EnumC0230i.values()[k0Var.f4904k];
        instantiate.mTargetWho = k0Var.f4905l;
        instantiate.mTargetRequestCode = k0Var.f4906m;
        instantiate.mUserVisibleHint = k0Var.n;
        this.f4925c = instantiate;
        instantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        instantiate.setArguments(bundle2);
        if (f0.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + instantiate);
        }
    }

    public m0(L l4, n0 n0Var, F f4, Bundle bundle) {
        this.f4923a = l4;
        this.f4924b = n0Var;
        this.f4925c = f4;
        f4.mSavedViewState = null;
        f4.mSavedViewRegistryState = null;
        f4.mBackStackNesting = 0;
        f4.mInLayout = false;
        f4.mAdded = false;
        F f5 = f4.mTarget;
        f4.mTargetWho = f5 != null ? f5.mWho : null;
        f4.mTarget = null;
        f4.mSavedFragmentState = bundle;
        f4.mArguments = bundle.getBundle("arguments");
    }
}
