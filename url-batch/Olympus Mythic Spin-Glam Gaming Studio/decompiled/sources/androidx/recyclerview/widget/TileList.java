package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* loaded from: classes15.dex */
class TileList<T> {
    Tile mLastAccessedTile;
    private final SparseArray mTiles;

    public int size() {
        return this.mTiles.size();
    }

    public void clear() {
        this.mTiles.clear();
    }

    public Tile getAtIndex(int i) {
        if (i < 0 || i >= this.mTiles.size()) {
            return null;
        }
        return (Tile) this.mTiles.valueAt(i);
    }

    public Tile addOrReplace(Tile tile) {
        int indexOfKey = this.mTiles.indexOfKey(tile.mStartPosition);
        if (indexOfKey < 0) {
            this.mTiles.put(tile.mStartPosition, tile);
            return null;
        }
        Tile tile2 = (Tile) this.mTiles.valueAt(indexOfKey);
        this.mTiles.setValueAt(indexOfKey, tile);
        if (this.mLastAccessedTile == tile2) {
            this.mLastAccessedTile = tile;
        }
        return tile2;
    }

    public Tile removeAtPos(int i) {
        Tile tile = (Tile) this.mTiles.get(i);
        if (this.mLastAccessedTile == tile) {
            this.mLastAccessedTile = null;
        }
        this.mTiles.delete(i);
        return tile;
    }

    public static class Tile<T> {
        public int mItemCount;
        public final Object[] mItems;
        Tile mNext;
        public int mStartPosition;

        Tile(Class cls, int i) {
            this.mItems = (Object[]) Array.newInstance((Class<?>) cls, i);
        }
    }
}
