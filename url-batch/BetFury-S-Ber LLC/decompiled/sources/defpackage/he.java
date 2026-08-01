package defpackage;

import com.trembin.nirefon.betfury.data.Note;
import com.trembin.nirefon.betfury.data.NoteDao;
import com.trembin.nirefon.betfury.viewmodel.NotesViewModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class he extends tg0 implements xr {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(NotesViewModel notesViewModel, Note note, tr trVar, dg dgVar) {
        super(dgVar);
        this.j = 2;
        this.l = notesViewModel;
        this.m = note;
        this.n = trVar;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        int i = this.j;
        sk0 sk0Var = sk0.a;
        ah ahVar = (ah) obj;
        dg dgVar = (dg) obj2;
        switch (i) {
        }
        return ((he) i(dgVar, ahVar)).l(sk0Var);
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        int i = this.j;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                return new he((a90) obj3, (u50) obj2, dgVar, 0);
            case 1:
                return new he((String[]) obj3, (w20) obj2, dgVar, 1);
            case 2:
                return new he((NotesViewModel) this.l, (Note) obj3, (tr) obj2, dgVar);
            default:
                he heVar = new he((id) obj3, (xr) obj2, dgVar, 3);
                heVar.l = obj;
                return heVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    @Override // defpackage.f8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        a90 a90Var;
        Set set;
        dg[] dgVarArr;
        Set<String> set2;
        NoteDao noteDao;
        id idVar;
        Throwable a;
        switch (this.j) {
            case 0:
                bh bhVar = bh.COROUTINE_SUSPENDED;
                int i = this.k;
                if (i == 0) {
                    mv.O(obj);
                    a90 a90Var2 = (a90) this.m;
                    u50 u50Var = (u50) this.n;
                    this.l = a90Var2;
                    this.k = 1;
                    Object a2 = u50Var.a(this);
                    if (a2 == bhVar) {
                        return bhVar;
                    }
                    obj = a2;
                    a90Var = a90Var2;
                } else {
                    if (i != 1) {
                        s9.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a90Var = (a90) this.l;
                    mv.O(obj);
                }
                a90Var.f = obj;
                return sk0.a;
            case 1:
                bh bhVar2 = bh.COROUTINE_SUSPENDED;
                int i2 = this.k;
                if (i2 == 0) {
                    mv.O(obj);
                    String[] strArr = (String[]) this.m;
                    Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                    int length = copyOf.length;
                    if (length == 0) {
                        set = ym.f;
                    } else if (length != 1) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(vz.Z(copyOf.length));
                        for (Object obj2 : copyOf) {
                            linkedHashSet.add(obj2);
                        }
                        set = linkedHashSet;
                    } else {
                        set = Collections.singleton(copyOf[0]);
                        set.getClass();
                    }
                    sd0 sd0Var = ((w20) this.n).h;
                    this.l = set;
                    this.k = 1;
                    dg[] dgVarArr2 = bi.f;
                    synchronized (sd0Var) {
                        dgVarArr = dgVarArr2;
                    }
                    for (dg dgVar : dgVarArr) {
                        if (dgVar != null) {
                            dgVar.e(sk0.a);
                        }
                    }
                    if (sk0.a == bhVar2) {
                        return bhVar2;
                    }
                    set2 = set;
                } else {
                    if (i2 != 1) {
                        s9.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set2 = (Set) this.l;
                    mv.O(obj);
                }
                uv uvVar = ((w20) this.n).b;
                set2.getClass();
                ReentrantLock reentrantLock = uvVar.e;
                reentrantLock.lock();
                try {
                    List<l40> q0 = uc.q0(uvVar.d.values());
                    reentrantLock.unlock();
                    for (l40 l40Var : q0) {
                        rv rvVar = l40Var.a;
                        rvVar.getClass();
                        if (!(rvVar instanceof u20)) {
                            Set set3 = ym.f;
                            String[] strArr2 = l40Var.c;
                            int length2 = strArr2.length;
                            if (length2 != 0) {
                                if (length2 != 1) {
                                    ad0 ad0Var = new ad0();
                                    for (String str : set2) {
                                        int length3 = strArr2.length;
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 < length3) {
                                                String str2 = strArr2[i3];
                                                if (uf0.o(str2, str)) {
                                                    ad0Var.add(str2);
                                                } else {
                                                    i3++;
                                                }
                                            }
                                        }
                                    }
                                    set3 = bd0.a(ad0Var);
                                } else if (!set2.isEmpty()) {
                                    Iterator it = set2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (uf0.o((String) it.next(), strArr2[0])) {
                                                set3 = l40Var.d;
                                            }
                                        }
                                    }
                                }
                            }
                            if (!set3.isEmpty()) {
                                l40Var.a.a(set3);
                            }
                        }
                    }
                    return sk0.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 2:
                bh bhVar3 = bh.COROUTINE_SUSPENDED;
                int i4 = this.k;
                if (i4 == 0) {
                    mv.O(obj);
                    noteDao = ((NotesViewModel) this.l).dao;
                    Note note = (Note) this.m;
                    this.k = 1;
                    obj = noteDao.insert(note, this);
                    if (obj == bhVar3) {
                        return bhVar3;
                    }
                } else {
                    if (i4 != 1) {
                        s9.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mv.O(obj);
                }
                ((tr) this.n).h(new Long(((Number) obj).longValue()));
                return sk0.a;
            default:
                bh bhVar4 = bh.COROUTINE_SUSPENDED;
                int i5 = this.k;
                if (i5 == 0) {
                    mv.O(obj);
                    ah ahVar = (ah) this.l;
                    id idVar2 = (id) this.m;
                    xr xrVar = (xr) this.n;
                    try {
                        this.l = idVar2;
                        this.k = 1;
                        obj = xrVar.g(ahVar, this);
                        if (obj == bhVar4) {
                            return bhVar4;
                        }
                        idVar = idVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        idVar = idVar2;
                        obj = new z90(th);
                        a = aa0.a(obj);
                        if (a == null) {
                        }
                        return sk0.a;
                    }
                } else {
                    if (i5 != 1) {
                        s9.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    idVar = (id) this.l;
                    try {
                        mv.O(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        obj = new z90(th);
                        a = aa0.a(obj);
                        if (a == null) {
                        }
                        return sk0.a;
                    }
                }
                a = aa0.a(obj);
                if (a == null) {
                    idVar.F(obj);
                } else {
                    idVar.getClass();
                    idVar.F(new ld(a, false));
                }
                return sk0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he(Object obj, Object obj2, dg dgVar, int i) {
        super(dgVar);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }
}
