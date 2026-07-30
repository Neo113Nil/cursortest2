package a2;

import android.content.Context;
import t0.AbstractC5051n;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423b extends AbstractC0424c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4365a;

    /* renamed from: b, reason: collision with root package name */
    public final i2.a f4366b;

    /* renamed from: c, reason: collision with root package name */
    public final i2.a f4367c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4368d;

    public C0423b(Context context, i2.a aVar, i2.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f4365a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f4366b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f4367c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f4368d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0424c) {
            AbstractC0424c abstractC0424c = (AbstractC0424c) obj;
            if (this.f4365a.equals(((C0423b) abstractC0424c).f4365a)) {
                C0423b c0423b = (C0423b) abstractC0424c;
                if (this.f4366b.equals(c0423b.f4366b) && this.f4367c.equals(c0423b.f4367c) && this.f4368d.equals(c0423b.f4368d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f4365a.hashCode() ^ 1000003) * 1000003) ^ this.f4366b.hashCode()) * 1000003) ^ this.f4367c.hashCode()) * 1000003) ^ this.f4368d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f4365a);
        sb.append(", wallClock=");
        sb.append(this.f4366b);
        sb.append(", monotonicClock=");
        sb.append(this.f4367c);
        sb.append(", backendName=");
        return AbstractC5051n.g(sb, this.f4368d, "}");
    }
}
