package com.bytedance.adsdk.pvs.icD.vG.pvs;

import java.util.Deque;
import java.util.LinkedList;

/* compiled from: RightParenParser.java */
/* loaded from: classes.dex */
public class Mxy extends sUS {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r0.pvs() != com.bytedance.adsdk.pvs.icD.Jd.icD.METHOD) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r0 = (com.bytedance.adsdk.pvs.icD.icD.pvs.Wyp) r0;
        r1 = new java.util.LinkedList();
        r2 = new java.util.LinkedList();
        r10 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r10.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r3 = (com.bytedance.adsdk.pvs.icD.icD.pvs) r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r3.pvs() != com.bytedance.adsdk.pvs.icD.Jd.Jd.COMMA) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r2.addLast(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        r1.add(com.bytedance.adsdk.pvs.icD.NB.icD.pvs(r2, r7, r8));
        r2.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r2.isEmpty() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        r1.add(com.bytedance.adsdk.pvs.icD.NB.icD.pvs(r2, r7, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        r0.pvs((com.bytedance.adsdk.pvs.icD.icD.pvs[]) r1.toArray(new com.bytedance.adsdk.pvs.icD.icD.pvs[r1.size()]));
        r8 = r8 + 1;
        r9.push(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        r9.push(com.bytedance.adsdk.pvs.icD.NB.icD.pvs(r10, r7, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        return r8 + 1;
     */
    @Override // com.bytedance.adsdk.pvs.icD.vG.pvs.sUS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int pvs(String str, int i, Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque, com.bytedance.adsdk.pvs.icD.vG.pvs pvsVar) {
        if (')' != pvs(i, str)) {
            return pvsVar.pvs(str, i, deque);
        }
        LinkedList linkedList = new LinkedList();
        while (true) {
            com.bytedance.adsdk.pvs.icD.icD.pvs pollFirst = deque.pollFirst();
            if (pollFirst == null || pollFirst.pvs() == com.bytedance.adsdk.pvs.icD.Jd.icD.METHOD || pollFirst.pvs() == com.bytedance.adsdk.pvs.icD.Jd.Jd.LEFT_PAREN) {
                break;
            }
            linkedList.addFirst(pollFirst);
        }
        throw new IllegalArgumentException(str.substring(0, i));
    }
}
