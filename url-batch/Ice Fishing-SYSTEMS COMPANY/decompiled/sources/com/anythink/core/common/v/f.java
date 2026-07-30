package com.anythink.core.common.v;

import com.anythink.core.common.d.j;
import com.anythink.core.common.h.bv;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16904a = "f";

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r4.contains(3) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r4.contains(1) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(com.anythink.core.d.l lVar, Map<String, Object> map, bv bvVar, com.anythink.core.common.h.ac acVar) {
        if (acVar == null) {
            return;
        }
        double j9 = acVar.j();
        if (j9 < 0.0d) {
            return;
        }
        int k6 = acVar.k();
        boolean l9 = acVar.l();
        List<Integer> m8 = lVar.m();
        if (m8 == null) {
            return;
        }
        boolean o9 = bvVar.o();
        int i = 2;
        boolean z8 = false;
        if (k6 == 22) {
            if (o9) {
            }
            if (!o9) {
            }
            if (!z8) {
                m8.toString();
                return;
            }
            int L8 = (int) ((j9 / lVar.L()) * 100.0d);
            int i4 = l9 ? 3 : 1;
            boolean f6 = acVar.f();
            bvVar.toString();
            m8.toString();
            map.put(j.w.f12790u, Integer.valueOf(i));
            map.put(j.w.f12791v, Integer.valueOf(L8));
            map.put(j.w.f12792w, Integer.valueOf(i4));
            map.put(j.w.f12793x, Integer.valueOf(f6 ? 1 : 0));
            return;
        }
        if (!(o9 && m8.contains(4)) && (o9 || !m8.contains(2))) {
            i = 5;
            if (!z8) {
            }
        } else {
            i = 5;
            z8 = true;
            if (!z8) {
            }
        }
    }
}
