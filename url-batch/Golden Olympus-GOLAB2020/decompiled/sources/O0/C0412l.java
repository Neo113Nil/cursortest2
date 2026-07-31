package O0;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: O0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0412l implements InterfaceRunnableC0421v {

    /* renamed from: b, reason: collision with root package name */
    private String f1234b;

    /* renamed from: c, reason: collision with root package name */
    private String f1235c;

    /* renamed from: d, reason: collision with root package name */
    private String f1236d;

    /* renamed from: e, reason: collision with root package name */
    private List f1237e;

    public C0412l(List list, String str, String str2, String str3) {
        this.f1234b = str;
        this.f1235c = str2;
        this.f1236d = str3;
        this.f1237e = list;
    }

    private void a() {
        AbstractC0413m.d(Y.q(), "backup_event", P.e(this.f1234b, this.f1236d, this.f1235c));
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.f1237e;
        if (list == null || list.size() == 0) {
            j0.j("hmsSdk", "failed events is empty");
            return;
        }
        if (AbstractC0408h.c(Y.q(), "cached_v2_1", Y.s() * 1048576)) {
            j0.l("hmsSdk", "The cacheFile is full,Can not writing data, delete it! reqID:" + this.f1235c);
            AbstractC0413m.d(Y.q(), "cached_v2_1", new String[0]);
            return;
        }
        String d4 = P.d(this.f1234b, this.f1236d);
        List list2 = (List) AbstractC0409i.f(Y.q(), "cached_v2_1", d4).get(d4);
        if (list2 != null && list2.size() != 0) {
            this.f1237e.addAll(list2);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f1237e.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(((C0406f) it.next()).h());
            } catch (JSONException unused) {
                j0.l("hmsSdk", "event to json error");
            }
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2.length() > Y.o() * 1048576) {
            j0.l("hmsSdk", "this failed data is too long,can not writing it");
            this.f1237e = null;
            return;
        }
        j0.j("hmsSdk", "data send failed, write to cache file...reqID:" + this.f1235c);
        AbstractC0413m.g(Y.q(), "cached_v2_1", d4, jSONArray2);
        a();
    }
}
