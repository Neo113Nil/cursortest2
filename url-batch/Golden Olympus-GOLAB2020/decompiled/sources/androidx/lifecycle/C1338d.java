package androidx.lifecycle;

import androidx.lifecycle.AbstractC1346l;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1338d implements InterfaceC1351q {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1342h[] f12637b;

    public C1338d(InterfaceC1342h[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f12637b = generatedAdapters;
    }

    @Override // androidx.lifecycle.InterfaceC1351q
    public void onStateChanged(InterfaceC1354u source, AbstractC1346l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        new A();
        InterfaceC1342h[] interfaceC1342hArr = this.f12637b;
        if (interfaceC1342hArr.length > 0) {
            InterfaceC1342h interfaceC1342h = interfaceC1342hArr[0];
            throw null;
        }
        if (interfaceC1342hArr.length <= 0) {
            return;
        }
        InterfaceC1342h interfaceC1342h2 = interfaceC1342hArr[0];
        throw null;
    }
}
