package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;

/* loaded from: classes5.dex */
public abstract class ExceptionsConstructorKt {
    private static final j ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);

    static {
        j jVar;
        try {
            jVar = n.getANDROID_DETECTED() ? o0.INSTANCE : d.INSTANCE;
        } catch (Throwable unused) {
            jVar = o0.INSTANCE;
        }
        ctorCache = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> f6.l createConstructor(Class<E> cls) {
        Object obj;
        f6.l lVar;
        Pair pair;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new f6.l() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // f6.l
            public final Void invoke(Throwable th) {
                return null;
            }
        };
        if (throwableFields != fieldsCountOrDefault(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i8 = 0;
        while (true) {
            obj = null;
            if (i8 >= length) {
                break;
            }
            final Constructor<?> constructor = constructors[i8];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                pair = y5.h.to(safeCtor(new f6.l() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // f6.l
                    public final Throwable invoke(Throwable th) {
                        Object newInstance = constructor.newInstance(new Object[0]);
                        kotlin.jvm.internal.s.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        Throwable th2 = (Throwable) newInstance;
                        th2.initCause(th);
                        return th2;
                    }
                }), 0);
            } else if (length2 != 1) {
                pair = length2 != 2 ? y5.h.to(null, -1) : (kotlin.jvm.internal.s.areEqual(parameterTypes[0], String.class) && kotlin.jvm.internal.s.areEqual(parameterTypes[1], Throwable.class)) ? y5.h.to(safeCtor(new f6.l() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // f6.l
                    public final Throwable invoke(Throwable th) {
                        Object newInstance = constructor.newInstance(th.getMessage(), th);
                        kotlin.jvm.internal.s.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        return (Throwable) newInstance;
                    }
                }), 3) : y5.h.to(null, -1);
            } else {
                Class<?> cls2 = parameterTypes[0];
                pair = kotlin.jvm.internal.s.areEqual(cls2, String.class) ? y5.h.to(safeCtor(new f6.l() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // f6.l
                    public final Throwable invoke(Throwable th) {
                        Object newInstance = constructor.newInstance(th.getMessage());
                        kotlin.jvm.internal.s.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        Throwable th2 = (Throwable) newInstance;
                        th2.initCause(th);
                        return th2;
                    }
                }), 2) : kotlin.jvm.internal.s.areEqual(cls2, Throwable.class) ? y5.h.to(safeCtor(new f6.l() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // f6.l
                    public final Throwable invoke(Throwable th) {
                        Object newInstance = constructor.newInstance(th);
                        kotlin.jvm.internal.s.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        return (Throwable) newInstance;
                    }
                }), 1) : y5.h.to(null, -1);
            }
            arrayList.add(pair);
            i8++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Pair) obj).getSecond()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((Pair) next).getSecond()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        Pair pair2 = (Pair) obj;
        return (pair2 == null || (lVar = (f6.l) pair2.getFirst()) == null) ? exceptionsConstructorKt$createConstructor$nullResult$1 : lVar;
    }

    private static final int fieldsCount(Class<?> cls, int i8) {
        do {
            int length = cls.getDeclaredFields().length;
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                if (!Modifier.isStatic(r0[i10].getModifiers())) {
                    i9++;
                }
            }
            i8 += i9;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i8;
    }

    static /* synthetic */ int fieldsCount$default(Class cls, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return fieldsCount(cls, i8);
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i8) {
        Object m348constructorimpl;
        e6.a.getKotlinClass(cls);
        try {
            Result.a aVar = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(Integer.valueOf(fieldsCount$default(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(y5.g.createFailure(th));
        }
        Integer valueOf = Integer.valueOf(i8);
        if (Result.m354isFailureimpl(m348constructorimpl)) {
            m348constructorimpl = valueOf;
        }
        return ((Number) m348constructorimpl).intValue();
    }

    private static final f6.l safeCtor(final f6.l lVar) {
        return new f6.l() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1
            {
                super(1);
            }

            @Override // f6.l
            public final Throwable invoke(Throwable th) {
                Object m348constructorimpl;
                f6.l lVar2 = f6.l.this;
                try {
                    Result.a aVar = Result.Companion;
                    Throwable th2 = (Throwable) lVar2.invoke(th);
                    if (!kotlin.jvm.internal.s.areEqual(th.getMessage(), th2.getMessage()) && !kotlin.jvm.internal.s.areEqual(th2.getMessage(), th.toString())) {
                        th2 = null;
                    }
                    m348constructorimpl = Result.m348constructorimpl(th2);
                } catch (Throwable th3) {
                    Result.a aVar2 = Result.Companion;
                    m348constructorimpl = Result.m348constructorimpl(y5.g.createFailure(th3));
                }
                return (Throwable) (Result.m354isFailureimpl(m348constructorimpl) ? null : m348constructorimpl);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E e8) {
        Object m348constructorimpl;
        if (!(e8 instanceof kotlinx.coroutines.f0)) {
            return (E) ctorCache.get(e8.getClass()).invoke(e8);
        }
        try {
            Result.a aVar = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(((kotlinx.coroutines.f0) e8).createCopy());
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(y5.g.createFailure(th));
        }
        if (Result.m354isFailureimpl(m348constructorimpl)) {
            m348constructorimpl = null;
        }
        return (E) m348constructorimpl;
    }
}
