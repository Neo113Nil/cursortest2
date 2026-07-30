package defpackage;

import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class kg1 {
    static {
        new au(3, null, 2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(defpackage.vf1 r5, boolean r6, defpackage.nx0 r7, defpackage.yc r8) {
        /*
            boolean r0 = r8 instanceof defpackage.jg1
            if (r0 == 0) goto L13
            r0 = r8
            jg1 r0 = (defpackage.jg1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jg1 r0 = new jg1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.k
            tn r1 = defpackage.tn.d
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r5 = r0.j
            nx0 r6 = r0.i
            vf1 r7 = r0.h
            defpackage.ca0.v(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.dd0.j(r5)
            r5 = 0
            return r5
        L38:
            defpackage.ca0.v(r8)
        L3b:
            r0.h = r5
            r0.i = r7
            r0.j = r6
            r0.l = r3
            java.lang.Object r8 = r5.a(r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            mx0 r8 = (defpackage.mx0) r8
            boolean r2 = c(r8, r6)
            if (r2 == 0) goto L3b
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg1.a(vf1, boolean, nx0, yc):java.lang.Object");
    }

    public static boolean c(mx0 mx0Var, boolean z) {
        List list = mx0Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= size) {
                return true;
            }
            qx0 qx0Var = (qx0) list.get(i);
            if (!z) {
                z2 = ka0.i(qx0Var);
            } else if (qx0Var.b() || qx0Var.h || !qx0Var.d) {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            i++;
        }
    }
}
