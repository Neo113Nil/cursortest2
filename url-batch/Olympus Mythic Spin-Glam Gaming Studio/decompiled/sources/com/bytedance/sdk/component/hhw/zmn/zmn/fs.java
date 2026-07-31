package com.bytedance.sdk.component.hhw.zmn.zmn;

import android.text.TextUtils;
import com.bytedance.sdk.component.hhw.zmn.nps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes6.dex */
public class fs extends zmn {
    private final zn fs;
    private final fb zmn;
    private final Queue<String> zn;

    public fs() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.zn = concurrentLinkedQueue;
        this.zmn = new hhw(concurrentLinkedQueue);
        this.fs = new zn();
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public synchronized void zmn(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar, int i) {
        fb fbVar;
        if (i != 5) {
            try {
                if (nps.hhw().cn().zmn(nps.hhw().btk()) && (fbVar = this.zmn) != null && zmnVar != null) {
                    fbVar.zmn(zmnVar, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zn znVar = this.fs;
        if (znVar != null && zmnVar != null) {
            znVar.zmn(zmnVar, i);
        }
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public synchronized void zmn(int i, List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list) {
        try {
            Iterator<com.bytedance.sdk.component.hhw.zmn.fb.zmn> it = list.iterator();
            while (it.hasNext()) {
                this.zn.remove(it.next().zn());
            }
            fb fbVar = this.zmn;
            if (fbVar != null) {
                fbVar.zmn(i, list);
            }
            zn znVar = this.fs;
            if (znVar != null) {
                znVar.zmn(i, list);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r7 == 2) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn(int i, int i2, List<String> list) {
        List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list2;
        try {
            List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn = this.zmn.zmn(i, i2, list);
            if (zmn != 0 && zmn.size() != 0) {
                zmn.size();
                if (i != 1) {
                    list2 = zmn;
                }
                List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> fs = this.fs.fs((com.bytedance.sdk.component.hhw.zmn.fb.zmn) zmn.get(0), zmn.size());
                list2 = zmn;
                if (fs != null) {
                    list2 = zmn;
                    if (fs.size() != 0) {
                        fs.size();
                        HashMap hashMap = new HashMap();
                        for (com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar : fs) {
                            hashMap.put(zmnVar.zn(), zmnVar);
                        }
                        ArrayList arrayList = new ArrayList(this.zn);
                        for (com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar2 : fs) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (TextUtils.equals(zmnVar2.zn(), (String) it.next())) {
                                        hashMap.remove(zmnVar2.zn());
                                        break;
                                    }
                                }
                            }
                        }
                        for (com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar3 : zmn) {
                            hashMap.put(zmnVar3.zn(), zmnVar3);
                        }
                        zmn.clear();
                        Iterator it2 = hashMap.keySet().iterator();
                        while (it2.hasNext()) {
                            zmn.add(hashMap.get((String) it2.next()));
                        }
                        fs.clear();
                        list2 = zmn;
                    }
                }
            } else {
                ArrayList<String> arrayList2 = new ArrayList(this.zn);
                if (list != null && !list.isEmpty()) {
                    arrayList2.addAll(list);
                }
                List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn2 = this.fs.zmn(i, i2, arrayList2);
                if (zmn2 != 0 && zmn2.size() != 0) {
                    HashMap hashMap2 = new HashMap();
                    for (com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar4 : zmn2) {
                        hashMap2.put(zmnVar4.zn(), zmnVar4);
                    }
                    arrayList2.size();
                    if (arrayList2.size() != 0) {
                        for (String str : arrayList2) {
                            if (hashMap2.get(str) != null) {
                                hashMap2.remove(str);
                            }
                        }
                    }
                    zmn2.clear();
                    Iterator it3 = hashMap2.keySet().iterator();
                    while (it3.hasNext()) {
                        zmn2.add(hashMap2.get((String) it3.next()));
                    }
                }
                list2 = zmn2;
            }
            if (list2 != null && !list2.isEmpty()) {
                Iterator<com.bytedance.sdk.component.hhw.zmn.fb.zmn> it4 = list2.iterator();
                while (it4.hasNext()) {
                    this.zn.offer(it4.next().zn());
                }
                return list2;
            }
            return new ArrayList();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public synchronized boolean zmn(int i, boolean z) {
        if (this.zmn.zmn(i, z)) {
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.so(), 1);
            return true;
        }
        if ((i != 1 && i != 2) || !this.fs.zmn(i, z)) {
            return false;
        }
        com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.ev(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.fb
    public void zmn(int i, long j) {
        this.fs.zmn(i, j);
        this.zmn.zmn(i, j);
    }
}
