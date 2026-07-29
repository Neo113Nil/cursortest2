package com.tapjoy.internal;

import android.graphics.PointF;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ib {

    /* renamed from: d, reason: collision with root package name */
    public static final bi f8354d = new bi() { // from class: com.tapjoy.internal.ib.1
        @Override // com.tapjoy.internal.bi
        public final /* synthetic */ Object a(bn bnVar) {
            return new ib(bnVar);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public aa f8355a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f8356b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f8357c = new ArrayList();

    public ib(bn bnVar) {
        this.f8355a = aa.UNSPECIFIED;
        bnVar.h();
        while (bnVar.j()) {
            String l = bnVar.l();
            if (!TJAdUnitConstants.String.BUTTONS.equals(l)) {
                if ("window_aspect_ratio".equals(l)) {
                    if (bnVar.a()) {
                        PointF pointF = new PointF();
                        bnVar.h();
                        while (bnVar.j()) {
                            String l2 = bnVar.l();
                            if ("width".equals(l2)) {
                                pointF.x = (float) bnVar.p();
                            } else if ("height".equals(l2)) {
                                pointF.y = (float) bnVar.p();
                            } else {
                                bnVar.s();
                            }
                        }
                        bnVar.i();
                        if (pointF.x != 0.0f && pointF.y != 0.0f) {
                            this.f8356b = pointF;
                        }
                    } else {
                        bnVar.s();
                    }
                } else if ("orientation".equals(l)) {
                    String m = bnVar.m();
                    if (TJAdUnitConstants.String.LANDSCAPE.equals(m)) {
                        this.f8355a = aa.LANDSCAPE;
                    } else if (TJAdUnitConstants.String.PORTRAIT.equals(m)) {
                        this.f8355a = aa.PORTRAIT;
                    }
                } else {
                    bnVar.s();
                }
            } else {
                if (bnVar.k() == bs.BEGIN_ARRAY) {
                    bnVar.a(this.f8357c, ia.n);
                } else {
                    bnVar.s();
                }
            }
        }
        bnVar.i();
    }
}
