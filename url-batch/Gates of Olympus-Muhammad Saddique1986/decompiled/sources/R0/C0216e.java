package R0;

import e2.InterfaceC0422a;
import java.util.UUID;

/* renamed from: R0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216e extends f2.k implements InterfaceC0422a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0216e f4076f = new C0216e(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0216e f4077g = new C0216e(0, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0216e f4078h = new C0216e(0, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0216e(int i3, int i4) {
        super(i3);
        this.f4079e = i4;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f4079e) {
        }
        return UUID.randomUUID();
    }
}
