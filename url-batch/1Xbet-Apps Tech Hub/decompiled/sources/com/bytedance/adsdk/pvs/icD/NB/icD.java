package com.bytedance.adsdk.pvs.icD.NB;

import com.bytedance.adsdk.pvs.icD.Jd.Jd;
import com.bytedance.adsdk.pvs.icD.Jd.vG;
import com.bytedance.adsdk.pvs.icD.icD.pvs.IP;
import com.bytedance.adsdk.pvs.icD.icD.pvs.Ju;
import com.bytedance.adsdk.pvs.icD.icD.pvs.Mxy;
import com.bytedance.adsdk.pvs.icD.icD.pvs.NB;
import com.bytedance.adsdk.pvs.icD.icD.pvs.cR;
import com.bytedance.adsdk.pvs.icD.icD.pvs.kj;
import com.bytedance.adsdk.pvs.icD.icD.pvs.qh;
import com.bytedance.adsdk.pvs.icD.icD.pvs.sUS;
import com.bytedance.adsdk.pvs.icD.icD.pvs.so;
import com.bytedance.adsdk.pvs.icD.icD.pvs.vA;
import com.bytedance.adsdk.pvs.icD.icD.pvs.zM;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: OperatorResultUtil.java */
/* loaded from: classes.dex */
public class icD {
    public static com.bytedance.adsdk.pvs.icD.icD.pvs pvs(List<com.bytedance.adsdk.pvs.icD.icD.pvs> list, String str, int i) {
        vG(list, str, i);
        Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> pvs = pvs(icD(list, str, i));
        if (pvs.size() != 1) {
            throw new IllegalStateException();
        }
        return pvs.getFirst();
    }

    private static Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> pvs(Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.pvs.icD.icD.pvs) linkedList.peekLast()).pvs() == vG.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar2 = (com.bytedance.adsdk.pvs.icD.icD.pvs) linkedList.pollLast();
                if (((com.bytedance.adsdk.pvs.icD.icD.pvs) linkedList.pollLast()).pvs() != vG.QUESTION) {
                    throw new IllegalStateException();
                }
                com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar3 = (com.bytedance.adsdk.pvs.icD.icD.pvs) linkedList.pollLast();
                zM zMVar = new zM();
                zMVar.pvs(pvsVar3);
                zMVar.icD(pvsVar2);
                zMVar.vG(pvsVar);
                linkedList.addLast(zMVar);
            } else {
                linkedList.addLast(pvsVar);
            }
        }
        return linkedList;
    }

    private static Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> icD(List<com.bytedance.adsdk.pvs.icD.icD.pvs> list, String str, int i) {
        LinkedList<com.bytedance.adsdk.pvs.icD.icD.pvs> linkedList = new LinkedList(list);
        int i2 = 5;
        while (i2 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar : linkedList) {
                if (!linkedList2.isEmpty() && vG.pvs(((com.bytedance.adsdk.pvs.icD.icD.pvs) linkedList2.peekLast()).pvs()) && ((vG) ((com.bytedance.adsdk.pvs.icD.icD.pvs) linkedList2.peekLast()).pvs()).icD() == i2) {
                    com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar2 = (com.bytedance.adsdk.pvs.icD.icD.pvs) linkedList2.pollLast();
                    com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar3 = (com.bytedance.adsdk.pvs.icD.icD.pvs) linkedList2.pollLast();
                    if (!vG.pvs(pvsVar3.pvs()) && !vG.pvs(pvsVar.pvs())) {
                        linkedList2.addLast(pvs(pvsVar3, pvsVar2, pvsVar));
                    } else {
                        throw new IllegalArgumentException(str.substring(0, i));
                    }
                } else {
                    linkedList2.addLast(pvsVar);
                }
            }
            i2--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static void vG(List<com.bytedance.adsdk.pvs.icD.icD.pvs> list, String str, int i) {
        Iterator<com.bytedance.adsdk.pvs.icD.icD.pvs> it = list.iterator();
        while (it.hasNext()) {
            if (Jd.pvs(it.next().pvs())) {
                throw new IllegalArgumentException(str.substring(0, i));
            }
        }
    }

    /* compiled from: OperatorResultUtil.java */
    /* renamed from: com.bytedance.adsdk.pvs.icD.NB.icD$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pvs;

        static {
            int[] iArr = new int[vG.values().length];
            pvs = iArr;
            try {
                iArr[vG.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pvs[vG.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pvs[vG.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                pvs[vG.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                pvs[vG.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pvs[vG.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pvs[vG.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                pvs[vG.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                pvs[vG.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                pvs[vG.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                pvs[vG.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                pvs[vG.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                pvs[vG.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static com.bytedance.adsdk.pvs.icD.icD.pvs pvs(com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar, com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar2, com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar3) {
        vA qhVar;
        switch (AnonymousClass1.pvs[((vG) pvsVar2.pvs()).ordinal()]) {
            case 1:
                qhVar = new qh();
                break;
            case 2:
                qhVar = new cR();
                break;
            case 3:
                qhVar = new com.bytedance.adsdk.pvs.icD.icD.pvs.pvs();
                break;
            case 4:
                qhVar = new Ju();
                break;
            case 5:
                qhVar = new kj();
                break;
            case 6:
                qhVar = new com.bytedance.adsdk.pvs.icD.icD.pvs.Jd();
                break;
            case 7:
                qhVar = new IP();
                break;
            case 8:
                qhVar = new sUS();
                break;
            case 9:
                qhVar = new Mxy();
                break;
            case 10:
                qhVar = new NB();
                break;
            case 11:
                qhVar = new so();
                break;
            case 12:
                qhVar = new com.bytedance.adsdk.pvs.icD.icD.pvs.icD();
                break;
            case 13:
                qhVar = new com.bytedance.adsdk.pvs.icD.icD.pvs.vG();
                break;
            default:
                throw new UnsupportedOperationException(pvsVar2.pvs().toString());
        }
        qhVar.pvs(pvsVar);
        qhVar.icD(pvsVar3);
        return qhVar;
    }

    public static boolean pvs(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
