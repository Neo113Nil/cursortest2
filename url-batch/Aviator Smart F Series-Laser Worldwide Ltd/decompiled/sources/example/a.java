package example;

import com.github.mikephil.charting.utils.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class a {
    double avnn;
    double cycle_ms;
    int error_signal_all;
    int fs;
    double hrs;
    double hrs_realtime;
    double sdnn;
    private double[] Num_notch = {0.0071d, 0.0058d, -0.0014d, -0.0017d, 0.0028d, -0.0014d, -0.0017d, 0.005d, -0.0066d, 0.0058d, -0.0035d, 0.0019d, -0.0024d, 0.0044d, -0.0055d, 0.0033d, 0.0023d, -0.0085d, 0.011d, -0.008d, 0.001d, 0.0052d, -0.0067d, 0.0037d, -1.0E-4d, 8.0E-4d, -0.0069d, 0.0139d, -0.0147d, 0.0052d, 0.0111d, -0.0248d, 0.0268d, -0.0156d, -0.001d, 0.0113d, -0.0091d, -6.0E-4d, 0.0044d, 0.0082d, -0.0343d, 0.0558d, -0.0499d, 0.0069d, 0.0588d, -0.1126d, 0.119d, -0.0647d, -0.0294d, 0.1173d, 0.8471d, 0.1173d, -0.0294d, -0.0647d, 0.119d, -0.1126d, 0.0588d, 0.0069d, -0.0499d, 0.0558d, -0.0343d, 0.0082d, 0.0044d, -6.0E-4d, -0.0091d, 0.0113d, -0.001d, -0.0156d, 0.0268d, -0.0248d, 0.0111d, 0.0052d, -0.0147d, 0.0139d, -0.0069d, 8.0E-4d, -1.0E-4d, 0.0037d, -0.0067d, 0.0052d, 0.001d, -0.008d, 0.011d, -0.0085d, 0.0023d, 0.0033d, -0.0055d, 0.0044d, -0.0024d, 0.0019d, -0.0035d, 0.0058d, -0.0066d, 0.005d, -0.0017d, -0.0014d, 0.0028d, -0.0017d, -0.0014d, 0.0058d, 0.0071d};
    private double[] Num_highpass = {-0.0200269196757764d, -0.0226607110432013d, -0.025720127004373d, -0.0293380449964985d, -0.0337100162137567d, -0.0391360520375428d, -0.0461009821341854d, -0.0554424754218485d, -0.0687430883572898d, -0.0893943951680397d, -0.126215029460101d, -0.211540890263123d, -0.636397814580359d, 0.636397814580359d, 0.211540890263123d, 0.126215029460101d, 0.0893943951680397d, 0.0687430883572898d, 0.0554424754218485d, 0.0461009821341854d, 0.0391360520375428d, 0.0337100162137567d, 0.0293380449964985d, 0.025720127004373d, 0.0226607110432013d, 0.0200269196757764d};
    private double[] Num_lowpass3 = {0.00265563096100552d, 0.0181470006273544d, 0.0336232652934769d, 0.0282113080060805d, -0.00811957437511893d, -0.054143029503541d, -0.0624152158976195d, 0.00525605400130302d, 0.138446113548322d, 0.272480652782846d, 0.328850187647744d, 0.272480652782846d, 0.138446113548322d, 0.00525605400130302d, -0.0624152158976195d, -0.054143029503541d, -0.00811957437511893d, 0.0282113080060805d, 0.0336232652934769d, 0.0181470006273544d, 0.00265563096100552d};

    /* renamed from: a, reason: collision with root package name */
    private double[] f16656a = {1.0d};
    private double[] Num_lp = {0.0012d, 0.0604d, 0.0362d, 0.046d, 0.0548d, 0.063d, 0.0699d, 0.0752d, 0.0785d, 0.0796d, 0.0785d, 0.0752d, 0.0699d, 0.063d, 0.0548d, 0.046d, 0.0362d, 0.0604d, 0.0012d};
    private double[] onlypeak = {100.0d, 200.0d, 400.0d, 600.0d, 750.0d, 850.0d, 950.0d, 1000.0d, 950.0d, 850.0d, 750.0d, 600.0d, 400.0d, 200.0d, 100.0d};
    private int mHrmValue = 0;
    private int mTiredValue = 0;
    private int mSpiritValue = 0;
    private int mPmValue = 0;
    private int mCardiacTestValue = 0;
    private int mCardiacFunctionValue = 0;
    private double mLFdHFValue = i.DOUBLE_EPSILON;
    private int mHrSlowValue = 0;
    private int mHrFastalue = 0;
    private int mHrMissValue = 0;
    private int mHrStopValue = 0;
    private int mHrEarlyValue = 0;
    private int mArrhythmiaValue = 0;
    private int mHrsRealtimeValue = 0;
    private int error_signal = 0;
    private int hrv_pre_cnt = 0;
    private double hrv_pre_sum = i.DOUBLE_EPSILON;
    private double hrv_pre_ave = i.DOUBLE_EPSILON;
    private int peakratio_thre_cnt = 0;
    private double peakratio_thre_sum = i.DOUBLE_EPSILON;
    private double peakratio_thre_ave = i.DOUBLE_EPSILON;
    private double ecg_lowpass_judge = i.DOUBLE_EPSILON;
    private double signal_adj_sta = 20000.0d;
    private int send_data_total = 0;
    private int next_send_group = 0;
    private int next_search_peak_start = 0;
    private int send_data_total_num = 0;
    private double hrv_pre = i.DOUBLE_EPSILON;
    private double min_value = 1.0d;
    private int len_peak_to_end = 0;
    private ArrayList<Double> fake_peak = new ArrayList<>();
    double final_gain = 1.5d;

    /* renamed from: example.a$a, reason: collision with other inner class name */
    private class C0352a {
        double imag;
        double real;

        private C0352a() {
        }

        /* synthetic */ C0352a(a aVar, C0352a c0352a) {
            this();
        }
    }

    private class b {
        int FFT_N;
        final double PI;
        double[] SIN_TAB;

        public b() {
            this.SIN_TAB = null;
            this.PI = 3.141592653589793d;
            this.FFT_N = 32;
        }

        void FFT(int i8, C0352a[] c0352aArr) {
            C0352a c0352a = null;
            C0352a c0352a2 = new C0352a(a.this, c0352a);
            C0352a c0352a3 = new C0352a(a.this, c0352a);
            int i9 = i8;
            int i10 = 1;
            while (true) {
                i9 /= 2;
                if (i9 == 1) {
                    break;
                } else {
                    i10++;
                }
            }
            int i11 = i8 / 2;
            int i12 = i11;
            for (int i13 = 1; i13 <= i8 - 2; i13++) {
                if (i13 < i12) {
                    c_swap(c0352aArr[i12], c0352aArr[i13]);
                }
                int i14 = i11;
                while (i14 <= i12) {
                    i12 -= i14;
                    i14 /= 2;
                }
                i12 += i14;
            }
            for (int i15 = 1; i15 <= i10; i15++) {
                int i16 = 2 << (i15 - 1);
                int i17 = i16 / 2;
                for (int i18 = 1; i18 <= i17; i18++) {
                    int i19 = (i10 - i15) - 1;
                    int i20 = i19 >= 0 ? (i18 - 1) * (2 << i19) : i18 - 1;
                    for (int i21 = i18 - 1; i21 < i8 - 1; i21 += i16) {
                        int i22 = i21 + i17;
                        Wn_i(i8, i20, c0352a3, 1);
                        c_mul(c0352aArr[i22], c0352a3, c0352a2);
                        c_sub(c0352aArr[i21], c0352a2, c0352aArr[i22]);
                        C0352a c0352a4 = c0352aArr[i21];
                        c_plus(c0352a4, c0352a2, c0352a4);
                    }
                }
            }
        }

        public List<Double> FFTTransfer(C0352a[] c0352aArr) {
            ArrayList arrayList = new ArrayList();
            for (C0352a c0352a : c0352aArr) {
                double d8 = c0352a.imag;
                double d9 = c0352a.real;
                arrayList.add(Double.valueOf(Math.sqrt((d8 * d8) + (d9 * d9))));
            }
            return arrayList;
        }

        void Wn_i(int i8, int i9, C0352a c0352a, int i10) {
            double d8 = (i9 * 6.283185307179586d) / i8;
            c0352a.real = Math.cos(d8);
            if (i10 == 1) {
                c0352a.imag = -Math.sin(d8);
            } else if (i10 == 0) {
                c0352a.imag = -Math.sin(d8);
            }
        }

        void c_abs(C0352a[] c0352aArr, double[] dArr, int i8) {
            for (int i9 = 0; i9 < i8; i9++) {
                C0352a c0352a = c0352aArr[i9];
                double d8 = c0352a.real;
                double d9 = c0352a.imag;
                dArr[i9] = Math.sqrt((d8 * d8) + (d9 * d9));
            }
        }

        void c_div(C0352a c0352a, C0352a c0352a2, C0352a c0352a3) {
            double d8 = c0352a.real;
            double d9 = c0352a2.real;
            double d10 = c0352a.imag;
            double d11 = c0352a2.imag;
            c0352a3.real = ((d8 * d9) + (d10 * d11)) / ((d9 * d9) + (d11 * d11));
            double d12 = c0352a2.real;
            c0352a3.imag = ((d10 * d12) - (c0352a.real * d11)) / ((d12 * d12) + (d11 * d11));
        }

        void c_mul(C0352a c0352a, C0352a c0352a2, C0352a c0352a3) {
            double d8 = c0352a.real * c0352a2.real;
            double d9 = c0352a.imag;
            double d10 = c0352a2.imag;
            c0352a3.real = d8 - (d9 * d10);
            c0352a3.imag = (c0352a.real * d10) + (d9 * c0352a2.real);
        }

        void c_plus(C0352a c0352a, C0352a c0352a2, C0352a c0352a3) {
            c0352a3.real = c0352a.real + c0352a2.real;
            c0352a3.imag = c0352a.imag + c0352a2.imag;
        }

        void c_sub(C0352a c0352a, C0352a c0352a2, C0352a c0352a3) {
            c0352a3.real = c0352a.real - c0352a2.real;
            c0352a3.imag = c0352a.imag - c0352a2.imag;
        }

        void c_swap(C0352a c0352a, C0352a c0352a2) {
            C0352a c0352a3 = new C0352a(a.this, null);
            c0352a3.real = c0352a.real;
            c0352a3.imag = c0352a.imag;
            c0352a.real = c0352a2.real;
            c0352a.imag = c0352a2.imag;
            c0352a2.real = c0352a3.real;
            c0352a2.imag = c0352a3.imag;
        }

        void conjugate_complex(int i8, C0352a[] c0352aArr, C0352a[] c0352aArr2) {
            for (int i9 = 0; i9 < i8; i9++) {
                C0352a c0352a = c0352aArr2[i9];
                C0352a c0352a2 = c0352aArr[i9];
                c0352a.imag = -c0352a2.imag;
                c0352a.real = c0352a2.real;
            }
        }

        double cos_tab(double d8) {
            double d9 = d8 + 1.5707963267948966d;
            if (d9 > 6.283185307179586d) {
                d9 -= 6.283185307179586d;
            }
            return sin_tab(d9);
        }

        void create_sin_tab(int i8, int i9) {
            this.SIN_TAB = new double[i8];
            this.FFT_N = i9;
            int i10 = 0;
            while (true) {
                int i11 = this.FFT_N;
                if (i10 > i11 / 4) {
                    return;
                }
                this.SIN_TAB[i10] = Math.sin((i10 * 6.283185307179586d) / i11);
                i10++;
            }
        }

        double sin_tab(double d8) {
            int i8 = this.FFT_N;
            int i9 = (int) (((d8 * i8) / 2.0d) / 3.141592653589793d);
            if (i9 >= 0 && i9 <= i8 / 4) {
                return this.SIN_TAB[i9];
            }
            if (i9 > i8 / 4 && i9 < i8 / 2) {
                return this.SIN_TAB[(i8 / 4) - (i9 - (i8 / 4))];
            }
            if (i9 >= i8 / 2 && i9 < (i8 * 3) / 4) {
                return -this.SIN_TAB[i9 - (i8 / 2)];
            }
            if (i9 < (i8 * 3) / 4 || i9 >= i8 * 3) {
                return i.DOUBLE_EPSILON;
            }
            return -this.SIN_TAB[i8 - i9];
        }

        private b(int i8) {
            this.SIN_TAB = null;
            this.PI = 3.141592653589793d;
            this.FFT_N = i8;
        }

        /* synthetic */ b(a aVar, int i8, b bVar) {
            this(i8);
        }
    }

    private void filter(double[] dArr, double[] dArr2, ArrayList<Double> arrayList, ArrayList<Double> arrayList2) {
        double d8 = i.DOUBLE_EPSILON;
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (i8 < dArr.length) {
                d8 += dArr[i8] * arrayList.get((arrayList.size() - i9) - 1).doubleValue();
            }
            i8++;
        }
        int i10 = 1;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            if (i10 < dArr2.length) {
                d8 -= dArr2[i10] * arrayList2.get((arrayList2.size() - i11) - 1).doubleValue();
            }
            i10++;
        }
        arrayList2.add(Double.valueOf(d8));
    }

    private void filtfilt(double[] dArr, double[] dArr2, ArrayList<Double> arrayList, ArrayList<Double> arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        ArrayList<Double> arrayList4 = new ArrayList<>();
        ArrayList<Double> arrayList5 = new ArrayList<>();
        ArrayList arrayList6 = new ArrayList();
        int i8 = 1;
        int length = dArr.length - 1;
        int size = arrayList.size();
        int i9 = length * 3;
        int i10 = i9;
        while (i10 >= i8) {
            arrayList3.add(Double.valueOf((-arrayList.get(i10).doubleValue()) + (arrayList.get(0).doubleValue() * 2.0d)));
            i10--;
            i8 = 1;
        }
        int i11 = 0;
        while (i11 < size) {
            arrayList3.add(arrayList.get(i11));
            i11++;
            i8 = 1;
        }
        int i12 = size - 2;
        while (i12 >= (size - i9) - i8) {
            arrayList3.add(Double.valueOf((-arrayList.get(i12).doubleValue()) + (arrayList.get(size - 1).doubleValue() * 2.0d)));
            i12--;
            i8 = 1;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            arrayList4.add((Double) arrayList3.get(i13));
            filter(dArr, dArr2, arrayList4, arrayList5);
        }
        for (int size2 = arrayList5.size() - i8; size2 >= 0; size2--) {
            arrayList6.add(arrayList5.get(size2));
        }
        arrayList4.clear();
        arrayList5.clear();
        for (int i14 = 0; i14 < arrayList6.size(); i14++) {
            arrayList4.add((Double) arrayList6.get(i14));
            filter(dArr, dArr2, arrayList4, arrayList5);
        }
        for (int size3 = (arrayList5.size() - i8) - i9; size3 >= i9; size3--) {
            arrayList2.add(arrayList5.get(size3));
        }
    }

    private double get_avg(int[] iArr, ArrayList<Integer> arrayList, ArrayList<Double> arrayList2, int i8, int i9) {
        double d8 = i.DOUBLE_EPSILON;
        if (arrayList2 != null) {
            for (int i10 = i8; i10 < i9; i10++) {
                d8 += arrayList2.get(i10).doubleValue();
            }
        } else if (iArr != null) {
            for (int i11 = i8; i11 < i9; i11++) {
                d8 += iArr[i11];
            }
        } else {
            if (arrayList == null) {
                return 0.1d;
            }
            for (int i12 = i8; i12 < i9; i12++) {
                d8 += arrayList.get(i12).intValue();
            }
        }
        return d8 / (i9 - i8);
    }

    private double get_max(int[] iArr, double[] dArr, ArrayList<Double> arrayList, int i8, int i9) {
        if (arrayList != null) {
            double doubleValue = arrayList.get(i8).doubleValue();
            while (i8 <= i9) {
                if (doubleValue < arrayList.get(i8).doubleValue()) {
                    doubleValue = arrayList.get(i8).doubleValue();
                }
                i8++;
            }
            return doubleValue;
        }
        if (iArr != null) {
            double d8 = iArr[i8];
            while (i8 <= i9) {
                int i10 = iArr[i8];
                if (d8 < i10) {
                    d8 = i10;
                }
                i8++;
            }
            return d8;
        }
        if (dArr == null) {
            return 0.1d;
        }
        double d9 = dArr[i8];
        while (i8 <= i9) {
            double d10 = dArr[i8];
            if (d9 < d10) {
                d9 = d10;
            }
            i8++;
        }
        return d9;
    }

    private double get_min(int[] iArr, ArrayList<Double> arrayList, int i8, int i9) {
        if (arrayList != null) {
            double doubleValue = arrayList.get(i8).doubleValue();
            while (i8 < i9) {
                if (doubleValue > arrayList.get(i8).doubleValue()) {
                    doubleValue = arrayList.get(i8).doubleValue();
                }
                i8++;
            }
            return doubleValue;
        }
        if (iArr == null) {
            return 0.1d;
        }
        double d8 = iArr[i8];
        while (i8 < i9) {
            int i10 = iArr[i8];
            if (d8 > i10) {
                d8 = i10;
            }
            i8++;
        }
        return d8;
    }

    private boolean get_peak_data(ArrayList<Double> arrayList, double[] dArr, ArrayList<Double> arrayList2, double[] dArr2, ArrayList<Integer> arrayList3, double d8) {
        int i8 = 1;
        while (i8 < dArr.length - 1) {
            int i9 = i8 - 50;
            int i10 = i8 + 50;
            int i11 = i9 < 0 ? 0 : i9;
            int length = i10 >= dArr.length ? dArr.length - 1 : i10;
            double d9 = get_max(null, dArr, null, i11, i8 - 1);
            int i12 = i8 + 1;
            double d10 = get_max(null, dArr, null, i12, length);
            double d11 = dArr[i8];
            if (d11 > d9 && d11 > d10) {
                arrayList3.add(Integer.valueOf(i8));
            }
            i8 = i12;
        }
        double d12 = 0.0d;
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            d12 += dArr[arrayList3.get(i13).intValue()];
        }
        double size = d12 / arrayList3.size();
        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
            if (dArr[arrayList3.get(i14).intValue()] < 0.2d * size) {
                arrayList3.set(i14, 0);
            }
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            arrayList2.add(arrayList.get(i15));
        }
        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
            if (arrayList3.get(i16).intValue() > 0) {
                double doubleValue = ((this.signal_adj_sta + arrayList.get(arrayList3.get(i16).intValue()).doubleValue()) / 3.0d) / arrayList.get(arrayList3.get(i16).intValue()).doubleValue();
                int intValue = arrayList3.get(i16).intValue() - 5;
                int intValue2 = arrayList3.get(i16).intValue() + 5;
                if (intValue < 0) {
                    intValue = 0;
                }
                if (intValue2 >= arrayList.size()) {
                    intValue2 = arrayList.size() - 1;
                }
                while (intValue <= intValue2) {
                    if (arrayList.get(intValue).doubleValue() > i.DOUBLE_EPSILON) {
                        dArr2[intValue] = arrayList.get(intValue).doubleValue() * doubleValue;
                    } else {
                        dArr2[intValue] = arrayList.get(intValue).doubleValue() * 0.25d;
                    }
                    arrayList2.set(intValue, Double.valueOf(i.DOUBLE_EPSILON));
                    intValue++;
                }
            }
        }
        return true;
    }

    private double[] get_peak_ratio(ArrayList<Double> arrayList, int i8) {
        double doubleValue;
        double doubleValue2;
        int i9;
        int i10;
        int size = arrayList.size();
        double[] dArr = new double[size];
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        for (int i11 = i8; i11 < size; i11++) {
            if (i11 < 3) {
                if (((Double) arrayList2.get(i11)).doubleValue() > i.DOUBLE_EPSILON && ((Double) arrayList2.get(i11)).doubleValue() > ((Double) arrayList2.get(i11 + 1)).doubleValue()) {
                    i10 = i11;
                    while (((Double) arrayList2.get(i10)).doubleValue() > ((Double) arrayList2.get(i11)).doubleValue() * 0.5d) {
                        i10 += 3;
                    }
                    int i12 = i11 + 3;
                    doubleValue = (((Double) arrayList2.get(i11)).doubleValue() - ((Double) arrayList2.get(i12)).doubleValue()) / 3.0d;
                    doubleValue2 = (((Double) arrayList2.get(i11)).doubleValue() - ((Double) arrayList2.get(i12)).doubleValue()) / 3.0d;
                    i9 = i11;
                }
                i9 = i11;
                i10 = i9;
                doubleValue = 0.0d;
                doubleValue2 = 0.0d;
            } else if (i11 >= size - 3) {
                if (((Double) arrayList2.get(i11)).doubleValue() > i.DOUBLE_EPSILON && ((Double) arrayList2.get(i11)).doubleValue() > ((Double) arrayList2.get(i11 - 1)).doubleValue()) {
                    int i13 = i11;
                    while (((Double) arrayList2.get(i13)).doubleValue() > ((Double) arrayList2.get(i11)).doubleValue() * 0.5d) {
                        i13 -= 3;
                    }
                    int i14 = i11 - 3;
                    doubleValue = (((Double) arrayList2.get(i11)).doubleValue() - ((Double) arrayList2.get(i14)).doubleValue()) / 3.0d;
                    doubleValue2 = (((Double) arrayList2.get(i11)).doubleValue() - ((Double) arrayList2.get(i14)).doubleValue()) / 3.0d;
                    i9 = i13;
                    i10 = i11;
                }
                i9 = i11;
                i10 = i9;
                doubleValue = 0.0d;
                doubleValue2 = 0.0d;
            } else {
                if (((Double) arrayList2.get(i11)).doubleValue() > i.DOUBLE_EPSILON && ((Double) arrayList2.get(i11)).doubleValue() > ((Double) arrayList2.get(i11 - 1)).doubleValue() && ((Double) arrayList2.get(i11)).doubleValue() > ((Double) arrayList2.get(i11 + 1)).doubleValue()) {
                    int i15 = i11;
                    while (i15 > 0 && ((Double) arrayList2.get(i15)).doubleValue() > ((Double) arrayList2.get(i11)).doubleValue() * 0.5d) {
                        i15--;
                    }
                    int i16 = i11;
                    while (i16 < size - 1 && ((Double) arrayList2.get(i16)).doubleValue() > ((Double) arrayList2.get(i11)).doubleValue() * 0.5d) {
                        i16++;
                    }
                    doubleValue = (((Double) arrayList2.get(i11)).doubleValue() - ((Double) arrayList2.get(i11 - 3)).doubleValue()) / 3.0d;
                    doubleValue2 = (((Double) arrayList2.get(i11)).doubleValue() - ((Double) arrayList2.get(i11 + 3)).doubleValue()) / 3.0d;
                    i9 = i15;
                    i10 = i16;
                }
                i9 = i11;
                i10 = i9;
                doubleValue = 0.0d;
                doubleValue2 = 0.0d;
            }
            int i17 = i10 - i9;
            if (i17 > 0) {
                dArr[i11] = ((doubleValue + doubleValue2) * ((Double) arrayList2.get(i11)).doubleValue()) / i17;
            } else {
                dArr[i11] = 0.0d;
            }
        }
        return dArr;
    }

    private double get_rms(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return 0.1d;
        }
        Iterator<Integer> it = arrayList.iterator();
        double d8 = i.DOUBLE_EPSILON;
        while (it.hasNext()) {
            Double d9 = (Double) it.next();
            d8 += d9.doubleValue() * d9.doubleValue();
        }
        return Math.sqrt(d8 / arrayList.size());
    }

    private double get_std(ArrayList<Integer> arrayList) {
        double d8 = 0.1d;
        if (arrayList != null) {
            int size = arrayList.size();
            double d9 = get_avg(null, arrayList, null, 0, size);
            double d10 = i.DOUBLE_EPSILON;
            for (int i8 = 0; i8 < size; i8++) {
                d10 += (arrayList.get(i8).intValue() - d9) * (arrayList.get(i8).intValue() - d9);
                d8 = Math.sqrt(d10 / size);
            }
        }
        return d8;
    }

    private void kalman_ecg(ArrayList<Double> arrayList, ArrayList<Double> arrayList2) {
        int size = arrayList.size();
        arrayList2.addAll(arrayList);
        for (int i8 = 2; i8 < size; i8++) {
            int i9 = i8 - 1;
            arrayList2.set(i8, Double.valueOf(arrayList2.get(i9).doubleValue() + (0.05d * (arrayList2.get(i8).doubleValue() - arrayList2.get(i9).doubleValue()))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean AlgCalculate_HRV(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2, int i8, double d8) {
        double d9;
        double d10;
        double d11;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object[] objArr;
        int i15 = this.hrv_pre_cnt;
        double d12 = i.DOUBLE_EPSILON;
        Double valueOf = Double.valueOf(i.DOUBLE_EPSILON);
        int i16 = 0;
        if (i15 <= 0) {
            this.hrv_pre_ave = 100.0d;
            this.peakratio_thre_ave = i.DOUBLE_EPSILON;
            return false;
        }
        this.hrv_pre_ave = this.hrv_pre_sum / i15;
        this.peakratio_thre_ave = this.peakratio_thre_sum / this.peakratio_thre_cnt;
        ArrayList arrayList3 = new ArrayList();
        ArrayList<Double> arrayList4 = new ArrayList<>();
        if (arrayList.size() < 500 || this.hrv_pre == i.DOUBLE_EPSILON || arrayList.size() < i8) {
            return false;
        }
        double d13 = get_avg(null, arrayList, null, 0, 500);
        int i17 = 0;
        while (i17 < i8) {
            arrayList3.add(Double.valueOf(arrayList.get(i17).intValue() - d13));
            i17++;
            d12 = i.DOUBLE_EPSILON;
        }
        ArrayList<Double> arrayList5 = new ArrayList<>();
        int i18 = 0;
        while (i18 < arrayList3.size()) {
            arrayList5.add((Double) arrayList3.get(i18));
            filter(this.Num_notch, this.f16656a, arrayList5, arrayList4);
            i18++;
            d12 = i.DOUBLE_EPSILON;
        }
        ArrayList<Double> arrayList6 = new ArrayList<>();
        int i19 = 100;
        int i20 = 100;
        while (i20 < arrayList4.size()) {
            arrayList6.add(arrayList4.get(i20));
            i20++;
            i19 = 100;
            d12 = i.DOUBLE_EPSILON;
        }
        ArrayList<Double> arrayList7 = new ArrayList<>();
        filtfilt(this.Num_highpass, this.f16656a, arrayList6, arrayList7);
        ArrayList<Double> arrayList8 = new ArrayList<>();
        filtfilt(this.Num_lowpass3, this.f16656a, arrayList7, arrayList8);
        int i21 = 0;
        while (i21 < arrayList8.size()) {
            ArrayList<Double> arrayList9 = arrayList8;
            if (arrayList9.get(i21).doubleValue() > d8) {
                arrayList9.set(i21, Double.valueOf(d8 - (i21 / 500)));
            } else {
                double d14 = -d8;
                if (arrayList9.get(i21).doubleValue() < d14) {
                    arrayList9.set(i21, Double.valueOf(d14 + (i21 / 500)));
                }
            }
            i21++;
            arrayList8 = arrayList9;
            i19 = 100;
            d12 = i.DOUBLE_EPSILON;
        }
        double[] dArr = get_peak_ratio(arrayList8, 3);
        int[] iArr = new int[i19];
        int i22 = 1;
        int i23 = 0;
        int i24 = 1;
        while (i24 < dArr.length - i22) {
            double[] dArr2 = dArr;
            int round = i24 - ((int) Math.round(this.hrv_pre_ave * 0.65d));
            int round2 = ((int) Math.round(this.hrv_pre_ave * 0.65d)) + i24;
            int i25 = round < 0 ? 0 : round;
            int length = round2 >= dArr2.length ? dArr2.length - 1 : round2;
            int i26 = i23;
            int i27 = i24;
            int[] iArr2 = iArr;
            int i28 = i25;
            ArrayList<Double> arrayList10 = arrayList8;
            double d15 = get_max(null, dArr2, null, i28, i24 - 1);
            int i29 = i27 + 1;
            double d16 = get_max(null, dArr2, null, i29, length);
            double d17 = dArr2[i27];
            if (d17 > d15 && d17 > d16) {
                iArr2[i26] = i27;
                if (i26 < 99) {
                    i23 = i26 + 1;
                    arrayList8 = arrayList10;
                    dArr = dArr2;
                    iArr = iArr2;
                    i24 = i29;
                    i22 = 1;
                    i19 = 100;
                    d12 = i.DOUBLE_EPSILON;
                }
            }
            i23 = i26;
            arrayList8 = arrayList10;
            dArr = dArr2;
            iArr = iArr2;
            i24 = i29;
            i22 = 1;
            i19 = 100;
            d12 = i.DOUBLE_EPSILON;
        }
        double d18 = d12;
        int i30 = 0;
        while (i30 < i23) {
            d18 += dArr[iArr[i30]];
            i30++;
            i22 = 1;
            i19 = 100;
            d12 = i.DOUBLE_EPSILON;
        }
        if (i23 == 0) {
            return false;
        }
        double[] dArr3 = dArr;
        double d19 = d18 / i23;
        double d20 = d12;
        int i31 = 0;
        int i32 = 0;
        while (i31 < i23) {
            double d21 = dArr3[iArr[i31]];
            if (d21 < d19) {
                d20 += d21;
                i32++;
            }
            i31++;
            i22 = 1;
            i19 = 100;
            d12 = i.DOUBLE_EPSILON;
        }
        if (i32 == 0) {
            return false;
        }
        double d22 = d20 / i32;
        ArrayList arrayList11 = new ArrayList();
        int i33 = 0;
        while (i33 < i23) {
            double d23 = this.peakratio_thre_ave;
            if (d23 != i.DOUBLE_EPSILON) {
                int i34 = iArr[i33];
                double d24 = dArr3[i34];
                if (d24 > 1.5d * d22) {
                    this.error_signal_all++;
                }
                if (d24 > 0.2d * d22 && d24 < d23 * 3.0d) {
                    arrayList11.add(Integer.valueOf(i34));
                }
            }
            i33++;
            i22 = 1;
            i19 = 100;
            d12 = i.DOUBLE_EPSILON;
        }
        this.error_signal_all += this.error_signal;
        ArrayList<Double> arrayList12 = new ArrayList<>();
        int i35 = 0;
        while (i35 < arrayList8.size()) {
            arrayList12.add(arrayList8.get(i35));
            i35++;
            i22 = 1;
            i19 = 100;
            d12 = i.DOUBLE_EPSILON;
        }
        double[] dArr4 = new double[arrayList8.size()];
        double d25 = d12;
        int i36 = 0;
        int i37 = 0;
        while (true) {
            if (i36 >= arrayList11.size()) {
                break;
            }
            if (((Integer) arrayList11.get(i36)).intValue() < arrayList8.size()) {
                double doubleValue = arrayList8.get(((Integer) arrayList11.get(i36)).intValue()).doubleValue() > i.DOUBLE_EPSILON ? ((this.signal_adj_sta + arrayList8.get(((Integer) arrayList11.get(i36)).intValue()).doubleValue()) / 3.0d) / arrayList8.get(((Integer) arrayList11.get(i36)).intValue()).doubleValue() : 1.0d;
                double d26 = d25 + doubleValue;
                int i38 = i37 + 1;
                int intValue = ((Integer) arrayList11.get(i36)).intValue() - 5;
                int intValue2 = ((Integer) arrayList11.get(i36)).intValue() + 5;
                int i39 = intValue < 0 ? 0 : intValue;
                if (intValue2 >= arrayList8.size()) {
                    intValue2 = arrayList8.size() - 1;
                }
                for (int i40 = i39; i40 <= intValue2; i40++) {
                    arrayList12.set(i40, valueOf);
                }
                for (int i41 = i39; i41 <= intValue2; i41++) {
                    if (arrayList8.get(i41).doubleValue() > i.DOUBLE_EPSILON) {
                        dArr4[i41] = arrayList8.get(i41).doubleValue() * doubleValue;
                    } else {
                        dArr4[i41] = arrayList8.get(i41).doubleValue() / 4.0d;
                    }
                }
                if (i39 > 20) {
                    for (int i42 = i39 - 5; i42 <= i39 - 1; i42++) {
                        double d27 = dArr4[i39];
                        dArr4[i42] = d27 + (((100.0d - d27) / 5.0d) * (i39 - i42));
                    }
                    int i43 = 0;
                    for (int i44 = i39 - 20; i44 <= i39 - 6; i44++) {
                        dArr4[i44] = this.onlypeak[i43];
                        i43++;
                    }
                }
                i37 = i38;
                d25 = d26;
            }
            i36++;
            i22 = 1;
            i19 = 100;
            d12 = i.DOUBLE_EPSILON;
        }
        if (i37 <= 0) {
            return false;
        }
        double d28 = d25 / i37;
        ArrayList<Double> arrayList13 = new ArrayList<>();
        filtfilt(this.Num_lp, this.f16656a, arrayList12, arrayList13);
        int i45 = 0;
        while (true) {
            d9 = 2.0d;
            if (i45 >= arrayList13.size()) {
                break;
            }
            if (arrayList13.get(i45).doubleValue() < i.DOUBLE_EPSILON) {
                arrayList13.set(i45, Double.valueOf(arrayList13.get(i45).doubleValue() / 2.0d));
            } else {
                arrayList13.set(i45, Double.valueOf(arrayList13.get(i45).doubleValue() * d28 * 1.5d));
            }
            i45++;
            i22 = 1;
            d12 = i.DOUBLE_EPSILON;
        }
        ArrayList arrayList14 = new ArrayList();
        int i46 = 0;
        while (i46 < arrayList13.size()) {
            arrayList14.add(Double.valueOf(arrayList13.get(i46).doubleValue() + dArr4[i46]));
            i46++;
            i22 = 1;
            d9 = 2.0d;
            d12 = i.DOUBLE_EPSILON;
        }
        int i47 = 0;
        while (i47 < i19) {
            arrayList14.set(i47, valueOf);
            i47++;
            i22 = 1;
            d9 = 2.0d;
            d12 = i.DOUBLE_EPSILON;
        }
        int i48 = 0;
        while (i48 < arrayList13.size()) {
            if (((Double) arrayList14.get(i48)).doubleValue() > i.DOUBLE_EPSILON) {
                arrayList14.set(i48, Double.valueOf(((Double) arrayList14.get(i48)).doubleValue() * this.final_gain));
            }
            i48++;
            i22 = 1;
            d9 = 2.0d;
            d12 = i.DOUBLE_EPSILON;
        }
        int i49 = 0;
        while (i49 < arrayList14.size()) {
            arrayList2.add(Integer.valueOf((int) Math.round(((Double) arrayList14.get(i49)).doubleValue())));
            i49++;
            i22 = 1;
            d9 = 2.0d;
            d12 = i.DOUBLE_EPSILON;
        }
        if (arrayList11.size() < 5) {
            return false;
        }
        ArrayList arrayList15 = new ArrayList();
        int i50 = 0;
        while (i50 < arrayList11.size() - i22) {
            int i51 = i50 + 1;
            arrayList15.add(Integer.valueOf(((Integer) arrayList11.get(i51)).intValue() - ((Integer) arrayList11.get(i50)).intValue()));
            i50 = i51;
            i22 = 1;
            d9 = 2.0d;
            d12 = i.DOUBLE_EPSILON;
        }
        ArrayList<Integer> arrayList16 = new ArrayList<>();
        int i52 = 0;
        while (i52 < arrayList15.size()) {
            if (((Integer) arrayList15.get(i52)).intValue() < this.hrv_pre_ave * 1.3d && ((Integer) arrayList15.get(i52)).intValue() > this.hrv_pre_ave * 0.7d) {
                arrayList16.add((Integer) arrayList15.get(i52));
            }
            i52++;
            d9 = 2.0d;
            d12 = i.DOUBLE_EPSILON;
        }
        if (arrayList16.size() < 5) {
            return false;
        }
        int size = arrayList16.size();
        double d29 = get_avg(null, arrayList16, null, 0, size);
        this.avnn = d29;
        this.mHrmValue = (int) Math.round(60000.0d / (d29 * this.cycle_ms));
        this.sdnn = u5.a.std(u5.a.transferIListToDList(arrayList16)) * this.cycle_ms;
        ArrayList arrayList17 = new ArrayList(arrayList16);
        Collections.reverse(arrayList17);
        List<Integer> transferDListToIList = u5.a.transferDListToIList(u5.a.abs(u5.a.diff(arrayList17)));
        u5.a.rms(transferDListToIList);
        u5.a.std(u5.a.transferIListToDList(transferDListToIList));
        this.mHrMissValue = 0;
        this.mHrStopValue = 0;
        this.mHrEarlyValue = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        while (i53 < size - 1) {
            int i59 = i56;
            int i60 = i57;
            if (u5.a.abs(transferDListToIList.get(i53).intValue()) * this.cycle_ms >= 50.0d) {
                i54++;
            }
            if (u5.a.abs(transferDListToIList.get(i53).intValue()) * this.cycle_ms >= 120.0d) {
                i55++;
            }
            if (arrayList16.get(i53).intValue() < this.avnn * 1.8d || arrayList16.get(i53).intValue() > this.avnn * 2.2d) {
                if (arrayList16.get(i53).intValue() > this.avnn * 2.2d) {
                    i56 = i59 + 1;
                    this.mHrStopValue = i56;
                } else {
                    i56 = i59;
                }
                i57 = i60;
            } else {
                i57 = i60 + 1;
                this.mHrMissValue = i57;
                i56 = i59;
            }
            List<Integer> list = transferDListToIList;
            int i61 = i54;
            if (arrayList16.get(i53).intValue() <= this.avnn * 0.6d) {
                int i62 = i53 + 1;
                i14 = i55;
                if (arrayList16.get(i62).intValue() <= this.avnn * 0.6d || arrayList16.get(i62).intValue() >= this.avnn * 1.4d) {
                    int i63 = i58 + 1;
                    this.mHrEarlyValue = i63;
                    i58 = i63;
                }
            } else {
                i14 = i55;
            }
            i53++;
            transferDListToIList = list;
            i54 = i61;
            i55 = i14;
            d9 = 2.0d;
            d12 = i.DOUBLE_EPSILON;
        }
        if (size > 0) {
            d10 = (i54 * 100) / size;
            d11 = (i55 * 100) / size;
        } else {
            d10 = d12;
            d11 = d10;
        }
        int i64 = 32;
        C0352a[] c0352aArr = new C0352a[32];
        int i65 = 0;
        while (true) {
            C0352a c0352a = null;
            objArr = 0;
            if (i65 >= 32) {
                break;
            }
            c0352aArr[i65] = new C0352a(this, c0352a);
            i65++;
            i56 = i56;
            d9 = 2.0d;
            d12 = i.DOUBLE_EPSILON;
        }
        int i66 = 0;
        while (i66 < 32) {
            int i67 = i56;
            int i68 = i57;
            if (i66 < size) {
                c0352aArr[i66].real = arrayList16.get(i66).intValue();
            } else if (i66 < size || i66 >= size * 2) {
                if (i66 < size * 2 || i66 >= size * 3) {
                    c0352aArr[i66].real = i.DOUBLE_EPSILON;
                } else {
                    c0352aArr[i66].real = arrayList16.get(i66 - r3).intValue();
                }
            } else {
                c0352aArr[i66].real = arrayList16.get(i66 - size).intValue();
            }
            i66++;
            i56 = i67;
            i57 = i68;
            d9 = 2.0d;
            d12 = i.DOUBLE_EPSILON;
        }
        int i69 = 0;
        while (i69 < 32) {
            int i70 = i57;
            C0352a c0352a2 = c0352aArr[i69];
            c0352a2.real = (c0352a2.real - this.avnn) / 125;
            i69++;
            i56 = i56;
            i57 = i70;
            d9 = 2.0d;
            d12 = i.DOUBLE_EPSILON;
        }
        b bVar = new b(this, i64, objArr == true ? 1 : 0);
        bVar.FFT(32, c0352aArr);
        List<Double> FFTTransfer = bVar.FFTTransfer(c0352aArr);
        double d30 = this.avnn;
        double d31 = d30 > d12 ? 125 / d30 : 1.0d;
        List<Double> abs = u5.a.abs(FFTTransfer);
        ArrayList arrayList18 = new ArrayList();
        Iterator<Double> it = abs.iterator();
        while (it.hasNext()) {
            arrayList18.add(Double.valueOf(it.next().doubleValue() / 16.0d));
            i56 = i56;
            d9 = 2.0d;
            d12 = i.DOUBLE_EPSILON;
        }
        arrayList18.set(0, Double.valueOf(((Double) arrayList18.get(0)).doubleValue() / d9));
        int i71 = 0;
        while (i71 < abs.size()) {
            abs.set(i71, Double.valueOf(Math.log10(abs.get(i71).doubleValue() / 16.0d) * 20.0d));
            i71++;
            i56 = i56;
            d12 = i.DOUBLE_EPSILON;
        }
        abs.set(0, abs.get(0));
        double d32 = d31 / 32.0d;
        int round3 = u5.a.round(0.04d / d32);
        double d33 = 0.15d / d32;
        int round4 = u5.a.round(d33);
        int round5 = u5.a.round(d33);
        int round6 = u5.a.round(0.4d / d32);
        double d34 = d12;
        while (round3 <= round4 - 1) {
            d34 += ((Double) arrayList18.get(round3)).doubleValue() * d32;
            round3++;
            i56 = i56;
            d12 = i.DOUBLE_EPSILON;
        }
        double d35 = d34 * 1000.0d;
        double d36 = d12;
        while (round5 <= round6 - 1) {
            d36 += ((Double) arrayList18.get(round5)).doubleValue() * d32;
            round5++;
            i56 = i56;
            d12 = i.DOUBLE_EPSILON;
        }
        double d37 = d36 * 1000.0d;
        double d38 = d37 > d12 ? d35 / d37 : d12;
        this.mLFdHFValue = d38;
        this.mHrFastalue = 0;
        this.mHrSlowValue = 0;
        this.mArrhythmiaValue = 0;
        double round7 = u5.a.round(60000.0d / (this.avnn * this.cycle_ms));
        this.hrs = round7;
        if (round7 >= 100.0d) {
            i9 = 1;
            this.mHrSlowValue = 1;
            i10 = 1;
        } else {
            i9 = 1;
            i10 = 0;
        }
        if (round7 <= 60.0d) {
            this.mHrFastalue = i9;
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (d11 >= 20.0d) {
            this.mArrhythmiaValue = i9;
            i12 = i56;
            i13 = i57;
            i16 = 1;
        } else {
            i12 = i56;
            i13 = i57;
        }
        double d39 = (((100.0d - (this.sdnn / 4.0d)) - (15.0d * d35)) - (d38 * 20.0d)) - (d10 / 4.0d);
        if (d39 <= 5.0d) {
            d39 = 5.0d;
        }
        double round8 = u5.a.round(((d39 * 3.0d) + 50.0d) / 4.0d);
        this.mTiredValue = u5.a.round(round8);
        double d40 = (((d35 * 5.0d) + 20.0d) - (d37 * 5.0d)) + (d38 * 10.0d);
        if (d40 > 95.0d) {
            d40 = 95.0d;
        }
        double round9 = u5.a.round((d40 + 40.0d) / 2.0d);
        this.mSpiritValue = u5.a.round(round9);
        double abs2 = (u5.a.abs(1.2d - d38) * 20.0d) + 10.0d;
        if (abs2 > 80.0d) {
            abs2 = ((abs2 - 80.0d) / 10.0d) + 80.0d;
        }
        double round10 = u5.a.round((((abs2 < 95.0d ? abs2 : 95.0d) + round8) + round9) / 3.0d);
        this.mPmValue = u5.a.round(round10);
        double round11 = u5.a.round(size > 0 ? ((((90.0d - (u5.a.abs(this.hrs - 70.0d) * 0.25d)) + (this.sdnn * 0.2d)) - (((i11 + i10) + i16) * 20)) - ((((i13 + i12) + i58) / size) * 200)) - (round10 / 8.0d) : i.DOUBLE_EPSILON);
        double d41 = round11 > 5.0d ? round11 >= 99.0d ? 99.0d : round11 : 5.0d;
        this.mCardiacTestValue = u5.a.round(d41);
        this.mCardiacFunctionValue = d41 >= 80.0d ? 3 : (d41 >= 80.0d || d41 <= 50.0d) ? 1 : 2;
        return true;
    }

    public void AlgInit() {
        this.fs = 125;
        this.signal_adj_sta = 20000.0d;
        this.error_signal = 0;
        this.error_signal_all = 0;
        this.hrv_pre_cnt = 0;
        this.hrv_pre_sum = i.DOUBLE_EPSILON;
        this.hrv_pre_ave = i.DOUBLE_EPSILON;
        this.peakratio_thre_cnt = 0;
        this.peakratio_thre_sum = i.DOUBLE_EPSILON;
        this.peakratio_thre_ave = i.DOUBLE_EPSILON;
        this.send_data_total = 0;
        this.next_send_group = 0;
        this.next_search_peak_start = 0;
        this.send_data_total_num = 0;
        this.ecg_lowpass_judge = i.DOUBLE_EPSILON;
        this.mHrmValue = 0;
        this.mTiredValue = 0;
        this.mSpiritValue = 0;
        this.mPmValue = 0;
        this.mCardiacTestValue = 0;
        this.mCardiacFunctionValue = 0;
        this.mLFdHFValue = i.DOUBLE_EPSILON;
        this.mHrSlowValue = 0;
        this.mHrFastalue = 0;
        this.mHrMissValue = 0;
        this.mHrStopValue = 0;
        this.mHrEarlyValue = 0;
        this.mArrhythmiaValue = 0;
        this.mHrsRealtimeValue = 0;
        if (this.fake_peak.size() > 0) {
            this.fake_peak.clear();
        }
    }

    public int GetArrhythmiaValue() {
        return this.mArrhythmiaValue;
    }

    public int GetCardiacFunctionValue() {
        return this.mCardiacFunctionValue;
    }

    public int GetCardiacTestValue() {
        return this.mCardiacTestValue;
    }

    public int GetErrorSignal() {
        return this.error_signal;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x027a A[LOOP:9: B:100:0x023a->B:101:0x027a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0260 A[LOOP:10: B:104:0x023d->B:106:0x0260, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0286 A[LOOP:8: B:96:0x0219->B:97:0x0286, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int GetFilterData(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2, double d8) {
        int i8;
        double d9;
        double d10;
        double d11;
        ArrayList<Double> arrayList3;
        double[] dArr;
        double d12;
        double d13;
        double d14;
        long j8;
        ArrayList<Integer> arrayList4;
        double d15;
        double doubleValue;
        double d16;
        double d17;
        double d18;
        double d19;
        int i9;
        ArrayList<Double> arrayList5;
        ArrayList arrayList6;
        int i10;
        int i11;
        int size;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList7 = new ArrayList();
        ArrayList<Double> arrayList8 = new ArrayList<>();
        int size2 = arrayList.size();
        this.error_signal = 0;
        if (arrayList2.size() > 0) {
            arrayList2.clear();
        }
        int i15 = 500;
        if (size2 >= 500 && size2 <= 6250) {
            int i16 = this.send_data_total;
            if (i16 >= 500 || size2 < 500) {
                int i17 = this.next_send_group;
                if (i16 + i17 <= size2) {
                    this.send_data_total_num++;
                    int i18 = i16 + i17;
                    double d20 = get_avg(null, arrayList, null, 0, 500);
                    for (int i19 = 0; i19 < size2; i19++) {
                        arrayList7.add(Double.valueOf(arrayList.get(i19).intValue() - d20));
                    }
                    ArrayList<Double> arrayList9 = new ArrayList<>();
                    for (int i20 = 0; i20 < arrayList7.size(); i20++) {
                        arrayList9.add((Double) arrayList7.get(i20));
                        filter(this.Num_notch, this.f16656a, arrayList9, arrayList8);
                    }
                    ArrayList<Double> arrayList10 = new ArrayList<>();
                    for (int i21 = i16; i21 < i18; i21++) {
                        arrayList10.add(arrayList8.get(i21));
                    }
                    ArrayList<Double> arrayList11 = new ArrayList<>();
                    filtfilt(this.Num_highpass, this.f16656a, arrayList10, arrayList11);
                    ArrayList<Double> arrayList12 = new ArrayList<>();
                    filtfilt(this.Num_lowpass3, this.f16656a, arrayList11, arrayList12);
                    int size3 = arrayList12.size();
                    int i22 = 0;
                    while (true) {
                        i8 = 10;
                        if (i22 >= 10) {
                            break;
                        }
                        arrayList12.set(i22, Double.valueOf(arrayList12.get(i22).doubleValue() + ((this.ecg_lowpass_judge * (10 - i22)) / 15.0d)));
                        i22++;
                        size3 = size3;
                    }
                    int i23 = size3 - 1;
                    int i24 = size3 - 5;
                    if (arrayList12.get(i23).doubleValue() > arrayList12.get(i24).doubleValue()) {
                        this.ecg_lowpass_judge = arrayList12.get(i23).doubleValue() - arrayList12.get(i24).doubleValue();
                    } else {
                        this.ecg_lowpass_judge = i.DOUBLE_EPSILON;
                    }
                    int i25 = size3 - 10;
                    while (i25 < size3) {
                        arrayList12.set(i25, Double.valueOf(arrayList12.get(i25).doubleValue() + ((this.ecg_lowpass_judge * ((i25 + 11) - size3)) / 14.0d)));
                        i25++;
                        i18 = i18;
                        i8 = 10;
                    }
                    int i26 = 0;
                    while (i26 < arrayList12.size()) {
                        if (arrayList12.get(i26).doubleValue() > d8) {
                            arrayList12.set(i26, Double.valueOf(d8 - (i8 / (i26 + 1))));
                            this.error_signal = 1;
                        } else {
                            double d21 = -d8;
                            if (arrayList12.get(i26).doubleValue() < d21) {
                                arrayList12.set(i26, Double.valueOf(d21 + (i26 / 100)));
                                this.error_signal = 1;
                                i26++;
                                i8 = 10;
                            }
                        }
                        i26++;
                        i8 = 10;
                    }
                    double[] dArr2 = get_peak_ratio(arrayList12, this.next_search_peak_start);
                    ArrayList arrayList13 = new ArrayList();
                    new ArrayList();
                    int i27 = 0;
                    for (int i28 = this.next_search_peak_start; i28 < dArr2.length; i28++) {
                        int round = i28 - ((int) Math.round(this.hrv_pre * 0.65d));
                        int round2 = ((int) Math.round(this.hrv_pre * 0.65d)) + i28;
                        int i29 = round < 0 ? 0 : round;
                        int length = round2 >= dArr2.length ? dArr2.length - 1 : round2;
                        if (i28 == 0) {
                            d13 = dArr2[i28];
                            d14 = get_max(null, dArr2, null, i28 + 1, length);
                        } else if (i28 == dArr2.length - 1) {
                            d13 = get_max(null, dArr2, null, i29, i28 - 1);
                            d14 = dArr2[i28];
                        } else {
                            d13 = get_max(null, dArr2, null, i29, i28 - 1);
                            d14 = get_max(null, dArr2, null, i28 + 1, length);
                        }
                        double d22 = dArr2[i28];
                        if (d22 >= d13 && d22 >= d14) {
                            arrayList13.add(Integer.valueOf(i28));
                            i27++;
                        }
                    }
                    ArrayList arrayList14 = new ArrayList();
                    long j9 = 4613937818241073152L;
                    if (arrayList13.size() < 3) {
                        d9 = 100.0d;
                        this.hrv_pre = 100.0d;
                        this.error_signal = 1;
                        if (arrayList13.size() > 0) {
                            double doubleValue2 = arrayList12.get(((Integer) arrayList13.get(0)).intValue()).doubleValue();
                            d11 = dArr2[((Integer) arrayList13.get(0)).intValue()];
                            d10 = doubleValue2;
                        } else {
                            d10 = i.DOUBLE_EPSILON;
                            d11 = i.DOUBLE_EPSILON;
                        }
                    } else {
                        d9 = 100.0d;
                        double doubleValue3 = ((arrayList12.get(((Integer) arrayList13.get(2)).intValue()).doubleValue() + arrayList12.get(((Integer) arrayList13.get(1)).intValue()).doubleValue()) + arrayList12.get(((Integer) arrayList13.get(0)).intValue()).doubleValue()) / 3.0d;
                        double d23 = ((dArr2[((Integer) arrayList13.get(2)).intValue()] + dArr2[((Integer) arrayList13.get(1)).intValue()]) + dArr2[((Integer) arrayList13.get(0)).intValue()]) / 3.0d;
                        int i30 = 0;
                        while (i30 < i27) {
                            long j10 = j9;
                            if (dArr2[((Integer) arrayList13.get(i30)).intValue()] < 0.2d * d23) {
                                arrayList13.set(i30, 999);
                            }
                            i30++;
                            j9 = j10;
                        }
                        int i31 = 0;
                        while (i31 < i27) {
                            long j11 = j9;
                            if (((Integer) arrayList13.get(i31)).intValue() < arrayList12.size()) {
                                arrayList14.add((Integer) arrayList13.get(i31));
                            }
                            i31++;
                            j9 = j11;
                        }
                        if (arrayList14.size() >= 3) {
                            this.hrv_pre = (((Integer) arrayList14.get(2)).intValue() - ((Integer) arrayList14.get(0)).intValue()) / 2.0d;
                        } else {
                            this.hrv_pre = 100.0d;
                            this.error_signal = 1;
                        }
                        d10 = doubleValue3;
                        d11 = d23;
                    }
                    double d24 = this.hrv_pre;
                    if (d24 < 50.0d || d24 > 140.0d) {
                        this.hrv_pre = d9;
                        this.error_signal = 1;
                    }
                    ArrayList<Double> arrayList15 = new ArrayList<>();
                    int i32 = 0;
                    while (i32 < arrayList12.size()) {
                        arrayList15.add(arrayList12.get(i32));
                        i32++;
                        d10 = d10;
                    }
                    double[] dArr3 = new double[arrayList12.size()];
                    int i33 = 0;
                    while (i33 < i27) {
                        double[] dArr4 = dArr3;
                        ArrayList<Double> arrayList16 = arrayList12;
                        if (((Integer) arrayList13.get(i33)).intValue() < arrayList16.size()) {
                            arrayList12 = arrayList16;
                            double doubleValue4 = arrayList12.get(((Integer) arrayList13.get(i33)).intValue()).doubleValue() > i.DOUBLE_EPSILON ? ((this.signal_adj_sta + arrayList12.get(((Integer) arrayList13.get(i33)).intValue()).doubleValue()) / 3.0d) / arrayList12.get(((Integer) arrayList13.get(i33)).intValue()).doubleValue() : 1.0d;
                            int intValue = ((Integer) arrayList13.get(i33)).intValue() - 5;
                            int intValue2 = ((Integer) arrayList13.get(i33)).intValue() + 5;
                            if (intValue < 0) {
                                intValue = 0;
                            }
                            if (intValue2 >= arrayList12.size()) {
                                intValue2 = arrayList12.size() - 1;
                            }
                            int i34 = intValue;
                            while (i34 <= intValue2) {
                                arrayList15.set(i34, Double.valueOf(i.DOUBLE_EPSILON));
                                i34++;
                                d10 = d10;
                            }
                            while (intValue <= intValue2) {
                                if (arrayList12.get(intValue).doubleValue() > i.DOUBLE_EPSILON) {
                                    dArr4[intValue] = arrayList12.get(intValue).doubleValue() * doubleValue4;
                                } else {
                                    dArr4[intValue] = arrayList12.get(intValue).doubleValue() / 4.0d;
                                }
                                intValue++;
                            }
                            if (this.len_peak_to_end < 5) {
                                for (int i35 = 0; i35 < 5 - this.len_peak_to_end; i35++) {
                                    if (arrayList12.get(i35).doubleValue() > i.DOUBLE_EPSILON) {
                                        dArr4[i35] = arrayList12.get(i35).doubleValue() * doubleValue4;
                                    } else {
                                        dArr4[i35] = arrayList12.get(i35).doubleValue() / 4.0d;
                                    }
                                }
                            }
                            d12 = d10;
                        } else {
                            arrayList12 = arrayList16;
                            d12 = d10;
                        }
                        i33++;
                        d10 = d12;
                        dArr3 = dArr4;
                    }
                    if (d10 > i.DOUBLE_EPSILON) {
                        int i36 = 0;
                        while (i36 < arrayList15.size()) {
                            if (arrayList15.get(i36).doubleValue() > d10) {
                                arrayList15.set(i36, Double.valueOf(d10));
                                dArr = dArr3;
                            } else {
                                dArr = dArr3;
                                double d25 = -d10;
                                if (arrayList15.get(i36).doubleValue() < d25) {
                                    arrayList15.set(i36, Double.valueOf(d25));
                                }
                            }
                            i36++;
                            dArr3 = dArr;
                        }
                    }
                    double[] dArr5 = dArr3;
                    ArrayList<Double> arrayList17 = new ArrayList<>();
                    filtfilt(this.Num_lp, this.f16656a, arrayList15, arrayList17);
                    int i37 = 0;
                    while (i37 < arrayList17.size()) {
                        ArrayList<Double> arrayList18 = arrayList12;
                        if (arrayList17.get(i37).doubleValue() < i.DOUBLE_EPSILON) {
                            arrayList17.set(i37, Double.valueOf(arrayList17.get(i37).doubleValue() / 2.0d));
                        } else {
                            arrayList17.set(i37, Double.valueOf(arrayList17.get(i37).doubleValue() * 1.5d));
                        }
                        i37++;
                        arrayList12 = arrayList18;
                    }
                    ArrayList arrayList19 = new ArrayList();
                    int i38 = 0;
                    while (i38 < arrayList17.size()) {
                        arrayList19.add(Double.valueOf(arrayList17.get(i38).doubleValue() + dArr5[i38]));
                        i38++;
                        arrayList12 = arrayList12;
                    }
                    int i39 = 0;
                    while (i39 < arrayList17.size()) {
                        if (((Double) arrayList19.get(i39)).doubleValue() > i.DOUBLE_EPSILON) {
                            arrayList3 = arrayList12;
                            arrayList19.set(i39, Double.valueOf(((Double) arrayList19.get(i39)).doubleValue() * this.final_gain));
                        } else {
                            arrayList3 = arrayList12;
                        }
                        i39++;
                        arrayList12 = arrayList3;
                    }
                    double round3 = Math.round(60000.0d / (this.hrv_pre * this.cycle_ms));
                    this.hrs_realtime = round3;
                    this.mHrsRealtimeValue = u5.a.round(round3);
                    int size4 = arrayList13.size();
                    int[] iArr = new int[size4];
                    for (int i40 = 0; i40 < size4; i40++) {
                        if (((Integer) arrayList13.get(i40)).intValue() < arrayList12.size()) {
                            iArr[i40] = ((Integer) arrayList13.get(i40)).intValue();
                        } else {
                            iArr[i40] = 0;
                        }
                    }
                    int i41 = (int) get_max(iArr, null, null, 0, arrayList13.size() - 1);
                    this.send_data_total += this.next_send_group;
                    int i42 = i18 - ((i16 + 1) + i41);
                    this.len_peak_to_end = i42;
                    double d26 = this.hrv_pre;
                    int round4 = (int) Math.round((4.0d * d26) + ((d26 * 0.5d) - i42));
                    this.next_send_group = round4;
                    if (round4 < 320) {
                        this.next_send_group = 320;
                    }
                    this.next_send_group = 400;
                    int i43 = this.len_peak_to_end;
                    if (i43 < 20) {
                        this.next_search_peak_start = 50 - i43;
                    } else {
                        this.next_search_peak_start = 0;
                    }
                    for (int i44 = 0; i44 < arrayList19.size(); i44++) {
                        arrayList2.add(Integer.valueOf((int) Math.round(((Double) arrayList19.get(i44)).doubleValue())));
                    }
                    if (this.error_signal == 0) {
                        this.hrv_pre_cnt++;
                        this.hrv_pre_sum += this.hrv_pre;
                        this.peakratio_thre_cnt++;
                        this.peakratio_thre_sum += d11;
                    }
                }
            } else {
                int i45 = 3;
                double d27 = get_avg(null, arrayList, null, 0, 500);
                int i46 = 0;
                while (i46 < size2) {
                    arrayList7.add(Double.valueOf(arrayList.get(i46).intValue() - d27));
                    i46++;
                    i45 = 3;
                    i15 = 500;
                }
                ArrayList<Double> arrayList20 = new ArrayList<>();
                int i47 = 0;
                while (i47 < arrayList7.size()) {
                    arrayList20.add((Double) arrayList7.get(i47));
                    filter(this.Num_notch, this.f16656a, arrayList20, arrayList8);
                    i47++;
                    i45 = 3;
                    i15 = 500;
                }
                ArrayList<Double> arrayList21 = new ArrayList<>();
                int i48 = 100;
                int i49 = 100;
                while (i49 < i15) {
                    arrayList21.add(arrayList8.get(i49));
                    i49++;
                    i48 = 100;
                    i45 = 3;
                    i15 = 500;
                }
                ArrayList<Double> arrayList22 = new ArrayList<>();
                filtfilt(this.Num_highpass, this.f16656a, arrayList21, arrayList22);
                ArrayList<Double> arrayList23 = new ArrayList<>();
                filtfilt(this.Num_lowpass3, this.f16656a, arrayList22, arrayList23);
                int size5 = arrayList23.size();
                int i50 = size5 - 1;
                int i51 = size5 - 5;
                if (arrayList23.get(i50).doubleValue() > arrayList23.get(i51).doubleValue()) {
                    this.ecg_lowpass_judge = arrayList23.get(i50).doubleValue() - arrayList23.get(i51).doubleValue();
                    j8 = 0;
                } else {
                    j8 = 0;
                    this.ecg_lowpass_judge = i.DOUBLE_EPSILON;
                }
                int i52 = size5 - 10;
                while (i52 < size5) {
                    arrayList23.set(i52, Double.valueOf(arrayList23.get(i52).doubleValue() + ((this.ecg_lowpass_judge * ((i52 + 11) - size5)) / 14.0d)));
                    i52++;
                    j8 = 0;
                    i48 = 100;
                    i45 = 3;
                    i15 = 500;
                }
                int i53 = 0;
                while (i53 < arrayList23.size()) {
                    long j12 = j8;
                    if (arrayList23.get(i53).doubleValue() > d8) {
                        arrayList23.set(i53, Double.valueOf(d8 - (i53 / 100)));
                        this.error_signal = 1;
                    } else {
                        double d28 = -d8;
                        if (arrayList23.get(i53).doubleValue() < d28) {
                            arrayList23.set(i53, Double.valueOf(d28 + (i53 / 100)));
                            this.error_signal = 1;
                        }
                    }
                    i53++;
                    j8 = j12;
                    i48 = 100;
                    i45 = 3;
                    i15 = 500;
                }
                this.min_value = get_min(null, arrayList23, 0, arrayList23.size());
                double[] dArr6 = get_peak_ratio(arrayList23, i45);
                ArrayList<Double> arrayList24 = new ArrayList<>();
                double[] dArr7 = new double[arrayList23.size()];
                ArrayList<Integer> arrayList25 = new ArrayList<>();
                ArrayList<Double> arrayList26 = arrayList24;
                get_peak_data(arrayList23, dArr6, arrayList24, dArr7, arrayList25, d8);
                if (arrayList25.size() < i45) {
                    d15 = 100.0d;
                    this.hrv_pre = 100.0d;
                    this.error_signal = 1;
                    if (arrayList25.size() > 1) {
                        arrayList4 = arrayList25;
                        doubleValue = arrayList23.get(arrayList4.get(1).intValue()).doubleValue();
                        d16 = dArr6[arrayList4.get(1).intValue()];
                    } else {
                        arrayList4 = arrayList25;
                        d18 = 1.0d;
                        d17 = 1.0d;
                        d19 = this.hrv_pre;
                        if (d19 >= 50.0d || d19 > 140.0d) {
                            this.hrv_pre = d15;
                            this.error_signal = 1;
                        }
                        i9 = 0;
                        while (i9 < arrayList26.size()) {
                            ArrayList<Double> arrayList27 = arrayList26;
                            if (arrayList27.get(i9).doubleValue() > d18) {
                                arrayList27.set(i9, Double.valueOf(d18));
                            } else {
                                double d29 = -d18;
                                if (arrayList27.get(i9).doubleValue() < d29) {
                                    arrayList27.set(i9, Double.valueOf(d29));
                                }
                            }
                            i9++;
                            arrayList26 = arrayList27;
                            i48 = 100;
                        }
                        arrayList5 = new ArrayList<>();
                        filtfilt(this.Num_lp, this.f16656a, arrayList26, arrayList5);
                        arrayList6 = new ArrayList();
                        i10 = 0;
                        while (i10 < arrayList5.size()) {
                            if (arrayList5.get(i10).doubleValue() < i.DOUBLE_EPSILON) {
                                arrayList5.set(i10, Double.valueOf(arrayList5.get(i10).doubleValue() / 2.0d));
                            } else {
                                arrayList5.set(i10, Double.valueOf(arrayList5.get(i10).doubleValue() * 1.5d));
                            }
                            arrayList6.add(Double.valueOf(arrayList5.get(i10).doubleValue() + dArr7[i10]));
                            i10++;
                            i48 = 100;
                        }
                        i11 = 0;
                        while (i11 < arrayList5.size()) {
                            if (((Double) arrayList6.get(i11)).doubleValue() > i.DOUBLE_EPSILON) {
                                arrayList6.set(i11, Double.valueOf(((Double) arrayList6.get(i11)).doubleValue() * this.final_gain));
                            }
                            i11++;
                            i48 = 100;
                        }
                        double d30 = 1000.0d / this.fs;
                        this.cycle_ms = d30;
                        double round5 = Math.round(60000.0d / (this.hrv_pre * d30));
                        this.hrs_realtime = round5;
                        this.mHrsRealtimeValue = u5.a.round(round5);
                        size = arrayList4.size();
                        int[] iArr2 = new int[size];
                        for (i12 = 0; i12 < size; i12++) {
                            iArr2[i12] = arrayList4.get(i12).intValue();
                        }
                        int i54 = 1;
                        get_max(iArr2, null, null, 0, size - 1);
                        this.next_send_group = 400;
                        this.next_search_peak_start = 0;
                        this.send_data_total = i15;
                        this.send_data_total_num = 1;
                        this.len_peak_to_end = 5;
                        i13 = 0;
                        while (i13 < i48) {
                            arrayList2.add(0);
                            i13++;
                            i54 = 1;
                        }
                        i14 = 0;
                        while (i14 < arrayList6.size()) {
                            arrayList2.add(Integer.valueOf((int) Math.round(((Double) arrayList6.get(i14)).doubleValue())));
                            i14++;
                            i54 = 1;
                        }
                        if (this.error_signal == 0) {
                            this.hrv_pre_cnt += i54;
                            this.hrv_pre_sum += this.hrv_pre;
                            this.peakratio_thre_cnt += i54;
                            this.peakratio_thre_sum += d17;
                        }
                    }
                } else {
                    arrayList4 = arrayList25;
                    d15 = 100.0d;
                    doubleValue = (arrayList23.get(arrayList4.get(2).intValue()).doubleValue() + arrayList23.get(arrayList4.get(1).intValue()).doubleValue()) / 2.0d;
                    this.hrv_pre = arrayList4.get(2).intValue() - arrayList4.get(1).intValue();
                    d16 = (dArr6[arrayList4.get(2).intValue()] + dArr6[arrayList4.get(1).intValue()]) / 2.0d;
                }
                d17 = d16;
                d18 = doubleValue;
                d19 = this.hrv_pre;
                if (d19 >= 50.0d) {
                }
                this.hrv_pre = d15;
                this.error_signal = 1;
                i9 = 0;
                while (i9 < arrayList26.size()) {
                }
                arrayList5 = new ArrayList<>();
                filtfilt(this.Num_lp, this.f16656a, arrayList26, arrayList5);
                arrayList6 = new ArrayList();
                i10 = 0;
                while (i10 < arrayList5.size()) {
                }
                i11 = 0;
                while (i11 < arrayList5.size()) {
                }
                double d302 = 1000.0d / this.fs;
                this.cycle_ms = d302;
                double round52 = Math.round(60000.0d / (this.hrv_pre * d302));
                this.hrs_realtime = round52;
                this.mHrsRealtimeValue = u5.a.round(round52);
                size = arrayList4.size();
                int[] iArr22 = new int[size];
                while (i12 < size) {
                }
                int i542 = 1;
                get_max(iArr22, null, null, 0, size - 1);
                this.next_send_group = 400;
                this.next_search_peak_start = 0;
                this.send_data_total = i15;
                this.send_data_total_num = 1;
                this.len_peak_to_end = 5;
                i13 = 0;
                while (i13 < i48) {
                }
                i14 = 0;
                while (i14 < arrayList6.size()) {
                }
                if (this.error_signal == 0) {
                }
            }
            return this.send_data_total;
        }
        return this.send_data_total;
    }

    public int GetHrEarlyValue() {
        return this.mHrEarlyValue;
    }

    public int GetHrFastalue() {
        return this.mHrFastalue;
    }

    public int GetHrMissValue() {
        return this.mHrMissValue;
    }

    public int GetHrSlowValue() {
        return this.mHrSlowValue;
    }

    public int GetHrStopValue() {
        return this.mHrStopValue;
    }

    public int GetHrmValue() {
        return this.mHrmValue;
    }

    public int GetHrsRealtimeValue() {
        return this.mHrsRealtimeValue;
    }

    public double GetLFdHFValue() {
        return this.mLFdHFValue;
    }

    public int GetNextSendGroup() {
        return this.next_send_group;
    }

    public int GetPmValue() {
        return this.mPmValue;
    }

    public int GetSpiritValue() {
        return this.mSpiritValue;
    }

    public int GetTiredValue() {
        return this.mTiredValue;
    }
}
