package u5;

import com.github.mikephil.charting.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class a {
    public static double abs(double d8) {
        return Math.abs(d8);
    }

    public static List<Double> append(List<Double> list, double[] dArr) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < dArr.length; i8++) {
            arrayList.add(Double.valueOf(list.get(i8).doubleValue() + dArr[i8]));
        }
        return arrayList;
    }

    public static List<Double> diff(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size() - 1; i8++) {
            arrayList.add(Double.valueOf(list.get(r2).intValue() - list.get(i8).intValue()));
        }
        return arrayList;
    }

    public static List<Double> find(List<Double> list, double d8, String str) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        if (str.equals(">")) {
            while (i8 < list.size()) {
                if (list.get(i8).doubleValue() > d8) {
                    arrayList.add(list.get(i8));
                }
                i8++;
            }
        } else if (str.equals("<")) {
            while (i8 < list.size()) {
                if (list.get(i8).doubleValue() < d8) {
                    arrayList.add(list.get(i8));
                }
                i8++;
            }
        }
        return arrayList;
    }

    public static void fprintf(String str, Object... objArr) {
        System.out.println(String.format(str, objArr));
    }

    public static void init(List<Double> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            list.set(i8, Double.valueOf(i.DOUBLE_EPSILON));
        }
    }

    public static double[] initData(double[] dArr, double d8, int i8, int i9) {
        while (i8 <= i9) {
            dArr[i8] = d8;
            i8++;
        }
        return dArr;
    }

    public static void initDataFrontIndex(double[] dArr, List<Double> list, int i8, int i9) {
        for (int i10 = i8; i10 <= i9; i10++) {
            dArr[i10] = list.get(i10 - i8).doubleValue();
        }
    }

    public static int length(double[] dArr) {
        return dArr.length;
    }

    public static double max(double[] dArr) {
        double d8 = dArr[0];
        for (double d9 : dArr) {
            if (d9 > d8) {
                d8 = d9;
            }
        }
        return d8;
    }

    public static double mean(List<Double> list) {
        return sum(list) / list.size();
    }

    public static double rms(List<Integer> list) {
        double d8 = i.DOUBLE_EPSILON;
        for (Integer num : list) {
            d8 += num.intValue() * num.intValue();
        }
        return Math.sqrt(d8 / list.size());
    }

    public static int round(double d8) {
        return (int) Math.round(d8);
    }

    public static double std(List list) {
        double mean = mean((List<Double>) list);
        Iterator it = list.iterator();
        double d8 = i.DOUBLE_EPSILON;
        while (it.hasNext()) {
            Double d9 = (Double) it.next();
            d8 += (d9.doubleValue() - mean) * (d9.doubleValue() - mean);
        }
        return Math.sqrt(d8 / list.size());
    }

    public static List<Double> subtract(List<Double> list, double d8, int i8, int i9) {
        while (i8 < i9 + 1) {
            list.set(i8, Double.valueOf(list.get(i8).doubleValue() - d8));
            i8++;
        }
        return list;
    }

    public static List<Double> subtractAll(List<Double> list, double d8) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            list.set(i8, Double.valueOf(list.get(i8).doubleValue() - d8));
        }
        return list;
    }

    public static double sum(List<Double> list) {
        Iterator<Double> it = list.iterator();
        double d8 = i.DOUBLE_EPSILON;
        while (it.hasNext()) {
            d8 += it.next().doubleValue();
        }
        return d8;
    }

    public static List<Integer> transferDListToIList(List<Double> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) Math.round(it.next().doubleValue())));
        }
        return arrayList;
    }

    public static List<Double> transferIListToDList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(it.next().intValue()));
        }
        return arrayList;
    }

    public static double[] zeros(int i8, int i9) {
        if (i8 == 1) {
            return new double[i9];
        }
        return null;
    }

    public static List<Double> abs(List<Double> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(abs(it.next().doubleValue())));
        }
        return arrayList;
    }

    public static List<Double> initData(List<Double> list, double d8, int i8, int i9) {
        while (i8 <= i9) {
            list.set(i8, Double.valueOf(d8));
            i8++;
        }
        return list;
    }

    public static void initDataFrontIndex(double[] dArr, double[] dArr2, int i8, int i9) {
        for (int i10 = i8; i10 <= i9; i10++) {
            dArr[i10] = dArr2[i10 - i8];
        }
    }

    public static int length(List<Double> list) {
        return list.size();
    }

    public static void subtract(double[] dArr, double d8, int i8, int i9) {
        while (i8 < i9 + 1) {
            dArr[i8] = dArr[i8] - d8;
            i8++;
        }
    }

    public static double[] initData(double[] dArr, double[] dArr2, int i8, int i9) {
        for (int i10 = i8; i10 <= i9; i10++) {
            dArr[i10] = dArr2[i10 - i8];
        }
        return dArr;
    }

    public static int max(int[] iArr) {
        int i8 = iArr[0];
        for (int i9 : iArr) {
            if (i9 > i8) {
                i8 = i9;
            }
        }
        return i8;
    }

    public static double mean(double[] dArr) {
        return sum(dArr) / dArr.length;
    }

    public static void subtract(double[] dArr, List<Double> list, double d8, int i8, int i9) {
        while (i8 < i9 + 1) {
            dArr[i8] = list.get(i8).doubleValue() - d8;
            i8++;
        }
    }

    public static double sum(double[] dArr) {
        double d8 = i.DOUBLE_EPSILON;
        for (double d9 : dArr) {
            d8 += Double.valueOf(d9).doubleValue();
        }
        return d8;
    }
}
