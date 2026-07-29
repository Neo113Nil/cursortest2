package com.tapjoy.internal;

import android.graphics.Point;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    public static final bi f7850a = new bi() { // from class: com.tapjoy.internal.bj.1
        @Override // com.tapjoy.internal.bi
        public final /* synthetic */ Object a(bn bnVar) {
            Point point = new Point();
            bnVar.h();
            while (bnVar.j()) {
                String l = bnVar.l();
                if ("x".equals(l)) {
                    point.x = bnVar.r();
                } else if ("y".equals(l)) {
                    point.y = bnVar.r();
                } else {
                    bnVar.s();
                }
            }
            bnVar.i();
            return point;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final bi f7851b = new bi() { // from class: com.tapjoy.internal.bj.2
        @Override // com.tapjoy.internal.bi
        public final /* synthetic */ Object a(bn bnVar) {
            Rect rect = new Rect();
            switch (AnonymousClass3.f7852a[bnVar.k().ordinal()]) {
                case 1:
                    bnVar.f();
                    rect.left = bnVar.r();
                    rect.top = bnVar.r();
                    rect.right = bnVar.r();
                    rect.bottom = bnVar.r();
                    while (bnVar.j()) {
                        bnVar.s();
                    }
                    bnVar.g();
                    return rect;
                case 2:
                    bnVar.h();
                    while (bnVar.j()) {
                        String l = bnVar.l();
                        if ("left".equals(l)) {
                            rect.left = bnVar.r();
                        } else if ("top".equals(l)) {
                            rect.top = bnVar.r();
                        } else if ("right".equals(l)) {
                            rect.right = bnVar.r();
                        } else if ("bottom".equals(l)) {
                            rect.bottom = bnVar.r();
                        } else {
                            bnVar.s();
                        }
                    }
                    bnVar.i();
                    return rect;
                default:
                    throw new IllegalStateException("Unexpected token: " + bnVar.k());
            }
        }
    };

    /* renamed from: com.tapjoy.internal.bj$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7852a = new int[bs.values().length];

        static {
            try {
                f7852a[bs.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7852a[bs.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
