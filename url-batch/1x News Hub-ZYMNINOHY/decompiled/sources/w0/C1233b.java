package w0;

import E1.AbstractC0033i;
import K0.j;
import android.content.Context;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1233b extends AbstractC1235d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10629a;

    /* renamed from: b, reason: collision with root package name */
    public final j f10630b;

    /* renamed from: c, reason: collision with root package name */
    public final j f10631c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10632d;

    public C1233b(Context context, j jVar, j jVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f10629a = context;
        if (jVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f10630b = jVar;
        if (jVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f10631c = jVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f10632d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1235d) {
            AbstractC1235d abstractC1235d = (AbstractC1235d) obj;
            if (this.f10629a.equals(((C1233b) abstractC1235d).f10629a)) {
                C1233b c1233b = (C1233b) abstractC1235d;
                if (this.f10630b.equals(c1233b.f10630b) && this.f10631c.equals(c1233b.f10631c) && this.f10632d.equals(c1233b.f10632d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f10629a.hashCode() ^ 1000003) * 1000003) ^ this.f10630b.hashCode()) * 1000003) ^ this.f10631c.hashCode()) * 1000003) ^ this.f10632d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f10629a);
        sb.append(", wallClock=");
        sb.append(this.f10630b);
        sb.append(", monotonicClock=");
        sb.append(this.f10631c);
        sb.append(", backendName=");
        return AbstractC0033i.m(sb, this.f10632d, "}");
    }
}
