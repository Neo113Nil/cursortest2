package com.bytedance.adsdk.zmn.fs.zn.zmn;

import java.util.Deque;
import java.util.LinkedList;

/* loaded from: classes13.dex */
public class bvs extends hhw {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r0.zmn() != com.bytedance.adsdk.zmn.fs.fb.fs.METHOD) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r0 = (com.bytedance.adsdk.zmn.fs.fs.zmn.iv) r0;
        r1 = new java.util.LinkedList();
        r2 = new java.util.LinkedList();
        r11 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r11.hasNext() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r4 = (com.bytedance.adsdk.zmn.fs.fs.zmn) r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r4.zmn() != com.bytedance.adsdk.zmn.fs.fb.fb.COMMA) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r2.addLast(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r1.add(com.bytedance.adsdk.zmn.fs.btk.fs.zmn(r2, r8, r9));
        r2.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r2.isEmpty() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        r1.add(com.bytedance.adsdk.zmn.fs.btk.fs.zmn(r2, r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        r0.zmn((com.bytedance.adsdk.zmn.fs.fs.zmn[]) r1.toArray(new com.bytedance.adsdk.zmn.fs.fs.zmn[r1.size()]));
        r0.zmn(true);
        r9 = r9 + 1;
        r10.push(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r10.push(com.bytedance.adsdk.zmn.fs.btk.fs.zmn(r11, r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        return r9 + 1;
     */
    @Override // com.bytedance.adsdk.zmn.fs.zn.zmn.hhw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int zmn(String str, int i, Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque, com.bytedance.adsdk.zmn.fs.zn.zmn zmnVar) {
        if (')' != zmn(i, str)) {
            return zmnVar.zmn(str, i, deque);
        }
        LinkedList linkedList = new LinkedList();
        while (true) {
            com.bytedance.adsdk.zmn.fs.fs.zmn pollFirst = deque.pollFirst();
            if (pollFirst == null || pollFirst.zmn() == com.bytedance.adsdk.zmn.fs.fb.fb.LEFT_PAREN || ((pollFirst instanceof com.bytedance.adsdk.zmn.fs.fs.zmn.iv) && pollFirst.zmn() == com.bytedance.adsdk.zmn.fs.fb.fs.METHOD && !((com.bytedance.adsdk.zmn.fs.fs.zmn.iv) pollFirst).zn())) {
                break;
            }
            linkedList.addFirst(pollFirst);
        }
        throw new IllegalArgumentException(str.substring(0, i));
    }
}
