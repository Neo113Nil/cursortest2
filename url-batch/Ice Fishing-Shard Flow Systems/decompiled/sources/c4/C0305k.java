package c4;

import kotlin.jvm.functions.Function0;
import y4.C1033b;

/* renamed from: c4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0305k implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4243d;

    public /* synthetic */ C0305k(int i2) {
        this.f4243d = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4243d) {
            case 0:
                return new T6.f();
            case 1:
                return new C1033b(1);
            case 2:
                return new C1033b(0);
            default:
                return new C1033b(2);
        }
    }
}
