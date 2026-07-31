package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;

/* loaded from: classes10.dex */
public class AsyncListUtil<T> {
    boolean mAllowScrollHints;
    final ThreadUtil.BackgroundCallback mBackgroundProxy;
    final DataCallback mDataCallback;
    int mDisplayedGeneration;
    int mItemCount;
    final ThreadUtil.MainThreadCallback mMainThreadProxy;
    final SparseIntArray mMissingPositions;
    final int[] mPrevRange;
    int mRequestedGeneration;
    private int mScrollHint;
    final Class mTClass;
    final TileList mTileList;
    final int mTileSize;
    final int[] mTmpRange;
    final int[] mTmpRangeExtended;
    final ViewCallback mViewCallback;

    public static abstract class DataCallback<T> {
        public abstract void fillData(Object[] objArr, int i, int i2);

        public int getMaxCachedTiles() {
            return 10;
        }

        public void recycleData(Object[] objArr, int i) {
        }

        public abstract int refreshData();
    }

    void updateRange() {
        int i;
        this.mViewCallback.getItemRangeInto(this.mTmpRange);
        int[] iArr = this.mTmpRange;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 > i3 || i2 < 0 || i3 >= this.mItemCount) {
            return;
        }
        if (!this.mAllowScrollHints) {
            this.mScrollHint = 0;
        } else {
            int[] iArr2 = this.mPrevRange;
            if (i2 > iArr2[1] || (i = iArr2[0]) > i3) {
                this.mScrollHint = 0;
            } else if (i2 < i) {
                this.mScrollHint = 1;
            } else if (i2 > i) {
                this.mScrollHint = 2;
            }
        }
        int[] iArr3 = this.mPrevRange;
        iArr3[0] = i2;
        iArr3[1] = i3;
        this.mViewCallback.extendRangeInto(iArr, this.mTmpRangeExtended, this.mScrollHint);
        int[] iArr4 = this.mTmpRangeExtended;
        iArr4[0] = Math.min(this.mTmpRange[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.mTmpRangeExtended;
        iArr5[1] = Math.max(this.mTmpRange[1], Math.min(iArr5[1], this.mItemCount - 1));
        ThreadUtil.BackgroundCallback backgroundCallback = this.mBackgroundProxy;
        int[] iArr6 = this.mTmpRange;
        int i4 = iArr6[0];
        int i5 = iArr6[1];
        int[] iArr7 = this.mTmpRangeExtended;
        backgroundCallback.updateRange(i4, i5, iArr7[0], iArr7[1], this.mScrollHint);
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListUtil$1, reason: invalid class name */
    class AnonymousClass1 implements ThreadUtil.MainThreadCallback<T> {
        final /* synthetic */ AsyncListUtil this$0;

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i, int i2) {
            if (isRequestedGeneration(i)) {
                AsyncListUtil asyncListUtil = this.this$0;
                asyncListUtil.mItemCount = i2;
                asyncListUtil.mViewCallback.onDataRefresh();
                AsyncListUtil asyncListUtil2 = this.this$0;
                asyncListUtil2.mDisplayedGeneration = asyncListUtil2.mRequestedGeneration;
                recycleAllTiles();
                AsyncListUtil asyncListUtil3 = this.this$0;
                asyncListUtil3.mAllowScrollHints = false;
                asyncListUtil3.updateRange();
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i, TileList.Tile tile) {
            if (!isRequestedGeneration(i)) {
                this.this$0.mBackgroundProxy.recycleTile(tile);
                return;
            }
            TileList.Tile addOrReplace = this.this$0.mTileList.addOrReplace(tile);
            if (addOrReplace != null) {
                Log.e("AsyncListUtil", "duplicate tile @" + addOrReplace.mStartPosition);
                this.this$0.mBackgroundProxy.recycleTile(addOrReplace);
            }
            int i2 = tile.mStartPosition + tile.mItemCount;
            int i3 = 0;
            while (i3 < this.this$0.mMissingPositions.size()) {
                int keyAt = this.this$0.mMissingPositions.keyAt(i3);
                if (tile.mStartPosition > keyAt || keyAt >= i2) {
                    i3++;
                } else {
                    this.this$0.mMissingPositions.removeAt(i3);
                    this.this$0.mViewCallback.onItemLoaded(keyAt);
                }
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i, int i2) {
            if (isRequestedGeneration(i)) {
                TileList.Tile removeAtPos = this.this$0.mTileList.removeAtPos(i2);
                if (removeAtPos == null) {
                    Log.e("AsyncListUtil", "tile not found @" + i2);
                    return;
                }
                this.this$0.mBackgroundProxy.recycleTile(removeAtPos);
            }
        }

        private void recycleAllTiles() {
            for (int i = 0; i < this.this$0.mTileList.size(); i++) {
                AsyncListUtil asyncListUtil = this.this$0;
                asyncListUtil.mBackgroundProxy.recycleTile(asyncListUtil.mTileList.getAtIndex(i));
            }
            this.this$0.mTileList.clear();
        }

        private boolean isRequestedGeneration(int i) {
            return i == this.this$0.mRequestedGeneration;
        }
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListUtil$2, reason: invalid class name */
    class AnonymousClass2 implements ThreadUtil.BackgroundCallback<T> {
        private int mFirstRequiredTileStart;
        private int mGeneration;
        private int mItemCount;
        private int mLastRequiredTileStart;
        final SparseBooleanArray mLoadedTiles;
        private TileList.Tile mRecycledRoot;
        final /* synthetic */ AsyncListUtil this$0;

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i) {
            this.mGeneration = i;
            this.mLoadedTiles.clear();
            int refreshData = this.this$0.mDataCallback.refreshData();
            this.mItemCount = refreshData;
            this.this$0.mMainThreadProxy.updateItemCount(this.mGeneration, refreshData);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i, int i2, int i3, int i4, int i5) {
            if (i > i2) {
                return;
            }
            int tileStart = getTileStart(i);
            int tileStart2 = getTileStart(i2);
            this.mFirstRequiredTileStart = getTileStart(i3);
            int tileStart3 = getTileStart(i4);
            this.mLastRequiredTileStart = tileStart3;
            if (i5 == 1) {
                requestTiles(this.mFirstRequiredTileStart, tileStart2, i5, true);
                requestTiles(tileStart2 + this.this$0.mTileSize, this.mLastRequiredTileStart, i5, false);
            } else {
                requestTiles(tileStart, tileStart3, i5, false);
                requestTiles(this.mFirstRequiredTileStart, tileStart - this.this$0.mTileSize, i5, true);
            }
        }

        private int getTileStart(int i) {
            return i - (i % this.this$0.mTileSize);
        }

        private void requestTiles(int i, int i2, int i3, boolean z) {
            int i4 = i;
            while (i4 <= i2) {
                this.this$0.mBackgroundProxy.loadTile(z ? (i2 + i) - i4 : i4, i3);
                i4 += this.this$0.mTileSize;
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i, int i2) {
            if (isTileLoaded(i)) {
                return;
            }
            TileList.Tile acquireTile = acquireTile();
            acquireTile.mStartPosition = i;
            int min = Math.min(this.this$0.mTileSize, this.mItemCount - i);
            acquireTile.mItemCount = min;
            this.this$0.mDataCallback.fillData(acquireTile.mItems, acquireTile.mStartPosition, min);
            flushTileCache(i2);
            addTile(acquireTile);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(TileList.Tile tile) {
            this.this$0.mDataCallback.recycleData(tile.mItems, tile.mItemCount);
            tile.mNext = this.mRecycledRoot;
            this.mRecycledRoot = tile;
        }

        private TileList.Tile acquireTile() {
            TileList.Tile tile = this.mRecycledRoot;
            if (tile != null) {
                this.mRecycledRoot = tile.mNext;
                return tile;
            }
            AsyncListUtil asyncListUtil = this.this$0;
            return new TileList.Tile(asyncListUtil.mTClass, asyncListUtil.mTileSize);
        }

        private boolean isTileLoaded(int i) {
            return this.mLoadedTiles.get(i);
        }

        private void addTile(TileList.Tile tile) {
            this.mLoadedTiles.put(tile.mStartPosition, true);
            this.this$0.mMainThreadProxy.addTile(this.mGeneration, tile);
        }

        private void removeTile(int i) {
            this.mLoadedTiles.delete(i);
            this.this$0.mMainThreadProxy.removeTile(this.mGeneration, i);
        }

        private void flushTileCache(int i) {
            int maxCachedTiles = this.this$0.mDataCallback.getMaxCachedTiles();
            while (this.mLoadedTiles.size() >= maxCachedTiles) {
                int keyAt = this.mLoadedTiles.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.mLoadedTiles;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i2 = this.mFirstRequiredTileStart - keyAt;
                int i3 = keyAt2 - this.mLastRequiredTileStart;
                if (i2 > 0 && (i2 >= i3 || i == 2)) {
                    removeTile(keyAt);
                } else {
                    if (i3 <= 0) {
                        return;
                    }
                    if (i2 >= i3 && i != 1) {
                        return;
                    } else {
                        removeTile(keyAt2);
                    }
                }
            }
        }
    }

    public static abstract class ViewCallback {
        public abstract void getItemRangeInto(int[] iArr);

        public abstract void onDataRefresh();

        public abstract void onItemLoaded(int i);

        public void extendRangeInto(int[] iArr, int[] iArr2, int i) {
            int i2 = iArr[1];
            int i3 = iArr[0];
            int i4 = (i2 - i3) + 1;
            int i5 = i4 / 2;
            iArr2[0] = i3 - (i == 1 ? i4 : i5);
            if (i != 2) {
                i4 = i5;
            }
            iArr2[1] = i2 + i4;
        }
    }
}
