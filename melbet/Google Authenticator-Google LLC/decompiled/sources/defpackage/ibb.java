package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibb implements iai {
    public final Set a;
    public final iai b;
    private final Set c;
    private final Set d;

    public ibb(iah iahVar, iai iaiVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (ian ianVar : iahVar.b) {
            if (ianVar.a()) {
                if (ianVar.b()) {
                    hashSet4.add(ianVar.a);
                } else {
                    hashSet.add(ianVar.a);
                }
            } else if (ianVar.b()) {
                hashSet5.add(ianVar.a);
            } else {
                hashSet2.add(ianVar.a);
            }
        }
        if (!iahVar.d.isEmpty()) {
            hashSet.add(new iaz(iay.class, icb.class));
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
        this.d = DesugarCollections.unmodifiableSet(hashSet2);
        DesugarCollections.unmodifiableSet(hashSet3);
        this.a = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        Set set = iahVar.d;
        this.b = iaiVar;
    }

    @Override // defpackage.iai
    public final icd a(iaz iazVar) {
        throw null;
    }

    @Override // defpackage.iai
    public final icd b(Class cls) {
        iaz iazVar = new iaz(iay.class, cls);
        if (this.d.contains(iazVar)) {
            return this.b.a(iazVar);
        }
        throw new iap(String.format("Attempting to request an undeclared dependency Provider<%s>.", iazVar));
    }

    @Override // defpackage.iai
    public final icd c(iaz iazVar) {
        throw null;
    }

    @Override // defpackage.iai
    public final Object d(Class cls) {
        if (!this.c.contains(new iaz(iay.class, cls))) {
            throw new iap(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object at = hnu.at(this.b, cls);
        if (!cls.equals(icb.class)) {
            return at;
        }
        return new iba();
    }
}
