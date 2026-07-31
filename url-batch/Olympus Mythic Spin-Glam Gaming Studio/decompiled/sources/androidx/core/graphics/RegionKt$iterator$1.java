package androidx.core.graphics;

import android.graphics.Rect;
import android.graphics.RegionIterator;
import com.yandex.div.core.ScrollDirection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: Region.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/core/graphics/RegionKt$iterator$1", "", "Landroid/graphics/Rect;", "", "hasNext", "()Z", ScrollDirection.NEXT, "()Landroid/graphics/Rect;", "Landroid/graphics/RegionIterator;", "iterator", "Landroid/graphics/RegionIterator;", "rect", "Landroid/graphics/Rect;", "hasMore", "Z", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RegionKt$iterator$1 implements Iterator<Rect>, KMappedMarker {
    private boolean hasMore;
    private final RegionIterator iterator;
    private final Rect rect;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasMore;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Rect next() {
        if (this.hasMore) {
            Rect rect = new Rect(this.rect);
            this.hasMore = this.iterator.next(this.rect);
            return rect;
        }
        throw new IndexOutOfBoundsException();
    }
}
