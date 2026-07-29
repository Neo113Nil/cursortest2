package com.tapjoy.internal;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class iq extends ai {

    /* renamed from: a, reason: collision with root package name */
    private final hv f8407a;

    /* renamed from: b, reason: collision with root package name */
    private final ir f8408b;

    /* renamed from: c, reason: collision with root package name */
    private aa f8409c;

    public iq(Context context, hv hvVar, ir irVar) {
        super(context);
        this.f8407a = hvVar;
        this.f8408b = irVar;
        addView(irVar, new ViewGroup.LayoutParams(-1, -1));
        this.f8409c = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.ai, com.tapjoy.internal.aj, android.view.View
    public final void onMeasure(int i, int i2) {
        aa aaVar;
        aa aaVar2;
        aa a2 = aa.a(getContext());
        if (this.f8407a.a()) {
            if (this.f8407a.b()) {
                if (a2.a()) {
                    aaVar2 = aa.PORTRAIT;
                } else if (!a2.b() && aa.b(getContext()).a()) {
                    aaVar2 = aa.PORTRAIT;
                } else {
                    aaVar2 = aa.LANDSCAPE;
                }
                setRotationCount(0);
                aaVar = aaVar2;
            } else {
                aaVar = aa.PORTRAIT;
                if (a2.b()) {
                    if (a2.c() == 3) {
                        setRotationCount(1);
                    } else {
                        setRotationCount(3);
                    }
                } else {
                    setRotationCount(0);
                }
            }
        } else {
            aaVar = aa.LANDSCAPE;
            if (a2.a()) {
                if (a2.c() == 3) {
                    setRotationCount(1);
                } else {
                    setRotationCount(1);
                }
            } else {
                setRotationCount(0);
            }
        }
        if (this.f8409c != aaVar) {
            this.f8409c = aaVar;
            this.f8408b.setLandscape(this.f8409c.b());
        }
        super.onMeasure(i, i2);
    }
}
