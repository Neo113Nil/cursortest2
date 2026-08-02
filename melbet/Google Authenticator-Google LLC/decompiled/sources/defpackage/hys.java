package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hys {
    public static final hys a = new hys();
    private final AtomicReference b = new AtomicReference(new ikm(new ikm((char[]) null), (byte[]) null));

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void a(hyv hyvVar) {
        AtomicReference atomicReference = this.b;
        ikm ikmVar = new ikm((ikm) atomicReference.get());
        ?? r1 = ikmVar.a;
        Class a2 = hyvVar.a();
        if (r1.containsKey(a2)) {
            hyv hyvVar2 = (hyv) r1.get(a2);
            if (!hyvVar2.equals(hyvVar) || !hyvVar.equals(hyvVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(a2.toString()));
            }
        } else {
            r1.put(a2, hyvVar);
        }
        atomicReference.set(new ikm(ikmVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    public final synchronized void b(ikm ikmVar) {
        AtomicReference atomicReference = this.b;
        ikm ikmVar2 = new ikm((ikm) atomicReference.get());
        if (ikmVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        hyu hyuVar = new hyu((Class) ikmVar.b, (Class) ikmVar.a);
        ?? r1 = ikmVar2.b;
        if (r1.containsKey(hyuVar)) {
            ikm ikmVar3 = (ikm) r1.get(hyuVar);
            if (!ikmVar3.equals(ikmVar) || !ikmVar.equals(ikmVar3)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(hyuVar.toString()));
            }
        } else {
            r1.put(hyuVar, ikmVar);
        }
        atomicReference.set(new ikm(ikmVar2, (byte[]) null));
    }
}
