package B5;

import b6.C0530a;
import java.time.Instant;
import java.util.Locale;
import q7.v;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f362a = new o();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e eVar, String str, String str2, String str3, String str4, String str5, AbstractC5219c abstractC5219c) {
        n nVar;
        int i;
        h6.i iVar;
        C0530a c0530a;
        h6.i iVar2;
        Instant now;
        if (abstractC5219c instanceof n) {
            nVar = (n) abstractC5219c;
            int i4 = nVar.f361y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nVar.f361y = i4 - Integer.MIN_VALUE;
                Object obj = nVar.f359w;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = nVar.f361y;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.h.d(upperCase, "toUpperCase(...)");
                    int hashCode = upperCase.hashCode();
                    h6.i iVar3 = h6.i.INFO;
                    switch (hashCode) {
                        case 2251950:
                            upperCase.equals("INFO");
                            iVar = iVar3;
                            break;
                        case 2656902:
                            if (upperCase.equals("WARN")) {
                                iVar = h6.i.WARN;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 64921139:
                            if (upperCase.equals("DEBUG")) {
                                iVar = h6.i.DEBUG;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 66247144:
                            if (upperCase.equals("ERROR")) {
                                iVar = h6.i.ERROR;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 66665700:
                            if (upperCase.equals("FATAL")) {
                                iVar = h6.i.FATAL;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 1069090146:
                            if (upperCase.equals("VERBOSE")) {
                                iVar = h6.i.TRACE;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        default:
                            iVar = iVar3;
                            break;
                    }
                    I1.f fVar = new I1.f(2);
                    fVar.e("log.message", str2);
                    fVar.e("log.level", str);
                    if (str3 != null) {
                        fVar.e("exception.type", str3);
                    }
                    if (str4 != null) {
                        fVar.e("exception.message", str4);
                    }
                    if (str5 != null) {
                        fVar.e("exception.stacktrace", str5);
                    }
                    C0530a b9 = fVar.b();
                    nVar.f356n = str2;
                    nVar.f357u = iVar;
                    nVar.f358v = b9;
                    nVar.f361y = 1;
                    j jVar = (j) eVar;
                    jVar.getClass();
                    Object b10 = j.b(jVar, nVar);
                    if (b10 == enumC5179a) {
                        return enumC5179a;
                    }
                    h6.i iVar4 = iVar;
                    obj = b10;
                    c0530a = b9;
                    iVar2 = iVar4;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0530a = nVar.f358v;
                    iVar2 = nVar.f357u;
                    str2 = nVar.f356n;
                    com.bumptech.glide.f.r(obj);
                }
                h6.e eVar2 = (h6.e) obj;
                eVar2.d(c0530a);
                eVar2.c(iVar2);
                eVar2.a(str2);
                now = Instant.now();
                eVar2.f(now);
                eVar2.b();
                return v.f40183a;
            }
        }
        nVar = new n(this, abstractC5219c);
        Object obj2 = nVar.f359w;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = nVar.f361y;
        if (i != 0) {
        }
        h6.e eVar22 = (h6.e) obj2;
        eVar22.d(c0530a);
        eVar22.c(iVar2);
        eVar22.a(str2);
        now = Instant.now();
        eVar22.f(now);
        eVar22.b();
        return v.f40183a;
    }
}
