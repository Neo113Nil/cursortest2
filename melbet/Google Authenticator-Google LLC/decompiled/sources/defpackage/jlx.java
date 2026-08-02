package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jlx implements Iterator {
    private final ArrayDeque a;
    private jjn b;

    public jlx(jjq jjqVar) {
        if (!(jjqVar instanceof jly)) {
            this.a = null;
            this.b = (jjn) jjqVar;
            return;
        }
        jly jlyVar = (jly) jjqVar;
        ArrayDeque arrayDeque = new ArrayDeque(jlyVar.f);
        this.a = arrayDeque;
        arrayDeque.push(jlyVar);
        this.b = b(jlyVar.c);
    }

    private final jjn b(jjq jjqVar) {
        while (jjqVar instanceof jly) {
            jly jlyVar = (jly) jjqVar;
            this.a.push(jlyVar);
            int[] iArr = jly.a;
            jjqVar = jlyVar.c;
        }
        return (jjn) jjqVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jjn next() {
        jjn jjnVar;
        jjn jjnVar2 = this.b;
        if (jjnVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            jjnVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            jly jlyVar = (jly) arrayDeque.pop();
            int[] iArr = jly.a;
            jjnVar = b(jlyVar.e);
        } while (jjnVar.v());
        this.b = jjnVar;
        return jjnVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
