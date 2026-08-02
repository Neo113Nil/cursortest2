package U;

import a.AbstractC0124a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import v2.I;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final I f3050a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3051b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f3052c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f3053d;

    public j(I i4) {
        this.f3050a = i4;
        k kVar = k.f3054e;
        this.f3053d = false;
    }

    public final void a() {
        l lVar = l.f3059b;
        ArrayList arrayList = this.f3051b;
        arrayList.clear();
        this.f3053d = false;
        long j4 = lVar.f3060a;
        int i4 = 0;
        while (true) {
            I i5 = this.f3050a;
            if (i4 >= i5.size()) {
                break;
            }
            n nVar = (n) i5.get(i4);
            new l(j4);
            nVar.flush();
            if (nVar.a()) {
                j4 = nVar.g(j4);
                AbstractC0124a.t(j4 >= 0);
                arrayList.add(nVar);
            }
            i4++;
        }
        this.f3052c = new ByteBuffer[arrayList.size()];
        for (int i6 = 0; i6 <= b(); i6++) {
            this.f3052c[i6] = ((n) arrayList.get(i6)).c();
        }
    }

    public final int b() {
        return this.f3052c.length - 1;
    }

    public final boolean c() {
        return this.f3053d && ((n) this.f3051b.get(b())).b() && !this.f3052c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.f3051b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z4 = true; z4; z4 = z) {
            z = false;
            int i4 = 0;
            while (i4 <= b()) {
                if (!this.f3052c[i4].hasRemaining()) {
                    ArrayList arrayList = this.f3051b;
                    n nVar = (n) arrayList.get(i4);
                    if (!nVar.b()) {
                        ByteBuffer byteBuffer2 = i4 > 0 ? this.f3052c[i4 - 1] : byteBuffer.hasRemaining() ? byteBuffer : n.f3061a;
                        long remaining = byteBuffer2.remaining();
                        nVar.d(byteBuffer2);
                        this.f3052c[i4] = nVar.c();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.f3052c[i4].hasRemaining();
                    } else if (!this.f3052c[i4].hasRemaining() && i4 < b()) {
                        ((n) arrayList.get(i4 + 1)).e();
                    }
                }
                i4++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        I i4 = this.f3050a;
        if (i4.size() != jVar.f3050a.size()) {
            return false;
        }
        for (int i5 = 0; i5 < i4.size(); i5++) {
            if (i4.get(i5) != jVar.f3050a.get(i5)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f3050a.hashCode();
    }
}
