package W2;

import G.C0220r0;
import G0.C0237a;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import com.appsflyer.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;
import s0.C1166s;
import w.C1254C;
import z2.C1440x;

/* loaded from: classes.dex */
public final /* synthetic */ class f0 extends M2.m implements Function1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4258o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i2, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i2, i4, cls, obj, str, str2);
        this.f4258o = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C0237a c0237a;
        int r2;
        Integer valueOf;
        switch (this.f4258o) {
            case 0:
                ((g0) this.f3591e).l((Throwable) obj);
                return Unit.f7487a;
            case 1:
                Function0 function0 = (Function0) obj;
                I.d dVar = ((C1166s) this.f3591e).f10376v0;
                if (!dVar.h(function0)) {
                    dVar.b(function0);
                }
                return Unit.f7487a;
            case 2:
                int i2 = ((X.b) obj).f4312a;
                C1166s c1166s = (C1166s) this.f3591e;
                c1166s.getClass();
                boolean z4 = false;
                if (!X.b.a(i2, 7) && !X.b.a(i2, 8)) {
                    Integer J3 = X.d.J(i2);
                    if (J3 == null) {
                        throw new IllegalStateException("Invalid focus direction");
                    }
                    int intValue = J3.intValue();
                    Y.d v4 = c1166s.v();
                    Rect B = v4 != null ? Z.K.B(v4) : null;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View findNextFocus = B == null ? focusFinder.findNextFocus(c1166s, c1166s.findFocus(), intValue) : focusFinder.findNextFocusFromRect(c1166s, B, intValue);
                    if (findNextFocus != null) {
                        z4 = X.d.E(findNextFocus, Integer.valueOf(intValue), B);
                    }
                }
                return Boolean.valueOf(z4);
            default:
                KeyEvent keyEvent = ((j0.b) obj).f7136a;
                w.c0 c0Var = (w.c0) this.f3591e;
                c0Var.getClass();
                boolean z5 = true;
                if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
                    C1254C c1254c = c0Var.f11147i;
                    c1254c.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        c1254c.f11017a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        valueOf = null;
                    } else {
                        Integer num = c1254c.f11017a;
                        if (num != null) {
                            c1254c.f11017a = null;
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
                        c0237a = new C0237a(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                        A.j0 j0Var = c0Var.f11144f;
                        boolean z6 = c0Var.f11142d;
                        boolean z7 = false;
                        if (c0237a == null) {
                            if (z6) {
                                c0Var.a(C1440x.a(c0237a));
                                j0Var.f159a = null;
                            } else {
                                z5 = false;
                            }
                            z7 = z5;
                        } else if (j0.c.w(j0.c.C(keyEvent), 2) && (r2 = c0Var.f11148j.r(keyEvent)) != 0) {
                            boolean z8 = true;
                            switch (r2) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                                case AbstractC1024c.f9242c /* 9 */:
                                case 10:
                                case RequestError.STOP_TRACKING /* 11 */:
                                case 12:
                                case 13:
                                case 14:
                                case AbstractC1024c.f9246g /* 15 */:
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
                                case RequestError.NETWORK_FAILURE /* 40 */:
                                case RequestError.NO_DEV_KEY /* 41 */:
                                case 42:
                                case 43:
                                    z8 = false;
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
                                    if (!z8 || z6) {
                                        M2.A a4 = new M2.A();
                                        a4.f3576d = true;
                                        C0220r0 c0220r0 = new C0220r0(r2, c0Var, a4);
                                        w.o0 d4 = c0Var.f11139a.d();
                                        G0.y yVar = c0Var.f11141c;
                                        A.W w4 = new A.W(yVar, c0Var.f11145g, d4, j0Var);
                                        c0220r0.invoke(w4);
                                        if (!A0.K.a(w4.f69f, yVar.f3094b) || !Intrinsics.a(w4.f70g, yVar.f3093a)) {
                                            c0Var.f11149k.invoke(G0.y.a(yVar, w4.f70g, w4.f69f, 4));
                                        }
                                        w.p0 p0Var = c0Var.f11146h;
                                        if (p0Var != null) {
                                            p0Var.f11317f = true;
                                        }
                                        z7 = a4.f3576d;
                                        break;
                                    }
                                    break;
                                default:
                                    throw null;
                            }
                        }
                        return Boolean.valueOf(z7);
                    }
                }
                c0237a = null;
                A.j0 j0Var2 = c0Var.f11144f;
                boolean z62 = c0Var.f11142d;
                boolean z72 = false;
                if (c0237a == null) {
                }
                return Boolean.valueOf(z72);
        }
    }
}
