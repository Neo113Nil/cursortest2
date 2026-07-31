package O0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private List f1220a;

    /* renamed from: b, reason: collision with root package name */
    private String f1221b;

    /* renamed from: c, reason: collision with root package name */
    private String f1222c;

    /* renamed from: d, reason: collision with root package name */
    private String f1223d;

    public h0(List list, String str, String str2, String str3) {
        this.f1220a = list;
        this.f1221b = str;
        this.f1222c = str2;
        this.f1223d = str3;
    }

    private void b(List list, String str, String str2) {
        String str3;
        String str4;
        if (list.isEmpty()) {
            return;
        }
        int size = (list.size() / 500) + 1;
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 * 500;
            List<C0406f> subList = list.subList(i5, Math.min(list.size(), i5 + 500));
            String replace = UUID.randomUUID().toString().replace("-", "");
            long currentTimeMillis = System.currentTimeMillis();
            long c4 = AbstractC0403c.c(str2, str) * 86400000;
            ArrayList arrayList = new ArrayList();
            for (C0406f c0406f : subList) {
                if (!AbstractC0408h.d(c0406f.d(), currentTimeMillis, c4)) {
                    arrayList.add(c0406f);
                }
            }
            if (arrayList.size() > 0) {
                str3 = str;
                str4 = str2;
                new I(str4, str3, this.f1223d, arrayList, replace).b();
            } else {
                str3 = str;
                str4 = str2;
                j0.l("hmsSdk", "No data to report handler");
            }
            i4++;
            str2 = str4;
            str = str3;
        }
    }

    public void a() {
        if (!"_default_config_tag".equals(this.f1222c)) {
            b(this.f1220a, this.f1222c, this.f1221b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C0406f c0406f : this.f1220a) {
            String f4 = c0406f.f();
            if (TextUtils.isEmpty(f4) || "oper".equals(f4)) {
                arrayList4.add(c0406f);
            } else if ("maint".equals(f4)) {
                arrayList.add(c0406f);
            } else if ("preins".equals(f4)) {
                arrayList2.add(c0406f);
            } else if ("diffprivacy".equals(f4)) {
                arrayList3.add(c0406f);
            }
        }
        b(arrayList4, "oper", "_default_config_tag");
        b(arrayList, "maint", "_default_config_tag");
        b(arrayList2, "preins", "_default_config_tag");
        b(arrayList3, "diffprivacy", "_default_config_tag");
    }
}
