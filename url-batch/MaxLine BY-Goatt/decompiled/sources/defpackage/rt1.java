package defpackage;

import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.ServerProtocol;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rt1 extends l03 {
    public static final ji b = new ji(2);
    public final /* synthetic */ int a;

    public rt1(uw0 uw0Var) {
        this.a = 0;
    }

    public static t61 b(z61 z61Var) {
        int u = q40.u(z61Var.R());
        if (u == 0) {
            q61 q61Var = new q61();
            z61Var.b();
            while (z61Var.s()) {
                q61Var.m.add(b(z61Var));
            }
            z61Var.o();
            return q61Var;
        }
        if (u == 2) {
            w61 w61Var = new w61();
            z61Var.f();
            while (z61Var.s()) {
                w61Var.m.put(z61Var.J(), b(z61Var));
            }
            z61Var.p();
            return w61Var;
        }
        if (u == 5) {
            return new y61(z61Var.P());
        }
        if (u == 6) {
            return new y61(new x91(z61Var.P()));
        }
        if (u == 7) {
            return new y61(Boolean.valueOf(z61Var.A()));
        }
        if (u == 8) {
            z61Var.N();
            return v61.m;
        }
        b71.t();
        return null;
    }

    public static void c(c71 c71Var, t61 t61Var) {
        if (t61Var == null || (t61Var instanceof v61)) {
            c71Var.m();
            return;
        }
        if (t61Var instanceof y61) {
            y61 y61Var = (y61) t61Var;
            Serializable serializable = y61Var.m;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean booleanValue = serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(y61Var.b());
                    c71Var.p();
                    c71Var.b();
                    c71Var.m.write(booleanValue ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
                    return;
                }
                String b2 = y61Var.b();
                if (b2 == null) {
                    c71Var.m();
                    return;
                }
                c71Var.p();
                c71Var.b();
                c71Var.o(b2);
                return;
            }
            Number a = y61Var.a();
            if (a == null) {
                c71Var.m();
                return;
            }
            c71Var.p();
            String obj = a.toString();
            if (!c71Var.q && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
                b71.j(a, "Numeric values must be finite, but was ");
                return;
            } else {
                c71Var.b();
                c71Var.m.append((CharSequence) obj);
                return;
            }
        }
        boolean z = t61Var instanceof q61;
        if (z) {
            c71Var.p();
            c71Var.b();
            int i = c71Var.o;
            int[] iArr = c71Var.n;
            if (i == iArr.length) {
                c71Var.n = Arrays.copyOf(iArr, i * 2);
            }
            int[] iArr2 = c71Var.n;
            int i2 = c71Var.o;
            c71Var.o = i2 + 1;
            iArr2[i2] = 1;
            c71Var.m.write(91);
            if (!z) {
                b71.v(t61Var, "Not a JSON Array: ");
                return;
            }
            ArrayList arrayList = ((q61) t61Var).m;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                c(c71Var, (t61) obj2);
            }
            c71Var.f(1, 2, ']');
            return;
        }
        boolean z2 = t61Var instanceof w61;
        if (!z2) {
            lh.d(t61Var.getClass(), "Couldn't write ");
            return;
        }
        c71Var.p();
        c71Var.b();
        int i4 = c71Var.o;
        int[] iArr3 = c71Var.n;
        if (i4 == iArr3.length) {
            c71Var.n = Arrays.copyOf(iArr3, i4 * 2);
        }
        int[] iArr4 = c71Var.n;
        int i5 = c71Var.o;
        c71Var.o = i5 + 1;
        iArr4[i5] = 3;
        c71Var.m.write(123);
        if (!z2) {
            b71.v(t61Var, "Not a JSON Object: ");
            return;
        }
        Iterator it = ((ge1) ((w61) t61Var).m.entrySet()).iterator();
        while (((fe1) it).hasNext()) {
            he1 b3 = ((fe1) it).b();
            String str = (String) b3.getKey();
            if (str == null) {
                ch2.l("name == null");
            } else {
                if (c71Var.r != null) {
                    throw new IllegalStateException();
                }
                if (c71Var.o != 0) {
                    c71Var.r = str;
                } else {
                    lh.g("JsonWriter is closed.");
                }
            }
            c(c71Var, (t61) b3.getValue());
        }
        c71Var.f(3, 5, '}');
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cc, code lost:
    
        if (r12.C() != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ce, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d0, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00da, code lost:
    
        if (java.lang.Integer.parseInt(r0) != 0) goto L51;
     */
    @Override // defpackage.l03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(z61 z61Var) {
        boolean z;
        switch (this.a) {
            case 0:
                int u = q40.u(z61Var.R());
                if (u == 0) {
                    ArrayList arrayList = new ArrayList();
                    z61Var.b();
                    while (z61Var.s()) {
                        arrayList.add(a(z61Var));
                    }
                    z61Var.o();
                    return arrayList;
                }
                if (u == 2) {
                    ie1 ie1Var = new ie1();
                    z61Var.f();
                    while (z61Var.s()) {
                        ie1Var.put(z61Var.J(), a(z61Var));
                    }
                    z61Var.p();
                    return ie1Var;
                }
                if (u == 5) {
                    return z61Var.P();
                }
                if (u == 6) {
                    return Double.valueOf(z61Var.B());
                }
                if (u == 7) {
                    return Boolean.valueOf(z61Var.A());
                }
                if (u != 8) {
                    throw new IllegalStateException();
                }
                z61Var.N();
                return null;
            case 1:
                if (z61Var.R() != 9) {
                    return Double.valueOf(z61Var.B());
                }
                z61Var.N();
                return null;
            case 2:
                if (z61Var.R() != 9) {
                    return Float.valueOf((float) z61Var.B());
                }
                z61Var.N();
                return null;
            case 3:
                if (z61Var.R() != 9) {
                    return Long.valueOf(z61Var.H());
                }
                z61Var.N();
                return null;
            case 4:
                ArrayList arrayList2 = new ArrayList();
                z61Var.b();
                while (z61Var.s()) {
                    try {
                        arrayList2.add(Integer.valueOf(z61Var.C()));
                    } catch (NumberFormatException e) {
                        throw new a71(e);
                    }
                }
                z61Var.o();
                int size = arrayList2.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList2.get(i)).intValue());
                }
                return atomicIntegerArray;
            case 5:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                try {
                    return Long.valueOf(z61Var.H());
                } catch (NumberFormatException e2) {
                    throw new a71(e2);
                }
            case 6:
                if (z61Var.R() != 9) {
                    return Float.valueOf((float) z61Var.B());
                }
                z61Var.N();
                return null;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                if (z61Var.R() != 9) {
                    return Double.valueOf(z61Var.B());
                }
                z61Var.N();
                return null;
            case 8:
                int R = z61Var.R();
                int u2 = q40.u(R);
                if (u2 == 5 || u2 == 6) {
                    return new x91(z61Var.P());
                }
                if (u2 != 8) {
                    throw new a71("Expecting number, got: ".concat(q40.w(R)));
                }
                z61Var.N();
                return null;
            case 9:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                String P = z61Var.P();
                if (P.length() == 1) {
                    return Character.valueOf(P.charAt(0));
                }
                throw new a71("Expecting character, got: ".concat(P));
            case 10:
                int R2 = z61Var.R();
                if (R2 != 9) {
                    return R2 == 8 ? Boolean.toString(z61Var.A()) : z61Var.P();
                }
                z61Var.N();
                return null;
            case 11:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                try {
                    return new BigDecimal(z61Var.P());
                } catch (NumberFormatException e3) {
                    throw new a71(e3);
                }
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                try {
                    return new BigInteger(z61Var.P());
                } catch (NumberFormatException e4) {
                    throw new a71(e4);
                }
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                if (z61Var.R() != 9) {
                    return new StringBuilder(z61Var.P());
                }
                z61Var.N();
                return null;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 15:
                if (z61Var.R() != 9) {
                    return new StringBuffer(z61Var.P());
                }
                z61Var.N();
                return null;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                String P2 = z61Var.P();
                if ("null".equals(P2)) {
                    return null;
                }
                return new URL(P2);
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                try {
                    String P3 = z61Var.P();
                    if ("null".equals(P3)) {
                        return null;
                    }
                    return new URI(P3);
                } catch (URISyntaxException e5) {
                    throw new u61(e5);
                }
            case 18:
                if (z61Var.R() != 9) {
                    return InetAddress.getByName(z61Var.P());
                }
                z61Var.N();
                return null;
            case 19:
                if (z61Var.R() != 9) {
                    return UUID.fromString(z61Var.P());
                }
                z61Var.N();
                return null;
            case 20:
                return Currency.getInstance(z61Var.P());
            case 21:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                z61Var.f();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (z61Var.R() != 4) {
                    String J = z61Var.J();
                    int C = z61Var.C();
                    if ("year".equals(J)) {
                        i2 = C;
                    } else if ("month".equals(J)) {
                        i3 = C;
                    } else if ("dayOfMonth".equals(J)) {
                        i4 = C;
                    } else if ("hourOfDay".equals(J)) {
                        i5 = C;
                    } else if ("minute".equals(J)) {
                        i6 = C;
                    } else if ("second".equals(J)) {
                        i7 = C;
                    }
                }
                z61Var.p();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            case 22:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(z61Var.P(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            case 23:
                return b(z61Var);
            case 24:
                BitSet bitSet = new BitSet();
                z61Var.b();
                int R3 = z61Var.R();
                int i8 = 0;
                while (R3 != 2) {
                    int u3 = q40.u(R3);
                    if (u3 == 5) {
                        String P4 = z61Var.P();
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                            throw new a71(q40.l("Error: Expecting: bitset number value (1, 0), Found: ", P4));
                        }
                    } else if (u3 == 6) {
                        break;
                    } else {
                        if (u3 != 7) {
                            throw new a71("Invalid bitset value type: ".concat(q40.w(R3)));
                        }
                        z = z61Var.A();
                    }
                    if (z) {
                        bitSet.set(i8);
                    }
                    i8++;
                    R3 = z61Var.R();
                }
                z61Var.o();
                return bitSet;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                int R4 = z61Var.R();
                if (R4 != 9) {
                    return R4 == 6 ? Boolean.valueOf(Boolean.parseBoolean(z61Var.P())) : Boolean.valueOf(z61Var.A());
                }
                z61Var.N();
                return null;
            case 26:
                if (z61Var.R() != 9) {
                    return Boolean.valueOf(z61Var.P());
                }
                z61Var.N();
                return null;
            case 27:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) z61Var.C());
                } catch (NumberFormatException e6) {
                    throw new a71(e6);
                }
            case 28:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                try {
                    return Short.valueOf((short) z61Var.C());
                } catch (NumberFormatException e7) {
                    throw new a71(e7);
                }
            default:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                try {
                    return Integer.valueOf(z61Var.C());
                } catch (NumberFormatException e8) {
                    throw new a71(e8);
                }
        }
    }

    public /* synthetic */ rt1(int i) {
        this.a = i;
    }
}
