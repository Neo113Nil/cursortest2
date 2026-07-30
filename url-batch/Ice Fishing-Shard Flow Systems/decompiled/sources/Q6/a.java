package Q6;

import C4.p;
import D6.z;
import T6.i;
import c6.n;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.A;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import l6.c;
import q1.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final i f2352b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f2353c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f2354d;

    /* renamed from: a, reason: collision with root package name */
    public final z f2355a;

    static {
        i iVar = i.f2618l;
        byte[] data = {42};
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] copyOf = Arrays.copyOf(data, 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        f2352b = new i(copyOf);
        f2353c = q.b("*");
        Intrinsics.checkNotNullParameter(b.f2356a, "<this>");
        f2354d = new a(new z(1));
    }

    public a(z publicSuffixList) {
        Intrinsics.checkNotNullParameter(publicSuffixList, "publicSuffixList");
        this.f2355a = publicSuffixList;
    }

    public static List b(String str) {
        List G4 = StringsKt.G(str, new char[]{'.'});
        if (!Intrinsics.a(CollectionsKt.t(G4), "")) {
            return G4;
        }
        Intrinsics.checkNotNullParameter(G4, "<this>");
        int size = G4.size() - 1;
        return CollectionsKt.x(size >= 0 ? size : 0, G4);
    }

    public final String a(String domain) {
        String str;
        String str2;
        String str3;
        List list;
        List list2;
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        Intrinsics.b(unicode);
        List b7 = b(unicode);
        z zVar = this.f2355a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) zVar.f640c;
        int i2 = 0;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) zVar.f641d).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z7 = false;
            while (true) {
                try {
                    try {
                        try {
                            zVar.p();
                            break;
                        } finally {
                            if (z7) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } catch (IOException e7) {
                        zVar.f644g = e7;
                        if (z7) {
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z7 = true;
                }
            }
        }
        if (((i) zVar.f642e) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(zVar.f639b);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) zVar.f644g);
            throw illegalStateException;
        }
        int size3 = b7.size();
        i[] iVarArr = new i[size3];
        for (int i5 = 0; i5 < size3; i5++) {
            i iVar = i.f2618l;
            iVarArr[i5] = h.n((String) b7.get(i5));
        }
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                str = null;
                break;
            }
            i iVar2 = (i) zVar.f642e;
            if (iVar2 == null) {
                Intrinsics.h("bytes");
                throw null;
            }
            str = b.a(iVar2, iVarArr, i7);
            if (str != null) {
                break;
            }
            i7++;
        }
        if (size3 > 1) {
            i[] iVarArr2 = (i[]) iVarArr.clone();
            int length = iVarArr2.length - 1;
            for (int i8 = 0; i8 < length; i8++) {
                iVarArr2[i8] = f2352b;
                i iVar3 = (i) zVar.f642e;
                if (iVar3 == null) {
                    Intrinsics.h("bytes");
                    throw null;
                }
                str2 = b.a(iVar3, iVarArr2, i8);
                if (str2 != null) {
                    break;
                }
            }
        }
        str2 = null;
        if (str2 != null) {
            int i9 = size3 - 1;
            for (int i10 = 0; i10 < i9; i10++) {
                i iVar4 = (i) zVar.f643f;
                if (iVar4 == null) {
                    Intrinsics.h("exceptionBytes");
                    throw null;
                }
                str3 = b.a(iVar4, iVarArr, i10);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            list2 = StringsKt.G("!".concat(str3), new char[]{'.'});
        } else if (str == null && str2 == null) {
            list2 = f2353c;
        } else {
            if (str == null || (list = StringsKt.G(str, new char[]{'.'})) == null) {
                list = A.f6115d;
            }
            if (str2 == null || (list2 = StringsKt.G(str2, new char[]{'.'})) == null) {
                list2 = A.f6115d;
            }
            if (list.size() > list2.size()) {
                list2 = list;
            }
        }
        if (b7.size() == list2.size() && ((String) list2.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) list2.get(0)).charAt(0) == '!') {
            size = b7.size();
            size2 = list2.size();
        } else {
            size = b7.size();
            size2 = list2.size() + 1;
        }
        int i11 = size - size2;
        List b8 = b(domain);
        Intrinsics.checkNotNullParameter(b8, "<this>");
        Sequence nVar = new n(2, b8);
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(p.h(i11, "Requested element count ", " is less than zero.").toString());
        }
        if (i11 != 0) {
            nVar = nVar instanceof c ? ((c) nVar).a(i11) : new l6.b(nVar, i11);
        }
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(".", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(".", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        for (Object obj : nVar) {
            i2++;
            if (i2 > 1) {
                buffer.append((CharSequence) ".");
            }
            kotlin.text.i.a(buffer, obj, null);
        }
        buffer.append((CharSequence) "");
        return buffer.toString();
    }
}
