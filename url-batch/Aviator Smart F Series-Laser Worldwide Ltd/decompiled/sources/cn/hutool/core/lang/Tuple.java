package cn.hutool.core.lang;

import cn.hutool.core.collection.ArrayIter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* loaded from: classes.dex */
public class Tuple extends f.a implements Iterable<Object>, Serializable {
    private static final long serialVersionUID = -7689304393482182157L;
    private boolean cacheHash;
    private int hashCode;
    private final Object[] members;

    public Tuple(Object... objArr) {
        this.members = objArr;
    }

    public boolean contains(Object obj) {
        return cn.hutool.core.util.h.contains(this.members, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.deepEquals(this.members, ((Tuple) obj).members);
        }
        return false;
    }

    public <T> T get(int i8) {
        return (T) this.members[i8];
    }

    public Object[] getMembers() {
        return this.members;
    }

    public int hashCode() {
        int i8;
        if (this.cacheHash && (i8 = this.hashCode) != 0) {
            return i8;
        }
        int deepHashCode = 31 + Arrays.deepHashCode(this.members);
        if (this.cacheHash) {
            this.hashCode = deepHashCode;
        }
        return deepHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return new ArrayIter(this.members);
    }

    public final Stream<Object> parallelStream() {
        Stream<Object> stream;
        stream = StreamSupport.stream(spliterator(), true);
        return stream;
    }

    public Tuple setCacheHash(boolean z7) {
        this.cacheHash = z7;
        return this;
    }

    public int size() {
        return this.members.length;
    }

    @Override // java.lang.Iterable
    public final Spliterator<Object> spliterator() {
        Spliterator<Object> spliterator;
        spliterator = Spliterators.spliterator(this.members, 16);
        return spliterator;
    }

    public final Stream<Object> stream() {
        Stream<Object> stream;
        stream = Arrays.stream(this.members);
        return stream;
    }

    public final Tuple sub(int i8, int i9) {
        return new Tuple(cn.hutool.core.util.h.sub(this.members, i8, i9));
    }

    public final List<Object> toList() {
        return cn.hutool.core.collection.n0.toList(this.members);
    }

    public String toString() {
        return Arrays.toString(this.members);
    }
}
