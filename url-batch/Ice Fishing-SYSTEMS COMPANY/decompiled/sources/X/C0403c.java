package X;

import java.io.Serializable;
import java.util.Iterator;
import x7.AbstractC5219c;

/* renamed from: X.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403c extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public Serializable f3550n;

    /* renamed from: u, reason: collision with root package name */
    public Iterator f3551u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3552v;

    /* renamed from: w, reason: collision with root package name */
    public int f3553w;

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f3552v = obj;
        this.f3553w |= Integer.MIN_VALUE;
        return S0.f.a(null, null, this);
    }
}
