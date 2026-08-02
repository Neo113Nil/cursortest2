package c2;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements r2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2634a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2635b;

    public /* synthetic */ d(int i3, Object obj) {
        this.f2634a = i3;
        this.f2635b = obj;
    }

    @Override // r2.f
    public final Iterator iterator() {
        switch (this.f2634a) {
            case 0:
                return new kotlin.jvm.internal.a((Object[]) this.f2635b);
            case 1:
                return ((List) this.f2635b).iterator();
            case 2:
                return new r2.e(this);
            default:
                return (Iterator) this.f2635b;
        }
    }
}
