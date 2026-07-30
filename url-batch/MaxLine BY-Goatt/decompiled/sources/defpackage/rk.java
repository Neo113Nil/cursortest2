package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.appsflyer.attribution.RequestError;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class rk extends gu0 implements Function1 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rk(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.o = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        yw ywVar;
        int p;
        boolean z;
        Integer valueOf;
        switch (this.o) {
            case 0:
                String str = (String) obj;
                str.getClass();
                zk zkVar = (zk) this.receiver;
                zkVar.getClass();
                zkVar.d.i(str);
                return Unit.a;
            case 1:
                ((zk) this.receiver).c.i((jk) obj);
                return Unit.a;
            case 2:
                ((v41) this.receiver).getClass();
                o90 o90Var = ((yo0) obj).m;
                xh2 xh2Var = o90Var instanceof xh2 ? (xh2) o90Var : null;
                if (xh2Var != null) {
                    yh2.l(xh2Var);
                }
                return Unit.a;
            case 3:
                ((Set) obj).getClass();
                z41 z41Var = (z41) this.receiver;
                ReentrantLock reentrantLock = z41Var.d;
                reentrantLock.lock();
                try {
                    List M = zv.M(z41Var.c.values());
                    reentrantLock.unlock();
                    Iterator it = M.iterator();
                    if (!it.hasNext()) {
                        return Unit.a;
                    }
                    ((zt1) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 4:
                ((j61) this.receiver).s((Throwable) obj);
                return Unit.a;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                ig2 ig2Var = (ig2) this.receiver;
                ig2Var.getClass();
                ig2Var.c.i(str2);
                return Unit.a;
            default:
                KeyEvent keyEvent = ((x71) obj).a;
                qu2 qu2Var = (qu2) this.receiver;
                iw2 iw2Var = qu2Var.f;
                boolean z2 = qu2Var.d;
                boolean z3 = true;
                if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
                    m70 m70Var = qu2Var.i;
                    m70Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        m70Var.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        valueOf = null;
                    } else {
                        Integer num = m70Var.a;
                        if (num != null) {
                            m70Var.a = null;
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
                        ywVar = new yw(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                        if (ywVar == null) {
                            if (z2) {
                                qu2Var.a(pv.c(ywVar));
                                iw2Var.a = null;
                            }
                            z3 = false;
                        } else {
                            if (z71.D(keyEvent) == 2 && (p = qu2Var.j.p(keyEvent)) != 0) {
                                switch (p) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                                    case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                                    case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                                    case 15:
                                    case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                                    case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
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
                                        z = false;
                                        break;
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case Constants.MAX_TREE_DEPTH /* 25 */:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                        z = true;
                                        break;
                                    default:
                                        throw null;
                                }
                                if (!z || z2) {
                                    y72 y72Var = new y72();
                                    y72Var.m = true;
                                    vf2 vf2Var = new vf2(p, qu2Var, y72Var);
                                    nv2 nv2Var = qu2Var.c;
                                    xu2 xu2Var = new xu2(nv2Var, qu2Var.g, qu2Var.a.d(), iw2Var);
                                    vf2Var.invoke(xu2Var);
                                    boolean a = jw2.a(xu2Var.f, nv2Var.b);
                                    yd ydVar = xu2Var.g;
                                    if (!a || !Intrinsics.b(ydVar, nv2Var.a)) {
                                        qu2Var.k.invoke(nv2.a(nv2Var, ydVar, xu2Var.f, 4));
                                    }
                                    z13 z13Var = qu2Var.h;
                                    if (z13Var != null) {
                                        z13Var.e = true;
                                    }
                                    z3 = y72Var.m;
                                }
                            }
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                    }
                }
                ywVar = null;
                if (ywVar == null) {
                }
                return Boolean.valueOf(z3);
        }
    }
}
