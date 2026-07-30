package b1;

import android.content.Context;
import j1.InterfaceC0568a;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267b extends AbstractC0268c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4137a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0568a f4138b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0568a f4139c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4140d;

    public C0267b(Context context, InterfaceC0568a interfaceC0568a, InterfaceC0568a interfaceC0568a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f4137a = context;
        if (interfaceC0568a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f4138b = interfaceC0568a;
        if (interfaceC0568a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f4139c = interfaceC0568a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f4140d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0268c) {
            AbstractC0268c abstractC0268c = (AbstractC0268c) obj;
            if (this.f4137a.equals(((C0267b) abstractC0268c).f4137a)) {
                C0267b c0267b = (C0267b) abstractC0268c;
                if (this.f4138b.equals(c0267b.f4138b) && this.f4139c.equals(c0267b.f4139c) && this.f4140d.equals(c0267b.f4140d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f4137a.hashCode() ^ 1000003) * 1000003) ^ this.f4138b.hashCode()) * 1000003) ^ this.f4139c.hashCode()) * 1000003) ^ this.f4140d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f4137a);
        sb.append(", wallClock=");
        sb.append(this.f4138b);
        sb.append(", monotonicClock=");
        sb.append(this.f4139c);
        sb.append(", backendName=");
        return r4.f.f(sb, this.f4140d, "}");
    }
}
