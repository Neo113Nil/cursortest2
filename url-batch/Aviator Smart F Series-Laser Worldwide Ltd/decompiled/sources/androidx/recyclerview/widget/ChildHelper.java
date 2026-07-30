package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class ChildHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "ChildrenHelper";
    final Callback mCallback;
    final Bucket mBucket = new Bucket();
    final List<View> mHiddenViews = new ArrayList();

    static class Bucket {
        static final int BITS_PER_WORD = 64;
        static final long LAST_BIT = Long.MIN_VALUE;
        long mData = 0;
        Bucket mNext;

        Bucket() {
        }

        private void ensureNext() {
            if (this.mNext == null) {
                this.mNext = new Bucket();
            }
        }

        void clear(int i8) {
            if (i8 < 64) {
                this.mData &= ~(1 << i8);
                return;
            }
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.clear(i8 - 64);
            }
        }

        int countOnesBefore(int i8) {
            Bucket bucket = this.mNext;
            return bucket == null ? i8 >= 64 ? Long.bitCount(this.mData) : Long.bitCount(this.mData & ((1 << i8) - 1)) : i8 < 64 ? Long.bitCount(this.mData & ((1 << i8) - 1)) : bucket.countOnesBefore(i8 - 64) + Long.bitCount(this.mData);
        }

        boolean get(int i8) {
            if (i8 < 64) {
                return (this.mData & (1 << i8)) != 0;
            }
            ensureNext();
            return this.mNext.get(i8 - 64);
        }

        void insert(int i8, boolean z7) {
            if (i8 >= 64) {
                ensureNext();
                this.mNext.insert(i8 - 64, z7);
                return;
            }
            long j8 = this.mData;
            boolean z8 = (Long.MIN_VALUE & j8) != 0;
            long j9 = (1 << i8) - 1;
            this.mData = ((j8 & (~j9)) << 1) | (j8 & j9);
            if (z7) {
                set(i8);
            } else {
                clear(i8);
            }
            if (z8 || this.mNext != null) {
                ensureNext();
                this.mNext.insert(0, z8);
            }
        }

        boolean remove(int i8) {
            if (i8 >= 64) {
                ensureNext();
                return this.mNext.remove(i8 - 64);
            }
            long j8 = 1 << i8;
            long j9 = this.mData;
            boolean z7 = (j9 & j8) != 0;
            long j10 = j9 & (~j8);
            this.mData = j10;
            long j11 = j8 - 1;
            this.mData = (j10 & j11) | Long.rotateRight((~j11) & j10, 1);
            Bucket bucket = this.mNext;
            if (bucket != null) {
                if (bucket.get(0)) {
                    set(63);
                }
                this.mNext.remove(0);
            }
            return z7;
        }

        void reset() {
            this.mData = 0L;
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.reset();
            }
        }

        void set(int i8) {
            if (i8 < 64) {
                this.mData |= 1 << i8;
            } else {
                ensureNext();
                this.mNext.set(i8 - 64);
            }
        }

        public String toString() {
            if (this.mNext == null) {
                return Long.toBinaryString(this.mData);
            }
            return this.mNext.toString() + "xx" + Long.toBinaryString(this.mData);
        }
    }

    interface Callback {
        void addView(View view, int i8);

        void attachViewToParent(View view, int i8, ViewGroup.LayoutParams layoutParams);

        void detachViewFromParent(int i8);

        View getChildAt(int i8);

        int getChildCount();

        RecyclerView.ViewHolder getChildViewHolder(View view);

        int indexOfChild(View view);

        void onEnteredHiddenState(View view);

        void onLeftHiddenState(View view);

        void removeAllViews();

        void removeViewAt(int i8);
    }

    ChildHelper(Callback callback) {
        this.mCallback = callback;
    }

    private int getOffset(int i8) {
        if (i8 < 0) {
            return -1;
        }
        int childCount = this.mCallback.getChildCount();
        int i9 = i8;
        while (i9 < childCount) {
            int countOnesBefore = i8 - (i9 - this.mBucket.countOnesBefore(i9));
            if (countOnesBefore == 0) {
                while (this.mBucket.get(i9)) {
                    i9++;
                }
                return i9;
            }
            i9 += countOnesBefore;
        }
        return -1;
    }

    private void hideViewInternal(View view) {
        this.mHiddenViews.add(view);
        this.mCallback.onEnteredHiddenState(view);
    }

    private boolean unhideViewInternal(View view) {
        if (!this.mHiddenViews.remove(view)) {
            return false;
        }
        this.mCallback.onLeftHiddenState(view);
        return true;
    }

    void addView(View view, boolean z7) {
        addView(view, -1, z7);
    }

    void attachViewToParent(View view, int i8, ViewGroup.LayoutParams layoutParams, boolean z7) {
        int childCount = i8 < 0 ? this.mCallback.getChildCount() : getOffset(i8);
        this.mBucket.insert(childCount, z7);
        if (z7) {
            hideViewInternal(view);
        }
        this.mCallback.attachViewToParent(view, childCount, layoutParams);
    }

    void detachViewFromParent(int i8) {
        int offset = getOffset(i8);
        this.mBucket.remove(offset);
        this.mCallback.detachViewFromParent(offset);
    }

    View findHiddenNonRemovedView(int i8) {
        int size = this.mHiddenViews.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view = this.mHiddenViews.get(i9);
            RecyclerView.ViewHolder childViewHolder = this.mCallback.getChildViewHolder(view);
            if (childViewHolder.getLayoutPosition() == i8 && !childViewHolder.isInvalid() && !childViewHolder.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    View getChildAt(int i8) {
        return this.mCallback.getChildAt(getOffset(i8));
    }

    int getChildCount() {
        return this.mCallback.getChildCount() - this.mHiddenViews.size();
    }

    View getUnfilteredChildAt(int i8) {
        return this.mCallback.getChildAt(i8);
    }

    int getUnfilteredChildCount() {
        return this.mCallback.getChildCount();
    }

    void hide(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild >= 0) {
            this.mBucket.set(indexOfChild);
            hideViewInternal(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int indexOfChild(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild == -1 || this.mBucket.get(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.mBucket.countOnesBefore(indexOfChild);
    }

    boolean isHidden(View view) {
        return this.mHiddenViews.contains(view);
    }

    void removeAllViewsUnfiltered() {
        this.mBucket.reset();
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            this.mCallback.onLeftHiddenState(this.mHiddenViews.get(size));
            this.mHiddenViews.remove(size);
        }
        this.mCallback.removeAllViews();
    }

    void removeView(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild < 0) {
            return;
        }
        if (this.mBucket.remove(indexOfChild)) {
            unhideViewInternal(view);
        }
        this.mCallback.removeViewAt(indexOfChild);
    }

    void removeViewAt(int i8) {
        int offset = getOffset(i8);
        View childAt = this.mCallback.getChildAt(offset);
        if (childAt == null) {
            return;
        }
        if (this.mBucket.remove(offset)) {
            unhideViewInternal(childAt);
        }
        this.mCallback.removeViewAt(offset);
    }

    boolean removeViewIfHidden(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild == -1) {
            unhideViewInternal(view);
            return true;
        }
        if (!this.mBucket.get(indexOfChild)) {
            return false;
        }
        this.mBucket.remove(indexOfChild);
        unhideViewInternal(view);
        this.mCallback.removeViewAt(indexOfChild);
        return true;
    }

    public String toString() {
        return this.mBucket.toString() + ", hidden list:" + this.mHiddenViews.size();
    }

    void unhide(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.mBucket.get(indexOfChild)) {
            this.mBucket.clear(indexOfChild);
            unhideViewInternal(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    void addView(View view, int i8, boolean z7) {
        int childCount = i8 < 0 ? this.mCallback.getChildCount() : getOffset(i8);
        this.mBucket.insert(childCount, z7);
        if (z7) {
            hideViewInternal(view);
        }
        this.mCallback.addView(view, childCount);
    }
}
