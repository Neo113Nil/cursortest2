package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class elq {
    private static final gzz b = gzz.b('/');
    private static final Pattern c = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        List e = b.e(str);
        if (e.size() == 3) {
            return (String) e.get(0);
        }
        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeSyncName", 56, "HashingNameSanitizer.java")).u("malformed sync name: %s", str);
        return "MALFORMED";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ler b(elp elpVar, ler lerVar) {
        String group;
        Long av;
        lem lemVar = lerVar.e;
        if (lemVar == null) {
            lemVar = lem.a;
        }
        if ((lemVar.b & 2) == 0) {
            return lerVar;
        }
        lem lemVar2 = lerVar.e;
        if (lemVar2 == null) {
            lemVar2 = lem.a;
        }
        jkj C = lemVar2.C();
        jkj C2 = lerVar.C();
        String str = ((lem) C.b).d;
        Long av2 = hnu.av(str);
        av2.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        long longValue = av2.longValue();
        if (!concurrentHashMap.containsKey(av2)) {
            int ordinal = elpVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        group = "--";
                    }
                    group = str;
                } else {
                    group = a(str);
                }
                av = hnu.av(group);
                hkh hkhVar = eiu.a;
                ((hkf) ((hkf) hkhVar.b()).i("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "rawHashFor", 135, "HashingNameSanitizer.java")).x("Sanitized Hash: [%s] %s -> %d", elpVar, group, av);
                ((hkf) ((hkf) hkhVar.d()).i("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "rawHashFor", 136, "HashingNameSanitizer.java")).x("Raw Hash: [%s] %s -> %d", elpVar, str, av2);
                if (av != null) {
                    concurrentHashMap.putIfAbsent(av2, av);
                }
            } else {
                Matcher matcher = c.matcher(str);
                if (matcher.matches()) {
                    if (str.startsWith("*sync*/")) {
                        group = "*sync*/".concat(String.valueOf(a(str.substring(7))));
                    } else {
                        group = matcher.group(1);
                        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeWakelockName", 77, "HashingNameSanitizer.java")).u("non-sync system task wakelock: %s", group);
                    }
                    av = hnu.av(group);
                    hkh hkhVar2 = eiu.a;
                    ((hkf) ((hkf) hkhVar2.b()).i("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "rawHashFor", 135, "HashingNameSanitizer.java")).x("Sanitized Hash: [%s] %s -> %d", elpVar, group, av);
                    ((hkf) ((hkf) hkhVar2.d()).i("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "rawHashFor", 136, "HashingNameSanitizer.java")).x("Raw Hash: [%s] %s -> %d", elpVar, str, av2);
                    if (av != null) {
                    }
                } else {
                    ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeWakelockName", 82, "HashingNameSanitizer.java")).u("wakelock: %s", str);
                    group = str;
                    av = hnu.av(group);
                    hkh hkhVar22 = eiu.a;
                    ((hkf) ((hkf) hkhVar22.b()).i("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "rawHashFor", 135, "HashingNameSanitizer.java")).x("Sanitized Hash: [%s] %s -> %d", elpVar, group, av);
                    ((hkf) ((hkf) hkhVar22.d()).i("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "rawHashFor", 136, "HashingNameSanitizer.java")).x("Raw Hash: [%s] %s -> %d", elpVar, str, av2);
                    if (av != null) {
                    }
                }
            }
        }
        if (!C.b.M()) {
            C.t();
        }
        jkp jkpVar = C.b;
        lem lemVar3 = (lem) jkpVar;
        lemVar3.b |= 1;
        lemVar3.c = longValue;
        if (!jkpVar.M()) {
            C.t();
        }
        lem lemVar4 = (lem) C.b;
        lemVar4.b &= -3;
        lemVar4.d = lem.a.d;
        if (!C2.b.M()) {
            C2.t();
        }
        ler lerVar2 = (ler) C2.b;
        lem lemVar5 = (lem) C.q();
        lemVar5.getClass();
        lerVar2.e = lemVar5;
        lerVar2.b |= 4;
        return (ler) C2.q();
    }

    public final ler c(ler lerVar) {
        lem lemVar = lerVar.e;
        if (lemVar == null) {
            lemVar = lem.a;
        }
        if ((lemVar.b & 1) == 0) {
            return lerVar;
        }
        lem lemVar2 = lerVar.e;
        if (lemVar2 == null) {
            lemVar2 = lem.a;
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        jkj C = lemVar2.C();
        Long l = (Long) concurrentHashMap.get(Long.valueOf(((lem) C.b).c));
        l.getClass();
        jkj C2 = lerVar.C();
        long longValue = l.longValue();
        if (!C.b.M()) {
            C.t();
        }
        lem lemVar3 = (lem) C.b;
        lemVar3.b |= 1;
        lemVar3.c = longValue;
        if (!C2.b.M()) {
            C2.t();
        }
        ler lerVar2 = (ler) C2.b;
        lem lemVar4 = (lem) C.q();
        lemVar4.getClass();
        lerVar2.e = lemVar4;
        lerVar2.b |= 4;
        return (ler) C2.q();
    }
}
