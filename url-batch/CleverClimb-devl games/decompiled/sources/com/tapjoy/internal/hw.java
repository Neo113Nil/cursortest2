package com.tapjoy.internal;

import android.graphics.Point;
import com.mopub.mobileads.VastIconXmlManager;
import com.tapjoy.TJAdUnitConstants;
import java.net.URL;

/* loaded from: classes2.dex */
public final class hw {

    /* renamed from: d, reason: collision with root package name */
    public static final bi f8334d = new bi() { // from class: com.tapjoy.internal.hw.1
        private static Point b(bn bnVar) {
            bnVar.h();
            Point point = null;
            while (bnVar.j()) {
                if (VastIconXmlManager.OFFSET.equals(bnVar.l())) {
                    bnVar.h();
                    int i = 0;
                    int i2 = 0;
                    while (bnVar.j()) {
                        String l = bnVar.l();
                        if ("x".equals(l)) {
                            i = bnVar.r();
                        } else if ("y".equals(l)) {
                            i2 = bnVar.r();
                        } else {
                            bnVar.s();
                        }
                    }
                    bnVar.i();
                    point = new Point(i, i2);
                } else {
                    bnVar.s();
                }
            }
            bnVar.i();
            return point;
        }

        @Override // com.tapjoy.internal.bi
        public final /* synthetic */ Object a(bn bnVar) {
            bnVar.h();
            hy hyVar = null;
            Point point = null;
            Point point2 = null;
            while (bnVar.j()) {
                String l = bnVar.l();
                if ("image".equals(l)) {
                    String m = bnVar.m();
                    if (!jr.c(m)) {
                        hyVar = new hy(new URL(m));
                    }
                } else if (TJAdUnitConstants.String.LANDSCAPE.equals(l)) {
                    point = b(bnVar);
                } else if (TJAdUnitConstants.String.PORTRAIT.equals(l)) {
                    point2 = b(bnVar);
                } else {
                    bnVar.s();
                }
            }
            bnVar.i();
            return new hw(hyVar, point, point2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final hy f8335a;

    /* renamed from: b, reason: collision with root package name */
    public final Point f8336b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f8337c;

    public hw(hy hyVar, Point point, Point point2) {
        this.f8335a = hyVar;
        this.f8336b = point;
        this.f8337c = point2;
    }
}
