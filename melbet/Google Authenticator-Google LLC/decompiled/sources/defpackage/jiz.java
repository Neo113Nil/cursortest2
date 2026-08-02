package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jiz implements jlk {
    public static void f(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof jlg) {
            List a = ((jlg) iterable).a();
            jlg jlgVar = (jlg) list;
            int size = list.size();
            for (Object obj : a) {
                if (obj == null) {
                    String str = "Element at index " + (jlgVar.size() - size) + " is null.";
                    int size2 = jlgVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        jlgVar.remove(size2);
                    }
                } else if (obj instanceof jjq) {
                    jlgVar.b();
                } else if (obj instanceof byte[]) {
                    jjq.r((byte[]) obj);
                    jlgVar.b();
                } else {
                    jlgVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof jls) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof jlu) {
                jlu jluVar = (jlu) list;
                int size4 = list.size() + size3;
                int length = jluVar.b.length;
                if (size4 > length) {
                    if (length == 0) {
                        jluVar.b = new Object[Math.max(size4, 10)];
                    } else {
                        while (length < size4) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        jluVar.b = Arrays.copyOf(jluVar.b, length);
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i = 0; i < size6; i++) {
            Object obj3 = list2.get(i);
            if (obj3 == null) {
                m(list, size5);
            }
            list.add(obj3);
        }
    }

    private static void m(List list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* renamed from: a */
    public abstract jiz clone();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jlk
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract jiz d(jja jjaVar);

    @Override // defpackage.jlk
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final jiz e(byte[] bArr, jkd jkdVar) {
        return j(bArr, bArr.length, jkdVar);
    }

    /* renamed from: g */
    public abstract void h(jju jjuVar, jkd jkdVar);

    @Override // defpackage.jlk
    public /* bridge */ /* synthetic */ void h(jju jjuVar, jkd jkdVar) {
        throw null;
    }

    @Override // defpackage.jlk
    public final /* bridge */ /* synthetic */ void i(byte[] bArr) {
        l(bArr, bArr.length);
    }

    public jiz j(byte[] bArr, int i, jkd jkdVar) {
        throw null;
    }

    @Override // defpackage.jlk
    public final /* bridge */ /* synthetic */ void k(jjq jjqVar) {
        try {
            jju f = jjqVar.f();
            h(f, jkd.a);
            f.D(0);
        } catch (jld e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
        }
    }

    public void l(byte[] bArr, int i) {
        throw null;
    }
}
