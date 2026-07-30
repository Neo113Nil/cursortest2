package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: com.facebook.ads.redexgen.X.kH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1569kH<V> extends AbstractCollection<V> {
    public static String[] A05 = {"rqzSAKJ", "Uo9MABssBS", "mR3bTKcN7ZIAbRFpbr7LAtSCi4h3sTdh", "ulxkUHqusQ2hc", "jTRt3NctDptZQmGsUWy4", "uonWZoVLan", "T3ZzXYv3r2YYUNfl", "kcTFJWPVSfF4RZcKupXan"};
    public Collection<V> A00;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/1i<TK;TV;>.WrappedCollection; */
    @CheckForNull
    public final C1569kH A01;

    @ParametricNullness
    public final K A02;

    @CheckForNull
    public final Collection<V> A03;
    public final /* synthetic */ AbstractC00801i A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            if (A05[1].length() != 10) {
                throw new RuntimeException();
            }
            A05[3] = "QAr";
            return false;
        }
        int size = size();
        boolean addAll = this.A00.addAll(collection);
        if (addAll) {
            AbstractC00801i.A02(this.A04, this.A00.size() - size);
            if (size == 0) {
                A03();
            }
        }
        return addAll;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> c) {
        if (c.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.A00.removeAll(c);
        if (removeAll) {
            AbstractC00801i.A02(this.A04, this.A00.size() - size);
            A05();
        }
        return removeAll;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/Collection<TV;>;Lcom/facebook/ads/redexgen/X/1i<TK;TV;>.WrappedCollection;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C1569kH(@ParametricNullness final AbstractC00801i this$0, @CheckForNull Object key, Collection delegate, C1569kH ancestor) {
        this.A04 = this$0;
        this.A02 = key;
        this.A00 = delegate;
        this.A01 = ancestor;
        this.A03 = ancestor == null ? null : ancestor.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    /* JADX WARN: Incorrect inner types in method signature: ()Lcom/facebook/ads/redexgen/X/1i<TK;TV;>.WrappedCollection; */
    @CheckForNull
    public final C1569kH A00() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    @ParametricNullness
    public final K A01() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    public final Collection<V> A02() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    public final void A03() {
        Map map;
        if (this.A01 == null) {
            map = this.A04.A01;
            map.put(this.A02, this.A00);
            return;
        }
        C1569kH c1569kH = this.A01;
        String[] strArr = A05;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A05[7] = "7Y1hqBLSL7LmfxEryJAxk";
        c1569kH.A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    public final void A04() {
        Map map;
        if (this.A01 != null) {
            this.A01.A04();
            if (this.A01.A02() == this.A03) {
            } else {
                throw new ConcurrentModificationException();
            }
        } else if (this.A00.isEmpty()) {
            map = this.A04.A01;
            Collection<V> newDelegate = (Collection) map.get(this.A02);
            if (newDelegate == null) {
                return;
            }
            this.A00 = newDelegate;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    public final void A05() {
        Map map;
        if (this.A01 != null) {
            this.A01.A05();
        } else if (this.A00.isEmpty()) {
            map = this.A04.A01;
            map.remove(this.A02);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(@ParametricNullness V value) {
        A04();
        boolean isEmpty = this.A00.isEmpty();
        boolean changed = this.A00.add(value);
        if (changed) {
            AbstractC00801i.A00(this.A04);
            if (isEmpty) {
                A03();
            }
        }
        return changed;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.A00.clear();
        AbstractC00801i.A03(this.A04, size);
        A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object o) {
        A04();
        return this.A00.contains(o);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> c) {
        A04();
        return this.A00.containsAll(c);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    @Override // java.util.Collection
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        A04();
        boolean equals = this.A00.equals(object);
        if (A05[2].charAt(26) == 'z') {
            throw new RuntimeException();
        }
        A05[1] = "HgkJ6BYskp";
        return equals;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    @Override // java.util.Collection
    public final int hashCode() {
        A04();
        return this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        A04();
        return new C1568kG(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object o) {
        A04();
        boolean remove = this.A00.remove(o);
        if (remove) {
            AbstractC00801i.A01(this.A04);
            A05();
        }
        return remove;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> c) {
        AbstractC1501jA.A04(c);
        int size = size();
        boolean retainAll = this.A00.retainAll(c);
        if (retainAll) {
            int size2 = this.A00.size();
            AbstractC00801i abstractC00801i = this.A04;
            int i = size2 - size;
            String[] strArr = A05;
            String str = strArr[0];
            String str2 = strArr[4];
            int length = str.length();
            int oldSize = str2.length();
            if (length == oldSize) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "TlQ3bLp";
            strArr2[4] = "xplS7Hw4TBXGB9jePVjO";
            AbstractC00801i.A02(abstractC00801i, i);
            A05();
        }
        return retainAll;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        A04();
        return this.A00.size();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    @Override // java.util.AbstractCollection
    public final String toString() {
        A04();
        return this.A00.toString();
    }
}
