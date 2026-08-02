package C0;

import android.content.Context;
import b0.r;
import w0.C1236e;
import x0.InterfaceC1239b;

/* loaded from: classes.dex */
public final class n implements InterfaceC1239b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219a;

    /* renamed from: b, reason: collision with root package name */
    public final r f220b;

    public /* synthetic */ n(r rVar, int i3) {
        this.f219a = i3;
        this.f220b = rVar;
    }

    @Override // a2.InterfaceC0133a
    public final Object get() {
        switch (this.f219a) {
            case 0:
                return new m((Context) this.f220b.f2543a, "com.google.android.datatransport.events", Integer.valueOf(m.f215d).intValue());
            default:
                return new C1236e((Context) this.f220b.f2543a, new K0.j(4), new K0.j(3));
        }
    }
}
