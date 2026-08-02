package net.idrnd.face.iad.capture.internal;

import android.util.Range;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes9.dex */
public final class m3 {
    public f$$ExternalSyntheticLambda0 c;
    public final TreeSet b = new TreeSet();
    public final long a = 1165;

    public final synchronized void a(f3 f3Var) {
        try {
            this.b.add(f3Var);
            TreeSet treeSet = this.b;
            if (treeSet.size() > 1 && ((f3) CollectionsKt.last(treeSet)).b() - ((f3) CollectionsKt.first(treeSet)).b() > this.a) {
                ArrayList arrayList = new ArrayList();
                int size = treeSet.size();
                for (int i = 0; i < size && ((f3) CollectionsKt.last(treeSet)).b() - ((f3) CollectionsKt.first(treeSet)).b() >= this.a; i++) {
                    f3 f3Var2 = (f3) CollectionsKt.first(treeSet);
                    treeSet.remove(f3Var2);
                    arrayList.add(f3Var2);
                    if (treeSet.size() == 1) {
                        break;
                    }
                }
                if (this.c != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((f3) it.next()).close();
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized f3 b() {
        if (this.b.size() < 2) {
            return null;
        }
        long b = ((f3) this.b.last()).b() - 1000;
        if (b < 0) {
            return null;
        }
        return a(new Range(0L, Long.valueOf(b)));
    }

    public final f3 a(Range range) {
        int i;
        if (this.b.size() >= 2) {
            Object lower = range.getLower();
            lower.getClass();
            if (((Number) lower).longValue() >= 0) {
                synchronized (this.b) {
                    try {
                        Iterator it = this.b.iterator();
                        i = -1;
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (i2 >= 0) {
                                if (range.contains((Range) Long.valueOf(((f3) next).b()))) {
                                    i = i2;
                                }
                                i2++;
                            } else {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i >= 0) {
                    return (f3) CollectionsKt.elementAt(this.b, i);
                }
            }
        }
        return null;
    }

    public final synchronized f3 a(long j) {
        if (this.b.size() < 2) {
            return null;
        }
        long j2 = j - 1000;
        if (j2 < 0) {
            return null;
        }
        return a(new Range(0L, Long.valueOf(j2)));
    }
}
