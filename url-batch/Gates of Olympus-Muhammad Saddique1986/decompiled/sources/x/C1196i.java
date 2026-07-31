package x;

import I.C0167p;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e2.InterfaceC0426e;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1196i extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10142e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1196i(int i3) {
        super(2);
        this.f10142e = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        int i3;
        C0167p c0167p = (C0167p) obj;
        ((Number) obj2).intValue();
        c0167p.Q(-1451087197);
        int i4 = this.f10142e;
        if (i4 == 0) {
            throw null;
        }
        c0167p.k(AndroidCompositionLocals_androidKt.f4937a);
        Resources resources = ((Context) c0167p.k(AndroidCompositionLocals_androidKt.f4938b)).getResources();
        if (i4 == 1) {
            i3 = R.string.cut;
        } else if (i4 == 2) {
            i3 = R.string.copy;
        } else if (i4 == 3) {
            i3 = R.string.paste;
        } else {
            if (i4 != 4) {
                throw null;
            }
            i3 = R.string.selectAll;
        }
        String string = resources.getString(i3);
        c0167p.p(false);
        return string;
    }
}
