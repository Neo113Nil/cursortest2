package o0;

import androidx.window.extensions.layout.WindowLayoutInfo;
import f4.v;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import t4.InterfaceC1441l;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1355b extends h implements InterfaceC1441l {
    public C1355b(f fVar) {
        super(1, fVar, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        WindowLayoutInfo p02 = (WindowLayoutInfo) obj;
        i.e(p02, "p0");
        ((f) this.receiver).accept(p02);
        return v.f5689a;
    }
}
