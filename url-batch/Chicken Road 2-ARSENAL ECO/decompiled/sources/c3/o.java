package c3;

import D3.M;
import java.time.Instant;
import java.util.Locale;
import k5.v;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f3806a = new o();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e eVar, String str, String str2, String str3, String str4, String str5, AbstractC0607c abstractC0607c) {
        n nVar;
        int i7;
        b4.i iVar;
        V3.a aVar;
        b4.i iVar2;
        Instant now;
        if (abstractC0607c instanceof n) {
            nVar = (n) abstractC0607c;
            int i8 = nVar.f3805k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                nVar.f3805k = i8 - Integer.MIN_VALUE;
                Object obj = nVar.f3803i;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = nVar.f3805k;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(upperCase, "toUpperCase(...)");
                    int hashCode = upperCase.hashCode();
                    b4.i iVar3 = b4.i.INFO;
                    switch (hashCode) {
                        case 2251950:
                            upperCase.equals("INFO");
                            iVar = iVar3;
                            break;
                        case 2656902:
                            if (upperCase.equals("WARN")) {
                                iVar = b4.i.WARN;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 64921139:
                            if (upperCase.equals("DEBUG")) {
                                iVar = b4.i.DEBUG;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 66247144:
                            if (upperCase.equals("ERROR")) {
                                iVar = b4.i.ERROR;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 66665700:
                            if (upperCase.equals("FATAL")) {
                                iVar = b4.i.FATAL;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 1069090146:
                            if (upperCase.equals("VERBOSE")) {
                                iVar = b4.i.TRACE;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        default:
                            iVar = iVar3;
                            break;
                    }
                    M m4 = new M(27);
                    m4.v("log.message", str2);
                    m4.v("log.level", str);
                    if (str3 != null) {
                        m4.v("exception.type", str3);
                    }
                    if (str4 != null) {
                        m4.v("exception.message", str4);
                    }
                    if (str5 != null) {
                        m4.v("exception.stacktrace", str5);
                    }
                    V3.a t6 = m4.t();
                    nVar.f3800f = str2;
                    nVar.f3801g = iVar;
                    nVar.f3802h = t6;
                    nVar.f3805k = 1;
                    j jVar = (j) eVar;
                    jVar.getClass();
                    Object b7 = j.b(jVar, nVar);
                    if (b7 == enumC0580a) {
                        return enumC0580a;
                    }
                    b4.i iVar4 = iVar;
                    obj = b7;
                    aVar = t6;
                    iVar2 = iVar4;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = nVar.f3802h;
                    iVar2 = nVar.f3801g;
                    str2 = nVar.f3800f;
                    AbstractC0676f.w(obj);
                }
                b4.e eVar2 = (b4.e) obj;
                eVar2.f(aVar);
                eVar2.e(iVar2);
                eVar2.a(str2);
                now = Instant.now();
                eVar2.c(now);
                eVar2.b();
                return v.f5219a;
            }
        }
        nVar = new n(this, abstractC0607c);
        Object obj2 = nVar.f3803i;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = nVar.f3805k;
        if (i7 != 0) {
        }
        b4.e eVar22 = (b4.e) obj2;
        eVar22.f(aVar);
        eVar22.e(iVar2);
        eVar22.a(str2);
        now = Instant.now();
        eVar22.c(now);
        eVar22.b();
        return v.f5219a;
    }
}
