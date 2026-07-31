package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class h1 {
    static {
        new f1(3, null);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(q1.r r5, boolean r6, q1.g r7, i6.a r8) {
        /*
            boolean r0 = r8 instanceof u.g1
            if (r0 == 0) goto L13
            r0 = r8
            u.g1 r0 = (u.g1) r0
            int r1 = r0.f7005k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7005k = r1
            goto L18
        L13:
            u.g1 r0 = new u.g1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f7004j
            int r1 = r0.f7005k
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            boolean r5 = r0.i
            q1.g r6 = r0.f7003h
            q1.r r7 = r0.f7002g
            s6.a.K(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            s6.a.K(r8)
        L3a:
            r0.f7002g = r5
            r0.f7003h = r7
            r0.i = r6
            r0.f7005k = r2
            java.lang.Object r8 = r5.a(r7, r0)
            h6.a r1 = h6.a.f3204d
            if (r8 != r1) goto L4b
            return r1
        L4b:
            q1.f r8 = (q1.f) r8
            boolean r1 = c(r8, r6)
            if (r1 == 0) goto L3a
            java.lang.Object r5 = r8.f5986a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u.h1.a(q1.r, boolean, q1.g, i6.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static boolean c(q1.f fVar, boolean z3) {
        ?? r62 = fVar.f5986a;
        int size = r62.size();
        int i = 0;
        while (true) {
            boolean z7 = true;
            if (i >= size) {
                return true;
            }
            q1.k kVar = (q1.k) r62.get(i);
            if (!z3) {
                z7 = h0.a.k(kVar);
            } else if (kVar.b() || kVar.f6001h || !kVar.f5997d) {
                z7 = false;
            }
            if (!z7) {
                return false;
            }
            i++;
        }
    }
}
