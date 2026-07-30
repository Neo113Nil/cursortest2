package h4;

import com.crrepa.ble.conn.bean.CRPHistoryTrainingInfo;
import com.crrepa.ble.conn.bean.CRPTrainingAdvancedInfo;
import com.crrepa.ble.conn.bean.CRPTrainingInfo;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.c2;
import com.crrepa.f.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16732a = 5;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16733b = 26;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16734c = 4;

    /* renamed from: d, reason: collision with root package name */
    private static final int f16735d = 65535;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<Integer, CRPTrainingInfo> f16736e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final Map<Integer, List<Integer>> f16737f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private static final Map<Integer, List<Integer>> f16738g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private static final Map<Integer, List<Integer>> f16739h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private static final Map<Integer, List<Integer>> f16740i = new HashMap();

    private l0() {
    }

    public static List<CRPHistoryTrainingInfo> a(byte[] bArr) {
        if (bArr.length % 5 != 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 < bArr.length; i8 += 5) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, i8, bArr2, 0, 4);
            long f8 = com.crrepa.g1.c.f(bArr2) * 1000;
            BleLog.d("time: " + f8);
            if (f8 > 1000) {
                arrayList.add(new CRPHistoryTrainingInfo(i8 / 5, z1.a(f8), com.crrepa.g1.c.a(bArr[i8 + 4])));
            }
        }
        BleLog.d("parseHistoryTraining: " + arrayList.size());
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static CRPTrainingAdvancedInfo b(byte[] bArr) {
        CRPTrainingAdvancedInfo.SwimmingInfo swimmingInfo;
        if (bArr.length < 28) {
            return null;
        }
        CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo = new CRPTrainingAdvancedInfo();
        byte[] bArr2 = new byte[4];
        int a8 = com.crrepa.g1.c.a(bArr[2]);
        cRPTrainingAdvancedInfo.setTrainingType(a8);
        System.arraycopy(bArr, 3, bArr2, 0, 4);
        cRPTrainingAdvancedInfo.setAerobicPower(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
        System.arraycopy(bArr, 7, bArr2, 0, 4);
        cRPTrainingAdvancedInfo.setAnaerobicPower(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
        System.arraycopy(bArr, 11, bArr2, 0, 4);
        cRPTrainingAdvancedInfo.setAerobicEffect(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
        System.arraycopy(bArr, 15, bArr2, 0, 4);
        cRPTrainingAdvancedInfo.setAnaerobicEffect(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
        cRPTrainingAdvancedInfo.setTrainingLoad(com.crrepa.g1.c.b(bArr[20], bArr[19]));
        cRPTrainingAdvancedInfo.setFat(bArr[21]);
        cRPTrainingAdvancedInfo.setCarbohydrate(bArr[22]);
        System.arraycopy(bArr, 23, bArr2, 0, 4);
        cRPTrainingAdvancedInfo.setRecoveryTime(com.crrepa.g1.c.e(bArr2));
        cRPTrainingAdvancedInfo.setTrainingState(bArr[27]);
        if (a8 != 0) {
            if (a8 != 1) {
                if (a8 == 3) {
                    CRPTrainingAdvancedInfo.SkippingInfo skippingInfo = new CRPTrainingAdvancedInfo.SkippingInfo();
                    System.arraycopy(bArr, 28, bArr2, 0, 4);
                    skippingInfo.setTotalSkippingTimes(com.crrepa.g1.c.e(bArr2));
                    System.arraycopy(bArr, 32, bArr2, 0, 4);
                    skippingInfo.setMaxConsecutiveSkippingTimes(com.crrepa.g1.c.e(bArr2));
                    System.arraycopy(bArr, 36, bArr2, 0, 4);
                    skippingInfo.setSkippingRopeTimes(com.crrepa.g1.c.e(bArr2));
                    cRPTrainingAdvancedInfo.setSkippingInfo(skippingInfo);
                } else if (a8 != 16) {
                    if (a8 != 23) {
                        if (a8 == 49) {
                            swimmingInfo = new CRPTrainingAdvancedInfo.SwimmingInfo();
                            swimmingInfo.setFreeSwimming(com.crrepa.g1.c.a(bArr[28]));
                            swimmingInfo.setFrogSwimming(com.crrepa.g1.c.a(bArr[29]));
                            swimmingInfo.setBackstroke(com.crrepa.g1.c.a(bArr[30]));
                            swimmingInfo.setButterflySwimming(com.crrepa.g1.c.a(bArr[31]));
                            swimmingInfo.setMainSwimmingPose(com.crrepa.g1.c.a(bArr[32]));
                            System.arraycopy(bArr, 33, bArr2, 0, 4);
                            swimmingInfo.setSwolf(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
                            System.arraycopy(bArr, 37, bArr2, 0, 4);
                        } else if (a8 != 53) {
                            if (a8 == 7) {
                                swimmingInfo = new CRPTrainingAdvancedInfo.SwimmingInfo();
                                swimmingInfo.setFreeSwimming(com.crrepa.g1.c.a(bArr[28]));
                                swimmingInfo.setFrogSwimming(com.crrepa.g1.c.a(bArr[29]));
                                swimmingInfo.setBackstroke(com.crrepa.g1.c.a(bArr[30]));
                                swimmingInfo.setButterflySwimming(com.crrepa.g1.c.a(bArr[31]));
                                swimmingInfo.setMainSwimmingPose(com.crrepa.g1.c.a(bArr[32]));
                                System.arraycopy(bArr, 33, bArr2, 0, 4);
                                swimmingInfo.setSwolf(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
                                swimmingInfo.setTrainingRound(com.crrepa.g1.c.a(bArr[37]));
                                System.arraycopy(bArr, 38, bArr2, 0, 4);
                            } else if (a8 == 8) {
                                CRPTrainingAdvancedInfo.ClimbingInfo climbingInfo = new CRPTrainingAdvancedInfo.ClimbingInfo();
                                System.arraycopy(bArr, 28, bArr2, 0, 4);
                                climbingInfo.setAverageStepFrequency(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
                                cRPTrainingAdvancedInfo.setClimbingInfo(climbingInfo);
                            } else if (a8 == 19) {
                                CRPTrainingAdvancedInfo.RowingMachineInfo rowingMachineInfo = new CRPTrainingAdvancedInfo.RowingMachineInfo();
                                System.arraycopy(bArr, 28, bArr2, 0, 4);
                                rowingMachineInfo.setRowingFrequency(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
                                System.arraycopy(bArr, 32, bArr2, 0, 4);
                                rowingMachineInfo.setRowingTimes(com.crrepa.g1.c.e(bArr2));
                                cRPTrainingAdvancedInfo.setRowingMachineInfo(rowingMachineInfo);
                            } else if (a8 != 20) {
                                switch (a8) {
                                    case 25:
                                    case 26:
                                        break;
                                    case 27:
                                        break;
                                    default:
                                        switch (a8) {
                                            case 32:
                                                CRPTrainingAdvancedInfo.CyclingInfo cyclingInfo = new CRPTrainingAdvancedInfo.CyclingInfo();
                                                System.arraycopy(bArr, 28, bArr2, 0, 4);
                                                cyclingInfo.setAverageSpeed(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
                                                System.arraycopy(bArr, 32, bArr2, 0, 4);
                                                cyclingInfo.setMaxOxygenIntake(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
                                                cRPTrainingAdvancedInfo.setCyclingInfo(cyclingInfo);
                                                break;
                                        }
                                }
                            }
                        }
                        swimmingInfo.setTotalSwimmingTimes(com.crrepa.g1.c.e(bArr2));
                        cRPTrainingAdvancedInfo.setSwimmingInfo(swimmingInfo);
                    } else {
                        CRPTrainingAdvancedInfo.DumbbellInfo dumbbellInfo = new CRPTrainingAdvancedInfo.DumbbellInfo();
                        System.arraycopy(bArr, 28, bArr2, 0, 4);
                        dumbbellInfo.setTotalDumbbellTimes(com.crrepa.g1.c.e(bArr2));
                        cRPTrainingAdvancedInfo.setDumbbellInfo(dumbbellInfo);
                    }
                } else if (28 < bArr.length - 4) {
                    CRPTrainingAdvancedInfo.EllipticalMachineInfo ellipticalMachineInfo = new CRPTrainingAdvancedInfo.EllipticalMachineInfo();
                    System.arraycopy(bArr, 28, bArr2, 0, 4);
                    ellipticalMachineInfo.setStepFrequency(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
                    cRPTrainingAdvancedInfo.setEllipticalMachineInfo(ellipticalMachineInfo);
                }
                return cRPTrainingAdvancedInfo;
            }
            CRPTrainingAdvancedInfo.RunningInfo runningInfo = new CRPTrainingAdvancedInfo.RunningInfo();
            System.arraycopy(bArr, 28, bArr2, 0, 4);
            runningInfo.setAverageTouchDownTime(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
            System.arraycopy(bArr, 32, bArr2, 0, 4);
            runningInfo.setAverageShakeAmplitude(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
            System.arraycopy(bArr, 36, bArr2, 0, 4);
            runningInfo.setAveragePower(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
            System.arraycopy(bArr, 40, bArr2, 0, 4);
            runningInfo.setAverageStepLength(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
            System.arraycopy(bArr, 44, bArr2, 0, 4);
            runningInfo.setAverageBalance(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
            System.arraycopy(bArr, 48, bArr2, 0, 4);
            runningInfo.setAverageStepFrequency(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
            System.arraycopy(bArr, 52, bArr2, 0, 4);
            runningInfo.setAverageSpeed(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
            System.arraycopy(bArr, 56, bArr2, 0, 4);
            runningInfo.setMaxOxygenIntake(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
            cRPTrainingAdvancedInfo.setRunningInfo(runningInfo);
            return cRPTrainingAdvancedInfo;
        }
        CRPTrainingAdvancedInfo.WalkingInfo walkingInfo = new CRPTrainingAdvancedInfo.WalkingInfo();
        System.arraycopy(bArr, 28, bArr2, 0, 4);
        walkingInfo.setAverageStepFrequency(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
        System.arraycopy(bArr, 32, bArr2, 0, 4);
        walkingInfo.setAverageStepLength(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
        System.arraycopy(bArr, 36, bArr2, 0, 4);
        walkingInfo.setAverageSpeed(Float.intBitsToFloat(com.crrepa.g1.c.e(bArr2)));
        cRPTrainingAdvancedInfo.setWalkingInfo(walkingInfo);
        return cRPTrainingAdvancedInfo;
    }

    public static List<Integer> c(byte[] bArr) {
        if (bArr.length < 4) {
            return null;
        }
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, 2, bArr2, 0, 2);
        int b8 = com.crrepa.g1.c.b(bArr2[0], bArr2[1]);
        BleLog.d("offset: " + b8);
        byte b9 = bArr[1];
        List<Integer> list = f16740i.get(Integer.valueOf(b9));
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i8 = 4; i8 < bArr.length; i8 += 2) {
            list.add(Integer.valueOf(com.crrepa.g1.c.a(bArr[i8 + 1], bArr[i8])));
        }
        if (b8 == 65535) {
            return list;
        }
        f16740i.put(Integer.valueOf(b9), list);
        b(b9, b8);
        return null;
    }

    private static void d(int i8, int i9) {
        BleLog.d("queryTrainingHeartRate: id = " + i8 + ", offset = " + i9);
        com.crrepa.m.f.e().a(c2.d(i8, i9));
    }

    public static List<Integer> e(byte[] bArr) {
        if (bArr.length < 4) {
            return null;
        }
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, 2, bArr2, 0, 2);
        int b8 = com.crrepa.g1.c.b(bArr2[0], bArr2[1]);
        BleLog.d("offset: " + b8);
        byte b9 = bArr[1];
        List<Integer> list = f16739h.get(Integer.valueOf(b9));
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i8 = 4; i8 < bArr.length; i8 += 2) {
            list.add(Integer.valueOf(com.crrepa.g1.c.b(bArr[i8 + 1], bArr[i8])));
        }
        if (b8 == 65535) {
            return list;
        }
        f16739h.put(Integer.valueOf(b9), list);
        c(b9, b8);
        return null;
    }

    public static CRPTrainingInfo f(byte[] bArr) {
        if (bArr.length < 4) {
            return null;
        }
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, 2, bArr2, 0, 2);
        int b8 = com.crrepa.g1.c.b(bArr2[0], bArr2[1]);
        BleLog.d("offset: " + b8);
        byte b9 = bArr[1];
        List<Integer> list = f16737f.get(Integer.valueOf(b9));
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i8 = 4; i8 < bArr.length; i8++) {
            int a8 = com.crrepa.g1.c.a(bArr[i8]);
            if (a8 < 40 || a8 > 200) {
                a8 = 0;
            }
            list.add(Integer.valueOf(a8));
        }
        if (b8 != 65535) {
            f16737f.put(Integer.valueOf(b9), list);
            d(b9, b8);
            return null;
        }
        CRPTrainingInfo cRPTrainingInfo = f16736e.get(Integer.valueOf(b9));
        if (cRPTrainingInfo != null) {
            cRPTrainingInfo.setHrList(list);
        }
        return cRPTrainingInfo;
    }

    public static List<Integer> g(byte[] bArr) {
        if (bArr.length < 4) {
            return null;
        }
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, 2, bArr2, 0, 2);
        int b8 = com.crrepa.g1.c.b(bArr2[0], bArr2[1]);
        BleLog.d("offset: " + b8);
        byte b9 = bArr[1];
        List<Integer> list = f16738g.get(Integer.valueOf(b9));
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i8 = 4; i8 < bArr.length; i8++) {
            list.add(Integer.valueOf(com.crrepa.g1.c.a(bArr[i8])));
        }
        if (b8 == 65535) {
            return list;
        }
        f16738g.put(Integer.valueOf(b9), list);
        e(b9, b8);
        return null;
    }

    private static void a(int i8) {
        f16737f.put(Integer.valueOf(i8), null);
        f16738g.put(Integer.valueOf(i8), null);
        f16739h.put(Integer.valueOf(i8), null);
    }

    public static void b(int i8, int i9) {
        BleLog.d("queryTrainingAltitude: id = " + i8 + ", offset = " + i9);
        com.crrepa.m.f.e().a(c2.b(i8, i9));
    }

    public static void c(int i8, int i9) {
        BleLog.d("queryTrainingDistance: id = " + i8 + ", offset = " + i9);
        com.crrepa.m.f.e().a(c2.c(i8, i9));
    }

    public static void d(byte[] bArr) {
        if (bArr.length < 26) {
            return;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 2, bArr2, 0, 4);
        long a8 = z1.a(com.crrepa.g1.c.f(bArr2) * 1000);
        System.arraycopy(bArr, 6, bArr2, 0, 4);
        long a9 = z1.a(com.crrepa.g1.c.f(bArr2) * 1000);
        int b8 = com.crrepa.g1.c.b(bArr[11], bArr[10]);
        int a10 = com.crrepa.g1.c.a(bArr[13]);
        System.arraycopy(bArr, 14, bArr2, 0, 4);
        int f8 = (int) com.crrepa.g1.c.f(bArr2);
        System.arraycopy(bArr, 18, bArr2, 0, 4);
        int f9 = (int) com.crrepa.g1.c.f(bArr2);
        int b9 = com.crrepa.g1.c.b(bArr[23], bArr[22]);
        byte b10 = bArr[1];
        CRPTrainingInfo cRPTrainingInfo = new CRPTrainingInfo();
        cRPTrainingInfo.setId(b10);
        cRPTrainingInfo.setType(a10);
        cRPTrainingInfo.setStartTime(a8);
        cRPTrainingInfo.setEndTime(a9);
        cRPTrainingInfo.setValidTime(b8);
        cRPTrainingInfo.setSteps(f8);
        cRPTrainingInfo.setDistance(f9);
        cRPTrainingInfo.setCalories(b9);
        BleLog.d("trainingInfo: " + cRPTrainingInfo);
        f16736e.put(Integer.valueOf(b10), cRPTrainingInfo);
        a(b10);
        d(b10, 0);
    }

    public static void e(int i8, int i9) {
        BleLog.d("queryTrainingSteps: id = " + i8 + ", offset = " + i9);
        com.crrepa.m.f.e().a(c2.e(i8, i9));
    }

    public static void a(int i8, int i9) {
        BleLog.d("queryTrainingAdvanced: id = " + i8 + ", offset = " + i9);
        com.crrepa.m.f.e().a(c2.a(i8, i9));
    }
}
