package me.yokeyword.fragmentation;

import android.view.View;
import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import me.yokeyword.fragmentation.helper.internal.b;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: me.yokeyword.fragmentation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0370a {
        void add(d dVar);

        void replace(d dVar);

        void start(d dVar);
    }

    static final class b extends a implements InterfaceC0370a {
        private FragmentActivity mActivity;
        private Fragment mFragment;
        private boolean mFromActivity;
        private me.yokeyword.fragmentation.helper.internal.b mRecord = new me.yokeyword.fragmentation.helper.internal.b();
        private d mSupportF;
        private h mTransactionDelegate;

        /* JADX WARN: Multi-variable type inference failed */
        b(FragmentActivity fragmentActivity, d dVar, h hVar, boolean z7) {
            this.mActivity = fragmentActivity;
            this.mSupportF = dVar;
            this.mFragment = (Fragment) dVar;
            this.mTransactionDelegate = hVar;
            this.mFromActivity = z7;
        }

        private FragmentManager getFragmentManager() {
            Fragment fragment = this.mFragment;
            return fragment == null ? this.mActivity.getSupportFragmentManager() : fragment.getFragmentManager();
        }

        @Override // me.yokeyword.fragmentation.a.InterfaceC0370a
        public void add(d dVar) {
            dVar.getSupportDelegate().mTransactionRecord = this.mRecord;
            this.mTransactionDelegate.dispatchStartTransaction(getFragmentManager(), this.mSupportF, dVar, 0, 0, 2);
        }

        @Override // me.yokeyword.fragmentation.a
        public a addSharedElement(View view, String str) {
            me.yokeyword.fragmentation.helper.internal.b bVar = this.mRecord;
            if (bVar.sharedElementList == null) {
                bVar.sharedElementList = new ArrayList<>();
            }
            this.mRecord.sharedElementList.add(new b.a(view, str));
            return this;
        }

        @Override // me.yokeyword.fragmentation.a
        public InterfaceC0370a dontAddToBackStack() {
            this.mRecord.dontAddToBackStack = true;
            return this;
        }

        @Override // me.yokeyword.fragmentation.a
        public void loadRootFragment(int i8, d dVar) {
            loadRootFragment(i8, dVar, true, false);
        }

        @Override // me.yokeyword.fragmentation.a
        public void popTo(String str, boolean z7) {
            popTo(str, z7, null, Integer.MAX_VALUE);
        }

        @Override // me.yokeyword.fragmentation.a
        public void popToChild(String str, boolean z7) {
            popToChild(str, z7, null, Integer.MAX_VALUE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.yokeyword.fragmentation.a
        public void remove(d dVar, boolean z7) {
            this.mTransactionDelegate.remove(getFragmentManager(), (Fragment) dVar, z7);
        }

        @Override // me.yokeyword.fragmentation.a, me.yokeyword.fragmentation.a.InterfaceC0370a
        public void replace(d dVar) {
            dVar.getSupportDelegate().mTransactionRecord = this.mRecord;
            this.mTransactionDelegate.dispatchStartTransaction(getFragmentManager(), this.mSupportF, dVar, 0, 0, 10);
        }

        @Override // me.yokeyword.fragmentation.a
        public a setCustomAnimations(@AnimRes int i8, @AnimRes int i9) {
            me.yokeyword.fragmentation.helper.internal.b bVar = this.mRecord;
            bVar.targetFragmentEnter = i8;
            bVar.currentFragmentPopExit = i9;
            bVar.currentFragmentPopEnter = 0;
            bVar.targetFragmentExit = 0;
            return this;
        }

        @Override // me.yokeyword.fragmentation.a
        public a setTag(String str) {
            this.mRecord.tag = str;
            return this;
        }

        @Override // me.yokeyword.fragmentation.a, me.yokeyword.fragmentation.a.InterfaceC0370a
        public void start(d dVar) {
            start(dVar, 0);
        }

        @Override // me.yokeyword.fragmentation.a
        public void startDontHideSelf(d dVar) {
            dVar.getSupportDelegate().mTransactionRecord = this.mRecord;
            this.mTransactionDelegate.dispatchStartTransaction(getFragmentManager(), this.mSupportF, dVar, 0, 0, 2);
        }

        @Override // me.yokeyword.fragmentation.a
        public void startForResult(d dVar, int i8) {
            dVar.getSupportDelegate().mTransactionRecord = this.mRecord;
            this.mTransactionDelegate.dispatchStartTransaction(getFragmentManager(), this.mSupportF, dVar, i8, 0, 1);
        }

        @Override // me.yokeyword.fragmentation.a
        public void startForResultDontHideSelf(d dVar, int i8) {
            dVar.getSupportDelegate().mTransactionRecord = this.mRecord;
            this.mTransactionDelegate.dispatchStartTransaction(getFragmentManager(), this.mSupportF, dVar, i8, 0, 3);
        }

        @Override // me.yokeyword.fragmentation.a
        public void startWithPop(d dVar) {
            dVar.getSupportDelegate().mTransactionRecord = this.mRecord;
            this.mTransactionDelegate.startWithPop(getFragmentManager(), this.mSupportF, dVar);
        }

        @Override // me.yokeyword.fragmentation.a
        public void startWithPopTo(d dVar, String str, boolean z7) {
            dVar.getSupportDelegate().mTransactionRecord = this.mRecord;
            this.mTransactionDelegate.startWithPopTo(getFragmentManager(), this.mSupportF, dVar, str, z7);
        }

        @Override // me.yokeyword.fragmentation.a
        public void loadRootFragment(int i8, d dVar, boolean z7, boolean z8) {
            dVar.getSupportDelegate().mTransactionRecord = this.mRecord;
            this.mTransactionDelegate.loadRootTransaction(getFragmentManager(), i8, dVar, z7, z8);
        }

        @Override // me.yokeyword.fragmentation.a
        public void popTo(String str, boolean z7, Runnable runnable, int i8) {
            this.mTransactionDelegate.popTo(str, z7, runnable, getFragmentManager(), i8);
        }

        @Override // me.yokeyword.fragmentation.a
        public void popToChild(String str, boolean z7, Runnable runnable, int i8) {
            if (this.mFromActivity) {
                popTo(str, z7, runnable, i8);
            } else {
                this.mTransactionDelegate.popTo(str, z7, runnable, this.mFragment.getChildFragmentManager(), i8);
            }
        }

        @Override // me.yokeyword.fragmentation.a
        public void start(d dVar, int i8) {
            dVar.getSupportDelegate().mTransactionRecord = this.mRecord;
            this.mTransactionDelegate.dispatchStartTransaction(getFragmentManager(), this.mSupportF, dVar, 0, i8, 0);
        }

        @Override // me.yokeyword.fragmentation.a
        public void startDontHideSelf(d dVar, int i8) {
            dVar.getSupportDelegate().mTransactionRecord = this.mRecord;
            this.mTransactionDelegate.dispatchStartTransaction(getFragmentManager(), this.mSupportF, dVar, 0, i8, 2);
        }

        @Override // me.yokeyword.fragmentation.a
        public a setCustomAnimations(@AnimRes int i8, @AnimRes int i9, @AnimRes int i10, @AnimRes int i11) {
            me.yokeyword.fragmentation.helper.internal.b bVar = this.mRecord;
            bVar.targetFragmentEnter = i8;
            bVar.currentFragmentPopExit = i9;
            bVar.currentFragmentPopEnter = i10;
            bVar.targetFragmentExit = i11;
            return this;
        }
    }

    @RequiresApi(22)
    public abstract a addSharedElement(View view, String str);

    public abstract InterfaceC0370a dontAddToBackStack();

    public abstract void loadRootFragment(int i8, d dVar);

    public abstract void loadRootFragment(int i8, d dVar, boolean z7, boolean z8);

    public abstract void popTo(String str, boolean z7);

    public abstract void popTo(String str, boolean z7, Runnable runnable, int i8);

    public abstract void popToChild(String str, boolean z7);

    public abstract void popToChild(String str, boolean z7, Runnable runnable, int i8);

    public abstract void remove(d dVar, boolean z7);

    public abstract void replace(d dVar);

    public abstract a setCustomAnimations(@AnimRes @AnimatorRes int i8, @AnimRes @AnimatorRes int i9);

    public abstract a setCustomAnimations(@AnimRes @AnimatorRes int i8, @AnimRes @AnimatorRes int i9, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11);

    public abstract a setTag(String str);

    public abstract void start(d dVar);

    public abstract void start(d dVar, int i8);

    public abstract void startDontHideSelf(d dVar);

    public abstract void startDontHideSelf(d dVar, int i8);

    public abstract void startForResult(d dVar, int i8);

    public abstract void startForResultDontHideSelf(d dVar, int i8);

    public abstract void startWithPop(d dVar);

    public abstract void startWithPopTo(d dVar, String str, boolean z7);
}
