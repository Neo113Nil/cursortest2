package Q;

import G.C0192d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3897a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3898b = new Object();

    public static final void a(int i2, int i4) {
        if (i2 < 0 || i2 >= i4) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i4 + ')');
        }
    }

    public static final int b(int[] iArr, int i2) {
        int length = iArr.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (i4 + length) >>> 1;
            int i6 = iArr[i5];
            if (i2 > i6) {
                i4 = i5 + 1;
            } else {
                if (i2 >= i6) {
                    return i5;
                }
                length = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static AbstractC0274j c() {
        return (AbstractC0274j) q.f3877a.j();
    }

    public static AbstractC0274j d(AbstractC0274j abstractC0274j) {
        if (abstractC0274j instanceof I) {
            I i2 = (I) abstractC0274j;
            if (i2.f3823t == C0192d.A()) {
                i2.f3821r = null;
                return abstractC0274j;
            }
        }
        if (abstractC0274j instanceof J) {
            J j4 = (J) abstractC0274j;
            if (j4.f3827h == C0192d.A()) {
                j4.f3826g = null;
                return abstractC0274j;
            }
        }
        AbstractC0274j h4 = q.h(abstractC0274j, null, false);
        h4.j();
        return h4;
    }

    public static Object e(Function0 function0, Function1 function1) {
        AbstractC0274j i2;
        if (function1 == null) {
            return function0.invoke();
        }
        AbstractC0274j abstractC0274j = (AbstractC0274j) q.f3877a.j();
        if (abstractC0274j instanceof I) {
            I i4 = (I) abstractC0274j;
            if (i4.f3823t == C0192d.A()) {
                Function1 function12 = i4.f3821r;
                Function1 function13 = i4.f3822s;
                try {
                    ((I) abstractC0274j).f3821r = q.l(function1, function12, true);
                    ((I) abstractC0274j).f3822s = q.b(null, function13);
                    return function0.invoke();
                } finally {
                    i4.f3821r = function12;
                    i4.f3822s = function13;
                }
            }
        }
        if (abstractC0274j == null || (abstractC0274j instanceof C0269e)) {
            i2 = new I(abstractC0274j instanceof C0269e ? (C0269e) abstractC0274j : null, function1, null, true, false);
        } else {
            if (function1 == null) {
                return function0.invoke();
            }
            i2 = abstractC0274j.t(function1);
        }
        try {
            AbstractC0274j j4 = i2.j();
            try {
                return function0.invoke();
            } finally {
                AbstractC0274j.p(j4);
            }
        } finally {
            i2.c();
        }
    }

    public static void f(AbstractC0274j abstractC0274j, AbstractC0274j abstractC0274j2, Function1 function1) {
        if (abstractC0274j != abstractC0274j2) {
            abstractC0274j2.getClass();
            AbstractC0274j.p(abstractC0274j);
            abstractC0274j2.c();
        } else if (abstractC0274j instanceof I) {
            ((I) abstractC0274j).f3821r = function1;
        } else if (abstractC0274j instanceof J) {
            ((J) abstractC0274j).f3826g = function1;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC0274j).toString());
        }
    }

    public static final void g() {
        throw new UnsupportedOperationException();
    }
}
