package com.google.android.material.datepicker;

import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.u f1107b;

    public /* synthetic */ u(int i, androidx.fragment.app.u uVar) {
        this.f1106a = i;
        this.f1107b = uVar;
    }

    public final void a() {
        switch (this.f1106a) {
            case 0:
                ((v) this.f1107b).N0.setEnabled(false);
                break;
            default:
                Iterator it = ((w) this.f1107b).Y.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).a();
                }
                break;
        }
    }

    public final void b(Object obj) {
        switch (this.f1106a) {
            case 0:
                v vVar = (v) this.f1107b;
                vVar.N(vVar.J());
                vVar.N0.setEnabled(vVar.I().f1067f != null);
                break;
            default:
                Iterator it = ((w) this.f1107b).Y.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).b(obj);
                }
                break;
        }
    }
}
