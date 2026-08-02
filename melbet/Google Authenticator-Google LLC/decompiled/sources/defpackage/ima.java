package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ima {
    public static final void a(jjq jjqVar, ArrayDeque arrayDeque) {
        if (!jjqVar.n()) {
            if (!(jjqVar instanceof jly)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(jjqVar.getClass()))));
            }
            jly jlyVar = (jly) jjqVar;
            int[] iArr = jly.a;
            a(jlyVar.c, arrayDeque);
            a(jlyVar.e, arrayDeque);
            return;
        }
        int b = b(jjqVar.c());
        int l = jly.l(b + 1);
        if (arrayDeque.isEmpty() || ((jjq) arrayDeque.peek()).c() >= l) {
            arrayDeque.push(jjqVar);
            return;
        }
        int l2 = jly.l(b);
        jjq jjqVar2 = (jjq) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((jjq) arrayDeque.peek()).c() < l2) {
            jjqVar2 = new jly((jjq) arrayDeque.pop(), jjqVar2);
        }
        jly jlyVar2 = new jly(jjqVar2, jjqVar);
        while (!arrayDeque.isEmpty()) {
            if (((jjq) arrayDeque.peek()).c() >= jly.l(b(jlyVar2.b) + 1)) {
                break;
            } else {
                jlyVar2 = new jly((jjq) arrayDeque.pop(), jlyVar2);
            }
        }
        arrayDeque.push(jlyVar2);
    }

    private static final int b(int i) {
        int binarySearch = Arrays.binarySearch(jly.a, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
