package A1;

import D.AbstractC0165r0;
import D.N1;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z1.AbstractC1365I;

/* renamed from: A1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086z implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public static final C0086z f796e = new C0086z(0);

    /* renamed from: i, reason: collision with root package name */
    public static final C0086z f797i = new C0086z(1);

    /* renamed from: j, reason: collision with root package name */
    public static final C0086z f798j = new C0086z(2);

    /* renamed from: k, reason: collision with root package name */
    public static final C0086z f799k = new C0086z(3);

    /* renamed from: l, reason: collision with root package name */
    public static final C0086z f800l = new C0086z(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f801d;

    public /* synthetic */ C0086z(int i2) {
        this.f801d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f801d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    N1.b("New athlete", null, 0L, 0L, null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196614, 0, 130974);
                }
                break;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    AbstractC0165r0.a(j0.c.y(), null, 0L, c0216p2, 48, 12);
                }
                break;
            case 2:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    AbstractC0165r0.a(M1.a.D(), null, AbstractC1365I.f11806g, c0216p3, 48, 4);
                }
                break;
            case 3:
                C0216p c0216p4 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p4.z()) {
                    c0216p4.N();
                } else {
                    N1.b("Log session", null, 0L, 0L, null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p4, 196614, 0, 130974);
                }
                break;
            default:
                C0216p c0216p5 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p5.z()) {
                    c0216p5.N();
                } else {
                    N1.b("Pick athlete", null, 0L, 0L, null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p5, 196614, 0, 130974);
                }
                break;
        }
        return Unit.f7487a;
    }
}
