package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khv {
    public static final Logger a = Logger.getLogger(khv.class.getName());

    private khv() {
    }

    public static Object a(ihs ihsVar) {
        String e;
        String str;
        double parseDouble;
        hoq.I(ihsVar.h(), "unexpected end of JSON");
        int i = ihsVar.i() - 1;
        boolean z = true;
        if (i == 0) {
            int i2 = ihsVar.c;
            if (i2 == 0) {
                i2 = ihsVar.a();
            }
            if (i2 != 3) {
                throw ihsVar.c("BEGIN_ARRAY");
            }
            ihsVar.g(1);
            ihsVar.i[ihsVar.g - 1] = 0;
            ihsVar.c = 0;
            ArrayList arrayList = new ArrayList();
            while (ihsVar.h()) {
                arrayList.add(a(ihsVar));
            }
            hoq.I(ihsVar.i() == 2, "Bad token: ".concat(ihsVar.j()));
            int i3 = ihsVar.c;
            if (i3 == 0) {
                i3 = ihsVar.a();
            }
            if (i3 != 4) {
                throw ihsVar.c("END_ARRAY");
            }
            int i4 = ihsVar.g;
            ihsVar.g = i4 - 1;
            int[] iArr = ihsVar.i;
            int i5 = i4 - 2;
            iArr[i5] = iArr[i5] + 1;
            ihsVar.c = 0;
            return DesugarCollections.unmodifiableList(arrayList);
        }
        if (i == 2) {
            int i6 = ihsVar.c;
            if (i6 == 0) {
                i6 = ihsVar.a();
            }
            if (i6 != 1) {
                throw ihsVar.c("BEGIN_OBJECT");
            }
            ihsVar.g(3);
            ihsVar.c = 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (ihsVar.h()) {
                int i7 = ihsVar.c;
                if (i7 == 0) {
                    i7 = ihsVar.a();
                }
                if (i7 == 14) {
                    e = ihsVar.f();
                } else if (i7 == 12) {
                    e = ihsVar.e('\'');
                } else {
                    if (i7 != 13) {
                        throw ihsVar.c("a name");
                    }
                    e = ihsVar.e('\"');
                }
                ihsVar.c = 0;
                ihsVar.h[ihsVar.g - 1] = e;
                hoq.C(!linkedHashMap.containsKey(e), "Duplicate key found: %s", e);
                linkedHashMap.put(e, a(ihsVar));
            }
            hoq.I(ihsVar.i() == 4, "Bad token: ".concat(ihsVar.j()));
            int i8 = ihsVar.c;
            if (i8 == 0) {
                i8 = ihsVar.a();
            }
            if (i8 != 2) {
                throw ihsVar.c("END_OBJECT");
            }
            int i9 = ihsVar.g;
            int i10 = i9 - 1;
            ihsVar.g = i10;
            ihsVar.h[i10] = null;
            int[] iArr2 = ihsVar.i;
            int i11 = i9 - 2;
            iArr2[i11] = iArr2[i11] + 1;
            ihsVar.c = 0;
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        if (i == 5) {
            int i12 = ihsVar.c;
            if (i12 == 0) {
                i12 = ihsVar.a();
            }
            if (i12 == 10) {
                str = ihsVar.f();
            } else if (i12 == 8) {
                str = ihsVar.e('\'');
            } else if (i12 == 9) {
                str = ihsVar.e('\"');
            } else if (i12 == 11) {
                str = ihsVar.f;
                ihsVar.f = null;
            } else if (i12 == 15) {
                str = Long.toString(ihsVar.d);
            } else {
                if (i12 != 16) {
                    throw ihsVar.c("a string");
                }
                String str2 = new String(ihsVar.a, ihsVar.b, ihsVar.e);
                ihsVar.b += ihsVar.e;
                str = str2;
            }
            ihsVar.c = 0;
            int[] iArr3 = ihsVar.i;
            int i13 = ihsVar.g - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return str;
        }
        if (i != 6) {
            if (i != 7) {
                if (i != 8) {
                    throw new IllegalStateException("Bad token: ".concat(ihsVar.j()));
                }
                int i14 = ihsVar.c;
                if (i14 == 0) {
                    i14 = ihsVar.a();
                }
                if (i14 != 7) {
                    throw ihsVar.c("null");
                }
                ihsVar.c = 0;
                int[] iArr4 = ihsVar.i;
                int i15 = ihsVar.g - 1;
                iArr4[i15] = iArr4[i15] + 1;
                return null;
            }
            int i16 = ihsVar.c;
            if (i16 == 0) {
                i16 = ihsVar.a();
            }
            if (i16 == 5) {
                ihsVar.c = 0;
                int[] iArr5 = ihsVar.i;
                int i17 = ihsVar.g - 1;
                iArr5[i17] = iArr5[i17] + 1;
            } else {
                if (i16 != 6) {
                    throw ihsVar.c("a boolean");
                }
                ihsVar.c = 0;
                int[] iArr6 = ihsVar.i;
                int i18 = ihsVar.g - 1;
                iArr6[i18] = iArr6[i18] + 1;
                z = false;
            }
            return Boolean.valueOf(z);
        }
        int i19 = ihsVar.c;
        if (i19 == 0) {
            i19 = ihsVar.a();
        }
        if (i19 == 15) {
            ihsVar.c = 0;
            int[] iArr7 = ihsVar.i;
            int i20 = ihsVar.g - 1;
            iArr7[i20] = iArr7[i20] + 1;
            parseDouble = ihsVar.d;
        } else {
            if (i19 == 16) {
                char[] cArr = ihsVar.a;
                int i21 = ihsVar.b;
                int i22 = ihsVar.e;
                ihsVar.f = new String(cArr, i21, i22);
                ihsVar.b = i21 + i22;
            } else if (i19 == 8 || i19 == 9) {
                ihsVar.f = ihsVar.e(i19 == 8 ? '\'' : '\"');
            } else if (i19 == 10) {
                ihsVar.f = ihsVar.f();
            } else if (i19 != 11) {
                throw ihsVar.c("a double");
            }
            ihsVar.c = 11;
            try {
                parseDouble = Double.parseDouble(ihsVar.f);
                if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                    throw ihsVar.b("JSON forbids NaN and infinities: " + parseDouble);
                }
                ihsVar.f = null;
                ihsVar.c = 0;
                int[] iArr8 = ihsVar.i;
                int i23 = ihsVar.g - 1;
                iArr8[i23] = iArr8[i23] + 1;
            } catch (NumberFormatException e2) {
                NumberFormatException numberFormatException = new NumberFormatException("Expected a double but was " + ihsVar.f + ihsVar.d());
                numberFormatException.initCause(e2);
                throw numberFormatException;
            }
        }
        return Double.valueOf(parseDouble);
    }
}
