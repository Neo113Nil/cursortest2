package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hyt {
    public static final hyt a = (hyt) hyx.a(new hxq(9));
    private final AtomicReference b = new AtomicReference(new iwq(new iwq((byte[]) null), (byte[]) null));

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void a(bry bryVar) {
        AtomicReference atomicReference = this.b;
        iwq iwqVar = new iwq((iwq) atomicReference.get());
        ?? r2 = iwqVar.a;
        Object obj = bryVar.a;
        if (r2.containsKey(obj)) {
            bry bryVar2 = (bry) r2.get(obj);
            if (!bryVar2.equals(bryVar) || !bryVar.equals(bryVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(obj.toString()));
            }
        } else {
            r2.put(obj, bryVar);
        }
        atomicReference.set(new iwq(iwqVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void b(bry bryVar) {
        AtomicReference atomicReference = this.b;
        iwq iwqVar = new iwq((iwq) atomicReference.get());
        ?? r2 = iwqVar.c;
        Object obj = bryVar.a;
        if (r2.containsKey(obj)) {
            bry bryVar2 = (bry) r2.get(obj);
            if (!bryVar2.equals(bryVar) || !bryVar.equals(bryVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat((String) obj));
            }
        } else {
            r2.put(obj, bryVar);
        }
        atomicReference.set(new iwq(iwqVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void c(bry bryVar) {
        AtomicReference atomicReference = this.b;
        iwq iwqVar = new iwq((iwq) atomicReference.get());
        ?? r2 = iwqVar.b;
        Object obj = bryVar.a;
        if (r2.containsKey(obj)) {
            bry bryVar2 = (bry) r2.get(obj);
            if (!bryVar2.equals(bryVar) || !bryVar.equals(bryVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(obj.toString()));
            }
        } else {
            r2.put(obj, bryVar);
        }
        atomicReference.set(new iwq(iwqVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void d(bry bryVar) {
        AtomicReference atomicReference = this.b;
        iwq iwqVar = new iwq((iwq) atomicReference.get());
        ?? r2 = iwqVar.d;
        Object obj = bryVar.a;
        if (r2.containsKey(obj)) {
            bry bryVar2 = (bry) r2.get(obj);
            if (!bryVar2.equals(bryVar) || !bryVar.equals(bryVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat((String) obj));
            }
        } else {
            r2.put(obj, bryVar);
        }
        atomicReference.set(new iwq(iwqVar, (byte[]) null));
    }
}
