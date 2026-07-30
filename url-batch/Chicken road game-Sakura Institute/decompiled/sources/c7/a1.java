package c7;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 extends r6.h implements q6.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1670n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(int i7, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i7, obj, cls, str, str2, i8, i9);
        this.f1670n = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    @Override // q6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj) {
        boolean z8;
        g2.a aVar;
        int a3;
        Integer valueOf;
        switch (this.f1670n) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((b1) this.f7949g).l((Throwable) obj);
                return d6.z.f2639a;
            case 1:
                q6.a aVar2 = (q6.a) obj;
                i0.d dVar = ((s1.r) this.f7949g).f8394u0;
                if (!dVar.i(aVar2)) {
                    dVar.b(aVar2);
                }
                return d6.z.f2639a;
            case 2:
                int i7 = ((x0.b) obj).f9595a;
                s1.r rVar = (s1.r) this.f7949g;
                rVar.getClass();
                if (i7 != 7 && i7 != 8) {
                    Integer I = x0.d.I(i7);
                    if (I == null) {
                        throw new IllegalStateException("Invalid focus direction");
                    }
                    int intValue = I.intValue();
                    y0.d v5 = rVar.v();
                    Rect u8 = v5 != null ? z0.l0.u(v5) : null;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View findNextFocus = u8 == null ? focusFinder.findNextFocus(rVar, rVar.findFocus(), intValue) : focusFinder.findNextFocusFromRect(rVar, u8, intValue);
                    if (findNextFocus != null) {
                        z8 = x0.d.D(findNextFocus, Integer.valueOf(intValue), u8);
                        return Boolean.valueOf(z8);
                    }
                }
                z8 = false;
                return Boolean.valueOf(z8);
            default:
                KeyEvent keyEvent = ((j1.b) obj).f4986a;
                w.q0 q0Var = (w.q0) this.f7949g;
                a0.f1 f1Var = q0Var.f9393f;
                boolean z9 = q0Var.f9391d;
                boolean z10 = true;
                if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
                    w.x xVar = q0Var.f9396i;
                    xVar.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        xVar.f9453a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        valueOf = null;
                    } else {
                        Integer num = xVar.f9453a;
                        if (num != null) {
                            xVar.f9453a = null;
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
                        aVar = new g2.a(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                        if (aVar == null) {
                            if (z9) {
                                q0Var.a(t6.a.F(aVar));
                                f1Var.f64a = null;
                            }
                            z10 = false;
                        } else {
                            if (j1.c.e0(keyEvent) == 2 && (a3 = q0Var.f9397j.a(keyEvent)) != 0) {
                                boolean z11 = true;
                                switch (a3) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                    case 8:
                                    case q.c.f7259c /* 9 */:
                                    case q.c.f7261e /* 10 */:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case q.c.f7263g /* 15 */:
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
                                        z11 = false;
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
                                    case q.c.f7264h /* 48 */:
                                        if (!z11 || z9) {
                                            r6.r rVar2 = new r6.r();
                                            rVar2.f7964f = true;
                                            g0.o1 o1Var = new g0.o1(a3, q0Var, rVar2);
                                            g2.w wVar = q0Var.f9390c;
                                            a0.t0 t0Var = new a0.t0(wVar, q0Var.f9394g, q0Var.f9388a.d(), f1Var);
                                            o1Var.f(t0Var);
                                            if (!a2.j0.a(t0Var.f151f, wVar.f4066b) || !r6.k.a(t0Var.f152g, wVar.f4065a)) {
                                                q0Var.f9398k.f(g2.w.a(wVar, t0Var.f152g, t0Var.f151f, 4));
                                            }
                                            w.a1 a1Var = q0Var.f9395h;
                                            if (a1Var != null) {
                                                a1Var.f9191e = true;
                                            }
                                            z10 = rVar2.f7964f;
                                            break;
                                        }
                                        break;
                                    default:
                                        throw null;
                                }
                            }
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                }
                aVar = null;
                if (aVar == null) {
                }
                return Boolean.valueOf(z10);
        }
    }
}
