package com.bytedance.adsdk.zmn.fs.btk;

import com.bytedance.adsdk.zmn.fs.fb.fb;
import com.bytedance.adsdk.zmn.fs.fb.zn;
import com.bytedance.adsdk.zmn.fs.fs.zmn.btk;
import com.bytedance.adsdk.zmn.fs.fs.zmn.bvs;
import com.bytedance.adsdk.zmn.fs.fs.zmn.hhw;
import com.bytedance.adsdk.zmn.fs.fs.zmn.kgc;
import com.bytedance.adsdk.zmn.fs.fs.zmn.klz;
import com.bytedance.adsdk.zmn.fs.fs.zmn.kw;
import com.bytedance.adsdk.zmn.fs.fs.zmn.mw;
import com.bytedance.adsdk.zmn.fs.fs.zmn.olo;
import com.bytedance.adsdk.zmn.fs.fs.zmn.rc;
import com.bytedance.adsdk.zmn.fs.fs.zmn.rt;
import com.bytedance.adsdk.zmn.fs.fs.zmn.zg;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes13.dex */
public class fs {
    public static com.bytedance.adsdk.zmn.fs.fs.zmn zmn(List<com.bytedance.adsdk.zmn.fs.fs.zmn> list, String str, int i) {
        zn(list, str, i);
        Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> zmn = zmn(fs(list, str, i));
        if (zmn.size() != 1) {
            throw new IllegalStateException();
        }
        return zmn.getFirst();
    }

    private static Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> zmn(Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.zmn.fs.fs.zmn) linkedList.peekLast()).zmn() == zn.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar2 = (com.bytedance.adsdk.zmn.fs.fs.zmn) linkedList.pollLast();
                if (((com.bytedance.adsdk.zmn.fs.fs.zmn) linkedList.pollLast()).zmn() != zn.QUESTION) {
                    throw new IllegalStateException();
                }
                com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar3 = (com.bytedance.adsdk.zmn.fs.fs.zmn) linkedList.pollLast();
                kw kwVar = new kw();
                kwVar.zmn(zmnVar3);
                kwVar.fs(zmnVar2);
                kwVar.zn(zmnVar);
                linkedList.addLast(kwVar);
            } else {
                linkedList.addLast(zmnVar);
            }
        }
        return linkedList;
    }

    private static Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> fs(List<com.bytedance.adsdk.zmn.fs.fs.zmn> list, String str, int i) {
        LinkedList<com.bytedance.adsdk.zmn.fs.fs.zmn> linkedList = new LinkedList(list);
        int i2 = 5;
        while (i2 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar : linkedList) {
                if (!linkedList2.isEmpty() && zn.zmn(((com.bytedance.adsdk.zmn.fs.fs.zmn) linkedList2.peekLast()).zmn()) && ((zn) ((com.bytedance.adsdk.zmn.fs.fs.zmn) linkedList2.peekLast()).zmn()).fs() == i2) {
                    com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar2 = (com.bytedance.adsdk.zmn.fs.fs.zmn) linkedList2.pollLast();
                    com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar3 = (com.bytedance.adsdk.zmn.fs.fs.zmn) linkedList2.pollLast();
                    if (!zn.zmn(zmnVar3.zmn()) && !zn.zmn(zmnVar.zmn())) {
                        linkedList2.addLast(zmn(zmnVar3, zmnVar2, zmnVar));
                    } else {
                        throw new IllegalArgumentException(str.substring(0, i));
                    }
                } else {
                    linkedList2.addLast(zmnVar);
                }
            }
            i2--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static void zn(List<com.bytedance.adsdk.zmn.fs.fs.zmn> list, String str, int i) {
        Iterator<com.bytedance.adsdk.zmn.fs.fs.zmn> it = list.iterator();
        while (it.hasNext()) {
            if (fb.zmn(it.next().zmn())) {
                throw new IllegalArgumentException(str.substring(0, i));
            }
        }
    }

    /* renamed from: com.bytedance.adsdk.zmn.fs.btk.fs$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[zn.values().length];
            zmn = iArr;
            try {
                iArr[zn.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[zn.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zmn[zn.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zmn[zn.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zmn[zn.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zmn[zn.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zmn[zn.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zmn[zn.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                zmn[zn.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                zmn[zn.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                zmn[zn.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                zmn[zn.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                zmn[zn.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static com.bytedance.adsdk.zmn.fs.fs.zmn zmn(com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar, com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar2, com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar3) {
        olo rcVar;
        switch (AnonymousClass1.zmn[((zn) zmnVar2.zmn()).ordinal()]) {
            case 1:
                rcVar = new rc();
                break;
            case 2:
                rcVar = new kgc();
                break;
            case 3:
                rcVar = new com.bytedance.adsdk.zmn.fs.fs.zmn.zmn();
                break;
            case 4:
                rcVar = new mw();
                break;
            case 5:
                rcVar = new klz();
                break;
            case 6:
                rcVar = new com.bytedance.adsdk.zmn.fs.fs.zmn.fb();
                break;
            case 7:
                rcVar = new rt();
                break;
            case 8:
                rcVar = new hhw();
                break;
            case 9:
                rcVar = new bvs();
                break;
            case 10:
                rcVar = new btk();
                break;
            case 11:
                rcVar = new zg();
                break;
            case 12:
                rcVar = new com.bytedance.adsdk.zmn.fs.fs.zmn.fs();
                break;
            case 13:
                rcVar = new com.bytedance.adsdk.zmn.fs.fs.zmn.zn();
                break;
            default:
                throw new UnsupportedOperationException(zmnVar2.zmn().toString());
        }
        rcVar.zmn(zmnVar);
        rcVar.fs(zmnVar3);
        return rcVar;
    }

    public static boolean zmn(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
