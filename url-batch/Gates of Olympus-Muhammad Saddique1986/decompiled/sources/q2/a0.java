package q2;

import I.C0171r0;
import I0.C0188a;
import a0.C0239d;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import r.AbstractC0856c;
import u0.C1123s;
import x.C1185C;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 extends f2.h implements InterfaceC0424c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7878l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i3, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i3, i4, cls, obj, str, str2);
        this.f7878l = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    @Override // e2.InterfaceC0424c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        C0188a c0188a;
        int i3;
        Integer valueOf;
        switch (this.f7878l) {
            case 0:
                ((b0) this.f5813e).l((Throwable) obj);
                return R1.y.f4171a;
            case 1:
                InterfaceC0422a interfaceC0422a = (InterfaceC0422a) obj;
                K.d dVar = ((C1123s) this.f5813e).f9507s0;
                if (!dVar.i(interfaceC0422a)) {
                    dVar.b(interfaceC0422a);
                }
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = ((Z.b) obj).f4666a;
                C1123s c1123s = (C1123s) this.f5813e;
                c1123s.getClass();
                boolean z3 = false;
                if (!Z.b.a(i4, 7) && !Z.b.a(i4, 8)) {
                    Integer J3 = Z.d.J(i4);
                    if (J3 == null) {
                        throw new IllegalStateException("Invalid focus direction");
                    }
                    int intValue = J3.intValue();
                    C0239d w2 = c1123s.w();
                    Rect B3 = w2 != null ? b0.M.B(w2) : null;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View findNextFocus = B3 == null ? focusFinder.findNextFocus(c1123s, c1123s.findFocus(), intValue) : focusFinder.findNextFocusFromRect(c1123s, B3, intValue);
                    if (findNextFocus != null) {
                        z3 = Z.d.E(findNextFocus, Integer.valueOf(intValue), B3);
                    }
                }
                return Boolean.valueOf(z3);
            default:
                KeyEvent keyEvent = ((l0.b) obj).f6574a;
                x.d0 d0Var = (x.d0) this.f5813e;
                d0Var.getClass();
                boolean z4 = true;
                if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
                    C1185C c1185c = d0Var.f10070i;
                    c1185c.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        c1185c.f9938a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        valueOf = null;
                    } else {
                        Integer num = c1185c.f9938a;
                        if (num != null) {
                            c1185c.f9938a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            valueOf = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                valueOf = null;
                            }
                            if (valueOf == null) {
                                valueOf = Integer.valueOf(unicodeChar);
                            }
                        } else {
                            valueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (valueOf != null) {
                        c0188a = new C0188a(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                        B.i0 i0Var = d0Var.f10067f;
                        boolean z5 = d0Var.f10065d;
                        boolean z6 = false;
                        if (c0188a == null) {
                            if (z5) {
                                d0Var.a(O2.l.l0(c0188a));
                                i0Var.f413a = null;
                            } else {
                                z4 = false;
                            }
                            z6 = z4;
                        } else if (AbstractC0508a.y(l0.c.z(keyEvent), 2) && (i3 = d0Var.f10071j.i(keyEvent)) != 0) {
                            boolean z7 = true;
                            switch (i3) {
                                case 1:
                                case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                                case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                                case k1.i.LONG_FIELD_NUMBER /* 4 */:
                                case 5:
                                case 6:
                                case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                                case AbstractC0856c.f8037c /* 9 */:
                                case AbstractC0856c.f8039e /* 10 */:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case AbstractC0856c.f8041g /* 15 */:
                                case 16:
                                case 17:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                    z7 = false;
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                    if (!z7 || z5) {
                                        f2.q qVar = new f2.q();
                                        qVar.f5828d = true;
                                        C0171r0 c0171r0 = new C0171r0(i3, d0Var, qVar);
                                        x.p0 d3 = d0Var.f10062a.d();
                                        I0.z zVar = d0Var.f10064c;
                                        B.V v3 = new B.V(zVar, d0Var.f10068g, d3, i0Var);
                                        c0171r0.n(v3);
                                        if (!C0.J.a(v3.f326f, zVar.f3098b) || !f2.j.a(v3.f327g, zVar.f3097a)) {
                                            d0Var.f10072k.n(I0.z.a(zVar, v3.f327g, v3.f326f, 4));
                                        }
                                        x.q0 q0Var = d0Var.f10069h;
                                        if (q0Var != null) {
                                            q0Var.f10240f = true;
                                        }
                                        z6 = qVar.f5828d;
                                        break;
                                    }
                                    break;
                                default:
                                    throw null;
                            }
                        }
                        return Boolean.valueOf(z6);
                    }
                }
                c0188a = null;
                B.i0 i0Var2 = d0Var.f10067f;
                boolean z52 = d0Var.f10065d;
                boolean z62 = false;
                if (c0188a == null) {
                }
                return Boolean.valueOf(z62);
        }
    }
}
