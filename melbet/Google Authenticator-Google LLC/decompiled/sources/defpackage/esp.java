package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esp {
    private static final gzz d = gzz.b('/').a();
    public static final eso a = new esn(1);
    public static final eso b = new esn(0);
    public static final eso c = new esn(2);

    public static List a(String str) {
        return hnu.G(d.e(str), new esh(2));
    }

    public static void b(eso esoVar, jlk jlkVar) {
        String a2 = esoVar.a(jlkVar);
        String b2 = esoVar.b(jlkVar);
        if (!a2.isEmpty() || b2.isEmpty()) {
            esoVar.c(jlkVar, null);
        } else {
            esoVar.c(jlkVar, hnu.av(b2));
        }
        esoVar.d(jlkVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x017f, code lost:
    
        if (java.util.regex.Pattern.matches("Method '.+' implementing interface method '.+' is not public", r0) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r0.equals("Attempt to do a synchronize operation on a null object") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fc, code lost:
    
        if (java.util.regex.Pattern.matches(".*unmatched serializable field(s) declared", r0) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0126, code lost:
    
        if (java.util.regex.Pattern.matches("Conflicting default method implementations .+", r0) == false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hrj c(hrj hrjVar) {
        jkj C;
        jkp jkpVar;
        String str = hrjVar.d;
        if (str.isEmpty()) {
            return hrjVar;
        }
        String str2 = hrjVar.c;
        boolean z = true;
        switch (str2.hashCode()) {
            case -1940179375:
                if (str2.equals("java.lang.AbstractMethodError")) {
                    z = str.startsWith("abstract method ");
                    if (z) {
                        return hrjVar;
                    }
                    C = hrjVar.C();
                    long longValue = hnu.av(str).longValue();
                    if (!C.b.M()) {
                        C.t();
                    }
                    jkpVar = C.b;
                    hrj hrjVar2 = (hrj) jkpVar;
                    hrjVar2.b |= 4;
                    hrjVar2.e = longValue;
                    if (!jkpVar.M()) {
                        C.t();
                    }
                    hrj hrjVar3 = (hrj) C.b;
                    hrjVar3.b &= -3;
                    hrjVar3.d = hrj.a.d;
                    return (hrj) C.q();
                }
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue2 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar22 = (hrj) jkpVar;
                hrjVar22.b |= 4;
                hrjVar22.e = longValue2;
                if (!jkpVar.M()) {
                }
                hrj hrjVar32 = (hrj) C.b;
                hrjVar32.b &= -3;
                hrjVar32.d = hrj.a.d;
                return (hrj) C.q();
            case -1383341662:
                if (str2.equals("java.lang.StringIndexOutOfBoundsException")) {
                    z = Pattern.matches("length=\\d+; index=\\d+", str);
                    if (z) {
                    }
                    C = hrjVar.C();
                    long longValue22 = hnu.av(str).longValue();
                    if (!C.b.M()) {
                    }
                    jkpVar = C.b;
                    hrj hrjVar222 = (hrj) jkpVar;
                    hrjVar222.b |= 4;
                    hrjVar222.e = longValue22;
                    if (!jkpVar.M()) {
                    }
                    hrj hrjVar322 = (hrj) C.b;
                    hrjVar322.b &= -3;
                    hrjVar322.d = hrj.a.d;
                    return (hrj) C.q();
                }
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue222 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar2222 = (hrj) jkpVar;
                hrjVar2222.b |= 4;
                hrjVar2222.e = longValue222;
                if (!jkpVar.M()) {
                }
                hrj hrjVar3222 = (hrj) C.b;
                hrjVar3222.b &= -3;
                hrjVar3222.d = hrj.a.d;
                return (hrj) C.q();
            case -823400207:
                if (str2.equals("java.lang.ArithmeticException")) {
                    z = str.equals("divide by zero");
                    if (z) {
                    }
                    C = hrjVar.C();
                    long longValue2222 = hnu.av(str).longValue();
                    if (!C.b.M()) {
                    }
                    jkpVar = C.b;
                    hrj hrjVar22222 = (hrj) jkpVar;
                    hrjVar22222.b |= 4;
                    hrjVar22222.e = longValue2222;
                    if (!jkpVar.M()) {
                    }
                    hrj hrjVar32222 = (hrj) C.b;
                    hrjVar32222.b &= -3;
                    hrjVar32222.d = hrj.a.d;
                    return (hrj) C.q();
                }
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue22222 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar222222 = (hrj) jkpVar;
                hrjVar222222.b |= 4;
                hrjVar222222.e = longValue22222;
                if (!jkpVar.M()) {
                }
                hrj hrjVar322222 = (hrj) C.b;
                hrjVar322222.b &= -3;
                hrjVar322222.d = hrj.a.d;
                return (hrj) C.q();
            case -759901694:
                if (str2.equals("java.lang.IllegalAccessError")) {
                    if (!Pattern.matches("Illegal class access: '.+' attempting to access .+'", str)) {
                        if (!Pattern.matches("Illegal class access ('.+' attempting to access '.+') in attempt to invoke .+ method .+", str)) {
                            if (!Pattern.matches("Method '.+' is inaccessible to class '.+'", str)) {
                                if (!Pattern.matches("Field '.+' is inaccessible to class '.+'", str)) {
                                    if (!Pattern.matches("Final field '.+' cannot be written to by method '.+'", str)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (z) {
                    }
                    C = hrjVar.C();
                    long longValue222222 = hnu.av(str).longValue();
                    if (!C.b.M()) {
                    }
                    jkpVar = C.b;
                    hrj hrjVar2222222 = (hrj) jkpVar;
                    hrjVar2222222.b |= 4;
                    hrjVar2222222.e = longValue222222;
                    if (!jkpVar.M()) {
                    }
                    hrj hrjVar3222222 = (hrj) C.b;
                    hrjVar3222222.b &= -3;
                    hrjVar3222222.d = hrj.a.d;
                    return (hrj) C.q();
                }
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue2222222 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar22222222 = (hrj) jkpVar;
                hrjVar22222222.b |= 4;
                hrjVar22222222.e = longValue2222222;
                if (!jkpVar.M()) {
                }
                hrj hrjVar32222222 = (hrj) C.b;
                hrjVar32222222.b &= -3;
                hrjVar32222222.d = hrj.a.d;
                return (hrj) C.q();
            case -437312173:
                if (str2.equals("java.lang.ArrayStoreException")) {
                    z = Pattern.matches(".+ cannot be stored in an array of type .+", str);
                    if (z) {
                    }
                    C = hrjVar.C();
                    long longValue22222222 = hnu.av(str).longValue();
                    if (!C.b.M()) {
                    }
                    jkpVar = C.b;
                    hrj hrjVar222222222 = (hrj) jkpVar;
                    hrjVar222222222.b |= 4;
                    hrjVar222222222.e = longValue22222222;
                    if (!jkpVar.M()) {
                    }
                    hrj hrjVar322222222 = (hrj) C.b;
                    hrjVar322222222.b &= -3;
                    hrjVar322222222.d = hrj.a.d;
                    return (hrj) C.q();
                }
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue222222222 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar2222222222 = (hrj) jkpVar;
                hrjVar2222222222.b |= 4;
                hrjVar2222222222.e = longValue222222222;
                if (!jkpVar.M()) {
                }
                hrj hrjVar3222222222 = (hrj) C.b;
                hrjVar3222222222.b &= -3;
                hrjVar3222222222.d = hrj.a.d;
                return (hrj) C.q();
            case -37663348:
                if (str2.equals("java.lang.ClassCastException")) {
                    z = Pattern.matches(".+ cannot be cast to .+", str);
                    if (z) {
                    }
                    C = hrjVar.C();
                    long longValue2222222222 = hnu.av(str).longValue();
                    if (!C.b.M()) {
                    }
                    jkpVar = C.b;
                    hrj hrjVar22222222222 = (hrj) jkpVar;
                    hrjVar22222222222.b |= 4;
                    hrjVar22222222222.e = longValue2222222222;
                    if (!jkpVar.M()) {
                    }
                    hrj hrjVar32222222222 = (hrj) C.b;
                    hrjVar32222222222.b &= -3;
                    hrjVar32222222222.d = hrj.a.d;
                    return (hrj) C.q();
                }
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue22222222222 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar222222222222 = (hrj) jkpVar;
                hrjVar222222222222.b |= 4;
                hrjVar222222222222.e = longValue22222222222;
                if (!jkpVar.M()) {
                }
                hrj hrjVar322222222222 = (hrj) C.b;
                hrjVar322222222222.b &= -3;
                hrjVar322222222222.d = hrj.a.d;
                return (hrj) C.q();
            case 145247949:
                if (str2.equals("java.lang.IncompatibleClassChangeError")) {
                    if (!Pattern.matches("The method '.+' was expected to be of type .+ but instead was found to be of type .+", str)) {
                        if (!Pattern.matches("Class '.+' does not implement interface '.+' in call to '.+'", str)) {
                            if (!Pattern.matches("Expected '.+' to be a (?:static|instance) field rather than a (?:static|instance) field", str)) {
                                break;
                            }
                        }
                    }
                    if (z) {
                    }
                    C = hrjVar.C();
                    long longValue222222222222 = hnu.av(str).longValue();
                    if (!C.b.M()) {
                    }
                    jkpVar = C.b;
                    hrj hrjVar2222222222222 = (hrj) jkpVar;
                    hrjVar2222222222222.b |= 4;
                    hrjVar2222222222222.e = longValue222222222222;
                    if (!jkpVar.M()) {
                    }
                    hrj hrjVar3222222222222 = (hrj) C.b;
                    hrjVar3222222222222.b &= -3;
                    hrjVar3222222222222.d = hrj.a.d;
                    return (hrj) C.q();
                }
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue2222222222222 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar22222222222222 = (hrj) jkpVar;
                hrjVar22222222222222.b |= 4;
                hrjVar22222222222222.e = longValue2222222222222;
                if (!jkpVar.M()) {
                }
                hrj hrjVar32222222222222 = (hrj) C.b;
                hrjVar32222222222222.b &= -3;
                hrjVar32222222222222.d = hrj.a.d;
                return (hrj) C.q();
            case 287460082:
                if (str2.equals("java.io.InvalidClassException")) {
                    if (!Pattern.matches("cannot bind .+ descriptor to .+", str)) {
                        if (!Pattern.matches("Circular reference\\.", str)) {
                            if (!Pattern.matches(".*class invalid for deserialization", str)) {
                                if (!Pattern.matches("Class descriptor should be initialized", str)) {
                                    if (!Pattern.matches(".*enum descriptor has non-zero .+", str)) {
                                        if (!Pattern.matches(".*enum type", str)) {
                                            if (!Pattern.matches(".*incompatible types for field .+", str)) {
                                                if (!Pattern.matches(".*invalid descriptor for field .+", str)) {
                                                    if (!Pattern.matches(".*local class incompatible: .+", str)) {
                                                        if (!Pattern.matches(".*local class name incompatible with stream class .+", str)) {
                                                            if (!Pattern.matches("multiple serializable fields named .+", str)) {
                                                                if (!Pattern.matches(".*no valid constructor", str)) {
                                                                    if (!Pattern.matches(".*serializable and externalizable flags conflict", str)) {
                                                                        if (!Pattern.matches(".*Serializable incompatible with Externalizable", str)) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (z) {
                    }
                    C = hrjVar.C();
                    long longValue22222222222222 = hnu.av(str).longValue();
                    if (!C.b.M()) {
                    }
                    jkpVar = C.b;
                    hrj hrjVar222222222222222 = (hrj) jkpVar;
                    hrjVar222222222222222.b |= 4;
                    hrjVar222222222222222.e = longValue22222222222222;
                    if (!jkpVar.M()) {
                    }
                    hrj hrjVar322222222222222 = (hrj) C.b;
                    hrjVar322222222222222.b &= -3;
                    hrjVar322222222222222.d = hrj.a.d;
                    return (hrj) C.q();
                }
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue222222222222222 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar2222222222222222 = (hrj) jkpVar;
                hrjVar2222222222222222.b |= 4;
                hrjVar2222222222222222.e = longValue222222222222222;
                if (!jkpVar.M()) {
                }
                hrj hrjVar3222222222222222 = (hrj) C.b;
                hrjVar3222222222222222.b &= -3;
                hrjVar3222222222222222.d = hrj.a.d;
                return (hrj) C.q();
            case 1077344571:
                if (str2.equals("java.lang.WrongMethodTypeException")) {
                    z = Pattern.matches("Expected .+ but was .+", str);
                    if (z) {
                    }
                    C = hrjVar.C();
                    long longValue2222222222222222 = hnu.av(str).longValue();
                    if (!C.b.M()) {
                    }
                    jkpVar = C.b;
                    hrj hrjVar22222222222222222 = (hrj) jkpVar;
                    hrjVar22222222222222222.b |= 4;
                    hrjVar22222222222222222.e = longValue2222222222222222;
                    if (!jkpVar.M()) {
                    }
                    hrj hrjVar32222222222222222 = (hrj) C.b;
                    hrjVar32222222222222222.b &= -3;
                    hrjVar32222222222222222.d = hrj.a.d;
                    return (hrj) C.q();
                }
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue22222222222222222 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar222222222222222222 = (hrj) jkpVar;
                hrjVar222222222222222222.b |= 4;
                hrjVar222222222222222222.e = longValue22222222222222222;
                if (!jkpVar.M()) {
                }
                hrj hrjVar322222222222222222 = (hrj) C.b;
                hrjVar322222222222222222.b &= -3;
                hrjVar322222222222222222.d = hrj.a.d;
                return (hrj) C.q();
            case 1270017459:
                if (str2.equals("java.lang.IndexOutOfBoundsException")) {
                    z = Pattern.matches("length=\\d+; index=-?\\d+", str);
                    if (z) {
                    }
                    C = hrjVar.C();
                    long longValue222222222222222222 = hnu.av(str).longValue();
                    if (!C.b.M()) {
                    }
                    jkpVar = C.b;
                    hrj hrjVar2222222222222222222 = (hrj) jkpVar;
                    hrjVar2222222222222222222.b |= 4;
                    hrjVar2222222222222222222.e = longValue222222222222222222;
                    if (!jkpVar.M()) {
                    }
                    hrj hrjVar3222222222222222222 = (hrj) C.b;
                    hrjVar3222222222222222222.b &= -3;
                    hrjVar3222222222222222222.d = hrj.a.d;
                    return (hrj) C.q();
                }
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue2222222222222222222 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar22222222222222222222 = (hrj) jkpVar;
                hrjVar22222222222222222222.b |= 4;
                hrjVar22222222222222222222.e = longValue2222222222222222222;
                if (!jkpVar.M()) {
                }
                hrj hrjVar32222222222222222222 = (hrj) C.b;
                hrjVar32222222222222222222.b &= -3;
                hrjVar32222222222222222222.d = hrj.a.d;
                return (hrj) C.q();
            case 1625905794:
                if (str2.equals("java.lang.ArrayIndexOutOfBoundsException")) {
                    z = Pattern.matches("length=\\d+; index=-?\\d+", str);
                    if (z) {
                    }
                    C = hrjVar.C();
                    long longValue22222222222222222222 = hnu.av(str).longValue();
                    if (!C.b.M()) {
                    }
                    jkpVar = C.b;
                    hrj hrjVar222222222222222222222 = (hrj) jkpVar;
                    hrjVar222222222222222222222.b |= 4;
                    hrjVar222222222222222222222.e = longValue22222222222222222222;
                    if (!jkpVar.M()) {
                    }
                    hrj hrjVar322222222222222222222 = (hrj) C.b;
                    hrjVar322222222222222222222.b &= -3;
                    hrjVar322222222222222222222.d = hrj.a.d;
                    return (hrj) C.q();
                }
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue222222222222222222222 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar2222222222222222222222 = (hrj) jkpVar;
                hrjVar2222222222222222222222.b |= 4;
                hrjVar2222222222222222222222.e = longValue222222222222222222222;
                if (!jkpVar.M()) {
                }
                hrj hrjVar3222222222222222222222 = (hrj) C.b;
                hrjVar3222222222222222222222.b &= -3;
                hrjVar3222222222222222222222.d = hrj.a.d;
                return (hrj) C.q();
            case 1879291277:
                if (str2.equals("java.lang.NullPointerException")) {
                    if (!Pattern.matches("Attempt to (?:read from|write to) field '.+' on a null object reference in method '.+'", str)) {
                        if (!Pattern.matches("Attempt to invoke .+ method '.+' on a null object reference", str)) {
                            if (!str.equals("Attempt to read from null array")) {
                                if (!str.equals("Attempt to write to null array")) {
                                    if (!str.equals("Attempt to get length of null array")) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (z) {
                    }
                    C = hrjVar.C();
                    long longValue2222222222222222222222 = hnu.av(str).longValue();
                    if (!C.b.M()) {
                    }
                    jkpVar = C.b;
                    hrj hrjVar22222222222222222222222 = (hrj) jkpVar;
                    hrjVar22222222222222222222222.b |= 4;
                    hrjVar22222222222222222222222.e = longValue2222222222222222222222;
                    if (!jkpVar.M()) {
                    }
                    hrj hrjVar32222222222222222222222 = (hrj) C.b;
                    hrjVar32222222222222222222222.b &= -3;
                    hrjVar32222222222222222222222.d = hrj.a.d;
                    return (hrj) C.q();
                }
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue22222222222222222222222 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar222222222222222222222222 = (hrj) jkpVar;
                hrjVar222222222222222222222222.b |= 4;
                hrjVar222222222222222222222222.e = longValue22222222222222222222222;
                if (!jkpVar.M()) {
                }
                hrj hrjVar322222222222222222222222 = (hrj) C.b;
                hrjVar322222222222222222222222.b &= -3;
                hrjVar322222222222222222222222.d = hrj.a.d;
                return (hrj) C.q();
            default:
                z = false;
                if (z) {
                }
                C = hrjVar.C();
                long longValue222222222222222222222222 = hnu.av(str).longValue();
                if (!C.b.M()) {
                }
                jkpVar = C.b;
                hrj hrjVar2222222222222222222222222 = (hrj) jkpVar;
                hrjVar2222222222222222222222222.b |= 4;
                hrjVar2222222222222222222222222.e = longValue222222222222222222222222;
                if (!jkpVar.M()) {
                }
                hrj hrjVar3222222222222222222222222 = (hrj) C.b;
                hrjVar3222222222222222222222222.b &= -3;
                hrjVar3222222222222222222222222.d = hrj.a.d;
                return (hrj) C.q();
        }
    }
}
