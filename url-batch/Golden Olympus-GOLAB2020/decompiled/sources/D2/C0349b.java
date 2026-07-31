package D2;

import com.ironsource.b9;
import i2.InterfaceC2471a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.AbstractC3244j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h(with = d.class)
@Metadata
/* renamed from: D2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0349b extends i implements List<i>, InterfaceC2471a {

    @NotNull
    public static final a Companion = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final List f375b;

    /* renamed from: D2.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC3527b serializer() {
            return d.f377a;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0349b(List content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.f375b = content;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i4, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i4, Collection<? extends i> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return e((i) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f375b.containsAll(elements);
    }

    public boolean e(i element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f375b.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return Intrinsics.areEqual(this.f375b, obj);
    }

    @Override // java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public i get(int i4) {
        return (i) this.f375b.get(i4);
    }

    public int g() {
        return this.f375b.size();
    }

    public int h(i element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f375b.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f375b.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return h((i) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f375b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f375b.iterator();
    }

    public int k(i element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f375b.lastIndexOf(element);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return k((i) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<i> listIterator() {
        return this.f375b.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ i remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<i> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ i set(int i4, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.List
    public void sort(Comparator<? super i> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<i> subList(int i4, int i5) {
        return this.f375b.subList(i4, i5);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC3244j.a(this);
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.f375b, StringUtils.COMMA, b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<i> listIterator(int i4) {
        return this.f375b.listIterator(i4);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return AbstractC3244j.b(this, array);
    }
}
