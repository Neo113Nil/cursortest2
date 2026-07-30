package h4;

import androidx.annotation.NonNull;
import com.crrepa.ble.conn.bean.CRPDistanceCategoryInfo;
import com.crrepa.ble.conn.type.CRPCategoryHistoryDay;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.x1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes3.dex */
public class y {

    /* renamed from: c, reason: collision with root package name */
    public static final byte f16798c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final byte f16799d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f16800e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final byte f16801f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f16802g = 30;

    /* renamed from: a, reason: collision with root package name */
    private List<Integer> f16803a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f16804b = new ArrayList();

    @NonNull
    private CRPDistanceCategoryInfo a(CRPCategoryHistoryDay cRPCategoryHistoryDay, List<Integer> list) {
        return new CRPDistanceCategoryInfo(cRPCategoryHistoryDay, 30, list);
    }

    public CRPDistanceCategoryInfo b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        byte b8 = bArr[0];
        a(b8);
        a(b8, a(bArr));
        if (1 == b8) {
            return a(CRPCategoryHistoryDay.TODAY, a(this.f16803a));
        }
        if (3 == b8) {
            return a(CRPCategoryHistoryDay.YESTERDAY, this.f16804b);
        }
        b((byte) (b8 + 1));
        return null;
    }

    private List<Integer> a(List<Integer> list) {
        Calendar calendar = Calendar.getInstance();
        int i8 = ((calendar.get(11) * 60) + calendar.get(12)) / 30;
        BleLog.d("filterTodayDistanceCategory index: " + i8);
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < list.size()) {
            arrayList.add(i9 < i8 ? list.get(i9) : 0);
            i9++;
        }
        return arrayList;
    }

    private void b(byte b8) {
        com.crrepa.m.f.e().a(x1.b(b8));
    }

    private List<Integer> a(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        for (int i8 = 1; i8 < bArr.length; i8 += 4) {
            System.arraycopy(bArr, i8, bArr2, 0, 4);
            arrayList.add(Integer.valueOf((int) (com.crrepa.g1.c.f(bArr2) / 100)));
        }
        return arrayList;
    }

    private void a(byte b8) {
        List<Integer> list;
        if (b8 == 0) {
            list = this.f16803a;
        } else if (2 != b8) {
            return;
        } else {
            list = this.f16804b;
        }
        list.clear();
    }

    private void a(byte b8, List<Integer> list) {
        List<Integer> list2;
        if (b8 <= 1) {
            list2 = this.f16803a;
        } else if (b8 > 3) {
            return;
        } else {
            list2 = this.f16804b;
        }
        list2.addAll(list);
    }
}
