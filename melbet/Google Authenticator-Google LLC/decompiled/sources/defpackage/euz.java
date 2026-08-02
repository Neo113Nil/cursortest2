package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class euz implements Comparable {
    public static final /* synthetic */ int b = 0;
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(euz.class, Object.class, "d");
    public final String a;
    private volatile Object d;

    public euz(String str, byte[] bArr) {
        this.a = str;
        this.d = bArr;
    }

    public final void a(byte[] bArr, boolean z) {
        Object obj;
        byte[][] bArr2;
        if (z) {
            c.set(this, bArr);
            return;
        }
        int i = 0;
        do {
            obj = this.d;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
        } while (!a.b(c, this, obj, bArr2));
    }

    public final void b(String str, hfk hfkVar) {
        Object obj = this.d;
        if (obj instanceof byte[]) {
            hfkVar.c(ldt.j(str, this.a, (byte[]) obj));
            return;
        }
        for (byte[] bArr : (byte[][]) obj) {
            hfkVar.c(ldt.j(str, this.a, bArr));
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo((String) obj);
    }
}
