package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lbh implements krx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lbh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0109, code lost:
    
        if (r8 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b8  */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    @Override // defpackage.krx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, Object obj2) {
        Object obj3;
        kol kolVar;
        Object obj4;
        kwu kwuVar = null;
        if (this.b == 0) {
            int intValue = ((Integer) obj).intValue();
            kql kqlVar = (kql) obj2;
            kqm key = kqlVar.getKey();
            kql kqlVar2 = ((lbe) this.a).b.get(key);
            if (key != kwu.d) {
                if (kqlVar != kqlVar2) {
                    intValue = Integer.MIN_VALUE;
                }
                intValue++;
            } else {
                kwu kwuVar2 = (kwu) kqlVar2;
                kqlVar.getClass();
                for (kwu kwuVar3 = (kwu) kqlVar; kwuVar3 != null; kwuVar3 = ((lcy) kwuVar3).cd()) {
                    if (kwuVar3 == kwuVar2 || !(kwuVar3 instanceof lcy)) {
                        kwuVar = kwuVar3;
                        break;
                    }
                }
                if (kwuVar != kwuVar2) {
                    throw new IllegalStateException(a.ac(kwuVar2, kwuVar, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ", ", expected child of ", ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"));
                }
            }
            return Integer.valueOf(intValue);
        }
        CharSequence charSequence = (CharSequence) obj;
        int intValue2 = ((Integer) obj2).intValue();
        charSequence.getClass();
        ?? r8 = this.a;
        if (r8.size() == 1) {
            String str = (String) ixc.i(r8);
            int i = ksp.i(charSequence, str, intValue2, false);
            if (i >= 0) {
                kolVar = new kol(Integer.valueOf(i), str);
                if (kolVar != null) {
                    return null;
                }
                return new kol(kolVar.a, Integer.valueOf(((String) kolVar.b).length()));
            }
            kolVar = null;
            if (kolVar != null) {
            }
        } else {
            kth kthVar = new kth(ksl.f(intValue2, 0), charSequence.length());
            if (charSequence instanceof String) {
                int i2 = kthVar.a;
                int i3 = kthVar.b;
                if (i2 <= i3) {
                    while (true) {
                        Iterator it = r8.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            String str2 = (String) obj4;
                            if (ksp.w(str2, (String) charSequence, i2, str2.length(), false)) {
                                break;
                            }
                        }
                        String str3 = (String) obj4;
                        if (str3 != null) {
                            kolVar = new kol(Integer.valueOf(i2), str3);
                            break;
                        }
                        if (i2 == i3) {
                            break;
                        }
                        i2++;
                    }
                }
                kolVar = null;
                if (kolVar != null) {
                }
            } else {
                int i4 = kthVar.a;
                int i5 = kthVar.b;
                if (i4 <= i5) {
                    while (true) {
                        Iterator it2 = r8.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            String str4 = (String) obj3;
                            if (ksp.p(str4, charSequence, i4, str4.length(), false)) {
                                break;
                            }
                        }
                        String str5 = (String) obj3;
                        if (str5 != null) {
                            kolVar = new kol(Integer.valueOf(i4), str5);
                            break;
                        }
                        if (i4 == i5) {
                            break;
                        }
                        i4++;
                    }
                }
                kolVar = null;
                if (kolVar != null) {
                }
            }
        }
    }
}
