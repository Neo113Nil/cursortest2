package o;

import I.C0089d;
import I.InterfaceC0110n0;
import I.Y0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729e extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0729e f6501f = new C0729e(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0729e f6502g = new C0729e(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6503e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0729e(int i3, int i4) {
        super(i3);
        this.f6503e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f6503e) {
            case 0:
                InterfaceC0110n0 interfaceC0110n0 = (InterfaceC0110n0) obj;
                Y0 y02 = AndroidCompositionLocals_androidKt.f3738b;
                interfaceC0110n0.getClass();
                if (((Context) C0089d.K(interfaceC0110n0, y02)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC0731g.f6513b;
                }
                InterfaceC0728d.f6497a.getClass();
                return C0727c.f6494c;
            default:
                return Boolean.valueOf(!n0.s.d(((n0.m) obj).f6231i, 2));
        }
    }
}
