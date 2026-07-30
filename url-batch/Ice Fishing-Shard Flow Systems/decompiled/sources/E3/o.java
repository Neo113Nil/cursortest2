package E3;

import java.time.Instant;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f699a = new o();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e eVar, String str, String str2, String str3, String str4, String str5, X5.c cVar) {
        n nVar;
        int i2;
        I4.i iVar;
        C4.b bVar;
        I4.i iVar2;
        Instant now;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i5 = nVar.f698n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                nVar.f698n = i5 - Integer.MIN_VALUE;
                Object obj = nVar.f696l;
                W5.a aVar = W5.a.f2787d;
                i2 = nVar.f698n;
                if (i2 != 0) {
                    V6.b.P(obj);
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    int hashCode = upperCase.hashCode();
                    I4.i iVar3 = I4.i.INFO;
                    switch (hashCode) {
                        case 2251950:
                            upperCase.equals("INFO");
                            iVar = iVar3;
                            break;
                        case 2656902:
                            if (upperCase.equals("WARN")) {
                                iVar = I4.i.WARN;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 64921139:
                            if (upperCase.equals("DEBUG")) {
                                iVar = I4.i.DEBUG;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 66247144:
                            if (upperCase.equals("ERROR")) {
                                iVar = I4.i.ERROR;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 66665700:
                            if (upperCase.equals("FATAL")) {
                                iVar = I4.i.FATAL;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 1069090146:
                            if (upperCase.equals("VERBOSE")) {
                                iVar = I4.i.TRACE;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        default:
                            iVar = iVar3;
                            break;
                    }
                    C4.d dVar = new C4.d(0);
                    dVar.f("log.message", str2);
                    dVar.f("log.level", str);
                    if (str3 != null) {
                        dVar.f("exception.type", str3);
                    }
                    if (str4 != null) {
                        dVar.f("exception.message", str4);
                    }
                    if (str5 != null) {
                        dVar.f("exception.stacktrace", str5);
                    }
                    C4.b b7 = dVar.b();
                    nVar.f693d = str2;
                    nVar.f694e = iVar;
                    nVar.f695i = b7;
                    nVar.f698n = 1;
                    j jVar = (j) eVar;
                    jVar.getClass();
                    Object b8 = j.b(jVar, nVar);
                    if (b8 == aVar) {
                        return aVar;
                    }
                    I4.i iVar4 = iVar;
                    obj = b8;
                    bVar = b7;
                    iVar2 = iVar4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = nVar.f695i;
                    iVar2 = nVar.f694e;
                    str2 = nVar.f693d;
                    V6.b.P(obj);
                }
                I4.e eVar2 = (I4.e) obj;
                eVar2.c(bVar);
                eVar2.d(iVar2);
                eVar2.a(str2);
                now = Instant.now();
                eVar2.e(now);
                eVar2.b();
                return Unit.f6114a;
            }
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.f696l;
        W5.a aVar2 = W5.a.f2787d;
        i2 = nVar.f698n;
        if (i2 != 0) {
        }
        I4.e eVar22 = (I4.e) obj2;
        eVar22.c(bVar);
        eVar22.d(iVar2);
        eVar22.a(str2);
        now = Instant.now();
        eVar22.e(now);
        eVar22.b();
        return Unit.f6114a;
    }
}
