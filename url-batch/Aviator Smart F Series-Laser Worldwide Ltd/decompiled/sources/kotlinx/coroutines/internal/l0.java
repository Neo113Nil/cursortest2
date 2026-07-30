package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
public class l0 {
    private static final AtomicIntegerFieldUpdater _size$FU = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    private m0[] f17052a;

    private final m0[] realloc() {
        m0[] m0VarArr = this.f17052a;
        if (m0VarArr == null) {
            m0[] m0VarArr2 = new m0[4];
            this.f17052a = m0VarArr2;
            return m0VarArr2;
        }
        if (getSize() < m0VarArr.length) {
            return m0VarArr;
        }
        Object[] copyOf = Arrays.copyOf(m0VarArr, getSize() * 2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        m0[] m0VarArr3 = (m0[]) copyOf;
        this.f17052a = m0VarArr3;
        return m0VarArr3;
    }

    private final void setSize(int i8) {
        _size$FU.set(this, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void siftDownFrom(int i8) {
        while (true) {
            int i9 = i8 * 2;
            int i10 = i9 + 1;
            if (i10 >= getSize()) {
                return;
            }
            m0[] m0VarArr = this.f17052a;
            kotlin.jvm.internal.s.checkNotNull(m0VarArr);
            int i11 = i9 + 2;
            if (i11 < getSize()) {
                m0 m0Var = m0VarArr[i11];
                kotlin.jvm.internal.s.checkNotNull(m0Var);
                m0 m0Var2 = m0VarArr[i10];
                kotlin.jvm.internal.s.checkNotNull(m0Var2);
            }
            i11 = i10;
            m0 m0Var3 = m0VarArr[i8];
            kotlin.jvm.internal.s.checkNotNull(m0Var3);
            m0 m0Var4 = m0VarArr[i11];
            kotlin.jvm.internal.s.checkNotNull(m0Var4);
            if (((Comparable) m0Var3).compareTo(m0Var4) <= 0) {
                return;
            }
            swap(i8, i11);
            i8 = i11;
        }
    }

    private final void siftUpFrom(int i8) {
        while (i8 > 0) {
            m0[] m0VarArr = this.f17052a;
            kotlin.jvm.internal.s.checkNotNull(m0VarArr);
            int i9 = (i8 - 1) / 2;
            m0 m0Var = m0VarArr[i9];
            kotlin.jvm.internal.s.checkNotNull(m0Var);
            m0 m0Var2 = m0VarArr[i8];
            kotlin.jvm.internal.s.checkNotNull(m0Var2);
            if (((Comparable) m0Var).compareTo(m0Var2) <= 0) {
                return;
            }
            swap(i8, i9);
            i8 = i9;
        }
    }

    private final void swap(int i8, int i9) {
        m0[] m0VarArr = this.f17052a;
        kotlin.jvm.internal.s.checkNotNull(m0VarArr);
        m0 m0Var = m0VarArr[i9];
        kotlin.jvm.internal.s.checkNotNull(m0Var);
        m0 m0Var2 = m0VarArr[i8];
        kotlin.jvm.internal.s.checkNotNull(m0Var2);
        m0VarArr[i8] = m0Var;
        m0VarArr[i9] = m0Var2;
        m0Var.setIndex(i8);
        m0Var2.setIndex(i9);
    }

    public final void addImpl(m0 m0Var) {
        m0Var.setHeap(this);
        m0[] realloc = realloc();
        int size = getSize();
        setSize(size + 1);
        realloc[size] = m0Var;
        m0Var.setIndex(size);
        siftUpFrom(size);
    }

    public final void addLast(m0 m0Var) {
        synchronized (this) {
            addImpl(m0Var);
            y5.w wVar = y5.w.INSTANCE;
        }
    }

    public final boolean addLastIf(m0 m0Var, f6.l lVar) {
        boolean z7;
        synchronized (this) {
            try {
                if (((Boolean) lVar.invoke(firstImpl())).booleanValue()) {
                    addImpl(m0Var);
                    z7 = true;
                } else {
                    z7 = false;
                }
                kotlin.jvm.internal.r.finallyStart(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.r.finallyStart(1);
                kotlin.jvm.internal.r.finallyEnd(1);
                throw th;
            }
        }
        kotlin.jvm.internal.r.finallyEnd(1);
        return z7;
    }

    public final void clear() {
        synchronized (this) {
            try {
                m0[] m0VarArr = this.f17052a;
                if (m0VarArr != null) {
                    kotlin.collections.k.fill$default(m0VarArr, (Object) null, 0, 0, 6, (Object) null);
                }
                _size$FU.set(this, 0);
                y5.w wVar = y5.w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final m0 find(f6.l lVar) {
        m0 m0Var;
        synchronized (this) {
            try {
                int size = getSize();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    m0[] m0VarArr = this.f17052a;
                    m0Var = m0VarArr != null ? m0VarArr[i8] : null;
                    kotlin.jvm.internal.s.checkNotNull(m0Var);
                    if (((Boolean) lVar.invoke(m0Var)).booleanValue()) {
                        break;
                    }
                    i8++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m0Var;
    }

    public final m0 firstImpl() {
        m0[] m0VarArr = this.f17052a;
        if (m0VarArr != null) {
            return m0VarArr[0];
        }
        return null;
    }

    public final int getSize() {
        return _size$FU.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final m0 peek() {
        m0 firstImpl;
        synchronized (this) {
            firstImpl = firstImpl();
        }
        return firstImpl;
    }

    public final boolean remove(m0 m0Var) {
        boolean z7;
        synchronized (this) {
            if (m0Var.getHeap() == null) {
                z7 = false;
            } else {
                removeAtImpl(m0Var.getIndex());
                z7 = true;
            }
        }
        return z7;
    }

    public final m0 removeAtImpl(int i8) {
        m0[] m0VarArr = this.f17052a;
        kotlin.jvm.internal.s.checkNotNull(m0VarArr);
        setSize(getSize() - 1);
        if (i8 < getSize()) {
            swap(i8, getSize());
            int i9 = (i8 - 1) / 2;
            if (i8 > 0) {
                m0 m0Var = m0VarArr[i8];
                kotlin.jvm.internal.s.checkNotNull(m0Var);
                m0 m0Var2 = m0VarArr[i9];
                kotlin.jvm.internal.s.checkNotNull(m0Var2);
                if (((Comparable) m0Var).compareTo(m0Var2) < 0) {
                    swap(i8, i9);
                    siftUpFrom(i9);
                }
            }
            siftDownFrom(i8);
        }
        m0 m0Var3 = m0VarArr[getSize()];
        kotlin.jvm.internal.s.checkNotNull(m0Var3);
        m0Var3.setHeap(null);
        m0Var3.setIndex(-1);
        m0VarArr[getSize()] = null;
        return m0Var3;
    }

    public final m0 removeFirstIf(f6.l lVar) {
        synchronized (this) {
            try {
                m0 firstImpl = firstImpl();
                if (firstImpl == null) {
                    kotlin.jvm.internal.r.finallyStart(2);
                    kotlin.jvm.internal.r.finallyEnd(2);
                    return null;
                }
                m0 removeAtImpl = ((Boolean) lVar.invoke(firstImpl)).booleanValue() ? removeAtImpl(0) : null;
                kotlin.jvm.internal.r.finallyStart(1);
                kotlin.jvm.internal.r.finallyEnd(1);
                return removeAtImpl;
            } catch (Throwable th) {
                kotlin.jvm.internal.r.finallyStart(1);
                kotlin.jvm.internal.r.finallyEnd(1);
                throw th;
            }
        }
    }

    public final m0 removeFirstOrNull() {
        m0 removeAtImpl;
        synchronized (this) {
            removeAtImpl = getSize() > 0 ? removeAtImpl(0) : null;
        }
        return removeAtImpl;
    }
}
