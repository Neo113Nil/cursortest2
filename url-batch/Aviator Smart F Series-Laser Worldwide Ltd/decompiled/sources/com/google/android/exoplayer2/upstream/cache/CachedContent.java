package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

@Deprecated
/* loaded from: classes3.dex */
final class CachedContent {
    private static final String TAG = "CachedContent";
    private final TreeSet<SimpleCacheSpan> cachedSpans;
    public final int id;
    public final String key;
    private final ArrayList<Range> lockedRanges;
    private DefaultContentMetadata metadata;

    private static final class Range {
        public final long length;
        public final long position;

        public Range(long j8, long j9) {
            this.position = j8;
            this.length = j9;
        }

        public boolean contains(long j8, long j9) {
            long j10 = this.length;
            if (j10 == -1) {
                return j8 >= this.position;
            }
            if (j9 == -1) {
                return false;
            }
            long j11 = this.position;
            return j11 <= j8 && j8 + j9 <= j11 + j10;
        }

        public boolean intersects(long j8, long j9) {
            long j10 = this.position;
            if (j10 > j8) {
                return j9 == -1 || j8 + j9 > j10;
            }
            long j11 = this.length;
            return j11 == -1 || j10 + j11 > j8;
        }
    }

    public CachedContent(int i8, String str) {
        this(i8, str, DefaultContentMetadata.EMPTY);
    }

    public void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.cachedSpans.add(simpleCacheSpan);
    }

    public boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
        this.metadata = this.metadata.copyWithMutationsApplied(contentMetadataMutations);
        return !r2.equals(r0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CachedContent.class != obj.getClass()) {
            return false;
        }
        CachedContent cachedContent = (CachedContent) obj;
        return this.id == cachedContent.id && this.key.equals(cachedContent.key) && this.cachedSpans.equals(cachedContent.cachedSpans) && this.metadata.equals(cachedContent.metadata);
    }

    public long getCachedBytesLength(long j8, long j9) {
        Assertions.checkArgument(j8 >= 0);
        Assertions.checkArgument(j9 >= 0);
        SimpleCacheSpan span = getSpan(j8, j9);
        if (span.isHoleSpan()) {
            return -Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.length, j9);
        }
        long j10 = j8 + j9;
        long j11 = j10 >= 0 ? j10 : Long.MAX_VALUE;
        long j12 = span.position + span.length;
        if (j12 < j11) {
            for (SimpleCacheSpan simpleCacheSpan : this.cachedSpans.tailSet(span, false)) {
                long j13 = simpleCacheSpan.position;
                if (j13 > j12) {
                    break;
                }
                j12 = Math.max(j12, j13 + simpleCacheSpan.length);
                if (j12 >= j11) {
                    break;
                }
            }
        }
        return Math.min(j12 - j8, j9);
    }

    public DefaultContentMetadata getMetadata() {
        return this.metadata;
    }

    public SimpleCacheSpan getSpan(long j8, long j9) {
        SimpleCacheSpan createLookup = SimpleCacheSpan.createLookup(this.key, j8);
        SimpleCacheSpan floor = this.cachedSpans.floor(createLookup);
        if (floor != null && floor.position + floor.length > j8) {
            return floor;
        }
        SimpleCacheSpan ceiling = this.cachedSpans.ceiling(createLookup);
        if (ceiling != null) {
            long j10 = ceiling.position - j8;
            j9 = j9 == -1 ? j10 : Math.min(j10, j9);
        }
        return SimpleCacheSpan.createHole(this.key, j8, j9);
    }

    public TreeSet<SimpleCacheSpan> getSpans() {
        return this.cachedSpans;
    }

    public int hashCode() {
        return (((this.id * 31) + this.key.hashCode()) * 31) + this.metadata.hashCode();
    }

    public boolean isEmpty() {
        return this.cachedSpans.isEmpty();
    }

    public boolean isFullyLocked(long j8, long j9) {
        for (int i8 = 0; i8 < this.lockedRanges.size(); i8++) {
            if (this.lockedRanges.get(i8).contains(j8, j9)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullyUnlocked() {
        return this.lockedRanges.isEmpty();
    }

    public boolean lockRange(long j8, long j9) {
        for (int i8 = 0; i8 < this.lockedRanges.size(); i8++) {
            if (this.lockedRanges.get(i8).intersects(j8, j9)) {
                return false;
            }
        }
        this.lockedRanges.add(new Range(j8, j9));
        return true;
    }

    public boolean removeSpan(CacheSpan cacheSpan) {
        if (!this.cachedSpans.remove(cacheSpan)) {
            return false;
        }
        File file = cacheSpan.file;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public SimpleCacheSpan setLastTouchTimestamp(SimpleCacheSpan simpleCacheSpan, long j8, boolean z7) {
        Assertions.checkState(this.cachedSpans.remove(simpleCacheSpan));
        File file = (File) Assertions.checkNotNull(simpleCacheSpan.file);
        if (z7) {
            File cacheFile = SimpleCacheSpan.getCacheFile((File) Assertions.checkNotNull(file.getParentFile()), this.id, simpleCacheSpan.position, j8);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                Log.w(TAG, "Failed to rename " + file + " to " + cacheFile);
            }
        }
        SimpleCacheSpan copyWithFileAndLastTouchTimestamp = simpleCacheSpan.copyWithFileAndLastTouchTimestamp(file, j8);
        this.cachedSpans.add(copyWithFileAndLastTouchTimestamp);
        return copyWithFileAndLastTouchTimestamp;
    }

    public void unlockRange(long j8) {
        for (int i8 = 0; i8 < this.lockedRanges.size(); i8++) {
            if (this.lockedRanges.get(i8).position == j8) {
                this.lockedRanges.remove(i8);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public CachedContent(int i8, String str, DefaultContentMetadata defaultContentMetadata) {
        this.id = i8;
        this.key = str;
        this.metadata = defaultContentMetadata;
        this.cachedSpans = new TreeSet<>();
        this.lockedRanges = new ArrayList<>();
    }
}
